zuul使用:
1、启动类增加@EnableZuulProxy注解
2、增加zuul.routes配置,例如:/zcb-cloud-consumer/请求指向zcb-cloud-consumer服务
zuul:
  routes:
    consumer:
      path: /zcb-cloud-consumer/**
      serviceId: zcb-cloud-consumer
