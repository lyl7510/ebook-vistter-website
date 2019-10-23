package com.base.vistter.website.controller;

import com.base.vistter.common.bean.Result;
import com.base.vistter.website.service.MerchantService;
import org.apache.commons.collections.MapUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/merchant")
public class MerchantController {

    private static final Logger logger = LogManager.getLogger(MerchantController.class);

    @Resource(name = "merchantServiceImpl")
    private MerchantService merchantService;

    @RequestMapping(value = "/list", method = RequestMethod.POST , produces = "application/json;charset=UTF-8")
    public Result list(HttpServletRequest request){
        try {
            List list = merchantService.findList();
            return Result.generJson(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/load", method = RequestMethod.POST , produces = "application/json;charset=UTF-8")
    public Result load(HttpServletRequest request , @RequestBody Map paramMap){
        try {
            Map resultMap = merchantService.load(MapUtils.getString(paramMap ,"ID"));
            return Result.generJson(resultMap);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
