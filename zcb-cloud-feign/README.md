Feign使用:
1、增加Feign接口，并增加@FeignClient注解，value值指向对应项目名，即服务提供者application.name
2、对应feign接口方法参数名需要增加@RequestParam注解，方法@RequestMapping注解value指向对应提供者服务接口地址
3、消费端启动类增加@EnableFeignClients和@EnableDiscoveryClient注解
4、Feign融合了Ribbon技术，故自带负载均衡配置项

Hystrix使用:
1、增加Hystrix实现类继承Feign接口，并加@Component注解
2、增加Feign接口@FeignClient注解增加fallback属性
3、增加配置feign.hystrix.enabled=true