package com.entity.vo;

import com.entity.YuangongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 员工信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 10:42:40
 */
public class YuangongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 负责品类
	 */
	
	private String fuzepinlei;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 员工邮箱
	 */
	
	private String yuangongyouxiang;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
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
	 * 设置：负责品类
	 */
	 
	public void setFuzepinlei(String fuzepinlei) {
		this.fuzepinlei = fuzepinlei;
	}
	
	/**
	 * 获取：负责品类
	 */
	public String getFuzepinlei() {
		return fuzepinlei;
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
	 * 设置：员工邮箱
	 */
	 
	public void setYuangongyouxiang(String yuangongyouxiang) {
		this.yuangongyouxiang = yuangongyouxiang;
	}
	
	/**
	 * 获取：员工邮箱
	 */
	public String getYuangongyouxiang() {
		return yuangongyouxiang;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
			
}
