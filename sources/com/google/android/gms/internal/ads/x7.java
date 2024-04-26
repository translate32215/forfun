package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import c8.b;
import com.startapp.b4;
import e8.ob0;
import java.util.List;
import java.util.Map;
import k8.c1;
import k8.d1;
import k8.g1;
import k8.i1;
import k8.s1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class x7 extends os implements y7 {
    public x7() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        boolean z10 = false;
        switch (i10) {
            case 1:
                ((s1) ((o2) this).f7662a.f3445b).d((Bundle) ob0.a(parcel, Bundle.CREATOR), false);
                parcel2.writeNoException();
                break;
            case 2:
                Bundle d10 = ((s1) ((o2) this).f7662a.f3445b).d((Bundle) ob0.a(parcel, Bundle.CREATOR), true);
                parcel2.writeNoException();
                ob0.d(parcel2, d10);
                break;
            case 3:
                ((s1) ((o2) this).f7662a.f3445b).l(parcel.readString(), parcel.readString(), (Bundle) ob0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                a Y = a.C0062a.Y(parcel.readStrongBinder());
                ((o2) this).f7662a.W(readString, readString2, Y != null ? b.z0(Y) : null);
                parcel2.writeNoException();
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                ClassLoader classLoader = ob0.f15778a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                Map<String, Object> k10 = ((s1) ((o2) this).f7662a.f3445b).k(readString3, readString4, z10);
                parcel2.writeNoException();
                parcel2.writeMap(k10);
                break;
            case 6:
                int b10 = ((s1) ((o2) this).f7662a.f3445b).b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(b10);
                break;
            case 7:
                s1 s1Var = (s1) ((o2) this).f7662a.f3445b;
                s1Var.getClass();
                s1Var.f20455a.execute(new c1(s1Var, (Bundle) ob0.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            case b4.f10106f /*8*/:
                s1 s1Var2 = (s1) ((o2) this).f7662a.f3445b;
                s1Var2.getClass();
                s1Var2.f20455a.execute(new d1(s1Var2, parcel.readString(), parcel.readString(), (Bundle) ob0.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            case 9:
                List<Bundle> j10 = ((s1) ((o2) this).f7662a.f3445b).j(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(j10);
                break;
            case 10:
                String I3 = ((o2) this).I3();
                parcel2.writeNoException();
                parcel2.writeString(I3);
                break;
            case 11:
                String i12 = ((s1) ((o2) this).f7662a.f3445b).i();
                parcel2.writeNoException();
                parcel2.writeString(i12);
                break;
            case 12:
                long c10 = ((s1) ((o2) this).f7662a.f3445b).c();
                parcel2.writeNoException();
                parcel2.writeLong(c10);
                break;
            case 13:
                String readString5 = parcel.readString();
                s1 s1Var3 = (s1) ((o2) this).f7662a.f3445b;
                s1Var3.getClass();
                s1Var3.f20455a.execute(new g1(s1Var3, readString5));
                parcel2.writeNoException();
                break;
            case 14:
                String readString6 = parcel.readString();
                s1 s1Var4 = (s1) ((o2) this).f7662a.f3445b;
                s1Var4.getClass();
                s1Var4.f20455a.execute(new c1(s1Var4, readString6));
                parcel2.writeNoException();
                break;
            case 15:
                ((o2) this).l1(a.C0062a.Y(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 16:
                String h10 = ((s1) ((o2) this).f7662a.f3445b).h();
                parcel2.writeNoException();
                parcel2.writeString(h10);
                break;
            case 17:
                String g10 = ((s1) ((o2) this).f7662a.f3445b).g();
                parcel2.writeNoException();
                parcel2.writeString(g10);
                break;
            case 18:
                String str = ((s1) ((o2) this).f7662a.f3445b).f20459e;
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 19:
                s1 s1Var5 = (s1) ((o2) this).f7662a.f3445b;
                s1Var5.getClass();
                s1Var5.f20455a.execute(new i1(s1Var5, (Bundle) ob0.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
