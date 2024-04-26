package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.i;
import f7.f0;
import f7.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import k8.g0;
import k8.h0;
import o8.a4;
import o8.b;
import o8.b4;
import o8.b6;
import o8.r;
import o8.w5;
import o8.y5;
import o8.z3;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public abstract class c extends g0 implements d {
    public c() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean m(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        ArrayList arrayList;
        boolean z10 = false;
        switch (i10) {
            case 1:
                r rVar = (r) h0.a(parcel, r.CREATOR);
                b6 b6Var = (b6) h0.a(parcel, b6.CREATOR);
                b4 b4Var = (b4) this;
                if (rVar != null) {
                    b4Var.E1(b6Var);
                    b4Var.z0(new f0(b4Var, rVar, b6Var));
                    parcel2.writeNoException();
                    break;
                } else {
                    throw new NullPointerException("null reference");
                }
            case 2:
                w5 w5Var = (w5) h0.a(parcel, w5.CREATOR);
                b6 b6Var2 = (b6) h0.a(parcel, b6.CREATOR);
                b4 b4Var2 = (b4) this;
                if (w5Var != null) {
                    b4Var2.E1(b6Var2);
                    b4Var2.z0(new f0(b4Var2, w5Var, b6Var2));
                    parcel2.writeNoException();
                    break;
                } else {
                    throw new NullPointerException("null reference");
                }
            case 4:
                b6 b6Var3 = (b6) h0.a(parcel, b6.CREATOR);
                b4 b4Var3 = (b4) this;
                b4Var3.E1(b6Var3);
                b4Var3.z0(new z3(b4Var3, b6Var3, 1));
                parcel2.writeNoException();
                break;
            case 5:
                r rVar2 = (r) h0.a(parcel, r.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                b4 b4Var4 = (b4) this;
                if (rVar2 != null) {
                    i.e(readString);
                    b4Var4.Y(readString, true);
                    b4Var4.z0(new f0(b4Var4, rVar2, readString));
                    parcel2.writeNoException();
                    break;
                } else {
                    throw new NullPointerException("null reference");
                }
            case 6:
                b6 b6Var4 = (b6) h0.a(parcel, b6.CREATOR);
                b4 b4Var5 = (b4) this;
                b4Var5.E1(b6Var4);
                b4Var5.z0(new z3(b4Var5, b6Var4, 0));
                parcel2.writeNoException();
                break;
            case 7:
                b6 b6Var5 = (b6) h0.a(parcel, b6.CREATOR);
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                b4 b4Var6 = (b4) this;
                b4Var6.E1(b6Var5);
                String str = b6Var5.f23131a;
                i.h(str);
                try {
                    List<y5> list = (List) ((FutureTask) b4Var6.f23124a.b().p(new a4(b4Var6, str))).get();
                    arrayList = new ArrayList(list.size());
                    for (y5 y5Var : list) {
                        if (z10 || !r.U(y5Var.f23624c)) {
                            arrayList.add(new w5(y5Var));
                        }
                    }
                } catch (InterruptedException | ExecutionException e10) {
                    b4Var6.f23124a.d().f8797f.c("Failed to get user properties. appId", h.t(b6Var5.f23131a), e10);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                byte[] h52 = ((b4) this).h5((r) h0.a(parcel, r.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(h52);
                break;
            case 10:
                ((b4) this).Y0(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String D0 = ((b4) this).D0((b6) h0.a(parcel, b6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(D0);
                break;
            case 12:
                ((b4) this).N0((b) h0.a(parcel, b.CREATOR), (b6) h0.a(parcel, b6.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                b bVar = (b) h0.a(parcel, b.CREATOR);
                b4 b4Var7 = (b4) this;
                if (bVar != null) {
                    i.h(bVar.f23111c);
                    i.e(bVar.f23109a);
                    b4Var7.Y(bVar.f23109a, true);
                    b4Var7.z0(new j0(b4Var7, new b(bVar)));
                    parcel2.writeNoException();
                    break;
                } else {
                    throw new NullPointerException("null reference");
                }
            case 14:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                ClassLoader classLoader = h0.f20231a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                List<w5> R0 = ((b4) this).R0(readString2, readString3, z10, (b6) h0.a(parcel, b6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(R0);
                break;
            case 15:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                ClassLoader classLoader2 = h0.f20231a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                List<w5> S1 = ((b4) this).S1(readString4, readString5, readString6, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(S1);
                break;
            case 16:
                List<b> k52 = ((b4) this).k5(parcel.readString(), parcel.readString(), (b6) h0.a(parcel, b6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(k52);
                break;
            case 17:
                List<b> E3 = ((b4) this).E3(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(E3);
                break;
            case 18:
                b6 b6Var6 = (b6) h0.a(parcel, b6.CREATOR);
                b4 b4Var8 = (b4) this;
                i.e(b6Var6.f23131a);
                b4Var8.Y(b6Var6.f23131a, false);
                b4Var8.z0(new e7.i(b4Var8, b6Var6));
                parcel2.writeNoException();
                break;
            case 19:
                b6 b6Var7 = (b6) h0.a(parcel, b6.CREATOR);
                b4 b4Var9 = (b4) this;
                b4Var9.E1(b6Var7);
                String str2 = b6Var7.f23131a;
                i.h(str2);
                b4Var9.z0(new f0(b4Var9, str2, (Bundle) h0.a(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                break;
            case 20:
                ((b4) this).D3((b6) h0.a(parcel, b6.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
