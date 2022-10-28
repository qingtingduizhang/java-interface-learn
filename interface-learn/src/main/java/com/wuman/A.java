package com.wuman;

/**
 * 抽象类可以实现接口
 * @author lmf
 * @version 1.0
 * @date 2022/10/28 14:01
 */
public  class A implements B {


    @Override
    public void a() {
        System.out.println("a = " + a);
    }

    @Override
    public void b() {

    }

    public static void main(String[] args) {
        A a = new A();
        a.a();
    }
}
