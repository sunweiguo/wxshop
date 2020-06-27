package com.swg.missyou.exception.http;

/**
 * @Author swg.
 * @Date 2020/6/27 15:05
 * @CONTACT 317758022@qq.com
 * @DESC
 */
public class NotFoundException extends HttpException{

    public NotFoundException(Integer code){
        this.httpStatusCode = 404;
        this.code = code;
    }

}
