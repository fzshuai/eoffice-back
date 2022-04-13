package com.fzshuai.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzshuai.server.entity.Menu;
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
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 通过用户id查询菜单列表
     *
     * @return
     */
    List<Menu> getMenusByAdminId(Integer id);

    /**
     * 根据角色获取菜单列表
     *
     * @return
     */
    List<Menu> getMenusWithRole();

    /**
     * 查询所有菜单
     *
     * @return
     */
    List<Menu> getAllMenus();
}
