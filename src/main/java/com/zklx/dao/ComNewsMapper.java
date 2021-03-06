package com.zklx.dao;

import com.zklx.domain.ComNews;
import com.zklx.domain.ComNewsExample;
import com.zklx.domain.ComNewsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ComNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    long countByExample(ComNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int deleteByExample(ComNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int deleteByPrimaryKey(String cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int insert(ComNewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int insertSelective(ComNewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    List<ComNewsWithBLOBs> selectByExampleWithBLOBs(ComNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    List<ComNews> selectByExample(ComNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    ComNewsWithBLOBs selectByPrimaryKey(String cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") ComNewsWithBLOBs record, @Param("example") ComNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ComNewsWithBLOBs record, @Param("example") ComNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int updateByExample(@Param("record") ComNews record, @Param("example") ComNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int updateByPrimaryKeySelective(ComNewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ComNewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COM_NEWS
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    int updateByPrimaryKey(ComNews record);   
    List<ComNewsWithBLOBs> selectAll();
    
    
    List<ComNewsWithBLOBs> selectByTitle(String title);
    
    @Select("select count(*) from com_news")
    int selectCountNews();
}