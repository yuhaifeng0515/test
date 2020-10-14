package com.yhf.test.function;

@FunctionalInterface
public interface IConvert<F, T> {
    T convert(F form);
}
