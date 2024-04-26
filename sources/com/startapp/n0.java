package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.w9;

/* compiled from: Sta */
public class n0 extends GetAdRequest {
    public boolean T0;
    public int U0;

    public void a(m8 m8Var) throws SDKException {
        super.a(m8Var);
        m8Var.a("fixedSize", (Object) Boolean.valueOf(this.T0), false, true);
        m8Var.a("bnrt", (Object) Integer.valueOf(this.U0), false, true);
    }

    public void f(Context context) {
        String str;
        w9 s10 = ComponentLocator.a(context).s();
        AdPreferences.Placement placement = this.f12351h0;
        int i10 = this.U0;
        s10.getClass();
        if (placement == null) {
            str = null;
        } else {
            str = s10.f12760a.get(new w9.a(placement, i10));
        }
        this.f12365v0 = str;
    }
}
