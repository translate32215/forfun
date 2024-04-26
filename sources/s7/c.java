package s7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.internal.h;
import java.util.Arrays;
import w7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    public final String f25007a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final int f25008b;

    /* renamed from: c  reason: collision with root package name */
    public final long f25009c;

    public c(String str, int i10, long j10) {
        this.f25007a = str;
        this.f25008b = i10;
        this.f25009c = j10;
    }

    public c(String str, long j10) {
        this.f25007a = str;
        this.f25009c = j10;
        this.f25008b = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f25007a;
            if (((str == null || !str.equals(cVar.f25007a)) && (this.f25007a != null || cVar.f25007a != null)) || i() != cVar.i()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25007a, Long.valueOf(i())});
    }

    public long i() {
        long j10 = this.f25009c;
        return j10 == -1 ? (long) this.f25008b : j10;
    }

    public final String toString() {
        h.a aVar = new h.a(this);
        aVar.a("name", this.f25007a);
        aVar.a("version", Long.valueOf(i()));
        return aVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f25007a, false);
        int i11 = this.f25008b;
        parcel.writeInt(262146);
        parcel.writeInt(i11);
        long i12 = i();
        parcel.writeInt(524291);
        parcel.writeLong(i12);
        j.m(parcel, l10);
    }
}
