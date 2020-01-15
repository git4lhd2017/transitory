package com.transitory.reception.service.impl;

import com.transitory.reception.beans.Manager;
import com.transitory.reception.dao.UserMapper;
import com.transitory.reception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Manager> findAll() {
        return userMapper.findAll();
    }
}
