package e8;

import android.os.RemoteException;
import b2.t;
import c8.b;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.a6;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.m5;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.t5;
import com.google.android.gms.internal.ads.y5;
import k7.c;
import l0.e;
import l7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class v7 extends os implements t5 {

    /* renamed from: a  reason: collision with root package name */
    public c f17028a;

    public v7(c cVar) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        this.f17028a = cVar;
    }

    public final void F2(int i10) {
        c cVar = this.f17028a;
        if (cVar != null) {
            t tVar = (t) cVar;
            a zza = ((AbstractAdViewAdapter) tVar.f3445b).zzmk;
            AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) tVar.f3445b;
            g2 g2Var = (g2) zza;
            g2Var.getClass();
            i.d("#008 Must be called on the main UI thread.");
            e.E("Adapter called onAdFailedToLoad.");
            try {
                ((y5) g2Var.f6511b).j5(new b(abstractAdViewAdapter), i10);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void N4(m5 m5Var) {
        c cVar = this.f17028a;
        if (cVar != null) {
            int i10 = 0;
            t7 t7Var = new t7(m5Var, 0);
            t tVar = (t) cVar;
            a zza = ((AbstractAdViewAdapter) tVar.f3445b).zzmk;
            AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) tVar.f3445b;
            g2 g2Var = (g2) zza;
            g2Var.getClass();
            i.d("#008 Must be called on the main UI thread.");
            e.E("Adapter called onRewarded.");
            try {
                y5 y5Var = (y5) g2Var.f6511b;
                b bVar = new b(abstractAdViewAdapter);
                m5 m5Var2 = t7Var.f16709a;
                String str = null;
                if (m5Var2 != null) {
                    try {
                        str = m5Var2.o();
                    } catch (RemoteException e10) {
                        e.D("Could not forward getType to RewardItem", e10);
                    }
                }
                m5 m5Var3 = t7Var.f16709a;
                if (m5Var3 != null) {
                    try {
                        i10 = m5Var3.q0();
                    } catch (RemoteException e11) {
                        e.D("Could not forward getAmount to RewardItem", e11);
                    }
                }
                y5Var.F5(bVar, new a6(str, i10));
            } catch (RemoteException e12) {
                e.F("#007 Could not call remote method.", e12);
            }
        }
    }

    public final void S3() {
        c cVar = this.f17028a;
        if (cVar != null) {
            t tVar = (t) cVar;
            a zza = ((AbstractAdViewAdapter) tVar.f3445b).zzmk;
            AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) tVar.f3445b;
            g2 g2Var = (g2) zza;
            g2Var.getClass();
            i.d("#008 Must be called on the main UI thread.");
            e.E("Adapter called onAdLeftApplication.");
            try {
                ((y5) g2Var.f6511b).f6(new b(abstractAdViewAdapter));
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void V3() {
        c cVar = this.f17028a;
        if (cVar != null) {
            t tVar = (t) cVar;
            a zza = ((AbstractAdViewAdapter) tVar.f3445b).zzmk;
            AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) tVar.f3445b;
            g2 g2Var = (g2) zza;
            g2Var.getClass();
            i.d("#008 Must be called on the main UI thread.");
            e.E("Adapter called onAdOpened.");
            try {
                ((y5) g2Var.f6511b).E0(new b(abstractAdViewAdapter));
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void d0() {
        c cVar = this.f17028a;
        if (cVar != null) {
            t tVar = (t) cVar;
            a zza = ((AbstractAdViewAdapter) tVar.f3445b).zzmk;
            AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) tVar.f3445b;
            g2 g2Var = (g2) zza;
            g2Var.getClass();
            i.d("#008 Must be called on the main UI thread.");
            e.E("Adapter called onVideoStarted.");
            try {
                ((y5) g2Var.f6511b).g2(new b(abstractAdViewAdapter));
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void e5() {
        c cVar = this.f17028a;
        if (cVar != null) {
            t tVar = (t) cVar;
            a zza = ((AbstractAdViewAdapter) tVar.f3445b).zzmk;
            AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) tVar.f3445b;
            g2 g2Var = (g2) zza;
            g2Var.getClass();
            i.d("#008 Must be called on the main UI thread.");
            e.E("Adapter called onAdLoaded.");
            try {
                ((y5) g2Var.f6511b).d5(new b(abstractAdViewAdapter));
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void g0() {
        c cVar = this.f17028a;
        if (cVar != null) {
            t tVar = (t) cVar;
            a zza = ((AbstractAdViewAdapter) tVar.f3445b).zzmk;
            AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) tVar.f3445b;
            g2 g2Var = (g2) zza;
            g2Var.getClass();
            i.d("#008 Must be called on the main UI thread.");
            e.E("Adapter called onVideoCompleted.");
            try {
                ((y5) g2Var.f6511b).K1(new b(abstractAdViewAdapter));
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r6(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003d;
                case 3: goto L_0x0039;
                case 4: goto L_0x0035;
                case 5: goto L_0x0015;
                case 6: goto L_0x0011;
                case 7: goto L_0x0009;
                case 8: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            goto L_0x0048
        L_0x0005:
            r0.g0()
            goto L_0x0044
        L_0x0009:
            int r1 = r2.readInt()
            r0.F2(r1)
            goto L_0x0044
        L_0x0011:
            r0.S3()
            goto L_0x0044
        L_0x0015:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x001d
            r1 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.reward.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.m5
            if (r4 == 0) goto L_0x002b
            r1 = r2
            com.google.android.gms.internal.ads.m5 r1 = (com.google.android.gms.internal.ads.m5) r1
            goto L_0x0031
        L_0x002b:
            com.google.android.gms.internal.ads.n5 r2 = new com.google.android.gms.internal.ads.n5
            r2.<init>(r1)
            r1 = r2
        L_0x0031:
            r0.N4(r1)
            goto L_0x0044
        L_0x0035:
            r0.u3()
            goto L_0x0044
        L_0x0039:
            r0.d0()
            goto L_0x0044
        L_0x003d:
            r0.V3()
            goto L_0x0044
        L_0x0041:
            r0.e5()
        L_0x0044:
            r3.writeNoException()
            r1 = 1
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.v7.r6(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public final void u3() {
        c cVar = this.f17028a;
        if (cVar != null) {
            t tVar = (t) cVar;
            a zza = ((AbstractAdViewAdapter) tVar.f3445b).zzmk;
            AbstractAdViewAdapter abstractAdViewAdapter = (AbstractAdViewAdapter) tVar.f3445b;
            g2 g2Var = (g2) zza;
            g2Var.getClass();
            i.d("#008 Must be called on the main UI thread.");
            e.E("Adapter called onAdClosed.");
            try {
                ((y5) g2Var.f6511b).z3(new b(abstractAdViewAdapter));
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
            y6.i unused = ((AbstractAdViewAdapter) tVar.f3445b).zzmj = null;
        }
    }
}
