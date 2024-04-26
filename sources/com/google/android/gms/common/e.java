package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.j;
import c8.b;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.b0;
import javax.annotation.Nullable;
import s7.s;
import s7.t;
import s7.z;
import w7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    public final String f5812a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final s f5813b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5814c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5815d;

    public e(String str, @Nullable IBinder iBinder, boolean z10, boolean z11) {
        byte[] bArr;
        this.f5812a = str;
        t tVar = null;
        if (iBinder != null) {
            try {
                int i10 = a0.f5821a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                c8.a f10 = (queryLocalInterface instanceof b0 ? (b0) queryLocalInterface : new com.google.android.gms.common.internal.z(iBinder)).f();
                if (f10 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) b.z0(f10);
                }
                if (bArr != null) {
                    tVar = new t(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f5813b = tVar;
        this.f5814c = z10;
        this.f5815d = z11;
    }

    public e(String str, @Nullable s sVar, boolean z10, boolean z11) {
        this.f5812a = str;
        this.f5813b = sVar;
        this.f5814c = z10;
        this.f5815d = z11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f5812a, false);
        s sVar = this.f5813b;
        if (sVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            sVar = null;
        }
        j.e(parcel, 2, sVar, false);
        boolean z10 = this.f5814c;
        parcel.writeInt(262147);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f5815d;
        parcel.writeInt(262148);
        parcel.writeInt(z11 ? 1 : 0);
        j.m(parcel, l10);
    }
}
