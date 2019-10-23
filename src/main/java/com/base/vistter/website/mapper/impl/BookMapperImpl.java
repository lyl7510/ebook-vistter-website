package com.base.vistter.website.mapper.impl;

import com.base.vistter.common.mapper.impl.BaseMapperImpl;
import com.base.vistter.website.mapper.BookMapper;
import org.springframework.stereotype.Repository;

@Repository("bookMapperImpl")
public class BookMapperImpl extends BaseMapperImpl implements BookMapper {

    @Override
    protected String getNameSpace() {
        return "Book";
    }

}
