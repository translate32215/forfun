package b8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import ce.e;
import gf.j0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k8.b4;
import k8.r;
import kd.o;
import md.f;
import md.g;
import td.l;
import td.p;
import ud.k;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static Context f3655a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f3656b;

    public static final String a(Class cls) {
        if (k.a(cls, Boolean.TYPE) || k.a(cls, Boolean.class)) {
            return "Boolean";
        }
        if (k.a(cls, Byte.TYPE) || k.a(cls, Byte.class)) {
            return "Byte";
        }
        if (k.a(cls, Character.TYPE) || k.a(cls, Character.class)) {
            return "Char";
        }
        if (k.a(cls, Short.TYPE) || k.a(cls, Short.class)) {
            return "Short";
        }
        if (k.a(cls, Integer.TYPE) || k.a(cls, Integer.class)) {
            return "Int";
        }
        if (k.a(cls, Long.TYPE) || k.a(cls, Long.class)) {
            return "Long";
        }
        if (k.a(cls, Float.TYPE) || k.a(cls, Float.class)) {
            return "Float";
        }
        if (k.a(cls, Double.TYPE) || k.a(cls, Double.class)) {
            return "Double";
        }
        if (k.a(cls, Object.class)) {
            return "Any";
        }
        return null;
    }

    public static final String b(Class cls) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        k.b(typeParameters, "typeParameters");
        if (typeParameters.length == 0) {
            return "";
        }
        int length = cls.getTypeParameters().length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = "*";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            String str = strArr[i12];
            i11++;
            if (i11 > 1) {
                sb2.append(", ");
            }
            e.a(sb2, str, (l) null);
        }
        sb2.append(">");
        String sb3 = sb2.toString();
        k.e(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static int c(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static <T extends View> T d(View view, int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            T findViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean e(android.content.Context r4) {
        /*
            java.lang.Class<b8.a> r0 = b8.a.class
            monitor-enter(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x004c }
            android.content.Context r2 = f3655a     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0018
            java.lang.Boolean r3 = f3656b     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x0018
            if (r2 == r1) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            boolean r4 = r3.booleanValue()     // Catch:{ all -> 0x004c }
            monitor-exit(r0)
            return r4
        L_0x0018:
            r2 = 0
            f3656b = r2     // Catch:{ all -> 0x004c }
            boolean r2 = z7.h.d()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0030
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x004c }
            boolean r4 = r4.isInstantApp()     // Catch:{ all -> 0x004c }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x004c }
            f3656b = r4     // Catch:{ all -> 0x004c }
            goto L_0x0042
        L_0x0030:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.String r2 = "com.google.android.instantapps.supervisor.InstantAppsRuntime"
            r4.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x003e }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x003e }
            f3656b = r4     // Catch:{ ClassNotFoundException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004c }
            f3656b = r4     // Catch:{ all -> 0x004c }
        L_0x0042:
            f3655a = r1     // Catch:{ all -> 0x004c }
            java.lang.Boolean r4 = f3656b     // Catch:{ all -> 0x004c }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x004c }
            monitor-exit(r0)
            return r4
        L_0x004c:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a.e(android.content.Context):boolean");
    }

    public static LiveData f(f fVar, long j10, p pVar, int i10) {
        g gVar = (i10 & 1) != 0 ? g.f21797a : null;
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        k.f(gVar, "context");
        return new h(gVar, j10, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cd, code lost:
        r3 = r5.Q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(android.widget.ImageView r7, java.lang.String r8) {
        /*
            android.content.Context r0 = r7.getContext()
            if (r0 == 0) goto L_0x0185
            com.bumptech.glide.b r0 = com.bumptech.glide.b.b(r0)
            z3.o r0 = r0.f4888f
            r0.getClass()
            boolean r1 = g4.j.h()
            if (r1 == 0) goto L_0x0023
            android.content.Context r1 = r7.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            com.bumptech.glide.i r0 = r0.f(r1)
            goto L_0x0166
        L_0x0023:
            android.content.Context r1 = r7.getContext()
            java.lang.String r2 = "Unable to obtain a request manager for a view without a Context"
            e.e.c(r1, r2)
            android.content.Context r1 = r7.getContext()
            android.app.Activity r1 = z3.o.a(r1)
            if (r1 != 0) goto L_0x0044
            android.content.Context r1 = r7.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            com.bumptech.glide.i r0 = r0.f(r1)
            goto L_0x0166
        L_0x0044:
            boolean r2 = r1 instanceof androidx.fragment.app.q
            r3 = 0
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 == 0) goto L_0x00ee
            androidx.fragment.app.q r1 = (androidx.fragment.app.q) r1
            s.a<android.view.View, androidx.fragment.app.p> r2 = r0.f28263f
            r2.clear()
            androidx.fragment.app.a0 r2 = r1.F()
            java.util.List r2 = r2.K()
            s.a<android.view.View, androidx.fragment.app.p> r5 = r0.f28263f
            z3.o.c(r2, r5)
            android.view.View r2 = r1.findViewById(r4)
            r4 = r7
            r5 = r3
        L_0x0066:
            boolean r6 = r4.equals(r2)
            if (r6 != 0) goto L_0x0086
            s.a<android.view.View, androidx.fragment.app.p> r5 = r0.f28263f
            java.lang.Object r5 = r5.getOrDefault(r4, r3)
            androidx.fragment.app.p r5 = (androidx.fragment.app.p) r5
            if (r5 == 0) goto L_0x0077
            goto L_0x0086
        L_0x0077:
            android.view.ViewParent r6 = r4.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0086
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            goto L_0x0066
        L_0x0086:
            s.a<android.view.View, androidx.fragment.app.p> r2 = r0.f28263f
            r2.clear()
            if (r5 == 0) goto L_0x00e8
            android.content.Context r1 = r5.q()
            java.lang.String r2 = "You cannot start a load on a fragment before it is attached or after it is destroyed"
            e.e.c(r1, r2)
            boolean r1 = g4.j.h()
            if (r1 == 0) goto L_0x00aa
            android.content.Context r1 = r5.q()
            android.content.Context r1 = r1.getApplicationContext()
            com.bumptech.glide.i r0 = r0.f(r1)
            goto L_0x0166
        L_0x00aa:
            androidx.fragment.app.q r1 = r5.o()
            if (r1 == 0) goto L_0x00b9
            z3.j r1 = r0.f28266i
            androidx.fragment.app.q r2 = r5.o()
            r1.a(r2)
        L_0x00b9:
            androidx.fragment.app.a0 r1 = r5.p()
            android.content.Context r2 = r5.q()
            boolean r3 = r5.I()
            if (r3 == 0) goto L_0x00e1
            boolean r3 = r5.J()
            if (r3 != 0) goto L_0x00e1
            android.view.View r3 = r5.Q
            if (r3 == 0) goto L_0x00e1
            android.os.IBinder r3 = r3.getWindowToken()
            if (r3 == 0) goto L_0x00e1
            android.view.View r3 = r5.Q
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x00e1
            r3 = 1
            goto L_0x00e2
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            com.bumptech.glide.i r0 = r0.k(r2, r1, r5, r3)
            goto L_0x0166
        L_0x00e8:
            com.bumptech.glide.i r0 = r0.g(r1)
            goto L_0x0166
        L_0x00ee:
            s.a<android.view.View, android.app.Fragment> r2 = r0.f28264g
            r2.clear()
            android.app.FragmentManager r2 = r1.getFragmentManager()
            s.a<android.view.View, android.app.Fragment> r5 = r0.f28264g
            r0.b(r2, r5)
            android.view.View r2 = r1.findViewById(r4)
            r4 = r7
            r5 = r3
        L_0x0102:
            boolean r6 = r4.equals(r2)
            if (r6 != 0) goto L_0x0122
            s.a<android.view.View, android.app.Fragment> r5 = r0.f28264g
            java.lang.Object r5 = r5.getOrDefault(r4, r3)
            android.app.Fragment r5 = (android.app.Fragment) r5
            if (r5 == 0) goto L_0x0113
            goto L_0x0122
        L_0x0113:
            android.view.ViewParent r6 = r4.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0122
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            goto L_0x0102
        L_0x0122:
            s.a<android.view.View, android.app.Fragment> r2 = r0.f28264g
            r2.clear()
            if (r5 != 0) goto L_0x012e
            com.bumptech.glide.i r0 = r0.e(r1)
            goto L_0x0166
        L_0x012e:
            android.app.Activity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x017d
            boolean r1 = g4.j.h()
            if (r1 != 0) goto L_0x015a
            android.app.Activity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x0149
            z3.j r1 = r0.f28266i
            android.app.Activity r2 = r5.getActivity()
            r1.a(r2)
        L_0x0149:
            android.app.FragmentManager r1 = r5.getChildFragmentManager()
            android.app.Activity r2 = r5.getActivity()
            boolean r3 = r5.isVisible()
            com.bumptech.glide.i r0 = r0.d(r2, r1, r5, r3)
            goto L_0x0166
        L_0x015a:
            android.app.Activity r1 = r5.getActivity()
            android.content.Context r1 = r1.getApplicationContext()
            com.bumptech.glide.i r0 = r0.f(r1)
        L_0x0166:
            com.bumptech.glide.h r8 = r0.j(r8)
            r0 = 2131755010(0x7f100002, float:1.9140887E38)
            c4.a r8 = r8.j(r0)
            com.bumptech.glide.h r8 = (com.bumptech.glide.h) r8
            c4.a r8 = r8.e(r0)
            com.bumptech.glide.h r8 = (com.bumptech.glide.h) r8
            r8.z(r7)
            return
        L_0x017d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "You cannot start a load on a fragment before it is attached"
            r7.<init>(r8)
            throw r7
        L_0x0185:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            r7.<init>(r8)
            goto L_0x018e
        L_0x018d:
            throw r7
        L_0x018e:
            goto L_0x018d
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a.g(android.widget.ImageView, java.lang.String):void");
    }

    public static final void h(View view, l<? super View, o> lVar) {
        view.setOnClickListener(new ac.a(lVar, 0));
    }

    public static final String i(Type type) {
        String str;
        String i10;
        Type f10 = j0.f(type);
        if (f10 instanceof Class) {
            StringBuilder sb2 = new StringBuilder();
            Class cls = (Class) f10;
            Class<?> enclosingClass = cls.getEnclosingClass();
            if (enclosingClass == null || (i10 = i(enclosingClass)) == null || (str = j.f.a(i10, ".")) == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append(cls.getSimpleName());
            return sb2.toString();
        } else if (f10 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) f10).getRawType();
            k.b(rawType, "jvmType.rawType");
            return i(rawType);
        } else if (f10 instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) f10).getGenericComponentType();
            k.b(genericComponentType, "jvmType.genericComponentType");
            return i(genericComponentType);
        } else if (f10 instanceof WildcardType) {
            return "*";
        } else {
            if (f10 instanceof TypeVariable) {
                String name = ((TypeVariable) f10).getName();
                k.b(name, "jvmType.name");
                return name;
            }
            StringBuilder a10 = android.support.v4.media.a.a("Unknown type ");
            a10.append(type.getClass());
            a10.append(' ');
            a10.append(type);
            throw new IllegalArgumentException(a10.toString());
        }
    }

    public static k8.o j(b4 b4Var) {
        if (b4Var == null) {
            return k8.o.f20381n;
        }
        int B = b4Var.B() - 1;
        if (B != 1) {
            if (B != 2) {
                if (B != 3) {
                    if (B == 4) {
                        List<b4> w10 = b4Var.w();
                        ArrayList arrayList = new ArrayList();
                        for (b4 j10 : w10) {
                            arrayList.add(j(j10));
                        }
                        return new k8.p(b4Var.u(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (b4Var.y()) {
                    return new k8.f(Boolean.valueOf(b4Var.x()));
                } else {
                    return new k8.f((Boolean) null);
                }
            } else if (b4Var.z()) {
                return new k8.h(Double.valueOf(b4Var.s()));
            } else {
                return new k8.h((Double) null);
            }
        } else if (b4Var.A()) {
            return new r(b4Var.v());
        } else {
            return k8.o.W;
        }
    }

    public static k8.o k(Object obj) {
        if (obj == null) {
            return k8.o.f20382o;
        }
        if (obj instanceof String) {
            return new r((String) obj);
        }
        if (obj instanceof Double) {
            return new k8.h((Double) obj);
        }
        if (obj instanceof Long) {
            return new k8.h(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new k8.h(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new k8.f((Boolean) obj);
        }
        if (obj instanceof Map) {
            k8.l lVar = new k8.l();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                k8.o k10 = k(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    lVar.o((String) next, k10);
                }
            }
            return lVar;
        } else if (obj instanceof List) {
            k8.e eVar = new k8.e();
            for (Object k11 : (List) obj) {
                eVar.D(eVar.x(), k(k11));
            }
            return eVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
