package com.base.vistter.website.controller;

import com.base.vistter.common.bean.Result;
import com.base.vistter.website.service.SheetService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sheet")
public class SheetController {

    private static final Logger logger = LogManager.getLogger(SheetController.class);

    @Resource(name = "sheetServiceImpl")
    private SheetService sheetService;

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result list(@RequestBody Map paramMap) {
        try {
            List list = sheetService.findList(paramMap);
            return Result.generJson(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

}
