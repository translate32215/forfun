package v5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v6.e0;

/* compiled from: ChapterFrame */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f26382b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26383c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26384d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26385e;

    /* renamed from: f  reason: collision with root package name */
    public final long f26386f;

    /* renamed from: g  reason: collision with root package name */
    public final h[] f26387g;

    /* compiled from: ChapterFrame */
    public class a implements Parcelable.Creator<c> {
        public Object createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        public Object[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, h[] hVarArr) {
        super("CHAP");
        this.f26382b = str;
        this.f26383c = i10;
        this.f26384d = i11;
        this.f26385e = j10;
        this.f26386f = j11;
        this.f26387g = hVarArr;
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
        c cVar = (c) obj;
        if (this.f26383c == cVar.f26383c && this.f26384d == cVar.f26384d && this.f26385e == cVar.f26385e && this.f26386f == cVar.f26386f && e0.a(this.f26382b, cVar.f26382b) && Arrays.equals(this.f26387g, cVar.f26387g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f26383c) * 31) + this.f26384d) * 31) + ((int) this.f26385e)) * 31) + ((int) this.f26386f)) * 31;
        String str = this.f26382b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26382b);
        parcel.writeInt(this.f26383c);
        parcel.writeInt(this.f26384d);
        parcel.writeLong(this.f26385e);
        parcel.writeLong(this.f26386f);
        parcel.writeInt(this.f26387g.length);
        for (h writeParcelable : this.f26387g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f26382b = readString;
        this.f26383c = parcel.readInt();
        this.f26384d = parcel.readInt();
        this.f26385e = parcel.readLong();
        this.f26386f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f26387g = new h[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f26387g[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
