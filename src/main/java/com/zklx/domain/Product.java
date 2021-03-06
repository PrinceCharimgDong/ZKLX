package com.zklx.domain;

import java.util.List;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.PID
     *
     * @mbg.generated Fri Jul 27 15:59:26 CST 2018
     */
    private String pid;

    private List<ProductSub> productSubs;
    /**
	 * @return the productSubs
	 */
	public List<ProductSub> getProductSubs() {
		return productSubs;
	}

	/**
	 * @param productSubs the productSubs to set
	 */
	public void setProductSubs(List<ProductSub> productSubs) {
		this.productSubs = productSubs;
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT.PNAME
     *
     * @mbg.generated Fri Jul 27 15:59:26 CST 2018
     */
    private String pname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.PID
     *
     * @return the value of PRODUCT.PID
     *
     * @mbg.generated Fri Jul 27 15:59:26 CST 2018
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.PID
     *
     * @param pid the value for PRODUCT.PID
     *
     * @mbg.generated Fri Jul 27 15:59:26 CST 2018
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT.PNAME
     *
     * @return the value of PRODUCT.PNAME
     *
     * @mbg.generated Fri Jul 27 15:59:26 CST 2018
     */
    public String getPname() {
        return pname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT.PNAME
     *
     * @param pname the value for PRODUCT.PNAME
     *
     * @mbg.generated Fri Jul 27 15:59:26 CST 2018
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }
}