apollo使用:
1、apollo安装教程(apollo-build-scripts项目下有启动文件demo.sh)
https://github.com/zhengchaobin/apollo.git和https://github.com/zhengchaobin/apollo-build-scripts.git
2、修改demo.sh的eureka地址和mysql账密后启动apollo(先启动eureka注册中心)
3、apollo应用客户端增加app.id配置映射apollo应用
4、增加apollo的maven依赖包，然后在配置类上增加@EnableApolloConfig注解，done

