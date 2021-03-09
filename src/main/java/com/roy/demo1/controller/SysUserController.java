package com.roy.demo1.controller;

import com.roy.demo1.beans.po.SysUser;
import com.roy.demo1.beans.vo.ResultVO;
import com.roy.demo1.service.SysUserService;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.resources.MsgAppletViewer;
import sun.awt.SunHints;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/sysuser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @GetMapping(value = "/getList")
    public ResultVO getList(){
       return new ResultVO("2000","查询成功",sysUserService.getList());
    }

}
