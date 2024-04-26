package r6;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import ba.o0;
import ba.s;
import java.util.ArrayList;
import java.util.Locale;
import v6.e0;

/* compiled from: TrackSelectionParameters */
public class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final s<String> f24666a;

    /* renamed from: b  reason: collision with root package name */
    public final int f24667b;

    /* renamed from: c  reason: collision with root package name */
    public final s<String> f24668c;

    /* renamed from: d  reason: collision with root package name */
    public final int f24669d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24670e;

    /* renamed from: f  reason: collision with root package name */
    public final int f24671f;

    /* compiled from: TrackSelectionParameters */
    public class a implements Parcelable.Creator<m> {
        public Object createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        public Object[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* compiled from: TrackSelectionParameters */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public s<String> f24672a;

        /* renamed from: b  reason: collision with root package name */
        public int f24673b = 0;

        /* renamed from: c  reason: collision with root package name */
        public s<String> f24674c;

        /* renamed from: d  reason: collision with root package name */
        public int f24675d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f24676e;

        /* renamed from: f  reason: collision with root package name */
        public int f24677f;

        @Deprecated
        public b() {
            ba.a<Object> aVar = s.f3795b;
            s<Object> sVar = o0.f3765e;
            this.f24672a = sVar;
            this.f24674c = sVar;
            this.f24675d = 0;
            this.f24676e = false;
            this.f24677f = 0;
        }

        public b a(Context context) {
            CaptioningManager captioningManager;
            String str;
            int i10 = e0.f26436a;
            if (i10 >= 19 && ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
                this.f24675d = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    if (i10 >= 21) {
                        str = locale.toLanguageTag();
                    } else {
                        str = locale.toString();
                    }
                    this.f24674c = s.C(str);
                }
            }
            return this;
        }
    }

    static {
        ba.a<Object> aVar = s.f3795b;
        s<Object> sVar = o0.f3765e;
    }

    public m(s<String> sVar, int i10, s<String> sVar2, int i11, boolean z10, int i12) {
        this.f24666a = sVar;
        this.f24667b = i10;
        this.f24668c = sVar2;
        this.f24669d = i11;
        this.f24670e = z10;
        this.f24671f = i12;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f24666a.equals(mVar.f24666a) && this.f24667b == mVar.f24667b && this.f24668c.equals(mVar.f24668c) && this.f24669d == mVar.f24669d && this.f24670e == mVar.f24670e && this.f24671f == mVar.f24671f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f24668c.hashCode() + ((((this.f24666a.hashCode() + 31) * 31) + this.f24667b) * 31)) * 31) + this.f24669d) * 31) + (this.f24670e ? 1 : 0)) * 31) + this.f24671f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f24666a);
        parcel.writeInt(this.f24667b);
        parcel.writeList(this.f24668c);
        parcel.writeInt(this.f24669d);
        boolean z10 = this.f24670e;
        int i11 = e0.f26436a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f24671f);
    }

    public m(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, (ClassLoader) null);
        this.f24666a = s.z(arrayList);
        this.f24667b = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, (ClassLoader) null);
        this.f24668c = s.z(arrayList2);
        this.f24669d = parcel.readInt();
        int i10 = e0.f26436a;
        this.f24670e = parcel.readInt() != 0;
        this.f24671f = parcel.readInt();
    }
}
