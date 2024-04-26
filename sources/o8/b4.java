package o8;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.k;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import e8.zq;
import f7.f0;
import f7.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class b4 extends c {

    /* renamed from: a  reason: collision with root package name */
    public final u5 f23124a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f23125b;

    /* renamed from: c  reason: collision with root package name */
    public String f23126c;

    public b4(u5 u5Var) {
        if (u5Var != null) {
            this.f23124a = u5Var;
            this.f23126c = null;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void A5(Bundle bundle, b6 b6Var) {
        E1(b6Var);
        String str = b6Var.f23131a;
        i.h(str);
        z0(new f0(this, str, bundle));
    }

    public final String D0(b6 b6Var) {
        E1(b6Var);
        u5 u5Var = this.f23124a;
        try {
            return (String) ((FutureTask) u5Var.b().p(new t5(u5Var, b6Var))).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            u5Var.d().f8797f.c("Failed to get app instance id. appId", h.t(b6Var.f23131a), e10);
            return null;
        }
    }

    public final void D3(b6 b6Var) {
        i.e(b6Var.f23131a);
        i.h(b6Var.D);
        j0 j0Var = new j0(this, b6Var);
        if (this.f23124a.b().t()) {
            j0Var.run();
        } else {
            this.f23124a.b().s(j0Var);
        }
    }

    public final void E1(b6 b6Var) {
        if (b6Var != null) {
            i.e(b6Var.f23131a);
            Y(b6Var.f23131a, false);
            this.f23124a.Q().J(b6Var.f23132b, b6Var.f23147y, b6Var.C);
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final List<b> E3(String str, String str2, String str3) {
        Y(str, true);
        try {
            return (List) ((FutureTask) this.f23124a.b().p(new y3(this, str, str2, str3, 1))).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f23124a.d().f8797f.b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    public final void H3(w5 w5Var, b6 b6Var) {
        if (w5Var != null) {
            E1(b6Var);
            z0(new f0(this, w5Var, b6Var));
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void N0(b bVar, b6 b6Var) {
        if (bVar != null) {
            i.h(bVar.f23111c);
            E1(b6Var);
            b bVar2 = new b(bVar);
            bVar2.f23109a = b6Var.f23131a;
            z0(new f0(this, bVar2, b6Var));
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final List<w5> R0(String str, String str2, boolean z10, b6 b6Var) {
        E1(b6Var);
        String str3 = b6Var.f23131a;
        i.h(str3);
        try {
            List<y5> list = (List) ((FutureTask) this.f23124a.b().p(new w3(this, str3, str, str2, 0))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (y5 y5Var : list) {
                if (z10 || !r.U(y5Var.f23624c)) {
                    arrayList.add(new w5(y5Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f23124a.d().f8797f.c("Failed to query user properties. appId", h.t(b6Var.f23131a), e10);
            return Collections.emptyList();
        }
    }

    public final List<w5> S1(String str, String str2, String str3, boolean z10) {
        Y(str, true);
        try {
            List<y5> list = (List) ((FutureTask) this.f23124a.b().p(new y3(this, str, str2, str3, 0))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (y5 y5Var : list) {
                if (z10 || !r.U(y5Var.f23624c)) {
                    arrayList.add(new w5(y5Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f23124a.d().f8797f.c("Failed to get user properties as. appId", h.t(str), e10);
            return Collections.emptyList();
        }
    }

    public final void T2(r rVar, b6 b6Var) {
        if (rVar != null) {
            E1(b6Var);
            z0(new f0(this, rVar, b6Var));
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void T3(b6 b6Var) {
        E1(b6Var);
        z0(new z3(this, b6Var, 0));
    }

    public final void Y(String str, boolean z10) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f23125b == null) {
                        if (!"com.google.android.gms".equals(this.f23126c) && !z7.i.a(this.f23124a.f23481l.f8837a, Binder.getCallingUid())) {
                            if (!b.a(this.f23124a.f23481l.f8837a).b(Binder.getCallingUid())) {
                                z11 = false;
                                this.f23125b = Boolean.valueOf(z11);
                            }
                        }
                        z11 = true;
                        this.f23125b = Boolean.valueOf(z11);
                    }
                    if (this.f23125b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f23124a.d().f8797f.b("Measurement Service called with invalid calling package. appId", h.t(str));
                    throw e10;
                }
            }
            if (this.f23126c == null) {
                Context context = this.f23124a.f23481l.f8837a;
                int callingUid = Binder.getCallingUid();
                AtomicBoolean atomicBoolean = s7.i.f25015a;
                if (z7.i.b(context, callingUid, str)) {
                    this.f23126c = str;
                }
            }
            if (!str.equals(this.f23126c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f23124a.d().f8797f.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void Y0(long j10, String str, String str2, String str3) {
        z0(new zq(this, str2, str3, str, j10));
    }

    public final void e4(b6 b6Var) {
        E1(b6Var);
        z0(new z3(this, b6Var, 1));
    }

    public final byte[] h5(r rVar, String str) {
        i.e(str);
        if (rVar != null) {
            Y(str, true);
            this.f23124a.d().f8804m.b("Log and bundle. event", this.f23124a.f23481l.f8849m.d(rVar.f23414a));
            long c10 = this.f23124a.e().c() / 1000000;
            k b10 = this.f23124a.b();
            m mVar = new m(this, rVar, str);
            b10.k();
            t3 t3Var = new t3(b10, mVar, true);
            if (Thread.currentThread() == b10.f8829c) {
                t3Var.run();
            } else {
                b10.u(t3Var);
            }
            try {
                byte[] bArr = (byte[]) t3Var.get();
                if (bArr == null) {
                    this.f23124a.d().f8797f.b("Log and bundle returned null. appId", h.t(str));
                    bArr = new byte[0];
                }
                this.f23124a.d().f8804m.d("Log and bundle processed. event, size, time_ms", this.f23124a.f23481l.f8849m.d(rVar.f23414a), Integer.valueOf(bArr.length), Long.valueOf((this.f23124a.e().c() / 1000000) - c10));
                return bArr;
            } catch (InterruptedException | ExecutionException e10) {
                this.f23124a.d().f8797f.d("Failed to log and bundle. appId, event, error", h.t(str), this.f23124a.f23481l.f8849m.d(rVar.f23414a), e10);
                return null;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final List<b> k5(String str, String str2, b6 b6Var) {
        E1(b6Var);
        String str3 = b6Var.f23131a;
        i.h(str3);
        try {
            return (List) ((FutureTask) this.f23124a.b().p(new w3(this, str3, str, str2, 1))).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f23124a.d().f8797f.b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    public final void w1(b6 b6Var) {
        i.e(b6Var.f23131a);
        Y(b6Var.f23131a, false);
        z0(new e7.i(this, b6Var));
    }

    public final void z0(Runnable runnable) {
        if (this.f23124a.b().t()) {
            runnable.run();
        } else {
            this.f23124a.b().r(runnable);
        }
    }
}
