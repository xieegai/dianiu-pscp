package com.edianniu.pscp.mis.bean.request.wallet;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.edianniu.pscp.mis.bean.request.TerminalRequest;

import stc.skymobi.bean.json.annotation.JSONMessage;
@JSONMessage(messageCode = 1002030)
public class WalletDetailRequest extends TerminalRequest{
	private Long uid;
    private String token;
    private Long id;
    
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
    

}
