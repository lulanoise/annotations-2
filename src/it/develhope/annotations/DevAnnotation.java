package it.develhope.annotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DevAnnotation {
    String DevName();
    String DevSurname();
}
