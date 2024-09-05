package com.ld.poetry.dao;

import com.ld.poetry.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author sara
 * @since 2021-08-12
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
