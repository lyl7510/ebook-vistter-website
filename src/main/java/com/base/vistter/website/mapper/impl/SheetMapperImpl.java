package com.base.vistter.website.mapper.impl;

import com.base.vistter.common.mapper.impl.BaseMapperImpl;
import com.base.vistter.website.mapper.SheetMapper;
import org.springframework.stereotype.Repository;

@Repository("sheetMapperImpl")
public class SheetMapperImpl extends BaseMapperImpl implements SheetMapper {

    @Override
    protected String getNameSpace() {
        return "Sheet";
    }
    
}
