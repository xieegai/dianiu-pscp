/**
 * @author yanlin.chen 
 * @email yanlin.chen@edianniu.com
 * @date 2017年9月13日 下午5:44:20 
 * @version V1.0
 */
package com.edianniu.pscp.test.access.bean.netdau;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author yanlin.chen 
 * @email yanlin.chen@edianniu.com
 * @date 2017年9月13日 下午5:44:20 
 * @version V1.0
 */
public class DeviceAckDo implements Serializable{
	private static final long serialVersionUID = 1L;
	private DefaultAttrDo attr;
	private String device_ack="pass";
	public String getDevice_ack() {
		return device_ack;
	}
	public void setDevice_ack(String device_ack) {
		this.device_ack = device_ack;
	}
	public DefaultAttrDo getAttr() {
		return attr;
	}
	public void setAttr(DefaultAttrDo attr) {
		this.attr = attr;
	}
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
