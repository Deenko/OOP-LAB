package OOP_WEEK_10.TASK1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
public @interface RequiresPermission {
    int value() default 1;
}
