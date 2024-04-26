package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import c8.a;
import c8.b;
import com.google.android.gms.ads.internal.ClientApi;
import com.startapp.b4;
import e8.ab0;
import e8.ce;
import e8.et;
import e8.jc0;
import e8.li0;
import e8.mv;
import e8.ob0;
import e8.t;
import e8.ti0;
import e8.xd;
import e8.yd;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class ny extends os implements oy {
    public ny() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        IInterface iInterface;
        switch (i10) {
            case 1:
                dy Y2 = ((ClientApi) this).Y2(a.C0062a.Y(parcel.readStrongBinder()), (li0) ob0.a(parcel, li0.CREATOR), parcel.readString(), v2.s6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                ob0.b(parcel2, Y2);
                return true;
            case 2:
                dy D1 = ((ClientApi) this).D1(a.C0062a.Y(parcel.readStrongBinder()), (li0) ob0.a(parcel, li0.CREATOR), parcel.readString(), v2.s6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                ob0.b(parcel2, D1);
                return true;
            case 3:
                a Y = a.C0062a.Y(parcel.readStrongBinder());
                String readString = parcel.readString();
                s2 s62 = v2.s6(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                Context context = (Context) b.z0(Y);
                mv mvVar = new mv(b8.b(context, s62, readInt), context, readString);
                parcel2.writeNoException();
                ob0.b(parcel2, mvVar);
                return true;
            case 4:
                a.C0062a.Y(parcel.readStrongBinder());
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case 5:
                ga gaVar = new ga((FrameLayout) b.z0(a.C0062a.Y(parcel.readStrongBinder())), (FrameLayout) b.z0(a.C0062a.Y(parcel.readStrongBinder())));
                parcel2.writeNoException();
                ob0.b(parcel2, gaVar);
                return true;
            case 6:
                r5 m52 = ((ClientApi) this).m5(a.C0062a.Y(parcel.readStrongBinder()), v2.s6(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                ob0.b(parcel2, m52);
                return true;
            case 7:
                a.C0062a.Y(parcel.readStrongBinder());
                parcel2.writeNoException();
                ob0.b(parcel2, (IInterface) null);
                return true;
            case b4.f10106f /*8*/:
                r4 L4 = ((ClientApi) this).L4(a.C0062a.Y(parcel.readStrongBinder()));
                parcel2.writeNoException();
                ob0.b(parcel2, L4);
                return true;
            case 9:
                a Y3 = a.C0062a.Y(parcel.readStrongBinder());
                l8 k10 = b8.z((Context) b.z0(Y3), parcel.readInt()).k();
                parcel2.writeNoException();
                ob0.b(parcel2, k10);
                return true;
            case 10:
                dy T0 = ((ClientApi) this).T0(a.C0062a.Y(parcel.readStrongBinder()), (li0) ob0.a(parcel, li0.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                ob0.b(parcel2, T0);
                return true;
            case 11:
                ha haVar = new ha((View) b.z0(a.C0062a.Y(parcel.readStrongBinder())), (HashMap) b.z0(a.C0062a.Y(parcel.readStrongBinder())), (HashMap) b.z0(a.C0062a.Y(parcel.readStrongBinder())));
                parcel2.writeNoException();
                ob0.b(parcel2, haVar);
                return true;
            case 12:
                a Y4 = a.C0062a.Y(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                s2 s63 = v2.s6(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                Context context2 = (Context) b.z0(Y4);
                yd u10 = b8.b(context2, s63, readInt2).u();
                u10.getClass();
                context2.getClass();
                u10.f17605a = context2;
                u10.f17606b = readString2;
                jc0.f(context2, Context.class);
                parcel2.writeNoException();
                ob0.b(parcel2, (me) ((ab0) new ce(u10.f17607c, u10.f17605a, u10.f17606b).f14122c).get());
                return true;
            case 13:
                a Y5 = a.C0062a.Y(parcel.readStrongBinder());
                li0 li0 = (li0) ob0.a(parcel, li0.CREATOR);
                String readString3 = parcel.readString();
                s2 s64 = v2.s6(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                Context context3 = (Context) b.z0(Y5);
                yd p10 = b8.b(context3, s64, readInt3).p();
                p10.getClass();
                readString3.getClass();
                p10.f17606b = readString3;
                context3.getClass();
                p10.f17605a = context3;
                jc0.f(context3, Context.class);
                jc0.f(p10.f17606b, String.class);
                xd xdVar = new xd(p10.f17607c, p10.f17605a, p10.f17606b);
                if (readInt3 >= ((Integer) ti0.f16763j.f16769f.a(t.L2)).intValue()) {
                    iInterface = (wd) xdVar.f17479i.get();
                } else {
                    iInterface = (ud) xdVar.f17476f.get();
                }
                parcel2.writeNoException();
                ob0.b(parcel2, iInterface);
                return true;
            case 14:
                a Y6 = a.C0062a.Y(parcel.readStrongBinder());
                ld w10 = b8.b((Context) b.z0(Y6), v2.s6(parcel.readStrongBinder()), parcel.readInt()).w();
                parcel2.writeNoException();
                ob0.b(parcel2, w10);
                return true;
            case 15:
                a Y7 = a.C0062a.Y(parcel.readStrongBinder());
                et x10 = b8.b((Context) b.z0(Y7), v2.s6(parcel.readStrongBinder()), parcel.readInt()).x();
                parcel2.writeNoException();
                ob0.b(parcel2, x10);
                return true;
            default:
                return false;
        }
    }
}
