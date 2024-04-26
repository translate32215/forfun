package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.l;
import e8.sg0;
import e8.t;
import e8.ti0;
import e8.ug0;
import e8.ul;
import e8.vg0;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l9 extends h9<ug0> implements ug0 {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public Map<View, sg0> f7353b = new WeakHashMap(1);

    /* renamed from: c  reason: collision with root package name */
    public final Context f7354c;

    /* renamed from: d  reason: collision with root package name */
    public final qe f7355d;

    public l9(Context context, Set<ul<ug0>> set, qe qeVar) {
        super(set);
        this.f7354c = context;
        this.f7355d = qeVar;
    }

    public final synchronized void K0(View view) {
        sg0 sg0 = this.f7353b.get(view);
        if (sg0 == null) {
            sg0 = new sg0(this.f7354c, view);
            sg0.f16484t.add(this);
            sg0.c(3);
            this.f7353b.put(view, sg0);
        }
        qe qeVar = this.f7355d;
        if (qeVar != null && qeVar.R) {
            if (((Boolean) ti0.f16763j.f16769f.a(t.L0)).booleanValue()) {
                long longValue = ((Long) ti0.f16763j.f16769f.a(t.K0)).longValue();
                l lVar = sg0.f16481i;
                synchronized (lVar.f5671c) {
                    lVar.f5669a = longValue;
                }
                return;
            }
        }
        l lVar2 = sg0.f16481i;
        long j10 = sg0.f16471w;
        synchronized (lVar2.f5671c) {
            lVar2.f5669a = j10;
        }
    }

    public final synchronized void t(vg0 vg0) {
        I0(new ri(vg0));
    }
}
