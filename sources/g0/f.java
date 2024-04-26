package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import f0.e;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl */
public class f extends k {

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f18365b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<?> f18366c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f18367d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f18368e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f18369f = false;

    public static boolean g(Object obj, String str, int i10, boolean z10) {
        i();
        try {
            return ((Boolean) f18367d.invoke(obj, new Object[]{str, Integer.valueOf(i10), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void i() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f18369f) {
            f18369f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e10) {
                Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
                method2 = null;
                cls = null;
                method = null;
            }
            f18366c = constructor;
            f18365b = cls;
            f18367d = method;
            f18368e = method2;
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        i();
        try {
            Object newInstance = f18366c.newInstance(new Object[0]);
            e.d[] dVarArr = cVar.f18033a;
            int length = dVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                e.d dVar = dVarArr[i11];
                File c10 = l.c(context);
                if (c10 == null) {
                    return null;
                }
                try {
                    if (!l.a(c10, resources, dVar.f18039f)) {
                        c10.delete();
                        return null;
                    } else if (!g(newInstance, c10.getPath(), dVar.f18035b, dVar.f18036c)) {
                        return null;
                    } else {
                        c10.delete();
                        i11++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    c10.delete();
                }
            }
            i();
            try {
                Object newInstance2 = Array.newInstance(f18365b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f18368e.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0050 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r4, android.os.CancellationSignal r5, l0.o[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            l0.o r6 = r3.e(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.f20996a     // Catch:{ IOException -> 0x0051 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0051 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0051 }
        L_0x001d:
            return r1
        L_0x001e:
            java.io.File r6 = r3.h(r5)     // Catch:{ all -> 0x004c }
            if (r6 == 0) goto L_0x0033
            boolean r7 = r6.canRead()     // Catch:{ all -> 0x004c }
            if (r7 != 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ all -> 0x004c }
            r5.close()     // Catch:{ IOException -> 0x0051 }
            return r4
        L_0x0033:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x004c }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x004c }
            r6.<init>(r7)     // Catch:{ all -> 0x004c }
            android.graphics.Typeface r4 = r3.c(r4, r6)     // Catch:{ all -> 0x0047 }
            r6.close()     // Catch:{ all -> 0x004c }
            r5.close()     // Catch:{ IOException -> 0x0051 }
            return r4
        L_0x0047:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r4     // Catch:{ all -> 0x004c }
        L_0x004c:
            r4 = move-exception
            r5.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r4     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.f.b(android.content.Context, android.os.CancellationSignal, l0.o[], int):android.graphics.Typeface");
    }

    public final File h(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }
}
