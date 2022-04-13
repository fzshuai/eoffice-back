package com.fzshuai.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzshuai.server.mapper.PositionMapper;
import com.fzshuai.server.entity.Position;
import com.fzshuai.server.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
