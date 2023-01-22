package com.alpkor.aop.interceptor;

import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {
    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("Ilk hali : "+ context.getMethod());
        boolean isLogin = false; // yol kesici
        Object isContinue = null; // eger yol kesilmezse devam edecegim
        if(isLogin){
            System.out.println("!! Önce sisteme giris yapsin");
            return null;
        }else{
            try{
                isContinue=context.proceed();
                System.out.println("Sonraki hali " + isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }
    }
}
