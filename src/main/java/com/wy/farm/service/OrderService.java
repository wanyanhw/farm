package com.wy.farm.service;

/**
 * @author wanyanhw
 * @date 2023/3/2 20:46
 */
public interface OrderService {

    void create();

    void listMyOrders(Integer userId);
}
