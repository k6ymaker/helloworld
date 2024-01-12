package com.test.test;

public enum EnumBusinessFlag {
    //v20
    v20("v20"),
    //v10
    v10("v10"),
    //大客户
    lc("lc"),
    //新电话平台
    cc("cc"),
    //巧克力
    at("at"),
    //配置中心
    cfg("cfg"),
    //老电话平台
    occ("occ"),
    //巧连
    qflink("qflink"),
    mk("mk"),

    system("system");

    private String code;

    EnumBusinessFlag(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
