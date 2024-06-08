package org.jyafool.easylink.admin.common.enums;

import org.jyafool.easylink.admin.common.convention.errorcode.IErrorCode;

/**
 * 用户错误码
 * @Author jyafool
 * @Version 1.0
 * @Since 2024/6/7
 */
public enum UserErrorCodeEnum implements IErrorCode {

    USER_NULL("B000200", "用户记录不存在"),

    USER_NAME_EXIST("B000201", "用户名已存在"),

    USER_EXIST("B000202", "用户记录已存在"),

    USER_SAVE_ERROR("B000203", "用户记录新增失败");

    private final String code;

    private final String message;

    UserErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}

