package v7;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.d;
import com.startapp.b4;
import s7.c;
import w7.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class b0 implements Parcelable.Creator {
    public static void a(d dVar, Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = dVar.f5855a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = dVar.f5856b;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        int i13 = dVar.f5857c;
        parcel.writeInt(262147);
        parcel.writeInt(i13);
        j.g(parcel, 4, dVar.f5858d, false);
        j.e(parcel, 5, dVar.f5859e, false);
        j.j(parcel, 6, dVar.f5860f, i10, false);
        j.c(parcel, 7, dVar.f5861g, false);
        j.f(parcel, 8, dVar.f5862h, i10, false);
        j.j(parcel, 10, dVar.f5863i, i10, false);
        j.j(parcel, 11, dVar.f5864r, i10, false);
        boolean z10 = dVar.f5865s;
        parcel.writeInt(262156);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = dVar.f5866t;
        parcel.writeInt(262157);
        parcel.writeInt(i14);
        boolean z11 = dVar.f5867u;
        parcel.writeInt(262158);
        parcel.writeInt(z11 ? 1 : 0);
        j.g(parcel, 15, dVar.f5868v, false);
        j.m(parcel, l10);
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r10 = b.r(parcel);
        Scope[] scopeArr = d.f5853w;
        Bundle bundle = new Bundle();
        c[] cVarArr = d.f5854x;
        c[] cVarArr2 = cVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel2, readInt);
                    break;
                case 2:
                    i11 = b.n(parcel2, readInt);
                    break;
                case 3:
                    i12 = b.n(parcel2, readInt);
                    break;
                case 4:
                    str = b.e(parcel2, readInt);
                    break;
                case 5:
                    iBinder = b.m(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.h(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel2, readInt);
                    break;
                case b4.f10106f:
                    account = (Account) b.d(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    cVarArr = (c[]) b.h(parcel2, readInt, c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (c[]) b.h(parcel2, readInt, c.CREATOR);
                    break;
                case 12:
                    z10 = b.k(parcel2, readInt);
                    break;
                case 13:
                    i13 = b.n(parcel2, readInt);
                    break;
                case 14:
                    z11 = b.k(parcel2, readInt);
                    break;
                case 15:
                    str2 = b.e(parcel2, readInt);
                    break;
                default:
                    b.q(parcel2, readInt);
                    break;
            }
        }
        b.j(parcel2, r10);
        return new d(i10, i11, i12, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z10, i13, z11, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
