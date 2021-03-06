package com.edianniu.pscp.sps.bean.request;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import stc.skymobi.bean.json.annotation.JSONMessage;

/**
 * ClassName: ConfigureParamRequest
 * Author: tandingbo
 * CreateTime: 2017-04-20 15:25
 */
@JSONMessage(messageCode = 1002213)
public class ConfigureParamRequest extends TerminalRequest {

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
