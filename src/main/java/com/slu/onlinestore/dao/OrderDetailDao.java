package com.slu.onlinestore.dao;

import com.slu.onlinestore.entity.OrderDetail;
import com.slu.onlinestore.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);
}
