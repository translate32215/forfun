package m4;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
import n4.c;
import n4.d;
import n4.f;
import n4.g;
import n4.i;
import n4.j;
import n4.k;
import n4.l;
import n4.n;
import n4.o;
import n4.p;
import n4.q;
import n4.r;
import n4.t;
import p4.h;
import qa.e;

/* compiled from: CctTransportBackend */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final oa.a f21701a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f21702b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f21703c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f21704d = c(a.f21696c);

    /* renamed from: e  reason: collision with root package name */
    public final v4.a f21705e;

    /* renamed from: f  reason: collision with root package name */
    public final v4.a f21706f;

    /* renamed from: g  reason: collision with root package name */
    public final int f21707g;

    /* compiled from: CctTransportBackend */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f21708a;

        /* renamed from: b  reason: collision with root package name */
        public final o f21709b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21710c;

        public a(URL url, o oVar, String str) {
            this.f21708a = url;
            this.f21709b = oVar;
            this.f21710c = str;
        }
    }

    /* renamed from: m4.b$b  reason: collision with other inner class name */
    /* compiled from: CctTransportBackend */
    public static final class C0194b {

        /* renamed from: a  reason: collision with root package name */
        public final int f21711a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f21712b;

        /* renamed from: c  reason: collision with root package name */
        public final long f21713c;

        public C0194b(int i10, URL url, long j10) {
            this.f21711a = i10;
            this.f21712b = url;
            this.f21713c = j10;
        }
    }

    public b(Context context, v4.a aVar, v4.a aVar2) {
        e eVar = new e();
        c cVar = c.f21911a;
        eVar.a(o.class, cVar);
        eVar.a(i.class, cVar);
        f fVar = f.f21924a;
        eVar.a(r.class, fVar);
        eVar.a(l.class, fVar);
        d dVar = d.f21913a;
        eVar.a(p.class, dVar);
        eVar.a(j.class, dVar);
        n4.b bVar = n4.b.f21898a;
        eVar.a(n4.a.class, bVar);
        eVar.a(n4.h.class, bVar);
        n4.e eVar2 = n4.e.f21916a;
        eVar.a(q.class, eVar2);
        eVar.a(k.class, eVar2);
        g gVar = g.f21932a;
        eVar.a(t.class, gVar);
        eVar.a(n.class, gVar);
        eVar.f24252d = true;
        this.f21701a = new qa.d(eVar);
        this.f21703c = context;
        this.f21702b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f21705e = aVar2;
        this.f21706f = aVar;
        this.f21707g = 40000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(j.f.a("Invalid url: ", str), e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x02bb A[Catch:{ IOException -> 0x02ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02cd A[Catch:{ IOException -> 0x02ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.datatransport.runtime.backends.c a(com.google.android.datatransport.runtime.backends.b r35) {
        /*
            r34 = this;
            r1 = r34
            com.google.android.datatransport.runtime.backends.c$a r2 = com.google.android.datatransport.runtime.backends.c.a.TRANSIENT_ERROR
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3 = r35
            p4.a r3 = (p4.a) r3
            java.lang.Iterable<o4.f> r4 = r3.f23813a
            java.util.Iterator r4 = r4.iterator()
        L_0x0013:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()
            o4.f r5 = (o4.f) r5
            java.lang.String r6 = r5.g()
            boolean r7 = r0.containsKey(r6)
            if (r7 != 0) goto L_0x0035
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r5)
            r0.put(r6, r7)
            goto L_0x0013
        L_0x0035:
            java.lang.Object r6 = r0.get(r6)
            java.util.List r6 = (java.util.List) r6
            r6.add(r5)
            goto L_0x0013
        L_0x003f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x004c:
            boolean r5 = r0.hasNext()
            java.lang.String r6 = "CctTransportBackend"
            r7 = 0
            if (r5 == 0) goto L_0x0277
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getValue()
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            o4.f r8 = (o4.f) r8
            n4.u r18 = n4.u.DEFAULT
            v4.a r9 = r1.f21706f
            long r9 = r9.a()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            v4.a r10 = r1.f21705e
            long r10 = r10.a()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            n4.p$a r11 = n4.p.a.ANDROID_FIREBASE
            java.lang.String r12 = "sdk-version"
            int r12 = r8.f(r12)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r12)
            java.lang.String r12 = "model"
            java.lang.String r21 = r8.a(r12)
            java.lang.String r12 = "hardware"
            java.lang.String r22 = r8.a(r12)
            java.lang.String r12 = "device"
            java.lang.String r23 = r8.a(r12)
            java.lang.String r12 = "product"
            java.lang.String r24 = r8.a(r12)
            java.lang.String r12 = "os-uild"
            java.lang.String r25 = r8.a(r12)
            java.lang.String r12 = "manufacturer"
            java.lang.String r26 = r8.a(r12)
            java.lang.String r12 = "fingerprint"
            java.lang.String r27 = r8.a(r12)
            java.lang.String r12 = "country"
            java.lang.String r29 = r8.a(r12)
            java.lang.String r12 = "locale"
            java.lang.String r28 = r8.a(r12)
            java.lang.String r12 = "mcc_mnc"
            java.lang.String r30 = r8.a(r12)
            java.lang.String r12 = "application_build"
            java.lang.String r31 = r8.a(r12)
            n4.h r8 = new n4.h
            r32 = 0
            r19 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            n4.j r14 = new n4.j
            r14.<init>(r11, r8, r7)
            java.lang.Object r8 = r5.getKey()     // Catch:{ NumberFormatException -> 0x00ec }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x00ec }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x00ec }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x00ec }
            r16 = r7
            r15 = r8
            goto L_0x00f5
        L_0x00ec:
            java.lang.Object r8 = r5.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r15 = r7
            r16 = r8
        L_0x00f5:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0104:
            boolean r8 = r5.hasNext()
            java.lang.String r11 = "Missing required properties:"
            java.lang.String r12 = ""
            if (r8 == 0) goto L_0x0236
            java.lang.Object r8 = r5.next()
            o4.f r8 = (o4.f) r8
            o4.e r13 = r8.d()
            r20 = r0
            l4.b r0 = r13.f22947a
            r17 = r5
            l4.b r5 = new l4.b
            r19 = r12
            java.lang.String r12 = "proto"
            r5.<init>(r12)
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0137
            byte[] r0 = r13.f22948b
            n4.k$b r5 = new n4.k$b
            r5.<init>()
            r5.f21960d = r0
            goto L_0x0158
        L_0x0137:
            l4.b r5 = new l4.b
            java.lang.String r12 = "json"
            r5.<init>(r12)
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x0219
            java.lang.String r0 = new java.lang.String
            byte[] r5 = r13.f22948b
            java.lang.String r12 = "UTF-8"
            java.nio.charset.Charset r12 = java.nio.charset.Charset.forName(r12)
            r0.<init>(r5, r12)
            n4.k$b r5 = new n4.k$b
            r5.<init>()
            r5.f21961e = r0
        L_0x0158:
            long r12 = r8.e()
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r5.f21957a = r0
            long r12 = r8.h()
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r5.f21959c = r0
            java.util.Map r0 = r8.b()
            java.lang.String r12 = "tz-offset"
            java.lang.Object r0 = r0.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x017d
            r12 = 0
            goto L_0x0185
        L_0x017d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r12 = r0.longValue()
        L_0x0185:
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r5.f21962f = r0
            java.lang.String r0 = "net-type"
            int r0 = r8.f(r0)
            android.util.SparseArray<n4.t$b> r12 = n4.t.b.f21982c
            java.lang.Object r0 = r12.get(r0)
            n4.t$b r0 = (n4.t.b) r0
            java.lang.String r12 = "mobile-subtype"
            int r12 = r8.f(r12)
            android.util.SparseArray<n4.t$a> r13 = n4.t.a.f21978d
            java.lang.Object r12 = r13.get(r12)
            n4.t$a r12 = (n4.t.a) r12
            n4.n r13 = new n4.n
            r21 = r2
            r2 = 0
            r13.<init>(r0, r12, r2)
            r5.f21963g = r13
            java.lang.Integer r0 = r8.c()
            if (r0 == 0) goto L_0x01bd
            java.lang.Integer r0 = r8.c()
            r5.f21958b = r0
        L_0x01bd:
            java.lang.Long r0 = r5.f21957a
            if (r0 != 0) goto L_0x01c4
            java.lang.String r12 = " eventTimeMs"
            goto L_0x01c6
        L_0x01c4:
            r12 = r19
        L_0x01c6:
            java.lang.Long r0 = r5.f21959c
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = " eventUptimeMs"
            java.lang.String r12 = j.f.a(r12, r0)
        L_0x01d0:
            java.lang.Long r0 = r5.f21962f
            if (r0 != 0) goto L_0x01da
            java.lang.String r0 = " timezoneOffsetSeconds"
            java.lang.String r12 = j.f.a(r12, r0)
        L_0x01da:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x020f
            n4.k r0 = new n4.k
            java.lang.Long r2 = r5.f21957a
            long r23 = r2.longValue()
            java.lang.Integer r2 = r5.f21958b
            java.lang.Long r8 = r5.f21959c
            long r26 = r8.longValue()
            byte[] r8 = r5.f21960d
            java.lang.String r11 = r5.f21961e
            java.lang.Long r12 = r5.f21962f
            long r30 = r12.longValue()
            n4.t r5 = r5.f21963g
            r33 = 0
            r22 = r0
            r25 = r2
            r28 = r8
            r29 = r11
            r32 = r5
            r22.<init>(r23, r25, r26, r28, r29, r30, r32, r33)
            r7.add(r0)
            goto L_0x022e
        L_0x020f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = j.f.a(r11, r12)
            r0.<init>(r2)
            throw r0
        L_0x0219:
            r21 = r2
            java.lang.String r2 = l0.e.f(r6)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r8 = 0
            r5[r8] = r0
            java.lang.String r0 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r0 = java.lang.String.format(r0, r5)
            android.util.Log.w(r2, r0)
        L_0x022e:
            r5 = r17
            r0 = r20
            r2 = r21
            goto L_0x0104
        L_0x0236:
            r20 = r0
            r21 = r2
            r19 = r12
            if (r9 != 0) goto L_0x0241
            java.lang.String r12 = " requestTimeMs"
            goto L_0x0243
        L_0x0241:
            r12 = r19
        L_0x0243:
            if (r10 != 0) goto L_0x024b
            java.lang.String r0 = " requestUptimeMs"
            java.lang.String r12 = j.f.a(r12, r0)
        L_0x024b:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x026d
            n4.l r0 = new n4.l
            long r5 = r9.longValue()
            long r12 = r10.longValue()
            r19 = 0
            r9 = r0
            r10 = r5
            r17 = r7
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19)
            r4.add(r0)
            r0 = r20
            r2 = r21
            goto L_0x004c
        L_0x026d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = j.f.a(r11, r12)
            r0.<init>(r2)
            throw r0
        L_0x0277:
            r21 = r2
            n4.i r0 = new n4.i
            r0.<init>(r4)
            java.net.URL r2 = r1.f21704d
            byte[] r3 = r3.f23814b
            if (r3 == 0) goto L_0x02a2
            r3 = r35
            p4.a r3 = (p4.a) r3     // Catch:{ IllegalArgumentException -> 0x029d }
            byte[] r3 = r3.f23814b     // Catch:{ IllegalArgumentException -> 0x029d }
            m4.a r3 = m4.a.a(r3)     // Catch:{ IllegalArgumentException -> 0x029d }
            java.lang.String r4 = r3.f21700b     // Catch:{ IllegalArgumentException -> 0x029d }
            if (r4 == 0) goto L_0x0293
            goto L_0x0294
        L_0x0293:
            r4 = r7
        L_0x0294:
            java.lang.String r3 = r3.f21699a     // Catch:{ IllegalArgumentException -> 0x029d }
            if (r3 == 0) goto L_0x02a3
            java.net.URL r2 = c(r3)     // Catch:{ IllegalArgumentException -> 0x029d }
            goto L_0x02a3
        L_0x029d:
            com.google.android.datatransport.runtime.backends.c r0 = com.google.android.datatransport.runtime.backends.c.a()
            return r0
        L_0x02a2:
            r4 = r7
        L_0x02a3:
            r3 = 5
            r8 = -1
            m4.b$a r5 = new m4.b$a     // Catch:{ IOException -> 0x02ff }
            r5.<init>(r2, r0, r4)     // Catch:{ IOException -> 0x02ff }
            r1.c r0 = new r1.c     // Catch:{ IOException -> 0x02ff }
            r0.<init>((m4.b) r1)     // Catch:{ IOException -> 0x02ff }
        L_0x02b0:
            java.lang.Object r2 = r0.apply(r5)     // Catch:{ IOException -> 0x02ff }
            r4 = r2
            m4.b$b r4 = (m4.b.C0194b) r4     // Catch:{ IOException -> 0x02ff }
            java.net.URL r10 = r4.f21712b     // Catch:{ IOException -> 0x02ff }
            if (r10 == 0) goto L_0x02cd
            java.lang.String r11 = "Following redirect to: %s"
            l0.e.c(r6, r11, r10)     // Catch:{ IOException -> 0x02ff }
            java.net.URL r4 = r4.f21712b     // Catch:{ IOException -> 0x02ff }
            m4.b$a r10 = new m4.b$a     // Catch:{ IOException -> 0x02ff }
            n4.o r11 = r5.f21709b     // Catch:{ IOException -> 0x02ff }
            java.lang.String r5 = r5.f21710c     // Catch:{ IOException -> 0x02ff }
            r10.<init>(r4, r11, r5)     // Catch:{ IOException -> 0x02ff }
            r5 = r10
            goto L_0x02ce
        L_0x02cd:
            r5 = r7
        L_0x02ce:
            if (r5 == 0) goto L_0x02d5
            int r3 = r3 + -1
            r4 = 1
            if (r3 >= r4) goto L_0x02b0
        L_0x02d5:
            m4.b$b r2 = (m4.b.C0194b) r2     // Catch:{ IOException -> 0x02ff }
            int r0 = r2.f21711a     // Catch:{ IOException -> 0x02ff }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 != r3) goto L_0x02e7
            long r2 = r2.f21713c     // Catch:{ IOException -> 0x02ff }
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a     // Catch:{ IOException -> 0x02ff }
            com.google.android.datatransport.runtime.backends.c$a r4 = com.google.android.datatransport.runtime.backends.c.a.OK     // Catch:{ IOException -> 0x02ff }
            r0.<init>(r4, r2)     // Catch:{ IOException -> 0x02ff }
            return r0
        L_0x02e7:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r2) goto L_0x02f5
            r2 = 404(0x194, float:5.66E-43)
            if (r0 != r2) goto L_0x02f0
            goto L_0x02f5
        L_0x02f0:
            com.google.android.datatransport.runtime.backends.c r0 = com.google.android.datatransport.runtime.backends.c.a()     // Catch:{ IOException -> 0x02ff }
            return r0
        L_0x02f5:
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a     // Catch:{ IOException -> 0x02ff }
            r2 = r21
            r0.<init>(r2, r8)     // Catch:{ IOException -> 0x02fd }
            return r0
        L_0x02fd:
            r0 = move-exception
            goto L_0x0302
        L_0x02ff:
            r0 = move-exception
            r2 = r21
        L_0x0302:
            java.lang.String r3 = "Could not make request to the backend"
            l0.e.e(r6, r3, r0)
            com.google.android.datatransport.runtime.backends.a r0 = new com.google.android.datatransport.runtime.backends.a
            r0.<init>(r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.a(com.google.android.datatransport.runtime.backends.b):com.google.android.datatransport.runtime.backends.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ba, code lost:
        if (n4.t.a.f21978d.get(r0) != null) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o4.f b(o4.f r6) {
        /*
            r5 = this;
            android.net.ConnectivityManager r0 = r5.f21702b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            o4.f$a r6 = r6.i()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Map r2 = r6.c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "sdk-version"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "model"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "hardware"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "device"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "product"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.ID
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "os-uild"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "manufacturer"
            r2.put(r3, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.util.Map r2 = r6.c()
            java.lang.String r3 = "fingerprint"
            r2.put(r3, r1)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r2 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r2)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map r3 = r6.c()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r3.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L_0x0090
            n4.t$b r2 = n4.t.b.NONE
            r2 = -1
            goto L_0x0094
        L_0x0090:
            int r2 = r0.getType()
        L_0x0094:
            java.util.Map r3 = r6.c()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "net-type"
            r3.put(r4, r2)
            r2 = 0
            if (r0 != 0) goto L_0x00a7
            n4.t$a r0 = n4.t.a.UNKNOWN_MOBILE_SUBTYPE
            goto L_0x00bd
        L_0x00a7:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L_0x00b2
            n4.t$a r0 = n4.t.a.COMBINED
            r0 = 100
            goto L_0x00be
        L_0x00b2:
            android.util.SparseArray<n4.t$a> r3 = n4.t.a.f21978d
            java.lang.Object r3 = r3.get(r0)
            n4.t$a r3 = (n4.t.a) r3
            if (r3 == 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            java.util.Map r3 = r6.c()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "mobile-subtype"
            r3.put(r4, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.util.Map r3 = r6.c()
            java.lang.String r4 = "country"
            r3.put(r4, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.util.Map r3 = r6.c()
            java.lang.String r4 = "locale"
            r3.put(r4, r0)
            android.content.Context r0 = r5.f21703c
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimOperator()
            java.util.Map r3 = r6.c()
            java.lang.String r4 = "mcc_mnc"
            r3.put(r4, r0)
            android.content.Context r0 = r5.f21703c
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0115 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0115 }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0115 }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0115 }
            goto L_0x011d
        L_0x0115:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            l0.e.e(r2, r3, r0)
        L_0x011d:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.util.Map r1 = r6.c()
            java.lang.String r2 = "application_build"
            r1.put(r2, r0)
            o4.f r6 = r6.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.b(o4.f):o4.f");
    }
}
