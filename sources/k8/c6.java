package k8;

import com.startapp.b4;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k8.b6;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class c6<T extends b6<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f20094d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final i8<T, Object> f20095a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20096b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f20097c;

    static {
        new c6(true);
    }

    public c6() {
        this.f20095a = new a8(16);
    }

    public static final void b(T t10, Object obj) {
        boolean z10;
        w8 d10 = t10.d();
        Charset charset = r6.f20450a;
        obj.getClass();
        w8 w8Var = w8.DOUBLE;
        x8 x8Var = x8.INT;
        switch (d10.f20531a.ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                break;
            case 1:
                z10 = obj instanceof Long;
                break;
            case 2:
                z10 = obj instanceof Float;
                break;
            case 3:
                z10 = obj instanceof Double;
                break;
            case 4:
                z10 = obj instanceof Boolean;
                break;
            case 5:
                z10 = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof p5) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case b4.f10106f:
                if (obj instanceof m7) {
                    return;
                }
                break;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t10.zza()), t10.d().f20531a, obj.getClass().getName()}));
    }

    public final void a(T t10, Object obj) {
        if (!t10.e()) {
            b(t10, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b(t10, arrayList.get(i10));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f20095a.put(t10, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        Iterable<Map.Entry> iterable;
        c6 c6Var = new c6();
        for (int i10 = 0; i10 < this.f20095a.b(); i10++) {
            Map.Entry<T, Object> d10 = this.f20095a.d(i10);
            c6Var.a((b6) d10.getKey(), d10.getValue());
        }
        i8<T, Object> i8Var = this.f20095a;
        if (i8Var.f20263c.isEmpty()) {
            iterable = d8.f20129b;
        } else {
            iterable = i8Var.f20263c.entrySet();
        }
        for (Map.Entry entry : iterable) {
            c6Var.a((b6) entry.getKey(), entry.getValue());
        }
        c6Var.f20097c = this.f20097c;
        return c6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        return this.f20095a.equals(((c6) obj).f20095a);
    }

    public final int hashCode() {
        return this.f20095a.hashCode();
    }

    public c6(boolean z10) {
        a8 a8Var = new a8(0);
        this.f20095a = a8Var;
        if (!this.f20096b) {
            a8Var.a();
            this.f20096b = true;
        }
        if (!this.f20096b) {
            a8Var.a();
            this.f20096b = true;
        }
    }
}
