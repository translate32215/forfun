package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import c8.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import e8.di0;
import e8.ij0;
import e8.li0;
import e8.m30;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class jx extends nx<dy> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7181b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ li0 f7182c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f7183d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m30 f7184e;

    public jx(m30 m30, Context context, li0 li0, String str) {
        this.f7184e = m30;
        this.f7181b = context;
        this.f7182c = li0;
        this.f7183d = str;
    }

    public final Object a(oy oyVar) throws RemoteException {
        return oyVar.T0(new b(this.f7181b), this.f7182c, this.f7183d, ModuleDescriptor.MODULE_VERSION);
    }

    public final /* synthetic */ Object c() {
        m30.b(this.f7181b, "search");
        return new ij0();
    }

    public final /* synthetic */ Object d() throws RemoteException {
        return ((di0) this.f7184e.f15451a).c(this.f7181b, this.f7182c, this.f7183d, (s2) null, 3);
    }
}
