package e8;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.bg;
import com.google.android.gms.internal.ads.zf;
import s7.a;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class k30 implements b.a, b.C0083b {

    /* renamed from: a  reason: collision with root package name */
    public final bg f15230a;

    /* renamed from: b  reason: collision with root package name */
    public final zf f15231b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15232c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f15233d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15234e = false;

    public k30(Context context, Looper looper, zf zfVar) {
        this.f15231b = zfVar;
        this.f15230a = new bg(context, looper, this, this, 12800000);
    }

    public final void Y(int i10) {
    }

    public final void a() {
        synchronized (this.f15232c) {
            if (this.f15230a.b() || this.f15230a.h()) {
                this.f15230a.p();
            }
            Binder.flushPendingCommands();
        }
    }

    public final void m(a aVar) {
    }

    public final void z0(Bundle bundle) {
        synchronized (this.f15232c) {
            if (!this.f15234e) {
                this.f15234e = true;
                try {
                    this.f15230a.E().Z4(new o30(this.f15231b.f()));
                    a();
                } catch (Exception unused) {
                    a();
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            }
        }
    }
}
