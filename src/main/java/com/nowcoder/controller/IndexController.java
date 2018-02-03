package com.nowcoder.controller;

public class IndexController {
    public String index(){
        return "Hello NowCoder";
    }
    public String profile(String groupId, int userId, int type,String key){
        return String.format("{%s},{%d},{%d},{%s}",groupId,userId,type,key);
    }
}
