package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i;
import w7.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class w5 extends a {
    public static final Parcelable.Creator<w5> CREATOR = new x5();

    /* renamed from: a  reason: collision with root package name */
    public final int f23561a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23562b;

    /* renamed from: c  reason: collision with root package name */
    public final long f23563c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f23564d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23565e;

    /* renamed from: f  reason: collision with root package name */
    public final String f23566f;

    /* renamed from: g  reason: collision with root package name */
    public final Double f23567g;

    public w5(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f23561a = i10;
        this.f23562b = str;
        this.f23563c = j10;
        this.f23564d = l10;
        if (i10 == 1) {
            this.f23567g = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f23567g = d10;
        }
        this.f23565e = str2;
        this.f23566f = str3;
    }

    public final Object i() {
        Long l10 = this.f23564d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f23567g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f23565e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        x5.a(this, parcel, i10);
    }

    public w5(y5 y5Var) {
        this(y5Var.f23624c, y5Var.f23625d, y5Var.f23626e, y5Var.f23623b);
    }

    public w5(String str, long j10, Object obj, String str2) {
        i.e(str);
        this.f23561a = 2;
        this.f23562b = str;
        this.f23563c = j10;
        this.f23566f = str2;
        if (obj == null) {
            this.f23564d = null;
            this.f23567g = null;
            this.f23565e = null;
        } else if (obj instanceof Long) {
            this.f23564d = (Long) obj;
            this.f23567g = null;
            this.f23565e = null;
        } else if (obj instanceof String) {
            this.f23564d = null;
            this.f23567g = null;
            this.f23565e = (String) obj;
        } else if (obj instanceof Double) {
            this.f23564d = null;
            this.f23567g = (Double) obj;
            this.f23565e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
