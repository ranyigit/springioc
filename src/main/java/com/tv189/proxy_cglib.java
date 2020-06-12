package com.tv189;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class proxy_cglib {
    public static void main(String[] args) {

        final Helloworld helloworld = new Helloworld();

        /**
         * 基于接口的动态代理
         */
//        Hello proxyHello = (Hello) Proxy.newProxyInstance(helloworld.getClass().getClassLoader(), helloworld.getClass().getInterfaces(), new InvocationHandler() {
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return method.invoke(helloworld,args);
//            }
//        });
//        proxyHello.sayHello();

        /**
         * 基于普通子类的动态代理
         * 第三方jar包
         * cglib
         */
        Helloworld cgdlibHello = (Helloworld) Enhancer.create(helloworld.getClass(), new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                return method.invoke(helloworld, objects);
            }
        });
        cgdlibHello.sayHello();
    }
}

interface Hello {
    public void sayHello();
}
class Helloworld /*implements Hello*/ {
    public void sayHello() {
        System.out.println("hello world");
    }
}