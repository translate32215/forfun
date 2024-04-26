package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import d7.l;
import e8.b0;
import e8.t;
import e8.ti0;
import e8.y;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7185a;

    /* renamed from: b  reason: collision with root package name */
    public final List<j> f7186b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f7187c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7188d;

    /* renamed from: e  reason: collision with root package name */
    public k f7189e;

    public k(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f7187c = linkedHashMap;
        this.f7188d = new Object();
        this.f7185a = true;
        linkedHashMap.put("action", str);
        linkedHashMap.put("ad_format", str2);
    }

    public final boolean a(j jVar, long j10, String... strArr) {
        synchronized (this.f7188d) {
            for (String jVar2 : strArr) {
                this.f7186b.add(new j(j10, jVar2, jVar));
            }
        }
        return true;
    }

    public final void b(String str, String str2) {
        f e10;
        if (this.f7185a && !TextUtils.isEmpty(str2) && (e10 = l.B.f13190g.e()) != null) {
            synchronized (this.f7188d) {
                y yVar = e10.f6339c.get(str);
                if (yVar == null) {
                    yVar = y.f17540a;
                }
                Map<String, String> map = this.f7187c;
                map.put(str, yVar.a(map.get(str), str2));
            }
        }
    }

    public final b0 c() {
        b0 b0Var;
        boolean booleanValue = ((Boolean) ti0.f16763j.f16769f.a(t.f16562d1)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f7188d) {
            for (j next : this.f7186b) {
                long j10 = next.f7122a;
                String str = next.f7123b;
                j jVar = next.f7124c;
                if (jVar != null && j10 > 0) {
                    sb2.append(str);
                    sb2.append('.');
                    sb2.append(j10 - jVar.f7122a);
                    sb2.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(jVar.f7122a))) {
                            hashMap.put(Long.valueOf(jVar.f7122a), new StringBuilder(str));
                        } else {
                            StringBuilder sb3 = (StringBuilder) hashMap.get(Long.valueOf(jVar.f7122a));
                            sb3.append('+');
                            sb3.append(str);
                        }
                    }
                }
            }
            this.f7186b.clear();
            String str2 = null;
            if (!TextUtils.isEmpty((CharSequence) null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append('.');
                    long longValue = ((Long) entry.getKey()).longValue();
                    sb4.append((longValue - l.B.f13193j.a()) + l.B.f13193j.b());
                    sb4.append(',');
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                str2 = sb4.toString();
            }
            b0Var = new b0(sb2.toString(), str2, 0);
        }
        return b0Var;
    }

    public final Map<String, String> d() {
        synchronized (this.f7188d) {
            f e10 = l.B.f13190g.e();
            if (e10 != null) {
                k kVar = this.f7189e;
                if (kVar != null) {
                    Map<String, String> a10 = e10.a(this.f7187c, kVar.d());
                    return a10;
                }
            }
            Map<String, String> map = this.f7187c;
            return map;
        }
    }
}
