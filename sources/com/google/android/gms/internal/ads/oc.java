package com.google.android.gms.internal.ads;

import e8.d10;
import e8.oq;
import e8.ot;
import e8.p9;
import e8.t;
import e8.t20;
import e8.ti0;
import e8.u20;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class oc {

    /* renamed from: a  reason: collision with root package name */
    public final d10 f7676a;

    /* renamed from: b  reason: collision with root package name */
    public final fb f7677b;

    /* renamed from: c  reason: collision with root package name */
    public final oq f7678c;

    /* renamed from: d  reason: collision with root package name */
    public final t20 f7679d;

    public oc(d10 d10, fb fbVar, oq oqVar, t20 t20) {
        this.f7676a = d10;
        this.f7677b = fbVar;
        this.f7678c = oqVar;
        this.f7679d = t20;
    }

    public final void a(re reVar, qe qeVar, int i10, @Nullable ot otVar, long j10) {
        re reVar2 = reVar;
        qe qeVar2 = qeVar;
        ot otVar2 = otVar;
        if (((Boolean) ti0.f16763j.f16769f.a(t.H4)).booleanValue()) {
            u20 c10 = u20.c("adapter_status");
            c10.b(reVar2);
            c10.f16842a.put("aai", qeVar2.f7969v);
            c10.f16842a.put("adapter_l", String.valueOf(j10));
            c10.f16842a.put("sc", Integer.toString(i10));
            if (otVar2 != null) {
                c10.f16842a.put("arec", Integer.toString(otVar2.f15842b.f17753a));
                String a10 = this.f7676a.a(otVar.getMessage());
                if (a10 != null) {
                    c10.f16842a.put("areec", a10);
                }
            }
            eb a11 = this.f7677b.a(qeVar2.f7966s);
            if (a11 != null) {
                c10.f16842a.put("ancn", a11.f6270a);
                h4 h4Var = a11.f6271b;
                if (h4Var != null) {
                    c10.f16842a.put("adapter_v", h4Var.toString());
                }
                h4 h4Var2 = a11.f6272c;
                if (h4Var2 != null) {
                    c10.f16842a.put("adapter_sv", h4Var2.toString());
                }
            }
            this.f7679d.a(c10);
            return;
        }
        p9 a12 = this.f7678c.a();
        ((Map) a12.f15880b).put("gqi", reVar2.f8030b);
        ((Map) a12.f15880b).put("aai", qeVar2.f7969v);
        ((Map) a12.f15880b).put("action", "adapter_status");
        ((Map) a12.f15880b).put("adapter_l", String.valueOf(j10));
        ((Map) a12.f15880b).put("sc", Integer.toString(i10));
        if (otVar2 != null) {
            ((Map) a12.f15880b).put("arec", Integer.toString(otVar2.f15842b.f17753a));
            String a13 = this.f7676a.a(otVar.getMessage());
            if (a13 != null) {
                ((Map) a12.f15880b).put("areec", a13);
            }
        }
        eb a14 = this.f7677b.a(qeVar2.f7966s);
        if (a14 != null) {
            ((Map) a12.f15880b).put("ancn", a14.f6270a);
            h4 h4Var3 = a14.f6271b;
            if (h4Var3 != null) {
                ((Map) a12.f15880b).put("adapter_v", h4Var3.toString());
            }
            h4 h4Var4 = a14.f6272c;
            if (h4Var4 != null) {
                ((Map) a12.f15880b).put("adapter_sv", h4Var4.toString());
            }
        }
        a12.l();
    }
}
