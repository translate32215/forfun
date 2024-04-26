package c5;

import android.net.Uri;
import android.text.TextUtils;
import ba.p0;
import c5.q;
import com.google.android.exoplayer2.upstream.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import u6.e;
import v6.a;
import v6.e0;
import x4.f;

/* compiled from: HttpMediaDrmCallback */
public final class v implements x {

    /* renamed from: a  reason: collision with root package name */
    public final m.c f4352a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4353b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4354c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f4355d;

    public v(String str, boolean z10, m.c cVar) {
        a.a(!z10 || !TextUtils.isEmpty(str));
        this.f4352a = cVar;
        this.f4353b = str;
        this.f4354c = z10;
        this.f4355d = new HashMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r2 = v6.e0.f26436a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(com.google.android.exoplayer2.upstream.m.c r32, java.lang.String r33, byte[] r34, java.util.Map<java.lang.String, java.lang.String> r35) throws c5.y {
        /*
            com.google.android.exoplayer2.upstream.r r1 = new com.google.android.exoplayer2.upstream.r
            com.google.android.exoplayer2.upstream.m r0 = r32.a()
            r1.<init>(r0)
            java.util.Collections.emptyMap()
            android.net.Uri r3 = android.net.Uri.parse(r33)
            java.lang.String r15 = "The uri must be set."
            v6.a.g(r3, r15)
            u6.e r16 = new u6.e
            r4 = 0
            r6 = 2
            r9 = 0
            r11 = -1
            r13 = 0
            r14 = 1
            r0 = 0
            r2 = r16
            r7 = r34
            r8 = r35
            r17 = r15
            r15 = r0
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15)
            r2 = 0
            r3 = r16
            r4 = 0
        L_0x0031:
            com.google.android.exoplayer2.upstream.f r5 = new com.google.android.exoplayer2.upstream.f     // Catch:{ Exception -> 0x00c5 }
            r5.<init>(r1, r3)     // Catch:{ Exception -> 0x00c5 }
            byte[] r0 = v6.e0.U(r5)     // Catch:{ f -> 0x0043 }
            int r2 = v6.e0.f26436a     // Catch:{ Exception -> 0x00c5 }
            r5.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            return r0
        L_0x0040:
            r0 = move-exception
            goto L_0x00bf
        L_0x0043:
            r0 = move-exception
            r6 = r0
            int r0 = r6.f5524a     // Catch:{ all -> 0x0040 }
            r7 = 307(0x133, float:4.3E-43)
            if (r0 == r7) goto L_0x004f
            r7 = 308(0x134, float:4.32E-43)
            if (r0 != r7) goto L_0x0054
        L_0x004f:
            r0 = 5
            if (r4 >= r0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            r7 = 0
            if (r0 != 0) goto L_0x0059
            goto L_0x0074
        L_0x0059:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r6.f5525b     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r8 = "Location"
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0040 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0074
            boolean r8 = r0.isEmpty()     // Catch:{ all -> 0x0040 }
            if (r8 != 0) goto L_0x0074
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0040 }
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0040 }
        L_0x0074:
            if (r7 == 0) goto L_0x00be
            int r4 = r4 + 1
            long r8 = r3.f26049b     // Catch:{ all -> 0x0040 }
            int r0 = r3.f26050c     // Catch:{ all -> 0x0040 }
            byte[] r6 = r3.f26051d     // Catch:{ all -> 0x0040 }
            java.util.Map<java.lang.String, java.lang.String> r10 = r3.f26052e     // Catch:{ all -> 0x0040 }
            long r11 = r3.f26053f     // Catch:{ all -> 0x0040 }
            long r13 = r3.f26054g     // Catch:{ all -> 0x0040 }
            java.lang.String r15 = r3.f26055h     // Catch:{ all -> 0x0040 }
            int r2 = r3.f26056i     // Catch:{ all -> 0x0040 }
            java.lang.Object r3 = r3.f26057j     // Catch:{ all -> 0x0040 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x0040 }
            r33 = r4
            r4 = r17
            v6.a.g(r7, r4)     // Catch:{ all -> 0x0040 }
            u6.e r17 = new u6.e     // Catch:{ all -> 0x0040 }
            r18 = r17
            r19 = r7
            r20 = r8
            r22 = r0
            r23 = r6
            r24 = r10
            r25 = r11
            r27 = r13
            r29 = r15
            r30 = r2
            r31 = r3
            r18.<init>(r19, r20, r22, r23, r24, r25, r27, r29, r30, r31)     // Catch:{ all -> 0x0040 }
            int r0 = v6.e0.f26436a     // Catch:{ Exception -> 0x00c5 }
            r5.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            r3 = r17
            r2 = 0
            r17 = r4
            r4 = r33
            goto L_0x0031
        L_0x00be:
            throw r6     // Catch:{ all -> 0x0040 }
        L_0x00bf:
            int r2 = v6.e0.f26436a     // Catch:{ Exception -> 0x00c5 }
            r5.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            throw r0     // Catch:{ Exception -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            r10 = r0
            c5.y r0 = new c5.y
            android.net.Uri r6 = r1.f5559c
            r6.getClass()
            java.util.Map r7 = r1.N()
            long r8 = r1.f5558b
            r4 = r0
            r5 = r16
            r4.<init>(r5, r6, r7, r8, r10)
            goto L_0x00dc
        L_0x00db:
            throw r0
        L_0x00dc:
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.v.b(com.google.android.exoplayer2.upstream.m$c, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public byte[] a(UUID uuid, q.a aVar) throws y {
        String str;
        UUID uuid2 = uuid;
        q.a aVar2 = aVar;
        String str2 = aVar2.f4338b;
        if (this.f4354c || TextUtils.isEmpty(str2)) {
            str2 = this.f4353b;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid3 = f.f27570e;
            if (uuid3.equals(uuid2)) {
                str = "text/xml";
            } else {
                str = f.f27568c.equals(uuid2) ? "application/json" : "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid3.equals(uuid2)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f4355d) {
                hashMap.putAll(this.f4355d);
            }
            return b(this.f4352a, str2, aVar2.f4337a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        a.g(uri, "The uri must be set.");
        throw new y(new e(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null), Uri.EMPTY, p0.f3768g, 0, new IllegalStateException("No license URL"));
    }

    public byte[] c(UUID uuid, q.d dVar) throws y {
        return b(this.f4352a, dVar.f4340b + "&signedRequest=" + e0.o(dVar.f4339a), (byte[]) null, Collections.emptyMap());
    }
}
