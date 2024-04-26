package q5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import v6.e0;
import x4.b0;

/* compiled from: Metadata */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0224a();

    /* renamed from: a  reason: collision with root package name */
    public final b[] f24150a;

    /* renamed from: q5.a$a  reason: collision with other inner class name */
    /* compiled from: Metadata */
    public class C0224a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* compiled from: Metadata */
    public interface b extends Parcelable {
        b0 F();

        byte[] I();
    }

    public a(b... bVarArr) {
        this.f24150a = bVarArr;
    }

    public a a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        b[] bVarArr2 = this.f24150a;
        int i10 = e0.f26436a;
        Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
        return new a((b[]) copyOf);
    }

    public a b(a aVar) {
        return aVar == null ? this : a(aVar.f24150a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f24150a, ((a) obj).f24150a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f24150a);
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("entries=");
        a10.append(Arrays.toString(this.f24150a));
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f24150a.length);
        for (b writeParcelable : this.f24150a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public a(List<? extends b> list) {
        this.f24150a = (b[]) list.toArray(new b[0]);
    }

    public a(Parcel parcel) {
        this.f24150a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f24150a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }
}
