package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import t2.j;
import u7.n;
import u7.o;
import v7.c0;
import v7.w;
import v7.x;
import v7.y;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class b<T extends IInterface> {
    public static final s7.c[] F = new s7.c[0];
    public volatile String A;
    public s7.a B;
    public boolean C;
    public volatile y D;
    public AtomicInteger E;

    /* renamed from: a  reason: collision with root package name */
    public volatile String f5822a;

    /* renamed from: b  reason: collision with root package name */
    public j f5823b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f5824c;

    /* renamed from: d  reason: collision with root package name */
    public final v7.b f5825d;

    /* renamed from: e  reason: collision with root package name */
    public final s7.e f5826e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f5827f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f5828g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f5829h;
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: i  reason: collision with root package name */
    public g f5830i;

    /* renamed from: r  reason: collision with root package name */
    public c f5831r;
    @GuardedBy("mLock")

    /* renamed from: s  reason: collision with root package name */
    public IInterface f5832s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f5833t;
    @GuardedBy("mLock")

    /* renamed from: u  reason: collision with root package name */
    public u f5834u;
    @GuardedBy("mLock")

    /* renamed from: v  reason: collision with root package name */
    public int f5835v;

    /* renamed from: w  reason: collision with root package name */
    public final a f5836w;

    /* renamed from: x  reason: collision with root package name */
    public final C0083b f5837x;

    /* renamed from: y  reason: collision with root package name */
    public final int f5838y;

    /* renamed from: z  reason: collision with root package name */
    public final String f5839z;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface a {
        void Y(int i10);

        void z0(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.b$b  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C0083b {
        void m(s7.a aVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface c {
        void a(s7.a aVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public class d implements c {
        public d() {
        }

        public final void a(s7.a aVar) {
            if (aVar.j()) {
                b bVar = b.this;
                bVar.d((f) null, bVar.u());
                return;
            }
            C0083b bVar2 = b.this.f5837x;
            if (bVar2 != null) {
                bVar2.m(aVar);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface e {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.b.a r13, com.google.android.gms.common.internal.b.C0083b r14, java.lang.String r15) {
        /*
            r9 = this;
            v7.b r3 = v7.b.a(r10)
            s7.e r4 = s7.e.f25013b
            java.lang.String r15 = "null reference"
            if (r13 == 0) goto L_0x001d
            if (r14 == 0) goto L_0x0017
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0017:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r15)
            throw r10
        L_0x001d:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r15)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.b.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.b$a, com.google.android.gms.common.internal.b$b, java.lang.String):void");
    }

    public static /* bridge */ /* synthetic */ void A(b bVar, int i10) {
        int i11;
        int i12;
        synchronized (bVar.f5828g) {
            i11 = bVar.f5835v;
        }
        if (i11 == 3) {
            bVar.C = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = bVar.f5827f;
        handler.sendMessage(handler.obtainMessage(i12, bVar.E.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean B(b bVar, int i10, int i11, IInterface iInterface) {
        synchronized (bVar.f5828g) {
            if (bVar.f5835v != i10) {
                return false;
            }
            bVar.D(i11, iInterface);
            return true;
        }
    }

    public static /* bridge */ /* synthetic */ boolean C(b bVar) {
        if (bVar.C || TextUtils.isEmpty(bVar.w()) || TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        try {
            Class.forName(bVar.w());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void D(int i10, IInterface iInterface) {
        j jVar;
        boolean z10 = false;
        if ((i10 == 4) == (iInterface != null)) {
            z10 = true;
        }
        i.a(z10);
        synchronized (this.f5828g) {
            try {
                this.f5835v = i10;
                this.f5832s = iInterface;
                if (i10 == 1) {
                    u uVar = this.f5834u;
                    if (uVar != null) {
                        v7.b bVar = this.f5825d;
                        String str = this.f5823b.f25486a;
                        i.h(str);
                        this.f5823b.getClass();
                        bVar.c(str, "com.google.android.gms", 4225, uVar, z(), this.f5823b.f25487b);
                        this.f5834u = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    u uVar2 = this.f5834u;
                    if (!(uVar2 == null || (jVar = this.f5823b) == null)) {
                        String str2 = jVar.f25486a;
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + str2 + " on " + "com.google.android.gms");
                        v7.b bVar2 = this.f5825d;
                        String str3 = this.f5823b.f25486a;
                        i.h(str3);
                        this.f5823b.getClass();
                        bVar2.c(str3, "com.google.android.gms", 4225, uVar2, z(), this.f5823b.f25487b);
                        this.E.incrementAndGet();
                    }
                    u uVar3 = new u(this, this.E.get());
                    this.f5834u = uVar3;
                    String x10 = x();
                    Object obj = v7.b.f26549a;
                    boolean y10 = y();
                    this.f5823b = new j("com.google.android.gms", x10, 4225, y10);
                    if (y10) {
                        if (g() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f5823b.f25486a)));
                        }
                    }
                    v7.b bVar3 = this.f5825d;
                    String str4 = this.f5823b.f25486a;
                    i.h(str4);
                    this.f5823b.getClass();
                    if (!bVar3.d(new c0(str4, "com.google.android.gms", 4225, this.f5823b.f25487b), uVar3, z(), s())) {
                        String str5 = this.f5823b.f25486a;
                        Log.w("GmsClient", "unable to connect to service: " + str5 + " on " + "com.google.android.gms");
                        int i11 = this.E.get();
                        Handler handler = this.f5827f;
                        handler.sendMessage(handler.obtainMessage(7, i11, -1, new w(this, 16)));
                    }
                } else if (i10 == 4) {
                    if (iInterface != null) {
                        System.currentTimeMillis();
                    } else {
                        throw new NullPointerException("null reference");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(e eVar) {
        o oVar = (o) eVar;
        oVar.f26120a.f5791u.f5770v.post(new n(oVar));
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f5828g) {
            z10 = this.f5835v == 4;
        }
        return z10;
    }

    public void d(f fVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle t10 = t();
        int i10 = this.f5838y;
        String str = this.A;
        int i11 = s7.e.f25012a;
        Scope[] scopeArr = d.f5853w;
        Bundle bundle = new Bundle();
        s7.c[] cVarArr = d.f5854x;
        d dVar = r3;
        d dVar2 = new d(6, i10, i11, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, cVarArr, cVarArr, true, 0, false, str);
        d dVar3 = dVar;
        dVar3.f5858d = this.f5824c.getPackageName();
        dVar3.f5861g = t10;
        if (set2 != null) {
            dVar3.f5860f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (m()) {
            Account q10 = q();
            if (q10 == null) {
                q10 = new Account("<<default account>>", "com.google");
            }
            dVar3.f5862h = q10;
            if (fVar != null) {
                dVar3.f5859e = fVar.asBinder();
            }
        }
        dVar3.f5863i = F;
        dVar3.f5864r = r();
        try {
            synchronized (this.f5829h) {
                g gVar = this.f5830i;
                if (gVar != null) {
                    gVar.z1(new x(this, this.E.get()), dVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            Handler handler = this.f5827f;
            handler.sendMessage(handler.obtainMessage(6, this.E.get(), 3));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RemoteException | RuntimeException e12) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e12);
            int i12 = this.E.get();
            Handler handler2 = this.f5827f;
            handler2.sendMessage(handler2.obtainMessage(1, i12, -1, new v(this, 8, (IBinder) null, (Bundle) null)));
        }
    }

    public void e(String str) {
        this.f5822a = str;
        p();
    }

    public boolean f() {
        return true;
    }

    public int g() {
        return s7.e.f25012a;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f5828g) {
            int i10 = this.f5835v;
            z10 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public final s7.c[] i() {
        y yVar = this.D;
        if (yVar == null) {
            return null;
        }
        return yVar.f26606b;
    }

    public String j() {
        if (b() && this.f5823b != null) {
            return "com.google.android.gms";
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public String k() {
        return this.f5822a;
    }

    public void l(c cVar) {
        this.f5831r = cVar;
        D(2, (IInterface) null);
    }

    public boolean m() {
        return false;
    }

    public void n() {
        int d10 = this.f5826e.d(this.f5824c, g());
        if (d10 != 0) {
            D(1, (IInterface) null);
            d dVar = new d();
            i.i(dVar, "Connection progress callbacks cannot be null.");
            this.f5831r = dVar;
            Handler handler = this.f5827f;
            handler.sendMessage(handler.obtainMessage(3, this.E.get(), d10, (Object) null));
            return;
        }
        l(new d());
    }

    public abstract T o(IBinder iBinder);

    public void p() {
        this.E.incrementAndGet();
        synchronized (this.f5833t) {
            int size = this.f5833t.size();
            for (int i10 = 0; i10 < size; i10++) {
                w wVar = (w) this.f5833t.get(i10);
                synchronized (wVar) {
                    wVar.f26600a = null;
                }
            }
            this.f5833t.clear();
        }
        synchronized (this.f5829h) {
            this.f5830i = null;
        }
        D(1, (IInterface) null);
    }

    public Account q() {
        return null;
    }

    public s7.c[] r() {
        return F;
    }

    public Executor s() {
        return null;
    }

    public Bundle t() {
        return new Bundle();
    }

    public Set<Scope> u() {
        return Collections.emptySet();
    }

    public final T v() throws DeadObjectException {
        T t10;
        synchronized (this.f5828g) {
            try {
                if (this.f5835v == 5) {
                    throw new DeadObjectException();
                } else if (b()) {
                    t10 = this.f5832s;
                    i.i(t10, "Client is connected but service is null");
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }

    public abstract String w();

    public abstract String x();

    public boolean y() {
        return g() >= 211700000;
    }

    public final String z() {
        String str = this.f5839z;
        return str == null ? this.f5824c.getClass().getName() : str;
    }

    public b(Context context, Looper looper, v7.b bVar, s7.e eVar, int i10, a aVar, C0083b bVar2, String str) {
        this.f5822a = null;
        this.f5828g = new Object();
        this.f5829h = new Object();
        this.f5833t = new ArrayList();
        this.f5835v = 1;
        this.B = null;
        this.C = false;
        this.D = null;
        this.E = new AtomicInteger(0);
        i.i(context, "Context must not be null");
        this.f5824c = context;
        i.i(looper, "Looper must not be null");
        i.i(bVar, "Supervisor must not be null");
        this.f5825d = bVar;
        i.i(eVar, "API availability must not be null");
        this.f5826e = eVar;
        this.f5827f = new t(this, looper);
        this.f5838y = i10;
        this.f5836w = aVar;
        this.f5837x = bVar2;
        this.f5839z = str;
    }
}
