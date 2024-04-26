package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import c8.b;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.r4;
import e8.m30;
import e8.ti0;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class AdActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public r4 f5571a;

    public final void a() {
        r4 r4Var = this.f5571a;
        if (r4Var != null) {
            try {
                r4Var.D2();
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            this.f5571a.Z0(i10, i11, intent);
        } catch (Exception e10) {
            e.F("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    public final void onBackPressed() {
        boolean z10 = true;
        try {
            r4 r4Var = this.f5571a;
            if (r4Var != null) {
                z10 = r4Var.w2();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
        if (z10) {
            super.onBackPressed();
            try {
                this.f5571a.B4();
            } catch (RemoteException e11) {
                e.F("#007 Could not call remote method.", e11);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f5571a.h1(new b(configuration));
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m30 m30 = ti0.f16763j.f16765b;
        m30.getClass();
        hx hxVar = new hx(m30, this);
        Intent intent = getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            e.I("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        r4 r4Var = (r4) hxVar.b(this, z10);
        this.f5571a = r4Var;
        if (r4Var == null) {
            e.F("#007 Could not call remote method.", (Throwable) null);
            finish();
            return;
        }
        try {
            r4Var.h6(bundle);
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
            finish();
        }
    }

    public final void onDestroy() {
        try {
            r4 r4Var = this.f5571a;
            if (r4Var != null) {
                r4Var.onDestroy();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    public final void onPause() {
        try {
            r4 r4Var = this.f5571a;
            if (r4Var != null) {
                r4Var.onPause();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    public final void onRestart() {
        super.onRestart();
        try {
            r4 r4Var = this.f5571a;
            if (r4Var != null) {
                r4Var.o3();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
            finish();
        }
    }

    public final void onResume() {
        super.onResume();
        try {
            r4 r4Var = this.f5571a;
            if (r4Var != null) {
                r4Var.onResume();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        try {
            r4 r4Var = this.f5571a;
            if (r4Var != null) {
                r4Var.T5(bundle);
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onStart() {
        super.onStart();
        try {
            r4 r4Var = this.f5571a;
            if (r4Var != null) {
                r4Var.v0();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
            finish();
        }
    }

    public final void onStop() {
        try {
            r4 r4Var = this.f5571a;
            if (r4Var != null) {
                r4Var.Z();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            this.f5571a.x0();
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
