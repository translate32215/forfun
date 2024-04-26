package g0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import f0.e;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import l0.o;

/* compiled from: TypefaceCompatBaseImpl */
public class k {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, e.c> f18381a = new ConcurrentHashMap<>();

    public static long f(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e10) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e10);
            return 0;
        } catch (IllegalAccessException e11) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e11);
            return 0;
        }
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        e.c cVar2 = cVar;
        e.d[] dVarArr = cVar2.f18033a;
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        int i12 = Integer.MAX_VALUE;
        e.d dVar = null;
        for (e.d dVar2 : dVarArr) {
            int abs = (Math.abs(dVar2.f18035b - i11) * 2) + (dVar2.f18036c == z10 ? 0 : 1);
            if (dVar == null || i12 > abs) {
                dVar = dVar2;
                i12 = abs;
            }
        }
        if (dVar == null) {
            return null;
        }
        Typeface b10 = e.b(context, resources, dVar.f18039f, dVar.f18034a, 0, i10);
        long f10 = f(b10);
        if (f10 != 0) {
            this.f18381a.put(Long.valueOf(f10), cVar2);
        }
        return b10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024 A[SYNTHETIC, Splitter:B:17:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002b A[SYNTHETIC, Splitter:B:25:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r3, android.os.CancellationSignal r4, l0.o[] r5, int r6) {
        /*
            r2 = this;
            int r4 = r5.length
            r0 = 0
            r1 = 1
            if (r4 >= r1) goto L_0x0006
            return r0
        L_0x0006:
            l0.o r4 = r2.e(r5, r6)
            android.content.ContentResolver r5 = r3.getContentResolver()     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.net.Uri r4 = r4.f20996a     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.graphics.Typeface r3 = r2.c(r3, r4)     // Catch:{ IOException -> 0x0029, all -> 0x001e }
            if (r4 == 0) goto L_0x001d
            r4.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            return r3
        L_0x001e:
            r3 = move-exception
            r0 = r4
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r3
        L_0x0028:
            r4 = r0
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r4.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.b(android.content.Context, android.os.CancellationSignal, l0.o[], int):android.graphics.Typeface");
    }

    public Typeface c(Context context, InputStream inputStream) {
        File c10 = l.c(context);
        if (c10 == null) {
            return null;
        }
        try {
            if (!l.b(c10, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(c10.getPath());
            c10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File c10 = l.c(context);
        if (c10 == null) {
            return null;
        }
        try {
            if (!l.a(c10, resources, i10)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(c10.getPath());
            c10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c10.delete();
        }
    }

    public o e(o[] oVarArr, int i10) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        o oVar = null;
        int i12 = Integer.MAX_VALUE;
        for (o oVar2 : oVarArr) {
            int abs = (Math.abs(oVar2.f20998c - i11) * 2) + (oVar2.f20999d == z10 ? 0 : 1);
            if (oVar == null || i12 > abs) {
                oVar = oVar2;
                i12 = abs;
            }
        }
        return oVar;
    }
}
