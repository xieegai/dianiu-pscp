package com.edianniu.pscp.cs.bean.power;

import java.io.Serializable;

/**
 * 门户：智能监控>监控列表>用能排行
 * @author zhoujianjian
 * @date 2017年12月15日 下午2:12:54
 */
public class ConsumeRankReqData implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long uid;
	// 精确到月份
	private String date;
	
	private Integer offset;
	
	private Integer limit;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
	
	
}
