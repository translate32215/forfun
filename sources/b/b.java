package b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.a;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ResultReceiver */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public a f3337a;

    /* compiled from: ResultReceiver */
    public class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: b.b$b  reason: collision with other inner class name */
    /* compiled from: ResultReceiver */
    public class C0045b extends a.C0043a {
        public C0045b() {
        }
    }

    public b(Parcel parcel) {
        a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i10 = a.C0043a.f3335a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                aVar = new a.C0043a.C0044a(readStrongBinder);
            } else {
                aVar = (a) queryLocalInterface;
            }
        }
        this.f3337a = aVar;
    }

    public void a(int i10, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f3337a == null) {
                this.f3337a = new C0045b();
            }
            parcel.writeStrongBinder(this.f3337a.asBinder());
        }
    }
}
