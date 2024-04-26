package v7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import w7.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class r implements Parcelable.Creator<q> {
    public final Object createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                account = (Account) b.d(parcel, readInt, Account.CREATOR);
            } else if (c10 == 3) {
                i11 = b.n(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.d(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new q(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new q[i10];
    }
}
