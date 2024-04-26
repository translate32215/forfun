package d7;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.qn;
import e8.c40;
import e8.f9;
import e8.h9;
import e8.k9;
import e8.q10;
import e8.t;
import e8.ti0;
import e8.y8;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d implements c40, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final List<Object[]> f13165a = new Vector();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<c40> f13166b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<c40> f13167c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    public final int f13168d;

    /* renamed from: e  reason: collision with root package name */
    public Context f13169e;

    /* renamed from: f  reason: collision with root package name */
    public f9 f13170f;

    /* renamed from: g  reason: collision with root package name */
    public CountDownLatch f13171g = new CountDownLatch(1);

    public d(Context context, f9 f9Var) {
        this.f13169e = context;
        this.f13170f = f9Var;
        int intValue = ((Integer) ti0.f16763j.f16769f.a(t.f16592i1)).intValue();
        if (intValue == 1) {
            this.f13168d = 2;
        } else if (intValue != 2) {
            this.f13168d = 1;
        } else {
            this.f13168d = 3;
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16676w1)).booleanValue()) {
            ((k9) h9.f14881a).f15244a.execute(this);
            return;
        }
        y8 y8Var = ti0.f16763j.f16764a;
        if (y8.l()) {
            ((k9) h9.f14881a).f15244a.execute(this);
        } else {
            run();
        }
    }

    public static Context i(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final void a(View view) {
        c40 h10 = h();
        if (h10 != null) {
            h10.a(view);
        }
    }

    public final void b(int i10, int i11, int i12) {
        c40 h10 = h();
        if (h10 != null) {
            j();
            h10.b(i10, i11, i12);
            return;
        }
        this.f13165a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public final String c(Context context) {
        boolean z10;
        c40 c40;
        try {
            this.f13171g.await();
            z10 = true;
        } catch (InterruptedException e10) {
            e.D("Interrupted during GADSignals creation.", e10);
            z10 = false;
        }
        if (!z10) {
            return "";
        }
        int i10 = this.f13168d;
        if (i10 == 2 || i10 == 3) {
            c40 = this.f13167c.get();
        } else {
            c40 = this.f13166b.get();
        }
        if (c40 == null) {
            return "";
        }
        j();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return c40.c(context);
    }

    public final String d(Context context, View view, Activity activity) {
        c40 h10 = h();
        return h10 != null ? h10.d(context, view, activity) : "";
    }

    public final String e(Context context, String str, View view) {
        return g(context, str, view, (Activity) null);
    }

    public final void f(MotionEvent motionEvent) {
        c40 h10 = h();
        if (h10 != null) {
            j();
            h10.f(motionEvent);
            return;
        }
        this.f13165a.add(new Object[]{motionEvent});
    }

    public final String g(Context context, String str, View view, Activity activity) {
        boolean z10;
        c40 h10;
        try {
            this.f13171g.await();
            z10 = true;
        } catch (InterruptedException e10) {
            e.D("Interrupted during GADSignals creation.", e10);
            z10 = false;
        }
        if (!z10 || (h10 = h()) == null) {
            return "";
        }
        j();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return h10.g(context, str, view, activity);
    }

    public final c40 h() {
        if (this.f13168d == 2) {
            return this.f13167c.get();
        }
        return this.f13166b.get();
    }

    public final void j() {
        c40 h10 = h();
        if (!this.f13165a.isEmpty() && h10 != null) {
            for (Object[] next : this.f13165a) {
                if (next.length == 1) {
                    h10.f((MotionEvent) next[0]);
                } else if (next.length == 3) {
                    h10.b(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.f13165a.clear();
        }
    }

    public final void run() {
        boolean z10 = false;
        try {
            boolean z11 = this.f13170f.f14547d;
            if (!((Boolean) ti0.f16763j.f16769f.a(t.f16693z0)).booleanValue() && z11) {
                z10 = true;
            }
            if (this.f13168d != 2) {
                this.f13166b.set(qn.r(this.f13170f.f14544a, i(this.f13169e), z10, this.f13168d));
            }
            if (this.f13168d != 1) {
                this.f13167c.set(q10.i(this.f13170f.f14544a, i(this.f13169e), z10));
            }
        } finally {
            this.f13171g.countDown();
            this.f13169e = null;
            this.f13170f = null;
        }
    }
}
