package com.roy.demo1.dao;

import com.roy.demo1.beans.po.SysUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("SysUserDao")
public interface SysUserDAO  {
    @Select("SELECT * FROM SYSUSER")
    public List<SysUser> getList();
}
