package com.zklx.dao;

import com.zklx.domain.Honor;
import com.zklx.domain.HonorExample;
import com.zklx.domain.ProMulti;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface HonorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    long countByExample(HonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int deleteByExample(HonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int deleteByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int insert(Honor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int insertSelective(Honor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    List<Honor> selectByExampleWithBLOBs(HonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    List<Honor> selectByExample(HonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    Honor selectByPrimaryKey(String sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int updateByExampleSelective(@Param("record") Honor record, @Param("example") HonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Honor record, @Param("example") HonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int updateByExample(@Param("record") Honor record, @Param("example") HonorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int updateByPrimaryKeySelective(Honor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Honor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HONOR
     *
     * @mbg.generated Mon Jul 23 14:02:16 CST 2018
     */
    int updateByPrimaryKey(Honor record);

    List<Honor> selectAll();

    @Select("select count(*) from Honor")
    int selectCountHonor();
    
}