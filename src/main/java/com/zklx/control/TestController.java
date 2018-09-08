/**  

* <p>Title: TestController.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月13日  上午8:23:15

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zklx.domain.ComNewsWithBLOBs;
import com.zklx.domain.ZkUser;

import util.strToByteArray;

/**  

* <p>Title: TestController.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>   

* @author 王冬冬

* @date 2018年7月13日  上午8:23:15

* @version 1.0  

*/
@Controller
public class TestController {
	static byte []pic=null;;
     
    
    @RequestMapping(value="upfile",method=RequestMethod.GET)
    public String sq1() {
    	return "upfile";
    }    
    /*@RequestMapping(value="upfile",method=RequestMethod.POST)
    public String sq2(HttpServletRequest request,HttpServletResponse response) {
    	   String filePath = request.getParameter("filepath");//前端传递过来的上传路劲
           //String goodid =  request.getParameter("goodid");//前端传递过来的id

           //TGoodsPic good = new TGoodsPic();
           good.setId(goodid);
           good.setName("我是商品1"); 
           
           try{
                       //通过下面代码把文件转成byte直接存储就行
               File file=new File(filePath);
               InputStream inputStream=new FileInputStream(file);
               pic=new byte[inputStream.available()];
               inputStream.read(pic);
               inputStream.close();
               System.out.println("pic:"+pic);
               //good.setPic(pic);

               //tgoodspicService.updateGoods(good);//头像存库
                     response.getWriter().write("success");
                   response.getWriter().flush();
           }catch(Exception e){
               e.printStackTrace();
           }
    	return "test";
    }*/
    /**
     * 获取头像
     * @param request
     * @return
     */
    @RequestMapping(value="/getGoodsPic")
    public void   getGoodsPic(HttpServletRequest request,HttpServletResponse response){ 
        response.setHeader("Content-Type","image/jped");//设置响应的媒体类型，这样浏览器会识别出响应的是图片
       // String goodid = request.getParameter("goodid");
       //TGoodsPic good = tgoodspicService.selectAllGoodsById(goodid);
        System.out.println("pic");
        try {
            response.getOutputStream().write(pic);//流输出
            response.getOutputStream().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value="head")
    public String getHead() {
    	return "head";
    }
    
    
    
    @RequestMapping(value="/testsave",method=RequestMethod.POST)
    @ResponseBody  
    public String  imgUploadByUeditor(ComNewsWithBLOBs entity,HttpServletRequest request){
        //System.out.println(entity.getContent()+"=========================");
//        //拿到编辑器的内容
        String content = request.getParameter("content");
        List<String> srcList = new ArrayList<String>(); //用来存储获取到的图片地址
    	Pattern p = Pattern.compile("<(img|IMG)(.*?)(>|></img>|/>)");//匹配字符串中的img标签
    	Matcher matcher = p.matcher(content);
    	boolean hasPic = matcher.find();
    	if(hasPic == true)//判断是否含有图片
    	{
    		while(hasPic) //如果含有图片，那么持续进行查找，直到匹配不到
    		{
    			String group = matcher.group(2);//获取第二个分组的内容，也就是 (.*?)匹配到的
    			Pattern srcText = Pattern.compile("(src|SRC)=(\"|\')(.*?)(\"|\')");//匹配图片的地址
    			Matcher matcher2 = srcText.matcher(group);
    			if( matcher2.find() ) 
    			{
    				srcList.add( matcher2.group(3) );//把获取到的图片地址添加到列表中
    			}
    			hasPic = matcher.find();//判断是否还有img标签
    		}
    	}
    	System.out.println("匹配到的内容："+srcList);
        
        byte [] introduciton;
        introduciton = strToByteArray.strToByteArray(content);
        System.out.println("introduciton:"+introduciton);
        return "newslist";  
    }
 	
 	@RequestMapping(value="/testsave",method=RequestMethod.GET)
 	public String caseGet() {
 		System.out.println("add");
 		return "newsadd";
 	} 
}
