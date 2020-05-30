package com.neverend.order.lb.impl;

import com.neverend.order.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class LoadBalancerImpl implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = (current >= 2147483647 ? 0 : current + 1);
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("******第几次访问，次数next：" + next);
        return next;
    }

    public ServiceInstance instance(List<ServiceInstance> instanceList) {
        int index = getAndIncrement() % instanceList.size();
        return instanceList.get(index);
    }
}
