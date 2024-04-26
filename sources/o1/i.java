package o1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.o;
import ud.k;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: NavBackStackEntryState.kt */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f22711a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22712b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f22713c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f22714d;

    /* compiled from: NavBackStackEntryState.kt */
    public static final class a implements Parcelable.Creator<i> {
        public Object createFromParcel(Parcel parcel) {
            k.f(parcel, "inParcel");
            return new i(parcel);
        }

        public Object[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(h hVar) {
        k.f(hVar, "entry");
        this.f22711a = hVar.f22700f;
        this.f22712b = hVar.f22696b.f22806h;
        this.f22713c = hVar.f22697c;
        Bundle bundle = new Bundle();
        this.f22714d = bundle;
        k.f(bundle, "outBundle");
        hVar.f22703i.d(bundle);
    }

    public final h a(Context context, r rVar, o.c cVar, m mVar) {
        k.f(context, "context");
        k.f(cVar, "hostLifecycleState");
        Bundle bundle = this.f22713c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        String str = this.f22711a;
        Bundle bundle2 = this.f22714d;
        k.f(str, "id");
        return new h(context, rVar, bundle, cVar, mVar, str, bundle2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        k.f(parcel, "parcel");
        parcel.writeString(this.f22711a);
        parcel.writeInt(this.f22712b);
        parcel.writeBundle(this.f22713c);
        parcel.writeBundle(this.f22714d);
    }

    public i(Parcel parcel) {
        String readString = parcel.readString();
        k.c(readString);
        this.f22711a = readString;
        this.f22712b = parcel.readInt();
        this.f22713c = parcel.readBundle(i.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(i.class.getClassLoader());
        k.c(readBundle);
        this.f22714d = readBundle;
    }
}
