package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i;
import t7.k;
import w7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    public final int f5738a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5739b;

    public Scope(int i10, String str) {
        i.f(str, "scopeUri must not be null or empty");
        this.f5738a = i10;
        this.f5739b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5739b.equals(((Scope) obj).f5739b);
    }

    public int hashCode() {
        return this.f5739b.hashCode();
    }

    public String toString() {
        return this.f5739b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f5738a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.g(parcel, 2, this.f5739b, false);
        j.m(parcel, l10);
    }

    public Scope(String str) {
        i.f(str, "scopeUri must not be null or empty");
        this.f5738a = 1;
        this.f5739b = str;
    }
}
