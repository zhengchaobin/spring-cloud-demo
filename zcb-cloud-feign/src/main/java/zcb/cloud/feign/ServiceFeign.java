package zcb.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import zcb.cloud.hystrix.ServiceFeignHystrix;

/**
 * @author zhengchaobin
 * Date: 2019/7/30
 * Description:
 **/
@FeignClient(value = "zcb-cloud-provider", fallback = ServiceFeignHystrix.class)
public interface ServiceFeign {

    /**
     * feign测试
     * @param name 姓名
     * @return
     */
    @RequestMapping("/test/sayHello")
    String hello(@RequestParam("name") String name);

}
