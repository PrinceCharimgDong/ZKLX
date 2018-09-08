package com.zklx.dao;

import com.zklx.domain.ProductSubChara;
import com.zklx.domain.ProductSubShort;
import com.zklx.domain.ProductSubShortExample;
import com.zklx.domain.ProductSubShortWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSubShortMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    long countByExample(ProductSubShortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int deleteByExample(ProductSubShortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int deleteByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int insert(ProductSubShort record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int insertSelective(ProductSubShort record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    List<ProductSubShort> selectByExampleWithBLOBs(ProductSubShortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    List<ProductSubShort> selectByExample(ProductSubShortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    ProductSubShort selectByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductSubShort record, @Param("example") ProductSubShortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ProductSubShort record, @Param("example") ProductSubShortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByExample(@Param("record") ProductSubShort record, @Param("example") ProductSubShortExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByPrimaryKeySelective(ProductSubShort record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProductSubShort record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_SHORT
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018 
     */
    int updateByPrimaryKey(ProductSubShort record);
    

    ProductSubShortWithBLOBs selectByBelong(String id);
    
    
    int selectCountSh(String id);
    
    int deleteBybelong(String id);
}