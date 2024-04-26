package e8;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.wt;
import j4.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l0.d;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class bc0 implements Parcelable {
    public static final Parcelable.Creator<bc0> CREATOR = new ac0();
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final long E;
    public final int F;
    public final String G;
    public final int H;
    public int I;

    /* renamed from: a  reason: collision with root package name */
    public final String f13915a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13916b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13917c;

    /* renamed from: d  reason: collision with root package name */
    public final wt f13918d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13919e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13920f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13921g;

    /* renamed from: h  reason: collision with root package name */
    public final List<byte[]> f13922h;

    /* renamed from: i  reason: collision with root package name */
    public final et f13923i;

    /* renamed from: r  reason: collision with root package name */
    public final int f13924r;

    /* renamed from: s  reason: collision with root package name */
    public final int f13925s;

    /* renamed from: t  reason: collision with root package name */
    public final float f13926t;

    /* renamed from: u  reason: collision with root package name */
    public final int f13927u;

    /* renamed from: v  reason: collision with root package name */
    public final float f13928v;

    /* renamed from: w  reason: collision with root package name */
    public final int f13929w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f13930x;

    /* renamed from: y  reason: collision with root package name */
    public final hg0 f13931y;

    /* renamed from: z  reason: collision with root package name */
    public final int f13932z;

    public bc0(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, hg0 hg0, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List<byte[]> list, et etVar, wt wtVar) {
        this.f13915a = str;
        this.f13919e = str2;
        this.f13920f = str3;
        this.f13917c = str4;
        this.f13916b = i10;
        this.f13921g = i11;
        this.f13924r = i12;
        this.f13925s = i13;
        this.f13926t = f10;
        this.f13927u = i14;
        this.f13928v = f11;
        this.f13930x = bArr;
        this.f13929w = i15;
        this.f13931y = hg0;
        this.f13932z = i16;
        this.A = i17;
        this.B = i18;
        this.C = i19;
        this.D = i20;
        this.F = i21;
        this.G = str5;
        this.H = i22;
        this.E = j10;
        this.f13922h = list == null ? Collections.emptyList() : list;
        this.f13923i = etVar;
        this.f13918d = wtVar;
    }

    public static bc0 a(String str, String str2, int i10, int i11, int i12, int i13, List list, et etVar, int i14, String str3) {
        return new bc0(str, (String) null, str2, (String) null, -1, i10, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (hg0) null, i11, i12, i13, -1, -1, i14, str3, -1, Long.MAX_VALUE, list, etVar, (wt) null);
    }

    public static bc0 b(String str, String str2, int i10, int i11, int i12, List list, int i13, float f10, byte[] bArr, int i14, hg0 hg0, et etVar) {
        return new bc0(str, (String) null, str2, (String) null, -1, i10, i11, i12, -1.0f, i13, f10, bArr, i14, hg0, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, etVar, (wt) null);
    }

    public static bc0 d(String str, String str2, int i10, int i11, et etVar, String str3) {
        return a(str, str2, -1, i10, i11, -1, (List) null, etVar, 0, str3);
    }

    public static bc0 e(String str, String str2, int i10, String str3, et etVar) {
        return g(str, str2, i10, str3, etVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static bc0 g(String str, String str2, int i10, String str3, et etVar, long j10, List list) {
        return new bc0(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (hg0) null, -1, -1, -1, -1, -1, i10, str3, -1, j10, list, etVar, (wt) null);
    }

    @TargetApi(16)
    public static void h(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bc0.class == obj.getClass()) {
            bc0 bc0 = (bc0) obj;
            if (this.f13916b == bc0.f13916b && this.f13921g == bc0.f13921g && this.f13924r == bc0.f13924r && this.f13925s == bc0.f13925s && this.f13926t == bc0.f13926t && this.f13927u == bc0.f13927u && this.f13928v == bc0.f13928v && this.f13929w == bc0.f13929w && this.f13932z == bc0.f13932z && this.A == bc0.A && this.B == bc0.B && this.C == bc0.C && this.D == bc0.D && this.E == bc0.E && this.F == bc0.F && eg0.d(this.f13915a, bc0.f13915a) && eg0.d(this.G, bc0.G) && this.H == bc0.H && eg0.d(this.f13919e, bc0.f13919e) && eg0.d(this.f13920f, bc0.f13920f) && eg0.d(this.f13917c, bc0.f13917c) && eg0.d(this.f13923i, bc0.f13923i) && eg0.d(this.f13918d, bc0.f13918d) && eg0.d(this.f13931y, bc0.f13931y) && Arrays.equals(this.f13930x, bc0.f13930x) && this.f13922h.size() == bc0.f13922h.size()) {
                for (int i10 = 0; i10 < this.f13922h.size(); i10++) {
                    if (!Arrays.equals(this.f13922h.get(i10), bc0.f13922h.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.I == 0) {
            String str = this.f13915a;
            int i10 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f13919e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f13920f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f13917c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f13916b) * 31) + this.f13924r) * 31) + this.f13925s) * 31) + this.f13932z) * 31) + this.A) * 31;
            String str5 = this.G;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.H) * 31;
            et etVar = this.f13923i;
            int hashCode6 = (hashCode5 + (etVar == null ? 0 : etVar.hashCode())) * 31;
            wt wtVar = this.f13918d;
            if (wtVar != null) {
                i10 = wtVar.hashCode();
            }
            this.I = hashCode6 + i10;
        }
        return this.I;
    }

    public final bc0 i(long j10) {
        return new bc0(this.f13915a, this.f13919e, this.f13920f, this.f13917c, this.f13916b, this.f13921g, this.f13924r, this.f13925s, this.f13926t, this.f13927u, this.f13928v, this.f13930x, this.f13929w, this.f13931y, this.f13932z, this.A, this.B, this.C, this.D, this.F, this.G, this.H, j10, this.f13922h, this.f13923i, this.f13918d);
    }

    public final int j() {
        int i10;
        int i11 = this.f13924r;
        if (i11 == -1 || (i10 = this.f13925s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat k() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f13920f);
        String str = this.G;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        h(mediaFormat, "max-input-size", this.f13921g);
        h(mediaFormat, "width", this.f13924r);
        h(mediaFormat, "height", this.f13925s);
        float f10 = this.f13926t;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        h(mediaFormat, "rotation-degrees", this.f13927u);
        h(mediaFormat, "channel-count", this.f13932z);
        h(mediaFormat, "sample-rate", this.A);
        h(mediaFormat, "encoder-delay", this.C);
        h(mediaFormat, "encoder-padding", this.D);
        for (int i10 = 0; i10 < this.f13922h.size(); i10++) {
            mediaFormat.setByteBuffer(d.a(15, "csd-", i10), ByteBuffer.wrap(this.f13922h.get(i10)));
        }
        hg0 hg0 = this.f13931y;
        if (hg0 != null) {
            h(mediaFormat, "color-transfer", hg0.f14912c);
            h(mediaFormat, "color-standard", hg0.f14910a);
            h(mediaFormat, "color-range", hg0.f14911b);
            byte[] bArr = hg0.f14913d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.f13915a;
        String str2 = this.f13919e;
        String str3 = this.f13920f;
        int i10 = this.f13916b;
        String str4 = this.G;
        int i11 = this.f13924r;
        int i12 = this.f13925s;
        float f10 = this.f13926t;
        int i13 = this.f13932z;
        int i14 = this.A;
        StringBuilder a10 = e.a(o.a(str4, o.a(str3, o.a(str2, o.a(str, 100)))), "Format(", str, ", ", str2);
        a10.append(", ");
        a10.append(str3);
        a10.append(", ");
        a10.append(i10);
        a10.append(", ");
        a10.append(str4);
        a10.append(", [");
        a10.append(i11);
        a10.append(", ");
        a10.append(i12);
        a10.append(", ");
        a10.append(f10);
        a10.append("], [");
        a10.append(i13);
        a10.append(", ");
        a10.append(i14);
        a10.append("])");
        return a10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13915a);
        parcel.writeString(this.f13919e);
        parcel.writeString(this.f13920f);
        parcel.writeString(this.f13917c);
        parcel.writeInt(this.f13916b);
        parcel.writeInt(this.f13921g);
        parcel.writeInt(this.f13924r);
        parcel.writeInt(this.f13925s);
        parcel.writeFloat(this.f13926t);
        parcel.writeInt(this.f13927u);
        parcel.writeFloat(this.f13928v);
        parcel.writeInt(this.f13930x != null ? 1 : 0);
        byte[] bArr = this.f13930x;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f13929w);
        parcel.writeParcelable(this.f13931y, i10);
        parcel.writeInt(this.f13932z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.F);
        parcel.writeString(this.G);
        parcel.writeInt(this.H);
        parcel.writeLong(this.E);
        int size = this.f13922h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.f13922h.get(i11));
        }
        parcel.writeParcelable(this.f13923i, 0);
        parcel.writeParcelable(this.f13918d, 0);
    }

    public bc0(Parcel parcel) {
        this.f13915a = parcel.readString();
        this.f13919e = parcel.readString();
        this.f13920f = parcel.readString();
        this.f13917c = parcel.readString();
        this.f13916b = parcel.readInt();
        this.f13921g = parcel.readInt();
        this.f13924r = parcel.readInt();
        this.f13925s = parcel.readInt();
        this.f13926t = parcel.readFloat();
        this.f13927u = parcel.readInt();
        this.f13928v = parcel.readFloat();
        this.f13930x = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f13929w = parcel.readInt();
        this.f13931y = (hg0) parcel.readParcelable(hg0.class.getClassLoader());
        this.f13932z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readString();
        this.H = parcel.readInt();
        this.E = parcel.readLong();
        int readInt = parcel.readInt();
        this.f13922h = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f13922h.add(parcel.createByteArray());
        }
        this.f13923i = (et) parcel.readParcelable(et.class.getClassLoader());
        this.f13918d = (wt) parcel.readParcelable(wt.class.getClassLoader());
    }
}
