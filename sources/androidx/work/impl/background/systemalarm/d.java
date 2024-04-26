package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import g2.e;
import h2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2.k;

/* compiled from: SystemAlarmDispatcher */
public class d implements h2.a {

    /* renamed from: s  reason: collision with root package name */
    public static final String f3296s = e.e("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    public final Context f3297a;

    /* renamed from: b  reason: collision with root package name */
    public final r2.a f3298b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3299c = new e();

    /* renamed from: d  reason: collision with root package name */
    public final h2.c f3300d;

    /* renamed from: e  reason: collision with root package name */
    public final h f3301e;

    /* renamed from: f  reason: collision with root package name */
    public final a f3302f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f3303g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Intent> f3304h;

    /* renamed from: i  reason: collision with root package name */
    public Intent f3305i;

    /* renamed from: r  reason: collision with root package name */
    public c f3306r;

    /* compiled from: SystemAlarmDispatcher */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d dVar;
            C0042d dVar2;
            synchronized (d.this.f3304h) {
                d dVar3 = d.this;
                dVar3.f3305i = dVar3.f3304h.get(0);
            }
            Intent intent = d.this.f3305i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f3305i.getIntExtra("KEY_START_ID", 0);
                e c10 = e.c();
                String str = d.f3296s;
                c10.a(str, String.format("Processing command %s, %s", new Object[]{d.this.f3305i, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock a10 = k.a(d.this.f3297a, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    e.c().a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a10}), new Throwable[0]);
                    a10.acquire();
                    d dVar4 = d.this;
                    dVar4.f3302f.e(dVar4.f3305i, intExtra, dVar4);
                    e.c().a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a10}), new Throwable[0]);
                    a10.release();
                    dVar = d.this;
                    dVar2 = new C0042d(dVar);
                } catch (Throwable th) {
                    e.c().a(d.f3296s, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a10}), new Throwable[0]);
                    a10.release();
                    d dVar5 = d.this;
                    dVar5.f3303g.post(new C0042d(dVar5));
                    throw th;
                }
                dVar.f3303g.post(dVar2);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final d f3308a;

        /* renamed from: b  reason: collision with root package name */
        public final Intent f3309b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3310c;

        public b(d dVar, Intent intent, int i10) {
            this.f3308a = dVar;
            this.f3309b = intent;
            this.f3310c = i10;
        }

        public void run() {
            this.f3308a.b(this.f3309b, this.f3310c);
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    public interface c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* compiled from: SystemAlarmDispatcher */
    public static class C0042d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final d f3311a;

        public C0042d(d dVar) {
            this.f3311a = dVar;
        }

        public void run() {
            d dVar = this.f3311a;
            dVar.getClass();
            e c10 = e.c();
            String str = d.f3296s;
            c10.a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.c();
            synchronized (dVar.f3304h) {
                boolean z10 = true;
                if (dVar.f3305i != null) {
                    e.c().a(str, String.format("Removing command %s", new Object[]{dVar.f3305i}), new Throwable[0]);
                    if (dVar.f3304h.remove(0).equals(dVar.f3305i)) {
                        dVar.f3305i = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                a aVar = dVar.f3302f;
                synchronized (aVar.f3280c) {
                    if (aVar.f3279b.isEmpty()) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    if (dVar.f3304h.isEmpty()) {
                        e.c().a(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = dVar.f3306r;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).b();
                        }
                    }
                }
                if (!dVar.f3304h.isEmpty()) {
                    dVar.e();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f3297a = applicationContext;
        this.f3302f = new a(applicationContext);
        h c10 = h.c(context);
        this.f3301e = c10;
        h2.c cVar = c10.f18833f;
        this.f3300d = cVar;
        this.f3298b = c10.f18831d;
        cVar.b(this);
        this.f3304h = new ArrayList();
        this.f3305i = null;
        this.f3303g = new Handler(Looper.getMainLooper());
    }

    public void a(String str, boolean z10) {
        Context context = this.f3297a;
        String str2 = a.f3277d;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        this.f3303g.post(new b(this, intent, 0));
    }

    public boolean b(Intent intent, int i10) {
        boolean z10;
        e c10 = e.c();
        String str = f3296s;
        boolean z11 = false;
        c10.a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i10)}), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            e.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f3304h) {
                Iterator<Intent> it = this.f3304h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(it.next().getAction())) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f3304h) {
            if (!this.f3304h.isEmpty()) {
                z11 = true;
            }
            this.f3304h.add(intent);
            if (!z11) {
                e();
            }
        }
        return true;
    }

    public final void c() {
        if (this.f3303g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void d() {
        e.c().a(f3296s, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        h2.c cVar = this.f3300d;
        synchronized (cVar.f18810i) {
            cVar.f18809h.remove(this);
        }
        e eVar = this.f3299c;
        if (!eVar.f3313a.isShutdown()) {
            eVar.f3313a.shutdownNow();
        }
        this.f3306r = null;
    }

    public final void e() {
        c();
        PowerManager.WakeLock a10 = k.a(this.f3297a, "ProcessCommand");
        try {
            a10.acquire();
            r2.a aVar = this.f3301e.f18831d;
            ((r2.b) aVar).f24500a.execute(new a());
        } finally {
            a10.release();
        }
    }
}
