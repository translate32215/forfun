package x5;

import android.os.Parcel;
import android.os.Parcelable;
import v6.v;

/* compiled from: TimeSignalCommand */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f27849a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27850b;

    /* compiled from: TimeSignalCommand */
    public class a implements Parcelable.Creator<g> {
        public Object createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (a) null);
        }

        public Object[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(long j10, long j11) {
        this.f27849a = j10;
        this.f27850b = j11;
    }

    public static long a(v vVar, long j10) {
        long s10 = (long) vVar.s();
        if ((128 & s10) != 0) {
            return 8589934591L & ((((s10 & 1) << 32) | vVar.t()) + j10);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f27849a);
        parcel.writeLong(this.f27850b);
    }

    public g(long j10, long j11, a aVar) {
        this.f27849a = j10;
        this.f27850b = j11;
    }
}
