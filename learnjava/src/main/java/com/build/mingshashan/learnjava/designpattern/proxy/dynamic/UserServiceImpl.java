package com.build.mingshashan.learnjava.designpattern.proxy.dynamic;

public class UserServiceImpl implements UserService{
    /**
     * 目标方法
     */
    public void add() {
        System.out.println("--------------------add---------------");
    }
}
