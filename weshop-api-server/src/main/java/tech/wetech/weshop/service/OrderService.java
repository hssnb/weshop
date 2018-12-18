package tech.wetech.weshop.service;

import tech.wetech.weshop.domain.Order;
import tech.wetech.weshop.vo.OrderVO;

/**
 * @author cjbi
 */
public interface OrderService extends IService<Order> {

    /**
     * 查询订单详情
     *
     * @param orderId
     * @return
     */
    OrderVO queryOrderDetail(Integer orderId);

}
