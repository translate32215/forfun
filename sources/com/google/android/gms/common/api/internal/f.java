package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.c;
import s8.j;
import t7.a;
import v7.i;
import x7.d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class f extends c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c.a f5792d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(c.a aVar, s7.c[] cVarArr, boolean z10, int i10) {
        super(cVarArr, z10, i10);
        this.f5792d = aVar;
    }

    /* JADX INFO: finally extract failed */
    public final void a(a.b bVar, j jVar) throws RemoteException {
        com.google.android.gms.common.internal.j jVar2 = (com.google.android.gms.common.internal.j) this.f5792d.f5775a.f3445b;
        a<i> aVar = x7.c.f27869i;
        x7.a aVar2 = (x7.a) ((d) bVar).v();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f18594b);
        int i10 = g8.c.f18595a;
        if (jVar2 == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            jVar2.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f18593a.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            jVar.f25035a.p(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
