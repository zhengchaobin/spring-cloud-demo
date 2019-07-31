package zcb.cloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengchaobin
 * Date: 2019/7/30
 * Description:
 **/
@RestController
@RequestMapping("test")
public class ProviderController {


    @RequestMapping("/sayHello")
    public String hello(String name){
        System.out.println("provider:" + name);
        return "hello" + name;
    }


}
