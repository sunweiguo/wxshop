package com.swg.missyou.exception.http;

import lombok.Data;

/**
 * @Author swg.
 * @Date 2020/6/27 15:01
 * @CONTACT 317758022@qq.com
 * @DESC
 */
@Data
public class HttpException extends RuntimeException{

    protected  Integer code;
    protected  Integer httpStatusCode = 500;

}
