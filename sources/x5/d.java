package x5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SpliceInsertCommand */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f27819a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f27820b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f27821c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27822d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27823e;

    /* renamed from: f  reason: collision with root package name */
    public final long f27824f;

    /* renamed from: g  reason: collision with root package name */
    public final long f27825g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f27826h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f27827i;

    /* renamed from: r  reason: collision with root package name */
    public final long f27828r;

    /* renamed from: s  reason: collision with root package name */
    public final int f27829s;

    /* renamed from: t  reason: collision with root package name */
    public final int f27830t;

    /* renamed from: u  reason: collision with root package name */
    public final int f27831u;

    /* compiled from: SpliceInsertCommand */
    public class a implements Parcelable.Creator<d> {
        public Object createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        public Object[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f27819a = j10;
        this.f27820b = z10;
        this.f27821c = z11;
        this.f27822d = z12;
        this.f27823e = z13;
        this.f27824f = j11;
        this.f27825g = j12;
        this.f27826h = Collections.unmodifiableList(list);
        this.f27827i = z14;
        this.f27828r = j13;
        this.f27829s = i10;
        this.f27830t = i11;
        this.f27831u = i12;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27819a);
        parcel.writeByte(this.f27820b ? (byte) 1 : 0);
        parcel.writeByte(this.f27821c ? (byte) 1 : 0);
        parcel.writeByte(this.f27822d ? (byte) 1 : 0);
        parcel.writeByte(this.f27823e ? (byte) 1 : 0);
        parcel.writeLong(this.f27824f);
        parcel.writeLong(this.f27825g);
        int size = this.f27826h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f27826h.get(i11);
            parcel.writeInt(bVar.f27832a);
            parcel.writeLong(bVar.f27833b);
            parcel.writeLong(bVar.f27834c);
        }
        parcel.writeByte(this.f27827i ? (byte) 1 : 0);
        parcel.writeLong(this.f27828r);
        parcel.writeInt(this.f27829s);
        parcel.writeInt(this.f27830t);
        parcel.writeInt(this.f27831u);
    }

    /* compiled from: SpliceInsertCommand */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f27832a;

        /* renamed from: b  reason: collision with root package name */
        public final long f27833b;

        /* renamed from: c  reason: collision with root package name */
        public final long f27834c;

        public b(int i10, long j10, long j11) {
            this.f27832a = i10;
            this.f27833b = j10;
            this.f27834c = j11;
        }

        public b(int i10, long j10, long j11, a aVar) {
            this.f27832a = i10;
            this.f27833b = j10;
            this.f27834c = j11;
        }
    }

    public d(Parcel parcel, a aVar) {
        this.f27819a = parcel.readLong();
        boolean z10 = false;
        this.f27820b = parcel.readByte() == 1;
        this.f27821c = parcel.readByte() == 1;
        this.f27822d = parcel.readByte() == 1;
        this.f27823e = parcel.readByte() == 1;
        this.f27824f = parcel.readLong();
        this.f27825g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f27826h = Collections.unmodifiableList(arrayList);
        this.f27827i = parcel.readByte() == 1 ? true : z10;
        this.f27828r = parcel.readLong();
        this.f27829s = parcel.readInt();
        this.f27830t = parcel.readInt();
        this.f27831u = parcel.readInt();
    }
}
