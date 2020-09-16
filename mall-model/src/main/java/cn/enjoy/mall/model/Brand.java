package cn.enjoy.mall.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Brand implements Serializable{
    private static final long serialVersionUID = 7994885427870418988L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private Short id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.name
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.logo
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private String logo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.url
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.sort
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private Byte sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.cat_name
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private String catName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.parent_cat_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private Integer parentCatId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.cat_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private Integer catId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.is_hot
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private Boolean isHot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_brand.desc
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.id
     *
     * @return the value of tp_brand.id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.id
     *
     * @param id the value for tp_brand.id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.name
     *
     * @return the value of tp_brand.name
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.name
     *
     * @param name the value for tp_brand.name
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.logo
     *
     * @return the value of tp_brand.logo
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public String getLogo() {
        return logo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.logo
     *
     * @param logo the value for tp_brand.logo
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.url
     *
     * @return the value of tp_brand.url
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.url
     *
     * @param url the value for tp_brand.url
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.sort
     *
     * @return the value of tp_brand.sort
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public Byte getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.sort
     *
     * @param sort the value for tp_brand.sort
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setSort(Byte sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.cat_name
     *
     * @return the value of tp_brand.cat_name
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public String getCatName() {
        return catName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.cat_name
     *
     * @param catName the value for tp_brand.cat_name
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.parent_cat_id
     *
     * @return the value of tp_brand.parent_cat_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public Integer getParentCatId() {
        return parentCatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.parent_cat_id
     *
     * @param parentCatId the value for tp_brand.parent_cat_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setParentCatId(Integer parentCatId) {
        this.parentCatId = parentCatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.cat_id
     *
     * @return the value of tp_brand.cat_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.cat_id
     *
     * @param catId the value for tp_brand.cat_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.is_hot
     *
     * @return the value of tp_brand.is_hot
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.is_hot
     *
     * @param isHot the value for tp_brand.is_hot
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_brand.desc
     *
     * @return the value of tp_brand.desc
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_brand.desc
     *
     * @param desc the value for tp_brand.desc
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}