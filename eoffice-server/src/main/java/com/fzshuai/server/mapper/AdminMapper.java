package com.fzshuai.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzshuai.server.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fzshuai
 * @since 2022/03/14 13:43
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

    /**
     * 获取所有操作员
     * @param id
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);
}
