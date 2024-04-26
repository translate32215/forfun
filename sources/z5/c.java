package z5;

import d5.i;
import d5.j;
import d5.o;

/* compiled from: BundledExtractorsAdapter */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final o f28544a;

    /* renamed from: b  reason: collision with root package name */
    public i f28545b;

    /* renamed from: c  reason: collision with root package name */
    public j f28546c;

    public c(o oVar) {
        this.f28544a = oVar;
    }

    public long a() {
        j jVar = this.f28546c;
        if (jVar != null) {
            return jVar.l();
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0.f13029d != r11) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r0.f13029d != r11) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.exoplayer2.upstream.c r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, d5.k r15) throws java.io.IOException {
        /*
            r7 = this;
            d5.f r6 = new d5.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f28546c = r6
            d5.i r8 = r7.f28545b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            d5.o r8 = r7.f28544a
            d5.i[] r8 = r8.d(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0021
            r8 = r8[r13]
            r7.f28545b = r8
            goto L_0x00ae
        L_0x0021:
            int r10 = r8.length
            r0 = 0
        L_0x0023:
            if (r0 >= r10) goto L_0x0067
            r1 = r8[r0]
            boolean r2 = r1.e(r6)     // Catch:{ EOFException -> 0x0050, all -> 0x003d }
            if (r2 == 0) goto L_0x0032
            r7.f28545b = r1     // Catch:{ EOFException -> 0x0050, all -> 0x003d }
            r6.f13031f = r13
            goto L_0x0067
        L_0x0032:
            d5.i r1 = r7.f28545b
            if (r1 != 0) goto L_0x005e
            long r1 = r6.f13029d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x005c
            goto L_0x005e
        L_0x003d:
            r8 = move-exception
            d5.i r9 = r7.f28545b
            if (r9 != 0) goto L_0x004a
            long r9 = r6.f13029d
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r14 = 0
        L_0x004a:
            v6.a.d(r14)
            r6.f13031f = r13
            throw r8
        L_0x0050:
            d5.i r1 = r7.f28545b
            if (r1 != 0) goto L_0x005e
            long r1 = r6.f13029d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r1 = 0
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            v6.a.d(r1)
            r6.f13031f = r13
            int r0 = r0 + 1
            goto L_0x0023
        L_0x0067:
            d5.i r10 = r7.f28545b
            if (r10 != 0) goto L_0x00ae
            z5.h0 r10 = new z5.h0
            java.lang.String r11 = "None of the available extractors ("
            java.lang.StringBuilder r11 = android.support.v4.media.a.a(r11)
            int r12 = v6.e0.f26436a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L_0x007a:
            int r14 = r8.length
            if (r13 >= r14) goto L_0x0097
            r14 = r8[r13]
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getSimpleName()
            r12.append(r14)
            int r14 = r8.length
            int r14 = r14 + -1
            if (r13 >= r14) goto L_0x0094
            java.lang.String r14 = ", "
            r12.append(r14)
        L_0x0094:
            int r13 = r13 + 1
            goto L_0x007a
        L_0x0097:
            java.lang.String r8 = r12.toString()
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            r10.<init>(r8, r9)
            throw r10
        L_0x00ae:
            d5.i r8 = r7.f28545b
            r8.i(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.c.b(com.google.android.exoplayer2.upstream.c, android.net.Uri, java.util.Map, long, long, d5.k):void");
    }
}
