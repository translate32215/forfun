package qa;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import oa.c;
import oa.d;
import oa.e;
import oa.g;
import oa.h;

/* compiled from: JsonValueObjectEncoderContext */
public final class f implements oa.f, h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f24254a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f24255b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, e<?>> f24256c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, g<?>> f24257d;

    /* renamed from: e  reason: collision with root package name */
    public final e<Object> f24258e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f24259f;

    public f(Writer writer, Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar, boolean z10) {
        this.f24255b = new JsonWriter(writer);
        this.f24256c = map;
        this.f24257d = map2;
        this.f24258e = eVar;
        this.f24259f = z10;
    }

    public oa.f a(d dVar, int i10) throws IOException {
        String str = dVar.f23654a;
        h();
        this.f24255b.name(str);
        h();
        this.f24255b.value((long) i10);
        return this;
    }

    public oa.f b(d dVar, long j10) throws IOException {
        String str = dVar.f23654a;
        h();
        this.f24255b.name(str);
        h();
        this.f24255b.value(j10);
        return this;
    }

    public h c(String str) throws IOException {
        h();
        this.f24255b.value(str);
        return this;
    }

    public h d(boolean z10) throws IOException {
        h();
        this.f24255b.value(z10);
        return this;
    }

    public oa.f e(d dVar, Object obj) throws IOException {
        return g(dVar.f23654a, obj);
    }

    public f f(Object obj, boolean z10) throws IOException {
        Class<?> cls;
        int i10 = 0;
        if (z10) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                if (obj == null) {
                    cls = null;
                } else {
                    cls = obj.getClass();
                }
                objArr[0] = cls;
                throw new c(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.f24255b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f24255b.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                h();
                this.f24255b.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            this.f24255b.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i10 < length) {
                    this.f24255b.value((long) iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    long j10 = jArr[i10];
                    h();
                    this.f24255b.value(j10);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f24255b.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f24255b.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number f10 : (Number[]) obj) {
                    f(f10, false);
                }
            } else {
                for (Object f11 : (Object[]) obj) {
                    f(f11, false);
                }
            }
            this.f24255b.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f24255b.beginArray();
            for (Object f12 : (Collection) obj) {
                f(f12, false);
            }
            this.f24255b.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f24255b.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    g((String) key, entry.getValue());
                } catch (ClassCastException e10) {
                    throw new c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                }
            }
            this.f24255b.endObject();
            return this;
        } else {
            e eVar = this.f24256c.get(obj.getClass());
            if (eVar != null) {
                if (!z10) {
                    this.f24255b.beginObject();
                }
                eVar.a(obj, this);
                if (!z10) {
                    this.f24255b.endObject();
                }
                return this;
            }
            g gVar = this.f24257d.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                this.f24255b.value(name);
                return this;
            } else {
                e<Object> eVar2 = this.f24258e;
                if (!z10) {
                    this.f24255b.beginObject();
                }
                eVar2.a(obj, this);
                if (!z10) {
                    this.f24255b.endObject();
                }
                return this;
            }
        }
    }

    public f g(String str, Object obj) throws IOException {
        if (!this.f24259f) {
            h();
            this.f24255b.name(str);
            if (obj != null) {
                return f(obj, false);
            }
            this.f24255b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            h();
            this.f24255b.name(str);
            return f(obj, false);
        }
    }

    public final void h() throws IOException {
        if (!this.f24254a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
