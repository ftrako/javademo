package com.example;

import com.example.jdbc.Jdbc;
import com.example.test.ITest;

public class DemoMain {
    public static void main(String args[]) {
        ITest test = new Jdbc();
        test.test();
    }
}
