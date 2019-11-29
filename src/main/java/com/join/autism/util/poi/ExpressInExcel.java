package com.join.autism.util.poi;

import java.lang.annotation.*;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ExpressInExcel {
    public String value();
}
