package c1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.a0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ld.o;
import ld.p;
import ud.k;

/* compiled from: FragmentStrictMode.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f4021a = null;

    /* renamed from: b  reason: collision with root package name */
    public static c f4022b = c.f4032d;

    /* compiled from: FragmentStrictMode.kt */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    public interface b {
        void a(h hVar);
    }

    /* compiled from: FragmentStrictMode.kt */
    public static final class c {

        /* renamed from: d  reason: collision with root package name */
        public static final c f4032d = new c(p.f21258a, (b) null, o.f21257a);

        /* renamed from: a  reason: collision with root package name */
        public final Set<a> f4033a;

        /* renamed from: b  reason: collision with root package name */
        public final b f4034b = null;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, Set<Class<? extends h>>> f4035c = new LinkedHashMap();

        public c(Set<? extends a> set, b bVar, Map<String, ? extends Set<Class<? extends h>>> map) {
            this.f4033a = set;
        }
    }

    public static final c a(androidx.fragment.app.p pVar) {
        while (pVar != null) {
            if (pVar.I()) {
                pVar.y();
            }
            pVar = pVar.E;
        }
        return f4022b;
    }

    public static final void b(c cVar, h hVar) {
        androidx.fragment.app.p pVar = hVar.f4037a;
        String name = pVar.getClass().getName();
        if (cVar.f4033a.contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, hVar);
        }
        if (cVar.f4034b != null) {
            e(pVar, new b(cVar, hVar));
        }
        if (cVar.f4033a.contains(a.PENALTY_DEATH)) {
            e(pVar, new c(name, hVar));
        }
    }

    public static final void c(h hVar) {
        if (a0.N(3)) {
            StringBuilder a10 = android.support.v4.media.a.a("StrictMode violation in ");
            a10.append(hVar.f4037a.getClass().getName());
            Log.d("FragmentManager", a10.toString(), hVar);
        }
    }

    public static final void d(androidx.fragment.app.p pVar, String str) {
        k.f(str, "previousFragmentId");
        a aVar = new a(pVar, str);
        c(aVar);
        c a10 = a(pVar);
        if (a10.f4033a.contains(a.DETECT_FRAGMENT_REUSE) && f(a10, pVar.getClass(), a.class)) {
            b(a10, aVar);
        }
    }

    public static final void e(androidx.fragment.app.p pVar, Runnable runnable) {
        if (pVar.I()) {
            Handler handler = pVar.y().f1598v.f1875c;
            k.e(handler, "fragment.parentFragmentManager.host.handler");
            if (k.a(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    public static final boolean f(c cVar, Class<? extends androidx.fragment.app.p> cls, Class<? extends h> cls2) {
        Set set = cVar.f4035c.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (k.a(cls2.getSuperclass(), h.class) || !set.contains(cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
