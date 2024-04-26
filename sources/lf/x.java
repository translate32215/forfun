package lf;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.annotation.Nullable;
import ke.c0;
import ke.r;
import ke.v;
import lf.a;

/* compiled from: ParameterHandler */
public abstract class x<T> {

    /* compiled from: ParameterHandler */
    public static final class a<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f21398a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21399b;

        /* renamed from: c  reason: collision with root package name */
        public final j<T, c0> f21400c;

        public a(Method method, int i10, j<T, c0> jVar) {
            this.f21398a = method;
            this.f21399b = i10;
            this.f21400c = jVar;
        }

        public void a(z zVar, @Nullable T t10) {
            if (t10 != null) {
                try {
                    zVar.f21447k = this.f21400c.a(t10);
                } catch (IOException e10) {
                    Method method = this.f21398a;
                    int i10 = this.f21399b;
                    throw j0.n(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            } else {
                throw j0.m(this.f21398a, this.f21399b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class b<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f21401a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21402b;

        public b(String str, j<T, String> jVar, boolean z10) {
            if (str != null) {
                this.f21401a = str;
                this.f21402b = z10;
                return;
            }
            throw new NullPointerException("name == null");
        }

        public void a(z zVar, @Nullable T t10) throws IOException {
            String obj;
            if (t10 != null && (obj = t10.toString()) != null) {
                zVar.a(this.f21401a, obj, this.f21402b);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class c<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f21403a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21404b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f21405c;

        public c(Method method, int i10, j<T, String> jVar, boolean z10) {
            this.f21403a = method;
            this.f21404b = i10;
            this.f21405c = z10;
        }

        public void a(z zVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.a(str, obj2, this.f21405c);
                            } else {
                                Method method = this.f21403a;
                                int i10 = this.f21404b;
                                throw j0.m(method, i10, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw j0.m(this.f21403a, this.f21404b, q.b.a("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw j0.m(this.f21403a, this.f21404b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw j0.m(this.f21403a, this.f21404b, "Field map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class d<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f21406a;

        public d(String str, j<T, String> jVar) {
            if (str != null) {
                this.f21406a = str;
                return;
            }
            throw new NullPointerException("name == null");
        }

        public void a(z zVar, @Nullable T t10) throws IOException {
            String obj;
            if (t10 != null && (obj = t10.toString()) != null) {
                zVar.b(this.f21406a, obj);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class e<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f21407a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21408b;

        public e(Method method, int i10, j<T, String> jVar) {
            this.f21407a = method;
            this.f21408b = i10;
        }

        public void a(z zVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            zVar.b(str, value.toString());
                        } else {
                            throw j0.m(this.f21407a, this.f21408b, q.b.a("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw j0.m(this.f21407a, this.f21408b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw j0.m(this.f21407a, this.f21408b, "Header map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class f extends x<r> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f21409a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21410b;

        public f(Method method, int i10) {
            this.f21409a = method;
            this.f21410b = i10;
        }

        public void a(z zVar, @Nullable Object obj) throws IOException {
            r rVar = (r) obj;
            if (rVar != null) {
                r.a aVar = zVar.f21442f;
                aVar.getClass();
                int g10 = rVar.g();
                for (int i10 = 0; i10 < g10; i10++) {
                    aVar.b(rVar.d(i10), rVar.h(i10));
                }
                return;
            }
            throw j0.m(this.f21409a, this.f21410b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class g<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f21411a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21412b;

        /* renamed from: c  reason: collision with root package name */
        public final r f21413c;

        /* renamed from: d  reason: collision with root package name */
        public final j<T, c0> f21414d;

        public g(Method method, int i10, r rVar, j<T, c0> jVar) {
            this.f21411a = method;
            this.f21412b = i10;
            this.f21413c = rVar;
            this.f21414d = jVar;
        }

        public void a(z zVar, @Nullable T t10) {
            if (t10 != null) {
                try {
                    zVar.c(this.f21413c, this.f21414d.a(t10));
                } catch (IOException e10) {
                    Method method = this.f21411a;
                    int i10 = this.f21412b;
                    throw j0.m(method, i10, "Unable to convert " + t10 + " to RequestBody", e10);
                }
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class h<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f21415a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21416b;

        /* renamed from: c  reason: collision with root package name */
        public final j<T, c0> f21417c;

        /* renamed from: d  reason: collision with root package name */
        public final String f21418d;

        public h(Method method, int i10, j<T, c0> jVar, String str) {
            this.f21415a = method;
            this.f21416b = i10;
            this.f21417c = jVar;
            this.f21418d = str;
        }

        public void a(z zVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            zVar.c(r.f("Content-Disposition", q.b.a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f21418d), this.f21417c.a(value));
                        } else {
                            throw j0.m(this.f21415a, this.f21416b, q.b.a("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw j0.m(this.f21415a, this.f21416b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw j0.m(this.f21415a, this.f21416b, "Part map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class i<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f21419a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21420b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21421c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f21422d;

        public i(Method method, int i10, String str, j<T, String> jVar, boolean z10) {
            this.f21419a = method;
            this.f21420b = i10;
            if (str != null) {
                this.f21421c = str;
                this.f21422d = z10;
                return;
            }
            throw new NullPointerException("name == null");
        }

        public void a(z zVar, @Nullable T t10) throws IOException {
            String str;
            int i10;
            int i11;
            z zVar2 = zVar;
            if (t10 != null) {
                String str2 = this.f21421c;
                String obj = t10.toString();
                boolean z10 = this.f21422d;
                if (zVar2.f21439c != null) {
                    int length = obj.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            str = obj;
                            break;
                        }
                        int codePointAt = obj.codePointAt(i12);
                        i10 = 47;
                        i11 = -1;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                            ve.f fVar = new ve.f();
                            fVar.x0(obj, 0, i12);
                            ve.f fVar2 = null;
                        } else {
                            i12 += Character.charCount(codePointAt);
                        }
                    }
                    ve.f fVar3 = new ve.f();
                    fVar3.x0(obj, 0, i12);
                    ve.f fVar22 = null;
                    while (i12 < length) {
                        int codePointAt2 = obj.codePointAt(i12);
                        if (!z10 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i11 || (!z10 && (codePointAt2 == i10 || codePointAt2 == 37))) {
                                if (fVar22 == null) {
                                    fVar22 = new ve.f();
                                }
                                fVar22.y0(codePointAt2);
                                while (!fVar22.B()) {
                                    byte readByte = fVar22.readByte() & 255;
                                    fVar3.q0(37);
                                    char[] cArr = z.f21435l;
                                    fVar3.q0(cArr[(readByte >> 4) & 15]);
                                    fVar3.q0(cArr[readByte & 15]);
                                }
                            } else {
                                fVar3.y0(codePointAt2);
                            }
                        }
                        i12 += Character.charCount(codePointAt2);
                        i10 = 47;
                        i11 = -1;
                    }
                    str = fVar3.g0();
                    String str3 = zVar2.f21439c;
                    String replace = str3.replace("{" + str2 + "}", str);
                    if (!z.f21436m.matcher(replace).matches()) {
                        zVar2.f21439c = replace;
                        return;
                    }
                    throw new IllegalArgumentException(j.f.a("@Path parameters shouldn't perform path traversal ('.' or '..'): ", obj));
                }
                throw new AssertionError();
            }
            throw j0.m(this.f21419a, this.f21420b, androidx.activity.e.a(android.support.v4.media.a.a("Path parameter \""), this.f21421c, "\" value must not be null."), new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class j<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f21423a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21424b;

        public j(String str, j<T, String> jVar, boolean z10) {
            if (str != null) {
                this.f21423a = str;
                this.f21424b = z10;
                return;
            }
            throw new NullPointerException("name == null");
        }

        public void a(z zVar, @Nullable T t10) throws IOException {
            String obj;
            if (t10 != null && (obj = t10.toString()) != null) {
                zVar.d(this.f21423a, obj, this.f21424b);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class k<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f21425a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21426b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f21427c;

        public k(Method method, int i10, j<T, String> jVar, boolean z10) {
            this.f21425a = method;
            this.f21426b = i10;
            this.f21427c = z10;
        }

        public void a(z zVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.d(str, obj2, this.f21427c);
                            } else {
                                Method method = this.f21425a;
                                int i10 = this.f21426b;
                                throw j0.m(method, i10, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw j0.m(this.f21425a, this.f21426b, q.b.a("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw j0.m(this.f21425a, this.f21426b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw j0.m(this.f21425a, this.f21426b, "Query map was null", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class l<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f21428a;

        public l(j<T, String> jVar, boolean z10) {
            this.f21428a = z10;
        }

        public void a(z zVar, @Nullable T t10) throws IOException {
            if (t10 != null) {
                zVar.d(t10.toString(), (String) null, this.f21428a);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class m extends x<v.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f21429a = new m();

        public void a(z zVar, @Nullable Object obj) throws IOException {
            v.b bVar = (v.b) obj;
            if (bVar != null) {
                zVar.f21445i.f20815c.add(bVar);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class n extends x<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f21430a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21431b;

        public n(Method method, int i10) {
            this.f21430a = method;
            this.f21431b = i10;
        }

        public void a(z zVar, @Nullable Object obj) {
            if (obj != null) {
                zVar.getClass();
                zVar.f21439c = obj.toString();
                return;
            }
            throw j0.m(this.f21430a, this.f21431b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class o<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f21432a;

        public o(Class<T> cls) {
            this.f21432a = cls;
        }

        public void a(z zVar, @Nullable T t10) {
            zVar.f21441e.d(this.f21432a, t10);
        }
    }

    public abstract void a(z zVar, @Nullable T t10) throws IOException;
}
