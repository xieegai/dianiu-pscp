package com.edianniu.pscp.renter.mis.bean.request.renter;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.edianniu.pscp.renter.mis.bean.request.TerminalRequest;
import stc.skymobi.bean.json.annotation.JSONMessage;


@JSONMessage(messageCode = 1002308)
public class RenterMetersRequest extends TerminalRequest{
	
	private Integer offset;
	
	private Long renterId;
	
	public Long getRenterId() {
		return renterId;
	}

	public void setRenterId(Long renterId) {
		this.renterId = renterId;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}


	public String toString(){
		return ToStringBuilder.reflectionToString(this,ToStringStyle.DEFAULT_STYLE);
	}

}
