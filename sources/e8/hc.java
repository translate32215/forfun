package e8;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.mz;
import com.google.android.gms.internal.ads.w7;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class hc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final w7 f14889a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14890b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14891c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14892d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14893e;

    public hc(w7 w7Var, int i10, int i11, boolean z10, boolean z11) {
        this.f14889a = w7Var;
        this.f14890b = i10;
        this.f14891c = i11;
        this.f14892d = z10;
        this.f14893e = z11;
    }

    public final void run() {
        mz mzVar;
        mz mzVar2;
        mz mzVar3;
        w7 w7Var = this.f14889a;
        int i10 = this.f14890b;
        int i11 = this.f14891c;
        boolean z10 = this.f14892d;
        boolean z11 = this.f14893e;
        synchronized (w7Var.f8419b) {
            boolean z12 = false;
            boolean z13 = i10 != i11;
            boolean z14 = w7Var.f8424g;
            boolean z15 = !z14 && i11 == 1;
            boolean z16 = z13 && i11 == 1;
            boolean z17 = z13 && i11 == 2;
            boolean z18 = z13 && i11 == 3;
            boolean z19 = z10 != z11;
            if (z14 || z15) {
                z12 = true;
            }
            w7Var.f8424g = z12;
            if (z15) {
                try {
                    mz mzVar4 = w7Var.f8423f;
                    if (mzVar4 != null) {
                        mzVar4.a2();
                    }
                } catch (RemoteException e10) {
                    e.F("#007 Could not call remote method.", e10);
                }
            }
            if (z16 && (mzVar3 = w7Var.f8423f) != null) {
                mzVar3.c0();
            }
            if (z17 && (mzVar2 = w7Var.f8423f) != null) {
                mzVar2.a0();
            }
            if (z18) {
                mz mzVar5 = w7Var.f8423f;
                if (mzVar5 != null) {
                    mzVar5.y0();
                }
                w7Var.f8418a.Y();
            }
            if (z19 && (mzVar = w7Var.f8423f) != null) {
                mzVar.X0(z11);
            }
        }
    }
}
