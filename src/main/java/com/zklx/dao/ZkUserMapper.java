package com.zklx.dao;

import com.zklx.domain.ZkUser;
import com.zklx.domain.ZkUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZkUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    long countByExample(ZkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    int deleteByExample(ZkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    int deleteByPrimaryKey(String userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    int insert(ZkUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    int insertSelective(ZkUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    List<ZkUser> selectByExample(ZkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    ZkUser selectByPrimaryKey(String userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") ZkUser record, @Param("example") ZkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    int updateByExample(@Param("record") ZkUser record, @Param("example") ZkUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    int updateByPrimaryKeySelective(ZkUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ZK_USER
     *
     * @mbg.generated Thu Jul 12 10:03:51 CST 2018
     */
    int updateByPrimaryKey(ZkUser record);
    

	//根据用户名和密码查询用户
	//注解的两个参数会自动封装成map集合，括号内即为键
	public ZkUser findUserByNameAndPwd(@Param("name")String name, @Param("password")String password);
}