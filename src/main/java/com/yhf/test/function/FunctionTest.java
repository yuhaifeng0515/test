package com.yhf.test.function;

public class FunctionTest {

    public static void main(String[] args) {
        // static methods
        IConvert<String, String> convert = Something::startsWith;
        String converted = convert.convert("123");
        System.out.println(converted);

        // object methods
        Something something = new Something();
        IConvert<String, String> converter = something::endWith;
        String converted2 = converter.convert("Java");
        System.out.println(converted2);

        // constructor methods
        IConvert<String, Something> converter2 = Something::new;
        Something something2 = converter2.convert("constructors");
    }
}
