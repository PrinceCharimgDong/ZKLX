package com.zklx.dao;

import com.zklx.domain.MappingUr;
import com.zklx.domain.MappingUrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MappingUrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MAPPING_UR
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    long countByExample(MappingUrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MAPPING_UR
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int deleteByExample(MappingUrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MAPPING_UR
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int insert(MappingUr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MAPPING_UR
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int insertSelective(MappingUr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MAPPING_UR
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    List<MappingUr> selectByExample(MappingUrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MAPPING_UR
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") MappingUr record, @Param("example") MappingUrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MAPPING_UR
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int updateByExample(@Param("record") MappingUr record, @Param("example") MappingUrExample example);
}