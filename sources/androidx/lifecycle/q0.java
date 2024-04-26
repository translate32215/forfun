package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModel */
public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2707a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Closeable> f2708b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f2709c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public <T> T c(String str) {
        T t10;
        Map<String, Object> map = this.f2707a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t10 = this.f2707a.get(str);
        }
        return t10;
    }

    public void d() {
    }

    public <T> T e(String str, T t10) {
        T t11;
        synchronized (this.f2707a) {
            t11 = this.f2707a.get(str);
            if (t11 == null) {
                this.f2707a.put(str, t10);
            }
        }
        if (t11 != null) {
            t10 = t11;
        }
        if (this.f2709c) {
            b(t10);
        }
        return t10;
    }
}
