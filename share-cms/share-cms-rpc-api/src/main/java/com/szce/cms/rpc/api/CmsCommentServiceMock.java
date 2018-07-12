package com.szce.cms.rpc.api;

import com.szce.common.base.BaseServiceMock;
import com.szce.cms.dao.mapper.CmsCommentMapper;
import com.szce.cms.dao.model.CmsComment;
import com.szce.cms.dao.model.CmsCommentExample;

/**
* 降级实现CmsCommentService接口
* Created by szce on 2017/4/5.
*/
public class CmsCommentServiceMock extends BaseServiceMock<CmsCommentMapper, CmsComment, CmsCommentExample> implements CmsCommentService {

}
