package com.zklx.dao;

import com.zklx.domain.Permission;
import com.zklx.domain.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    long countByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int deleteByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int insert(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int insertSelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    List<Permission> selectByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    Permission selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERMISSION
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    int updateByPrimaryKey(Permission record);
    

	List<Permission> getPermissions();

	void addpermission(Permission permission);

	void deletepermission(int pid);

	Permission getPermissionByid(int pid);

	void updatePermission(Permission permission);

	void deletePermissionsByid(int permissionid);// 删除所有角色中的permission
}