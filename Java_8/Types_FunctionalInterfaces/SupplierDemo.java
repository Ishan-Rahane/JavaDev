package org.example.Types_FunctionalInterfaces;

import java.beans.PropertyEditorSupport;
import java.util.function.Supplier;

public class SupplierDemo {

//    Supplier<T> represents a supplier of results.
    public static void main(String[] args) {

        Supplier<String> supplier = ()->{
            return "Using supplier functional interface!";
        };
        System.out.println(supplier.get());

        Supplier<Integer> s = ()->{
            int a=10,b=5;
            return a*b;
        };
        System.out.println(s.get());
    }
}
