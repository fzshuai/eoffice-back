package com.fzshuai.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzshuai.server.mapper.SalaryMapper;
import com.fzshuai.server.entity.Salary;
import com.fzshuai.server.service.ISalaryService;
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
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
