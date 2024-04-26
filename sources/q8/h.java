package q8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.api.Status;
import java.util.List;
import w7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class h extends a implements t7.h {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f24222a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24223b;

    public h(List<String> list, String str) {
        this.f24222a = list;
        this.f24223b = str;
    }

    public final Status h() {
        if (this.f24223b != null) {
            return Status.f5740f;
        }
        return Status.f5742h;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.i(parcel, 1, this.f24222a, false);
        j.g(parcel, 2, this.f24223b, false);
        j.m(parcel, l10);
    }
}
