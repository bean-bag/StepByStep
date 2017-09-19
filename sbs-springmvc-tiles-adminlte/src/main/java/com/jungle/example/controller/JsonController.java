/**
 * Project Name:adminlte
 * File Name:JsonController.java
 * Package Name:cn.bdqn.lesson.controller
 * Date:2017年8月21日下午3:45:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package com.jungle.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jungle.example.datatable.DatatableResult;
import com.jungle.example.datatable.IsSearchCondition;
import com.jungle.example.datatable.SearchCondition;
import com.jungle.example.model.Record;

/**
 * Description:   <br/>
 * Date:     2017年8月21日 下午3:45:28 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
@RestController
public class JsonController {

    @RequestMapping(value="dt_list")
    public DatatableResult<Record> datatable(@IsSearchCondition SearchCondition searchCondition) {
        DatatableResult<Record> list = new DatatableResult<>();
        Record rec = new Record();
        rec.setBrowser("火狐");
        rec.setEngine("mozila");
        rec.setEngineVersion("5.1");
        rec.setGrade("3");
        rec.setPlatform("windows");
        list.addData(rec);
        
        return list;
    }
 
    @RequestMapping(value="dt_list2")
    public DatatableResult<Record> datatable2(SearchCondition searchCondition) {
        DatatableResult<Record> list = new DatatableResult<>();
        Record rec = new Record();
        rec.setBrowser("火狐");
        rec.setEngine("mozila");
        rec.setEngineVersion("5.1");
        rec.setGrade("3");
        rec.setPlatform("windows");
        list.addData(rec);
        
        return list;
    }
}
