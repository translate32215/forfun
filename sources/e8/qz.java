package e8;

import ab.d0;
import ab.x;
import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.hs;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.le;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.ru;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.xd;
import com.google.android.gms.internal.ads.yt;
import com.google.firebase.messaging.FirebaseMessaging;
import o8.g5;
import o8.s4;
import o8.z4;
import r8.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class qz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16215a = 19;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16216b;

    public qz(x xVar) {
        this.f16216b = xVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:(2:162|163)|(2:167|168)|169|170|171|172|222) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:170:0x03d6 */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.we r0 = com.google.android.gms.internal.ads.we.INVALID_AD_UNIT_ID
            int r1 = r15.f16215a
            r2 = 0
            r3 = 1
            r4 = -1
            r6 = 0
            switch(r1) {
                case 0: goto L_0x041c;
                case 1: goto L_0x040e;
                case 2: goto L_0x0400;
                case 3: goto L_0x03f2;
                case 4: goto L_0x03ea;
                case 5: goto L_0x039e;
                case 6: goto L_0x038b;
                case 7: goto L_0x0378;
                case 8: goto L_0x0352;
                case 9: goto L_0x0348;
                case 10: goto L_0x02e2;
                case 11: goto L_0x02d4;
                case 12: goto L_0x0289;
                case 13: goto L_0x00a5;
                case 14: goto L_0x009e;
                case 15: goto L_0x0092;
                case 16: goto L_0x005d;
                case 17: goto L_0x004d;
                case 18: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0425
        L_0x000e:
            java.lang.Object r0 = r15.f16216b
            ab.x r0 = (ab.x) r0
            java.util.ArrayDeque<java.lang.String> r1 = r0.f253d
            monitor-enter(r1)
            android.content.SharedPreferences r2 = r0.f250a     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x004a }
            java.lang.String r3 = r0.f251b     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r4.<init>()     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<java.lang.String> r5 = r0.f253d     // Catch:{ all -> 0x004a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x004a }
        L_0x0028:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x004a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x004a }
            r4.append(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = r0.f252c     // Catch:{ all -> 0x004a }
            r4.append(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0028
        L_0x003d:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r0 = r2.putString(r3, r0)     // Catch:{ all -> 0x004a }
            r0.commit()     // Catch:{ all -> 0x004a }
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            throw r0
        L_0x004d:
            java.lang.Object r0 = r15.f16216b
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            com.google.firebase.messaging.FirebaseMessaging$a r1 = r0.f9701g
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x005c
            r0.g()
        L_0x005c:
            return
        L_0x005d:
            java.lang.Object r0 = r15.f16216b
            r8.a r0 = (r8.a) r0
            java.lang.Object r1 = r0.f24738a
            monitor-enter(r1)
            boolean r4 = r0.b()     // Catch:{ all -> 0x008f }
            if (r4 != 0) goto L_0x006c
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
            goto L_0x008e
        L_0x006c:
            java.lang.String r4 = "WakeLock"
            java.lang.String r5 = r0.f24748k     // Catch:{ all -> 0x008f }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x008f }
            java.lang.String r6 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x008f }
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x008f }
            r0.d()     // Catch:{ all -> 0x008f }
            boolean r4 = r0.b()     // Catch:{ all -> 0x008f }
            if (r4 != 0) goto L_0x0088
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
            goto L_0x008e
        L_0x0088:
            r0.f24740c = r3     // Catch:{ all -> 0x008f }
            r0.e(r2)     // Catch:{ all -> 0x008f }
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
            throw r0
        L_0x0092:
            java.lang.Object r0 = r15.f16216b
            o8.g5 r0 = (o8.g5) r0
            com.google.android.gms.measurement.internal.p r0 = r0.f23223c
            r0.f8867d = r6
            r0.r()
            return
        L_0x009e:
            java.lang.Object r0 = r15.f16216b
            o8.z4 r0 = (o8.z4) r0
            r0.f23647j = r6
            return
        L_0x00a5:
            java.lang.Object r0 = r15.f16216b
            o8.s4 r0 = (o8.s4) r0
            r0.h()
            com.google.android.gms.measurement.internal.l r1 = r0.f8864a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.f3 r1 = r1.f8822q
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x027b
            com.google.android.gms.measurement.internal.l r1 = r0.f8864a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.h3 r1 = r1.f8823r
            long r7 = r1.a()
            com.google.android.gms.measurement.internal.l r1 = r0.f8864a
            com.google.android.gms.measurement.internal.j r1 = r1.t()
            o8.h3 r1 = r1.f8823r
            r9 = 1
            long r9 = r9 + r7
            r1.b(r9)
            com.google.android.gms.measurement.internal.l r1 = r0.f8864a
            r1.getClass()
            r9 = 5
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.l r1 = r0.f8864a
            com.google.android.gms.measurement.internal.h r1 = r1.d()
            o8.a3 r1 = r1.f8800i
            java.lang.String r2 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            r1.a(r2)
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.j r0 = r0.t()
            o8.f3 r0 = r0.f8822q
            r0.a(r3)
            goto L_0x0288
        L_0x00f9:
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.k r1 = r0.b()
            r1.h()
            com.google.android.gms.measurement.internal.o r1 = r0.w()
            com.google.android.gms.measurement.internal.l.l(r1)
            com.google.android.gms.measurement.internal.e r1 = r0.q()
            java.lang.String r1 = r1.m()
            com.google.android.gms.measurement.internal.j r7 = r0.t()
            r7.h()
            com.google.android.gms.measurement.internal.l r8 = r7.f8864a
            z7.b r8 = r8.f8850n
            long r8 = r8.a()
            java.lang.String r10 = r7.f8812g
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0139
            long r12 = r7.f8814i
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x012d
            goto L_0x0139
        L_0x012d:
            android.util.Pair r8 = new android.util.Pair
            boolean r7 = r7.f8813h
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8.<init>(r10, r7)
            goto L_0x0178
        L_0x0139:
            com.google.android.gms.measurement.internal.l r10 = r7.f8864a
            o8.f r10 = r10.f8843g
            o8.u2<java.lang.Long> r12 = o8.v2.f23501b
            long r12 = r10.r(r1, r12)
            long r12 = r12 + r8
            r7.f8814i = r12
            com.google.android.gms.measurement.internal.l r8 = r7.f8864a     // Catch:{ Exception -> 0x015b }
            android.content.Context r8 = r8.f8837a     // Catch:{ Exception -> 0x015b }
            b7.a$a r8 = b7.a.a(r8)     // Catch:{ Exception -> 0x015b }
            r7.f8812g = r11     // Catch:{ Exception -> 0x015b }
            java.lang.String r9 = r8.f3648a     // Catch:{ Exception -> 0x015b }
            if (r9 == 0) goto L_0x0156
            r7.f8812g = r9     // Catch:{ Exception -> 0x015b }
        L_0x0156:
            boolean r8 = r8.f3649b     // Catch:{ Exception -> 0x015b }
            r7.f8813h = r8     // Catch:{ Exception -> 0x015b }
            goto L_0x016b
        L_0x015b:
            r8 = move-exception
            com.google.android.gms.measurement.internal.l r9 = r7.f8864a
            com.google.android.gms.measurement.internal.h r9 = r9.d()
            o8.a3 r9 = r9.f8804m
            java.lang.String r10 = "Unable to get advertising id"
            r9.b(r10, r8)
            r7.f8812g = r11
        L_0x016b:
            android.util.Pair r8 = new android.util.Pair
            java.lang.String r9 = r7.f8812g
            boolean r7 = r7.f8813h
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8.<init>(r9, r7)
        L_0x0178:
            o8.f r7 = r0.f8843g
            boolean r7 = r7.u()
            if (r7 == 0) goto L_0x026f
            java.lang.Object r7 = r8.second
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x026f
            java.lang.Object r7 = r8.first
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0196
            goto L_0x026f
        L_0x0196:
            com.google.android.gms.measurement.internal.o r7 = r0.w()
            r7.k()
            com.google.android.gms.measurement.internal.l r7 = r7.f8864a
            android.content.Context r7 = r7.f8837a
            java.lang.String r9 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r9)
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7
            if (r7 == 0) goto L_0x01b0
            android.net.NetworkInfo r7 = r7.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x01b0 }
            goto L_0x01b1
        L_0x01b0:
            r7 = r6
        L_0x01b1:
            if (r7 == 0) goto L_0x0263
            boolean r7 = r7.isConnected()
            if (r7 == 0) goto L_0x0263
            com.google.android.gms.measurement.internal.r r7 = r0.A()
            com.google.android.gms.measurement.internal.e r9 = r0.q()
            com.google.android.gms.measurement.internal.l r9 = r9.f8864a
            o8.f r9 = r9.f8843g
            r9.q()
            java.lang.Object r8 = r8.first
            java.lang.String r8 = (java.lang.String) r8
            com.google.android.gms.measurement.internal.j r9 = r0.t()
            o8.h3 r9 = r9.f8823r
            long r9 = r9.a()
            long r9 = r9 + r4
            r7.getClass()
            com.google.android.gms.common.internal.i.e(r8)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            com.google.android.gms.common.internal.i.e(r1)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r5 = 2
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r13 = 43042(0xa822, double:2.12656E-319)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r12[r2] = r13     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            int r13 = r7.l0()     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r12[r3] = r13     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            java.lang.String r13 = "v%s.%s"
            java.lang.String r12 = java.lang.String.format(r13, r12)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r4[r2] = r12     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r4[r3] = r8     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r4[r5] = r1     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r3 = 3
            java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r4[r3] = r5     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            java.lang.String r3 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s"
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            com.google.android.gms.measurement.internal.l r4 = r7.f8864a     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            o8.f r4 = r4.f8843g     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            java.lang.String r5 = "debug.deferred.deeplink"
            java.lang.String r4 = r4.j(r5, r11)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            boolean r4 = r1.equals(r4)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            if (r4 == 0) goto L_0x0228
            java.lang.String r4 = "&ddl_test=1"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
        L_0x0228:
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r4.<init>(r3)     // Catch:{ MalformedURLException -> 0x0231, IllegalArgumentException -> 0x022f }
            r6 = r4
            goto L_0x0243
        L_0x022f:
            r3 = move-exception
            goto L_0x0232
        L_0x0231:
            r3 = move-exception
        L_0x0232:
            com.google.android.gms.measurement.internal.l r4 = r7.f8864a
            com.google.android.gms.measurement.internal.h r4 = r4.d()
            o8.a3 r4 = r4.f8797f
            java.lang.String r3 = r3.getMessage()
            java.lang.String r5 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r4.b(r5, r3)
        L_0x0243:
            if (r6 == 0) goto L_0x0288
            com.google.android.gms.measurement.internal.o r3 = r0.w()
            o8.v3 r4 = new o8.v3
            r4.<init>(r0, r2)
            r3.h()
            r3.k()
            com.google.android.gms.measurement.internal.l r0 = r3.f8864a
            com.google.android.gms.measurement.internal.k r0 = r0.b()
            o8.v4 r2 = new o8.v4
            r2.<init>(r3, r1, r6, r4)
            r0.q(r2)
            goto L_0x0288
        L_0x0263:
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8800i
            java.lang.String r1 = "Network is not available for Deferred Deep Link request. Skipping"
            r0.a(r1)
            goto L_0x0288
        L_0x026f:
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8804m
            java.lang.String r1 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
            r0.a(r1)
            goto L_0x0288
        L_0x027b:
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8804m
            java.lang.String r1 = "Deferred Deep Link already retrieved. Not fetching again."
            r0.a(r1)
        L_0x0288:
            return
        L_0x0289:
            java.lang.Object r0 = r15.f16216b
            com.google.android.gms.internal.ads.ru r0 = (com.google.android.gms.internal.ads.ru) r0
            java.lang.Object r0 = r0.f8072c
            monitor-enter(r0)
            java.lang.Object r1 = r15.f16216b     // Catch:{ all -> 0x02d1 }
            r3 = r1
            com.google.android.gms.internal.ads.ru r3 = (com.google.android.gms.internal.ads.ru) r3     // Catch:{ all -> 0x02d1 }
            boolean r3 = r3.f8073d     // Catch:{ all -> 0x02d1 }
            if (r3 == 0) goto L_0x02ca
            r3 = r1
            com.google.android.gms.internal.ads.ru r3 = (com.google.android.gms.internal.ads.ru) r3     // Catch:{ all -> 0x02d1 }
            boolean r3 = r3.f8074e     // Catch:{ all -> 0x02d1 }
            if (r3 == 0) goto L_0x02ca
            com.google.android.gms.internal.ads.ru r1 = (com.google.android.gms.internal.ads.ru) r1     // Catch:{ all -> 0x02d1 }
            r1.f8073d = r2     // Catch:{ all -> 0x02d1 }
            java.lang.String r1 = "App went background"
            l0.e.E(r1)     // Catch:{ all -> 0x02d1 }
            java.lang.Object r1 = r15.f16216b     // Catch:{ all -> 0x02d1 }
            com.google.android.gms.internal.ads.ru r1 = (com.google.android.gms.internal.ads.ru) r1     // Catch:{ all -> 0x02d1 }
            java.util.List<e8.yg0> r1 = r1.f8075f     // Catch:{ all -> 0x02d1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x02d1 }
        L_0x02b3:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x02d1 }
            if (r3 == 0) goto L_0x02cf
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x02d1 }
            e8.yg0 r3 = (e8.yg0) r3     // Catch:{ all -> 0x02d1 }
            r3.a(r2)     // Catch:{ Exception -> 0x02c3 }
            goto L_0x02b3
        L_0x02c3:
            r3 = move-exception
            java.lang.String r4 = ""
            l0.e.C(r4, r3)     // Catch:{ all -> 0x02d1 }
            goto L_0x02b3
        L_0x02ca:
            java.lang.String r1 = "App is still foreground"
            l0.e.E(r1)     // Catch:{ all -> 0x02d1 }
        L_0x02cf:
            monitor-exit(r0)     // Catch:{ all -> 0x02d1 }
            return
        L_0x02d1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02d1 }
            throw r1
        L_0x02d4:
            java.lang.Object r0 = r15.f16216b
            com.google.android.gms.internal.ads.yt r0 = (com.google.android.gms.internal.ads.yt) r0
            boolean r1 = r0.O
            if (r1 != 0) goto L_0x02e1
            e8.re0 r1 = r0.f8657x
            r1.h(r0)
        L_0x02e1:
            return
        L_0x02e2:
            java.lang.Object r0 = r15.f16216b
            com.google.android.gms.internal.ads.hs r0 = (com.google.android.gms.internal.ads.hs) r0
            r0.getClass()
            com.google.android.gms.internal.ads.fr r1 = r0.f6894a     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            dalvik.system.DexClassLoader r2 = r1.f6481c     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            byte[] r1 = r1.f6483e     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            java.lang.String r3 = r0.f6895b     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            java.lang.String r1 = r0.a(r1, r3)     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            java.lang.Class r1 = r2.loadClass(r1)     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            if (r1 != 0) goto L_0x0301
            java.util.concurrent.CountDownLatch r0 = r0.f6899f
            r0.countDown()
            goto L_0x0347
        L_0x0301:
            com.google.android.gms.internal.ads.fr r2 = r0.f6894a     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            byte[] r2 = r2.f6483e     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            java.lang.String r3 = r0.f6896c     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            java.lang.String r2 = r0.a(r2, r3)     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            java.lang.Class<?>[] r3 = r0.f6898e     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            r0.f6897d = r1     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            java.lang.reflect.Method r1 = r0.f6897d     // Catch:{ m70 -> 0x0342, UnsupportedEncodingException -> 0x033c, ClassNotFoundException -> 0x0336, NoSuchMethodException -> 0x0330, NullPointerException -> 0x032a, all -> 0x0323 }
            if (r1 != 0) goto L_0x031d
            java.util.concurrent.CountDownLatch r0 = r0.f6899f
            r0.countDown()
            goto L_0x0347
        L_0x031d:
            java.util.concurrent.CountDownLatch r0 = r0.f6899f
            r0.countDown()
            goto L_0x0347
        L_0x0323:
            r1 = move-exception
            java.util.concurrent.CountDownLatch r0 = r0.f6899f
            r0.countDown()
            throw r1
        L_0x032a:
            java.util.concurrent.CountDownLatch r0 = r0.f6899f
            r0.countDown()
            goto L_0x0347
        L_0x0330:
            java.util.concurrent.CountDownLatch r0 = r0.f6899f
            r0.countDown()
            goto L_0x0347
        L_0x0336:
            java.util.concurrent.CountDownLatch r0 = r0.f6899f
            r0.countDown()
            goto L_0x0347
        L_0x033c:
            java.util.concurrent.CountDownLatch r0 = r0.f6899f
            r0.countDown()
            goto L_0x0347
        L_0x0342:
            java.util.concurrent.CountDownLatch r0 = r0.f6899f
            r0.countDown()
        L_0x0347:
            return
        L_0x0348:
            java.lang.Object r0 = r15.f16216b
            e8.mb0 r0 = (e8.mb0) r0
            android.os.Handler r1 = e8.mb0.f15482u
            r0.d()
            return
        L_0x0352:
            java.lang.Object r0 = r15.f16216b
            com.google.android.gms.internal.ads.fr r0 = (com.google.android.gms.internal.ads.fr) r0
            int r1 = com.google.android.gms.internal.ads.fr.f6478r
            r0.getClass()
            b7.a r1 = r0.f6484f     // Catch:{ IOException | f -> 0x0375 }
            if (r1 != 0) goto L_0x0377
            boolean r1 = r0.f6487i     // Catch:{ IOException | f -> 0x0375 }
            if (r1 == 0) goto L_0x0377
            b7.a r1 = new b7.a     // Catch:{ IOException | f -> 0x0375 }
            android.content.Context r8 = r0.f6479a     // Catch:{ IOException | f -> 0x0375 }
            r9 = 30000(0x7530, double:1.4822E-319)
            r11 = 0
            r12 = 0
            r7 = r1
            r7.<init>(r8, r9, r11, r12)     // Catch:{ IOException | f -> 0x0375 }
            r1.d(r3)     // Catch:{ IOException | f -> 0x0375 }
            r0.f6484f = r1     // Catch:{ IOException | f -> 0x0375 }
            goto L_0x0377
        L_0x0375:
            r0.f6484f = r6
        L_0x0377:
            return
        L_0x0378:
            e8.q10 r0 = com.google.android.gms.internal.ads.yg.G     // Catch:{ Exception -> 0x0382 }
            java.lang.Object r1 = r15.f16216b     // Catch:{ Exception -> 0x0382 }
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1     // Catch:{ Exception -> 0x0382 }
            r0.f(r1)     // Catch:{ Exception -> 0x0382 }
            goto L_0x038a
        L_0x0382:
            r0 = move-exception
            com.google.android.gms.internal.ads.mf r1 = com.google.android.gms.internal.ads.yg.I
            r2 = 2022(0x7e6, float:2.833E-42)
            r1.a(r2, r4, r0)
        L_0x038a:
            return
        L_0x038b:
            e8.q10 r0 = com.google.android.gms.internal.ads.yg.G     // Catch:{ Exception -> 0x0395 }
            java.lang.Object r1 = r15.f16216b     // Catch:{ Exception -> 0x0395 }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ Exception -> 0x0395 }
            r0.c(r1)     // Catch:{ Exception -> 0x0395 }
            goto L_0x039d
        L_0x0395:
            r0 = move-exception
            com.google.android.gms.internal.ads.mf r1 = com.google.android.gms.internal.ads.yg.I
            r2 = 2019(0x7e3, float:2.829E-42)
            r1.a(r2, r4, r0)
        L_0x039d:
            return
        L_0x039e:
            java.lang.Object r0 = r15.f16216b
            com.google.android.gms.internal.ads.pf r0 = (com.google.android.gms.internal.ads.pf) r0
            java.lang.Boolean r0 = r0.f7861b
            if (r0 == 0) goto L_0x03a7
            goto L_0x03e6
        L_0x03a7:
            android.os.ConditionVariable r0 = com.google.android.gms.internal.ads.pf.f7857c
            monitor-enter(r0)
            java.lang.Object r1 = r15.f16216b     // Catch:{ all -> 0x03e7 }
            com.google.android.gms.internal.ads.pf r1 = (com.google.android.gms.internal.ads.pf) r1     // Catch:{ all -> 0x03e7 }
            java.lang.Boolean r1 = r1.f7861b     // Catch:{ all -> 0x03e7 }
            if (r1 == 0) goto L_0x03b4
            monitor-exit(r0)     // Catch:{ all -> 0x03e7 }
            goto L_0x03e6
        L_0x03b4:
            a6.b<java.lang.Boolean> r1 = e8.t.f16604k1     // Catch:{ IllegalStateException -> 0x03c1 }
            java.lang.Object r1 = r1.b()     // Catch:{ IllegalStateException -> 0x03c1 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ IllegalStateException -> 0x03c1 }
            boolean r1 = r1.booleanValue()     // Catch:{ IllegalStateException -> 0x03c1 }
            goto L_0x03c2
        L_0x03c1:
            r1 = 0
        L_0x03c2:
            if (r1 == 0) goto L_0x03d5
            e8.th0 r3 = new e8.th0     // Catch:{ all -> 0x03d6 }
            java.lang.Object r4 = r15.f16216b     // Catch:{ all -> 0x03d6 }
            com.google.android.gms.internal.ads.pf r4 = (com.google.android.gms.internal.ads.pf) r4     // Catch:{ all -> 0x03d6 }
            com.google.android.gms.internal.ads.fr r4 = r4.f7860a     // Catch:{ all -> 0x03d6 }
            android.content.Context r4 = r4.f6479a     // Catch:{ all -> 0x03d6 }
            java.lang.String r5 = "ADSHIELD"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x03d6 }
            com.google.android.gms.internal.ads.pf.f7858d = r3     // Catch:{ all -> 0x03d6 }
        L_0x03d5:
            r2 = r1
        L_0x03d6:
            java.lang.Object r1 = r15.f16216b     // Catch:{ all -> 0x03e7 }
            com.google.android.gms.internal.ads.pf r1 = (com.google.android.gms.internal.ads.pf) r1     // Catch:{ all -> 0x03e7 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x03e7 }
            r1.f7861b = r2     // Catch:{ all -> 0x03e7 }
            android.os.ConditionVariable r1 = com.google.android.gms.internal.ads.pf.f7857c     // Catch:{ all -> 0x03e7 }
            r1.open()     // Catch:{ all -> 0x03e7 }
            monitor-exit(r0)     // Catch:{ all -> 0x03e7 }
        L_0x03e6:
            return
        L_0x03e7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x03e7 }
            throw r1
        L_0x03ea:
            java.lang.Object r0 = r15.f16216b
            e8.e00 r0 = (e8.e00) r0
            r0.v()
            return
        L_0x03f2:
            java.lang.Object r1 = r15.f16216b
            com.google.android.gms.internal.ads.le r1 = (com.google.android.gms.internal.ads.le) r1
            e8.e00 r1 = r1.f7381d
            e8.zh0 r0 = l0.e.p(r0, r6, r6)
            r1.j0(r0)
            return
        L_0x0400:
            java.lang.Object r0 = r15.f16216b
            com.google.android.gms.internal.ads.j8 r0 = (com.google.android.gms.internal.ads.j8) r0
            java.lang.Object r0 = r0.f7136d
            com.google.android.gms.internal.ads.ke r0 = (com.google.android.gms.internal.ads.ke) r0
            e8.e00 r0 = r0.f7243e
            r0.v()
            return
        L_0x040e:
            java.lang.Object r1 = r15.f16216b
            com.google.android.gms.internal.ads.xd r1 = (com.google.android.gms.internal.ads.xd) r1
            e8.ov r1 = r1.f8544d
            e8.zh0 r0 = l0.e.p(r0, r6, r6)
            r1.j0(r0)
            return
        L_0x041c:
            java.lang.Object r0 = r15.f16216b
            com.google.android.gms.internal.ads.wd r0 = (com.google.android.gms.internal.ads.wd) r0
            r1 = 5
            r0.s6(r1)
            return
        L_0x0425:
            java.lang.Object r0 = r15.f16216b
            ab.d0$a r0 = (ab.d0.a) r0
            android.content.Intent r1 = r0.f215a
            java.lang.String r1 = r1.getAction()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 61
            r3.<init>(r2)
            java.lang.String r2 = "Service took too long to process intent: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " App may get closed."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "FirebaseMessaging"
            android.util.Log.w(r2, r1)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.qz.run():void");
    }

    public qz(d0.a aVar) {
        this.f16216b = aVar;
    }

    public qz(j8 j8Var) {
        this.f16216b = j8Var;
    }

    public qz(wd wdVar) {
        this.f16216b = wdVar;
    }

    public qz(xd xdVar) {
        this.f16216b = xdVar;
    }

    public qz(le leVar) {
        this.f16216b = leVar;
    }

    public qz(FirebaseMessaging firebaseMessaging) {
        this.f16216b = firebaseMessaging;
    }

    public qz(e00 e00) {
        this.f16216b = e00;
    }

    public /* synthetic */ qz(s4 s4Var) {
        this.f16216b = s4Var;
    }

    public qz(z4 z4Var) {
        this.f16216b = z4Var;
    }

    public qz(g5 g5Var) {
        this.f16216b = g5Var;
    }

    public /* synthetic */ qz(a aVar) {
        this.f16216b = aVar;
    }

    public qz(Context context) {
        this.f16216b = context;
    }

    public qz(MotionEvent motionEvent) {
        this.f16216b = motionEvent;
    }

    public qz(pf pfVar) {
        this.f16216b = pfVar;
    }

    public qz(fr frVar) {
        this.f16216b = frVar;
    }

    public qz(hs hsVar) {
        this.f16216b = hsVar;
    }

    public qz(yt ytVar) {
        this.f16216b = ytVar;
    }

    public qz(ru ruVar) {
        this.f16216b = ruVar;
    }

    public qz(mb0 mb0) {
        this.f16216b = mb0;
    }
}
