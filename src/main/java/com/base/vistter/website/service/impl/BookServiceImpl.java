package com.base.vistter.website.service.impl;

import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;
import com.base.vistter.common.service.impl.BaseServiceImpl;
import com.base.vistter.website.mapper.BookMapper;
import com.base.vistter.website.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("bookServiceImpl")
@Transactional
public class BookServiceImpl extends BaseServiceImpl implements BookService {

    @Resource(name = "bookMapperImpl")
    private BookMapper bookMapper;

    @Override
    protected BaseMapper getBaseMapper() {
        return this.bookMapper;
    }

    @Transactional(readOnly = true)
    public List findList(Map paramMap) throws PlatformException {
        return bookMapper.findList(paramMap);
    }

}
