package cn.enjoy.mall.model;

import java.io.Serializable;

public class GoodsImages implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_goods_images.img_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private Integer imgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_goods_images.goods_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_goods_images.image_url
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    private String imageUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_goods_images.img_id
     *
     * @return the value of tp_goods_images.img_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public Integer getImgId() {
        return imgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_goods_images.img_id
     *
     * @param imgId the value for tp_goods_images.img_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_goods_images.goods_id
     *
     * @return the value of tp_goods_images.goods_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_goods_images.goods_id
     *
     * @param goodsId the value for tp_goods_images.goods_id
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_goods_images.image_url
     *
     * @return the value of tp_goods_images.image_url
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_goods_images.image_url
     *
     * @param imageUrl the value for tp_goods_images.image_url
     *
     * @mbggenerated Wed Feb 07 09:55:47 CST 2018
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }
}