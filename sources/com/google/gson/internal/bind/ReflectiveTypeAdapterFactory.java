package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.h;
import com.google.gson.r;
import com.google.gson.t;
import hb.b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;
import jb.c;

public final class ReflectiveTypeAdapterFactory implements t {

    /* renamed from: a  reason: collision with root package name */
    public final h f9869a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9870b;

    /* renamed from: c  reason: collision with root package name */
    public final Excluder f9871c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f9872d;

    /* renamed from: e  reason: collision with root package name */
    public final b f9873e = b.f18970a;

    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.gson.internal.t<T> f9874a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, a> f9875b;

        public Adapter(com.google.gson.internal.t<T> tVar, Map<String, a> map) {
            this.f9874a = tVar;
            this.f9875b = map;
        }

        public T b(jb.a aVar) throws IOException {
            if (aVar.m0() == jb.b.NULL) {
                aVar.i0();
                return null;
            }
            T a10 = this.f9874a.a();
            try {
                aVar.d();
                while (aVar.G()) {
                    a aVar2 = this.f9875b.get(aVar.g0());
                    if (aVar2 != null) {
                        if (aVar2.f9878c) {
                            aVar2.a(aVar, a10);
                        }
                    }
                    aVar.s0();
                }
                aVar.t();
                return a10;
            } catch (IllegalStateException e10) {
                throw new r((Throwable) e10);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public void c(c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.M();
                return;
            }
            cVar.i();
            try {
                for (a next : this.f9875b.values()) {
                    if (next.c(t10)) {
                        cVar.H(next.f9876a);
                        next.b(cVar, t10);
                    }
                }
                cVar.t();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9876a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9877b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9878c;

        public a(String str, boolean z10, boolean z11) {
            this.f9876a = str;
            this.f9877b = z10;
            this.f9878c = z11;
        }

        public abstract void a(jb.a aVar, Object obj) throws IOException, IllegalAccessException;

        public abstract void b(c cVar, Object obj) throws IOException, IllegalAccessException;

        public abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(h hVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f9869a = hVar;
        this.f9870b = dVar;
        this.f9871c = excluder;
        this.f9872d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0197 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.google.gson.TypeAdapter<T> a(com.google.gson.Gson r35, ib.a<T> r36) {
        /*
            r34 = this;
            r11 = r34
            r12 = r35
            r0 = r36
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Class<? super T> r1 = r0.f19348a
            boolean r2 = r13.isAssignableFrom(r1)
            r14 = 0
            if (r2 != 0) goto L_0x0012
            return r14
        L_0x0012:
            com.google.gson.internal.h r2 = r11.f9869a
            com.google.gson.internal.t r15 = r2.a(r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter r10 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L_0x002c
        L_0x0025:
            r14 = r9
            r33 = r10
            r28 = r15
            goto L_0x01da
        L_0x002c:
            java.lang.reflect.Type r8 = r0.f19349b
            r7 = r0
            r6 = r1
        L_0x0030:
            if (r6 == r13) goto L_0x0025
            java.lang.reflect.Field[] r5 = r6.getDeclaredFields()
            int r4 = r5.length
            r3 = 0
            r2 = 0
        L_0x0039:
            if (r2 >= r4) goto L_0x01b3
            r1 = r5[r2]
            r0 = 1
            boolean r16 = r11.b(r1, r0)
            boolean r17 = r11.b(r1, r3)
            if (r16 != 0) goto L_0x0060
            if (r17 != 0) goto L_0x0060
            r19 = r2
            r20 = r4
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r29 = 0
            r15 = r8
            goto L_0x017d
        L_0x0060:
            hb.b r3 = r11.f9873e
            r3.a(r1)
            java.lang.reflect.Type r3 = r7.f19349b
            java.lang.reflect.Type r14 = r1.getGenericType()
            java.lang.reflect.Type r14 = com.google.gson.internal.b.g(r3, r6, r14)
            java.lang.Class<fb.b> r3 = fb.b.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            fb.b r3 = (fb.b) r3
            if (r3 != 0) goto L_0x0086
            com.google.gson.d r3 = r11.f9870b
            java.lang.String r3 = r3.a(r1)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r19 = r2
            goto L_0x0097
        L_0x0086:
            java.lang.String r0 = r3.value()
            java.lang.String[] r3 = r3.alternate()
            r19 = r2
            int r2 = r3.length
            if (r2 != 0) goto L_0x009d
            java.util.List r3 = java.util.Collections.singletonList(r0)
        L_0x0097:
            r20 = r4
            r18 = 1
            r4 = r3
            goto L_0x00bd
        L_0x009d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r20 = r4
            int r4 = r3.length
            r18 = 1
            int r4 = r4 + 1
            r2.<init>(r4)
            r2.add(r0)
            int r0 = r3.length
            r4 = 0
        L_0x00ae:
            if (r4 >= r0) goto L_0x00bc
            r21 = r0
            r0 = r3[r4]
            r2.add(r0)
            int r4 = r4 + 1
            r0 = r21
            goto L_0x00ae
        L_0x00bc:
            r4 = r2
        L_0x00bd:
            int r3 = r4.size()
            r0 = 0
            r2 = 0
        L_0x00c3:
            if (r2 >= r3) goto L_0x016a
            java.lang.Object r21 = r4.get(r2)
            r22 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            r21 = r9
            if (r2 == 0) goto L_0x00d5
            r16 = 0
        L_0x00d5:
            ib.a r9 = new ib.a
            r9.<init>(r14)
            r23 = r0
            java.lang.Class<? super T> r0 = r9.f19348a
            boolean r24 = com.google.gson.internal.v.a(r0)
            java.lang.Class<fb.a> r0 = fb.a.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            fb.a r0 = (fb.a) r0
            if (r0 == 0) goto L_0x00f9
            r25 = r1
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r1 = r11.f9872d
            r26 = r2
            com.google.gson.internal.h r2 = r11.f9869a
            com.google.gson.TypeAdapter r0 = r1.b(r2, r12, r9, r0)
            goto L_0x00fe
        L_0x00f9:
            r25 = r1
            r26 = r2
            r0 = 0
        L_0x00fe:
            if (r0 == 0) goto L_0x0103
            r27 = 1
            goto L_0x0105
        L_0x0103:
            r27 = 0
        L_0x0105:
            if (r0 != 0) goto L_0x010b
            com.google.gson.TypeAdapter r0 = r12.c(r9)
        L_0x010b:
            r28 = r0
            com.google.gson.internal.bind.c r2 = new com.google.gson.internal.bind.c
            r1 = r23
            r0 = r2
            r11 = r1
            r23 = r25
            r1 = r34
            r12 = r2
            r25 = r26
            r2 = r13
            r26 = r3
            r29 = 0
            r3 = r16
            r30 = r4
            r4 = r17
            r31 = r5
            r5 = r23
            r36 = r6
            r6 = r27
            r27 = r14
            r14 = r7
            r7 = r28
            r28 = r15
            r15 = r8
            r8 = r35
            r32 = r14
            r14 = r21
            r33 = r10
            r10 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r14.put(r13, r12)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a) r0
            if (r11 != 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r0 = r11
        L_0x014c:
            int r2 = r25 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r13 = r22
            r1 = r23
            r3 = r26
            r14 = r27
            r15 = r28
            r4 = r30
            r5 = r31
            r7 = r32
            r10 = r33
            goto L_0x00c3
        L_0x016a:
            r11 = r0
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r29 = 0
            r15 = r8
            if (r11 != 0) goto L_0x0197
        L_0x017d:
            int r2 = r19 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r4 = r20
            r13 = r22
            r15 = r28
            r5 = r31
            r7 = r32
            r10 = r33
            r3 = 0
            r14 = 0
            goto L_0x0039
        L_0x0197:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r11.f9876a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b3:
            r36 = r6
            r0 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r15 = r8
            java.lang.reflect.Type r0 = r0.f19349b
            java.lang.reflect.Type r1 = r36.getGenericSuperclass()
            r2 = r36
            java.lang.reflect.Type r0 = com.google.gson.internal.b.g(r0, r2, r1)
            ib.a r7 = new ib.a
            r7.<init>(r0)
            java.lang.Class<? super T> r6 = r7.f19348a
            r11 = r34
            r12 = r35
            r15 = r28
            r14 = 0
            goto L_0x0030
        L_0x01da:
            r0 = r28
            r1 = r33
            r1.<init>(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a(com.google.gson.Gson, ib.a):com.google.gson.TypeAdapter");
    }

    public boolean b(Field field, boolean z10) {
        Excluder excluder = this.f9871c;
        Class<?> type = field.getType();
        if ((excluder.b(type) || excluder.c(type, z10)) || excluder.d(field, z10)) {
            return false;
        }
        return true;
    }
}
