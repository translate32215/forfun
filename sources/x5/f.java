package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SpliceScheduleCommand */
public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f27835a;

    /* compiled from: SpliceScheduleCommand */
    public class a implements Parcelable.Creator<f> {
        public Object createFromParcel(Parcel parcel) {
            return new f(parcel, (a) null);
        }

        public Object[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(List<c> list) {
        this.f27835a = Collections.unmodifiableList(list);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f27835a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.f27835a.get(i11);
            parcel.writeLong(cVar.f27838a);
            parcel.writeByte(cVar.f27839b ? (byte) 1 : 0);
            parcel.writeByte(cVar.f27840c ? (byte) 1 : 0);
            parcel.writeByte(cVar.f27841d ? (byte) 1 : 0);
            int size2 = cVar.f27843f.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                b bVar = cVar.f27843f.get(i12);
                parcel.writeInt(bVar.f27836a);
                parcel.writeLong(bVar.f27837b);
            }
            parcel.writeLong(cVar.f27842e);
            parcel.writeByte(cVar.f27844g ? (byte) 1 : 0);
            parcel.writeLong(cVar.f27845h);
            parcel.writeInt(cVar.f27846i);
            parcel.writeInt(cVar.f27847j);
            parcel.writeInt(cVar.f27848k);
        }
    }

    /* compiled from: SpliceScheduleCommand */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f27836a;

        /* renamed from: b  reason: collision with root package name */
        public final long f27837b;

        public b(int i10, long j10) {
            this.f27836a = i10;
            this.f27837b = j10;
        }

        public b(int i10, long j10, a aVar) {
            this.f27836a = i10;
            this.f27837b = j10;
        }
    }

    public f(Parcel parcel, a aVar) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new c(parcel));
        }
        this.f27835a = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: SpliceScheduleCommand */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f27838a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f27839b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f27840c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f27841d;

        /* renamed from: e  reason: collision with root package name */
        public final long f27842e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f27843f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f27844g;

        /* renamed from: h  reason: collision with root package name */
        public final long f27845h;

        /* renamed from: i  reason: collision with root package name */
        public final int f27846i;

        /* renamed from: j  reason: collision with root package name */
        public final int f27847j;

        /* renamed from: k  reason: collision with root package name */
        public final int f27848k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f27838a = j10;
            this.f27839b = z10;
            this.f27840c = z11;
            this.f27841d = z12;
            this.f27843f = Collections.unmodifiableList(list);
            this.f27842e = j11;
            this.f27844g = z13;
            this.f27845h = j12;
            this.f27846i = i10;
            this.f27847j = i11;
            this.f27848k = i12;
        }

        public c(Parcel parcel) {
            this.f27838a = parcel.readLong();
            boolean z10 = false;
            this.f27839b = parcel.readByte() == 1;
            this.f27840c = parcel.readByte() == 1;
            this.f27841d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f27843f = Collections.unmodifiableList(arrayList);
            this.f27842e = parcel.readLong();
            this.f27844g = parcel.readByte() == 1 ? true : z10;
            this.f27845h = parcel.readLong();
            this.f27846i = parcel.readInt();
            this.f27847j = parcel.readInt();
            this.f27848k = parcel.readInt();
        }
    }
}
