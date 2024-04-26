package v5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v6.e0;

/* compiled from: MlltFrame */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f26409b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26410c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26411d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f26412e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f26413f;

    /* compiled from: MlltFrame */
    public class a implements Parcelable.Creator<j> {
        public Object createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        public Object[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f26409b = i10;
        this.f26410c = i11;
        this.f26411d = i12;
        this.f26412e = iArr;
        this.f26413f = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f26409b == jVar.f26409b && this.f26410c == jVar.f26410c && this.f26411d == jVar.f26411d && Arrays.equals(this.f26412e, jVar.f26412e) && Arrays.equals(this.f26413f, jVar.f26413f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f26412e);
        return Arrays.hashCode(this.f26413f) + ((hashCode + ((((((527 + this.f26409b) * 31) + this.f26410c) * 31) + this.f26411d) * 31)) * 31);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f26409b);
        parcel.writeInt(this.f26410c);
        parcel.writeInt(this.f26411d);
        parcel.writeIntArray(this.f26412e);
        parcel.writeIntArray(this.f26413f);
    }

    public j(Parcel parcel) {
        super("MLLT");
        this.f26409b = parcel.readInt();
        this.f26410c = parcel.readInt();
        this.f26411d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = e0.f26436a;
        this.f26412e = createIntArray;
        this.f26413f = parcel.createIntArray();
    }
}
