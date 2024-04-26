package e8;

import com.google.android.gms.ads.internal.a;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.t7;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class k3 implements f3<t7> {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, Integer> f15226d;

    /* renamed from: a  reason: collision with root package name */
    public final a f15227a;

    /* renamed from: b  reason: collision with root package name */
    public final b6 f15228b;

    /* renamed from: c  reason: collision with root package name */
    public final g2 f15229c;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        s.a aVar = new s.a(7);
        for (int i10 = 0; i10 < 7; i10++) {
            aVar.put(strArr[i10], numArr[i10]);
        }
        f15226d = Collections.unmodifiableMap(aVar);
    }

    public k3(a aVar, b6 b6Var, g2 g2Var) {
        this.f15227a = aVar;
        this.f15228b = b6Var;
        this.f15229c = g2Var;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x024b, code lost:
        r7 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x024c, code lost:
        if (r7 == 0) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x024e, code lost:
        if (r7 == 1) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0250, code lost:
        if (r7 == 2) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0252, code lost:
        if (r7 == 3) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0254, code lost:
        if (r7 == 4) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0256, code lost:
        if (r7 == 5) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0258, code lost:
        r7 = ((r2.f13882f + r2.f13885i) + r2.f13887s) - 50;
        r11 = r2.f13883g;
        r14 = r2.f13886r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0266, code lost:
        r7 = ((r2.f13882f + r2.f13885i) + r2.f13887s) - 50;
        r11 = r2.f13883g + r2.f13886r;
        r14 = r2.f13884h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0277, code lost:
        r7 = ((r2.f13882f + r2.f13885i) + (r2.f13887s / 2)) - 25;
        r11 = r2.f13883g + r2.f13886r;
        r14 = r2.f13884h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x028a, code lost:
        r7 = r2.f13882f + r2.f13885i;
        r11 = r2.f13883g + r2.f13886r;
        r14 = r2.f13884h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0296, code lost:
        r11 = (r11 + r14) - 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0299, code lost:
        r7 = ((r2.f13882f + r2.f13885i) + (r2.f13887s / 2)) - 25;
        r11 = ((r2.f13883g + r2.f13886r) + (r2.f13884h / 2)) - 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02b0, code lost:
        r7 = ((r2.f13882f + r2.f13885i) + (r2.f13887s / 2)) - 25;
        r11 = r2.f13883g;
        r14 = r2.f13886r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02c0, code lost:
        r7 = r2.f13882f + r2.f13885i;
        r11 = r2.f13883g;
        r14 = r2.f13886r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02c9, code lost:
        r11 = r11 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ca, code lost:
        if (r7 < 0) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02cd, code lost:
        if ((r7 + 50) > r13) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02d1, code lost:
        if (r11 < r12[0]) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02d6, code lost:
        if ((r11 + 50) <= r12[1]) goto L_0x02d9;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e9 A[Catch:{ RuntimeException -> 0x052d }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02eb A[Catch:{ RuntimeException -> 0x052d }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0348 A[Catch:{ RuntimeException -> 0x052d }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0350 A[Catch:{ RuntimeException -> 0x052d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r17, java.util.Map r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r17
            com.google.android.gms.internal.ads.t7 r2 = (com.google.android.gms.internal.ads.t7) r2
            java.lang.String r3 = "a"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Integer> r4 = f15226d
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 0
            r5 = 7
            r6 = 5
            if (r3 == r6) goto L_0x0033
            if (r3 == r5) goto L_0x0033
            com.google.android.gms.ads.internal.a r7 = r1.f15227a
            if (r7 == 0) goto L_0x0033
            boolean r7 = r7.c()
            if (r7 != 0) goto L_0x0033
            com.google.android.gms.ads.internal.a r0 = r1.f15227a
            r0.a(r4)
            return
        L_0x0033:
            r8 = 4
            r9 = 3
            r10 = 1
            if (r3 == r10) goto L_0x00b4
            if (r3 == r9) goto L_0x00ab
            if (r3 == r8) goto L_0x00a2
            r4 = 6
            if (r3 == r6) goto L_0x005d
            if (r3 == r4) goto L_0x0057
            if (r3 == r5) goto L_0x0049
            java.lang.String r0 = "Unknown MRAID command called."
            l0.e.J(r0)
            return
        L_0x0049:
            com.google.android.gms.internal.ads.g2 r0 = r1.f15229c
            java.lang.Object r0 = r0.f6511b
            e8.op r0 = (e8.op) r0
            e8.mk r0 = r0.f15825m
            com.google.android.gms.internal.ads.j9 r2 = e8.ok.f15803a
            r0.I0(r2)
            return
        L_0x0057:
            e8.b6 r0 = r1.f15228b
            r0.u(r10)
            return
        L_0x005d:
            java.lang.String r3 = "forceOrientation"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = "allowOrientationChange"
            boolean r8 = r0.containsKey(r6)
            if (r8 == 0) goto L_0x0077
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            boolean r10 = java.lang.Boolean.parseBoolean(r0)
        L_0x0077:
            if (r2 != 0) goto L_0x007f
            java.lang.String r0 = "AdWebView is null"
            l0.e.K(r0)
            goto L_0x00a1
        L_0x007f:
            java.lang.String r0 = "portrait"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0088
            goto L_0x009e
        L_0x0088:
            java.lang.String r0 = "landscape"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0092
            r5 = 6
            goto L_0x009e
        L_0x0092:
            if (r10 == 0) goto L_0x0096
            r5 = -1
            goto L_0x009e
        L_0x0096:
            d7.l r0 = d7.l.B
            f7.m0 r0 = r0.f13188e
            int r5 = r0.n()
        L_0x009e:
            r2.setRequestedOrientation(r5)
        L_0x00a1:
            return
        L_0x00a2:
            e8.a6 r3 = new e8.a6
            r3.<init>(r2, r0)
            r3.u()
            return
        L_0x00ab:
            e8.f6 r3 = new e8.f6
            r3.<init>(r2, r0)
            r3.u()
            return
        L_0x00b4:
            e8.b6 r2 = r1.f15228b
            java.lang.Object r3 = r2.f13888t
            monitor-enter(r3)
            android.app.Activity r5 = r2.f13890v     // Catch:{ all -> 0x0581 }
            if (r5 != 0) goto L_0x00c5
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r2.s(r0)     // Catch:{ all -> 0x0581 }
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            goto L_0x0580
        L_0x00c5:
            com.google.android.gms.internal.ads.t7 r5 = r2.f13889u     // Catch:{ all -> 0x0581 }
            e8.wc r5 = r5.j()     // Catch:{ all -> 0x0581 }
            if (r5 != 0) goto L_0x00d5
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r2.s(r0)     // Catch:{ all -> 0x0581 }
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            goto L_0x0580
        L_0x00d5:
            com.google.android.gms.internal.ads.t7 r5 = r2.f13889u     // Catch:{ all -> 0x0581 }
            e8.wc r5 = r5.j()     // Catch:{ all -> 0x0581 }
            boolean r5 = r5.b()     // Catch:{ all -> 0x0581 }
            if (r5 == 0) goto L_0x00e9
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r2.s(r0)     // Catch:{ all -> 0x0581 }
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            goto L_0x0580
        L_0x00e9:
            com.google.android.gms.internal.ads.t7 r5 = r2.f13889u     // Catch:{ all -> 0x0581 }
            boolean r5 = r5.u()     // Catch:{ all -> 0x0581 }
            if (r5 == 0) goto L_0x00f9
            java.lang.String r0 = "Cannot resize an expanded banner."
            r2.s(r0)     // Catch:{ all -> 0x0581 }
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            goto L_0x0580
        L_0x00f9:
            java.lang.String r5 = "width"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x0581 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0581 }
            if (r5 != 0) goto L_0x0119
            d7.l r5 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r5 = r5.f13186c     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = "width"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0581 }
            int r5 = com.google.android.gms.ads.internal.util.p.z(r5)     // Catch:{ all -> 0x0581 }
            r2.f13887s = r5     // Catch:{ all -> 0x0581 }
        L_0x0119:
            java.lang.String r5 = "height"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x0581 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0581 }
            if (r5 != 0) goto L_0x0139
            d7.l r5 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r5 = r5.f13186c     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = "height"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0581 }
            int r5 = com.google.android.gms.ads.internal.util.p.z(r5)     // Catch:{ all -> 0x0581 }
            r2.f13884h = r5     // Catch:{ all -> 0x0581 }
        L_0x0139:
            java.lang.String r5 = "offsetX"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x0581 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0581 }
            if (r5 != 0) goto L_0x0159
            d7.l r5 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r5 = r5.f13186c     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = "offsetX"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0581 }
            int r5 = com.google.android.gms.ads.internal.util.p.z(r5)     // Catch:{ all -> 0x0581 }
            r2.f13885i = r5     // Catch:{ all -> 0x0581 }
        L_0x0159:
            java.lang.String r5 = "offsetY"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x0581 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0581 }
            if (r5 != 0) goto L_0x0179
            d7.l r5 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r5 = r5.f13186c     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = "offsetY"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0581 }
            int r5 = com.google.android.gms.ads.internal.util.p.z(r5)     // Catch:{ all -> 0x0581 }
            r2.f13886r = r5     // Catch:{ all -> 0x0581 }
        L_0x0179:
            java.lang.String r5 = "allowOffscreen"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x0581 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0581 }
            if (r5 != 0) goto L_0x0195
            java.lang.String r5 = "allowOffscreen"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0581 }
            boolean r5 = java.lang.Boolean.parseBoolean(r5)     // Catch:{ all -> 0x0581 }
            r2.f13881e = r5     // Catch:{ all -> 0x0581 }
        L_0x0195:
            java.lang.String r5 = "customClosePosition"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0581 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0581 }
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0581 }
            if (r5 != 0) goto L_0x01a5
            r2.f13880d = r0     // Catch:{ all -> 0x0581 }
        L_0x01a5:
            int r0 = r2.f13887s     // Catch:{ all -> 0x0581 }
            r5 = 0
            if (r0 < 0) goto L_0x01b0
            int r0 = r2.f13884h     // Catch:{ all -> 0x0581 }
            if (r0 < 0) goto L_0x01b0
            r0 = 1
            goto L_0x01b1
        L_0x01b0:
            r0 = 0
        L_0x01b1:
            if (r0 != 0) goto L_0x01bb
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r2.s(r0)     // Catch:{ all -> 0x0581 }
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            goto L_0x0580
        L_0x01bb:
            android.app.Activity r0 = r2.f13890v     // Catch:{ all -> 0x0581 }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x0581 }
            if (r0 == 0) goto L_0x057a
            android.view.View r11 = r0.getDecorView()     // Catch:{ all -> 0x0581 }
            if (r11 != 0) goto L_0x01cb
            goto L_0x057a
        L_0x01cb:
            d7.l r11 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r11 = r11.f13186c     // Catch:{ all -> 0x0581 }
            android.app.Activity r11 = r2.f13890v     // Catch:{ all -> 0x0581 }
            int[] r11 = com.google.android.gms.ads.internal.util.p.D(r11)     // Catch:{ all -> 0x0581 }
            d7.l r12 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r12 = r12.f13186c     // Catch:{ all -> 0x0581 }
            android.app.Activity r12 = r2.f13890v     // Catch:{ all -> 0x0581 }
            int[] r12 = com.google.android.gms.ads.internal.util.p.E(r12)     // Catch:{ all -> 0x0581 }
            r13 = r11[r5]     // Catch:{ all -> 0x0581 }
            r11 = r11[r10]     // Catch:{ all -> 0x0581 }
            int r14 = r2.f13887s     // Catch:{ all -> 0x0581 }
            r15 = 50
            r4 = 2
            if (r14 < r15) goto L_0x02e1
            if (r14 <= r13) goto L_0x01ee
            goto L_0x02e1
        L_0x01ee:
            int r7 = r2.f13884h     // Catch:{ all -> 0x0581 }
            if (r7 < r15) goto L_0x02db
            if (r7 <= r11) goto L_0x01f6
            goto L_0x02db
        L_0x01f6:
            if (r7 != r11) goto L_0x0201
            if (r14 != r13) goto L_0x0201
            java.lang.String r7 = "Cannot resize to a full-screen ad."
            l0.e.K(r7)     // Catch:{ all -> 0x0581 }
            goto L_0x02e6
        L_0x0201:
            boolean r7 = r2.f13881e     // Catch:{ all -> 0x0581 }
            if (r7 == 0) goto L_0x02d9
            java.lang.String r7 = r2.f13880d     // Catch:{ all -> 0x0581 }
            int r11 = r7.hashCode()     // Catch:{ all -> 0x0581 }
            switch(r11) {
                case -1364013995: goto L_0x0241;
                case -1012429441: goto L_0x0237;
                case -655373719: goto L_0x022d;
                case 1163912186: goto L_0x0223;
                case 1288627767: goto L_0x0219;
                case 1755462605: goto L_0x020f;
                default: goto L_0x020e;
            }     // Catch:{ all -> 0x0581 }
        L_0x020e:
            goto L_0x024b
        L_0x020f:
            java.lang.String r11 = "top-center"
            boolean r7 = r7.equals(r11)     // Catch:{ all -> 0x0581 }
            if (r7 == 0) goto L_0x024b
            r7 = 1
            goto L_0x024c
        L_0x0219:
            java.lang.String r11 = "bottom-center"
            boolean r7 = r7.equals(r11)     // Catch:{ all -> 0x0581 }
            if (r7 == 0) goto L_0x024b
            r7 = 4
            goto L_0x024c
        L_0x0223:
            java.lang.String r11 = "bottom-right"
            boolean r7 = r7.equals(r11)     // Catch:{ all -> 0x0581 }
            if (r7 == 0) goto L_0x024b
            r7 = 5
            goto L_0x024c
        L_0x022d:
            java.lang.String r11 = "bottom-left"
            boolean r7 = r7.equals(r11)     // Catch:{ all -> 0x0581 }
            if (r7 == 0) goto L_0x024b
            r7 = 3
            goto L_0x024c
        L_0x0237:
            java.lang.String r11 = "top-left"
            boolean r7 = r7.equals(r11)     // Catch:{ all -> 0x0581 }
            if (r7 == 0) goto L_0x024b
            r7 = 0
            goto L_0x024c
        L_0x0241:
            java.lang.String r11 = "center"
            boolean r7 = r7.equals(r11)     // Catch:{ all -> 0x0581 }
            if (r7 == 0) goto L_0x024b
            r7 = 2
            goto L_0x024c
        L_0x024b:
            r7 = -1
        L_0x024c:
            if (r7 == 0) goto L_0x02c0
            if (r7 == r10) goto L_0x02b0
            if (r7 == r4) goto L_0x0299
            if (r7 == r9) goto L_0x028a
            if (r7 == r8) goto L_0x0277
            if (r7 == r6) goto L_0x0266
            int r7 = r2.f13882f     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13885i     // Catch:{ all -> 0x0581 }
            int r7 = r7 + r11
            int r11 = r2.f13887s     // Catch:{ all -> 0x0581 }
            int r7 = r7 + r11
            int r7 = r7 - r15
            int r11 = r2.f13883g     // Catch:{ all -> 0x0581 }
            int r14 = r2.f13886r     // Catch:{ all -> 0x0581 }
            goto L_0x02c9
        L_0x0266:
            int r7 = r2.f13882f     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13885i     // Catch:{ all -> 0x0581 }
            int r7 = r7 + r11
            int r11 = r2.f13887s     // Catch:{ all -> 0x0581 }
            int r7 = r7 + r11
            int r7 = r7 - r15
            int r11 = r2.f13883g     // Catch:{ all -> 0x0581 }
            int r14 = r2.f13886r     // Catch:{ all -> 0x0581 }
            int r11 = r11 + r14
            int r14 = r2.f13884h     // Catch:{ all -> 0x0581 }
            goto L_0x0296
        L_0x0277:
            int r7 = r2.f13882f     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13885i     // Catch:{ all -> 0x0581 }
            int r7 = r7 + r11
            int r11 = r2.f13887s     // Catch:{ all -> 0x0581 }
            int r11 = r11 / r4
            int r7 = r7 + r11
            int r7 = r7 + -25
            int r11 = r2.f13883g     // Catch:{ all -> 0x0581 }
            int r14 = r2.f13886r     // Catch:{ all -> 0x0581 }
            int r11 = r11 + r14
            int r14 = r2.f13884h     // Catch:{ all -> 0x0581 }
            goto L_0x0296
        L_0x028a:
            int r7 = r2.f13882f     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13885i     // Catch:{ all -> 0x0581 }
            int r7 = r7 + r11
            int r11 = r2.f13883g     // Catch:{ all -> 0x0581 }
            int r14 = r2.f13886r     // Catch:{ all -> 0x0581 }
            int r11 = r11 + r14
            int r14 = r2.f13884h     // Catch:{ all -> 0x0581 }
        L_0x0296:
            int r11 = r11 + r14
            int r11 = r11 - r15
            goto L_0x02ca
        L_0x0299:
            int r7 = r2.f13882f     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13885i     // Catch:{ all -> 0x0581 }
            int r7 = r7 + r11
            int r11 = r2.f13887s     // Catch:{ all -> 0x0581 }
            int r11 = r11 / r4
            int r7 = r7 + r11
            int r7 = r7 + -25
            int r11 = r2.f13883g     // Catch:{ all -> 0x0581 }
            int r14 = r2.f13886r     // Catch:{ all -> 0x0581 }
            int r11 = r11 + r14
            int r14 = r2.f13884h     // Catch:{ all -> 0x0581 }
            int r14 = r14 / r4
            int r11 = r11 + r14
            int r11 = r11 + -25
            goto L_0x02ca
        L_0x02b0:
            int r7 = r2.f13882f     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13885i     // Catch:{ all -> 0x0581 }
            int r7 = r7 + r11
            int r11 = r2.f13887s     // Catch:{ all -> 0x0581 }
            int r11 = r11 / r4
            int r7 = r7 + r11
            int r7 = r7 + -25
            int r11 = r2.f13883g     // Catch:{ all -> 0x0581 }
            int r14 = r2.f13886r     // Catch:{ all -> 0x0581 }
            goto L_0x02c9
        L_0x02c0:
            int r7 = r2.f13882f     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13885i     // Catch:{ all -> 0x0581 }
            int r7 = r7 + r11
            int r11 = r2.f13883g     // Catch:{ all -> 0x0581 }
            int r14 = r2.f13886r     // Catch:{ all -> 0x0581 }
        L_0x02c9:
            int r11 = r11 + r14
        L_0x02ca:
            if (r7 < 0) goto L_0x02e6
            int r7 = r7 + r15
            if (r7 > r13) goto L_0x02e6
            r7 = r12[r5]     // Catch:{ all -> 0x0581 }
            if (r11 < r7) goto L_0x02e6
            int r11 = r11 + r15
            r7 = r12[r10]     // Catch:{ all -> 0x0581 }
            if (r11 <= r7) goto L_0x02d9
            goto L_0x02e6
        L_0x02d9:
            r7 = 1
            goto L_0x02e7
        L_0x02db:
            java.lang.String r7 = "Height is too small or too large."
            l0.e.K(r7)     // Catch:{ all -> 0x0581 }
            goto L_0x02e6
        L_0x02e1:
            java.lang.String r7 = "Width is too small or too large."
            l0.e.K(r7)     // Catch:{ all -> 0x0581 }
        L_0x02e6:
            r7 = 0
        L_0x02e7:
            if (r7 != 0) goto L_0x02eb
            r6 = 0
            goto L_0x0346
        L_0x02eb:
            boolean r7 = r2.f13881e     // Catch:{ all -> 0x0581 }
            if (r7 == 0) goto L_0x0301
            int[] r7 = new int[r4]     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13882f     // Catch:{ all -> 0x0581 }
            int r12 = r2.f13885i     // Catch:{ all -> 0x0581 }
            int r11 = r11 + r12
            r7[r5] = r11     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13883g     // Catch:{ all -> 0x0581 }
            int r12 = r2.f13886r     // Catch:{ all -> 0x0581 }
            int r11 = r11 + r12
            r7[r10] = r11     // Catch:{ all -> 0x0581 }
            r6 = r7
            goto L_0x0346
        L_0x0301:
            d7.l r7 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r7 = r7.f13186c     // Catch:{ all -> 0x0581 }
            android.app.Activity r7 = r2.f13890v     // Catch:{ all -> 0x0581 }
            int[] r7 = com.google.android.gms.ads.internal.util.p.D(r7)     // Catch:{ all -> 0x0581 }
            d7.l r11 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r11 = r11.f13186c     // Catch:{ all -> 0x0581 }
            android.app.Activity r11 = r2.f13890v     // Catch:{ all -> 0x0581 }
            int[] r11 = com.google.android.gms.ads.internal.util.p.E(r11)     // Catch:{ all -> 0x0581 }
            r7 = r7[r5]     // Catch:{ all -> 0x0581 }
            int r12 = r2.f13882f     // Catch:{ all -> 0x0581 }
            int r13 = r2.f13885i     // Catch:{ all -> 0x0581 }
            int r12 = r12 + r13
            int r13 = r2.f13883g     // Catch:{ all -> 0x0581 }
            int r14 = r2.f13886r     // Catch:{ all -> 0x0581 }
            int r13 = r13 + r14
            if (r12 >= 0) goto L_0x0325
            r12 = 0
            goto L_0x032d
        L_0x0325:
            int r14 = r2.f13887s     // Catch:{ all -> 0x0581 }
            int r6 = r12 + r14
            if (r6 <= r7) goto L_0x032d
            int r12 = r7 - r14
        L_0x032d:
            r6 = r11[r5]     // Catch:{ all -> 0x0581 }
            if (r13 >= r6) goto L_0x0334
            r13 = r11[r5]     // Catch:{ all -> 0x0581 }
            goto L_0x0340
        L_0x0334:
            int r6 = r2.f13884h     // Catch:{ all -> 0x0581 }
            int r7 = r13 + r6
            r14 = r11[r10]     // Catch:{ all -> 0x0581 }
            if (r7 <= r14) goto L_0x0340
            r7 = r11[r10]     // Catch:{ all -> 0x0581 }
            int r13 = r7 - r6
        L_0x0340:
            int[] r6 = new int[r4]     // Catch:{ all -> 0x0581 }
            r6[r5] = r12     // Catch:{ all -> 0x0581 }
            r6[r10] = r13     // Catch:{ all -> 0x0581 }
        L_0x0346:
            if (r6 != 0) goto L_0x0350
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r2.s(r0)     // Catch:{ all -> 0x0581 }
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            goto L_0x0580
        L_0x0350:
            e8.ti0 r7 = e8.ti0.f16763j     // Catch:{ all -> 0x0581 }
            e8.y8 r7 = r7.f16764a     // Catch:{ all -> 0x0581 }
            android.app.Activity r7 = r2.f13890v     // Catch:{ all -> 0x0581 }
            int r11 = r2.f13887s     // Catch:{ all -> 0x0581 }
            int r7 = e8.y8.g(r7, r11)     // Catch:{ all -> 0x0581 }
            e8.ti0 r11 = e8.ti0.f16763j     // Catch:{ all -> 0x0581 }
            e8.y8 r11 = r11.f16764a     // Catch:{ all -> 0x0581 }
            android.app.Activity r11 = r2.f13890v     // Catch:{ all -> 0x0581 }
            int r12 = r2.f13884h     // Catch:{ all -> 0x0581 }
            int r11 = e8.y8.g(r11, r12)     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.t7 r12 = r2.f13889u     // Catch:{ all -> 0x0581 }
            android.view.View r12 = r12.getView()     // Catch:{ all -> 0x0581 }
            android.view.ViewParent r12 = r12.getParent()     // Catch:{ all -> 0x0581 }
            if (r12 == 0) goto L_0x0573
            boolean r13 = r12 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0581 }
            if (r13 == 0) goto L_0x0573
            r13 = r12
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.t7 r14 = r2.f13889u     // Catch:{ all -> 0x0581 }
            android.view.View r14 = r14.getView()     // Catch:{ all -> 0x0581 }
            r13.removeView(r14)     // Catch:{ all -> 0x0581 }
            android.widget.PopupWindow r13 = r2.A     // Catch:{ all -> 0x0581 }
            if (r13 != 0) goto L_0x03c0
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12     // Catch:{ all -> 0x0581 }
            r2.C = r12     // Catch:{ all -> 0x0581 }
            d7.l r12 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r12 = r12.f13186c     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.t7 r12 = r2.f13889u     // Catch:{ all -> 0x0581 }
            android.view.View r12 = r12.getView()     // Catch:{ all -> 0x0581 }
            r12.setDrawingCacheEnabled(r10)     // Catch:{ all -> 0x0581 }
            android.graphics.Bitmap r13 = r12.getDrawingCache()     // Catch:{ all -> 0x0581 }
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r13)     // Catch:{ all -> 0x0581 }
            r12.setDrawingCacheEnabled(r5)     // Catch:{ all -> 0x0581 }
            android.widget.ImageView r12 = new android.widget.ImageView     // Catch:{ all -> 0x0581 }
            android.app.Activity r14 = r2.f13890v     // Catch:{ all -> 0x0581 }
            r12.<init>(r14)     // Catch:{ all -> 0x0581 }
            r2.f13892x = r12     // Catch:{ all -> 0x0581 }
            r12.setImageBitmap(r13)     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.t7 r12 = r2.f13889u     // Catch:{ all -> 0x0581 }
            e8.wc r12 = r12.j()     // Catch:{ all -> 0x0581 }
            r2.f13891w = r12     // Catch:{ all -> 0x0581 }
            android.view.ViewGroup r12 = r2.C     // Catch:{ all -> 0x0581 }
            android.widget.ImageView r13 = r2.f13892x     // Catch:{ all -> 0x0581 }
            r12.addView(r13)     // Catch:{ all -> 0x0581 }
            goto L_0x03c3
        L_0x03c0:
            r13.dismiss()     // Catch:{ all -> 0x0581 }
        L_0x03c3:
            android.widget.RelativeLayout r12 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0581 }
            android.app.Activity r13 = r2.f13890v     // Catch:{ all -> 0x0581 }
            r12.<init>(r13)     // Catch:{ all -> 0x0581 }
            r2.B = r12     // Catch:{ all -> 0x0581 }
            r12.setBackgroundColor(r5)     // Catch:{ all -> 0x0581 }
            android.widget.RelativeLayout r12 = r2.B     // Catch:{ all -> 0x0581 }
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x0581 }
            r13.<init>(r7, r11)     // Catch:{ all -> 0x0581 }
            r12.setLayoutParams(r13)     // Catch:{ all -> 0x0581 }
            d7.l r12 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r12 = r12.f13186c     // Catch:{ all -> 0x0581 }
            android.widget.RelativeLayout r12 = r2.B     // Catch:{ all -> 0x0581 }
            android.widget.PopupWindow r13 = new android.widget.PopupWindow     // Catch:{ all -> 0x0581 }
            r13.<init>(r12, r7, r11, r5)     // Catch:{ all -> 0x0581 }
            r2.A = r13     // Catch:{ all -> 0x0581 }
            r13.setOutsideTouchable(r10)     // Catch:{ all -> 0x0581 }
            android.widget.PopupWindow r12 = r2.A     // Catch:{ all -> 0x0581 }
            r12.setTouchable(r10)     // Catch:{ all -> 0x0581 }
            android.widget.PopupWindow r12 = r2.A     // Catch:{ all -> 0x0581 }
            boolean r13 = r2.f13881e     // Catch:{ all -> 0x0581 }
            if (r13 != 0) goto L_0x03f6
            r13 = 1
            goto L_0x03f7
        L_0x03f6:
            r13 = 0
        L_0x03f7:
            r12.setClippingEnabled(r13)     // Catch:{ all -> 0x0581 }
            android.widget.RelativeLayout r12 = r2.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.t7 r13 = r2.f13889u     // Catch:{ all -> 0x0581 }
            android.view.View r13 = r13.getView()     // Catch:{ all -> 0x0581 }
            r14 = -1
            r12.addView(r13, r14, r14)     // Catch:{ all -> 0x0581 }
            android.widget.LinearLayout r12 = new android.widget.LinearLayout     // Catch:{ all -> 0x0581 }
            android.app.Activity r13 = r2.f13890v     // Catch:{ all -> 0x0581 }
            r12.<init>(r13)     // Catch:{ all -> 0x0581 }
            r2.f13893y = r12     // Catch:{ all -> 0x0581 }
            android.widget.RelativeLayout$LayoutParams r12 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0581 }
            e8.ti0 r13 = e8.ti0.f16763j     // Catch:{ all -> 0x0581 }
            e8.y8 r13 = r13.f16764a     // Catch:{ all -> 0x0581 }
            android.app.Activity r13 = r2.f13890v     // Catch:{ all -> 0x0581 }
            int r13 = e8.y8.g(r13, r15)     // Catch:{ all -> 0x0581 }
            e8.ti0 r14 = e8.ti0.f16763j     // Catch:{ all -> 0x0581 }
            e8.y8 r14 = r14.f16764a     // Catch:{ all -> 0x0581 }
            android.app.Activity r14 = r2.f13890v     // Catch:{ all -> 0x0581 }
            int r14 = e8.y8.g(r14, r15)     // Catch:{ all -> 0x0581 }
            r12.<init>(r13, r14)     // Catch:{ all -> 0x0581 }
            java.lang.String r13 = r2.f13880d     // Catch:{ all -> 0x0581 }
            int r14 = r13.hashCode()     // Catch:{ all -> 0x0581 }
            switch(r14) {
                case -1364013995: goto L_0x0464;
                case -1012429441: goto L_0x045a;
                case -655373719: goto L_0x0450;
                case 1163912186: goto L_0x0446;
                case 1288627767: goto L_0x043c;
                case 1755462605: goto L_0x0432;
                default: goto L_0x0431;
            }     // Catch:{ all -> 0x0581 }
        L_0x0431:
            goto L_0x046e
        L_0x0432:
            java.lang.String r14 = "top-center"
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0581 }
            if (r13 == 0) goto L_0x046e
            r13 = 1
            goto L_0x046f
        L_0x043c:
            java.lang.String r14 = "bottom-center"
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0581 }
            if (r13 == 0) goto L_0x046e
            r13 = 4
            goto L_0x046f
        L_0x0446:
            java.lang.String r14 = "bottom-right"
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0581 }
            if (r13 == 0) goto L_0x046e
            r13 = 5
            goto L_0x046f
        L_0x0450:
            java.lang.String r14 = "bottom-left"
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0581 }
            if (r13 == 0) goto L_0x046e
            r13 = 3
            goto L_0x046f
        L_0x045a:
            java.lang.String r14 = "top-left"
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0581 }
            if (r13 == 0) goto L_0x046e
            r13 = 0
            goto L_0x046f
        L_0x0464:
            java.lang.String r14 = "center"
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0581 }
            if (r13 == 0) goto L_0x046e
            r13 = 2
            goto L_0x046f
        L_0x046e:
            r13 = -1
        L_0x046f:
            r14 = 9
            r15 = 10
            if (r13 == 0) goto L_0x04af
            r5 = 14
            if (r13 == r10) goto L_0x04a8
            if (r13 == r4) goto L_0x04a2
            r4 = 12
            if (r13 == r9) goto L_0x049b
            if (r13 == r8) goto L_0x0494
            r5 = 11
            r8 = 5
            if (r13 == r8) goto L_0x048d
            r12.addRule(r15)     // Catch:{ all -> 0x0581 }
            r12.addRule(r5)     // Catch:{ all -> 0x0581 }
            goto L_0x04b5
        L_0x048d:
            r12.addRule(r4)     // Catch:{ all -> 0x0581 }
            r12.addRule(r5)     // Catch:{ all -> 0x0581 }
            goto L_0x04b5
        L_0x0494:
            r12.addRule(r4)     // Catch:{ all -> 0x0581 }
            r12.addRule(r5)     // Catch:{ all -> 0x0581 }
            goto L_0x04b5
        L_0x049b:
            r12.addRule(r4)     // Catch:{ all -> 0x0581 }
            r12.addRule(r14)     // Catch:{ all -> 0x0581 }
            goto L_0x04b5
        L_0x04a2:
            r4 = 13
            r12.addRule(r4)     // Catch:{ all -> 0x0581 }
            goto L_0x04b5
        L_0x04a8:
            r12.addRule(r15)     // Catch:{ all -> 0x0581 }
            r12.addRule(r5)     // Catch:{ all -> 0x0581 }
            goto L_0x04b5
        L_0x04af:
            r12.addRule(r15)     // Catch:{ all -> 0x0581 }
            r12.addRule(r14)     // Catch:{ all -> 0x0581 }
        L_0x04b5:
            android.widget.LinearLayout r4 = r2.f13893y     // Catch:{ all -> 0x0581 }
            e8.d6 r5 = new e8.d6     // Catch:{ all -> 0x0581 }
            r5.<init>(r2)     // Catch:{ all -> 0x0581 }
            r4.setOnClickListener(r5)     // Catch:{ all -> 0x0581 }
            android.widget.LinearLayout r4 = r2.f13893y     // Catch:{ all -> 0x0581 }
            java.lang.String r5 = "Close button"
            r4.setContentDescription(r5)     // Catch:{ all -> 0x0581 }
            android.widget.RelativeLayout r4 = r2.B     // Catch:{ all -> 0x0581 }
            android.widget.LinearLayout r5 = r2.f13893y     // Catch:{ all -> 0x0581 }
            r4.addView(r5, r12)     // Catch:{ all -> 0x0581 }
            android.widget.PopupWindow r4 = r2.A     // Catch:{ RuntimeException -> 0x052d }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x052d }
            e8.ti0 r5 = e8.ti0.f16763j     // Catch:{ RuntimeException -> 0x052d }
            e8.y8 r5 = r5.f16764a     // Catch:{ RuntimeException -> 0x052d }
            android.app.Activity r5 = r2.f13890v     // Catch:{ RuntimeException -> 0x052d }
            r8 = 0
            r9 = r6[r8]     // Catch:{ RuntimeException -> 0x052d }
            int r5 = e8.y8.g(r5, r9)     // Catch:{ RuntimeException -> 0x052d }
            e8.ti0 r8 = e8.ti0.f16763j     // Catch:{ RuntimeException -> 0x052d }
            e8.y8 r8 = r8.f16764a     // Catch:{ RuntimeException -> 0x052d }
            android.app.Activity r8 = r2.f13890v     // Catch:{ RuntimeException -> 0x052d }
            r9 = r6[r10]     // Catch:{ RuntimeException -> 0x052d }
            int r8 = e8.y8.g(r8, r9)     // Catch:{ RuntimeException -> 0x052d }
            r9 = 0
            r4.showAtLocation(r0, r9, r5, r8)     // Catch:{ RuntimeException -> 0x052d }
            r0 = r6[r9]     // Catch:{ all -> 0x0581 }
            r0 = r6[r10]     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.g2 r0 = r2.f13894z     // Catch:{ all -> 0x0581 }
            if (r0 == 0) goto L_0x0503
            java.lang.Object r0 = r0.f6511b     // Catch:{ all -> 0x0581 }
            e8.op r0 = (e8.op) r0     // Catch:{ all -> 0x0581 }
            e8.dj r0 = r0.f15814b     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.j9 r4 = e8.hj.f14919a     // Catch:{ all -> 0x0581 }
            r0.I0(r4)     // Catch:{ all -> 0x0581 }
        L_0x0503:
            com.google.android.gms.internal.ads.t7 r0 = r2.f13889u     // Catch:{ all -> 0x0581 }
            e8.wc r4 = e8.wc.d(r7, r11)     // Catch:{ all -> 0x0581 }
            r0.c0(r4)     // Catch:{ all -> 0x0581 }
            r0 = 0
            r4 = r6[r0]     // Catch:{ all -> 0x0581 }
            r0 = r6[r10]     // Catch:{ all -> 0x0581 }
            d7.l r5 = d7.l.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.ads.internal.util.p r5 = r5.f13186c     // Catch:{ all -> 0x0581 }
            android.app.Activity r5 = r2.f13890v     // Catch:{ all -> 0x0581 }
            int[] r5 = com.google.android.gms.ads.internal.util.p.E(r5)     // Catch:{ all -> 0x0581 }
            r6 = 0
            r5 = r5[r6]     // Catch:{ all -> 0x0581 }
            int r0 = r0 - r5
            int r5 = r2.f13887s     // Catch:{ all -> 0x0581 }
            int r6 = r2.f13884h     // Catch:{ all -> 0x0581 }
            r2.h(r4, r0, r5, r6)     // Catch:{ all -> 0x0581 }
            java.lang.String r0 = "resized"
            r2.t(r0)     // Catch:{ all -> 0x0581 }
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            goto L_0x0580
        L_0x052d:
            r0 = move-exception
            java.lang.String r4 = "Cannot show popup window: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0581 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0581 }
            int r5 = r0.length()     // Catch:{ all -> 0x0581 }
            if (r5 == 0) goto L_0x0543
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x0581 }
            goto L_0x0548
        L_0x0543:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0581 }
            r0.<init>(r4)     // Catch:{ all -> 0x0581 }
        L_0x0548:
            r2.s(r0)     // Catch:{ all -> 0x0581 }
            android.widget.RelativeLayout r0 = r2.B     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.t7 r4 = r2.f13889u     // Catch:{ all -> 0x0581 }
            android.view.View r4 = r4.getView()     // Catch:{ all -> 0x0581 }
            r0.removeView(r4)     // Catch:{ all -> 0x0581 }
            android.view.ViewGroup r0 = r2.C     // Catch:{ all -> 0x0581 }
            if (r0 == 0) goto L_0x0571
            android.widget.ImageView r4 = r2.f13892x     // Catch:{ all -> 0x0581 }
            r0.removeView(r4)     // Catch:{ all -> 0x0581 }
            android.view.ViewGroup r0 = r2.C     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.t7 r4 = r2.f13889u     // Catch:{ all -> 0x0581 }
            android.view.View r4 = r4.getView()     // Catch:{ all -> 0x0581 }
            r0.addView(r4)     // Catch:{ all -> 0x0581 }
            com.google.android.gms.internal.ads.t7 r0 = r2.f13889u     // Catch:{ all -> 0x0581 }
            e8.wc r2 = r2.f13891w     // Catch:{ all -> 0x0581 }
            r0.c0(r2)     // Catch:{ all -> 0x0581 }
        L_0x0571:
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            goto L_0x0580
        L_0x0573:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r2.s(r0)     // Catch:{ all -> 0x0581 }
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            goto L_0x0580
        L_0x057a:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r2.s(r0)     // Catch:{ all -> 0x0581 }
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
        L_0x0580:
            return
        L_0x0581:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0581 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.k3.f(java.lang.Object, java.util.Map):void");
    }
}
