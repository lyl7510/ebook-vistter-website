package com.base.vistter.website.service.impl;

import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;
import com.base.vistter.common.service.impl.BaseServiceImpl;
import com.base.vistter.website.mapper.MerchantMapper;
import com.base.vistter.website.service.MerchantService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("merchantServiceImpl")
@Transactional
public class MerchantServiceImpl extends BaseServiceImpl implements MerchantService {

    @Resource(name = "merchantMapperImpl")
    private MerchantMapper merchantMapper;

    @Override
    protected BaseMapper getBaseMapper() {
        return this.merchantMapper;
    }

    @Transactional(readOnly = true)
    public List findList() throws PlatformException {
        return merchantMapper.findList();
    }
}
