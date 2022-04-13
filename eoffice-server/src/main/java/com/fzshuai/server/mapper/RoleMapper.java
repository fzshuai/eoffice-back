package com.fzshuai.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzshuai.server.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author fzshuai
 * @since 2022/03/14 13:43
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    /**
     * 根据用户id查询角色列表
     *
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
