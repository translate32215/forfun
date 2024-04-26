package lf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import ke.r;
import ke.s;
import ke.u;
import retrofit2.ParameterHandler;

/* compiled from: RequestFactory */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Method f21287a;

    /* renamed from: b  reason: collision with root package name */
    public final s f21288b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21289c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f21290d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final r f21291e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final u f21292f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21293g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f21294h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f21295i;

    /* renamed from: j  reason: collision with root package name */
    public final ParameterHandler<?>[] f21296j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f21297k;

    /* compiled from: RequestFactory */
    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f21298x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f21299y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final f0 f21300a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f21301b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f21302c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[][] f21303d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f21304e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f21305f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f21306g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f21307h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f21308i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f21309j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f21310k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f21311l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f21312m;
        @Nullable

        /* renamed from: n  reason: collision with root package name */
        public String f21313n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f21314o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f21315p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f21316q;
        @Nullable

        /* renamed from: r  reason: collision with root package name */
        public String f21317r;
        @Nullable

        /* renamed from: s  reason: collision with root package name */
        public r f21318s;
        @Nullable

        /* renamed from: t  reason: collision with root package name */
        public u f21319t;
        @Nullable

        /* renamed from: u  reason: collision with root package name */
        public Set<String> f21320u;
        @Nullable

        /* renamed from: v  reason: collision with root package name */
        public ParameterHandler<?>[] f21321v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f21322w;

        public a(f0 f0Var, Method method) {
            this.f21300a = f0Var;
            this.f21301b = method;
            this.f21302c = method.getAnnotations();
            this.f21304e = method.getGenericParameterTypes();
            this.f21303d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f21313n;
            if (str3 == null) {
                this.f21313n = str;
                this.f21314o = z10;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f21298x.matcher(substring).find()) {
                            throw j0.k(this.f21301b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f21317r = str2;
                    Matcher matcher = f21298x.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.f21320u = linkedHashSet;
                    return;
                }
                return;
            }
            throw j0.k(this.f21301b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i10, Type type) {
            if (j0.i(type)) {
                throw j0.m(this.f21301b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public c0(a aVar) {
        this.f21287a = aVar.f21301b;
        this.f21288b = aVar.f21300a.f21334c;
        this.f21289c = aVar.f21313n;
        this.f21290d = aVar.f21317r;
        this.f21291e = aVar.f21318s;
        this.f21292f = aVar.f21319t;
        this.f21293g = aVar.f21314o;
        this.f21294h = aVar.f21315p;
        this.f21295i = aVar.f21316q;
        this.f21296j = aVar.f21321v;
        this.f21297k = aVar.f21322w;
    }
}
