package com.startapp;

import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.b;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Sta */
public abstract class u0 extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f12641g = 0;

    /* renamed from: h  reason: collision with root package name */
    public Set<String> f12642h = new HashSet();

    public u0(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad2, adPreferences, adEventListener, placement);
    }

    public abstract void a(Ad ad2);

    public boolean a(Object obj) {
        int i10;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z10 = false;
        if (obj == null) {
            this.f12236f = "Empty Response";
            return false;
        } else if (!getAdResponse.b()) {
            this.f12236f = getAdResponse.a();
            return false;
        } else {
            JsonAd jsonAd = (JsonAd) this.f12232b;
            List<AdDetails> a10 = f0.a(this.f12231a, getAdResponse.d(), this.f12641g, this.f12642h, true);
            jsonAd.a(a10);
            jsonAd.setAdInfoOverride(getAdResponse.c());
            if (getAdResponse.d() != null && getAdResponse.d().size() > 0) {
                z10 = true;
            }
            if (!z10) {
                this.f12236f = "Empty Response";
            } else if (((ArrayList) a10).size() == 0 && (i10 = this.f12641g) == 0) {
                this.f12641g = i10 + 1;
                return b();
            }
            return z10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a7 A[SYNTHETIC, Splitter:B:42:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e() {
        /*
            r13 = this;
            java.lang.String r0 = "GET"
            com.startapp.sdk.adsbase.model.GetAdRequest r1 = r13.d()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set<java.lang.String> r3 = r13.f12642h
            int r3 = r3.size()
            if (r3 != 0) goto L_0x001d
            java.util.Set<java.lang.String> r3 = r13.f12642h
            android.content.Context r4 = r13.f12231a
            java.lang.String r4 = r4.getPackageName()
            r3.add(r4)
        L_0x001d:
            int r3 = r13.f12641g
            r4 = 0
            if (r3 <= 0) goto L_0x0024
            r1.G0 = r4
        L_0x0024:
            java.util.Set<java.lang.String> r5 = r13.f12642h
            r1.C0 = r5
            if (r3 != 0) goto L_0x002b
            r4 = 1
        L_0x002b:
            r1.G0 = r4
            android.content.Context r3 = r13.f12231a
            com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r3)
            com.startapp.y3 r3 = r3.k()
            com.startapp.sdk.adsbase.AdsConstants$AdApiType r4 = com.startapp.sdk.adsbase.AdsConstants.AdApiType.JSON
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r5 = r13.f12235e
            java.lang.String r4 = com.startapp.sdk.adsbase.AdsConstants.a(r4, r5)
            r3.getClass()
            java.lang.Class<com.startapp.sdk.adsbase.model.GetAdResponse> r5 = com.startapp.sdk.adsbase.model.GetAdResponse.class
            java.util.Map r6 = r3.a()     // Catch:{ all -> 0x00a0 }
            com.startapp.c7 r7 = new com.startapp.c7     // Catch:{ SDKException -> 0x009b }
            r7.<init>()     // Catch:{ SDKException -> 0x009b }
            r1.a(r7)     // Catch:{ SDKException -> 0x009b }
            java.lang.String r1 = r7.toString()     // Catch:{ SDKException -> 0x009b }
            java.lang.String r1 = com.startapp.y3.a(r4, r1)     // Catch:{ SDKException -> 0x009b }
            com.startapp.ub r4 = r3.f12871b     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = r4.f12678a     // Catch:{ all -> 0x00a0 }
            com.startapp.z3 r7 = r3.b()     // Catch:{ all -> 0x00a0 }
            boolean r7 = r7.f12912a     // Catch:{ all -> 0x00a0 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a0 }
            long r10 = com.startapp.wb.a()     // Catch:{ all -> 0x00a0 }
            com.startapp.g7 r3 = r3.f12873d     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0074
            com.startapp.n7 r12 = new com.startapp.n7     // Catch:{ all -> 0x00a0 }
            r12.<init>(r3)     // Catch:{ all -> 0x00a0 }
            goto L_0x0075
        L_0x0074:
            r12 = r2
        L_0x0075:
            com.startapp.o7$a r3 = com.startapp.o7.a(r1, r6, r4, r7)     // Catch:{ SDKException -> 0x0089 }
            if (r12 == 0) goto L_0x007e
            r12.a(r0, r1, r2)     // Catch:{ SDKException -> 0x0089 }
        L_0x007e:
            r3.f11525d = r8     // Catch:{ SDKException -> 0x0089 }
            r3.f11526e = r10     // Catch:{ SDKException -> 0x0089 }
            long r6 = com.startapp.wb.a()     // Catch:{ SDKException -> 0x0089 }
            r3.f11527f = r6     // Catch:{ SDKException -> 0x0089 }
            goto L_0x00a5
        L_0x0089:
            r3 = move-exception
            if (r12 == 0) goto L_0x008f
            r12.a(r0, r1, r3)     // Catch:{ all -> 0x00a0 }
        L_0x008f:
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0096 }
            r13.f12236f = r0     // Catch:{ all -> 0x0096 }
            goto L_0x00a4
        L_0x0096:
            r0 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x009b:
            r0 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r0 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x00a4:
            r3 = r2
        L_0x00a5:
            if (r3 == 0) goto L_0x00b2
            java.lang.String r0 = r3.f11522a     // Catch:{ all -> 0x00ae }
            java.lang.Object r2 = com.startapp.wb.a((java.lang.String) r0, r5)     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r0)
        L_0x00b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.u0.e():java.lang.Object");
    }

    public void a(boolean z10) {
        super.a(z10);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f12232b.hashCode());
        intent.putExtra("adResult", z10);
        a6.a(this.f12231a).a(intent);
        if (z10) {
            a((Ad) (JsonAd) this.f12232b);
            j.b(this.f12231a, a(), this.f12232b, false);
        }
    }
}
