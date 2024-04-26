package o2;

import androidx.work.a;
import androidx.work.c;
import androidx.work.d;
import k0.g;

/* compiled from: WorkTypeConverters */
public class p {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[SYNTHETIC, Splitter:B:25:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0061 A[SYNTHETIC, Splitter:B:36:0x0061] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0055=Splitter:B:29:0x0055, B:15:0x003a=Splitter:B:15:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g2.c a(byte[] r7) {
        /*
            g2.c r0 = new g2.c
            r0.<init>()
            if (r7 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            int r7 = r2.readInt()     // Catch:{ IOException -> 0x003e }
        L_0x0017:
            if (r7 <= 0) goto L_0x0032
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x003e }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x003e }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x003e }
            g2.c$a r5 = new g2.c$a     // Catch:{ IOException -> 0x003e }
            r5.<init>(r3, r4)     // Catch:{ IOException -> 0x003e }
            java.util.Set<g2.c$a> r3 = r0.f18404a     // Catch:{ IOException -> 0x003e }
            r3.add(r5)     // Catch:{ IOException -> 0x003e }
            int r7 = r7 + -1
            goto L_0x0017
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r7 = move-exception
            r7.printStackTrace()
        L_0x003a:
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x003e:
            r7 = move-exception
            goto L_0x0048
        L_0x0040:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L_0x005f
        L_0x0044:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L_0x0048:
            r7.printStackTrace()     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0055:
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r7 = move-exception
            r7.printStackTrace()
        L_0x005d:
            return r0
        L_0x005e:
            r7 = move-exception
        L_0x005f:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0069
        L_0x0065:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0069:
            r1.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0071:
            goto L_0x0073
        L_0x0072:
            throw r7
        L_0x0073:
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.p.a(byte[]):g2.c");
    }

    public static a b(int i10) {
        if (i10 == 0) {
            return a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return a.LINEAR;
        }
        throw new IllegalArgumentException(g.a("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static c c(int i10) {
        if (i10 == 0) {
            return c.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return c.CONNECTED;
        }
        if (i10 == 2) {
            return c.UNMETERED;
        }
        if (i10 == 3) {
            return c.NOT_ROAMING;
        }
        if (i10 == 4) {
            return c.METERED;
        }
        throw new IllegalArgumentException(g.a("Could not convert ", i10, " to NetworkType"));
    }

    public static d d(int i10) {
        if (i10 == 0) {
            return d.ENQUEUED;
        }
        if (i10 == 1) {
            return d.RUNNING;
        }
        if (i10 == 2) {
            return d.SUCCEEDED;
        }
        if (i10 == 3) {
            return d.FAILED;
        }
        if (i10 == 4) {
            return d.BLOCKED;
        }
        if (i10 == 5) {
            return d.CANCELLED;
        }
        throw new IllegalArgumentException(g.a("Could not convert ", i10, " to State"));
    }

    public static int e(d dVar) {
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                i10 = 3;
                if (ordinal != 3) {
                    i10 = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + dVar + " to int");
                    }
                }
            }
        }
        return i10;
    }
}
