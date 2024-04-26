package com.adcolony.sdk;

import android.webkit.WebView;
import org.json.JSONObject;
import p.f;
import t2.i;

public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f4562a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f4563b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f4564c;

    public j(i iVar, d dVar, g gVar, i iVar2) {
        this.f4562a = dVar;
        this.f4563b = gVar;
        this.f4564c = iVar2;
    }

    public void run() {
        d dVar = this.f4562a;
        if (dVar.f4464c == null) {
            JSONObject n10 = r0.n(this.f4563b.f4485b, "iab");
            if (n10.length() > 0) {
                dVar.f4464c = new r(n10, dVar.f4466e);
            }
        }
        this.f4562a.f4467f = this.f4563b.f4485b.optString("ad_id");
        d dVar2 = this.f4562a;
        this.f4563b.f4485b.optString("creative_id");
        dVar2.getClass();
        r rVar = this.f4562a.f4464c;
        if (!(rVar == null || rVar.f4755e == 2)) {
            try {
                rVar.a((WebView) null);
            } catch (IllegalArgumentException unused) {
                f.a(0, 0, "IllegalArgumentException when creating omid session", true);
            }
        }
        this.f4564c.a(this.f4562a);
    }
}
