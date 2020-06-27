package com.swg.missyou.api.v1;

import com.swg.missyou.exception.http.ForbiddenException;
import com.swg.missyou.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author swg.
 * @Date 2020/6/27 15:09
 * @CONTACT 317758022@qq.com
 * @DESC
 */
@RestController
@RequestMapping("/v1/banner")
public class BannerController {

    @Autowired
    private IBannerService bannerService;

    @RequestMapping("testBanner")
    public String test(){
        bannerService.test();
        throw new ForbiddenException(9999);
//        return "hello banner";
    }

}
