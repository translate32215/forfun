package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.w;
import androidx.work.impl.background.systemalarm.d;
import g2.e;
import java.util.HashMap;
import java.util.WeakHashMap;
import p2.k;

public class SystemAlarmService extends w implements d.c {

    /* renamed from: d  reason: collision with root package name */
    public static final String f3274d = e.e("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    public d f3275b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3276c;

    public final void a() {
        d dVar = new d(this);
        this.f3275b = dVar;
        if (dVar.f3306r != null) {
            e.c().b(d.f3296s, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.f3306r = this;
        }
    }

    public void b() {
        this.f3276c = true;
        e.c().a(f3274d, "All commands completed in dispatcher", new Throwable[0]);
        String str = k.f23803a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = k.f23804b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                e.c().f(k.f23803a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        a();
        this.f3276c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3276c = true;
        this.f3275b.d();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f3276c) {
            e.c().d(f3274d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f3275b.d();
            a();
            this.f3276c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3275b.b(intent, i11);
        return 3;
    }
}
