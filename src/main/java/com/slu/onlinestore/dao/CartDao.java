package com.slu.onlinestore.dao;

import com.slu.onlinestore.entity.Cart;
import com.slu.onlinestore.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer > {
    public List<Cart> findByUser(User user);
}
