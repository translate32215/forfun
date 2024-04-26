package r7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.ou;
import com.google.android.gms.internal.ads.su;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.p;
import e8.zg0;
import java.util.concurrent.atomic.AtomicReference;
import k8.v0;
import o8.b;
import o8.b6;
import o8.r;
import o8.r4;
import o8.s4;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24699a = 1;

    /* renamed from: b  reason: collision with root package name */
    public Object f24700b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f24701c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f24702d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24703e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f24704f;

    public h(AppMeasurementDynamiteService appMeasurementDynamiteService, v0 v0Var, String str, String str2, boolean z10) {
        this.f24704f = appMeasurementDynamiteService;
        this.f24700b = v0Var;
        this.f24701c = str;
        this.f24702d = str2;
        this.f24703e = z10;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3 A[SYNTHETIC, Splitter:B:38:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013a A[Catch:{ RuntimeException -> 0x01c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013c A[Catch:{ RuntimeException -> 0x01c1 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.f24699a
            r3 = 0
            switch(r0) {
                case 0: goto L_0x0228;
                case 1: goto L_0x0202;
                case 2: goto L_0x01d2;
                case 3: goto L_0x0075;
                case 4: goto L_0x0045;
                case 5: goto L_0x000b;
                default: goto L_0x0008;
            }
        L_0x0008:
            r2 = 0
            goto L_0x0264
        L_0x000b:
            java.lang.Object r0 = r1.f24704f
            com.google.android.gms.measurement.internal.p r0 = (com.google.android.gms.measurement.internal.p) r0
            com.google.android.gms.measurement.internal.d r3 = r0.f8867d
            if (r3 != 0) goto L_0x0021
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8797f
            java.lang.String r2 = "Discarding data. Failed to send event to service"
            r0.a(r2)
            goto L_0x0044
        L_0x0021:
            java.lang.Object r0 = r1.f24700b
            o8.b6 r0 = (o8.b6) r0
            com.google.android.gms.common.internal.i.h(r0)
            java.lang.Object r0 = r1.f24704f
            com.google.android.gms.measurement.internal.p r0 = (com.google.android.gms.measurement.internal.p) r0
            boolean r4 = r1.f24703e
            if (r4 == 0) goto L_0x0032
            r2 = 0
            goto L_0x0036
        L_0x0032:
            java.lang.Object r2 = r1.f24701c
            o8.r r2 = (o8.r) r2
        L_0x0036:
            java.lang.Object r4 = r1.f24700b
            o8.b6 r4 = (o8.b6) r4
            r0.l(r3, r2, r4)
            java.lang.Object r0 = r1.f24704f
            com.google.android.gms.measurement.internal.p r0 = (com.google.android.gms.measurement.internal.p) r0
            r0.s()
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r0 = r1.f24704f
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8778a
            com.google.android.gms.measurement.internal.p r0 = r0.y()
            java.lang.Object r2 = r1.f24700b
            r10 = r2
            k8.v0 r10 = (k8.v0) r10
            java.lang.Object r2 = r1.f24701c
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r1.f24702d
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = r1.f24703e
            r0.h()
            r0.i()
            o8.b6 r8 = r0.q(r3)
            o8.a5 r2 = new o8.a5
            r4 = r2
            r5 = r0
            r4.<init>((com.google.android.gms.measurement.internal.p) r5, (java.lang.String) r6, (java.lang.String) r7, (o8.b6) r8, (boolean) r9, (k8.v0) r10)
            r0.t(r2)
            return
        L_0x0075:
            java.lang.Object r0 = r1.f24704f
            r4 = r0
            o8.r4 r4 = (o8.r4) r4
            boolean r0 = r1.f24703e
            java.lang.Object r5 = r1.f24700b
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r6 = r1.f24701c
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.f24702d
            java.lang.String r7 = (java.lang.String) r7
            o8.s4 r8 = r4.f23421a
            r8.h()
            o8.s4 r8 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.l r8 = r8.f8864a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.r r8 = r8.A()     // Catch:{ RuntimeException -> 0x01c1 }
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ RuntimeException -> 0x01c1 }
            java.lang.String r10 = "Activity created with data 'referrer' without required params"
            java.lang.String r11 = "_cis"
            java.lang.String r12 = "utm_medium"
            java.lang.String r13 = "utm_source"
            java.lang.String r14 = "utm_campaign"
            java.lang.String r15 = "gclid"
            if (r9 == 0) goto L_0x00a8
            goto L_0x00cb
        L_0x00a8:
            boolean r9 = r7.contains(r15)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r9 != 0) goto L_0x00cd
            boolean r9 = r7.contains(r14)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r9 != 0) goto L_0x00cd
            boolean r9 = r7.contains(r13)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r9 != 0) goto L_0x00cd
            boolean r9 = r7.contains(r12)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r9 != 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.l r8 = r8.f8864a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.h r8 = r8.d()     // Catch:{ RuntimeException -> 0x01c1 }
            o8.a3 r8 = r8.f8804m     // Catch:{ RuntimeException -> 0x01c1 }
            r8.a(r10)     // Catch:{ RuntimeException -> 0x01c1 }
        L_0x00cb:
            r2 = 0
            goto L_0x00ef
        L_0x00cd:
            java.lang.String r9 = "https://google.com/search?"
            int r16 = r7.length()     // Catch:{ RuntimeException -> 0x01c1 }
            if (r16 == 0) goto L_0x00da
            java.lang.String r9 = r9.concat(r7)     // Catch:{ RuntimeException -> 0x01c1 }
            goto L_0x00e0
        L_0x00da:
            java.lang.String r2 = new java.lang.String     // Catch:{ RuntimeException -> 0x01c1 }
            r2.<init>(r9)     // Catch:{ RuntimeException -> 0x01c1 }
            r9 = r2
        L_0x00e0:
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch:{ RuntimeException -> 0x01c1 }
            android.os.Bundle r2 = r8.p0(r2)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r2 == 0) goto L_0x00ef
            java.lang.String r8 = "referrer"
            r2.putString(r11, r8)     // Catch:{ RuntimeException -> 0x01c1 }
        L_0x00ef:
            java.lang.String r8 = "_cmp"
            if (r0 == 0) goto L_0x0134
            o8.s4 r0 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.r r0 = r0.A()     // Catch:{ RuntimeException -> 0x01c1 }
            android.os.Bundle r0 = r0.p0(r5)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 == 0) goto L_0x0134
            java.lang.String r5 = "intent"
            r0.putString(r11, r5)     // Catch:{ RuntimeException -> 0x01c1 }
            boolean r5 = r0.containsKey(r15)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r5 != 0) goto L_0x0128
            if (r2 == 0) goto L_0x0128
            boolean r5 = r2.containsKey(r15)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r5 == 0) goto L_0x0128
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ RuntimeException -> 0x01c1 }
            java.lang.String r9 = r2.getString(r15)     // Catch:{ RuntimeException -> 0x01c1 }
            r5[r3] = r9     // Catch:{ RuntimeException -> 0x01c1 }
            java.lang.String r3 = "_cer"
            java.lang.String r9 = "gclid=%s"
            java.lang.String r5 = java.lang.String.format(r9, r5)     // Catch:{ RuntimeException -> 0x01c1 }
            r0.putString(r3, r5)     // Catch:{ RuntimeException -> 0x01c1 }
        L_0x0128:
            o8.s4 r3 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            r3.o(r6, r8, r0)     // Catch:{ RuntimeException -> 0x01c1 }
            o8.s4 r3 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            o8.d6 r3 = r3.f23439n     // Catch:{ RuntimeException -> 0x01c1 }
            r3.a(r6, r0)     // Catch:{ RuntimeException -> 0x01c1 }
        L_0x0134:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 == 0) goto L_0x013c
            goto L_0x01d1
        L_0x013c:
            o8.s4 r0 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ RuntimeException -> 0x01c1 }
            o8.a3 r0 = r0.f8804m     // Catch:{ RuntimeException -> 0x01c1 }
            java.lang.String r3 = "Activity created with referrer"
            r0.b(r3, r7)     // Catch:{ RuntimeException -> 0x01c1 }
            o8.s4 r0 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a     // Catch:{ RuntimeException -> 0x01c1 }
            o8.f r0 = r0.f8843g     // Catch:{ RuntimeException -> 0x01c1 }
            o8.u2<java.lang.Boolean> r3 = o8.v2.f23500a0     // Catch:{ RuntimeException -> 0x01c1 }
            r5 = 0
            boolean r0 = r0.v(r5, r3)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 == 0) goto L_0x017f
            if (r2 == 0) goto L_0x0169
            o8.s4 r0 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            r0.o(r6, r8, r2)     // Catch:{ RuntimeException -> 0x01c1 }
            o8.s4 r0 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            o8.d6 r0 = r0.f23439n     // Catch:{ RuntimeException -> 0x01c1 }
            r0.a(r6, r2)     // Catch:{ RuntimeException -> 0x01c1 }
            goto L_0x0178
        L_0x0169:
            o8.s4 r0 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ RuntimeException -> 0x01c1 }
            o8.a3 r0 = r0.f8804m     // Catch:{ RuntimeException -> 0x01c1 }
            java.lang.String r2 = "Referrer does not contain valid parameters"
            r0.b(r2, r7)     // Catch:{ RuntimeException -> 0x01c1 }
        L_0x0178:
            o8.s4 r0 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            r2 = 0
            r0.z(r2)     // Catch:{ RuntimeException -> 0x01c1 }
            goto L_0x01d1
        L_0x017f:
            boolean r0 = r7.contains(r15)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 == 0) goto L_0x01b3
            boolean r0 = r7.contains(r14)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r7.contains(r13)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 != 0) goto L_0x01a7
            boolean r0 = r7.contains(r12)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 != 0) goto L_0x01a7
            java.lang.String r0 = "utm_term"
            boolean r0 = r7.contains(r0)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 != 0) goto L_0x01a7
            java.lang.String r0 = "utm_content"
            boolean r0 = r7.contains(r0)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 == 0) goto L_0x01b3
        L_0x01a7:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ RuntimeException -> 0x01c1 }
            if (r0 != 0) goto L_0x01d1
            o8.s4 r0 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            r0.z(r7)     // Catch:{ RuntimeException -> 0x01c1 }
            goto L_0x01d1
        L_0x01b3:
            o8.s4 r0 = r4.f23421a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a     // Catch:{ RuntimeException -> 0x01c1 }
            com.google.android.gms.measurement.internal.h r0 = r0.d()     // Catch:{ RuntimeException -> 0x01c1 }
            o8.a3 r0 = r0.f8804m     // Catch:{ RuntimeException -> 0x01c1 }
            r0.a(r10)     // Catch:{ RuntimeException -> 0x01c1 }
            goto L_0x01d1
        L_0x01c1:
            r0 = move-exception
            o8.s4 r2 = r4.f23421a
            com.google.android.gms.measurement.internal.l r2 = r2.f8864a
            com.google.android.gms.measurement.internal.h r2 = r2.d()
            o8.a3 r2 = r2.f8797f
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.b(r3, r0)
        L_0x01d1:
            return
        L_0x01d2:
            java.lang.Object r0 = r1.f24704f
            o8.s4 r0 = (o8.s4) r0
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.p r0 = r0.y()
            java.lang.Object r2 = r1.f24700b
            r6 = r2
            java.util.concurrent.atomic.AtomicReference r6 = (java.util.concurrent.atomic.AtomicReference) r6
            java.lang.Object r2 = r1.f24701c
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r1.f24702d
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            boolean r10 = r1.f24703e
            r0.h()
            r0.i()
            o8.b6 r9 = r0.q(r3)
            o8.a5 r2 = new o8.a5
            r4 = r2
            r5 = r0
            r4.<init>((com.google.android.gms.measurement.internal.p) r5, (java.util.concurrent.atomic.AtomicReference) r6, (java.lang.String) r7, (java.lang.String) r8, (o8.b6) r9, (boolean) r10)
            r0.t(r2)
            return
        L_0x0202:
            java.lang.Object r0 = r1.f24702d
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            android.webkit.WebSettings r0 = r0.getSettings()
            boolean r0 = r0.getJavaScriptEnabled()
            if (r0 == 0) goto L_0x0227
            java.lang.Object r0 = r1.f24702d     // Catch:{ all -> 0x021e }
            android.webkit.WebView r0 = (android.webkit.WebView) r0     // Catch:{ all -> 0x021e }
            java.lang.String r2 = "(function() { return  {text:document.body.innerText}})();"
            java.lang.Object r3 = r1.f24700b     // Catch:{ all -> 0x021e }
            android.webkit.ValueCallback r3 = (android.webkit.ValueCallback) r3     // Catch:{ all -> 0x021e }
            r0.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x021e }
            goto L_0x0227
        L_0x021e:
            java.lang.Object r0 = r1.f24700b
            android.webkit.ValueCallback r0 = (android.webkit.ValueCallback) r0
            java.lang.String r2 = ""
            r0.onReceiveValue(r2)
        L_0x0227:
            return
        L_0x0228:
            r2 = 0
            java.lang.Object r0 = r1.f24700b
            r7.b r0 = (r7.b) r0
            java.lang.Object r3 = r1.f24701c
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.Object r4 = r1.f24702d
            android.content.Context r4 = (android.content.Context) r4
            boolean r5 = r1.f24703e
            java.lang.Object r6 = r1.f24704f
            android.content.BroadcastReceiver$PendingResult r6 = (android.content.BroadcastReceiver.PendingResult) r6
            r0.getClass()
            java.lang.String r7 = "wrapped_intent"
            android.os.Parcelable r7 = r3.getParcelableExtra(r7)     // Catch:{ all -> 0x025f }
            boolean r8 = r7 instanceof android.content.Intent     // Catch:{ all -> 0x025f }
            if (r8 == 0) goto L_0x024b
            r2 = r7
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ all -> 0x025f }
        L_0x024b:
            if (r2 == 0) goto L_0x0252
            int r0 = r0.a(r4, r2)     // Catch:{ all -> 0x025f }
            goto L_0x0256
        L_0x0252:
            int r0 = r0.b(r4, r3)     // Catch:{ all -> 0x025f }
        L_0x0256:
            if (r5 == 0) goto L_0x025b
            r6.setResultCode(r0)     // Catch:{ all -> 0x025f }
        L_0x025b:
            r6.finish()
            return
        L_0x025f:
            r0 = move-exception
            r6.finish()
            throw r0
        L_0x0264:
            java.lang.Object r0 = r1.f24704f
            com.google.android.gms.measurement.internal.p r0 = (com.google.android.gms.measurement.internal.p) r0
            com.google.android.gms.measurement.internal.d r3 = r0.f8867d
            if (r3 != 0) goto L_0x027a
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8797f
            java.lang.String r2 = "Discarding data. Failed to send conditional user property to service"
            r0.a(r2)
            goto L_0x029c
        L_0x027a:
            java.lang.Object r0 = r1.f24700b
            o8.b6 r0 = (o8.b6) r0
            com.google.android.gms.common.internal.i.h(r0)
            java.lang.Object r0 = r1.f24704f
            com.google.android.gms.measurement.internal.p r0 = (com.google.android.gms.measurement.internal.p) r0
            boolean r4 = r1.f24703e
            if (r4 == 0) goto L_0x028a
            goto L_0x028e
        L_0x028a:
            java.lang.Object r2 = r1.f24701c
            o8.b r2 = (o8.b) r2
        L_0x028e:
            java.lang.Object r4 = r1.f24700b
            o8.b6 r4 = (o8.b6) r4
            r0.l(r3, r2, r4)
            java.lang.Object r0 = r1.f24704f
            com.google.android.gms.measurement.internal.p r0 = (com.google.android.gms.measurement.internal.p) r0
            r0.s()
        L_0x029c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.h.run():void");
    }

    public h(p pVar, b6 b6Var, boolean z10, b bVar, b bVar2) {
        this.f24704f = pVar;
        this.f24700b = b6Var;
        this.f24703e = z10;
        this.f24701c = bVar;
        this.f24702d = bVar2;
    }

    public h(p pVar, b6 b6Var, boolean z10, r rVar, String str) {
        this.f24704f = pVar;
        this.f24700b = b6Var;
        this.f24703e = z10;
        this.f24701c = rVar;
        this.f24702d = str;
    }

    public h(r4 r4Var, boolean z10, Uri uri, String str, String str2) {
        this.f24704f = r4Var;
        this.f24703e = z10;
        this.f24700b = uri;
        this.f24701c = str;
        this.f24702d = str2;
    }

    public h(s4 s4Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f24704f = s4Var;
        this.f24700b = atomicReference;
        this.f24701c = str;
        this.f24702d = str2;
        this.f24703e = z10;
    }

    public h(b bVar, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f24700b = bVar;
        this.f24701c = intent;
        this.f24702d = context;
        this.f24703e = z10;
        this.f24704f = pendingResult;
    }

    public h(su suVar, ou ouVar, WebView webView, boolean z10) {
        this.f24704f = suVar;
        this.f24701c = ouVar;
        this.f24702d = webView;
        this.f24703e = z10;
        this.f24700b = new zg0(this);
    }
}
