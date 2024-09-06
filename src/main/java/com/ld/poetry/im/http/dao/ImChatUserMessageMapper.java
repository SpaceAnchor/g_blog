package com.ld.poetry.im.http.dao;

import com.ld.poetry.im.http.entity.ImChatUserMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 单聊记录 Mapper 接口
 * </p>
 *
 * @author sara
 * @since 2021-12-02
 */
@Repository
public interface ImChatUserMessageMapper extends BaseMapper<ImChatUserMessage> {

}
