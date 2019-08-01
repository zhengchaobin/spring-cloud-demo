package zcb.cloud.provider.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhengchaobin
 * Date: 2019/8/1
 * Description:
 **/
@Configuration
@EnableApolloConfig
public class ApolloConfig {


    @Value("${apolloTest}")
    private String apolloTest;

    public String getApolloTest() {
        return apolloTest;
    }

    public void setApolloTest(String apolloTest) {
        this.apolloTest = apolloTest;
    }
}
