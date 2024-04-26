package androidx.lifecycle;

import androidx.lifecycle.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: OnLifecycleEvent */
public @interface d0 {
    o.b value();
}
