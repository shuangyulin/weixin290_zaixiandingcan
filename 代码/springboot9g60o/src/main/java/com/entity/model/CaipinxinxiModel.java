package com.entity.model;

import com.entity.CaipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 菜品信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-16 17:23:53
 */
public class CaipinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 菜品分类
	 */
	
	private String caipinfenlei;
		
	/**
	 * 推荐指数
	 */
	
	private String tuijianzhishu;
		
	/**
	 * 口味
	 */
	
	private String kouwei;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 菜品详情
	 */
	
	private String caipinxiangqing;
		
	/**
	 * 商家账号
	 */
	
	private String shangjiazhanghao;
		
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 商家地址
	 */
	
	private String shangjiadizhi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：菜品分类
	 */
	 
	public void setCaipinfenlei(String caipinfenlei) {
		this.caipinfenlei = caipinfenlei;
	}
	
	/**
	 * 获取：菜品分类
	 */
	public String getCaipinfenlei() {
		return caipinfenlei;
	}
				
	
	/**
	 * 设置：推荐指数
	 */
	 
	public void setTuijianzhishu(String tuijianzhishu) {
		this.tuijianzhishu = tuijianzhishu;
	}
	
	/**
	 * 获取：推荐指数
	 */
	public String getTuijianzhishu() {
		return tuijianzhishu;
	}
				
	
	/**
	 * 设置：口味
	 */
	 
	public void setKouwei(String kouwei) {
		this.kouwei = kouwei;
	}
	
	/**
	 * 获取：口味
	 */
	public String getKouwei() {
		return kouwei;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：菜品详情
	 */
	 
	public void setCaipinxiangqing(String caipinxiangqing) {
		this.caipinxiangqing = caipinxiangqing;
	}
	
	/**
	 * 获取：菜品详情
	 */
	public String getCaipinxiangqing() {
		return caipinxiangqing;
	}
				
	
	/**
	 * 设置：商家账号
	 */
	 
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
				
	
	/**
	 * 设置：商家名称
	 */
	 
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：商家地址
	 */
	 
	public void setShangjiadizhi(String shangjiadizhi) {
		this.shangjiadizhi = shangjiadizhi;
	}
	
	/**
	 * 获取：商家地址
	 */
	public String getShangjiadizhi() {
		return shangjiadizhi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
