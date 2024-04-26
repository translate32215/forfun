package x4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.a0;
import c5.f;
import c5.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import v.e;
import v6.e0;
import v6.s;

/* compiled from: Format */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new a();
    public final float A;
    public final int B;
    public final float C;
    public final byte[] D;
    public final int E;
    public final w6.b F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final Class<? extends p> M;
    public int N;

    /* renamed from: a  reason: collision with root package name */
    public final String f27397a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27398b;

    /* renamed from: c  reason: collision with root package name */
    public final String f27399c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27400d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27401e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27402f;

    /* renamed from: g  reason: collision with root package name */
    public final int f27403g;

    /* renamed from: h  reason: collision with root package name */
    public final int f27404h;

    /* renamed from: i  reason: collision with root package name */
    public final String f27405i;

    /* renamed from: r  reason: collision with root package name */
    public final q5.a f27406r;

    /* renamed from: s  reason: collision with root package name */
    public final String f27407s;

    /* renamed from: t  reason: collision with root package name */
    public final String f27408t;

    /* renamed from: u  reason: collision with root package name */
    public final int f27409u;

    /* renamed from: v  reason: collision with root package name */
    public final List<byte[]> f27410v;

    /* renamed from: w  reason: collision with root package name */
    public final f f27411w;

    /* renamed from: x  reason: collision with root package name */
    public final long f27412x;

    /* renamed from: y  reason: collision with root package name */
    public final int f27413y;

    /* renamed from: z  reason: collision with root package name */
    public final int f27414z;

    /* compiled from: Format */
    public class a implements Parcelable.Creator<b0> {
        public Object createFromParcel(Parcel parcel) {
            return new b0(parcel);
        }

        public Object[] newArray(int i10) {
            return new b0[i10];
        }
    }

    public b0(b bVar, a aVar) {
        this.f27397a = bVar.f27415a;
        this.f27398b = bVar.f27416b;
        this.f27399c = e0.K(bVar.f27417c);
        this.f27400d = bVar.f27418d;
        this.f27401e = bVar.f27419e;
        int i10 = bVar.f27420f;
        this.f27402f = i10;
        int i11 = bVar.f27421g;
        this.f27403g = i11;
        this.f27404h = i11 != -1 ? i11 : i10;
        this.f27405i = bVar.f27422h;
        this.f27406r = bVar.f27423i;
        this.f27407s = bVar.f27424j;
        this.f27408t = bVar.f27425k;
        this.f27409u = bVar.f27426l;
        List<byte[]> list = bVar.f27427m;
        this.f27410v = list == null ? Collections.emptyList() : list;
        f fVar = bVar.f27428n;
        this.f27411w = fVar;
        this.f27412x = bVar.f27429o;
        this.f27413y = bVar.f27430p;
        this.f27414z = bVar.f27431q;
        this.A = bVar.f27432r;
        int i12 = bVar.f27433s;
        int i13 = 0;
        this.B = i12 == -1 ? 0 : i12;
        float f10 = bVar.f27434t;
        this.C = f10 == -1.0f ? 1.0f : f10;
        this.D = bVar.f27435u;
        this.E = bVar.f27436v;
        this.F = bVar.f27437w;
        this.G = bVar.f27438x;
        this.H = bVar.f27439y;
        this.I = bVar.f27440z;
        int i14 = bVar.A;
        this.J = i14 == -1 ? 0 : i14;
        int i15 = bVar.B;
        this.K = i15 != -1 ? i15 : i13;
        this.L = bVar.C;
        Class<? extends p> cls = bVar.D;
        if (cls != null || fVar == null) {
            this.M = cls;
        } else {
            this.M = a0.class;
        }
    }

    public static String e(b0 b0Var) {
        if (b0Var == null) {
            return "null";
        }
        StringBuilder a10 = android.support.v4.media.a.a("id=");
        a10.append(b0Var.f27397a);
        a10.append(", mimeType=");
        a10.append(b0Var.f27408t);
        if (b0Var.f27404h != -1) {
            a10.append(", bitrate=");
            a10.append(b0Var.f27404h);
        }
        if (b0Var.f27405i != null) {
            a10.append(", codecs=");
            a10.append(b0Var.f27405i);
        }
        if (!(b0Var.f27413y == -1 || b0Var.f27414z == -1)) {
            a10.append(", res=");
            a10.append(b0Var.f27413y);
            a10.append("x");
            a10.append(b0Var.f27414z);
        }
        if (b0Var.A != -1.0f) {
            a10.append(", fps=");
            a10.append(b0Var.A);
        }
        if (b0Var.G != -1) {
            a10.append(", channels=");
            a10.append(b0Var.G);
        }
        if (b0Var.H != -1) {
            a10.append(", sample_rate=");
            a10.append(b0Var.H);
        }
        if (b0Var.f27399c != null) {
            a10.append(", language=");
            a10.append(b0Var.f27399c);
        }
        if (b0Var.f27398b != null) {
            a10.append(", label=");
            a10.append(b0Var.f27398b);
        }
        return a10.toString();
    }

    public b a() {
        return new b(this, (a) null);
    }

    public b0 b(Class<? extends p> cls) {
        b a10 = a();
        a10.D = cls;
        return a10.a();
    }

    public boolean d(b0 b0Var) {
        if (this.f27410v.size() != b0Var.f27410v.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f27410v.size(); i10++) {
            if (!Arrays.equals(this.f27410v.get(i10), b0Var.f27410v.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        int i11 = this.N;
        if ((i11 == 0 || (i10 = b0Var.N) == 0 || i11 == i10) && this.f27400d == b0Var.f27400d && this.f27401e == b0Var.f27401e && this.f27402f == b0Var.f27402f && this.f27403g == b0Var.f27403g && this.f27409u == b0Var.f27409u && this.f27412x == b0Var.f27412x && this.f27413y == b0Var.f27413y && this.f27414z == b0Var.f27414z && this.B == b0Var.B && this.E == b0Var.E && this.G == b0Var.G && this.H == b0Var.H && this.I == b0Var.I && this.J == b0Var.J && this.K == b0Var.K && this.L == b0Var.L && Float.compare(this.A, b0Var.A) == 0 && Float.compare(this.C, b0Var.C) == 0 && e0.a(this.M, b0Var.M) && e0.a(this.f27397a, b0Var.f27397a) && e0.a(this.f27398b, b0Var.f27398b) && e0.a(this.f27405i, b0Var.f27405i) && e0.a(this.f27407s, b0Var.f27407s) && e0.a(this.f27408t, b0Var.f27408t) && e0.a(this.f27399c, b0Var.f27399c) && Arrays.equals(this.D, b0Var.D) && e0.a(this.f27406r, b0Var.f27406r) && e0.a(this.F, b0Var.F) && e0.a(this.f27411w, b0Var.f27411w) && d(b0Var)) {
            return true;
        }
        return false;
    }

    public b0 g(b0 b0Var) {
        q5.a aVar;
        String str;
        f fVar;
        int i10;
        String str2;
        f.b[] bVarArr;
        boolean z10;
        String str3;
        b0 b0Var2 = b0Var;
        if (this == b0Var2) {
            return this;
        }
        int i11 = s.i(this.f27408t);
        String str4 = b0Var2.f27397a;
        String str5 = b0Var2.f27398b;
        if (str5 == null) {
            str5 = this.f27398b;
        }
        String str6 = this.f27399c;
        if ((i11 == 3 || i11 == 1) && (str3 = b0Var2.f27399c) != null) {
            str6 = str3;
        }
        int i12 = this.f27402f;
        if (i12 == -1) {
            i12 = b0Var2.f27402f;
        }
        int i13 = this.f27403g;
        if (i13 == -1) {
            i13 = b0Var2.f27403g;
        }
        String str7 = this.f27405i;
        if (str7 == null) {
            String s10 = e0.s(b0Var2.f27405i, i11);
            if (e0.T(s10).length == 1) {
                str7 = s10;
            }
        }
        q5.a aVar2 = this.f27406r;
        if (aVar2 == null) {
            aVar = b0Var2.f27406r;
        } else {
            aVar = aVar2.b(b0Var2.f27406r);
        }
        float f10 = this.A;
        if (f10 == -1.0f && i11 == 2) {
            f10 = b0Var2.A;
        }
        int i14 = this.f27400d | b0Var2.f27400d;
        int i15 = this.f27401e | b0Var2.f27401e;
        f fVar2 = b0Var2.f27411w;
        f fVar3 = this.f27411w;
        ArrayList arrayList = new ArrayList();
        if (fVar2 != null) {
            str = fVar2.f4317c;
            f.b[] bVarArr2 = fVar2.f4315a;
            int length = bVarArr2.length;
            int i16 = 0;
            while (i16 < length) {
                int i17 = length;
                f.b bVar = bVarArr2[i16];
                if (bVar.a()) {
                    arrayList.add(bVar);
                }
                i16++;
                length = i17;
            }
        } else {
            str = null;
        }
        if (fVar3 != null) {
            if (str == null) {
                str = fVar3.f4317c;
            }
            int size = arrayList.size();
            f.b[] bVarArr3 = fVar3.f4315a;
            int length2 = bVarArr3.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = length2;
                f.b bVar2 = bVarArr3[i18];
                if (bVar2.a()) {
                    bVarArr = bVarArr3;
                    UUID uuid = bVar2.f4320b;
                    str2 = str;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            i10 = size;
                            z10 = false;
                            break;
                        }
                        i10 = size;
                        if (((f.b) arrayList.get(i20)).f4320b.equals(uuid)) {
                            z10 = true;
                            break;
                        }
                        i20++;
                        size = i10;
                    }
                    if (!z10) {
                        arrayList.add(bVar2);
                    }
                } else {
                    i10 = size;
                    bVarArr = bVarArr3;
                    str2 = str;
                }
                i18++;
                length2 = i19;
                bVarArr3 = bVarArr;
                str = str2;
                size = i10;
            }
            String str8 = str;
        }
        if (arrayList.isEmpty()) {
            fVar = null;
        } else {
            fVar = new f(str, false, (f.b[]) arrayList.toArray(new f.b[0]));
        }
        b a10 = a();
        a10.f27415a = str4;
        a10.f27416b = str5;
        a10.f27417c = str6;
        a10.f27418d = i14;
        a10.f27419e = i15;
        a10.f27420f = i12;
        a10.f27421g = i13;
        a10.f27422h = str7;
        a10.f27423i = aVar;
        a10.f27428n = fVar;
        a10.f27432r = f10;
        return a10.a();
    }

    public int hashCode() {
        if (this.N == 0) {
            String str = this.f27397a;
            int i10 = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f27398b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f27399c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f27400d) * 31) + this.f27401e) * 31) + this.f27402f) * 31) + this.f27403g) * 31;
            String str4 = this.f27405i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            q5.a aVar = this.f27406r;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f27407s;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f27408t;
            int floatToIntBits = (((((((((((((((Float.floatToIntBits(this.C) + ((((Float.floatToIntBits(this.A) + ((((((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f27409u) * 31) + ((int) this.f27412x)) * 31) + this.f27413y) * 31) + this.f27414z) * 31)) * 31) + this.B) * 31)) * 31) + this.E) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31;
            Class<? extends p> cls = this.M;
            if (cls != null) {
                i10 = cls.hashCode();
            }
            this.N = floatToIntBits + i10;
        }
        return this.N;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Format(");
        a10.append(this.f27397a);
        a10.append(", ");
        a10.append(this.f27398b);
        a10.append(", ");
        a10.append(this.f27407s);
        a10.append(", ");
        a10.append(this.f27408t);
        a10.append(", ");
        a10.append(this.f27405i);
        a10.append(", ");
        a10.append(this.f27404h);
        a10.append(", ");
        a10.append(this.f27399c);
        a10.append(", [");
        a10.append(this.f27413y);
        a10.append(", ");
        a10.append(this.f27414z);
        a10.append(", ");
        a10.append(this.A);
        a10.append("], [");
        a10.append(this.G);
        a10.append(", ");
        return e.a(a10, this.H, "])");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27397a);
        parcel.writeString(this.f27398b);
        parcel.writeString(this.f27399c);
        parcel.writeInt(this.f27400d);
        parcel.writeInt(this.f27401e);
        parcel.writeInt(this.f27402f);
        parcel.writeInt(this.f27403g);
        parcel.writeString(this.f27405i);
        int i11 = 0;
        parcel.writeParcelable(this.f27406r, 0);
        parcel.writeString(this.f27407s);
        parcel.writeString(this.f27408t);
        parcel.writeInt(this.f27409u);
        int size = this.f27410v.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeByteArray(this.f27410v.get(i12));
        }
        parcel.writeParcelable(this.f27411w, 0);
        parcel.writeLong(this.f27412x);
        parcel.writeInt(this.f27413y);
        parcel.writeInt(this.f27414z);
        parcel.writeFloat(this.A);
        parcel.writeInt(this.B);
        parcel.writeFloat(this.C);
        if (this.D != null) {
            i11 = 1;
        }
        int i13 = e0.f26436a;
        parcel.writeInt(i11);
        byte[] bArr = this.D;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.E);
        parcel.writeParcelable(this.F, i10);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
    }

    /* compiled from: Format */
    public static final class b {
        public int A;
        public int B;
        public int C;
        public Class<? extends p> D;

        /* renamed from: a  reason: collision with root package name */
        public String f27415a;

        /* renamed from: b  reason: collision with root package name */
        public String f27416b;

        /* renamed from: c  reason: collision with root package name */
        public String f27417c;

        /* renamed from: d  reason: collision with root package name */
        public int f27418d;

        /* renamed from: e  reason: collision with root package name */
        public int f27419e;

        /* renamed from: f  reason: collision with root package name */
        public int f27420f;

        /* renamed from: g  reason: collision with root package name */
        public int f27421g;

        /* renamed from: h  reason: collision with root package name */
        public String f27422h;

        /* renamed from: i  reason: collision with root package name */
        public q5.a f27423i;

        /* renamed from: j  reason: collision with root package name */
        public String f27424j;

        /* renamed from: k  reason: collision with root package name */
        public String f27425k;

        /* renamed from: l  reason: collision with root package name */
        public int f27426l;

        /* renamed from: m  reason: collision with root package name */
        public List<byte[]> f27427m;

        /* renamed from: n  reason: collision with root package name */
        public f f27428n;

        /* renamed from: o  reason: collision with root package name */
        public long f27429o;

        /* renamed from: p  reason: collision with root package name */
        public int f27430p;

        /* renamed from: q  reason: collision with root package name */
        public int f27431q;

        /* renamed from: r  reason: collision with root package name */
        public float f27432r;

        /* renamed from: s  reason: collision with root package name */
        public int f27433s;

        /* renamed from: t  reason: collision with root package name */
        public float f27434t;

        /* renamed from: u  reason: collision with root package name */
        public byte[] f27435u;

        /* renamed from: v  reason: collision with root package name */
        public int f27436v;

        /* renamed from: w  reason: collision with root package name */
        public w6.b f27437w;

        /* renamed from: x  reason: collision with root package name */
        public int f27438x;

        /* renamed from: y  reason: collision with root package name */
        public int f27439y;

        /* renamed from: z  reason: collision with root package name */
        public int f27440z;

        public b() {
            this.f27420f = -1;
            this.f27421g = -1;
            this.f27426l = -1;
            this.f27429o = Long.MAX_VALUE;
            this.f27430p = -1;
            this.f27431q = -1;
            this.f27432r = -1.0f;
            this.f27434t = 1.0f;
            this.f27436v = -1;
            this.f27438x = -1;
            this.f27439y = -1;
            this.f27440z = -1;
            this.C = -1;
        }

        public b0 a() {
            return new b0(this, (a) null);
        }

        public b b(int i10) {
            this.f27415a = Integer.toString(i10);
            return this;
        }

        public b(b0 b0Var, a aVar) {
            this.f27415a = b0Var.f27397a;
            this.f27416b = b0Var.f27398b;
            this.f27417c = b0Var.f27399c;
            this.f27418d = b0Var.f27400d;
            this.f27419e = b0Var.f27401e;
            this.f27420f = b0Var.f27402f;
            this.f27421g = b0Var.f27403g;
            this.f27422h = b0Var.f27405i;
            this.f27423i = b0Var.f27406r;
            this.f27424j = b0Var.f27407s;
            this.f27425k = b0Var.f27408t;
            this.f27426l = b0Var.f27409u;
            this.f27427m = b0Var.f27410v;
            this.f27428n = b0Var.f27411w;
            this.f27429o = b0Var.f27412x;
            this.f27430p = b0Var.f27413y;
            this.f27431q = b0Var.f27414z;
            this.f27432r = b0Var.A;
            this.f27433s = b0Var.B;
            this.f27434t = b0Var.C;
            this.f27435u = b0Var.D;
            this.f27436v = b0Var.E;
            this.f27437w = b0Var.F;
            this.f27438x = b0Var.G;
            this.f27439y = b0Var.H;
            this.f27440z = b0Var.I;
            this.A = b0Var.J;
            this.B = b0Var.K;
            this.C = b0Var.L;
            this.D = b0Var.M;
        }
    }

    public b0(Parcel parcel) {
        this.f27397a = parcel.readString();
        this.f27398b = parcel.readString();
        this.f27399c = parcel.readString();
        this.f27400d = parcel.readInt();
        this.f27401e = parcel.readInt();
        int readInt = parcel.readInt();
        this.f27402f = readInt;
        int readInt2 = parcel.readInt();
        this.f27403g = readInt2;
        this.f27404h = readInt2 != -1 ? readInt2 : readInt;
        this.f27405i = parcel.readString();
        this.f27406r = (q5.a) parcel.readParcelable(q5.a.class.getClassLoader());
        this.f27407s = parcel.readString();
        this.f27408t = parcel.readString();
        this.f27409u = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f27410v = new ArrayList(readInt3);
        boolean z10 = false;
        for (int i10 = 0; i10 < readInt3; i10++) {
            List<byte[]> list = this.f27410v;
            byte[] createByteArray = parcel.createByteArray();
            createByteArray.getClass();
            list.add(createByteArray);
        }
        f fVar = (f) parcel.readParcelable(f.class.getClassLoader());
        this.f27411w = fVar;
        this.f27412x = parcel.readLong();
        this.f27413y = parcel.readInt();
        this.f27414z = parcel.readInt();
        this.A = parcel.readFloat();
        this.B = parcel.readInt();
        this.C = parcel.readFloat();
        int i11 = e0.f26436a;
        Class cls = null;
        this.D = parcel.readInt() != 0 ? true : z10 ? parcel.createByteArray() : null;
        this.E = parcel.readInt();
        this.F = (w6.b) parcel.readParcelable(w6.b.class.getClassLoader());
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        this.J = parcel.readInt();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = fVar != null ? a0.class : cls;
    }
}
