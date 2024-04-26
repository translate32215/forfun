package com.adcolony.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONArray;
import org.json.JSONObject;
import t2.i;
import t2.i0;
import t2.l;

public class AdColonyInterstitialActivity extends l {

    /* renamed from: r  reason: collision with root package name */
    public d f4409r;

    /* renamed from: s  reason: collision with root package name */
    public i0 f4410s;

    public AdColonyInterstitialActivity() {
        d dVar;
        if (!f.f()) {
            dVar = null;
        } else {
            dVar = f.d().f4670n;
        }
        this.f4409r = dVar;
    }

    public void c(g gVar) {
        i iVar;
        super.c(gVar);
        i g10 = f.d().g();
        JSONObject n10 = r0.n(gVar.f4485b, "v4iap");
        JSONArray optJSONArray = n10.optJSONArray("product_ids");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        d dVar = this.f4409r;
        if (!(dVar == null || dVar.f4462a == null || optJSONArray.length() <= 0)) {
            i iVar2 = this.f4409r.f4462a;
            optJSONArray.optString(0);
            n10.optInt("engagement_type");
            iVar2.getClass();
        }
        g10.a(this.f25501a);
        d dVar2 = this.f4409r;
        if (dVar2 != null) {
            g10.f4526b.remove(dVar2.f4466e);
        }
        d dVar3 = this.f4409r;
        if (!(dVar3 == null || (iVar = dVar3.f4462a) == null)) {
            iVar.getClass();
            d dVar4 = this.f4409r;
            dVar4.f4463b = null;
            dVar4.f4462a = null;
            this.f4409r = null;
        }
        i0 i0Var = this.f4410s;
        if (i0Var != null) {
            Context context = f.f4478a;
            if (context != null) {
                context.getApplicationContext().getContentResolver().unregisterContentObserver(i0Var);
            }
            i0Var.f25484b = null;
            i0Var.f25483a = null;
            this.f4410s = null;
        }
    }

    public void onCreate(Bundle bundle) {
        int i10;
        d dVar;
        d dVar2 = this.f4409r;
        if (dVar2 == null) {
            i10 = -1;
        } else {
            i10 = dVar2.f4465d;
        }
        this.f25502b = i10;
        super.onCreate(bundle);
        if (f.f() && (dVar = this.f4409r) != null) {
            r rVar = dVar.f4464c;
            if (rVar != null) {
                rVar.b(this.f25501a);
            }
            this.f4410s = new i0(new Handler(Looper.getMainLooper()), this.f4409r);
            i iVar = this.f4409r.f4462a;
        }
    }
}
