package p7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.startapp.b4;
import java.util.ArrayList;
import w7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = b.n(parcel2, readInt);
                    break;
                case 2:
                    str = b.e(parcel2, readInt);
                    break;
                case 3:
                    str2 = b.e(parcel2, readInt);
                    break;
                case 4:
                    str3 = b.e(parcel2, readInt);
                    break;
                case 5:
                    str4 = b.e(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) b.d(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.e(parcel2, readInt);
                    break;
                case b4.f10106f:
                    j10 = b.o(parcel2, readInt);
                    break;
                case 9:
                    str6 = b.e(parcel2, readInt);
                    break;
                case 10:
                    arrayList = b.i(parcel2, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.e(parcel2, readInt);
                    break;
                case 12:
                    str8 = b.e(parcel2, readInt);
                    break;
                default:
                    b.q(parcel2, readInt);
                    break;
            }
        }
        b.j(parcel2, r10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
