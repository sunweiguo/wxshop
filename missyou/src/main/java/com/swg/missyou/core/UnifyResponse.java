package com.swg.missyou.core;

import lombok.Data;

/**
 * @Author swg.
 * @Date 2020/6/27 15:21
 * @CONTACT 317758022@qq.com
 * @DESC 通用的返回结构体
 */
@Data
public class UnifyResponse {
    private int code;
    private String message;
    private String request;

    public UnifyResponse(int code, String message, String request) {
        this.code = code;
        this.message = message;
        this.request = request;
    }
}
