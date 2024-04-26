package o8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import java.util.Iterator;
import w7.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class p extends a implements Iterable<String> {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f23382a;

    public p(Bundle bundle) {
        this.f23382a = bundle;
    }

    public final Bundle i() {
        return new Bundle(this.f23382a);
    }

    public final Iterator<String> iterator() {
        return new o(this);
    }

    public final Double j() {
        return Double.valueOf(this.f23382a.getDouble("value"));
    }

    public final Long q() {
        return Long.valueOf(this.f23382a.getLong("value"));
    }

    public final Object s(String str) {
        return this.f23382a.get(str);
    }

    public final String toString() {
        return this.f23382a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.c(parcel, 2, i(), false);
        j.m(parcel, l10);
    }

    public final String x(String str) {
        return this.f23382a.getString(str);
    }
}
