package c.myannotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Todo {

    public enum Priority {

        LOW, NORMAL, HIGH
    };

    Priority priority() default Priority.NORMAL;

    String owner();

    String deadline();
}
