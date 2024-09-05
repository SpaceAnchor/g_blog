package com.ld.poetry.dao;

import com.ld.poetry.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 文章评论表 Mapper 接口
 * </p>
 *
 * @author sara
 * @since 2021-08-13
 */
@Repository
public interface CommentMapper extends BaseMapper<Comment> {

}
