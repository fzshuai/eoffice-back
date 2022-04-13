package com.fzshuai.server.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.fzshuai.server.entity.Employee;
import com.fzshuai.server.entity.RespBean;
import com.fzshuai.server.entity.RespPageBean;
import com.fzshuai.server.entity.Salary;
import com.fzshuai.server.service.IEmployeeService;
import com.fzshuai.server.service.ISalaryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 员工账套
 *
 * @author fzshuai
 * @date 2022/03/22 13:29
 * @since 1.0
 */
@RestController
@RequestMapping("/salary/sobcfg")
public class SalarySobCfgController {
    @Autowired
    private ISalaryService salaryService;
    @Autowired
    private IEmployeeService employeeService;

    @ApiOperation(value = "获取所有工资账套")
    @GetMapping("/salaries")
    public List<Salary> getAllSalaries(){
        return salaryService.list();
    }

    @ApiOperation(value = "获取所有员工账套")
    @GetMapping("/")
    public RespPageBean getEmployeeWithSalary(@RequestParam(defaultValue = "1") Integer currentPage,
                                              @RequestParam(defaultValue = "10") Integer size){
        return employeeService.getEmployeeWithSalary(currentPage,size);
    }

    @ApiOperation(value = "更新员工账套")
    @PutMapping("/")
    public RespBean updateEmployeeSalary(Integer eid, Integer sid){
        if (employeeService.update(new UpdateWrapper<Employee>().set("salaryId",sid).eq("id",eid))){
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }

}
