package test;

import com.java.eightFeatures.functionalInterface.FuncInt;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<String> list=Arrays.asList("hello","world");

        list.forEach(list::add);

    }
}
