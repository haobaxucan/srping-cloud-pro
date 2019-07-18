package com.ecpss.service;

import com.ecpss.service.impl.DemoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by xc on 2019/7/17.
 */
@FeignClient(value = "FEIGN-PROVIDER",fallback =DemoServiceFallback.class )
public interface FeignTicketSerivceDemo extends FeignTicketSerivce{
    /**
     *
     这里实现服务降级
    备注：Hystrix服务降级，其实就是线程池中单个线程障处理，防止单个线程请求时间太长，导致资源长期被占有而得不到释放，从而导致线程池被快速占用完，导致服务崩溃。
     Hystrix能解决如下问题：
     1.请求超时降级，线程资源不足降级，降级之后可以返回自定义数据
     2.线程池隔离降级，分布式服务可以针对不同的服务使用不同的线程池，从而互不影响
     3.自动触发降级与恢复
     4.实现请求缓存和请求合并
     */
}
