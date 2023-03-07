package com.wy.farm.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wanyanhw
 * @date 2023/3/7 17:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TipException extends Throwable {

    private ResultCode resultCode;

    public TipException(ResultCode resultCode) {
        super(resultCode.getMessage());
        this.resultCode = resultCode;
    }
}
