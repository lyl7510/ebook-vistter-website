package com.base.vistter.website.service.impl;

import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;
import com.base.vistter.common.service.impl.BaseServiceImpl;
import com.base.vistter.website.mapper.SheetTypeMapper;
import com.base.vistter.website.service.SheetTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("sheetTypeServiceImpl")
@Transactional
public class SheetTypeServiceImpl extends BaseServiceImpl implements SheetTypeService {

    @Resource(name = "sheetTypeMapperImpl")
    private SheetTypeMapper sheetTypeMapper;

    @Override
    protected BaseMapper getBaseMapper() {
        return this.sheetTypeMapper;
    }

    @Transactional(readOnly = true)
    public List<Map> findList(Map paramMap) throws PlatformException {
        return sheetTypeMapper.findList(paramMap);
    }

}
