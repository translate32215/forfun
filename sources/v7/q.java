package v7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import w7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class q extends a {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* renamed from: a  reason: collision with root package name */
    public final int f26592a;

    /* renamed from: b  reason: collision with root package name */
    public final Account f26593b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26594c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleSignInAccount f26595d;

    public q(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f26592a = i10;
        this.f26593b = account;
        this.f26594c = i11;
        this.f26595d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f26592a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.f(parcel, 2, this.f26593b, i10, false);
        int i12 = this.f26594c;
        parcel.writeInt(262147);
        parcel.writeInt(i12);
        j.f(parcel, 4, this.f26595d, i10, false);
        j.m(parcel, l10);
    }

    public q(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f26592a = 2;
        this.f26593b = account;
        this.f26594c = i10;
        this.f26595d = googleSignInAccount;
    }
}
