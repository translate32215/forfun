package z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import x4.b0;

/* compiled from: TrackGroup */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f28583a;

    /* renamed from: b  reason: collision with root package name */
    public final b0[] f28584b;

    /* renamed from: c  reason: collision with root package name */
    public int f28585c;

    /* compiled from: TrackGroup */
    public class a implements Parcelable.Creator<f0> {
        public Object createFromParcel(Parcel parcel) {
            return new f0(parcel);
        }

        public Object[] newArray(int i10) {
            return new f0[i10];
        }
    }

    public f0(b0... b0VarArr) {
        v6.a.d(b0VarArr.length > 0);
        this.f28584b = b0VarArr;
        this.f28583a = b0VarArr.length;
    }

    public int a(b0 b0Var) {
        int i10 = 0;
        while (true) {
            b0[] b0VarArr = this.f28584b;
            if (i10 >= b0VarArr.length) {
                return -1;
            }
            if (b0Var == b0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f28583a != f0Var.f28583a || !Arrays.equals(this.f28584b, f0Var.f28584b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f28585c == 0) {
            this.f28585c = 527 + Arrays.hashCode(this.f28584b);
        }
        return this.f28585c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28583a);
        for (int i11 = 0; i11 < this.f28583a; i11++) {
            parcel.writeParcelable(this.f28584b[i11], 0);
        }
    }

    public f0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f28583a = readInt;
        this.f28584b = new b0[readInt];
        for (int i10 = 0; i10 < this.f28583a; i10++) {
            this.f28584b[i10] = (b0) parcel.readParcelable(b0.class.getClassLoader());
        }
    }
}
