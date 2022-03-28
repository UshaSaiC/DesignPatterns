package com.thoughtworks.singleton;

public class Main {
    public static void main(String[] args) {
        EagerInitializedSingleton s = EagerInitializedSingleton.getInstance();
        System.out.println(s.hashCode());

        LazyInitializedSingleton l = LazyInitializedSingleton.getInstance();
        System.out.println(l.hashCode());

    }
}
