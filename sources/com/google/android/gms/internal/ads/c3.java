package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import com.startapp.b4;
import e8.ob0;
import e8.p5;
import g7.i;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class c3 extends os implements d3 {
    public c3() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                String str = ((p5) this).f15871a.f18565e;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List i12 = ((p5) this).i();
                parcel2.writeNoException();
                parcel2.writeList(i12);
                return true;
            case 4:
                String str2 = ((p5) this).f15871a.f18567g;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                z w10 = ((p5) this).w();
                parcel2.writeNoException();
                ob0.b(parcel2, w10);
                return true;
            case 6:
                String str3 = ((p5) this).f15871a.f18569i;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                double d10 = ((p5) this).f15871a.f18570j;
                parcel2.writeNoException();
                parcel2.writeDouble(d10);
                return true;
            case b4.f10106f /*8*/:
                String str4 = ((p5) this).f15871a.f18571k;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 9:
                String str5 = ((p5) this).f15871a.f18572l;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                ((p5) this).f15871a.getClass();
                parcel2.writeNoException();
                return true;
            case 11:
                a Y = a.C0062a.Y(parcel.readStrongBinder());
                i iVar = ((p5) this).f15871a;
                View view = (View) b.z0(Y);
                iVar.getClass();
                parcel2.writeNoException();
                return true;
            case 12:
                ((p5) this).f15871a.a((View) b.z0(a.C0062a.Y(parcel.readStrongBinder())));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean z10 = ((p5) this).f15871a.f18561a;
                parcel2.writeNoException();
                ClassLoader classLoader = ob0.f15778a;
                parcel2.writeInt(z10 ? 1 : 0);
                return true;
            case 14:
                boolean z11 = ((p5) this).f15871a.f18562b;
                parcel2.writeNoException();
                ClassLoader classLoader2 = ob0.f15778a;
                parcel2.writeInt(z11 ? 1 : 0);
                return true;
            case 15:
                Bundle bundle = ((p5) this).f15871a.f18563c;
                parcel2.writeNoException();
                ob0.d(parcel2, bundle);
                return true;
            case 16:
                a Y2 = a.C0062a.Y(parcel.readStrongBinder());
                i iVar2 = ((p5) this).f15871a;
                View view2 = (View) b.z0(Y2);
                iVar2.getClass();
                parcel2.writeNoException();
                return true;
            case 17:
                hz videoController = ((p5) this).getVideoController();
                parcel2.writeNoException();
                ob0.b(parcel2, videoController);
                return true;
            case 18:
                ((p5) this).L();
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 19:
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 20:
                ((p5) this).E();
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 21:
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 22:
                ((p5) this).z(a.C0062a.Y(parcel.readStrongBinder()), a.C0062a.Y(parcel.readStrongBinder()), a.C0062a.Y(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
