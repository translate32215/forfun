package com.google.android.gms.internal.ads;

import e8.a40;
import e8.fb0;
import e8.h30;
import e8.m30;
import e8.mb0;
import java.util.HashMap;
import java.util.Map;
import s8.i;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class er implements a40 {

    /* renamed from: a  reason: collision with root package name */
    public final h30 f6314a;

    /* renamed from: b  reason: collision with root package name */
    public final m30 f6315b;

    /* renamed from: c  reason: collision with root package name */
    public final mb0 f6316c;

    /* renamed from: d  reason: collision with root package name */
    public final fb0 f6317d;

    public er(h30 h30, m30 m30, mb0 mb0, fb0 fb0) {
        this.f6314a = h30;
        this.f6315b = m30;
        this.f6316c = mb0;
        this.f6317d = fb0;
    }

    public final Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        m30 m30 = this.f6315b;
        i iVar = m30.f15458h;
        ma a10 = ((uf) m30.f15456f).a();
        if (iVar.l()) {
            a10 = (ma) iVar.h();
        }
        hashMap.put("v", this.f6314a.a());
        hashMap.put("gms", Boolean.valueOf(this.f6314a.c()));
        hashMap.put("int", a10.M());
        hashMap.put("up", Boolean.valueOf(this.f6317d.f14554a));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    public final Map<String, Object> b() {
        Map<String, Object> a10 = a();
        m30 m30 = this.f6315b;
        i iVar = m30.f15457g;
        ma a11 = ((uf) m30.f15455e).a();
        if (iVar.l()) {
            a11 = (ma) iVar.h();
        }
        HashMap hashMap = (HashMap) a10;
        hashMap.put("gai", Boolean.valueOf(this.f6314a.b()));
        hashMap.put("did", a11.Q());
        hashMap.put("dst", Integer.valueOf(a11.R().f7465a));
        hashMap.put("doo", Boolean.valueOf(a11.S()));
        return a10;
    }
}
