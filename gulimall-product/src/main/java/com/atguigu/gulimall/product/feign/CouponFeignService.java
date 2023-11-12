package com.atguigu.gulimall.product.feign;

import com.atguigu.common.to.SkuReductionTo;
import com.atguigu.common.to.SpuBoundTo;
import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     * 1.CouponFeignService.saveSpuBounds(spuBoundTo);
     *   1) @RequestBody将这个对象转json
     *   2) 找到gulimall-coupon服务， 给/coupon/spubounds/save发送请求。将上一步对象转的json放在请求位置， 发送请求。
     *   3）对方服务收到请求体里有json数据（@RequestBody SpuBoundsEntity spuBounds）将请求体的json转为SpuBoundsEntity;
     *
     *  *只有json数据模型是兼容的。双方服务无需使用同一个to*
     *
     * @param spuBoundTo
     * @return
     */
    @RequestMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody  SpuBoundTo spuBoundTo);

    @RequestMapping("/coupon/skufullreduction/saveinfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
