package e6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q5.a;
import x4.b0;

/* compiled from: HlsTrackMetadataEntry */
public final class h implements a.b {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f13619a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13620b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f13621c;

    /* compiled from: HlsTrackMetadataEntry */
    public class a implements Parcelable.Creator<h> {
        public Object createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        public Object[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(String str, String str2, List<b> list) {
        this.f13619a = str;
        this.f13620b = str2;
        this.f13621c = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (!TextUtils.equals(this.f13619a, hVar.f13619a) || !TextUtils.equals(this.f13620b, hVar.f13620b) || !this.f13621c.equals(hVar.f13621c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f13619a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13620b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.f13621c.hashCode() + ((hashCode + i10) * 31);
    }

    public String toString() {
        String str;
        StringBuilder a10 = android.support.v4.media.a.a("HlsTrackMetadataEntry");
        if (this.f13619a != null) {
            StringBuilder a11 = android.support.v4.media.a.a(" [");
            a11.append(this.f13619a);
            a11.append(", ");
            str = e.a(a11, this.f13620b, "]");
        } else {
            str = "";
        }
        a10.append(str);
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13619a);
        parcel.writeString(this.f13620b);
        int size = this.f13621c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f13621c.get(i11), 0);
        }
    }

    public h(Parcel parcel) {
        this.f13619a = parcel.readString();
        this.f13620b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f13621c = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: HlsTrackMetadataEntry */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f13622a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13623b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13624c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13625d;

        /* renamed from: e  reason: collision with root package name */
        public final String f13626e;

        /* renamed from: f  reason: collision with root package name */
        public final String f13627f;

        /* compiled from: HlsTrackMetadataEntry */
        public class a implements Parcelable.Creator<b> {
            public Object createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            public Object[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f13622a = i10;
            this.f13623b = i11;
            this.f13624c = str;
            this.f13625d = str2;
            this.f13626e = str3;
            this.f13627f = str4;
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
            if (this.f13622a != bVar.f13622a || this.f13623b != bVar.f13623b || !TextUtils.equals(this.f13624c, bVar.f13624c) || !TextUtils.equals(this.f13625d, bVar.f13625d) || !TextUtils.equals(this.f13626e, bVar.f13626e) || !TextUtils.equals(this.f13627f, bVar.f13627f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10 = ((this.f13622a * 31) + this.f13623b) * 31;
            String str = this.f13624c;
            int i11 = 0;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13625d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13626e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f13627f;
            if (str4 != null) {
                i11 = str4.hashCode();
            }
            return hashCode3 + i11;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f13622a);
            parcel.writeInt(this.f13623b);
            parcel.writeString(this.f13624c);
            parcel.writeString(this.f13625d);
            parcel.writeString(this.f13626e);
            parcel.writeString(this.f13627f);
        }

        public b(Parcel parcel) {
            this.f13622a = parcel.readInt();
            this.f13623b = parcel.readInt();
            this.f13624c = parcel.readString();
            this.f13625d = parcel.readString();
            this.f13626e = parcel.readString();
            this.f13627f = parcel.readString();
        }
    }
}
