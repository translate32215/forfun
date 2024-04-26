package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import i8.a;
import i8.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class y extends a implements f {
    public y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account d() throws RemoteException {
        Parcel m10 = m(2, Y());
        Account account = (Account) c.a(m10, Account.CREATOR);
        m10.recycle();
        return account;
    }
}
