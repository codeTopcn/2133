package com.entity.model;

import com.entity.XueshengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-06 14:26:56
 */
public class XueshengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 院系
	 */
	
	private String yuanxi;
		
	/**
	 * 选修课程
	 */
	
	private String xuanxiukecheng;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：院系
	 */
	 
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	
	/**
	 * 获取：院系
	 */
	public String getYuanxi() {
		return yuanxi;
	}
				
	
	/**
	 * 设置：选修课程
	 */
	 
	public void setXuanxiukecheng(String xuanxiukecheng) {
		this.xuanxiukecheng = xuanxiukecheng;
	}
	
	/**
	 * 获取：选修课程
	 */
	public String getXuanxiukecheng() {
		return xuanxiukecheng;
	}
			
}
