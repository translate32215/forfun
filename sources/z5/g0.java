package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: TrackGroupArray */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final g0 f28588d = new g0(new f0[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f28589a;

    /* renamed from: b  reason: collision with root package name */
    public final f0[] f28590b;

    /* renamed from: c  reason: collision with root package name */
    public int f28591c;

    /* compiled from: TrackGroupArray */
    public class a implements Parcelable.Creator<g0> {
        public Object createFromParcel(Parcel parcel) {
            return new g0(parcel);
        }

        public Object[] newArray(int i10) {
            return new g0[i10];
        }
    }

    public g0(f0... f0VarArr) {
        this.f28590b = f0VarArr;
        this.f28589a = f0VarArr.length;
    }

    public int a(f0 f0Var) {
        for (int i10 = 0; i10 < this.f28589a; i10++) {
            if (this.f28590b[i10] == f0Var) {
                return i10;
            }
        }
        return -1;
    }

    public boolean b() {
        return this.f28589a == 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f28589a != g0Var.f28589a || !Arrays.equals(this.f28590b, g0Var.f28590b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f28591c == 0) {
            this.f28591c = Arrays.hashCode(this.f28590b);
        }
        return this.f28591c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28589a);
        for (int i11 = 0; i11 < this.f28589a; i11++) {
            parcel.writeParcelable(this.f28590b[i11], 0);
        }
    }

    public g0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f28589a = readInt;
        this.f28590b = new f0[readInt];
        for (int i10 = 0; i10 < this.f28589a; i10++) {
            this.f28590b[i10] = (f0) parcel.readParcelable(f0.class.getClassLoader());
        }
    }
}
