package com.neverend.payment.hystrix;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCircuitBreaker
public class PaymentHystrix {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrix.class, args);
    }

    /**
     * 服务监控配置，与服务容错本身无关，springcloud升级后的坑，
     * servletRegistrationBean 因为springboot的默认路径不是/hystrix.stream
     * 只要在自己的项目里边配置如下servler就可以另
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;

    }


}
