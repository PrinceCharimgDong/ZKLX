package com.zklx.domain;

public class ProductSubShort {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SUB_SHORT.PID
     *
     * @mbg.generated Tue Aug 21 17:08:21 CST 2018
     */
    private String pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SUB_SHORT.PNAME
     *
     * @mbg.generated Tue Aug 21 17:08:21 CST 2018
     */
    private String pname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRODUCT_SUB_SHORT.BELONG
     *
     * @mbg.generated Tue Aug 21 17:08:21 CST 2018
     */
    private String belong;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SUB_SHORT.PID
     *
     * @return the value of PRODUCT_SUB_SHORT.PID
     *
     * @mbg.generated Tue Aug 21 17:08:21 CST 2018
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SUB_SHORT.PID
     *
     * @param pid the value for PRODUCT_SUB_SHORT.PID
     *
     * @mbg.generated Tue Aug 21 17:08:21 CST 2018
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SUB_SHORT.PNAME
     *
     * @return the value of PRODUCT_SUB_SHORT.PNAME
     *
     * @mbg.generated Tue Aug 21 17:08:21 CST 2018
     */
    public String getPname() {
        return pname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SUB_SHORT.PNAME
     *
     * @param pname the value for PRODUCT_SUB_SHORT.PNAME
     *
     * @mbg.generated Tue Aug 21 17:08:21 CST 2018
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRODUCT_SUB_SHORT.BELONG
     *
     * @return the value of PRODUCT_SUB_SHORT.BELONG
     *
     * @mbg.generated Tue Aug 21 17:08:21 CST 2018
     */
    public String getBelong() {
        return belong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRODUCT_SUB_SHORT.BELONG
     *
     * @param belong the value for PRODUCT_SUB_SHORT.BELONG
     *
     * @mbg.generated Tue Aug 21 17:08:21 CST 2018
     */
    public void setBelong(String belong) {
        this.belong = belong == null ? null : belong.trim();
    }
}