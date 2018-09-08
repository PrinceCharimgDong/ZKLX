/**  

* <p>Title: ProductServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月30日  上午8:36:14

* @version 1.0  

*/  
package com.zklx.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zklx.dao.ProductDetailMapper;
import com.zklx.dao.ProductMapper;
import com.zklx.dao.ProductSubCharaMapper;
import com.zklx.dao.ProductSubFuncMapper;
import com.zklx.dao.ProductSubMapper;
import com.zklx.dao.ProductSubParaMapper;
import com.zklx.dao.ProductSubShortMapper;
import com.zklx.domain.ProApp;
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
import com.zklx.service.ProductService;

/**  

* <p>Title: ProductServiceImp.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月30日  上午8:36:14

* @version 1.0  

*/
@Service("productService")
public class ProductServiceImp implements ProductService{

	@Autowired 
	private ProductMapper productMapper;
	
	@Autowired
	private ProductSubMapper productSubMapper;
	
	@Autowired
	private ProductDetailMapper productDetailMapper;
	
	@Autowired
	private ProductSubShortMapper productSubShortMapper;
	
	@Autowired
	private ProductSubFuncMapper productSubFuncMapper;
	
	@Autowired
	private ProductSubCharaMapper productSubCharaMapper;
	
	@Autowired
	private ProductSubParaMapper productSubParaMapper;
	@Override
	public List<Product> SelectAll() {
		// TODO Auto-generated method stub
		return productMapper.selectAll();
	}

	@Override
	public Product selectOne(String id) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean addOne(Product product) {
		// TODO Auto-generated method stub
		return productMapper.insert(product)==1;
	}

	@Override
	public List<ProductSub> selectSub(String id) {
		// TODO Auto-generated method stub
		return productSubMapper.selectAllInfoById(id);
	}

	
	@Override
	public ProductDetailWithBLOBs selectDetail(String id) {
		// TODO Auto-generated method stub
		return productDetailMapper.selectByBelong(id);
	}

	@Override
	public ProductSubShortWithBLOBs selectShort(String id) {
		// TODO Auto-generated method stub
		return  productSubShortMapper.selectByBelong(id);
	} 

	@Override
	public ProductSubCharaWithBLOBs selectChara(String id) {
		// TODO Auto-generated method stub
		return productSubCharaMapper.selectByBelong(id);
	}
 
	@Override
	public ProductSubFuncWithBLOBs selectFunc(String id) {
		// TODO Auto-generated method stub
		return productSubFuncMapper.selectByBelong(id);
	}

	@Override
	public ProductSubPara selectPara(String id) {
		// TODO Auto-generated method stub
		return productSubParaMapper.selectByBelong(id);
	}

	@Override
	public Product selectFirst() {
		
		return productMapper.selectFirst();
	}

	@Override
	public ProductSub selectFirstSub(String id) {
		// TODO Auto-generated method stub
		return productSubMapper.selectFirstSub(id);
	}

	@Override
	public List<ProductSub> selectSubByPri(String id) {
		// TODO Auto-generated method stub
		return productSubMapper.selectAllInfoById(id);
	}
	
	public boolean insertCh(ProductSubCharaWithBLOBs productSubChara) {
		// TODO Auto-generated method stub
		return productSubCharaMapper.insert(productSubChara)==1;
	}

/*	@Override
	public boolean insertShort(ProductSubShort productSubShort) {
		// TODO Auto-generated method stub
		return productSubShortMapper.insert(productSubShort)==1;
	}

	

	@Override
	public boolean insertFunc(ProductSubFunc productSubFunc) {
		// TODO Auto-generated method stub
		return productSubFuncMapper.insert(productSubFunc)==1;
	}

	@Override
	public boolean insertPara(ProductSubPara productSubPara,String id) {
		// TODO Auto-generated method stub
		productSubParaMapper.deleteByBelong(id);
		return productSubParaMapper.insert(productSubPara)==1;
	}
*/
	@Override
	public boolean deleteOnePro(String id) {
		return productMapper.deleteByPrimaryKey(id)==1;
		
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return productMapper.updateByPrimaryKey(product)==1;
	}

	@Override
	public List<ProductSub> selectSubByBelong(String id) {
		// TODO Auto-generated method stub
		return productSubMapper.selectAllInfoById(id);
	}

	@Override
	public ProductSub selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return productSubMapper.selectByPrimaryKey(id);
	}

	@Override
	public ProductSubCharaWithBLOBs selectCharaByBelong(String bid) {
		// TODO Auto-generated method stub
		return  productSubCharaMapper.selectByBelong(bid);
	}

	@Override
	public ProductSubShortWithBLOBs selectShortByBelong(String bid) {
		// TODO Auto-generated method stub
		return  productSubShortMapper.selectByBelong(bid);
	}

	@Override
	public ProductSubFuncWithBLOBs selectFunByBelong(String bid) {
		// TODO Auto-generated method stub
		return productSubFuncMapper.selectByBelong(bid);
	}

	@Override
	public ProductSubPara selectPaByBelong(String bid) {
		// TODO Auto-generated method stub
		return  productSubParaMapper.selectByBelong(bid);
	}

	@Override
	public boolean insertSub(ProductSub productSub) {
		// TODO Auto-generated method stub
		return productSubMapper.insert(productSub)==1;
	}

	@Override
	public boolean updateSub(ProductSub productSub) {
		// TODO Auto-generated method stub
		return productSubMapper.updateByPrimaryKey(productSub)==1;
	}

	@Override
	public boolean deleteSub(String id) {
		// TODO Auto-generated method stub
		return productSubMapper.deleteByPrimaryKey(id)==1;
	}

	@Override
	public boolean updateCh(ProductSubCharaWithBLOBs productSubChara) {
		// TODO Auto-generated method stub
		return productSubCharaMapper.updateByPrimaryKeyWithBLOBs(productSubChara)==1;
	}

	@Override
	public boolean insertSh(ProductSubShortWithBLOBs productSubShort) {
		// TODO Auto-generated method stub
		productSubShortMapper.deleteBybelong(productSubShort.getBelong());
		return productSubShortMapper.insert(productSubShort)==1;
	}

	@Override
	public boolean updateSh(ProductSubShortWithBLOBs productSubShort) {
		// TODO Auto-generated method stub
		return productSubShortMapper.updateByPrimaryKeyWithBLOBs(productSubShort)==1;
	}

	@Override
	public boolean insertFu(ProductSubFuncWithBLOBs productSubFunc) {
		// TODO Auto-generated method stub
		return productSubFuncMapper.insert(productSubFunc)==1;
	}

	@Override
	public boolean updateFu(ProductSubFuncWithBLOBs productSubFunc) {
		// TODO Auto-generated method stub
		return productSubFuncMapper.updateByPrimaryKeyWithBLOBs(productSubFunc)==1;
	}

	@Override
	public boolean insertPa(ProductSubPara productSubPara) {
		// TODO Auto-generated method stub
		return productSubParaMapper.insert(productSubPara)==1;
	}

	@Override
	public boolean updatePa(ProductSubPara productSubPara) {
		// TODO Auto-generated method stub
		return productSubParaMapper.updateByPrimaryKeyWithBLOBs(productSubPara)==1;
	}

	@Override
	public int countCh(String id) {
		// TODO Auto-generated method stub
		return productSubCharaMapper.countCh(id);
	}

	@Override
	public int countSh(String id) {
		// TODO Auto-generated method stub
		return productSubShortMapper.selectCountSh(id);
	}

	@Override
	public int countFu(String id) {
		// TODO Auto-generated method stub
		return productSubFuncMapper.countFu(id);
	}

	@Override
	public int countPa(String id) {
		// TODO Auto-generated method stub
		return productSubParaMapper.countPa(id);
	}
	
	
	
}
