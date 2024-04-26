package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.qn;
import com.google.android.gms.internal.ads.tm;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d implements Callable<tm> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f5604a;

    public d(c cVar) {
        this.f5604a = cVar;
    }

    public final Object call() throws Exception {
        c cVar = this.f5604a;
        return new tm(qn.r(cVar.f5595a.f14544a, cVar.f5598d, false, 1));
    }
}
