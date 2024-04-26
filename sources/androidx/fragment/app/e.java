package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: BackStackState */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f1654a;

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f1655b;

    /* compiled from: BackStackState */
    public class a implements Parcelable.Creator<e> {
        public Object createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        public Object[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(List<String> list, List<d> list2) {
        this.f1654a = list;
        this.f1655b = list2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1654a);
        parcel.writeTypedList(this.f1655b);
    }

    public e(Parcel parcel) {
        this.f1654a = parcel.createStringArrayList();
        this.f1655b = parcel.createTypedArrayList(d.CREATOR);
    }
}
