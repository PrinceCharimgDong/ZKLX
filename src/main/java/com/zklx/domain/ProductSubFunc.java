package com.zklx.domain;

public class ProductSubFunc {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SUB_FUNC.PID
     *
     * @mbg.generated Wed Aug 22 09:23:05 CST 2018
     */
    private String pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SUB_FUNC.PNAME
     *
     * @mbg.generated Wed Aug 22 09:23:05 CST 2018
     */
    private String pname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SUB_FUNC.BELONG
     *
     * @mbg.generated Wed Aug 22 09:23:05 CST 2018
     */
    private String belong;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SUB_FUNC.PID
     *
     * @return the value of PRODUCT_SUB_FUNC.PID
     *
     * @mbg.generated Wed Aug 22 09:23:05 CST 2018
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SUB_FUNC.PID
     *
     * @param pid the value for PRODUCT_SUB_FUNC.PID
     *
     * @mbg.generated Wed Aug 22 09:23:05 CST 2018
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SUB_FUNC.PNAME
     *
     * @return the value of PRODUCT_SUB_FUNC.PNAME
     *
     * @mbg.generated Wed Aug 22 09:23:05 CST 2018
     */
    public String getPname() {
        return pname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SUB_FUNC.PNAME
     *
     * @param pname the value for PRODUCT_SUB_FUNC.PNAME
     *
     * @mbg.generated Wed Aug 22 09:23:05 CST 2018
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SUB_FUNC.BELONG
     *
     * @return the value of PRODUCT_SUB_FUNC.BELONG
     *
     * @mbg.generated Wed Aug 22 09:23:05 CST 2018
     */
    public String getBelong() {
        return belong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SUB_FUNC.BELONG
     *
     * @param belong the value for PRODUCT_SUB_FUNC.BELONG
     *
     * @mbg.generated Wed Aug 22 09:23:05 CST 2018
     */
    public void setBelong(String belong) {
        this.belong = belong == null ? null : belong.trim();
    }
}