package zcb.cloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zcb.cloud.provider.apollo.ApolloConfig;

import javax.annotation.Resource;

/**
 * @author zhengchaobin
 * Date: 2019/7/30
 * Description:
 **/
@RestController
@RequestMapping("test")
public class ProviderController {

    @Resource
    ApolloConfig apolloConfig;

    @RequestMapping("/sayHello")
    public String hello(String name){
        System.out.println("provider:" + name);
        return "hello" + name + apolloConfig.getApolloTest();
    }


}
