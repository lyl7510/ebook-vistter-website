package com.base.vistter.website.mapper.impl;

import com.base.vistter.common.mapper.impl.BaseMapperImpl;
import com.base.vistter.website.mapper.MerchantMapper;
import org.springframework.stereotype.Repository;

@Repository("merchantMapperImpl")
public class MerchantMapperImpl extends BaseMapperImpl implements MerchantMapper {

    @Override
    protected String getNameSpace() {
        return "Merchant";
    }
    
}
