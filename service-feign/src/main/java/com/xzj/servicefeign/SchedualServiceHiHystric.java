package com.xzj.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 16:25 2018/11/1
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "haha"+"熔断了";
    }
}
