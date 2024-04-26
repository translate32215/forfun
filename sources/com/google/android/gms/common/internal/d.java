package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.f;
import s7.c;
import v7.b0;
import w7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new b0();

    /* renamed from: w  reason: collision with root package name */
    public static final Scope[] f5853w = new Scope[0];

    /* renamed from: x  reason: collision with root package name */
    public static final c[] f5854x = new c[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f5855a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5856b;

    /* renamed from: c  reason: collision with root package name */
    public int f5857c;

    /* renamed from: d  reason: collision with root package name */
    public String f5858d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f5859e;

    /* renamed from: f  reason: collision with root package name */
    public Scope[] f5860f;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f5861g;

    /* renamed from: h  reason: collision with root package name */
    public Account f5862h;

    /* renamed from: i  reason: collision with root package name */
    public c[] f5863i;

    /* renamed from: r  reason: collision with root package name */
    public c[] f5864r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5865s;

    /* renamed from: t  reason: collision with root package name */
    public int f5866t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5867u;

    /* renamed from: v  reason: collision with root package name */
    public String f5868v;

    public d(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f5853w : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f5854x : cVarArr;
        cVarArr2 = cVarArr2 == null ? f5854x : cVarArr2;
        this.f5855a = i10;
        this.f5856b = i11;
        this.f5857c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f5858d = "com.google.android.gms";
        } else {
            this.f5858d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                f Y = f.a.Y(iBinder);
                int i14 = a.f5820a;
                if (Y != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = Y.d();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f5862h = account2;
        } else {
            this.f5859e = iBinder;
            this.f5862h = account;
        }
        this.f5860f = scopeArr;
        this.f5861g = bundle;
        this.f5863i = cVarArr;
        this.f5864r = cVarArr2;
        this.f5865s = z10;
        this.f5866t = i13;
        this.f5867u = z11;
        this.f5868v = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        b0.a(this, parcel, i10);
    }
}
