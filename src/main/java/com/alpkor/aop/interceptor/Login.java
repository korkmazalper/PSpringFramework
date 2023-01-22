package com.alpkor.aop.interceptor;

import javax.interceptor.InterceptorBinding;

@InterceptorYolKesici
public class Login {
    public String isLoginMethod(String data){
        return "isLogin"+data;
    }
}
