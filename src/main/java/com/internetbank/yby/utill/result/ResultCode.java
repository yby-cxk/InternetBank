package com.internetbank.yby.utill.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultCode {
    //成功（转换字母快捷键 Ctrl+Shift+u）
    SUCCESS(200,"成功"),
    //失败
    FAIL(500,"失败");
    private Integer code;
    private String message;

}
