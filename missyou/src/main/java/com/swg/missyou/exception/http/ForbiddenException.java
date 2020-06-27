package com.swg.missyou.exception.http;

/**
 * @Author swg.
 * @Date 2020/6/27 15:07
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class ForbiddenException extends HttpException{
    public ForbiddenException(Integer code){
        this.httpStatusCode = 403;
        this.code = code;
    }
}
