package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import c8.a;
import c8.b;
import com.startapp.b4;
import e8.jn;
import e8.ob0;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class k0 extends os implements i0 {
    public k0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        z zVar;
        String t10;
        switch (i10) {
            case 2:
                b bVar = new b(((va) this).f8346b);
                parcel2.writeNoException();
                ob0.b(parcel2, bVar);
                return true;
            case 3:
                String e10 = ((va) this).f8347c.e();
                parcel2.writeNoException();
                parcel2.writeString(e10);
                return true;
            case 4:
                List<?> f10 = ((va) this).f8347c.f();
                parcel2.writeNoException();
                parcel2.writeList(f10);
                return true;
            case 5:
                String a10 = ((va) this).f8347c.a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            case 6:
                jn jnVar = ((va) this).f8347c;
                synchronized (jnVar) {
                    zVar = jnVar.f15171p;
                }
                parcel2.writeNoException();
                ob0.b(parcel2, zVar);
                return true;
            case 7:
                String b10 = ((va) this).f8347c.b();
                parcel2.writeNoException();
                parcel2.writeString(b10);
                return true;
            case b4.f10106f /*8*/:
                jn jnVar2 = ((va) this).f8347c;
                synchronized (jnVar2) {
                    t10 = jnVar2.t("advertiser");
                }
                parcel2.writeNoException();
                parcel2.writeString(t10);
                return true;
            case 9:
                Bundle d10 = ((va) this).f8347c.d();
                parcel2.writeNoException();
                ob0.d(parcel2, d10);
                return true;
            case 10:
                ((va) this).f8346b.a();
                parcel2.writeNoException();
                return true;
            case 11:
                hz videoController = ((va) this).getVideoController();
                parcel2.writeNoException();
                ob0.b(parcel2, videoController);
                return true;
            case 12:
                ((va) this).f8346b.k((Bundle) ob0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean m10 = ((va) this).f8346b.m((Bundle) ob0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(m10 ? 1 : 0);
                return true;
            case 14:
                ((va) this).f8346b.l((Bundle) ob0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                u h10 = ((va) this).h();
                parcel2.writeNoException();
                ob0.b(parcel2, h10);
                return true;
            case 16:
                a w10 = ((va) this).f8347c.w();
                parcel2.writeNoException();
                ob0.b(parcel2, w10);
                return true;
            case 17:
                String str = ((va) this).f8345a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
