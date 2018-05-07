package com.ranran.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ${DESCRIPTION}
 *
 * @author 曾睿
 * @create 2018-04-21 12:01
 **/
public class BaseController {

    /**
     * 页面跳转执行
     * @param viewPath
     * @return
     */
    @RequestMapping(value = "/toView.html")
    public String showView(@RequestParam String viewPath) {
        return viewPath+".html";
    }
}
