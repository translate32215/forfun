package o8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.e;
import androidx.leanback.widget.s;
import w7.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new s();

    /* renamed from: a  reason: collision with root package name */
    public final String f23414a;

    /* renamed from: b  reason: collision with root package name */
    public final p f23415b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23416c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23417d;

    public r(r rVar, long j10) {
        if (rVar != null) {
            this.f23414a = rVar.f23414a;
            this.f23415b = rVar.f23415b;
            this.f23416c = rVar.f23416c;
            this.f23417d = j10;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final String toString() {
        String str = this.f23416c;
        String str2 = this.f23414a;
        String valueOf = String.valueOf(this.f23415b);
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        s.a(sb2, "origin=", str, ",name=", str2);
        return e.a(sb2, ",params=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        s.a(this, parcel, i10);
    }

    public r(String str, p pVar, String str2, long j10) {
        this.f23414a = str;
        this.f23415b = pVar;
        this.f23416c = str2;
        this.f23417d = j10;
    }
}
