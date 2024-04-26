package g0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import androidx.appcompat.widget.d0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: TypefaceCompatUtil */
public class l {

    /* compiled from: TypefaceCompatUtil */
    public static class a {
        public static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0014 A[SYNTHETIC, Splitter:B:13:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r0, android.content.res.Resources r1, int r2) {
        /*
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ all -> 0x0010 }
            boolean r0 = b(r0, r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000d
            r1.close()     // Catch:{ IOException -> 0x000d }
        L_0x000d:
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()     // Catch:{ IOException -> 0x0017 }
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.a(java.io.File, android.content.res.Resources, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047 A[SYNTHETIC, Splitter:B:25:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0050 A[SYNTHETIC, Splitter:B:31:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.io.File r5, java.io.InputStream r6) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002a }
            r3.<init>(r5, r1)     // Catch:{ IOException -> 0x002a }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r2 = r6.read(r5)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r4 = -1
            if (r2 == r4) goto L_0x001a
            r3.write(r5, r1, r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r5 = 1
            r3.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            android.os.StrictMode.setThreadPolicy(r0)
            return r5
        L_0x0022:
            r5 = move-exception
            r2 = r3
            goto L_0x004e
        L_0x0025:
            r5 = move-exception
            r2 = r3
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            goto L_0x004e
        L_0x002a:
            r5 = move-exception
        L_0x002b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r3.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0028 }
            r3.append(r5)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0028 }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x004e:
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            android.os.StrictMode.setThreadPolicy(r0)
            goto L_0x0058
        L_0x0057:
            throw r5
        L_0x0058:
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.b(java.io.File, java.io.InputStream):boolean");
    }

    public static File c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder a10 = android.support.v4.media.a.a(".font");
        a10.append(Process.myPid());
        a10.append("-");
        a10.append(Process.myTid());
        a10.append("-");
        String sb2 = a10.toString();
        int i10 = 0;
        while (i10 < 100) {
            File file = new File(cacheDir, d0.a(sb2, i10));
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i10++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer d(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = g0.l.a.a(r7, r9, r1, r8)     // Catch:{ IOException -> 0x003d }
            if (r7 != 0) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch:{ IOException -> 0x003d }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0038 }
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ all -> 0x0038 }
            r8.<init>(r9)     // Catch:{ all -> 0x0038 }
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch:{ all -> 0x0033 }
            long r5 = r1.size()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            r8.close()     // Catch:{ all -> 0x0038 }
            r7.close()     // Catch:{ IOException -> 0x003d }
            return r9
        L_0x0033:
            r9 = move-exception
            r8.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r9     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r8 = move-exception
            r7.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r8     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.d(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }
}
