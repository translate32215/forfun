package t9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s.i;

/* compiled from: ExtendableSavedState */
public class a extends u0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0251a();

    /* renamed from: c  reason: collision with root package name */
    public final i<String, Bundle> f25860c;

    /* renamed from: t9.a$a  reason: collision with other inner class name */
    /* compiled from: ExtendableSavedState */
    public class C0251a implements Parcelable.ClassLoaderCreator<a> {
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, (C0251a) null);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }

        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null, (C0251a) null);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader, C0251a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f25860c = new i<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f25860c.put(strArr[i10], bundleArr[i10]);
        }
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("ExtendableSavedState{");
        a10.append(Integer.toHexString(System.identityHashCode(this)));
        a10.append(" states=");
        a10.append(this.f25860c);
        a10.append("}");
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f25915a, i10);
        int i11 = this.f25860c.f24851c;
        parcel.writeInt(i11);
        String[] strArr = new String[i11];
        Bundle[] bundleArr = new Bundle[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = this.f25860c.h(i12);
            bundleArr[i12] = this.f25860c.l(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
