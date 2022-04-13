package com.fzshuai.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fzshuai.server.entity.MenuRole;
import com.fzshuai.server.entity.RespBean;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author fzshuai
 * @since 2022/03/14 13:43
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     *
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
