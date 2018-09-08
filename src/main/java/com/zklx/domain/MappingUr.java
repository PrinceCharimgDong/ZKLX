package com.zklx.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class MappingUr {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MAPPING_UR.USERID
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    private Long userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MAPPING_UR.ROLEID
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    private Long roleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MAPPING_UR.USERID
     *
     * @return the value of MAPPING_UR.USERID
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MAPPING_UR.USERID
     *
     * @param userid the value for MAPPING_UR.USERID
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MAPPING_UR.ROLEID
     *
     * @return the value of MAPPING_UR.ROLEID
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MAPPING_UR.ROLEID
     *
     * @param roleid the value for MAPPING_UR.ROLEID
     *
     * @mbg.generated Fri Aug 10 09:46:56 CST 2018
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
    
	private Uuser user;

	private Rrole role;

	public Uuser getUser() {
		return user;
	}

	public void setUser(Uuser user) {
		this.user = user;
	}

	public Rrole getRole() {
		return role;
	}

	public void setRole(Rrole role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Mapping_UR [user=" + user + ", role=" + role + "]";
	}
}