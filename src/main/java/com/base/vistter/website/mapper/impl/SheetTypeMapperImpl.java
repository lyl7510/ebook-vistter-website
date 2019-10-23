package com.base.vistter.website.mapper.impl;

import com.base.vistter.common.mapper.impl.BaseMapperImpl;
import com.base.vistter.website.mapper.SheetTypeMapper;
import org.springframework.stereotype.Repository;

@Repository("sheetTypeMapperImpl")
public class SheetTypeMapperImpl extends BaseMapperImpl implements SheetTypeMapper {

    @Override
    protected String getNameSpace() {
        return "SheetType";
    }
    
}
