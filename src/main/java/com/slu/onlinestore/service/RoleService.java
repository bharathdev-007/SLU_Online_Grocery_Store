package com.slu.onlinestore.service;

import com.slu.onlinestore.dao.RoleDao;
import com.slu.onlinestore.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
