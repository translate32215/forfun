package z9;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import u.b;
import z9.k;
import z9.l;

public final class i extends k<g> implements c {

    /* renamed from: k  reason: collision with root package name */
    public final String f28748k;

    /* renamed from: l  reason: collision with root package name */
    public final String f28749l;

    /* renamed from: m  reason: collision with root package name */
    public final String f28750m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f28751n;

    public i(Context context, String str, String str2, String str3, l.a aVar, l.b bVar) {
        super(context, aVar, bVar);
        if (str != null) {
            this.f28748k = str;
            b.c(str2, "callingPackage cannot be null or empty");
            this.f28749l = str2;
            b.c(str3, "callingAppVersion cannot be null or empty");
            this.f28750m = str3;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final IBinder a() {
        if (!e()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else if (!this.f28751n) {
            try {
                if (e()) {
                    return ((g) this.f28754c).a();
                }
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            } catch (RemoteException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            throw new IllegalStateException("Connection client has been released");
        }
    }

    public final void d() {
        if (!this.f28751n) {
            a(true);
        }
        g();
        this.f28761j = false;
        synchronized (this.f28759h) {
            int size = this.f28759h.size();
            for (int i10 = 0; i10 < size; i10++) {
                k.c cVar = this.f28759h.get(i10);
                synchronized (cVar) {
                    cVar.f28764a = null;
                }
            }
            this.f28759h.clear();
        }
        c();
    }

    public final void a(boolean z10) {
        if (e()) {
            try {
                if (e()) {
                    ((g) this.f28754c).a(z10);
                    this.f28751n = true;
                    return;
                }
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            } catch (RemoteException unused) {
            }
        }
    }
}
