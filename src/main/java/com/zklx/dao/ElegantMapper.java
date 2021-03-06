package com.zklx.dao;

import com.zklx.domain.Elegant;
import com.zklx.domain.ElegantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ElegantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    long countByExample(ElegantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int deleteByExample(ElegantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int deleteByPrimaryKey(String eid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int insert(Elegant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int insertSelective(Elegant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    List<Elegant> selectByExampleWithBLOBs(ElegantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    List<Elegant> selectByExample(ElegantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    Elegant selectByPrimaryKey(String eid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int updateByExampleSelective(@Param("record") Elegant record, @Param("example") ElegantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Elegant record, @Param("example") ElegantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int updateByExample(@Param("record") Elegant record, @Param("example") ElegantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int updateByPrimaryKeySelective(Elegant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Elegant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ELEGANT
     *
     * @mbg.generated Tue Aug 07 11:18:48 CST 2018
     */
    int updateByPrimaryKey(Elegant record);
    
    List<Elegant> selectAll();

    @Select("select count(*) from Elegant")
    int selectCountEle();
    
    int updateIsShowById(Elegant record);
}