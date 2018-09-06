package com.edianniu.pscp.mis.bean.message;

import com.edianniu.pscp.mis.bean.Result;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ClassName: ClearAllMessageResult
 * Author: tandingbo
 * CreateTime: 2017-04-17 16:35
 */
public class ClearAllMessageResult extends Result {
    private static final long serialVersionUID = 1L;

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
