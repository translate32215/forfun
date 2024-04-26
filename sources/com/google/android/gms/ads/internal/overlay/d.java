package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import c8.a;
import com.google.android.gms.internal.ads.t4;
import d7.l;
import e7.k;
import e8.wh0;
import z3.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d extends t4 {

    /* renamed from: b  reason: collision with root package name */
    public AdOverlayInfoParcel f5652b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f5653c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5654d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5655e = false;

    public d(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f5652b = adOverlayInfoParcel;
        this.f5653c = activity;
    }

    public final void B4() throws RemoteException {
    }

    public final void D2() throws RemoteException {
    }

    public final void T5(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f5654d);
    }

    public final void Z() throws RemoteException {
        if (this.f5653c.isFinishing()) {
            s6();
        }
    }

    public final void Z0(int i10, int i11, Intent intent) throws RemoteException {
    }

    public final void h1(a aVar) throws RemoteException {
    }

    public final void h6(Bundle bundle) {
        k kVar;
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5652b;
        if (adOverlayInfoParcel == null) {
            this.f5653c.finish();
        } else if (z10) {
            this.f5653c.finish();
        } else {
            if (bundle == null) {
                wh0 wh0 = adOverlayInfoParcel.f5608b;
                if (wh0 != null) {
                    wh0.n();
                }
                if (!(this.f5653c.getIntent() == null || !this.f5653c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (kVar = this.f5652b.f5609c) == null)) {
                    kVar.G1();
                }
            }
            b bVar = l.B.f13184a;
            Activity activity = this.f5653c;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f5652b;
            if (!b.d(activity, adOverlayInfoParcel2.f5607a, adOverlayInfoParcel2.f5615i)) {
                this.f5653c.finish();
            }
        }
    }

    public final void o3() throws RemoteException {
    }

    public final void onDestroy() throws RemoteException {
        if (this.f5653c.isFinishing()) {
            s6();
        }
    }

    public final void onPause() throws RemoteException {
        k kVar = this.f5652b.f5609c;
        if (kVar != null) {
            kVar.onPause();
        }
        if (this.f5653c.isFinishing()) {
            s6();
        }
    }

    public final void onResume() throws RemoteException {
        if (this.f5654d) {
            this.f5653c.finish();
            return;
        }
        this.f5654d = true;
        k kVar = this.f5652b.f5609c;
        if (kVar != null) {
            kVar.onResume();
        }
    }

    public final synchronized void s6() {
        if (!this.f5655e) {
            k kVar = this.f5652b.f5609c;
            if (kVar != null) {
                kVar.J3(c.OTHER);
            }
            this.f5655e = true;
        }
    }

    public final void v0() throws RemoteException {
    }

    public final boolean w2() throws RemoteException {
        return false;
    }

    public final void x0() throws RemoteException {
        k kVar = this.f5652b.f5609c;
        if (kVar != null) {
            kVar.x0();
        }
    }
}
