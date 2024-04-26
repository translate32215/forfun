package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import com.google.android.gms.ads.f;
import com.startapp.b4;
import e8.ob0;
import e8.t5;
import g7.n;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class i3 extends os implements j3 {
    public i3() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        IInterface iInterface = null;
        switch (i10) {
            case 2:
                String str = ((t5) this).f16706a.f18579a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List i12 = ((t5) this).i();
                parcel2.writeNoException();
                parcel2.writeList(i12);
                return true;
            case 4:
                String str2 = ((t5) this).f16706a.f18581c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                z w10 = ((t5) this).w();
                parcel2.writeNoException();
                ob0.b(parcel2, w10);
                return true;
            case 6:
                String str3 = ((t5) this).f16706a.f18583e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = ((t5) this).f16706a.f18584f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case b4.f10106f /*8*/:
                Double d10 = ((t5) this).f16706a.f18585g;
                double doubleValue = d10 != null ? d10.doubleValue() : -1.0d;
                parcel2.writeNoException();
                parcel2.writeDouble(doubleValue);
                return true;
            case 9:
                String str5 = ((t5) this).f16706a.f18586h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = ((t5) this).f16706a.f18587i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                f fVar = ((t5) this).f16706a.f18588j;
                if (fVar != null) {
                    iInterface = fVar.c();
                }
                parcel2.writeNoException();
                ob0.b(parcel2, iInterface);
                return true;
            case 12:
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 13:
                ((t5) this).f16706a.getClass();
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 14:
                ((t5) this).E();
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 15:
                Object obj = ((t5) this).f16706a.f18589k;
                if (obj != null) {
                    iInterface = new b(obj);
                }
                parcel2.writeNoException();
                ob0.b(parcel2, iInterface);
                return true;
            case 16:
                Bundle bundle = ((t5) this).f16706a.f18590l;
                parcel2.writeNoException();
                ob0.d(parcel2, bundle);
                return true;
            case 17:
                boolean z10 = ((t5) this).f16706a.f18591m;
                parcel2.writeNoException();
                ClassLoader classLoader = ob0.f15778a;
                parcel2.writeInt(z10 ? 1 : 0);
                return true;
            case 18:
                boolean z11 = ((t5) this).f16706a.f18592n;
                parcel2.writeNoException();
                ClassLoader classLoader2 = ob0.f15778a;
                parcel2.writeInt(z11 ? 1 : 0);
                return true;
            case 19:
                ((t5) this).f16706a.getClass();
                parcel2.writeNoException();
                return true;
            case 20:
                a Y = a.C0062a.Y(parcel.readStrongBinder());
                n nVar = ((t5) this).f16706a;
                View view = (View) b.z0(Y);
                nVar.getClass();
                parcel2.writeNoException();
                return true;
            case 21:
                ((t5) this).z(a.C0062a.Y(parcel.readStrongBinder()), a.C0062a.Y(parcel.readStrongBinder()), a.C0062a.Y(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                a Y2 = a.C0062a.Y(parcel.readStrongBinder());
                n nVar2 = ((t5) this).f16706a;
                View view2 = (View) b.z0(Y2);
                nVar2.getClass();
                parcel2.writeNoException();
                return true;
            case 23:
                ((t5) this).f16706a.getClass();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                ((t5) this).f16706a.getClass();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                ((t5) this).f16706a.getClass();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }
}
