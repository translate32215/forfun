package lf;

import android.support.v4.media.a;
import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl */
public final class i0 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f21344a = new i0();

    public Class<? extends Annotation> annotationType() {
        return h0.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof h0;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder a10 = a.a("@");
        a10.append(h0.class.getName());
        a10.append("()");
        return a10.toString();
    }
}
