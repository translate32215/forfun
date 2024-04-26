package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.impl.background.systemalarm.e;
import h2.a;
import java.util.Collections;
import java.util.List;
import l2.d;
import o2.j;
import o2.l;
import p2.k;

/* compiled from: DelayMetCommandHandler */
public class c implements l2.c, a, e.b {

    /* renamed from: r  reason: collision with root package name */
    public static final String f3286r = g2.e.e("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f3287a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3288b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3289c;

    /* renamed from: d  reason: collision with root package name */
    public final d f3290d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3291e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3292f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public int f3293g = 0;

    /* renamed from: h  reason: collision with root package name */
    public PowerManager.WakeLock f3294h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3295i = false;

    public c(Context context, int i10, String str, d dVar) {
        this.f3287a = context;
        this.f3288b = i10;
        this.f3290d = dVar;
        this.f3289c = str;
        this.f3291e = new d(context, dVar.f3298b, this);
    }

    public void a(String str, boolean z10) {
        g2.e.c().a(f3286r, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z10)}), new Throwable[0]);
        d();
        if (z10) {
            Intent d10 = a.d(this.f3287a, this.f3289c);
            d dVar = this.f3290d;
            dVar.f3303g.post(new d.b(dVar, d10, this.f3288b));
        }
        if (this.f3295i) {
            Intent b10 = a.b(this.f3287a);
            d dVar2 = this.f3290d;
            dVar2.f3303g.post(new d.b(dVar2, b10, this.f3288b));
        }
    }

    public void b(String str) {
        g2.e.c().a(f3286r, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        g();
    }

    public void c(List<String> list) {
        g();
    }

    public final void d() {
        synchronized (this.f3292f) {
            this.f3291e.c();
            this.f3290d.f3299c.b(this.f3289c);
            PowerManager.WakeLock wakeLock = this.f3294h;
            if (wakeLock != null && wakeLock.isHeld()) {
                g2.e.c().a(f3286r, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f3294h, this.f3289c}), new Throwable[0]);
                this.f3294h.release();
            }
        }
    }

    public void e(List<String> list) {
        if (list.contains(this.f3289c)) {
            synchronized (this.f3292f) {
                if (this.f3293g == 0) {
                    this.f3293g = 1;
                    g2.e.c().a(f3286r, String.format("onAllConstraintsMet for %s", new Object[]{this.f3289c}), new Throwable[0]);
                    if (this.f3290d.f3300d.c(this.f3289c, (WorkerParameters.a) null)) {
                        this.f3290d.f3299c.a(this.f3289c, 600000, this);
                    } else {
                        d();
                    }
                } else {
                    g2.e.c().a(f3286r, String.format("Already started work for %s", new Object[]{this.f3289c}), new Throwable[0]);
                }
            }
        }
    }

    public void f() {
        this.f3294h = k.a(this.f3287a, String.format("%s (%s)", new Object[]{this.f3289c, Integer.valueOf(this.f3288b)}));
        g2.e c10 = g2.e.c();
        String str = f3286r;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f3294h, this.f3289c}), new Throwable[0]);
        this.f3294h.acquire();
        j h10 = ((l) this.f3290d.f3301e.f18830c.n()).h(this.f3289c);
        if (h10 == null) {
            g();
            return;
        }
        boolean b10 = h10.b();
        this.f3295i = b10;
        if (!b10) {
            g2.e.c().a(str, String.format("No constraints for %s", new Object[]{this.f3289c}), new Throwable[0]);
            e(Collections.singletonList(this.f3289c));
            return;
        }
        this.f3291e.b(Collections.singletonList(h10));
    }

    public final void g() {
        boolean containsKey;
        synchronized (this.f3292f) {
            if (this.f3293g < 2) {
                this.f3293g = 2;
                g2.e c10 = g2.e.c();
                String str = f3286r;
                c10.a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f3289c}), new Throwable[0]);
                Context context = this.f3287a;
                String str2 = this.f3289c;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                d dVar = this.f3290d;
                dVar.f3303g.post(new d.b(dVar, intent, this.f3288b));
                h2.c cVar = this.f3290d.f3300d;
                String str3 = this.f3289c;
                synchronized (cVar.f18810i) {
                    containsKey = cVar.f18806e.containsKey(str3);
                }
                if (containsKey) {
                    g2.e.c().a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f3289c}), new Throwable[0]);
                    Intent d10 = a.d(this.f3287a, this.f3289c);
                    d dVar2 = this.f3290d;
                    dVar2.f3303g.post(new d.b(dVar2, d10, this.f3288b));
                } else {
                    g2.e.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f3289c}), new Throwable[0]);
                }
            } else {
                g2.e.c().a(f3286r, String.format("Already stopped work for %s", new Object[]{this.f3289c}), new Throwable[0]);
            }
        }
    }
}
