package ue;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import ke.r;
import ke.t;
import re.f;

/* compiled from: HttpLoggingInterceptor */
public final class a implements t {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f26200d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final C0260a f26201a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Set<String> f26202b = Collections.emptySet();

    /* renamed from: c  reason: collision with root package name */
    public volatile int f26203c = 1;

    /* renamed from: ue.a$a  reason: collision with other inner class name */
    /* compiled from: HttpLoggingInterceptor */
    public interface C0260a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0260a f26204a = new C0261a();

        /* renamed from: ue.a$a$a  reason: collision with other inner class name */
        /* compiled from: HttpLoggingInterceptor */
        public class C0261a implements C0260a {
            public void a(String str) {
                f.f24794a.l(4, str, (Throwable) null);
            }
        }
    }

    public a() {
        C0260a aVar = C0260a.f26204a;
        this.f26201a = aVar;
    }

    public static boolean b(r rVar) {
        String c10 = rVar.c("Content-Encoding");
        return c10 != null && !c10.equalsIgnoreCase("identity") && !c10.equalsIgnoreCase("gzip");
    }

    public static boolean c(ve.f fVar) {
        try {
            ve.f fVar2 = new ve.f();
            long j10 = fVar.f26740b;
            fVar.t(fVar2, 0, j10 < 64 ? j10 : 64);
            for (int i10 = 0; i10 < 16; i10++) {
                if (fVar2.B()) {
                    return true;
                }
                int i02 = fVar2.i0();
                if (Character.isISOControl(i02) && !Character.isWhitespace(i02)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ke.d0 a(ke.t.a r20) throws java.io.IOException {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.f26203c
            r2 = r20
            oe.f r2 = (oe.f) r2
            ke.z r3 = r2.f23704f
            r4 = 1
            if (r0 != r4) goto L_0x0012
            ke.d0 r0 = r2.a(r3)
            return r0
        L_0x0012:
            r5 = 4
            if (r0 != r5) goto L_0x0017
            r5 = 1
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            if (r5 != 0) goto L_0x0020
            r6 = 3
            if (r0 != r6) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            ke.c0 r6 = r3.f20883d
            if (r6 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            ne.c r2 = r2.f23702d
            java.lang.String r7 = "--> "
            java.lang.StringBuilder r7 = android.support.v4.media.a.a(r7)
            java.lang.String r8 = r3.f20881b
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            ke.s r8 = r3.f20880a
            r7.append(r8)
            java.lang.String r8 = ""
            if (r2 == 0) goto L_0x0052
            java.lang.String r9 = " "
            java.lang.StringBuilder r9 = android.support.v4.media.a.a(r9)
            ke.x r2 = r2.f22499g
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            goto L_0x0053
        L_0x0052:
            r2 = r8
        L_0x0053:
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r0 != 0) goto L_0x0074
            if (r4 == 0) goto L_0x0074
            java.lang.StringBuilder r2 = t.f.a(r2, r9)
            long r10 = r6.a()
            r2.append(r10)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
        L_0x0074:
            ue.a$a r10 = r1.f26201a
            ue.a$a$a r10 = (ue.a.C0260a.C0261a) r10
            r10.a(r2)
            java.lang.String r2 = "-byte body omitted)"
            r10 = -1
            if (r0 == 0) goto L_0x018f
            if (r4 == 0) goto L_0x00c1
            ke.u r12 = r6.b()
            if (r12 == 0) goto L_0x00a1
            ue.a$a r12 = r1.f26201a
            java.lang.String r13 = "Content-Type: "
            java.lang.StringBuilder r13 = android.support.v4.media.a.a(r13)
            ke.u r14 = r6.b()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            ue.a$a$a r12 = (ue.a.C0260a.C0261a) r12
            r12.a(r13)
        L_0x00a1:
            long r12 = r6.a()
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 == 0) goto L_0x00c1
            ue.a$a r10 = r1.f26201a
            java.lang.String r11 = "Content-Length: "
            java.lang.StringBuilder r11 = android.support.v4.media.a.a(r11)
            long r12 = r6.a()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            ue.a$a$a r10 = (ue.a.C0260a.C0261a) r10
            r10.a(r11)
        L_0x00c1:
            ke.r r10 = r3.f20882c
            int r11 = r10.g()
            r12 = 0
        L_0x00c8:
            if (r12 >= r11) goto L_0x00e4
            java.lang.String r13 = r10.d(r12)
            java.lang.String r14 = "Content-Type"
            boolean r14 = r14.equalsIgnoreCase(r13)
            if (r14 != 0) goto L_0x00e1
            java.lang.String r14 = "Content-Length"
            boolean r13 = r14.equalsIgnoreCase(r13)
            if (r13 != 0) goto L_0x00e1
            r1.d(r10, r12)
        L_0x00e1:
            int r12 = r12 + 1
            goto L_0x00c8
        L_0x00e4:
            java.lang.String r10 = "--> END "
            if (r5 == 0) goto L_0x017b
            if (r4 != 0) goto L_0x00ec
            goto L_0x017b
        L_0x00ec:
            ke.r r4 = r3.f20882c
            boolean r4 = b(r4)
            if (r4 == 0) goto L_0x0109
            ue.a$a r4 = r1.f26201a
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r10)
            java.lang.String r10 = r3.f20881b
            java.lang.String r11 = " (encoded body omitted)"
            java.lang.String r6 = androidx.activity.e.a(r6, r10, r11)
            ue.a$a$a r4 = (ue.a.C0260a.C0261a) r4
            r4.a(r6)
            goto L_0x018f
        L_0x0109:
            ve.f r4 = new ve.f
            r4.<init>()
            r6.c(r4)
            java.nio.charset.Charset r11 = f26200d
            ke.u r12 = r6.b()
            if (r12 == 0) goto L_0x011d
            java.nio.charset.Charset r11 = r12.a(r11)
        L_0x011d:
            ue.a$a r12 = r1.f26201a
            ue.a$a$a r12 = (ue.a.C0260a.C0261a) r12
            r12.a(r8)
            boolean r12 = c(r4)
            if (r12 == 0) goto L_0x0157
            ue.a$a r12 = r1.f26201a
            java.lang.String r4 = r4.d0(r11)
            ue.a$a$a r12 = (ue.a.C0260a.C0261a) r12
            r12.a(r4)
            ue.a$a r4 = r1.f26201a
            java.lang.StringBuilder r10 = android.support.v4.media.a.a(r10)
            java.lang.String r11 = r3.f20881b
            r10.append(r11)
            r10.append(r9)
            long r11 = r6.a()
            r10.append(r11)
            r10.append(r7)
            java.lang.String r6 = r10.toString()
            ue.a$a$a r4 = (ue.a.C0260a.C0261a) r4
            r4.a(r6)
            goto L_0x018f
        L_0x0157:
            ue.a$a r4 = r1.f26201a
            java.lang.StringBuilder r10 = android.support.v4.media.a.a(r10)
            java.lang.String r11 = r3.f20881b
            r10.append(r11)
            java.lang.String r11 = " (binary "
            r10.append(r11)
            long r11 = r6.a()
            r10.append(r11)
            r10.append(r2)
            java.lang.String r6 = r10.toString()
            ue.a$a$a r4 = (ue.a.C0260a.C0261a) r4
            r4.a(r6)
            goto L_0x018f
        L_0x017b:
            ue.a$a r4 = r1.f26201a
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r10)
            java.lang.String r10 = r3.f20881b
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            ue.a$a$a r4 = (ue.a.C0260a.C0261a) r4
            r4.a(r6)
        L_0x018f:
            long r10 = java.lang.System.nanoTime()
            r4 = r20
            oe.f r4 = (oe.f) r4     // Catch:{ Exception -> 0x033f }
            ne.f r6 = r4.f23700b     // Catch:{ Exception -> 0x033f }
            oe.c r12 = r4.f23701c     // Catch:{ Exception -> 0x033f }
            ne.c r13 = r4.f23702d     // Catch:{ Exception -> 0x033f }
            ke.d0 r3 = r4.b(r3, r6, r12, r13)     // Catch:{ Exception -> 0x033f }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r12 = java.lang.System.nanoTime()
            long r12 = r12 - r10
            long r10 = r4.toMillis(r12)
            ke.e0 r4 = r3.f20670g
            long r12 = r4.a()
            r14 = -1
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x01ca
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            java.lang.String r14 = "-byte"
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            goto L_0x01cc
        L_0x01ca:
            java.lang.String r6 = "unknown-length"
        L_0x01cc:
            ue.a$a r14 = r1.f26201a
            java.lang.String r15 = "<-- "
            java.lang.StringBuilder r15 = android.support.v4.media.a.a(r15)
            r16 = r7
            int r7 = r3.f20666c
            r15.append(r7)
            java.lang.String r7 = r3.f20667d
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x01e9
            r7 = 32
            r17 = r12
            r12 = r8
            goto L_0x01fa
        L_0x01e9:
            r7 = 32
            r17 = r12
            java.lang.StringBuilder r12 = q.c.a(r7)
            java.lang.String r13 = r3.f20667d
            r12.append(r13)
            java.lang.String r12 = r12.toString()
        L_0x01fa:
            r15.append(r12)
            r15.append(r7)
            ke.z r7 = r3.f20664a
            ke.s r7 = r7.f20880a
            r15.append(r7)
            r15.append(r9)
            r15.append(r10)
            java.lang.String r7 = "ms"
            r15.append(r7)
            if (r0 != 0) goto L_0x021d
            java.lang.String r7 = ", "
            java.lang.String r9 = " body"
            java.lang.String r6 = q.b.a(r7, r6, r9)
            goto L_0x021e
        L_0x021d:
            r6 = r8
        L_0x021e:
            r15.append(r6)
            r6 = 41
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            ue.a$a$a r14 = (ue.a.C0260a.C0261a) r14
            r14.a(r6)
            if (r0 == 0) goto L_0x033e
            ke.r r0 = r3.f20669f
            int r6 = r0.g()
            r7 = 0
        L_0x0238:
            if (r7 >= r6) goto L_0x0240
            r1.d(r0, r7)
            int r7 = r7 + 1
            goto L_0x0238
        L_0x0240:
            if (r5 == 0) goto L_0x0335
            boolean r5 = oe.e.b(r3)
            if (r5 != 0) goto L_0x024a
            goto L_0x0335
        L_0x024a:
            ke.r r5 = r3.f20669f
            boolean r5 = b(r5)
            if (r5 == 0) goto L_0x025d
            ue.a$a r0 = r1.f26201a
            ue.a$a$a r0 = (ue.a.C0260a.C0261a) r0
            java.lang.String r2 = "<-- END HTTP (encoded body omitted)"
            r0.a(r2)
            goto L_0x033e
        L_0x025d:
            ve.h r5 = r4.o()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.p(r6)
            ve.f r5 = r5.c()
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r0 = r0.c(r6)
            java.lang.String r6 = "gzip"
            boolean r0 = r6.equalsIgnoreCase(r0)
            r6 = 0
            if (r0 == 0) goto L_0x02a6
            long r9 = r5.f26740b
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            ve.m r7 = new ve.m     // Catch:{ all -> 0x029d }
            ve.f r5 = r5.clone()     // Catch:{ all -> 0x029d }
            r7.<init>(r5)     // Catch:{ all -> 0x029d }
            ve.f r5 = new ve.f     // Catch:{ all -> 0x029a }
            r5.<init>()     // Catch:{ all -> 0x029a }
            r5.p0(r7)     // Catch:{ all -> 0x029a }
            ve.n r6 = r7.f26753d
            r6.close()
            r6 = r0
            goto L_0x02a6
        L_0x029a:
            r0 = move-exception
            r6 = r7
            goto L_0x029e
        L_0x029d:
            r0 = move-exception
        L_0x029e:
            if (r6 == 0) goto L_0x02a5
            ve.n r2 = r6.f26753d
            r2.close()
        L_0x02a5:
            throw r0
        L_0x02a6:
            java.nio.charset.Charset r0 = f26200d
            ke.u r4 = r4.d()
            if (r4 == 0) goto L_0x02b2
            java.nio.charset.Charset r0 = r4.a(r0)
        L_0x02b2:
            boolean r4 = c(r5)
            if (r4 != 0) goto L_0x02d9
            ue.a$a r0 = r1.f26201a
            ue.a$a$a r0 = (ue.a.C0260a.C0261a) r0
            r0.a(r8)
            ue.a$a r0 = r1.f26201a
            java.lang.String r4 = "<-- END HTTP (binary "
            java.lang.StringBuilder r4 = android.support.v4.media.a.a(r4)
            long r5 = r5.f26740b
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            ue.a$a$a r0 = (ue.a.C0260a.C0261a) r0
            r0.a(r2)
            return r3
        L_0x02d9:
            r9 = 0
            int r2 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x02f5
            ue.a$a r2 = r1.f26201a
            ue.a$a$a r2 = (ue.a.C0260a.C0261a) r2
            r2.a(r8)
            ue.a$a r2 = r1.f26201a
            ve.f r4 = r5.clone()
            java.lang.String r0 = r4.d0(r0)
            ue.a$a$a r2 = (ue.a.C0260a.C0261a) r2
            r2.a(r0)
        L_0x02f5:
            java.lang.String r0 = "<-- END HTTP ("
            if (r6 == 0) goto L_0x031b
            ue.a$a r2 = r1.f26201a
            java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
            long r4 = r5.f26740b
            r0.append(r4)
            java.lang.String r4 = "-byte, "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = "-gzipped-byte body)"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            ue.a$a$a r2 = (ue.a.C0260a.C0261a) r2
            r2.a(r0)
            goto L_0x033e
        L_0x031b:
            ue.a$a r2 = r1.f26201a
            java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
            long r4 = r5.f26740b
            r0.append(r4)
            r4 = r16
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            ue.a$a$a r2 = (ue.a.C0260a.C0261a) r2
            r2.a(r0)
            goto L_0x033e
        L_0x0335:
            ue.a$a r0 = r1.f26201a
            ue.a$a$a r0 = (ue.a.C0260a.C0261a) r0
            java.lang.String r2 = "<-- END HTTP"
            r0.a(r2)
        L_0x033e:
            return r3
        L_0x033f:
            r0 = move-exception
            ue.a$a r2 = r1.f26201a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            ue.a$a$a r2 = (ue.a.C0260a.C0261a) r2
            r2.a(r3)
            goto L_0x035a
        L_0x0359:
            throw r0
        L_0x035a:
            goto L_0x0359
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.a.a(ke.t$a):ke.d0");
    }

    public final void d(r rVar, int i10) {
        String str;
        int i11 = i10 * 2;
        if (this.f26202b.contains(rVar.f20779a[i11])) {
            str = "██";
        } else {
            str = rVar.f20779a[i11 + 1];
        }
        ((C0260a.C0261a) this.f26201a).a(androidx.fragment.app.a.a(new StringBuilder(), rVar.f20779a[i11], ": ", str));
    }
}
