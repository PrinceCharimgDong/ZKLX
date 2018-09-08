/**  

* <p>Title: ProductAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月30日  上午8:38:31

* @version 1.0  

*/  
package com.zklx.control;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.JavaType;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zklx.domain.ProIt;
import com.zklx.domain.Product;
import com.zklx.domain.ProductDetailWithBLOBs;
import com.zklx.domain.ProductSub;
import com.zklx.domain.ProductSubChara;
import com.zklx.domain.ProductSubCharaWithBLOBs;
import com.zklx.domain.ProductSubFunc;
import com.zklx.domain.ProductSubFuncWithBLOBs;
import com.zklx.domain.ProductSubPara;
import com.zklx.domain.ProductSubShort;
import com.zklx.domain.ProductSubShortWithBLOBs;
import com.zklx.service.LogoService;
import com.zklx.service.ProductService;

import net.sf.json.JSONArray;
import oracle.net.aso.n;
import util.ByteToStr;
import util.FindProduct;
import util.Message;
import util.Page;
import util.ShowPhoto;
import util.strToByteArray;

/**  

* <p>Title: ProductAction.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月30日  上午8:38:31

* @version 1.0  

*/
@Controller
@RequestMapping("/product")
public class ProductAction {

	@Autowired
	private ProductService productService;

	@Autowired
	private LogoService logoService;
	
	//前台显示
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String liString(Model model) {
		 List<Product> list = productService.SelectAll();
		 String photo ="";
			try {
				photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		 model.addAttribute("photo", photo);
		 model.addAttribute("list",list);
		return "productlist";
	} 
	
	//id   sub的主键               bid sub的外键
	@RequestMapping(value="/listOne",method=RequestMethod.GET)
	public String liString1(@RequestParam String id,@RequestParam String bid,Model model) {
		
		 List<Product> list = productService.SelectAll();//查询所有的一级产品菜单 放在页面上
		 List<ProductSub> list1 = productService.selectSubByPri(bid);//查询对应下的所有sub
		 Product product = productService.selectOne(bid);//
		 ProductSub productSub = productService.selectByPrimaryKey(id);
		 ProductSubShortWithBLOBs shortobj = productService.selectShort(id);
		 ProductSubFuncWithBLOBs funcobj = productService.selectFunc(id);
		 ProductSubCharaWithBLOBs charaobj= productService.selectChara(id);
		 ProductSubPara paraobj =productService.selectPara(id);
		  String photo ="";
			try {
				photo = new ShowPhoto().getPhoto(new ByteToStr().byteToStr(logoService.SelectAll().getPhoto()));
			} catch (Exception e) {
				// TODO: handle exception
			}
			List<String> shortlist   = new ArrayList<>();
			List<String> funclist    = new ArrayList<>();
			List<String> charalist   = new ArrayList<>();
	   	try {
	   		shortlist = new FindProduct().getSubUtil(new ByteToStr().byteToStr(shortobj.getContext()));
		} catch (Exception e) {
			shortlist.add(0, "暂无");
		}
	   	 try {
	   		funclist  = new FindProduct().getSubUtil(new ByteToStr().byteToStr(funcobj.getContext()));
		} catch (Exception e) {
			funclist.add(0, "暂无");
		}
	   	 try {
	   		charalist = new FindProduct().getSubUtil(new ByteToStr().byteToStr(charaobj.getContext()));
		} catch (Exception e) {
			charalist.add(0, "暂无");
			// TODO: handle exception
		}
	   	
		 model.addAttribute("productSub",productSub.getPid());
		 model.addAttribute("product",product.getPid());
		 model.addAttribute("list",list);
		 model.addAttribute("list1",list1);
		 model.addAttribute("photo",photo);
		 model.addAttribute("shortobj",shortobj);
		 model.addAttribute("funcobj",funcobj);
		 model.addAttribute("charaobj",charaobj);
		 model.addAttribute("paraobj",paraobj);
		 model.addAttribute("shortlist",shortlist);
		 model.addAttribute("funclist",funclist);
		 model.addAttribute("charalist",charalist);
		// model.addAttribute("paralist",paralist);
		return "productlist";
	} 
	
	
	//查询第一条数据 初始化
	@RequestMapping(value="init",method=RequestMethod.GET)
	public String  init() {
		Product product = new Product();
		product = productService.selectFirst();
		ProductSub productSub = new ProductSub();
		productSub= productService.selectFirstSub(product.getPid());//对应一级菜单下的第一个sub
		if (productSub==null) {
			return "error";
		}
		return "redirect:/product/listOne?id="+productSub.getPid()+"&bid="+productSub.getBelong();
	}
	
	@RequestMapping(value="/shortadd",method=RequestMethod.GET)
	public String addOneShort(HttpServletRequest httpServletRequest,@RequestParam String id) {
		httpServletRequest.setAttribute("id", id);
		return "shortadd";
	}


	
	@RequestMapping(value="/fuadd",method=RequestMethod.GET)
	public String addOnecFu(HttpServletRequest httpServletRequest,@RequestParam String id) {
		httpServletRequest.setAttribute("id", id);
		return "fuadd";
	}

	
	
	@RequestMapping(value="/paadd",method=RequestMethod.GET)
	public String addOnecPa(HttpServletRequest httpServletRequest,@RequestParam String id) {
		httpServletRequest.setAttribute("id", id);
		return "paadd";
	}

	
	@RequestMapping(value="listchange",method=RequestMethod.GET)
	public String  Changeinit(@RequestParam String id) {
		Product product = new Product();
		/*product = productService.selectFirst();*/
		ProductSub productSub = new ProductSub();
		productSub= productService.selectFirstSub(id);
		return "redirect:/product/listOne?id="+productSub.getPid()+"&bid="+productSub.getBelong();
	}

 	@RequestMapping(value="/back/save",method=RequestMethod.POST)
    @ResponseBody  
    public void  imgUploadByUeditor(Product entity,HttpServletRequest request,HttpServletResponse httpServletResponse){
       
        String title = request.getParameter("pname");
        String id= Long.toString(new   Date().getTime());
       /* entity.setDatetime(new Date());
        newsService.updateNewsInfo(entity);*/
        entity.setPid(id);
        entity.setPname(title);
        productService.addOne(entity);
        try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
 	
 	@RequestMapping(value="/back/add",method=RequestMethod.GET)
 	public String caseGet(Model model) {
 		model.addAttribute("state", "save");
 		return "Product_Type_Detail";
 	}
	
 	@RequestMapping(value="/back/delete",method=RequestMethod.GET)
 	void deleteOne(@RequestParam String id,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
 		productService.deleteOnePro(id);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	
 	@RequestMapping(value="/update",method=RequestMethod.GET)
 	String update(Model model,@RequestParam String id) {
 		Product product = new Product();
 		product = productService.selectOne(id);

 		model.addAttribute("product", product);
 		model.addAttribute("state","update");
		return "Product_Type_Detail";
 	}
 	@RequestMapping(value="/update",method=RequestMethod.POST)
 	void updateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		Product product = new Product();
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		strToByteArray strToByteArray = new strToByteArray();
		product.setPid(id);
		product.setPname(title);
 		productService.update(product); 
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	
	@RequestMapping(value="/back/list",method=RequestMethod.GET)
	public ModelAndView backlistAll(Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<Product> list = new ArrayList<Product>();
		list = productService.SelectAll();
		int total = (int) new PageInfo<>(list).getTotal();
		page.caculateLast(total);
		mav.addObject("list", list);
		mav.setViewName("Product_TypeEdit");
		return mav;  
	}
 	
 	@RequestMapping(value="/back/update",method=RequestMethod.GET)
 	String backupdate(Model model,@RequestParam String id) {
 		Product product = new Product();
 		product = productService.selectOne(id);
 		model.addAttribute("product", product);
 		model.addAttribute("state","update");
		return "Product_Type_Detail";
 	}
 	@RequestMapping(value="/back/update",method=RequestMethod.POST)
 	void backupdateP(Model model,HttpServletRequest request,@RequestParam String id,HttpServletResponse httpServletResponse) {
 		Product product = new Product();
		String title = request.getParameter("pname");
		strToByteArray strToByteArray = new strToByteArray();
		product.setPid(id);
		product.setPname(title);
 		boolean a =productService.update(product);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}
 	
 	
 	@RequestMapping(value="/back/sublist",method=RequestMethod.GET)
	public ModelAndView sublist(@RequestParam String id,Page page) {
		ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(),10);
		List<ProductSub> list = new ArrayList<ProductSub>();
		list = productService.selectSubByBelong(id);
		int total = (int) new PageInfo<>(list).getTotal();
		page.caculateLast(total);
		Product product = new Product();
		product = productService.selectOne(id);
		mav.addObject("name", product.getPname());
		mav.addObject("list", list);
		mav.addObject("belongid", id);
		mav.setViewName("ProductEdit");
		return mav;  
	}

 	@RequestMapping(value="/back/subadd",method=RequestMethod.GET)
 	public String subadd(Model model,@RequestParam String belongid) {
 		model.addAttribute("state", "save");
 		model.addAttribute("belongid", belongid);
 		return "Product_Cloud_Detail";
 	}
	
	@RequestMapping(value="/back/subsave",method=RequestMethod.POST)
    @ResponseBody  
    public void  subsave(ProductSub entity,HttpServletRequest request,HttpServletResponse httpServletResponse,@RequestParam String belongid){
       
        String title = request.getParameter("pname");
        String id= Long.toString(new   Date().getTime());
       /* entity.setDatetime(new Date());
        newsService.updateNewsInfo(entity);*/
        entity.setPid(id);
        entity.setPname(title);
        entity.setBelong(belongid);
        productService.insertSub(entity);
        try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
 	
 	@RequestMapping(value="/back/subdelete",method=RequestMethod.GET)
 	void subdeleteOne(@RequestParam String id,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
 		productService.deleteSub(id);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
 	@RequestMapping(value="/back/detail",method=RequestMethod.GET)
 	String subupdate(Model model,@RequestParam String bid) {
 		ProductSub productSub = new ProductSub();
 		
 		productSub =productService.selectByPrimaryKey(bid);
 		int fucount = productService.countFu(bid);
 		int shcount = productService.countSh(bid);
 		int chcount = productService.countCh(bid);
 		int pacount = productService.countPa(bid);
 		model.addAttribute("name",productSub.getPname() );
 		model.addAttribute("fucount",fucount );
 		model.addAttribute("shcount",shcount );
 		model.addAttribute("chcount", chcount);
 		model.addAttribute("pacount", pacount);
 		model.addAttribute("bid", bid);
		return "Product_I7_Edit";
 	}
 	
	@RequestMapping(value="/back/subupdate",method=RequestMethod.GET)
 	String subupdate(Model model,@RequestParam String id,@RequestParam String belongid) {
 		ProductSub productSub = new ProductSub();
 		productSub = productService.selectByPrimaryKey(id);
 		model.addAttribute("productSub", productSub);
 		model.addAttribute("belongid", belongid);
 		model.addAttribute("state","update");
		return "Product_Cloud_Detail";
 	}
 	@RequestMapping(value="/back/subupdate",method=RequestMethod.POST)
 	void subupdateP(Model model,HttpServletRequest request,@RequestParam String id,@RequestParam String belongid,HttpServletResponse httpServletResponse) {
 		ProductSub productSub = new ProductSub();
		String title = request.getParameter("pname");
		strToByteArray strToByteArray = new strToByteArray();
		productSub.setPid(id);
		productSub.setPname(title);
		productSub.setBelong(belongid);
 		boolean a =productService.updateSub(productSub);
 		System.out.println(a);
 		try {
			httpServletResponse.sendRedirect("list");
		} catch (IOException e) {
			// TODO Auto-generated ca	tch block
			e.printStackTrace();
		}
 	}
 	
 	
 	
 	//short start
	
 	@RequestMapping(value="/back/shortadd",method=RequestMethod.GET)
	public String backshort(@RequestParam String bid,Model model) {

		List list=new FindProduct().getSubUtil("");
		model.addAttribute("strings", list);
 		model.addAttribute("bid",bid);
 		model.addAttribute("state","shortsave");
		return "Product_I7Main_Edit";  
	}
 	
 	
 	@RequestMapping(value="/back/shortsave",method=RequestMethod.POST)
	public Message backshortsave(@RequestBody ProductSubShortWithBLOBs entity,Model model,HttpServletRequest request,HttpServletResponse httpServletResponse) {
 			String id= Long.toString(new   Date().getTime());
 	        entity.setPid(id);
 	        boolean resu=productService.insertSh(entity);
 	        if (resu==true) {
 	        	return new Message("success");
			}
 	       return new Message("error");
	}
 	@RequestMapping(value="/back/shortupdate",method=RequestMethod.GET)
	public String backshortupdateG(@RequestParam String bid,Model model) {
 		ProductSubShortWithBLOBs entity = new ProductSubShortWithBLOBs();
 		entity= productService.selectShortByBelong(bid);
 		String intro= new ByteToStr().byteToStr(entity.getSphoto());
 		//intro = intro.replaceAll("\"", "'");
 		List list=new FindProduct().getSubUtil(new ByteToStr().byteToStr(entity.getContext()));
		JSONArray jsonArray = JSONArray.fromObject(list);
 		model.addAttribute("jsonArray", jsonArray);
 		model.addAttribute("intro", intro);
 		model.addAttribute("entity", entity);
 		model.addAttribute("bid", bid);
 		model.addAttribute("state","shortupdate");
		return "Product_I7Main_Edit";  
	}

 	@RequestMapping(value="/back/shortupdate",method=RequestMethod.POST)
	public Message backshortupdate(@RequestBody ProductSubShortWithBLOBs entity,HttpServletResponse httpServletResponse) {
		System.out.println("entity");
		try {
			httpServletResponse.getWriter().write("需要返回的参数json");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean resu=productService.updateSh(entity);
		System.out.println(resu);
 		if (resu==true) {
	        	return new Message("success");
		}
 		System.out.println("待");
	    return new Message("wrong");
	}
 	
 	//short ending
 	
 	@RequestMapping(value="/back/chara",method=RequestMethod.GET)
	public String backchara(@RequestParam String bid,Model model) {
 		ProductSubChara productSubChara = new ProductSubChara();
 		productSubChara=	productService.selectCharaByBelong(bid);
		model.addAttribute("productSubChara", productSubChara);
		return "Product_I7_Characteristics_Edit";
	} 
	@RequestMapping(value="/back/chadd",method=RequestMethod.GET)
	public String backch(@RequestParam String bid,Model model) {
		List list=new FindProduct().getSubUtil("");
		model.addAttribute("strings", list);
 		model.addAttribute("bid",bid);
 		model.addAttribute("state","chsave");
		return "Product_I7Main_Edit";  
	}
 	@RequestMapping(value="/back/chsave",method=RequestMethod.POST)
	public Message backchsave(@RequestBody ProductSubCharaWithBLOBs entity,Model model,HttpServletRequest request,HttpServletResponse httpServletResponse) {
 	   
 	        String id= Long.toString(new   Date().getTime());
 	        entity.setPid(id);
 	       boolean resu =  productService.insertCh(entity);
 	       if (resu==true) {
	        	return new Message("success");
 	       }
	       return new Message("error");
	}
 	
 	@RequestMapping(value="/back/chupdate",method=RequestMethod.GET)
	public String backchupdateG(@RequestParam String bid,Model model) {
 		ProductSubCharaWithBLOBs entity = new ProductSubCharaWithBLOBs();
 		entity= productService.selectCharaByBelong(bid); 
 		String intro= new ByteToStr().byteToStr(entity.getCphoto());
 		//intro = intro.replaceAll("\"", "'");
 		List list=new FindProduct().getSubUtil(new ByteToStr().byteToStr(entity.getContext()));
		
 		JSONArray jsonArray = JSONArray.fromObject(list);
	 	model.addAttribute("jsonArray", jsonArray);
		model.addAttribute("strings", list);
	 	model.addAttribute("intro", intro);
 		model.addAttribute("entity", entity);
 		model.addAttribute("bid", bid);
 		model.addAttribute("state","chupdate");
		return "Product_I7Main_Edit";  
		
		
		
	}
 	
 	@RequestMapping(value="/back/chupdate",method=RequestMethod.POST)
	public Message backchupdate(@RequestBody ProductSubCharaWithBLOBs entity,Model model,HttpServletRequest request,HttpServletResponse httpServletResponse) {
 		
 		 boolean resu = productService.updateCh(entity);
	       if (resu==true) {
	        	return new Message("success");
	       }
	       return new Message("error");
	}
 	
 	//ch ending
 	
 	
 	
 	
 
	@RequestMapping(value="/back/func",method=RequestMethod.GET)
	public String backfunc(@RequestParam String bid,Model model) {
 		ProductSubFunc productSubFunc = productService.selectFunByBelong(bid);
		model.addAttribute("productSubFunc", productSubFunc);
		return "Product_I7_Overview_Edit";  
	}
	@RequestMapping(value="/back/funcadd",method=RequestMethod.GET)
	public String backfuncadd(@RequestParam String bid,Model model) {
		List list=new FindProduct().getSubUtil("");
		model.addAttribute("strings", list);
 		model.addAttribute("bid",bid);
 		model.addAttribute("state","funcsave");
		return "Product_I7Main_Edit";  
	}
 	@RequestMapping(value="/back/funcsave",method=RequestMethod.POST)
	public Message backfuncsave(@RequestBody ProductSubFuncWithBLOBs 	 entity,Model model,HttpServletRequest request,HttpServletResponse httpServletResponse) {
 	 
 	        String id= Long.toString(new   Date().getTime());
 	        
 	        entity.setPid(id);
 	       boolean resu = productService.insertFu(entity);
	       if (resu==true) {
	        	return new Message("success");
	       }
	       return new Message("error");
	}
 	
 	@RequestMapping(value="/back/funcupdate",method=RequestMethod.GET)
	public String backfuncupdateG(@RequestParam String bid,Model model) {
 		ProductSubFuncWithBLOBs entity = new ProductSubFuncWithBLOBs();
 		entity= productService.selectFunByBelong(bid);
 		String intro= new ByteToStr().byteToStr(entity.getFphoto());
 		//intro = intro.replaceAll("\"", "'");
 		List list=new FindProduct().getSubUtil(new ByteToStr().byteToStr(entity.getContext()));
		
 		JSONArray jsonArray = JSONArray.fromObject(list);
 		model.addAttribute("jsonArray", jsonArray);
	 	model.addAttribute("intro", intro);
 		model.addAttribute("entity", entity);
 		model.addAttribute("bid",bid);
 		model.addAttribute("state","funcupdate");
		return "Product_I7Main_Edit";  
	}
 	
 	@RequestMapping(value="/back/funcupdate",method=RequestMethod.POST)
	public Message backfuncupdate(@RequestBody ProductSubFuncWithBLOBs 	 entity,Model model,HttpServletRequest request,HttpServletResponse httpServletResponse) {
 		System.out.println("jin");
 		 boolean resu = productService.updateFu(entity);
 		 System.out.println(resu);
	       if (resu==true) {
	        	return new Message("success");
	       }
	       
	       return new Message("error");
	}
 	//func ending
	
	
	
	
	
	
	@RequestMapping(value="/back/para",method=RequestMethod.GET)
	public String backpara(@RequestParam String bid,Model model) {
 		ProductSubPara productSubChara = productService.selectPaByBelong(bid);
		model.addAttribute("productSubChara", productSubChara);
		return "paedit";  
	}
	
	
	@RequestMapping(value="/back/paadd",method=RequestMethod.GET)
	public String backpaadd(@RequestParam String bid,Model model) {
 		model.addAttribute("bid",bid);
 		model.addAttribute("state","pasave");
		return "paedit";  
	}
 	@RequestMapping(value="/back/pasave",method=RequestMethod.POST)
	public void backpasave(@RequestParam String bid,Model model,HttpServletRequest request,HttpServletResponse httpServletResponse) {
 	  
 	        String title = request.getParameter("pname");
 	        String context = request.getParameter("context");
 	        String sphoto = request.getParameter("sphoto");
 	        String id= Long.toString(new   Date().getTime());
 	        byte []ph;
 	        ph = new strToByteArray().strToByteArray(sphoto);
 	        ProductSubPara entity = new ProductSubPara();
 	        entity.setPid(id);
 	        entity.setPname(ph);
 	        entity.setContext(context);
 	        entity.setBelong(bid);
 	        entity.setContext(context);
 	        productService.insertPa(entity);
 	        try {
 				httpServletResponse.sendRedirect("list");
 			} catch (IOException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			} 
	}
 	
 	@RequestMapping(value="/back/paupdate",method=RequestMethod.GET)
	public String backpaupdateG(@RequestParam String bid,Model model) {
 		ProductSubPara entity = new ProductSubPara();
 		entity= productService.selectPaByBelong(bid);
 		String intro= new ByteToStr().byteToStr(entity.getPname());
 		intro = intro.replaceAll("\"", "'");
 		List list=new FindProduct().getSubUtil(entity.getContext());
		
		
 		model.addAttribute("strings", list);
 		model.addAttribute("intro", intro);
 		model.addAttribute("entity", entity);
 		model.addAttribute("bid", bid);
 		model.addAttribute("state","paupdate");
		return "paedit";  
	}
 	
 	@RequestMapping(value="/back/paupdate",method=RequestMethod.POST)
	public void backpaupdate(@RequestParam String bid,@RequestParam String id,Model model,HttpServletRequest request,HttpServletResponse httpServletResponse) {
 		ProductSubPara entity = new ProductSubPara();
	    String title = request.getParameter("pname");
	    String sphoto = request.getParameter("sphoto");
	    byte [] ph;
	    ph= new strToByteArray().strToByteArray(sphoto);
	    entity.setBelong(bid);
	    entity.setPid(id);
	    entity.setPname(ph);
	    entity.setContext(title);
		productService.updatePa(entity);
		 try {
				httpServletResponse.sendRedirect("list");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
}
