package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import com.startapp.b4;
import e8.o5;
import e8.ob0;
import g7.j;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class h3 extends os implements e3 {
    public h3() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                String str = ((o5) this).f15745a.f18573e;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List i12 = ((o5) this).i();
                parcel2.writeNoException();
                parcel2.writeList(i12);
                return true;
            case 4:
                String str2 = ((o5) this).f15745a.f18575g;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                z R = ((o5) this).R();
                parcel2.writeNoException();
                ob0.b(parcel2, R);
                return true;
            case 6:
                String str3 = ((o5) this).f15745a.f18577i;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = ((o5) this).f15745a.f18578j;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case b4.f10106f /*8*/:
                ((o5) this).f15745a.getClass();
                parcel2.writeNoException();
                return true;
            case 9:
                a Y = a.C0062a.Y(parcel.readStrongBinder());
                j jVar = ((o5) this).f15745a;
                View view = (View) b.z0(Y);
                jVar.getClass();
                parcel2.writeNoException();
                return true;
            case 10:
                ((o5) this).f15745a.a((View) b.z0(a.C0062a.Y(parcel.readStrongBinder())));
                parcel2.writeNoException();
                return true;
            case 11:
                boolean z10 = ((o5) this).f15745a.f18561a;
                parcel2.writeNoException();
                ClassLoader classLoader = ob0.f15778a;
                parcel2.writeInt(z10 ? 1 : 0);
                return true;
            case 12:
                boolean z11 = ((o5) this).f15745a.f18562b;
                parcel2.writeNoException();
                ClassLoader classLoader2 = ob0.f15778a;
                parcel2.writeInt(z11 ? 1 : 0);
                return true;
            case 13:
                Bundle bundle = ((o5) this).f15745a.f18563c;
                parcel2.writeNoException();
                ob0.d(parcel2, bundle);
                return true;
            case 14:
                a Y2 = a.C0062a.Y(parcel.readStrongBinder());
                j jVar2 = ((o5) this).f15745a;
                View view2 = (View) b.z0(Y2);
                jVar2.getClass();
                parcel2.writeNoException();
                return true;
            case 15:
                ((o5) this).L();
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 16:
                hz videoController = ((o5) this).getVideoController();
                parcel2.writeNoException();
                ob0.b(parcel2, videoController);
                return true;
            case 19:
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 20:
                ((o5) this).E();
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 21:
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 22:
                ((o5) this).z(a.C0062a.Y(parcel.readStrongBinder()), a.C0062a.Y(parcel.readStrongBinder()), a.C0062a.Y(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
