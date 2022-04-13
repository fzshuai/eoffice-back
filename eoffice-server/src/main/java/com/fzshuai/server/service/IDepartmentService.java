package com.fzshuai.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fzshuai.server.entity.Department;
import com.fzshuai.server.entity.RespBean;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author fzshuai
 * @since 2022/03/14 13:43
 */
public interface IDepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     *
     * @return
     */
    List<Department> getAllDepartments();

    /**
     * 添加部门
     *
     * @param dep
     * @return
     */
    RespBean addDep(Department dep);

    /**
     * 删除部门
     *
     * @param id
     * @return
     */
    RespBean deleteDep(Integer id);
}
