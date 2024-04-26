package v5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import v6.e0;

/* compiled from: ChapterTocFrame */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f26388b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f26389c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f26390d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f26391e;

    /* renamed from: f  reason: collision with root package name */
    public final h[] f26392f;

    /* compiled from: ChapterTocFrame */
    public class a implements Parcelable.Creator<d> {
        public Object createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        public Object[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f26388b = str;
        this.f26389c = z10;
        this.f26390d = z11;
        this.f26391e = strArr;
        this.f26392f = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f26389c != dVar.f26389c || this.f26390d != dVar.f26390d || !e0.a(this.f26388b, dVar.f26388b) || !Arrays.equals(this.f26391e, dVar.f26391e) || !Arrays.equals(this.f26392f, dVar.f26392f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10 = (((true + (this.f26389c ? 1 : 0)) * 31) + (this.f26390d ? 1 : 0)) * 31;
        String str = this.f26388b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26388b);
        parcel.writeByte(this.f26389c ? (byte) 1 : 0);
        parcel.writeByte(this.f26390d ? (byte) 1 : 0);
        parcel.writeStringArray(this.f26391e);
        parcel.writeInt(this.f26392f.length);
        for (h writeParcelable : this.f26392f) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = e0.f26436a;
        this.f26388b = readString;
        boolean z10 = true;
        this.f26389c = parcel.readByte() != 0;
        this.f26390d = parcel.readByte() == 0 ? false : z10;
        this.f26391e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f26392f = new h[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f26392f[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
