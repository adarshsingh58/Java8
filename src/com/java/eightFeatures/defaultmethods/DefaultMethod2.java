package com.java.eightFeatures.defaultmethods;

@FunctionalInterface
public interface DefaultMethod2 {

    public void printHello();

    default String returnSomething() {
        return "something";
    }

}
