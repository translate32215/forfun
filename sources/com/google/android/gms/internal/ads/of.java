package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.b;
import e8.w30;
import e8.y30;
import java.util.concurrent.LinkedBlockingQueue;
import s7.a;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class of implements b.a, b.C0083b {

    /* renamed from: a  reason: collision with root package name */
    public bg f7686a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7687b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7688c;

    /* renamed from: d  reason: collision with root package name */
    public final js f7689d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedBlockingQueue<y30> f7690e;

    /* renamed from: f  reason: collision with root package name */
    public final HandlerThread f7691f;

    /* renamed from: g  reason: collision with root package name */
    public final mf f7692g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7693h = System.currentTimeMillis();

    public of(Context context, js jsVar, String str, String str2, mf mfVar) {
        this.f7687b = str;
        this.f7689d = jsVar;
        this.f7688c = str2;
        this.f7692g = mfVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f7691f = handlerThread;
        handlerThread.start();
        this.f7686a = new bg(context, handlerThread.getLooper(), this, this, 19621000);
        this.f7690e = new LinkedBlockingQueue<>();
        this.f7686a.n();
    }

    public static y30 b() {
        return new y30(1, (byte[]) null, 1);
    }

    public final void Y(int i10) {
        try {
            c(4011, this.f7693h, (Exception) null);
            this.f7690e.put(b());
        } catch (InterruptedException unused) {
        }
    }

    public final void a() {
        bg bgVar = this.f7686a;
        if (bgVar == null) {
            return;
        }
        if (bgVar.b() || this.f7686a.h()) {
            this.f7686a.p();
        }
    }

    public final void c(int i10, long j10, Exception exc) {
        mf mfVar = this.f7692g;
        if (mfVar != null) {
            mfVar.a(i10, System.currentTimeMillis() - j10, exc);
        }
    }

    public final void m(a aVar) {
        try {
            c(4012, this.f7693h, (Exception) null);
            this.f7690e.put(b());
        } catch (InterruptedException unused) {
        }
    }

    public final void z0(Bundle bundle) {
        dg dgVar;
        try {
            dgVar = this.f7686a.E();
        } catch (DeadObjectException | IllegalStateException unused) {
            dgVar = null;
        }
        if (dgVar != null) {
            try {
                y30 G4 = dgVar.G4(new w30(1, this.f7689d, this.f7687b, this.f7688c));
                c(5011, this.f7693h, (Exception) null);
                this.f7690e.put(G4);
            } catch (Throwable th) {
                c(2010, this.f7693h, new Exception(th));
            } finally {
                a();
                this.f7691f.quit();
            }
        }
    }
}
