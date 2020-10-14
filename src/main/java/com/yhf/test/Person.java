package com.yhf.test;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

//@Getter
//@Setter
@Data
//@Accessors(fluent = true)
//@Accessors(chain = true)
@Accessors(prefix = "p")
public class Person {

    private String name;

    //@Setter
    private int age;

    private String sex;

    private String pId;
}
