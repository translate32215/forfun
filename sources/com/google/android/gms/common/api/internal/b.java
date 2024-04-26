package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.j;
import com.startapp.b4;
import g8.e;
import g8.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import s.c;
import s7.d;
import u7.a;
import u7.b0;
import u7.i;
import u7.p;
import u7.u;
import u7.v;
import u7.w;
import v7.g;
import v7.h;
import v7.o;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class b implements Handler.Callback {
    @GuardedBy("lock")
    public static b A;

    /* renamed from: x  reason: collision with root package name */
    public static final Status f5754x = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: y  reason: collision with root package name */
    public static final Status f5755y = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: z  reason: collision with root package name */
    public static final Object f5756z = new Object();

    /* renamed from: a  reason: collision with root package name */
    public long f5757a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5758b = false;

    /* renamed from: c  reason: collision with root package name */
    public j f5759c;

    /* renamed from: d  reason: collision with root package name */
    public h f5760d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f5761e;

    /* renamed from: f  reason: collision with root package name */
    public final d f5762f;

    /* renamed from: g  reason: collision with root package name */
    public final o f5763g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f5764h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f5765i;

    /* renamed from: r  reason: collision with root package name */
    public final Map<a<?>, e<?>> f5766r;
    @GuardedBy("lock")

    /* renamed from: s  reason: collision with root package name */
    public i f5767s;
    @GuardedBy("lock")

    /* renamed from: t  reason: collision with root package name */
    public final Set<a<?>> f5768t;

    /* renamed from: u  reason: collision with root package name */
    public final Set<a<?>> f5769u;
    @NotOnlyInitialized

    /* renamed from: v  reason: collision with root package name */
    public final Handler f5770v;

    /* renamed from: w  reason: collision with root package name */
    public volatile boolean f5771w;

    public b(Context context, Looper looper, d dVar) {
        boolean z10 = true;
        this.f5764h = new AtomicInteger(1);
        this.f5765i = new AtomicInteger(0);
        this.f5766r = new ConcurrentHashMap(5, 0.75f, 1);
        this.f5767s = null;
        this.f5768t = new c(0);
        this.f5769u = new c(0);
        this.f5771w = true;
        this.f5761e = context;
        f fVar = new f(looper, this);
        this.f5770v = fVar;
        this.f5762f = dVar;
        this.f5763g = new o(dVar);
        PackageManager packageManager = context.getPackageManager();
        if (z7.f.f28731e == null) {
            z7.f.f28731e = Boolean.valueOf((!z7.h.d() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z10);
        }
        if (z7.f.f28731e.booleanValue()) {
            this.f5771w = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    public static Status c(a<?> aVar, s7.a aVar2) {
        String str = aVar.f26091b.f25821b;
        String valueOf = String.valueOf(aVar2);
        return new Status(1, 17, androidx.fragment.app.c.a(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), aVar2.f25001c, aVar2);
    }

    public static b f(Context context) {
        b bVar;
        synchronized (f5756z) {
            try {
                if (A == null) {
                    Looper looper = v7.b.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = d.f25010c;
                    A = new b(applicationContext, looper, d.f25011d);
                }
                bVar = A;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final boolean a() {
        if (this.f5758b) {
            return false;
        }
        g gVar = v7.f.a().f26576a;
        if (gVar != null && !gVar.f26578b) {
            return false;
        }
        int i10 = this.f5763g.f26590a.get(203400000, -1);
        if (i10 == -1 || i10 == 0) {
            return true;
        }
        return false;
    }

    public final boolean b(s7.a aVar, int i10) {
        PendingIntent pendingIntent;
        d dVar = this.f5762f;
        Context context = this.f5761e;
        dVar.getClass();
        if (b8.a.e(context)) {
            return false;
        }
        if (aVar.i()) {
            pendingIntent = aVar.f25001c;
        } else {
            pendingIntent = dVar.c(context, aVar.f25000b, 0, (String) null);
        }
        if (pendingIntent == null) {
            return false;
        }
        int i11 = aVar.f25000b;
        int i12 = GoogleApiActivity.f5736b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", true);
        dVar.i(context, i11, (String) null, PendingIntent.getActivity(context, 0, intent, e.f18598a | 134217728));
        return true;
    }

    public final e<?> d(t7.c<?> cVar) {
        a<O> aVar = cVar.f25827e;
        e<?> eVar = this.f5766r.get(aVar);
        if (eVar == null) {
            eVar = new e<>(this, cVar);
            this.f5766r.put(aVar, eVar);
        }
        if (eVar.t()) {
            this.f5769u.add(aVar);
        }
        eVar.p();
        return eVar;
    }

    public final void e() {
        j jVar = this.f5759c;
        if (jVar != null) {
            if (jVar.f5871a > 0 || a()) {
                if (this.f5760d == null) {
                    this.f5760d = new x7.c(this.f5761e, v7.i.f26583b);
                }
                ((x7.c) this.f5760d).b(jVar);
            }
            this.f5759c = null;
        }
    }

    public final void g(s7.a aVar, int i10) {
        if (!b(aVar, i10)) {
            Handler handler = this.f5770v;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, aVar));
        }
    }

    public final boolean handleMessage(Message message) {
        e eVar;
        Status status;
        s7.c[] g10;
        int i10 = message.what;
        long j10 = 300000;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f5757a = j10;
                this.f5770v.removeMessages(12);
                for (a<?> obtainMessage : this.f5766r.keySet()) {
                    Handler handler = this.f5770v;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f5757a);
                }
                break;
            case 2:
                ((b0) message.obj).getClass();
                throw null;
            case 3:
                for (e next : this.f5766r.values()) {
                    next.o();
                    next.p();
                }
                break;
            case 4:
            case b4.f10106f /*8*/:
            case 13:
                w wVar = (w) message.obj;
                e<?> eVar2 = this.f5766r.get(wVar.f26139c.f25827e);
                if (eVar2 == null) {
                    eVar2 = d(wVar.f26139c);
                }
                if (eVar2.t() && this.f5765i.get() != wVar.f26138b) {
                    wVar.f26137a.a(f5754x);
                    eVar2.s();
                    break;
                } else {
                    eVar2.q(wVar.f26137a);
                    break;
                }
            case 5:
                int i11 = message.arg1;
                s7.a aVar = (s7.a) message.obj;
                Iterator<e<?>> it = this.f5766r.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        eVar = it.next();
                        if (eVar.f5785g == i11) {
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar != null) {
                    if (aVar.f25000b != 13) {
                        Status c10 = c(eVar.f5781c, aVar);
                        com.google.android.gms.common.internal.i.c(eVar.f5791u.f5770v);
                        eVar.d(c10, (Exception) null, false);
                        break;
                    } else {
                        d dVar = this.f5762f;
                        int i12 = aVar.f25000b;
                        dVar.getClass();
                        AtomicBoolean atomicBoolean = s7.i.f25015a;
                        String q10 = s7.a.q(i12);
                        String str = aVar.f25002d;
                        Status status2 = new Status(17, androidx.fragment.app.c.a(new StringBuilder(String.valueOf(q10).length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", q10, ": ", str));
                        com.google.android.gms.common.internal.i.c(eVar.f5791u.f5770v);
                        eVar.d(status2, (Exception) null, false);
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i11);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f5761e.getApplicationContext() instanceof Application) {
                    a.a((Application) this.f5761e.getApplicationContext());
                    a aVar2 = a.f5749e;
                    d dVar2 = new d(this);
                    aVar2.getClass();
                    synchronized (aVar2) {
                        aVar2.f5752c.add(dVar2);
                    }
                    if (!aVar2.f5751b.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!aVar2.f5751b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            aVar2.f5750a.set(true);
                        }
                    }
                    if (!aVar2.f5750a.get()) {
                        this.f5757a = 300000;
                        break;
                    }
                }
                break;
            case 7:
                d((t7.c) message.obj);
                break;
            case 9:
                if (this.f5766r.containsKey(message.obj)) {
                    e eVar3 = this.f5766r.get(message.obj);
                    com.google.android.gms.common.internal.i.c(eVar3.f5791u.f5770v);
                    if (eVar3.f5787i) {
                        eVar3.p();
                        break;
                    }
                }
                break;
            case 10:
                for (a<?> remove : this.f5769u) {
                    e remove2 = this.f5766r.remove(remove);
                    if (remove2 != null) {
                        remove2.s();
                    }
                }
                this.f5769u.clear();
                break;
            case 11:
                if (this.f5766r.containsKey(message.obj)) {
                    e eVar4 = this.f5766r.get(message.obj);
                    com.google.android.gms.common.internal.i.c(eVar4.f5791u.f5770v);
                    if (eVar4.f5787i) {
                        eVar4.j();
                        b bVar = eVar4.f5791u;
                        if (bVar.f5762f.e(bVar.f5761e) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        com.google.android.gms.common.internal.i.c(eVar4.f5791u.f5770v);
                        eVar4.d(status, (Exception) null, false);
                        eVar4.f5780b.e("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.f5766r.containsKey(message.obj)) {
                    this.f5766r.get(message.obj).n(true);
                    break;
                }
                break;
            case 14:
                ((u7.j) message.obj).getClass();
                if (!this.f5766r.containsKey((Object) null)) {
                    throw null;
                }
                this.f5766r.get((Object) null).n(false);
                throw null;
            case 15:
                p pVar = (p) message.obj;
                if (this.f5766r.containsKey(pVar.f26121a)) {
                    e eVar5 = this.f5766r.get(pVar.f26121a);
                    if (eVar5.f5788r.contains(pVar) && !eVar5.f5787i) {
                        if (eVar5.f5780b.b()) {
                            eVar5.e();
                            break;
                        } else {
                            eVar5.p();
                            break;
                        }
                    }
                }
                break;
            case 16:
                p pVar2 = (p) message.obj;
                if (this.f5766r.containsKey(pVar2.f26121a)) {
                    e eVar6 = this.f5766r.get(pVar2.f26121a);
                    if (eVar6.f5788r.remove(pVar2)) {
                        eVar6.f5791u.f5770v.removeMessages(15, pVar2);
                        eVar6.f5791u.f5770v.removeMessages(16, pVar2);
                        s7.c cVar = pVar2.f26122b;
                        ArrayList arrayList = new ArrayList(eVar6.f5779a.size());
                        for (j jVar : eVar6.f5779a) {
                            if ((jVar instanceof u) && (g10 = ((u) jVar).g(eVar6)) != null && e.e.d(g10, cVar)) {
                                arrayList.add(jVar);
                            }
                        }
                        int size = arrayList.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            j jVar2 = (j) arrayList.get(i13);
                            eVar6.f5779a.remove(jVar2);
                            jVar2.b(new t7.j(cVar));
                        }
                        break;
                    }
                }
                break;
            case 17:
                e();
                break;
            case 18:
                v vVar = (v) message.obj;
                if (vVar.f26135c != 0) {
                    j jVar3 = this.f5759c;
                    if (jVar3 != null) {
                        List<v7.e> list = jVar3.f5872b;
                        if (jVar3.f5871a != vVar.f26134b || (list != null && list.size() >= vVar.f26136d)) {
                            this.f5770v.removeMessages(17);
                            e();
                        } else {
                            j jVar4 = this.f5759c;
                            v7.e eVar7 = vVar.f26133a;
                            if (jVar4.f5872b == null) {
                                jVar4.f5872b = new ArrayList();
                            }
                            jVar4.f5872b.add(eVar7);
                        }
                    }
                    if (this.f5759c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(vVar.f26133a);
                        this.f5759c = new j(vVar.f26134b, arrayList2);
                        Handler handler2 = this.f5770v;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), vVar.f26135c);
                        break;
                    }
                } else {
                    j jVar5 = new j(vVar.f26134b, Arrays.asList(new v7.e[]{vVar.f26133a}));
                    if (this.f5760d == null) {
                        this.f5760d = new x7.c(this.f5761e, v7.i.f26583b);
                    }
                    ((x7.c) this.f5760d).b(jVar5);
                    break;
                }
                break;
            case 19:
                this.f5758b = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i10);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }
}
