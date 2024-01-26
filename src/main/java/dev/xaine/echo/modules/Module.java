package dev.xaine.echo.modules;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Module {

    String name();
    String displayName() default "";
    String description() default "";
    ModuleCategory category() default ModuleCategory.HIDDEN;

    int key() default 0;

}