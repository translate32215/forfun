package g0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import l0.o;
import s.i;

/* compiled from: TypefaceCompatApi24Impl */
public class g extends k {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f18370b;

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor<?> f18371c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f18372d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f18373e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method2 = null;
            method = null;
        }
        f18371c = constructor;
        f18370b = cls;
        f18372d = method;
        f18373e = method2;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f18372d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h(Object obj) {
        try {
            Object newInstance = Array.newInstance(f18370b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f18373e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061 A[LOOP:0: B:8:0x0015->B:35:0x0061, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r17, f0.e.c r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r0 = 0
            r1 = 0
            java.lang.reflect.Constructor<?> r2 = f18371c     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r2 = r1
        L_0x000c:
            if (r2 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r3 = r18
            f0.e$d[] r3 = r3.f18033a
            int r4 = r3.length
            r5 = 0
        L_0x0015:
            if (r5 >= r4) goto L_0x0069
            r6 = r3[r5]
            int r0 = r6.f18039f
            java.io.File r7 = g0.l.c(r17)
            r8 = r19
            if (r7 != 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            boolean r0 = g0.l.a(r7, r8, r0)     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x002f
            r7.delete()
        L_0x002d:
            r0 = r1
            goto L_0x0051
        L_0x002f:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004d }
            r9.<init>(r7)     // Catch:{ IOException -> 0x004d }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x0048 }
            long r14 = r10.size()     // Catch:{ all -> 0x0048 }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0048 }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x0048 }
            r9.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r0 = r1
        L_0x004e:
            r7.delete()
        L_0x0051:
            if (r0 != 0) goto L_0x0054
            return r1
        L_0x0054:
            int r7 = r6.f18038e
            int r9 = r6.f18035b
            boolean r6 = r6.f18036c
            boolean r0 = g(r2, r0, r7, r9, r6)
            if (r0 != 0) goto L_0x0061
            return r1
        L_0x0061:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x0064:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0069:
            android.graphics.Typeface r0 = h(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.g.a(android.content.Context, f0.e$c, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, o[] oVarArr, int i10) {
        Object obj;
        try {
            obj = f18371c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        i iVar = new i();
        for (o oVar : oVarArr) {
            Uri uri = oVar.f20996a;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = l.d(context, cancellationSignal, uri);
                iVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(obj, byteBuffer, oVar.f20997b, oVar.f20998c, oVar.f20999d)) {
                return null;
            }
        }
        Typeface h10 = h(obj);
        if (h10 == null) {
            return null;
        }
        return Typeface.create(h10, i10);
    }
}
