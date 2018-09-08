package com.zklx.dao;

import com.zklx.domain.About;
import com.zklx.domain.AboutExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AboutMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    long countByExample(AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int deleteByExample(AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int deleteByPrimaryKey(String aid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int insert(About record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int insertSelective(About record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    List<About> selectByExampleWithBLOBs(AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    List<About> selectByExample(AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    About selectByPrimaryKey(String aid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") About record, @Param("example") AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") About record, @Param("example") AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int updateByExample(@Param("record") About record, @Param("example") AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int updateByPrimaryKeySelective(About record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(About record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ABOUT
     *
     * @mbg.generated Wed Aug 01 16:03:54 CST 2018
     */
    int updateByPrimaryKey(About record);
    
    @Delete("delete from about where rownum>=1")
    int deleteAll();
    
    @Select("select * from about where rownum<=1")
    About selectAll();
    

    @Select("select count(*) from about where rownum<=1")
    int selectCountAbout();
}