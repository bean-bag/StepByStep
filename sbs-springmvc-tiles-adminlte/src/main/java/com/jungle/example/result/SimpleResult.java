/**
 * Project Name:adminlte
 * File Name:SimpleResult.java
 * Package Name:cn.bdqn.lesson.result
 * Date:2017年8月22日下午7:32:03
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package com.jungle.example.result;
/**
 * Description:   <br/>
 * Date:     2017年8月22日 下午7:32:03 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
public class SimpleResult {
    
    private String message;
    private boolean success;
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    
}

