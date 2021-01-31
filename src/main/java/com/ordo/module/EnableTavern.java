package com.ordo.module;

import com.ordo.conditions.MyImportSelector;
import com.ordo.entity.Boss;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, MyImportSelector.class})
public @interface EnableTavern {
}
