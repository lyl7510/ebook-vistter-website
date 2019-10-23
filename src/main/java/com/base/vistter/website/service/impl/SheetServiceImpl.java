package com.base.vistter.website.service.impl;

import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;
import com.base.vistter.common.service.impl.BaseServiceImpl;
import com.base.vistter.website.mapper.SheetMapper;
import com.base.vistter.website.service.SheetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("sheetServiceImpl")
@Transactional
public class SheetServiceImpl extends BaseServiceImpl implements SheetService {

    @Resource(name = "sheetMapperImpl")
    private SheetMapper sheetMapper;

    @Override
    protected BaseMapper getBaseMapper() {
        return this.sheetMapper;
    }

    @Transactional(readOnly = true)
    public List findList(Map paramMap) throws PlatformException {
        return sheetMapper.findList(paramMap);
    }

}
