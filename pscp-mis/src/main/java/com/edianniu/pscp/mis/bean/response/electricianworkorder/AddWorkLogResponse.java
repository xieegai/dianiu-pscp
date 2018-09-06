package com.edianniu.pscp.mis.bean.response.electricianworkorder;

import com.edianniu.pscp.mis.bean.response.BaseResponse;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import stc.skymobi.bean.json.annotation.JSONMessage;

/**
 * ClassName: AddWorkLogResponse
 * Author: tandingbo
 * CreateTime: 2017-04-13 17:24
 */
@JSONMessage(messageCode = 2002023)
public final class AddWorkLogResponse extends BaseResponse {

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
