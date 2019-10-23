package com.base.vistter.website.service;


import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.service.BaseService;

import java.util.List;

public interface MerchantService extends BaseService {

    List findList() throws PlatformException;

}
