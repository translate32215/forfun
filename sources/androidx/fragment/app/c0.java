package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentManagerState */
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<String> f1625a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f1626b;

    /* renamed from: c  reason: collision with root package name */
    public d[] f1627c;

    /* renamed from: d  reason: collision with root package name */
    public int f1628d;

    /* renamed from: e  reason: collision with root package name */
    public String f1629e = null;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f1630f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<e> f1631g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<a0.l> f1632h;

    /* compiled from: FragmentManagerState */
    public class a implements Parcelable.Creator<c0> {
        public Object createFromParcel(Parcel parcel) {
            return new c0(parcel);
        }

        public Object[] newArray(int i10) {
            return new c0[i10];
        }
    }

    public c0() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1625a);
        parcel.writeStringList(this.f1626b);
        parcel.writeTypedArray(this.f1627c, i10);
        parcel.writeInt(this.f1628d);
        parcel.writeString(this.f1629e);
        parcel.writeStringList(this.f1630f);
        parcel.writeTypedList(this.f1631g);
        parcel.writeTypedList(this.f1632h);
    }

    public c0(Parcel parcel) {
        this.f1625a = parcel.createStringArrayList();
        this.f1626b = parcel.createStringArrayList();
        this.f1627c = (d[]) parcel.createTypedArray(d.CREATOR);
        this.f1628d = parcel.readInt();
        this.f1629e = parcel.readString();
        this.f1630f = parcel.createStringArrayList();
        this.f1631g = parcel.createTypedArrayList(e.CREATOR);
        this.f1632h = parcel.createTypedArrayList(a0.l.CREATOR);
    }
}
