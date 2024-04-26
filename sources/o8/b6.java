package o8;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.j;
import com.google.android.gms.common.internal.i;
import java.util.List;
import w7.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class b6 extends a {
    public static final Parcelable.Creator<b6> CREATOR = new c6();
    public final long A;
    public final List<String> B;
    public final String C;
    public final String D;

    /* renamed from: a  reason: collision with root package name */
    public final String f23131a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23132b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23133c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23134d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23135e;

    /* renamed from: f  reason: collision with root package name */
    public final long f23136f;

    /* renamed from: g  reason: collision with root package name */
    public final String f23137g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23138h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f23139i;

    /* renamed from: r  reason: collision with root package name */
    public final long f23140r;

    /* renamed from: s  reason: collision with root package name */
    public final String f23141s;

    /* renamed from: t  reason: collision with root package name */
    public final long f23142t;

    /* renamed from: u  reason: collision with root package name */
    public final long f23143u;

    /* renamed from: v  reason: collision with root package name */
    public final int f23144v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f23145w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f23146x;

    /* renamed from: y  reason: collision with root package name */
    public final String f23147y;

    /* renamed from: z  reason: collision with root package name */
    public final Boolean f23148z;

    public b6(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9) {
        i.e(str);
        this.f23131a = str;
        this.f23132b = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f23133c = str3;
        this.f23140r = j10;
        this.f23134d = str4;
        this.f23135e = j11;
        this.f23136f = j12;
        this.f23137g = str5;
        this.f23138h = z10;
        this.f23139i = z11;
        this.f23141s = str6;
        this.f23142t = j13;
        this.f23143u = j14;
        this.f23144v = i10;
        this.f23145w = z12;
        this.f23146x = z13;
        this.f23147y = str7;
        this.f23148z = bool;
        this.A = j15;
        this.B = list;
        this.C = str8;
        this.D = str9;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 2, this.f23131a, false);
        j.g(parcel, 3, this.f23132b, false);
        j.g(parcel, 4, this.f23133c, false);
        j.g(parcel, 5, this.f23134d, false);
        long j10 = this.f23135e;
        parcel.writeInt(524294);
        parcel.writeLong(j10);
        long j11 = this.f23136f;
        parcel.writeInt(524295);
        parcel.writeLong(j11);
        j.g(parcel, 8, this.f23137g, false);
        boolean z10 = this.f23138h;
        parcel.writeInt(262153);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f23139i;
        parcel.writeInt(262154);
        parcel.writeInt(z11 ? 1 : 0);
        long j12 = this.f23140r;
        parcel.writeInt(524299);
        parcel.writeLong(j12);
        j.g(parcel, 12, this.f23141s, false);
        long j13 = this.f23142t;
        parcel.writeInt(524301);
        parcel.writeLong(j13);
        long j14 = this.f23143u;
        parcel.writeInt(524302);
        parcel.writeLong(j14);
        int i11 = this.f23144v;
        parcel.writeInt(262159);
        parcel.writeInt(i11);
        boolean z12 = this.f23145w;
        parcel.writeInt(262160);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.f23146x;
        parcel.writeInt(262162);
        parcel.writeInt(z13 ? 1 : 0);
        j.g(parcel, 19, this.f23147y, false);
        Boolean bool = this.f23148z;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        long j15 = this.A;
        parcel.writeInt(524310);
        parcel.writeLong(j15);
        j.i(parcel, 23, this.B, false);
        j.g(parcel, 24, this.C, false);
        j.g(parcel, 25, this.D, false);
        j.m(parcel, l10);
    }

    public b6(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, List<String> list, String str8, String str9) {
        this.f23131a = str;
        this.f23132b = str2;
        this.f23133c = str3;
        this.f23140r = j12;
        this.f23134d = str4;
        this.f23135e = j10;
        this.f23136f = j11;
        this.f23137g = str5;
        this.f23138h = z10;
        this.f23139i = z11;
        this.f23141s = str6;
        this.f23142t = j13;
        this.f23143u = j14;
        this.f23144v = i10;
        this.f23145w = z12;
        this.f23146x = z13;
        this.f23147y = str7;
        this.f23148z = bool;
        this.A = j15;
        this.B = list;
        this.C = str8;
        this.D = str9;
    }
}
