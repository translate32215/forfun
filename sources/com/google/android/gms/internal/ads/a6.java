package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.internal.h;
import e8.y7;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class a6 extends a {
    public static final Parcelable.Creator<a6> CREATOR = new y7();

    /* renamed from: a  reason: collision with root package name */
    public final String f5941a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5942b;

    public a6(String str, int i10) {
        this.f5941a = str;
        this.f5942b = i10;
    }

    public static a6 i(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new a6(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof a6)) {
            a6 a6Var = (a6) obj;
            if (!h.a(this.f5941a, a6Var.f5941a) || !h.a(Integer.valueOf(this.f5942b), Integer.valueOf(a6Var.f5942b))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5941a, Integer.valueOf(this.f5942b)});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 2, this.f5941a, false);
        int i11 = this.f5942b;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        j.m(parcel, l10);
    }
}
