package n7;

import android.annotation.TargetApi;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z7.b;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final i f22377a;

    /* renamed from: b  reason: collision with root package name */
    public final b f22378b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22379c;

    /* renamed from: d  reason: collision with root package name */
    public long f22380d;

    /* renamed from: e  reason: collision with root package name */
    public long f22381e;

    /* renamed from: f  reason: collision with root package name */
    public long f22382f;

    /* renamed from: g  reason: collision with root package name */
    public long f22383g;

    /* renamed from: h  reason: collision with root package name */
    public long f22384h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22385i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f22386j;

    /* renamed from: k  reason: collision with root package name */
    public final List f22387k;

    public o(o oVar) {
        this.f22377a = oVar.f22377a;
        this.f22378b = oVar.f22378b;
        this.f22380d = oVar.f22380d;
        this.f22381e = oVar.f22381e;
        this.f22382f = oVar.f22382f;
        this.f22383g = oVar.f22383g;
        this.f22384h = oVar.f22384h;
        this.f22387k = new ArrayList(oVar.f22387k);
        this.f22386j = new HashMap(oVar.f22386j.size());
        for (Map.Entry entry : oVar.f22386j.entrySet()) {
            q c10 = c((Class) entry.getKey());
            ((q) entry.getValue()).zzc(c10);
            this.f22386j.put((Class) entry.getKey(), c10);
        }
    }

    @TargetApi(19)
    public static q c(Class cls) {
        try {
            return (q) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e10) {
            if (e10 instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e10);
            } else if (e10 instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e10);
            } else if (Build.VERSION.SDK_INT < 19 || !(e10 instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e10);
            } else {
                throw new IllegalArgumentException("Linkage exception", e10);
            }
        }
    }

    public final q a(Class cls) {
        q qVar = (q) this.f22386j.get(cls);
        if (qVar != null) {
            return qVar;
        }
        q c10 = c(cls);
        this.f22386j.put(cls, c10);
        return c10;
    }

    public final void b(q qVar) {
        if (qVar != null) {
            Class<?> cls = qVar.getClass();
            if (cls.getSuperclass() == q.class) {
                qVar.zzc(a(cls));
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException("null reference");
    }

    public o(i iVar, b bVar) {
        if (bVar != null) {
            this.f22377a = iVar;
            this.f22378b = bVar;
            this.f22383g = 1800000;
            this.f22384h = 3024000000L;
            this.f22386j = new HashMap();
            this.f22387k = new ArrayList();
            return;
        }
        throw new NullPointerException("null reference");
    }
}
