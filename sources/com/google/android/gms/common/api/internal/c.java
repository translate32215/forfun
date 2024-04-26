package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import b2.t;
import s8.j;
import t7.a;
import t7.a.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class c<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final s7.c[] f5772a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5773b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5774c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public t f5775a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5776b = true;

        /* renamed from: c  reason: collision with root package name */
        public s7.c[] f5777c;
    }

    public c(s7.c[] cVarArr, boolean z10, int i10) {
        this.f5772a = cVarArr;
        this.f5773b = cVarArr != null && z10;
        this.f5774c = i10;
    }

    public abstract void a(A a10, j<ResultT> jVar) throws RemoteException;
}
