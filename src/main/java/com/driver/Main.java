package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("praveen");
        System.out.println(obj.getName());
    }
}
//'name' has private access in 'com.driver.RWOnly':7
//Cannot resolve symbol 'name':8