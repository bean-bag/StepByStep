/**
 * Project Name:adminlte
 * File Name:IndexController.java
 * Package Name:cn.bdqn.lesson.controller
 * Date:2017年8月19日上午9:07:34
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package com.jungle.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:   <br/>
 * Date:     2017年8月19日 上午9:07:34 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(Model model){
        model.addAttribute("title", "首页");
        
        return "tiles.index";
    }
    
    @RequestMapping("datatable")
    public String datatable(Model model){
        model.addAttribute("title", "数据列表页");
        return "table.datatable";
    }
    
    @RequestMapping("datatable2")
    public String datatable2(Model model){
        model.addAttribute("title", "数据列表页");
        return "table.datatable2";
    }
}

