package com.fzshuai.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzshuai.generator.mapper.MenuMapper;
import com.fzshuai.generator.pojo.Menu;
import com.fzshuai.generator.service.MenuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fzshuai
 * @since 2022/03/14 13:43
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
