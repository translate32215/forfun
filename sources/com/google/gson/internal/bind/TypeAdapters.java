package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.t;
import ib.a;
import j.f;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import jb.b;
import jb.c;

public final class TypeAdapters {
    public static final t A;
    public static final t B;
    public static final TypeAdapter<j> C;
    public static final t D;
    public static final t E = new t() {
        public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
            Class<Enum> cls = Enum.class;
            Class cls2 = aVar.f19348a;
            if (!cls.isAssignableFrom(cls2) || cls2 == cls) {
                return null;
            }
            if (!cls2.isEnum()) {
                cls2 = cls2.getSuperclass();
            }
            return new EnumTypeAdapter(cls2);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final t f9893a;

    /* renamed from: b  reason: collision with root package name */
    public static final t f9894b;

    /* renamed from: c  reason: collision with root package name */
    public static final TypeAdapter<Boolean> f9895c = new TypeAdapter<Boolean>() {
        public Object b(jb.a aVar) throws IOException {
            if (aVar.m0() != b.NULL) {
                return Boolean.valueOf(aVar.k0());
            }
            aVar.i0();
            return null;
        }

        public void c(c cVar, Object obj) throws IOException {
            String str;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                str = "null";
            } else {
                str = bool.toString();
            }
            cVar.n0(str);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public static final t f9896d;

    /* renamed from: e  reason: collision with root package name */
    public static final t f9897e;

    /* renamed from: f  reason: collision with root package name */
    public static final t f9898f;

    /* renamed from: g  reason: collision with root package name */
    public static final t f9899g;

    /* renamed from: h  reason: collision with root package name */
    public static final t f9900h;

    /* renamed from: i  reason: collision with root package name */
    public static final t f9901i;

    /* renamed from: j  reason: collision with root package name */
    public static final t f9902j;

    /* renamed from: k  reason: collision with root package name */
    public static final TypeAdapter<Number> f9903k = new TypeAdapter<Number>() {
        public Object b(jb.a aVar) throws IOException {
            if (aVar.m0() == b.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return Long.valueOf(aVar.f0());
            } catch (NumberFormatException e10) {
                throw new r((Throwable) e10);
            }
        }

        public void c(c cVar, Object obj) throws IOException {
            cVar.m0((Number) obj);
        }
    };

    /* renamed from: l  reason: collision with root package name */
    public static final TypeAdapter<Number> f9904l = new TypeAdapter<Number>() {
        public Object b(jb.a aVar) throws IOException {
            if (aVar.m0() != b.NULL) {
                return Float.valueOf((float) aVar.T());
            }
            aVar.i0();
            return null;
        }

        public void c(c cVar, Object obj) throws IOException {
            cVar.m0((Number) obj);
        }
    };

    /* renamed from: m  reason: collision with root package name */
    public static final TypeAdapter<Number> f9905m = new TypeAdapter<Number>() {
        public Object b(jb.a aVar) throws IOException {
            if (aVar.m0() != b.NULL) {
                return Double.valueOf(aVar.T());
            }
            aVar.i0();
            return null;
        }

        public void c(c cVar, Object obj) throws IOException {
            cVar.m0((Number) obj);
        }
    };

    /* renamed from: n  reason: collision with root package name */
    public static final t f9906n;

    /* renamed from: o  reason: collision with root package name */
    public static final t f9907o;

    /* renamed from: p  reason: collision with root package name */
    public static final TypeAdapter<BigDecimal> f9908p = new TypeAdapter<BigDecimal>() {
        public Object b(jb.a aVar) throws IOException {
            if (aVar.m0() == b.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return new BigDecimal(aVar.k0());
            } catch (NumberFormatException e10) {
                throw new r((Throwable) e10);
            }
        }

        public void c(c cVar, Object obj) throws IOException {
            cVar.m0((BigDecimal) obj);
        }
    };

    /* renamed from: q  reason: collision with root package name */
    public static final TypeAdapter<BigInteger> f9909q = new TypeAdapter<BigInteger>() {
        public Object b(jb.a aVar) throws IOException {
            if (aVar.m0() == b.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return new BigInteger(aVar.k0());
            } catch (NumberFormatException e10) {
                throw new r((Throwable) e10);
            }
        }

        public void c(c cVar, Object obj) throws IOException {
            cVar.m0((BigInteger) obj);
        }
    };

    /* renamed from: r  reason: collision with root package name */
    public static final t f9910r;

    /* renamed from: s  reason: collision with root package name */
    public static final t f9911s;

    /* renamed from: t  reason: collision with root package name */
    public static final t f9912t;

    /* renamed from: u  reason: collision with root package name */
    public static final t f9913u;

    /* renamed from: v  reason: collision with root package name */
    public static final t f9914v;

    /* renamed from: w  reason: collision with root package name */
    public static final t f9915w;

    /* renamed from: x  reason: collision with root package name */
    public static final t f9916x;

    /* renamed from: y  reason: collision with root package name */
    public static final t f9917y;

    /* renamed from: z  reason: collision with root package name */
    public static final t f9918z = new t() {
        public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
            if (aVar.f19348a != Timestamp.class) {
                return null;
            }
            gson.getClass();
            final TypeAdapter c10 = gson.c(new a(Date.class));
            return new TypeAdapter<Timestamp>(this) {
                public Object b(jb.a aVar) throws IOException {
                    Date date = (Date) c10.b(aVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                public void c(c cVar, Object obj) throws IOException {
                    c10.c(cVar, (Timestamp) obj);
                }
            };
        }
    };

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31  reason: invalid class name */
    final class AnonymousClass31 implements t {
        public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
            aVar.equals((Object) null);
            return null;
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, T> f9932a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<T, String> f9933b = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    fb.b bVar = (fb.b) cls.getField(name).getAnnotation(fb.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            this.f9932a.put(put, enumR);
                        }
                    }
                    this.f9932a.put(name, enumR);
                    this.f9933b.put(enumR, name);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        public Object b(jb.a aVar) throws IOException {
            if (aVar.m0() != b.NULL) {
                return (Enum) this.f9932a.get(aVar.k0());
            }
            aVar.i0();
            return null;
        }

        public void c(c cVar, Object obj) throws IOException {
            String str;
            Enum enumR = (Enum) obj;
            if (enumR == null) {
                str = null;
            } else {
                str = this.f9933b.get(enumR);
            }
            cVar.n0(str);
        }
    }

    static {
        final TypeAdapter a10 = new TypeAdapter<Class>() {
            public Object b(jb.a aVar) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            public void c(c cVar, Object obj) throws IOException {
                StringBuilder a10 = android.support.v4.media.a.a("Attempted to serialize java.lang.Class: ");
                a10.append(((Class) obj).getName());
                a10.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(a10.toString());
            }
        }.a();
        final Class<Class> cls = Class.class;
        f9893a = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final TypeAdapter a11 = new TypeAdapter<BitSet>() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
                if (r6.V() != 0) goto L_0x004b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
                r1 = false;
             */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0053 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object b(jb.a r6) throws java.io.IOException {
                /*
                    r5 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r6.a()
                    jb.b r1 = r6.m0()
                    r2 = 0
                L_0x000d:
                    jb.b r3 = jb.b.END_ARRAY
                    if (r1 == r3) goto L_0x0066
                    int r3 = r1.ordinal()
                    r4 = 5
                    if (r3 == r4) goto L_0x0041
                    r4 = 6
                    if (r3 == r4) goto L_0x003a
                    r4 = 7
                    if (r3 != r4) goto L_0x0023
                    boolean r1 = r6.N()
                    goto L_0x004e
                L_0x0023:
                    com.google.gson.r r6 = new com.google.gson.r
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r6.<init>((java.lang.String) r0)
                    throw r6
                L_0x003a:
                    int r1 = r6.V()
                    if (r1 == 0) goto L_0x004d
                    goto L_0x004b
                L_0x0041:
                    java.lang.String r1 = r6.k0()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x005a }
                    if (r1 == 0) goto L_0x004d
                L_0x004b:
                    r1 = 1
                    goto L_0x004e
                L_0x004d:
                    r1 = 0
                L_0x004e:
                    if (r1 == 0) goto L_0x0053
                    r0.set(r2)
                L_0x0053:
                    int r2 = r2 + 1
                    jb.b r1 = r6.m0()
                    goto L_0x000d
                L_0x005a:
                    com.google.gson.r r6 = new com.google.gson.r
                    java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                    java.lang.String r0 = j.f.a(r0, r1)
                    r6.<init>((java.lang.String) r0)
                    throw r6
                L_0x0066:
                    r6.s()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.b(jb.a):java.lang.Object");
            }

            public void c(c cVar, Object obj) throws IOException {
                BitSet bitSet = (BitSet) obj;
                cVar.d();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.k0(bitSet.get(i10) ? 1 : 0);
                }
                cVar.s();
            }
        }.a();
        final Class<BitSet> cls2 = BitSet.class;
        f9894b = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass3 r02 = new TypeAdapter<Boolean>() {
            public Object b(jb.a aVar) throws IOException {
                b m02 = aVar.m0();
                if (m02 == b.NULL) {
                    aVar.i0();
                    return null;
                } else if (m02 == b.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.k0()));
                } else {
                    return Boolean.valueOf(aVar.N());
                }
            }

            public void c(c cVar, Object obj) throws IOException {
                cVar.l0((Boolean) obj);
            }
        };
        final Class cls3 = Boolean.TYPE;
        final Class<Boolean> cls4 = Boolean.class;
        f9896d = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.f19348a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r2.getName());
                a10.append("+");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r3);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass5 r03 = new TypeAdapter<Number>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() == b.NULL) {
                    aVar.i0();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.V());
                } catch (NumberFormatException e10) {
                    throw new r((Throwable) e10);
                }
            }

            public void c(c cVar, Object obj) throws IOException {
                cVar.m0((Number) obj);
            }
        };
        final Class cls5 = Byte.TYPE;
        final Class<Byte> cls6 = Byte.class;
        f9897e = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.f19348a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r2.getName());
                a10.append("+");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r3);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass6 r04 = new TypeAdapter<Number>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() == b.NULL) {
                    aVar.i0();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.V());
                } catch (NumberFormatException e10) {
                    throw new r((Throwable) e10);
                }
            }

            public void c(c cVar, Object obj) throws IOException {
                cVar.m0((Number) obj);
            }
        };
        final Class cls7 = Short.TYPE;
        final Class<Short> cls8 = Short.class;
        f9898f = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.f19348a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r2.getName());
                a10.append("+");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r3);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass7 r05 = new TypeAdapter<Number>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() == b.NULL) {
                    aVar.i0();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.V());
                } catch (NumberFormatException e10) {
                    throw new r((Throwable) e10);
                }
            }

            public void c(c cVar, Object obj) throws IOException {
                cVar.m0((Number) obj);
            }
        };
        final Class cls9 = Integer.TYPE;
        final Class<Integer> cls10 = Integer.class;
        f9899g = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.f19348a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r2.getName());
                a10.append("+");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r3);
                a10.append("]");
                return a10.toString();
            }
        };
        final TypeAdapter a12 = new TypeAdapter<AtomicInteger>() {
            public Object b(jb.a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.V());
                } catch (NumberFormatException e10) {
                    throw new r((Throwable) e10);
                }
            }

            public void c(c cVar, Object obj) throws IOException {
                cVar.k0((long) ((AtomicInteger) obj).get());
            }
        }.a();
        final Class<AtomicInteger> cls11 = AtomicInteger.class;
        f9900h = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final TypeAdapter a13 = new TypeAdapter<AtomicBoolean>() {
            public Object b(jb.a aVar) throws IOException {
                return new AtomicBoolean(aVar.N());
            }

            public void c(c cVar, Object obj) throws IOException {
                cVar.o0(((AtomicBoolean) obj).get());
            }
        }.a();
        final Class<AtomicBoolean> cls12 = AtomicBoolean.class;
        f9901i = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final TypeAdapter a14 = new TypeAdapter<AtomicIntegerArray>() {
            public Object b(jb.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.G()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.V()));
                    } catch (NumberFormatException e10) {
                        throw new r((Throwable) e10);
                    }
                }
                aVar.s();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            public void c(c cVar, Object obj) throws IOException {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.d();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.k0((long) atomicIntegerArray.get(i10));
                }
                cVar.s();
            }
        }.a();
        final Class<AtomicIntegerArray> cls13 = AtomicIntegerArray.class;
        f9902j = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass14 r06 = new TypeAdapter<Number>() {
            public Object b(jb.a aVar) throws IOException {
                b m02 = aVar.m0();
                int ordinal = m02.ordinal();
                if (ordinal == 5 || ordinal == 6) {
                    return new com.google.gson.internal.r(aVar.k0());
                }
                if (ordinal == 8) {
                    aVar.i0();
                    return null;
                }
                throw new r("Expecting number, got: " + m02);
            }

            public void c(c cVar, Object obj) throws IOException {
                cVar.m0((Number) obj);
            }
        };
        final Class<Number> cls14 = Number.class;
        f9906n = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass15 r07 = new TypeAdapter<Character>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() == b.NULL) {
                    aVar.i0();
                    return null;
                }
                String k02 = aVar.k0();
                if (k02.length() == 1) {
                    return Character.valueOf(k02.charAt(0));
                }
                throw new r(f.a("Expecting character, got: ", k02));
            }

            public void c(c cVar, Object obj) throws IOException {
                String str;
                Character ch = (Character) obj;
                if (ch == null) {
                    str = null;
                } else {
                    str = String.valueOf(ch);
                }
                cVar.n0(str);
            }
        };
        final Class cls15 = Character.TYPE;
        final Class<Character> cls16 = Character.class;
        f9907o = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.f19348a;
                if (cls == r1 || cls == r2) {
                    return r3;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r2.getName());
                a10.append("+");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r3);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass16 r08 = new TypeAdapter<String>() {
            public Object b(jb.a aVar) throws IOException {
                b m02 = aVar.m0();
                if (m02 == b.NULL) {
                    aVar.i0();
                    return null;
                } else if (m02 == b.BOOLEAN) {
                    return Boolean.toString(aVar.N());
                } else {
                    return aVar.k0();
                }
            }

            public void c(c cVar, Object obj) throws IOException {
                cVar.n0((String) obj);
            }
        };
        final Class<String> cls17 = String.class;
        f9910r = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass19 r09 = new TypeAdapter<StringBuilder>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() != b.NULL) {
                    return new StringBuilder(aVar.k0());
                }
                aVar.i0();
                return null;
            }

            public void c(c cVar, Object obj) throws IOException {
                String str;
                StringBuilder sb2 = (StringBuilder) obj;
                if (sb2 == null) {
                    str = null;
                } else {
                    str = sb2.toString();
                }
                cVar.n0(str);
            }
        };
        final Class<StringBuilder> cls18 = StringBuilder.class;
        f9911s = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass20 r010 = new TypeAdapter<StringBuffer>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() != b.NULL) {
                    return new StringBuffer(aVar.k0());
                }
                aVar.i0();
                return null;
            }

            public void c(c cVar, Object obj) throws IOException {
                String str;
                StringBuffer stringBuffer = (StringBuffer) obj;
                if (stringBuffer == null) {
                    str = null;
                } else {
                    str = stringBuffer.toString();
                }
                cVar.n0(str);
            }
        };
        final Class<StringBuffer> cls19 = StringBuffer.class;
        f9912t = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass21 r011 = new TypeAdapter<URL>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() == b.NULL) {
                    aVar.i0();
                    return null;
                }
                String k02 = aVar.k0();
                if ("null".equals(k02)) {
                    return null;
                }
                return new URL(k02);
            }

            public void c(c cVar, Object obj) throws IOException {
                String str;
                URL url = (URL) obj;
                if (url == null) {
                    str = null;
                } else {
                    str = url.toExternalForm();
                }
                cVar.n0(str);
            }
        };
        final Class<URL> cls20 = URL.class;
        f9913u = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass22 r012 = new TypeAdapter<URI>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() == b.NULL) {
                    aVar.i0();
                    return null;
                }
                try {
                    String k02 = aVar.k0();
                    if ("null".equals(k02)) {
                        return null;
                    }
                    return new URI(k02);
                } catch (URISyntaxException e10) {
                    throw new k((Throwable) e10);
                }
            }

            public void c(c cVar, Object obj) throws IOException {
                String str;
                URI uri = (URI) obj;
                if (uri == null) {
                    str = null;
                } else {
                    str = uri.toASCIIString();
                }
                cVar.n0(str);
            }
        };
        final Class<URI> cls21 = URI.class;
        f9914v = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass23 r013 = new TypeAdapter<InetAddress>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() != b.NULL) {
                    return InetAddress.getByName(aVar.k0());
                }
                aVar.i0();
                return null;
            }

            public void c(c cVar, Object obj) throws IOException {
                String str;
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress == null) {
                    str = null;
                } else {
                    str = inetAddress.getHostAddress();
                }
                cVar.n0(str);
            }
        };
        final Class<InetAddress> cls22 = InetAddress.class;
        f9915w = new t() {
            public <T2> TypeAdapter<T2> a(Gson gson, a<T2> aVar) {
                final Class<? super T> cls = aVar.f19348a;
                if (!r1.isAssignableFrom(cls)) {
                    return null;
                }
                return new TypeAdapter<Object>() {
                    public Object b(jb.a aVar) throws IOException {
                        Object b10 = r0.b(aVar);
                        if (b10 == null || cls.isInstance(b10)) {
                            return b10;
                        }
                        StringBuilder a10 = android.support.v4.media.a.a("Expected a ");
                        a10.append(cls.getName());
                        a10.append(" but was ");
                        a10.append(b10.getClass().getName());
                        throw new r(a10.toString());
                    }

                    public void c(c cVar, Object obj) throws IOException {
                        r0.c(cVar, obj);
                    }
                };
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[typeHierarchy=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r0);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass24 r014 = new TypeAdapter<UUID>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() != b.NULL) {
                    return UUID.fromString(aVar.k0());
                }
                aVar.i0();
                return null;
            }

            public void c(c cVar, Object obj) throws IOException {
                String str;
                UUID uuid = (UUID) obj;
                if (uuid == null) {
                    str = null;
                } else {
                    str = uuid.toString();
                }
                cVar.n0(str);
            }
        };
        final Class<UUID> cls23 = UUID.class;
        f9916x = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final TypeAdapter a15 = new TypeAdapter<Currency>() {
            public Object b(jb.a aVar) throws IOException {
                return Currency.getInstance(aVar.k0());
            }

            public void c(c cVar, Object obj) throws IOException {
                cVar.n0(((Currency) obj).getCurrencyCode());
            }
        }.a();
        final Class<Currency> cls24 = Currency.class;
        f9917y = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass27 r015 = new TypeAdapter<Calendar>() {
            public Object b(jb.a aVar) throws IOException {
                if (aVar.m0() == b.NULL) {
                    aVar.i0();
                    return null;
                }
                aVar.d();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.m0() != b.END_OBJECT) {
                    String g02 = aVar.g0();
                    int V = aVar.V();
                    if ("year".equals(g02)) {
                        i10 = V;
                    } else if ("month".equals(g02)) {
                        i11 = V;
                    } else if ("dayOfMonth".equals(g02)) {
                        i12 = V;
                    } else if ("hourOfDay".equals(g02)) {
                        i13 = V;
                    } else if ("minute".equals(g02)) {
                        i14 = V;
                    } else if ("second".equals(g02)) {
                        i15 = V;
                    }
                }
                aVar.t();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            public void c(c cVar, Object obj) throws IOException {
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    cVar.M();
                    return;
                }
                cVar.i();
                cVar.H("year");
                cVar.k0((long) calendar.get(1));
                cVar.H("month");
                cVar.k0((long) calendar.get(2));
                cVar.H("dayOfMonth");
                cVar.k0((long) calendar.get(5));
                cVar.H("hourOfDay");
                cVar.k0((long) calendar.get(11));
                cVar.H("minute");
                cVar.k0((long) calendar.get(12));
                cVar.H("second");
                cVar.k0((long) calendar.get(13));
                cVar.t();
            }
        };
        final Class<Calendar> cls25 = Calendar.class;
        final Class<GregorianCalendar> cls26 = GregorianCalendar.class;
        A = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.f19348a;
                if (cls == cls25 || cls == cls26) {
                    return r015;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(cls25.getName());
                a10.append("+");
                a10.append(cls26.getName());
                a10.append(",adapter=");
                a10.append(r015);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass28 r016 = new TypeAdapter<Locale>() {
            public Object b(jb.a aVar) throws IOException {
                String str = null;
                if (aVar.m0() == b.NULL) {
                    aVar.i0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.k0(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, str);
            }

            public void c(c cVar, Object obj) throws IOException {
                String str;
                Locale locale = (Locale) obj;
                if (locale == null) {
                    str = null;
                } else {
                    str = locale.toString();
                }
                cVar.n0(str);
            }
        };
        final Class<Locale> cls27 = Locale.class;
        B = new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(r1.getName());
                a10.append(",adapter=");
                a10.append(r2);
                a10.append("]");
                return a10.toString();
            }
        };
        final AnonymousClass29 r017 = new TypeAdapter<j>() {
            /* renamed from: d */
            public j b(jb.a aVar) throws IOException {
                int ordinal = aVar.m0().ordinal();
                if (ordinal == 0) {
                    g gVar = new g();
                    aVar.a();
                    while (aVar.G()) {
                        gVar.s(b(aVar));
                    }
                    aVar.s();
                    return gVar;
                } else if (ordinal == 2) {
                    m mVar = new m();
                    aVar.d();
                    while (aVar.G()) {
                        mVar.s(aVar.g0(), b(aVar));
                    }
                    aVar.t();
                    return mVar;
                } else if (ordinal == 5) {
                    return new o(aVar.k0());
                } else {
                    if (ordinal == 6) {
                        return new o((Number) new com.google.gson.internal.r(aVar.k0()));
                    }
                    if (ordinal == 7) {
                        return new o(Boolean.valueOf(aVar.N()));
                    }
                    if (ordinal == 8) {
                        aVar.i0();
                        return l.f9992a;
                    }
                    throw new IllegalArgumentException();
                }
            }

            /* renamed from: e */
            public void c(c cVar, j jVar) throws IOException {
                if (jVar == null || jVar.j()) {
                    cVar.M();
                } else if (jVar.q()) {
                    o h10 = jVar.h();
                    if (h10.B()) {
                        cVar.m0(h10.x());
                    } else if (h10.z()) {
                        cVar.o0(h10.s());
                    } else {
                        cVar.n0(h10.y());
                    }
                } else if (jVar.i()) {
                    cVar.d();
                    Iterator<j> it = jVar.c().iterator();
                    while (it.hasNext()) {
                        c(cVar, it.next());
                    }
                    cVar.s();
                } else if (jVar.o()) {
                    cVar.i();
                    for (Map.Entry next : jVar.f().x()) {
                        cVar.H((String) next.getKey());
                        c(cVar, (j) next.getValue());
                    }
                    cVar.t();
                } else {
                    StringBuilder a10 = android.support.v4.media.a.a("Couldn't write ");
                    a10.append(jVar.getClass());
                    throw new IllegalArgumentException(a10.toString());
                }
            }
        };
        C = r017;
        final Class<j> cls28 = j.class;
        D = new t() {
            public <T2> TypeAdapter<T2> a(Gson gson, a<T2> aVar) {
                final Class<? super T> cls = aVar.f19348a;
                if (!cls28.isAssignableFrom(cls)) {
                    return null;
                }
                return new TypeAdapter<Object>() {
                    public Object b(jb.a aVar) throws IOException {
                        Object b10 = r017.b(aVar);
                        if (b10 == null || cls.isInstance(b10)) {
                            return b10;
                        }
                        StringBuilder a10 = android.support.v4.media.a.a("Expected a ");
                        a10.append(cls.getName());
                        a10.append(" but was ");
                        a10.append(b10.getClass().getName());
                        throw new r(a10.toString());
                    }

                    public void c(c cVar, Object obj) throws IOException {
                        r017.c(cVar, obj);
                    }
                };
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[typeHierarchy=");
                a10.append(cls28.getName());
                a10.append(",adapter=");
                a10.append(r017);
                a10.append("]");
                return a10.toString();
            }
        };
    }

    public static <TT> t a(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                if (aVar.f19348a == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(cls.getName());
                a10.append(",adapter=");
                a10.append(typeAdapter);
                a10.append("]");
                return a10.toString();
            }
        };
    }

    public static <TT> t b(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new t() {
            public <T> TypeAdapter<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.f19348a;
                if (cls == cls || cls == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Factory[type=");
                a10.append(cls2.getName());
                a10.append("+");
                a10.append(cls.getName());
                a10.append(",adapter=");
                a10.append(typeAdapter);
                a10.append("]");
                return a10.toString();
            }
        };
    }
}
