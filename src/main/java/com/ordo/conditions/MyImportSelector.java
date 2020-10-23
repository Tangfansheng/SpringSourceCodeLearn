package com.ordo.conditions;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.ordo.entity.colors.Blue", "com.ordo.entity.colors.Red"};
    }
}
