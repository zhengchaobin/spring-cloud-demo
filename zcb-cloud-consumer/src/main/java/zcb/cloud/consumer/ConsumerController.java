package zcb.cloud.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import zcb.cloud.feign.ServiceFeign;

/**
 * @author zhengchaobin
 * Date: 2019/7/30
 * Description:
 **/
@Controller
@RequestMapping("qr")
public class ConsumerController {


    @Autowired
    ServiceFeign serviceFeign;

    @RequestMapping("/consumer")
    public void consumerTest(String name) {
        System.out.println("consumer name:" + name);
        String hello = serviceFeign.hello(name);
        System.out.println("consumer result:" + hello);
    }


    @RequestMapping(value = {"{qrcodeSerial}", "{shopid}/{sid}/{qrcodeSerial:[a-zA-Z0-9\\\\.]+}"})
    public ModelAndView bsIndex(@PathVariable("shopid") String shopId, @PathVariable("qrcodeSerial") String qrcodeSerial) {
        if (qrcodeSerial.contains(".txt")) {
            return new ModelAndView("forward:/qr/qrcode_default" + "/" + shopId + "/" + qrcodeSerial);
        }
        return null;
    }


    @ResponseBody
    @RequestMapping(value = "/qrcode_default/{shopid}/{qrcodeSerial:[a-zA-Z0-9\\\\.]+}")
    public String defaultD(@PathVariable("shopid") Long shopId, @PathVariable("qrcodeSerial") String qrcodeSerial) {
        System.out.println(shopId + "," + qrcodeSerial);
        return shopId + "," + qrcodeSerial;
    }


}
