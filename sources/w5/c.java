package w5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q5.a;
import v6.e0;
import x4.b0;

/* compiled from: SlowMotionData */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f27011a;

    /* compiled from: SlowMotionData */
    public class a implements Parcelable.Creator<c> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        public Object[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* compiled from: SlowMotionData */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final long f27012a;

        /* renamed from: b  reason: collision with root package name */
        public final long f27013b;

        /* renamed from: c  reason: collision with root package name */
        public final int f27014c;

        /* compiled from: SlowMotionData */
        public class a implements Parcelable.Creator<b> {
            public Object createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            public Object[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            v6.a.a(j10 < j11);
            this.f27012a = j10;
            this.f27013b = j11;
            this.f27014c = i10;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f27012a == bVar.f27012a && this.f27013b == bVar.f27013b && this.f27014c == bVar.f27014c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f27012a), Long.valueOf(this.f27013b), Integer.valueOf(this.f27014c)});
        }

        public String toString() {
            return e0.n("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f27012a), Long.valueOf(this.f27013b), Integer.valueOf(this.f27014c));
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f27012a);
            parcel.writeLong(this.f27013b);
            parcel.writeInt(this.f27014c);
        }
    }

    public c(List<b> list) {
        this.f27011a = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = list.get(0).f27013b;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (list.get(i10).f27012a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = list.get(i10).f27013b;
                    i10++;
                }
            }
        }
        v6.a.a(!z10);
    }

    public /* synthetic */ b0 F() {
        return q5.b.b(this);
    }

    public /* synthetic */ byte[] I() {
        return q5.b.a(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f27011a.equals(((c) obj).f27011a);
    }

    public int hashCode() {
        return this.f27011a.hashCode();
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("SlowMotion: segments=");
        a10.append(this.f27011a);
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f27011a);
    }
}
