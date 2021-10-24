package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class SoDacBiet {
    public static void main(String[] args) {
        int number = 12341;
        if (duplicates(number))
            System.out.println("Là số đặc biệt");
        else System.out.println("Không phải số đặc biệt");

    }

    public static boolean duplicates(int n) {
        int tam = 0;
        boolean ketqua = true;
        Set<Integer> setA = new HashSet<Integer>();
        while (n > 0) {
            tam = n % 10;
            if (!setA.add(tam)) {
                ketqua = false;
                break;
            }
            n /= 10;
        }
        return ketqua;
    }
}