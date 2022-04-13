package com.fzshuai.server.controller;


import com.fzshuai.server.entity.Menu;
import com.fzshuai.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fzshuai
 * @since 2022/03/14 13:43
 */
@RestController
@RequestMapping("/system")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @ApiOperation("通过用户id查询菜单列表")
    @GetMapping("/menu")
    public List<Menu> getMenusByAdminId(){
        return menuService.getMenusByAdminId();
    }
}
