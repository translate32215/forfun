package q8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.api.Status;
import t7.h;
import w7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class b extends a implements h {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f24219a;

    /* renamed from: b  reason: collision with root package name */
    public int f24220b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f24221c;

    public b() {
        this.f24219a = 2;
        this.f24220b = 0;
        this.f24221c = null;
    }

    public final Status h() {
        if (this.f24220b == 0) {
            return Status.f5740f;
        }
        return Status.f5742h;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f24219a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f24220b;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        j.f(parcel, 3, this.f24221c, i10, false);
        j.m(parcel, l10);
    }

    public b(int i10, int i11, Intent intent) {
        this.f24219a = i10;
        this.f24220b = i11;
        this.f24221c = intent;
    }
}
