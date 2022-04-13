package com.fzshuai.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzshuai.server.mapper.NationMapper;
import com.fzshuai.server.entity.Nation;
import com.fzshuai.server.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
