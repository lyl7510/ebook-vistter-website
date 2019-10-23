package com.base.vistter.website.controller;

import com.base.vistter.common.bean.Result;
import com.base.vistter.website.service.BookService;
import org.apache.commons.collections.MapUtils;
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
@RequestMapping("/book")
public class BookController {

    private static final Logger logger = LogManager.getLogger(BookController.class);

    @Resource(name = "bookServiceImpl")
    private BookService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result list(@RequestBody Map paramMap) {
        try {
            List list = bookService.findList(paramMap);
            return Result.generJson(list);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/load", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result load(@RequestBody Map paramMap) {
        try {
            Map resultMap = bookService.load(MapUtils.getString(paramMap, "ID"));
            return Result.generJson(resultMap);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

}
