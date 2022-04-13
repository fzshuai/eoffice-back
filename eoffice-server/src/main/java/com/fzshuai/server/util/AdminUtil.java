package com.fzshuai.server.util;

import com.fzshuai.server.entity.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 操作员工具类
 *
 * @author fzshuai
 * @date 2022/03/20 15:11
 * @since 1.0
 */
public class AdminUtil {

    /**
     * 获取当前登录操作员
     *
     * @return
     */
    public static Admin getCurrentAdmin() {
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
