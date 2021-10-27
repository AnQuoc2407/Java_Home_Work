package com.company;

import java.io.IOException;
import java.io.PrintWriter;
interface Ac
{
    void show();
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Ac obj =() -> System.out.println("Im the best");

        obj.show();
    }
    public interface MyInterface{
        public void excute();

    }


}
