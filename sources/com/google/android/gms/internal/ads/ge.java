package com.google.android.gms.internal.ads;

import e8.wr;
import e8.wz;
import l0.e;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ge implements mg<wr, he> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ wz f6638a;

    public ge(wz wzVar) {
        this.f6638a = wzVar;
    }

    @NullableDecl
    public final /* synthetic */ Object apply(@NullableDecl Object obj) {
        e.C("", (wr) obj);
        e.H("Failed to get a cache key, reverting to legacy flow.");
        wz wzVar = this.f6638a;
        wzVar.f17422e = new he((l5) null, wzVar.a(), (ge) null);
        return (he) this.f6638a.f17422e;
    }
}
