package j8;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import oa.d;
import oa.e;
import oa.f;
import oa.g;
import v6.q;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class c implements f {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f19643f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final d f19644g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f19645h;

    /* renamed from: i  reason: collision with root package name */
    public static final e<Map.Entry<Object, Object>> f19646i = b.f19642a;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f19647a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, e<?>> f19648b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, g<?>> f19649c;

    /* renamed from: d  reason: collision with root package name */
    public final e<Object> f19650d;

    /* renamed from: e  reason: collision with root package name */
    public final g f19651e = new g(this);

    static {
        q qVar = new q(1, (q.e) null);
        qVar.f26491b = 1;
        u g10 = qVar.g();
        HashMap hashMap = new HashMap();
        hashMap.put(g10.annotationType(), g10);
        f19644g = new d("key", Collections.unmodifiableMap(new HashMap(hashMap)), (d.a) null);
        q qVar2 = new q(1, (q.e) null);
        qVar2.f26491b = 2;
        u g11 = qVar2.g();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g11.annotationType(), g11);
        f19645h = new d("value", Collections.unmodifiableMap(new HashMap(hashMap2)), (d.a) null);
    }

    public c(OutputStream outputStream, Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar) {
        this.f19647a = outputStream;
        this.f19648b = map;
        this.f19649c = map2;
        this.f19650d = eVar;
    }

    public static ByteBuffer h(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static int i(d dVar) {
        u uVar = (u) ((Annotation) dVar.f23655b.get(u.class));
        if (uVar != null) {
            return uVar.f19676a;
        }
        throw new oa.c("Field has no @Protobuf config");
    }

    public static u j(d dVar) {
        u uVar = (u) ((Annotation) dVar.f23655b.get(u.class));
        if (uVar != null) {
            return uVar;
        }
        throw new oa.c("Field has no @Protobuf config");
    }

    public final /* bridge */ /* synthetic */ f a(d dVar, int i10) throws IOException {
        d(dVar, i10, true);
        return this;
    }

    public final /* bridge */ /* synthetic */ f b(d dVar, long j10) throws IOException {
        f(dVar, j10, true);
        return this;
    }

    public final f c(d dVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            k((i(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f19643f);
            k(bytes.length);
            this.f19647a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object c10 : (Collection) obj) {
                c(dVar, c10, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry g10 : ((Map) obj).entrySet()) {
                g(f19646i, dVar, g10, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z10 || doubleValue != 0.0d) {
                k((i(dVar) << 3) | 1);
                this.f19647a.write(h(8).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                k((i(dVar) << 3) | 5);
                this.f19647a.write(h(4).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            f(dVar, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            d(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            k((i(dVar) << 3) | 2);
            k(bArr.length);
            this.f19647a.write(bArr);
            return this;
        } else {
            e eVar = this.f19648b.get(obj.getClass());
            if (eVar != null) {
                g(eVar, dVar, obj, z10);
                return this;
            }
            g gVar = this.f19649c.get(obj.getClass());
            if (gVar != null) {
                g gVar2 = this.f19651e;
                gVar2.f19660a = false;
                gVar2.f19662c = dVar;
                gVar2.f19661b = z10;
                gVar.a(obj, gVar2);
                return this;
            } else if (obj instanceof w) {
                d(dVar, ((w) obj).a(), true);
                return this;
            } else if (obj instanceof Enum) {
                d(dVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                g(this.f19650d, dVar, obj, z10);
                return this;
            }
        }
    }

    public final c d(d dVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        u j10 = j(dVar);
        int ordinal = j10.f19677b.ordinal();
        if (ordinal == 0) {
            k(j10.f19676a << 3);
            k(i10);
        } else if (ordinal == 1) {
            k(j10.f19676a << 3);
            k((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            k((j10.f19676a << 3) | 5);
            this.f19647a.write(h(4).putInt(i10).array());
        }
        return this;
    }

    public final f e(d dVar, Object obj) throws IOException {
        c(dVar, obj, true);
        return this;
    }

    public final c f(d dVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        u j11 = j(dVar);
        int ordinal = j11.f19677b.ordinal();
        if (ordinal == 0) {
            k(j11.f19676a << 3);
            l(j10);
        } else if (ordinal == 1) {
            k(j11.f19676a << 3);
            l((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            k((j11.f19676a << 3) | 1);
            this.f19647a.write(h(8).putLong(j10).array());
        }
        return this;
    }

    public final <T> c g(e<T> eVar, d dVar, T t10, boolean z10) throws IOException {
        OutputStream outputStream;
        v vVar = new v();
        try {
            outputStream = this.f19647a;
            this.f19647a = vVar;
            eVar.a(t10, this);
            this.f19647a = outputStream;
            long j10 = vVar.f19678a;
            vVar.close();
            if (z10 && j10 == 0) {
                return this;
            }
            k((i(dVar) << 3) | 2);
            l(j10);
            eVar.a(t10, this);
            return this;
        } catch (Throwable th) {
            try {
                vVar.close();
            } catch (Throwable th2) {
                t.f19675a.a(th, th2);
            }
            throw th;
        }
    }

    public final void k(int i10) throws IOException {
        while (((long) (i10 & -128)) != 0) {
            this.f19647a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f19647a.write(i10 & 127);
    }

    public final void l(long j10) throws IOException {
        while ((-128 & j10) != 0) {
            this.f19647a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f19647a.write(((int) j10) & 127);
    }
}
