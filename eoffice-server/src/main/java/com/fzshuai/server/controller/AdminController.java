package com.fzshuai.server.controller;


import com.fzshuai.server.entity.Admin;
import com.fzshuai.server.entity.RespBean;
import com.fzshuai.server.entity.Role;
import com.fzshuai.server.service.IAdminService;
import com.fzshuai.server.service.IRoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author fzshuai
 * @since 2022/03/14 13:43
 */
@RestController
@RequestMapping("/system/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;
    @Autowired
    private IRoleService roleService;

    @ApiOperation(value = "获取所有操作员")
    @GetMapping("/")
    public List<Admin> getAllAdmins(String keywords) {
        return adminService.getAllAdmins(keywords);
    }

    @ApiOperation(value = "更新操作员")
    @PutMapping("/")
    public RespBean updateAdmin(@RequestBody Admin admin) {
        if (adminService.updateById(admin)) {
            return RespBean.success("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @ApiOperation(value = "删除操作员")
    @DeleteMapping("/{id}")
    public RespBean deleteAdmin(@PathVariable Integer id) {
        if (adminService.removeById(id)) {
            return RespBean.success("删除成功！");
        }
        return RespBean.error("删除失败!");
    }

    @ApiOperation(value = "获取所有角色")
    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleService.list();
    }


    @ApiOperation(value = "更新操作员角色")
    @PutMapping("/role")
    public RespBean updateAdminRole(Integer adminId, Integer[] rids) {
        return adminService.updateAdminRole(adminId, rids);
    }
}
