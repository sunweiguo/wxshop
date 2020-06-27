package com.swg.missyou.core;

import com.swg.missyou.core.configuration.ExceptionCodeConfiguration;
import com.swg.missyou.exception.http.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author swg.
 * @Date 2020/6/27 12:13
 * @CONTACT 317758022@qq.com
 * @DESC
 */
@ControllerAdvice
public class GlobalExceptionAdvice {
    @Autowired
    private ExceptionCodeConfiguration codeConfiguration;

    //处理未知异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyResponse handleException(HttpServletRequest req, Exception e){
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();
        UnifyResponse message = new UnifyResponse(9999,codeConfiguration.getMessage(9999),method + " " + requestUrl);
        return message;
    }

    //处理已知的HTTP异常
    @ExceptionHandler(value = HttpException.class)
    @ResponseBody
    public ResponseEntity handleHttpException(HttpServletRequest req, HttpException e){
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();
        //响应的消息体
        UnifyResponse message = new UnifyResponse(e.getCode(),codeConfiguration.getMessage(e.getCode()),method + " " + requestUrl);
        //响应的消息头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //响应的状态码
        HttpStatus httpStatus = HttpStatus.resolve(e.getHttpStatusCode());
        //封装数据返回
        assert httpStatus != null;
        return new ResponseEntity<>(message, headers, httpStatus);
    }

}
