package v5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o1.q;

/* compiled from: BinaryFrame */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f26381b;

    /* compiled from: BinaryFrame */
    public class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f26381b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f26405a.equals(bVar.f26405a) || !Arrays.equals(this.f26381b, bVar.f26381b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f26381b) + q.a(this.f26405a, 527, 31);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26405a);
        parcel.writeByteArray(this.f26381b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = v6.e0.f26436a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f26381b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.b.<init>(android.os.Parcel):void");
    }
}
