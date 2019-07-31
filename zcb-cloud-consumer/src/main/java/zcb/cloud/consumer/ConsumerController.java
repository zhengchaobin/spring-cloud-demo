package zcb.cloud.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zcb.cloud.feign.ServiceFeign;

/**
 * @author zhengchaobin
 * Date: 2019/7/30
 * Description:
 **/
@RestController
public class ConsumerController {


    @Autowired
    ServiceFeign serviceFeign;

    @RequestMapping("/consumer")
    public void consumerTest(String name){
        System.out.println("consumer name:" + name);
        String hello = serviceFeign.hello(name);
        System.out.println("consumer result:" + hello);
    }


}
