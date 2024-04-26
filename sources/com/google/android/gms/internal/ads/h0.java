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
public abstract class h0 extends os implements e0 {
    public h0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        z zVar;
        double d10;
        String t10;
        String t11;
        switch (i10) {
            case 2:
                b bVar = new b(((ua) this).f8232b);
                parcel2.writeNoException();
                ob0.b(parcel2, bVar);
                return true;
            case 3:
                String e10 = ((ua) this).f8233c.e();
                parcel2.writeNoException();
                parcel2.writeString(e10);
                return true;
            case 4:
                List<?> f10 = ((ua) this).f8233c.f();
                parcel2.writeNoException();
                parcel2.writeList(f10);
                return true;
            case 5:
                String a10 = ((ua) this).f8233c.a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            case 6:
                jn jnVar = ((ua) this).f8233c;
                synchronized (jnVar) {
                    zVar = jnVar.f15170o;
                }
                parcel2.writeNoException();
                ob0.b(parcel2, zVar);
                return true;
            case 7:
                String b10 = ((ua) this).f8233c.b();
                parcel2.writeNoException();
                parcel2.writeString(b10);
                return true;
            case b4.f10106f /*8*/:
                jn jnVar2 = ((ua) this).f8233c;
                synchronized (jnVar2) {
                    d10 = jnVar2.f15169n;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d10);
                return true;
            case 9:
                jn jnVar3 = ((ua) this).f8233c;
                synchronized (jnVar3) {
                    t10 = jnVar3.t("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(t10);
                return true;
            case 10:
                jn jnVar4 = ((ua) this).f8233c;
                synchronized (jnVar4) {
                    t11 = jnVar4.t("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(t11);
                return true;
            case 11:
                Bundle d11 = ((ua) this).f8233c.d();
                parcel2.writeNoException();
                ob0.d(parcel2, d11);
                return true;
            case 12:
                ((ua) this).f8232b.a();
                parcel2.writeNoException();
                return true;
            case 13:
                hz videoController = ((ua) this).getVideoController();
                parcel2.writeNoException();
                ob0.b(parcel2, videoController);
                return true;
            case 14:
                ((ua) this).f8232b.k((Bundle) ob0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean m10 = ((ua) this).f8232b.m((Bundle) ob0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(m10 ? 1 : 0);
                return true;
            case 16:
                ((ua) this).f8232b.l((Bundle) ob0.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                u h10 = ((ua) this).h();
                parcel2.writeNoException();
                ob0.b(parcel2, h10);
                return true;
            case 18:
                a w10 = ((ua) this).f8233c.w();
                parcel2.writeNoException();
                ob0.b(parcel2, w10);
                return true;
            case 19:
                String str = ((ua) this).f8231a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
