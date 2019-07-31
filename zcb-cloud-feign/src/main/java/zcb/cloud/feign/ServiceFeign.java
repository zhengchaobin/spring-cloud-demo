package zcb.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhengchaobin
 * Date: 2019/7/30
 * Description:
 **/
@FeignClient(value = "zcb-cloud-provider")
public interface ServiceFeign {

    /**
     * feign测试
     * @param name 姓名
     * @return
     */
    @RequestMapping("/test/sayHello")
    String hello(@RequestParam("name") String name);

}
