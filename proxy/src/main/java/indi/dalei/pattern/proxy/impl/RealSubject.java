package indi.dalei.pattern.proxy.impl;

import indi.dalei.pattern.proxy.inter.Subject;

/**
 * Created by 刘大磊 on 2017/2/15 8:42.
 */
public class RealSubject implements Subject {
    public void doSomething() {
        System.out.println( "call doSomething()" );
    }
}
