package com.zcb.shiro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhengchaobin
 * Date: 2019/11/15
 * Description:
 **/
@RestController
public class AuthController {


    @RequestMapping("/login")
    public String login(String name, String password){
        return "success";
    }


}
