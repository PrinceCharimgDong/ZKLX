/**  

* <p>Title: ProductService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月27日  下午4:02:45

* @version 1.0  

*/  
package com.zklx.service;

import java.util.List;

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

/**  

* <p>Title: ProductService.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月27日  下午4:02:45

* @version 1.0  

*/ 
public interface ProductService {


		//查询全部
		List<Product> SelectAll();
		
		//查询单个
		Product selectOne(String id);
		
		//add
		boolean addOne(Product product);
	
		List<ProductSub> selectSub(String id);
		
		ProductDetailWithBLOBs selectDetail(String id) ;
		
		ProductSubShortWithBLOBs selectShort(String id);

		ProductSubCharaWithBLOBs selectChara(String id);
		
		ProductSubFuncWithBLOBs selectFunc(String id);
		
		ProductSubPara selectPara(String id);
		
		ProductSub selectFirstSub(String id);
		
		Product selectFirst();
		
		List<ProductSub> selectSubByPri(String id);
		
		

		/**
		 * @param id
		 */
		boolean deleteOnePro(String id);

		/**
		 * @param product
		 */
		boolean update(Product product);
		
		
		List<ProductSub> selectSubByBelong(String id);
		
		ProductSub selectByPrimaryKey(String id);
		
		boolean insertSub(ProductSub productSub);
		
		boolean updateSub(ProductSub productSub);
		
		boolean deleteSub(String id);
		
		
		ProductSubCharaWithBLOBs selectCharaByBelong(String bid);
		boolean insertCh(ProductSubCharaWithBLOBs productSubChara);
		
		boolean updateCh(ProductSubCharaWithBLOBs productSubChara);
		
		
		
		ProductSubShortWithBLOBs selectShortByBelong(String bid);
		boolean insertSh(ProductSubShortWithBLOBs productSubShort);
		
		boolean updateSh(ProductSubShortWithBLOBs productSubShort);
		
		
		
		
		ProductSubFuncWithBLOBs selectFunByBelong(String bid);

		boolean insertFu(ProductSubFuncWithBLOBs productSubFunc);
		
		boolean updateFu(ProductSubFuncWithBLOBs productSubFunc);
		
		
		ProductSubPara selectPaByBelong(String bid);

		boolean insertPa(ProductSubPara productSubPara);
		
		boolean updatePa(ProductSubPara productSubPara);
		
		int countCh(String id);

		int countSh(String id);
		

		int countFu(String id);

		int countPa(String id);
}
