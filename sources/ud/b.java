package ud;

import ae.c;
import java.io.Serializable;

/* compiled from: CallableReference */
public abstract class b implements ae.a, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public transient ae.a f26181a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f26182b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f26183c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26184d;

    /* renamed from: e  reason: collision with root package name */
    public final String f26185e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f26186f;

    /* compiled from: CallableReference */
    public static class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26187a = new a();
    }

    public b() {
        this.f26182b = a.f26187a;
        this.f26183c = null;
        this.f26184d = null;
        this.f26185e = null;
        this.f26186f = false;
    }

    public String a() {
        return this.f26184d;
    }

    public ae.a g() {
        ae.a aVar = this.f26181a;
        if (aVar != null) {
            return aVar;
        }
        ae.a i10 = i();
        this.f26181a = i10;
        return i10;
    }

    public abstract ae.a i();

    public c j() {
        Class cls = this.f26183c;
        if (cls == null) {
            return null;
        }
        if (this.f26186f) {
            return v.f26198a.a(cls, "");
        }
        return v.a(cls);
    }

    public ae.a k() {
        ae.a g10 = g();
        if (g10 != this) {
            return g10;
        }
        throw new sd.b();
    }

    public String l() {
        return this.f26185e;
    }

    public b(Object obj) {
        this.f26182b = obj;
        this.f26183c = null;
        this.f26184d = null;
        this.f26185e = null;
        this.f26186f = false;
    }

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f26182b = obj;
        this.f26183c = cls;
        this.f26184d = str;
        this.f26185e = str2;
        this.f26186f = z10;
    }
}
