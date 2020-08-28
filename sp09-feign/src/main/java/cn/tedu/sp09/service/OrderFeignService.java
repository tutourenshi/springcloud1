package cn.tedu.sp09.service;

import cn.tedu.sp01.pojo.Order;
import cn.tedu.web.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="order-service",fallback = OrderFeignServiceFB.class)
public interface OrderFeignService {
    @GetMapping("/{orderId}")
    JsonResult<Order> getOrder(@PathVariable String orderId);

    @GetMapping("/")
    JsonResult addOrder();

}
