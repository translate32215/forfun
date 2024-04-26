package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import i8.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface f extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class a extends b implements f {
        public static f Y(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof f ? (f) queryLocalInterface : new y(iBinder);
        }
    }

    Account d() throws RemoteException;
}
