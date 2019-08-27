package com.gmail.gulyaev4420;

class Test {

    @TestAnnotation(a = 7, b = 11)
    public void test(int a, int b) {
      System.out.println("a = " + a);
      System.out.println("b = " + b);
    }
}