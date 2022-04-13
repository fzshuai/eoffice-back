package com.fzshuai.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzshuai.server.entity.AdminRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author fzshuai
 * @since 2022/03/14 13:43
 */
@Mapper
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    /**
     * 更新操作员角色
     *
     * @param adminId
     * @param rids
     * @return
     */
    Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
