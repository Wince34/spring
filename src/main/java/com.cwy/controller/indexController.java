package com.cwy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description ：
 * @Created by 蔡文粤
 * @date 2018/4/10 19:33
 */

@Controller
@RequestMapping(value = "indexs")
public class indexController {

    @RequestMapping(value = "index.do")
    public String index(){
        return "index1";
    }
}
