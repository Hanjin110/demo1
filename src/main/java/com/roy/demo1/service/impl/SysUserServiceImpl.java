package com.roy.demo1.service.impl;

import com.roy.demo1.beans.po.SysUser;
import com.roy.demo1.dao.SysUserDAO;
import com.roy.demo1.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDAO sysUserDAO;
    @Override
     public List<SysUser> getList(){
        return sysUserDAO.getList();
    }
}
