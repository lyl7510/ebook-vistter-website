package com.base.vistter.website.service;

import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.service.BaseService;

import java.util.List;
import java.util.Map;

public interface BookService extends BaseService {

    List findList(Map paramMap) throws PlatformException;

}
