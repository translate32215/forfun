package o1;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: NavType.kt */
public abstract class a0<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final a0<Integer> f22644b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static final a0<Integer> f22645c = new i();

    /* renamed from: d  reason: collision with root package name */
    public static final a0<int[]> f22646d = new e();

    /* renamed from: e  reason: collision with root package name */
    public static final a0<Long> f22647e = new h();

    /* renamed from: f  reason: collision with root package name */
    public static final a0<long[]> f22648f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final a0<Float> f22649g = new d();

    /* renamed from: h  reason: collision with root package name */
    public static final a0<float[]> f22650h = new c();

    /* renamed from: i  reason: collision with root package name */
    public static final a0<Boolean> f22651i = new b();

    /* renamed from: j  reason: collision with root package name */
    public static final a0<boolean[]> f22652j = new a();

    /* renamed from: k  reason: collision with root package name */
    public static final a0<String> f22653k = new k();

    /* renamed from: l  reason: collision with root package name */
    public static final a0<String[]> f22654l = new j();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22655a;

    /* compiled from: NavType.kt */
    public static final class a extends a0<boolean[]> {
        public a() {
            super(true);
        }

        public Object a(Bundle bundle, String str) {
            return (boolean[]) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return "boolean[]";
        }

        public Object c(String str) {
            ud.k.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putBooleanArray(str, (boolean[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    public static final class b extends a0<Boolean> {
        public b() {
            super(false);
        }

        public Object a(Bundle bundle, String str) {
            return (Boolean) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return "boolean";
        }

        public Object c(String str) {
            boolean z10;
            ud.k.f(str, "value");
            if (ud.k.a(str, "true")) {
                z10 = true;
            } else if (ud.k.a(str, "false")) {
                z10 = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z10);
        }

        public void d(Bundle bundle, String str, Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putBoolean(str, booleanValue);
        }
    }

    /* compiled from: NavType.kt */
    public static final class c extends a0<float[]> {
        public c() {
            super(true);
        }

        public Object a(Bundle bundle, String str) {
            return (float[]) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return "float[]";
        }

        public Object c(String str) {
            ud.k.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putFloatArray(str, (float[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    public static final class d extends a0<Float> {
        public d() {
            super(false);
        }

        public Object a(Bundle bundle, String str) {
            Object a10 = z.a(bundle, "bundle", str, "key", str);
            if (a10 != null) {
                return Float.valueOf(((Float) a10).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        public String b() {
            return "float";
        }

        public Object c(String str) {
            ud.k.f(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        public void d(Bundle bundle, String str, Object obj) {
            float floatValue = ((Number) obj).floatValue();
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putFloat(str, floatValue);
        }
    }

    /* compiled from: NavType.kt */
    public static final class e extends a0<int[]> {
        public e() {
            super(true);
        }

        public Object a(Bundle bundle, String str) {
            return (int[]) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return "integer[]";
        }

        public Object c(String str) {
            ud.k.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putIntArray(str, (int[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    public static final class f extends a0<Integer> {
        public f() {
            super(false);
        }

        public Object a(Bundle bundle, String str) {
            Object a10 = z.a(bundle, "bundle", str, "key", str);
            if (a10 != null) {
                return Integer.valueOf(((Integer) a10).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        public String b() {
            return "integer";
        }

        public Object c(String str) {
            int i10;
            ud.k.f(str, "value");
            if (ce.i.h(str, "0x", false, 2)) {
                String substring = str.substring(2);
                ud.k.e(substring, "this as java.lang.String).substring(startIndex)");
                ce.a.a(16);
                i10 = Integer.parseInt(substring, 16);
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public void d(Bundle bundle, String str, Object obj) {
            int intValue = ((Number) obj).intValue();
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putInt(str, intValue);
        }
    }

    /* compiled from: NavType.kt */
    public static final class g extends a0<long[]> {
        public g() {
            super(true);
        }

        public Object a(Bundle bundle, String str) {
            return (long[]) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return "long[]";
        }

        public Object c(String str) {
            ud.k.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putLongArray(str, (long[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    public static final class h extends a0<Long> {
        public h() {
            super(false);
        }

        public Object a(Bundle bundle, String str) {
            Object a10 = z.a(bundle, "bundle", str, "key", str);
            if (a10 != null) {
                return Long.valueOf(((Long) a10).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        public String b() {
            return "long";
        }

        public Object c(String str) {
            String str2;
            long j10;
            ud.k.f(str, "value");
            if (ce.i.b(str, "L", false, 2)) {
                str2 = str.substring(0, str.length() - 1);
                ud.k.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            if (ce.i.h(str, "0x", false, 2)) {
                String substring = str2.substring(2);
                ud.k.e(substring, "this as java.lang.String).substring(startIndex)");
                ce.a.a(16);
                j10 = Long.parseLong(substring, 16);
            } else {
                j10 = Long.parseLong(str2);
            }
            return Long.valueOf(j10);
        }

        public void d(Bundle bundle, String str, Object obj) {
            long longValue = ((Number) obj).longValue();
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putLong(str, longValue);
        }
    }

    /* compiled from: NavType.kt */
    public static final class i extends a0<Integer> {
        public i() {
            super(false);
        }

        public Object a(Bundle bundle, String str) {
            Object a10 = z.a(bundle, "bundle", str, "key", str);
            if (a10 != null) {
                return Integer.valueOf(((Integer) a10).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        public String b() {
            return "reference";
        }

        public Object c(String str) {
            int i10;
            ud.k.f(str, "value");
            if (ce.i.h(str, "0x", false, 2)) {
                String substring = str.substring(2);
                ud.k.e(substring, "this as java.lang.String).substring(startIndex)");
                ce.a.a(16);
                i10 = Integer.parseInt(substring, 16);
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public void d(Bundle bundle, String str, Object obj) {
            int intValue = ((Number) obj).intValue();
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putInt(str, intValue);
        }
    }

    /* compiled from: NavType.kt */
    public static final class j extends a0<String[]> {
        public j() {
            super(true);
        }

        public Object a(Bundle bundle, String str) {
            return (String[]) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return "string[]";
        }

        public Object c(String str) {
            ud.k.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putStringArray(str, (String[]) obj);
        }
    }

    /* compiled from: NavType.kt */
    public static final class k extends a0<String> {
        public k() {
            super(true);
        }

        public Object a(Bundle bundle, String str) {
            return (String) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return "string";
        }

        public Object c(String str) {
            ud.k.f(str, "value");
            return str;
        }

        public void d(Bundle bundle, String str, Object obj) {
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            bundle.putString(str, (String) obj);
        }
    }

    /* compiled from: NavType.kt */
    public static final class l<D extends Enum<?>> extends p<D> {

        /* renamed from: n  reason: collision with root package name */
        public final Class<D> f22656n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f22656n = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        public String b() {
            return this.f22656n.getName();
        }

        /* renamed from: f */
        public D e(String str) {
            D d10;
            ud.k.f(str, "value");
            D[] enumConstants = this.f22656n.getEnumConstants();
            ud.k.e(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (ce.i.c(((Enum) d10).name(), str, true)) {
                    break;
                }
                i10++;
            }
            D d11 = (Enum) d10;
            if (d11 != null) {
                return d11;
            }
            StringBuilder a10 = androidx.activity.result.d.a("Enum value ", str, " not found for type ");
            a10.append(this.f22656n.getName());
            a10.append('.');
            throw new IllegalArgumentException(a10.toString());
        }
    }

    /* compiled from: NavType.kt */
    public static final class m<D extends Parcelable> extends a0<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f22657m;

        public m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.f22657m = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
        }

        public Object a(Bundle bundle, String str) {
            return (Parcelable[]) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return this.f22657m.getName();
        }

        public Object c(String str) {
            ud.k.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            this.f22657m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ud.k.a(m.class, obj.getClass())) {
                return false;
            }
            return ud.k.a(this.f22657m, ((m) obj).f22657m);
        }

        public int hashCode() {
            return this.f22657m.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    public static final class n<D> extends a0<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f22658m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(Class<D> cls) {
            super(true);
            boolean z10 = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z10 = false;
            }
            if (z10) {
                this.f22658m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        public D a(Bundle bundle, String str) {
            return z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return this.f22658m.getName();
        }

        public D c(String str) {
            ud.k.f(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public void d(Bundle bundle, String str, D d10) {
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            this.f22658m.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d10);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ud.k.a(n.class, obj.getClass())) {
                return false;
            }
            return ud.k.a(this.f22658m, ((n) obj).f22658m);
        }

        public int hashCode() {
            return this.f22658m.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    public static final class o<D extends Serializable> extends a0<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f22659m;

        public o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.f22659m = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        public Object a(Bundle bundle, String str) {
            return (Serializable[]) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return this.f22659m.getName();
        }

        public Object c(String str) {
            ud.k.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            Serializable[] serializableArr = (Serializable[]) obj;
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            this.f22659m.cast(serializableArr);
            bundle.putSerializable(str, (Serializable) serializableArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ud.k.a(o.class, obj.getClass())) {
                return false;
            }
            return ud.k.a(this.f22659m, ((o) obj).f22659m);
        }

        public int hashCode() {
            return this.f22659m.hashCode();
        }
    }

    public a0(boolean z10) {
        this.f22655a = z10;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public abstract T c(String str);

    public abstract void d(Bundle bundle, String str, T t10);

    public String toString() {
        return b();
    }

    /* compiled from: NavType.kt */
    public static class p<D extends Serializable> extends a0<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f22660m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (true ^ cls.isEnum()) {
                this.f22660m = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        public Object a(Bundle bundle, String str) {
            return (Serializable) z.a(bundle, "bundle", str, "key", str);
        }

        public String b() {
            return this.f22660m.getName();
        }

        public void d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            ud.k.f(bundle, "bundle");
            ud.k.f(str, "key");
            ud.k.f(serializable, "value");
            this.f22660m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* renamed from: e */
        public D c(String str) {
            ud.k.f(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return ud.k.a(this.f22660m, ((p) obj).f22660m);
        }

        public int hashCode() {
            return this.f22660m.hashCode();
        }

        public p(boolean z10, Class<D> cls) {
            super(z10);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f22660m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
