package com.fzshuai.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzshuai.server.entity.MenuRole;
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
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 更新角色菜单
     *
     * @param rid
     * @param mids
     */
    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
