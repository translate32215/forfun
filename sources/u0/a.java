package u0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: AbsSavedState */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f25914b = new C0254a();

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f25915a;

    /* renamed from: u0.a$a  reason: collision with other inner class name */
    /* compiled from: AbsSavedState */
    public class C0254a extends a {
        public C0254a() {
            super((C0254a) null);
        }
    }

    public a(C0254a aVar) {
        this.f25915a = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f25915a, i10);
    }

    /* compiled from: AbsSavedState */
    public class b implements Parcelable.ClassLoaderCreator<a> {
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return a.f25914b;
            }
            throw new IllegalStateException("superState must be null");
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f25914b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f25915a = parcelable == f25914b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f25915a = readParcelable == null ? f25914b : readParcelable;
    }
}
