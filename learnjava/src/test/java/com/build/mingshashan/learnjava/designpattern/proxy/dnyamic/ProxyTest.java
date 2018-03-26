package com.build.mingshashan.learnjava.designpattern.proxy.dnyamic;

import com.build.mingshashan.learnjava.designpattern.proxy.dynamic.MyInvocationHandler;
import com.build.mingshashan.learnjava.designpattern.proxy.dynamic.UserService;
import com.build.mingshashan.learnjava.designpattern.proxy.dynamic.UserServiceImpl;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;

public class ProxyTest {

    @Test
    public void test() {

        UserService userService = new UserServiceImpl();

        MyInvocationHandler handler = new MyInvocationHandler(userService);

        UserService proxy = (UserService)handler.getProxy();

        proxy.add();

    }
}
