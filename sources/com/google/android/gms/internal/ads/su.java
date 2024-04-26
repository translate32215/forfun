package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import d7.l;
import e8.q0;
import e8.t;
import e8.ti0;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import l0.e;
import o0.r;
import z7.h;

@TargetApi(14)
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class su extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8152a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8153b = false;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8154c;

    /* renamed from: d  reason: collision with root package name */
    public final qu f8155d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8156e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8157f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8158g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8159h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8160i;

    /* renamed from: r  reason: collision with root package name */
    public final int f8161r;

    /* renamed from: s  reason: collision with root package name */
    public final int f8162s;

    /* renamed from: t  reason: collision with root package name */
    public final int f8163t;

    /* renamed from: u  reason: collision with root package name */
    public final String f8164u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f8165v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f8166w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f8167x;

    public su() {
        qu quVar = new qu();
        this.f8155d = quVar;
        this.f8154c = new Object();
        this.f8157f = ((Long) q0.f16043d.b()).intValue();
        this.f8158g = ((Long) q0.f16040a.b()).intValue();
        this.f8159h = ((Long) q0.f16044e.b()).intValue();
        this.f8160i = ((Long) q0.f16042c.b()).intValue();
        this.f8161r = ((Integer) ti0.f16763j.f16769f.a(t.J)).intValue();
        this.f8162s = ((Integer) ti0.f16763j.f16769f.a(t.K)).intValue();
        this.f8163t = ((Integer) ti0.f16763j.f16769f.a(t.L)).intValue();
        this.f8156e = ((Long) q0.f16045f.b()).intValue();
        this.f8164u = (String) ti0.f16763j.f16769f.a(t.N);
        this.f8165v = ((Boolean) ti0.f16763j.f16769f.a(t.O)).booleanValue();
        this.f8166w = ((Boolean) ti0.f16763j.f16769f.a(t.P)).booleanValue();
        this.f8167x = ((Boolean) ti0.f16763j.f16769f.a(t.Q)).booleanValue();
        setName("ContentFetchTask");
    }

    public static boolean b() {
        boolean z10;
        try {
            Context b10 = l.B.f13189f.b();
            if (b10 == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b10.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b10.getSystemService("keyguard");
            if (activityManager == null) {
                return false;
            }
            if (keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (Process.myPid() == next.pid) {
                    if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) b10.getSystemService("power");
                    if (powerManager == null) {
                        z10 = false;
                    } else {
                        z10 = powerManager.isScreenOn();
                    }
                    if (z10) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    public final r a(View view, ou ouVar) {
        boolean z10;
        if (view == null) {
            return new r(0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new r(0, 0);
            }
            ouVar.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new r(1, 0);
        } else if ((view instanceof WebView) && !(view instanceof t7)) {
            WebView webView = (WebView) view;
            if (!h.b()) {
                z10 = false;
            } else {
                synchronized (ouVar.f7742g) {
                    ouVar.f7748m++;
                }
                webView.post(new r7.h(this, ouVar, webView, globalVisibleRect));
                z10 = true;
            }
            if (z10) {
                return new r(0, 1);
            }
            return new r(0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new r(0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                r a10 = a(viewGroup.getChildAt(i12), ouVar);
                i10 += a10.f22632a;
                i11 += a10.f22633b;
            }
            return new r(i10, i11);
        }
    }

    public final void c() {
        synchronized (this.f8154c) {
            this.f8153b = true;
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("ContentFetchThread: paused, mPause = ");
            sb2.append(true);
            e.E(sb2.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x008f */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f A[LOOP:1: B:27:0x008f->B:39:0x008f, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
        L_0x0000:
            boolean r0 = b()     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            if (r0 == 0) goto L_0x005d
            d7.l r0 = d7.l.B     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            com.google.android.gms.internal.ads.pu r0 = r0.f13189f     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            android.app.Activity r0 = r0.a()     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            l0.e.E(r0)     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            r5.c()     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            goto L_0x0065
        L_0x0019:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003b }
            if (r2 == 0) goto L_0x0052
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003b }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003b }
            if (r2 == 0) goto L_0x0052
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003b }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003b }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003b }
            r1 = r0
            goto L_0x0052
        L_0x003b:
            r0 = move-exception
            d7.l r2 = d7.l.B     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            com.google.android.gms.internal.ads.y6 r2 = r2.f13190g     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            android.content.Context r4 = r2.f8584e     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            e8.f9 r2 = r2.f8585f     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            e8.v6 r2 = com.google.android.gms.internal.ads.a5.d(r4, r2)     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            r2.c(r0, r3)     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            l0.e.E(r0)     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
        L_0x0052:
            if (r1 == 0) goto L_0x0065
            e7.i r0 = new e7.i     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            r0.<init>((com.google.android.gms.internal.ads.su) r5, (android.view.View) r1)     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            goto L_0x0065
        L_0x005d:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            l0.e.E(r0)     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            r5.c()     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
        L_0x0065:
            int r0 = r5.f8156e     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0086, Exception -> 0x006e }
            goto L_0x008c
        L_0x006e:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            l0.e.C(r1, r0)
            d7.l r1 = d7.l.B
            com.google.android.gms.internal.ads.y6 r1 = r1.f13190g
            java.lang.String r2 = "ContentFetchTask.run"
            android.content.Context r3 = r1.f8584e
            e8.f9 r1 = r1.f8585f
            e8.v6 r1 = com.google.android.gms.internal.ads.a5.d(r3, r1)
            r1.c(r0, r2)
            goto L_0x008c
        L_0x0086:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            l0.e.C(r1, r0)
        L_0x008c:
            java.lang.Object r0 = r5.f8154c
            monitor-enter(r0)
        L_0x008f:
            boolean r1 = r5.f8153b     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x009e
            java.lang.String r1 = "ContentFetchTask: waiting"
            l0.e.E(r1)     // Catch:{ InterruptedException -> 0x008f }
            java.lang.Object r1 = r5.f8154c     // Catch:{ InterruptedException -> 0x008f }
            r1.wait()     // Catch:{ InterruptedException -> 0x008f }
            goto L_0x008f
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            goto L_0x0000
        L_0x00a1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            goto L_0x00a5
        L_0x00a4:
            throw r1
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.su.run():void");
    }
}
