package g0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.v4.media.a;
import android.util.Log;
import f0.e;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: TypefaceCompatApi26Impl */
public class h extends f {

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f18374g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<?> f18375h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f18376i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f18377j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f18378k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f18379l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f18380m;

    public h() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = p(cls2);
            method2 = q(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = r(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder a10 = a.a("Unable to collect necessary methods for class ");
            a10.append(e10.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", a10.toString(), e10);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f18374g = cls;
        this.f18375h = constructor;
        this.f18376i = method3;
        this.f18377j = method2;
        this.f18378k = method;
        this.f18379l = method4;
        this.f18380m = method5;
    }

    private Object o() {
        try {
            return this.f18375h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        if (!n()) {
            return super.a(context, cVar, resources, i10);
        }
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        for (e.d dVar : cVar.f18033a) {
            if (!k(context, o10, dVar.f18034a, dVar.f18038e, dVar.f18035b, dVar.f18036c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f18037d))) {
                j(o10);
                return null;
            }
        }
        if (!m(o10)) {
            return null;
        }
        return l(o10);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r12, android.os.CancellationSignal r13, l0.o[] r14, int r15) {
        /*
            r11 = this;
            int r0 = r14.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            boolean r0 = r11.n()
            if (r0 != 0) goto L_0x0047
            l0.o r14 = r11.e(r14, r15)
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r15 = r14.f20996a     // Catch:{ IOException -> 0x0046 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r15, r0, r13)     // Catch:{ IOException -> 0x0046 }
            if (r12 != 0) goto L_0x0024
            if (r12 == 0) goto L_0x0023
            r12.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0023:
            return r2
        L_0x0024:
            android.graphics.Typeface$Builder r13 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x0041 }
            java.io.FileDescriptor r15 = r12.getFileDescriptor()     // Catch:{ all -> 0x0041 }
            r13.<init>(r15)     // Catch:{ all -> 0x0041 }
            int r15 = r14.f20998c     // Catch:{ all -> 0x0041 }
            android.graphics.Typeface$Builder r13 = r13.setWeight(r15)     // Catch:{ all -> 0x0041 }
            boolean r14 = r14.f20999d     // Catch:{ all -> 0x0041 }
            android.graphics.Typeface$Builder r13 = r13.setItalic(r14)     // Catch:{ all -> 0x0041 }
            android.graphics.Typeface r13 = r13.build()     // Catch:{ all -> 0x0041 }
            r12.close()     // Catch:{ IOException -> 0x0046 }
            return r13
        L_0x0041:
            r13 = move-exception
            r12.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r13     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r2
        L_0x0047:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = r14.length
            r4 = 0
            r5 = 0
        L_0x004f:
            if (r5 >= r3) goto L_0x006b
            r6 = r14[r5]
            int r7 = r6.f21000e
            if (r7 == 0) goto L_0x0058
            goto L_0x0068
        L_0x0058:
            android.net.Uri r6 = r6.f20996a
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L_0x0061
            goto L_0x0068
        L_0x0061:
            java.nio.ByteBuffer r7 = g0.l.d(r12, r13, r6)
            r0.put(r6, r7)
        L_0x0068:
            int r5 = r5 + 1
            goto L_0x004f
        L_0x006b:
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r0)
            java.lang.Object r13 = r11.o()
            if (r13 != 0) goto L_0x0076
            return r2
        L_0x0076:
            int r0 = r14.length
            r3 = 0
            r5 = 0
        L_0x0079:
            if (r3 >= r0) goto L_0x00c2
            r6 = r14[r3]
            android.net.Uri r7 = r6.f20996a
            java.lang.Object r7 = r12.get(r7)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r7 != 0) goto L_0x0088
            goto L_0x00bf
        L_0x0088:
            int r5 = r6.f20997b
            int r8 = r6.f20998c
            boolean r6 = r6.f20999d
            java.lang.reflect.Method r9 = r11.f18377j     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            r10[r4] = r7     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            r10[r1] = r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            r5 = 2
            r10[r5] = r2     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            r5 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            r10[r5] = r7     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            r10[r5] = r6     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            java.lang.Object r5 = r9.invoke(r13, r10)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            boolean r5 = r5.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b7 }
            goto L_0x00b8
        L_0x00b7:
            r5 = 0
        L_0x00b8:
            if (r5 != 0) goto L_0x00be
            r11.j(r13)
            return r2
        L_0x00be:
            r5 = 1
        L_0x00bf:
            int r3 = r3 + 1
            goto L_0x0079
        L_0x00c2:
            if (r5 != 0) goto L_0x00c8
            r11.j(r13)
            return r2
        L_0x00c8:
            boolean r12 = r11.m(r13)
            if (r12 != 0) goto L_0x00cf
            return r2
        L_0x00cf:
            android.graphics.Typeface r12 = r11.l(r13)
            if (r12 != 0) goto L_0x00d6
            return r2
        L_0x00d6:
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r15)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.h.b(android.content.Context, android.os.CancellationSignal, l0.o[], int):android.graphics.Typeface");
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!n()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object o10 = o();
        if (o10 == null) {
            return null;
        }
        if (!k(context, o10, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            j(o10);
            return null;
        } else if (!m(o10)) {
            return null;
        } else {
            return l(o10);
        }
    }

    public final void j(Object obj) {
        try {
            this.f18379l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean k(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f18376i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f18374g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f18380m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean m(Object obj) {
        try {
            return ((Boolean) this.f18378k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n() {
        if (this.f18376i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f18376i != null;
    }

    public Method p(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public Method q(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public Method r(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
