package com.smile.WriteTest.Class;

/**
 * @author Tom Smile
 * @version 1.0
 * @description: TODO
 * @date 2024/4/18 20:28
 */

//考察父类、子类构造器的调用顺序
//   父类构造-》子类构造
class C {
    C() {
        System.out.print("C");
    }
}

class A {
    C c = new C();

    A() {
        this("A");
        System.out.print("A");
    }

    A(String s) {
        System.out.print(s);
    }
}

class Test extends A {
    Test() {
        super("B");     //调用了父类的带参构造
        System.out.print("B");
    }

    public static void main(String[] args) {
        new Test();
    }
}