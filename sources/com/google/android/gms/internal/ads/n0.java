package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import c8.a;
import c8.b;
import com.startapp.b4;
import d7.l;
import e8.ap;
import e8.fn;
import e8.jn;
import e8.ob0;
import e8.t;
import e8.ti0;
import java.util.Arrays;
import java.util.List;
import l0.e;
import s.i;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class n0 extends os implements l0 {
    public n0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        i<String, String> iVar;
        i<String, t> iVar2;
        i<String, t> iVar3;
        i<String, String> iVar4;
        fn fnVar;
        int i12 = 0;
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                jn jnVar = ((ap) this).f13737b;
                synchronized (jnVar) {
                    iVar = jnVar.f15174s;
                }
                parcel2.writeNoException();
                parcel2.writeString(iVar.getOrDefault(readString, null));
                break;
            case 2:
                String readString2 = parcel.readString();
                jn jnVar2 = ((ap) this).f13737b;
                synchronized (jnVar2) {
                    iVar2 = jnVar2.f15173r;
                }
                parcel2.writeNoException();
                ob0.b(parcel2, iVar2.getOrDefault(readString2, null));
                break;
            case 3:
                ap apVar = (ap) this;
                jn jnVar3 = apVar.f13737b;
                synchronized (jnVar3) {
                    iVar3 = jnVar3.f15173r;
                }
                jn jnVar4 = apVar.f13737b;
                synchronized (jnVar4) {
                    iVar4 = jnVar4.f15174s;
                }
                String[] strArr = new String[(iVar3.f24851c + iVar4.f24851c)];
                int i13 = 0;
                int i14 = 0;
                while (i13 < iVar3.f24851c) {
                    strArr[i14] = iVar3.h(i13);
                    i13++;
                    i14++;
                }
                while (i12 < iVar4.f24851c) {
                    strArr[i14] = iVar4.h(i12);
                    i12++;
                    i14++;
                }
                List asList = Arrays.asList(strArr);
                parcel2.writeNoException();
                parcel2.writeStringList(asList);
                break;
            case 4:
                String c10 = ((ap) this).f13737b.c();
                parcel2.writeNoException();
                parcel2.writeString(c10);
                break;
            case 5:
                ((ap) this).s6(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                ((ap) this).x();
                parcel2.writeNoException();
                break;
            case 7:
                hz h10 = ((ap) this).f13737b.h();
                parcel2.writeNoException();
                ob0.b(parcel2, h10);
                break;
            case b4.f10106f /*8*/:
                ap apVar2 = (ap) this;
                fn fnVar2 = apVar2.f13739d;
                if (fnVar2 != null) {
                    fnVar2.a();
                }
                apVar2.f13739d = null;
                apVar2.f13738c = null;
                parcel2.writeNoException();
                break;
            case 9:
                b bVar = new b(((ap) this).f13736a);
                parcel2.writeNoException();
                ob0.b(parcel2, bVar);
                break;
            case 10:
                boolean W0 = ((ap) this).W0(a.C0062a.Y(parcel.readStrongBinder()));
                parcel2.writeNoException();
                ClassLoader classLoader = ob0.f15778a;
                parcel2.writeInt(W0 ? 1 : 0);
                break;
            case 11:
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                break;
            case 12:
                ap apVar3 = (ap) this;
                fn fnVar3 = apVar3.f13739d;
                if ((fnVar3 == null || fnVar3.f14656l.a()) && apVar3.f13737b.p() != null && apVar3.f13737b.o() == null) {
                    i12 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = ob0.f15778a;
                parcel2.writeInt(i12);
                break;
            case 13:
                ap apVar4 = (ap) this;
                a q10 = apVar4.f13737b.q();
                if (q10 != null) {
                    l.B.f13205v.d(q10);
                    if (((Boolean) ti0.f16763j.f16769f.a(t.J2)).booleanValue() && apVar4.f13737b.p() != null) {
                        apVar4.f13737b.p().O("onSdkLoaded", new s.a());
                    }
                    i12 = 1;
                } else {
                    e.K("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = ob0.f15778a;
                parcel2.writeInt(i12);
                break;
            case 14:
                ap apVar5 = (ap) this;
                Object z02 = b.z0(a.C0062a.Y(parcel.readStrongBinder()));
                if (!(!(z02 instanceof View) || apVar5.f13737b.q() == null || (fnVar = apVar5.f13739d) == null)) {
                    fnVar.e((View) z02);
                }
                parcel2.writeNoException();
                break;
            case 15:
                ((ap) this).t6();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
