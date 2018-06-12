package JavaConcepts.PassByValue;

import java.util.ArrayList;

public class PassArraysToFunctions {


    public static void func(int[] b) {
        b[1] = 44;
    }
    public static void func2(int c){
        c = 33;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(22);
        func3(a1);
        int[] a = {1,2,3};// a = {1,2,3}
        int b = 22;//b=22
        func2(b);//b =22
        func(a);//a = {1,44,3}
    }

    private static void func3(ArrayList<Integer> a1) {
        a1.set(1,33);
    }
}
