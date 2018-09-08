package com.zklx.dao;

import com.zklx.domain.ProductSubChara;
import com.zklx.domain.ProductSubPara;
import com.zklx.domain.ProductSubParaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductSubParaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    long countByExample(ProductSubParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int deleteByExample(ProductSubParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int deleteByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int insert(ProductSubPara record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int insertSelective(ProductSubPara record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    List<ProductSubPara> selectByExampleWithBLOBs(ProductSubParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    List<ProductSubPara> selectByExample(ProductSubParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    ProductSubPara selectByPrimaryKey(String pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductSubPara record, @Param("example") ProductSubParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ProductSubPara record, @Param("example") ProductSubParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByExample(@Param("record") ProductSubPara record, @Param("example") ProductSubParaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByPrimaryKeySelective(ProductSubPara record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProductSubPara record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PRODUCT_SUB_PARA
     *
     * @mbg.generated Sat Jul 28 08:48:56 CST 2018
     */
    int updateByPrimaryKey(ProductSubPara record);

    int deleteByBelong(String pid);

    ProductSubPara selectByBelong(String id);
    
    int countPa(String id);
}