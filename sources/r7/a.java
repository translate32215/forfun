package r7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class a extends w7.a {
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    public Intent f24684a;

    public a(Intent intent) {
        this.f24684a = intent;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.f(parcel, 1, this.f24684a, i10, false);
        j.m(parcel, l10);
    }
}
