/**
 * Project Name:adminlte
 * File Name:Record.java
 * Package Name:cn.bdqn.lesson.model
 * Date:2017年8月21日下午3:47:38
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package com.jungle.example.model;
/**
 * Description:   <br/>
 * Date:     2017年8月21日 下午3:47:38 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
public class Record {
    
    private String engine;
    private String browser;
    private String platform;
    private String engineVersion;
    private String grade;
    
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getEngineVersion() {
        return engineVersion;
    }
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
}

