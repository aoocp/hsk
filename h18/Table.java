package com.huawei.classroom.student.h18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Table {
    String value();
}
