package androidx.activity;

import android.app.Activity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.k1;
import c5.b;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.f;
import com.google.firebase.installations.a;
import dev.pankaj.yacinetv.tvui.splash.SplashActivity;
import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import dev.pankaj.ytvclib.ui.main.WebActivity;
import z5.x;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f363a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f364b;

    public /* synthetic */ c(Activity activity) {
        this.f364b = activity;
    }

    public /* synthetic */ c(ComponentActivity componentActivity) {
        this.f364b = componentActivity;
    }

    public /* synthetic */ c(Toolbar toolbar) {
        this.f364b = toolbar;
    }

    public /* synthetic */ c(k1 k1Var) {
        this.f364b = k1Var;
    }

    public /* synthetic */ c(b bVar) {
        this.f364b = bVar;
    }

    public /* synthetic */ c(DashMediaSource dashMediaSource) {
        this.f364b = dashMediaSource;
    }

    public /* synthetic */ c(f fVar) {
        this.f364b = fVar;
    }

    public /* synthetic */ c(com.google.android.exoplayer2.ui.b bVar) {
        this.f364b = bVar;
    }

    public /* synthetic */ c(a aVar) {
        this.f364b = aVar;
    }

    public /* synthetic */ c(SplashActivity splashActivity) {
        this.f364b = splashActivity;
    }

    public /* synthetic */ c(ControlActivity controlActivity) {
        this.f364b = controlActivity;
    }

    public /* synthetic */ c(WebActivity webActivity) {
        this.f364b = webActivity;
    }

    public /* synthetic */ c(t6.f fVar) {
        this.f364b = fVar;
    }

    public /* synthetic */ c(x xVar) {
        this.f364b = xVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.f363a
            r1 = 0
            r2 = 8
            r3 = 1
            java.lang.String r4 = "this$0"
            r5 = 0
            switch(r0) {
                case 0: goto L_0x0161;
                case 1: goto L_0x0159;
                case 2: goto L_0x0151;
                case 3: goto L_0x00ad;
                case 4: goto L_0x00a5;
                case 5: goto L_0x009d;
                case 6: goto L_0x008c;
                case 7: goto L_0x0082;
                case 8: goto L_0x0078;
                case 9: goto L_0x006e;
                case 10: goto L_0x004a;
                case 11: goto L_0x0040;
                case 12: goto L_0x0029;
                case 13: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0169
        L_0x000e:
            java.lang.Object r0 = r13.f364b
            dev.pankaj.ytvclib.ui.dlna.ControlActivity r0 = (dev.pankaj.ytvclib.ui.dlna.ControlActivity) r0
            int r1 = dev.pankaj.ytvclib.ui.dlna.ControlActivity.R
            ud.k.f(r0, r4)
            wc.i r1 = new wc.i
            r1.<init>(r0)
            r1.start()
            android.os.Handler r1 = r0.Q
            java.lang.Runnable r0 = r0.P
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.postDelayed(r0, r2)
            return
        L_0x0029:
            java.lang.Object r0 = r13.f364b
            dev.pankaj.yacinetv.tvui.splash.SplashActivity r0 = (dev.pankaj.yacinetv.tvui.splash.SplashActivity) r0
            kotlin.reflect.KProperty<java.lang.Object>[] r1 = dev.pankaj.yacinetv.tvui.splash.SplashActivity.M
            ud.k.f(r0, r4)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<dev.pankaj.yacinetv.tvui.main.MainActivity> r2 = dev.pankaj.yacinetv.tvui.main.MainActivity.class
            r1.<init>(r0, r2)
            r0.startActivity(r1)
            r0.finish()
            return
        L_0x0040:
            java.lang.Object r0 = r13.f364b
            com.google.firebase.installations.a r0 = (com.google.firebase.installations.a) r0
            java.lang.Object r2 = com.google.firebase.installations.a.f9676m
            r0.b(r1)
            return
        L_0x004a:
            java.lang.Object r0 = r13.f364b
            t6.f r0 = (t6.f) r0
            android.view.Surface r1 = r0.f25797h
            if (r1 == 0) goto L_0x006d
            x4.r0$d r2 = r0.f25798i
            if (r2 == 0) goto L_0x005b
            x4.a1 r2 = (x4.a1) r2
            r2.J(r1)
        L_0x005b:
            android.graphics.SurfaceTexture r1 = r0.f25796g
            android.view.Surface r2 = r0.f25797h
            if (r1 == 0) goto L_0x0064
            r1.release()
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r2.release()
        L_0x0069:
            r0.f25796g = r5
            r0.f25797h = r5
        L_0x006d:
            return
        L_0x006e:
            java.lang.Object r0 = r13.f364b
            com.google.android.exoplayer2.ui.b r0 = (com.google.android.exoplayer2.ui.b) r0
            int r1 = com.google.android.exoplayer2.ui.b.f5399r0
            r0.l()
            return
        L_0x0078:
            java.lang.Object r0 = r13.f364b
            com.google.android.exoplayer2.source.hls.f r0 = (com.google.android.exoplayer2.source.hls.f) r0
            r0.J = r3
            r0.B()
            return
        L_0x0082:
            java.lang.Object r0 = r13.f364b
            com.google.android.exoplayer2.source.dash.DashMediaSource r0 = (com.google.android.exoplayer2.source.dash.DashMediaSource) r0
            int r1 = com.google.android.exoplayer2.source.dash.DashMediaSource.f5026b0
            r0.F()
            return
        L_0x008c:
            java.lang.Object r0 = r13.f364b
            z5.x r0 = (z5.x) r0
            boolean r1 = r0.Z
            if (r1 != 0) goto L_0x009c
            z5.o$a r1 = r0.f28672y
            r1.getClass()
            r1.d(r0)
        L_0x009c:
            return
        L_0x009d:
            java.lang.Object r0 = r13.f364b
            c5.b r0 = (c5.b) r0
            r0.e(r5)
            return
        L_0x00a5:
            java.lang.Object r0 = r13.f364b
            androidx.emoji2.text.k$b r0 = (androidx.emoji2.text.k.b) r0
            r0.c()
            return
        L_0x00ad:
            java.lang.Object r0 = r13.f364b
            android.app.Activity r0 = (android.app.Activity) r0
            int r4 = androidx.core.app.b.f1381c
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L_0x0150
            java.lang.Class<?> r4 = c0.e.f3936a
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 < r6) goto L_0x00c6
            r0.recreate()
            goto L_0x013c
        L_0x00c6:
            boolean r4 = c0.e.a()
            if (r4 == 0) goto L_0x00d2
            java.lang.reflect.Method r4 = c0.e.f3941f
            if (r4 != 0) goto L_0x00d2
            goto L_0x014b
        L_0x00d2:
            java.lang.reflect.Method r4 = c0.e.f3940e
            if (r4 != 0) goto L_0x00db
            java.lang.reflect.Method r4 = c0.e.f3939d
            if (r4 != 0) goto L_0x00db
            goto L_0x014b
        L_0x00db:
            java.lang.reflect.Field r4 = c0.e.f3938c     // Catch:{ all -> 0x014a }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x014a }
            if (r4 != 0) goto L_0x00e4
            goto L_0x014b
        L_0x00e4:
            java.lang.reflect.Field r6 = c0.e.f3937b     // Catch:{ all -> 0x014a }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ all -> 0x014a }
            if (r6 != 0) goto L_0x00ed
            goto L_0x014b
        L_0x00ed:
            android.app.Application r7 = r0.getApplication()     // Catch:{ all -> 0x014a }
            c0.e$a r8 = new c0.e$a     // Catch:{ all -> 0x014a }
            r8.<init>(r0)     // Catch:{ all -> 0x014a }
            r7.registerActivityLifecycleCallbacks(r8)     // Catch:{ all -> 0x014a }
            android.os.Handler r9 = c0.e.f3942g     // Catch:{ all -> 0x014a }
            c0.b r10 = new c0.b     // Catch:{ all -> 0x014a }
            r10.<init>(r8, r4)     // Catch:{ all -> 0x014a }
            r9.post(r10)     // Catch:{ all -> 0x014a }
            boolean r10 = c0.e.a()     // Catch:{ all -> 0x013e }
            if (r10 == 0) goto L_0x0131
            java.lang.reflect.Method r10 = c0.e.f3941f     // Catch:{ all -> 0x013e }
            r11 = 9
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x013e }
            r11[r1] = r4     // Catch:{ all -> 0x013e }
            r11[r3] = r5     // Catch:{ all -> 0x013e }
            r4 = 2
            r11[r4] = r5     // Catch:{ all -> 0x013e }
            r4 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x013e }
            r11[r4] = r12     // Catch:{ all -> 0x013e }
            r4 = 4
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x013e }
            r11[r4] = r12     // Catch:{ all -> 0x013e }
            r4 = 5
            r11[r4] = r5     // Catch:{ all -> 0x013e }
            r4 = 6
            r11[r4] = r5     // Catch:{ all -> 0x013e }
            r4 = 7
            r11[r4] = r12     // Catch:{ all -> 0x013e }
            r11[r2] = r12     // Catch:{ all -> 0x013e }
            r10.invoke(r6, r11)     // Catch:{ all -> 0x013e }
            goto L_0x0134
        L_0x0131:
            r0.recreate()     // Catch:{ all -> 0x013e }
        L_0x0134:
            c0.c r2 = new c0.c     // Catch:{ all -> 0x014a }
            r2.<init>(r7, r8)     // Catch:{ all -> 0x014a }
            r9.post(r2)     // Catch:{ all -> 0x014a }
        L_0x013c:
            r1 = 1
            goto L_0x014b
        L_0x013e:
            r2 = move-exception
            android.os.Handler r3 = c0.e.f3942g     // Catch:{ all -> 0x014a }
            c0.c r4 = new c0.c     // Catch:{ all -> 0x014a }
            r4.<init>(r7, r8)     // Catch:{ all -> 0x014a }
            r3.post(r4)     // Catch:{ all -> 0x014a }
            throw r2     // Catch:{ all -> 0x014a }
        L_0x014a:
        L_0x014b:
            if (r1 != 0) goto L_0x0150
            r0.recreate()
        L_0x0150:
            return
        L_0x0151:
            java.lang.Object r0 = r13.f364b
            androidx.appcompat.widget.k1 r0 = (androidx.appcompat.widget.k1) r0
            r0.a()
            return
        L_0x0159:
            java.lang.Object r0 = r13.f364b
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r0.p()
            return
        L_0x0161:
            java.lang.Object r0 = r13.f364b
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            r0.invalidateOptionsMenu()
            return
        L_0x0169:
            java.lang.Object r0 = r13.f364b
            dev.pankaj.ytvclib.ui.main.WebActivity r0 = (dev.pankaj.ytvclib.ui.main.WebActivity) r0
            int r1 = dev.pankaj.ytvclib.ui.main.WebActivity.J
            ud.k.f(r0, r4)
            androidx.databinding.ViewDataBinding r0 = r0.L()
            tc.g r0 = (tc.g) r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.f25900w
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.c.run():void");
    }
}
