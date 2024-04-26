package lf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import javax.annotation.Nullable;
import ke.d;
import ke.d0;
import ke.r;
import ke.s;
import ke.u;
import ke.v;
import lf.a;
import lf.c0;
import lf.j0;
import lf.m;
import lf.x;
import nf.b;
import nf.c;
import nf.d;
import nf.e;
import nf.f;
import nf.g;
import nf.h;
import nf.i;
import nf.j;
import nf.k;
import nf.l;
import nf.m;
import nf.n;
import nf.o;
import nf.p;
import nf.q;
import nf.t;
import nf.y;
import retrofit2.ParameterHandler;

/* compiled from: ServiceMethod */
public abstract class g0<T> {
    public static <T> g0<T> b(f0 f0Var, Method method) {
        Type type;
        boolean z10;
        int i10;
        int i11;
        ParameterHandler<?> parameterHandler;
        int i12;
        int i13;
        int i14;
        ParameterHandler<?> parameterHandler2;
        ParameterHandler<?> parameterHandler3;
        int i15;
        ParameterHandler<?> parameterHandler4;
        ParameterHandler<?> parameterHandler5;
        ParameterHandler<?> cVar;
        f0 f0Var2 = f0Var;
        c0.a aVar = new c0.a(f0Var2, method);
        for (Annotation annotation : aVar.f21302c) {
            if (annotation instanceof b) {
                aVar.b("DELETE", ((b) annotation).value(), false);
            } else if (annotation instanceof f) {
                aVar.b("GET", ((f) annotation).value(), false);
            } else if (annotation instanceof g) {
                aVar.b("HEAD", ((g) annotation).value(), false);
            } else if (annotation instanceof n) {
                aVar.b("PATCH", ((n) annotation).value(), true);
            } else if (annotation instanceof o) {
                aVar.b("POST", ((o) annotation).value(), true);
            } else if (annotation instanceof p) {
                aVar.b("PUT", ((p) annotation).value(), true);
            } else if (annotation instanceof m) {
                aVar.b("OPTIONS", ((m) annotation).value(), false);
            } else if (annotation instanceof h) {
                h hVar = (h) annotation;
                aVar.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof k) {
                String[] value = ((k) annotation).value();
                if (value.length != 0) {
                    r.a aVar2 = new r.a();
                    for (String str : value) {
                        int indexOf = str.indexOf(58);
                        if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                            throw j0.k(aVar.f21301b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                        }
                        String substring = str.substring(0, indexOf);
                        String trim = str.substring(indexOf + 1).trim();
                        if ("Content-Type".equalsIgnoreCase(substring)) {
                            try {
                                aVar.f21319t = u.b(trim);
                            } catch (IllegalArgumentException e10) {
                                throw j0.l(aVar.f21301b, e10, "Malformed content type: %s", trim);
                            }
                        } else {
                            aVar2.a(substring, trim);
                        }
                    }
                    aVar.f21318s = new r(aVar2);
                } else {
                    throw j0.k(aVar.f21301b, "@Headers annotation is empty.", new Object[0]);
                }
            } else if (annotation instanceof l) {
                if (!aVar.f21315p) {
                    aVar.f21316q = true;
                } else {
                    throw j0.k(aVar.f21301b, "Only one encoding annotation is allowed.", new Object[0]);
                }
            } else if (!(annotation instanceof e)) {
                continue;
            } else if (!aVar.f21316q) {
                aVar.f21315p = true;
            } else {
                throw j0.k(aVar.f21301b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }
        if (aVar.f21313n != null) {
            if (!aVar.f21314o) {
                if (aVar.f21316q) {
                    throw j0.k(aVar.f21301b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                } else if (aVar.f21315p) {
                    throw j0.k(aVar.f21301b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = aVar.f21303d.length;
            aVar.f21321v = new x[length];
            int i16 = length - 1;
            int i17 = 0;
            while (i17 < length) {
                ParameterHandler<?>[] parameterHandlerArr = aVar.f21321v;
                Type type2 = aVar.f21304e[i17];
                Annotation[] annotationArr = aVar.f21303d[i17];
                boolean z11 = i17 == i16;
                if (annotationArr != null) {
                    int length2 = annotationArr.length;
                    parameterHandler = null;
                    int i18 = 0;
                    while (i18 < length2) {
                        Annotation annotation2 = annotationArr[i18];
                        Class<String> cls = String.class;
                        Class<v.b> cls2 = v.b.class;
                        int i19 = length;
                        if (annotation2 instanceof y) {
                            aVar.c(i17, type2);
                            if (aVar.f21312m) {
                                throw j0.m(aVar.f21301b, i17, "Multiple @Url method annotations found.", new Object[0]);
                            } else if (aVar.f21308i) {
                                throw j0.m(aVar.f21301b, i17, "@Path parameters may not be used with @Url.", new Object[0]);
                            } else if (aVar.f21309j) {
                                throw j0.m(aVar.f21301b, i17, "A @Url parameter must not come after a @Query.", new Object[0]);
                            } else if (aVar.f21310k) {
                                throw j0.m(aVar.f21301b, i17, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                            } else if (aVar.f21311l) {
                                throw j0.m(aVar.f21301b, i17, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            } else if (aVar.f21317r == null) {
                                aVar.f21312m = true;
                                if (type2 == s.class || type2 == cls || type2 == URI.class || ((type2 instanceof Class) && "android.net.Uri".equals(((Class) type2).getName()))) {
                                    parameterHandler2 = new x.n(aVar.f21301b, i17);
                                    i14 = i16;
                                    i12 = i18;
                                    i13 = length2;
                                } else {
                                    throw j0.m(aVar.f21301b, i17, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                            } else {
                                throw j0.m(aVar.f21301b, i17, "@Url cannot be used with @%s URL", aVar.f21313n);
                            }
                        } else {
                            i14 = i16;
                            if (annotation2 instanceof nf.s) {
                                aVar.c(i17, type2);
                                if (aVar.f21309j) {
                                    throw j0.m(aVar.f21301b, i17, "A @Path parameter must not come after a @Query.", new Object[0]);
                                } else if (aVar.f21310k) {
                                    throw j0.m(aVar.f21301b, i17, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                } else if (aVar.f21311l) {
                                    throw j0.m(aVar.f21301b, i17, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                } else if (aVar.f21312m) {
                                    throw j0.m(aVar.f21301b, i17, "@Path parameters may not be used with @Url.", new Object[0]);
                                } else if (aVar.f21317r != null) {
                                    aVar.f21308i = true;
                                    nf.s sVar = (nf.s) annotation2;
                                    String value2 = sVar.value();
                                    if (!c0.a.f21299y.matcher(value2).matches()) {
                                        throw j0.m(aVar.f21301b, i17, "@Path parameter name must match %s. Found: %s", c0.a.f21298x.pattern(), value2);
                                    } else if (aVar.f21320u.contains(value2)) {
                                        aVar.f21300a.e(type2, annotationArr);
                                        i12 = i18;
                                        i15 = length2;
                                        parameterHandler3 = new x.i<>(aVar.f21301b, i17, value2, a.d.f21284a, sVar.encoded());
                                    } else {
                                        throw j0.m(aVar.f21301b, i17, "URL \"%s\" does not contain \"{%s}\".", aVar.f21317r, value2);
                                    }
                                } else {
                                    throw j0.m(aVar.f21301b, i17, "@Path can only be used with relative url on @%s", aVar.f21313n);
                                }
                            } else {
                                i12 = i18;
                                i15 = length2;
                                if (annotation2 instanceof t) {
                                    aVar.c(i17, type2);
                                    t tVar = (t) annotation2;
                                    String value3 = tVar.value();
                                    boolean encoded = tVar.encoded();
                                    Class<?> g10 = j0.g(type2);
                                    aVar.f21309j = true;
                                    if (Iterable.class.isAssignableFrom(g10)) {
                                        if (type2 instanceof ParameterizedType) {
                                            aVar.f21300a.e(j0.f(0, (ParameterizedType) type2), annotationArr);
                                            parameterHandler3 = new v(new x.j(value3, a.d.f21284a, encoded));
                                        } else {
                                            throw j0.m(aVar.f21301b, i17, a0.a(g10, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                        }
                                    } else if (g10.isArray()) {
                                        aVar.f21300a.e(c0.a.a(g10.getComponentType()), annotationArr);
                                        parameterHandler3 = new w(new x.j(value3, a.d.f21284a, encoded));
                                    } else {
                                        aVar.f21300a.e(type2, annotationArr);
                                        parameterHandler4 = new x.j<>(value3, a.d.f21284a, encoded);
                                    }
                                } else {
                                    if (annotation2 instanceof nf.v) {
                                        aVar.c(i17, type2);
                                        boolean encoded2 = ((nf.v) annotation2).encoded();
                                        Class<?> g11 = j0.g(type2);
                                        aVar.f21310k = true;
                                        if (Iterable.class.isAssignableFrom(g11)) {
                                            if (type2 instanceof ParameterizedType) {
                                                aVar.f21300a.e(j0.f(0, (ParameterizedType) type2), annotationArr);
                                                parameterHandler3 = new v(new x.l(a.d.f21284a, encoded2));
                                            } else {
                                                throw j0.m(aVar.f21301b, i17, a0.a(g11, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (g11.isArray()) {
                                            aVar.f21300a.e(c0.a.a(g11.getComponentType()), annotationArr);
                                            parameterHandler3 = new w(new x.l(a.d.f21284a, encoded2));
                                        } else {
                                            aVar.f21300a.e(type2, annotationArr);
                                            cVar = new x.l<>(a.d.f21284a, encoded2);
                                        }
                                    } else if (annotation2 instanceof nf.u) {
                                        aVar.c(i17, type2);
                                        Class<?> g12 = j0.g(type2);
                                        aVar.f21311l = true;
                                        if (Map.class.isAssignableFrom(g12)) {
                                            Type h10 = j0.h(type2, g12, Map.class);
                                            if (h10 instanceof ParameterizedType) {
                                                ParameterizedType parameterizedType = (ParameterizedType) h10;
                                                Type f10 = j0.f(0, parameterizedType);
                                                if (cls == f10) {
                                                    aVar.f21300a.e(j0.f(1, parameterizedType), annotationArr);
                                                    cVar = new x.k<>(aVar.f21301b, i17, a.d.f21284a, ((nf.u) annotation2).encoded());
                                                } else {
                                                    throw j0.m(aVar.f21301b, i17, b0.a("@QueryMap keys must be of type String: ", f10), new Object[0]);
                                                }
                                            } else {
                                                throw j0.m(aVar.f21301b, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                        } else {
                                            throw j0.m(aVar.f21301b, i17, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                    } else if (annotation2 instanceof i) {
                                        aVar.c(i17, type2);
                                        String value4 = ((i) annotation2).value();
                                        Class<?> g13 = j0.g(type2);
                                        if (Iterable.class.isAssignableFrom(g13)) {
                                            if (type2 instanceof ParameterizedType) {
                                                aVar.f21300a.e(j0.f(0, (ParameterizedType) type2), annotationArr);
                                                parameterHandler3 = new v(new x.d(value4, a.d.f21284a));
                                            } else {
                                                throw j0.m(aVar.f21301b, i17, a0.a(g13, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (g13.isArray()) {
                                            aVar.f21300a.e(c0.a.a(g13.getComponentType()), annotationArr);
                                            parameterHandler3 = new w(new x.d(value4, a.d.f21284a));
                                        } else {
                                            aVar.f21300a.e(type2, annotationArr);
                                            cVar = new x.d<>(value4, a.d.f21284a);
                                        }
                                    } else {
                                        if (annotation2 instanceof j) {
                                            if (type2 == r.class) {
                                                parameterHandler3 = new x.f(aVar.f21301b, i17);
                                            } else {
                                                aVar.c(i17, type2);
                                                Class<?> g14 = j0.g(type2);
                                                if (Map.class.isAssignableFrom(g14)) {
                                                    Type h11 = j0.h(type2, g14, Map.class);
                                                    if (h11 instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType2 = (ParameterizedType) h11;
                                                        Type f11 = j0.f(0, parameterizedType2);
                                                        if (cls == f11) {
                                                            aVar.f21300a.e(j0.f(1, parameterizedType2), annotationArr);
                                                            parameterHandler5 = new x.e<>(aVar.f21301b, i17, a.d.f21284a);
                                                        } else {
                                                            throw j0.m(aVar.f21301b, i17, b0.a("@HeaderMap keys must be of type String: ", f11), new Object[0]);
                                                        }
                                                    } else {
                                                        throw j0.m(aVar.f21301b, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw j0.m(aVar.f21301b, i17, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                }
                                            }
                                        } else if (annotation2 instanceof c) {
                                            aVar.c(i17, type2);
                                            if (aVar.f21315p) {
                                                c cVar2 = (c) annotation2;
                                                String value5 = cVar2.value();
                                                boolean encoded3 = cVar2.encoded();
                                                aVar.f21305f = true;
                                                Class<?> g15 = j0.g(type2);
                                                if (Iterable.class.isAssignableFrom(g15)) {
                                                    if (type2 instanceof ParameterizedType) {
                                                        aVar.f21300a.e(j0.f(0, (ParameterizedType) type2), annotationArr);
                                                        parameterHandler3 = new v(new x.b(value5, a.d.f21284a, encoded3));
                                                    } else {
                                                        throw j0.m(aVar.f21301b, i17, a0.a(g15, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                    }
                                                } else if (g15.isArray()) {
                                                    aVar.f21300a.e(c0.a.a(g15.getComponentType()), annotationArr);
                                                    parameterHandler3 = new w(new x.b(value5, a.d.f21284a, encoded3));
                                                } else {
                                                    aVar.f21300a.e(type2, annotationArr);
                                                    parameterHandler4 = new x.b<>(value5, a.d.f21284a, encoded3);
                                                }
                                            } else {
                                                throw j0.m(aVar.f21301b, i17, "@Field parameters can only be used with form encoding.", new Object[0]);
                                            }
                                        } else if (annotation2 instanceof d) {
                                            aVar.c(i17, type2);
                                            if (aVar.f21315p) {
                                                Class<?> g16 = j0.g(type2);
                                                if (Map.class.isAssignableFrom(g16)) {
                                                    Type h12 = j0.h(type2, g16, Map.class);
                                                    if (h12 instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType3 = (ParameterizedType) h12;
                                                        Type f12 = j0.f(0, parameterizedType3);
                                                        if (cls == f12) {
                                                            aVar.f21300a.e(j0.f(1, parameterizedType3), annotationArr);
                                                            a.d dVar = a.d.f21284a;
                                                            aVar.f21305f = true;
                                                            cVar = new x.c<>(aVar.f21301b, i17, dVar, ((d) annotation2).encoded());
                                                        } else {
                                                            throw j0.m(aVar.f21301b, i17, b0.a("@FieldMap keys must be of type String: ", f12), new Object[0]);
                                                        }
                                                    } else {
                                                        throw j0.m(aVar.f21301b, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw j0.m(aVar.f21301b, i17, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                            } else {
                                                throw j0.m(aVar.f21301b, i17, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                            }
                                        } else if (annotation2 instanceof q) {
                                            aVar.c(i17, type2);
                                            if (aVar.f21316q) {
                                                q qVar = (q) annotation2;
                                                aVar.f21306g = true;
                                                String value6 = qVar.value();
                                                Class<?> g17 = j0.g(type2);
                                                if (!value6.isEmpty()) {
                                                    i13 = i15;
                                                    r f13 = r.f("Content-Disposition", q.b.a("form-data; name=\"", value6, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                    if (Iterable.class.isAssignableFrom(g17)) {
                                                        if (type2 instanceof ParameterizedType) {
                                                            Type f14 = j0.f(0, (ParameterizedType) type2);
                                                            if (!cls2.isAssignableFrom(j0.g(f14))) {
                                                                parameterHandler2 = new v(new x.g(aVar.f21301b, i17, f13, aVar.f21300a.c(f14, annotationArr, aVar.f21302c)));
                                                            } else {
                                                                throw j0.m(aVar.f21301b, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                        } else {
                                                            throw j0.m(aVar.f21301b, i17, a0.a(g17, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                        }
                                                    } else if (g17.isArray()) {
                                                        Class<?> a10 = c0.a.a(g17.getComponentType());
                                                        if (!cls2.isAssignableFrom(a10)) {
                                                            parameterHandler2 = new w(new x.g(aVar.f21301b, i17, f13, aVar.f21300a.c(a10, annotationArr, aVar.f21302c)));
                                                        } else {
                                                            throw j0.m(aVar.f21301b, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                    } else if (!cls2.isAssignableFrom(g17)) {
                                                        parameterHandler3 = new x.g<>(aVar.f21301b, i17, f13, aVar.f21300a.c(type2, annotationArr, aVar.f21302c));
                                                        parameterHandler2 = parameterHandler3;
                                                    } else {
                                                        throw j0.m(aVar.f21301b, i17, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                } else if (Iterable.class.isAssignableFrom(g17)) {
                                                    if (!(type2 instanceof ParameterizedType)) {
                                                        throw j0.m(aVar.f21301b, i17, a0.a(g17, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                    } else if (cls2.isAssignableFrom(j0.g(j0.f(0, (ParameterizedType) type2)))) {
                                                        parameterHandler5 = new v(x.m.f21429a);
                                                    } else {
                                                        throw j0.m(aVar.f21301b, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                } else if (g17.isArray()) {
                                                    if (cls2.isAssignableFrom(g17.getComponentType())) {
                                                        parameterHandler5 = new w(x.m.f21429a);
                                                    } else {
                                                        throw j0.m(aVar.f21301b, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                } else if (cls2.isAssignableFrom(g17)) {
                                                    parameterHandler3 = x.m.f21429a;
                                                } else {
                                                    throw j0.m(aVar.f21301b, i17, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else {
                                                throw j0.m(aVar.f21301b, i17, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                        } else {
                                            i13 = i15;
                                            if (annotation2 instanceof nf.r) {
                                                aVar.c(i17, type2);
                                                if (aVar.f21316q) {
                                                    aVar.f21306g = true;
                                                    Class<?> g18 = j0.g(type2);
                                                    if (Map.class.isAssignableFrom(g18)) {
                                                        Type h13 = j0.h(type2, g18, Map.class);
                                                        if (h13 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType4 = (ParameterizedType) h13;
                                                            Type f15 = j0.f(0, parameterizedType4);
                                                            if (cls == f15) {
                                                                Type f16 = j0.f(1, parameterizedType4);
                                                                if (!cls2.isAssignableFrom(j0.g(f16))) {
                                                                    parameterHandler2 = new x.h<>(aVar.f21301b, i17, aVar.f21300a.c(f16, annotationArr, aVar.f21302c), ((nf.r) annotation2).encoding());
                                                                } else {
                                                                    throw j0.m(aVar.f21301b, i17, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw j0.m(aVar.f21301b, i17, b0.a("@PartMap keys must be of type String: ", f15), new Object[0]);
                                                            }
                                                        } else {
                                                            throw j0.m(aVar.f21301b, i17, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw j0.m(aVar.f21301b, i17, "@PartMap parameter type must be Map.", new Object[0]);
                                                    }
                                                } else {
                                                    throw j0.m(aVar.f21301b, i17, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof nf.a) {
                                                aVar.c(i17, type2);
                                                if (aVar.f21315p || aVar.f21316q) {
                                                    throw j0.m(aVar.f21301b, i17, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                } else if (!aVar.f21307h) {
                                                    try {
                                                        j c10 = aVar.f21300a.c(type2, annotationArr, aVar.f21302c);
                                                        aVar.f21307h = true;
                                                        parameterHandler2 = new x.a<>(aVar.f21301b, i17, c10);
                                                    } catch (RuntimeException e11) {
                                                        throw j0.n(aVar.f21301b, e11, i17, "Unable to create @Body converter for %s", type2);
                                                    }
                                                } else {
                                                    throw j0.m(aVar.f21301b, i17, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof nf.x) {
                                                aVar.c(i17, type2);
                                                Class<?> g19 = j0.g(type2);
                                                int i20 = i17 - 1;
                                                while (i20 >= 0) {
                                                    x.o oVar = aVar.f21321v[i20];
                                                    if (!(oVar instanceof x.o) || !oVar.f21432a.equals(g19)) {
                                                        i20--;
                                                    } else {
                                                        Method method2 = aVar.f21301b;
                                                        StringBuilder a11 = android.support.v4.media.a.a("@Tag type ");
                                                        a11.append(g19.getName());
                                                        a11.append(" is duplicate of parameter #");
                                                        a11.append(i20 + 1);
                                                        a11.append(" and would always overwrite its value.");
                                                        throw j0.m(method2, i17, a11.toString(), new Object[0]);
                                                    }
                                                }
                                                parameterHandler2 = new x.o<>(g19);
                                            } else {
                                                parameterHandler2 = null;
                                            }
                                        }
                                        i13 = i15;
                                        parameterHandler2 = parameterHandler5;
                                    }
                                    i13 = i15;
                                    parameterHandler2 = cVar;
                                }
                                i13 = i15;
                                parameterHandler2 = parameterHandler4;
                            }
                            i13 = i15;
                            parameterHandler2 = parameterHandler3;
                        }
                        if (parameterHandler2 != null) {
                            if (parameterHandler == null) {
                                parameterHandler = parameterHandler2;
                            } else {
                                throw j0.m(aVar.f21301b, i17, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                            }
                        }
                        i18 = i12 + 1;
                        Method method3 = method;
                        length = i19;
                        i16 = i14;
                        length2 = i13;
                    }
                    i11 = length;
                    i10 = i16;
                } else {
                    i11 = length;
                    i10 = i16;
                    parameterHandler = null;
                }
                if (parameterHandler == null) {
                    if (z11) {
                        try {
                            if (j0.g(type2) == md.d.class) {
                                aVar.f21322w = true;
                                parameterHandler = null;
                            }
                        } catch (NoClassDefFoundError unused) {
                        }
                    }
                    throw j0.m(aVar.f21301b, i17, "No Retrofit annotation found.", new Object[0]);
                }
                parameterHandlerArr[i17] = parameterHandler;
                i17++;
                Method method4 = method;
                length = i11;
                i16 = i10;
            }
            if (aVar.f21317r != null || aVar.f21312m) {
                boolean z12 = aVar.f21315p;
                if (!z12 && !aVar.f21316q && !aVar.f21314o && aVar.f21307h) {
                    throw j0.k(aVar.f21301b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (z12 && !aVar.f21305f) {
                    throw j0.k(aVar.f21301b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!aVar.f21316q || aVar.f21306g) {
                    c0 c0Var = new c0(aVar);
                    Type genericReturnType = method.getGenericReturnType();
                    if (j0.i(genericReturnType)) {
                        throw j0.k(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
                    } else if (genericReturnType != Void.TYPE) {
                        Class<d0> cls3 = d0.class;
                        boolean z13 = c0Var.f21297k;
                        Annotation[] annotations = method.getAnnotations();
                        if (z13) {
                            Type[] genericParameterTypes = method.getGenericParameterTypes();
                            Type type3 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                            if (type3 instanceof WildcardType) {
                                type3 = ((WildcardType) type3).getLowerBounds()[0];
                            }
                            if (j0.g(type3) != cls3 || !(type3 instanceof ParameterizedType)) {
                                z10 = false;
                            } else {
                                type3 = j0.f(0, (ParameterizedType) type3);
                                z10 = true;
                            }
                            type = new j0.b((Type) null, b.class, type3);
                            if (!j0.j(annotations, h0.class)) {
                                Annotation[] annotationArr2 = new Annotation[(annotations.length + 1)];
                                annotationArr2[0] = i0.f21344a;
                                System.arraycopy(annotations, 0, annotationArr2, 1, annotations.length);
                                annotations = annotationArr2;
                            }
                        } else {
                            type = method.getGenericReturnType();
                            z10 = false;
                        }
                        try {
                            c<?, ?> a12 = f0Var2.a(type, annotations);
                            Type b10 = a12.b();
                            if (b10 == d0.class) {
                                StringBuilder a13 = android.support.v4.media.a.a("'");
                                a13.append(j0.g(b10).getName());
                                a13.append("' is not a valid response body type. Did you mean ResponseBody?");
                                throw j0.k(method, a13.toString(), new Object[0]);
                            } else if (b10 == cls3) {
                                throw j0.k(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                            } else if (!c0Var.f21289c.equals("HEAD") || Void.class.equals(b10)) {
                                Method method5 = method;
                                try {
                                    j d10 = f0Var2.d(b10, method.getAnnotations());
                                    d.a aVar3 = f0Var2.f21333b;
                                    if (!z13) {
                                        return new m.a(c0Var, aVar3, d10, a12);
                                    }
                                    if (z10) {
                                        return new m.c(c0Var, aVar3, d10, a12);
                                    }
                                    return new m.b(c0Var, aVar3, d10, a12, false);
                                } catch (RuntimeException e12) {
                                    throw j0.l(method5, e12, "Unable to create converter for %s", b10);
                                }
                            } else {
                                throw j0.k(method, "HEAD method must use Void as response type.", new Object[0]);
                            }
                        } catch (RuntimeException e13) {
                            throw j0.l(method, e13, "Unable to create call adapter for %s", type);
                        }
                    } else {
                        throw j0.k(method, "Service methods cannot return void.", new Object[0]);
                    }
                } else {
                    throw j0.k(aVar.f21301b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw j0.k(aVar.f21301b, "Missing either @%s URL or @Url parameter.", aVar.f21313n);
            }
        } else {
            throw j0.k(aVar.f21301b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
    }

    @Nullable
    public abstract T a(Object[] objArr);
}
