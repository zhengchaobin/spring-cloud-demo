package zcb.cloud.hystrix;

import org.springframework.stereotype.Component;
import zcb.cloud.feign.ServiceFeign;

/**
 * @author zhengchaobin
 * Date: 2019/7/31
 * Description:
 **/
@Component
public class ServiceFeignHystrix implements ServiceFeign {

    /**
     * feign测试
     *
     * @param name 姓名
     * @return
     */
    @Override
    public String hello(String name) {
        return "系统异常";
    }
}
