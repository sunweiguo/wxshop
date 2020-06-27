package com.swg.missyou.service.impl;

import com.swg.missyou.service.IBannerService;
import org.springframework.stereotype.Service;

/**
 * @Author swg.
 * @Date 2020/6/27 15:11
 * @CONTACT 317758022@qq.com
 * @DESC
 */
@Service
public class BannerServiceImpl implements IBannerService {
    @Override
    public void test() {
        System.out.println("service test");
    }
}
