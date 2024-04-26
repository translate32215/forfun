package a7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.internal.ads.ky;
import com.google.android.gms.internal.ads.my;
import e8.qi0;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f145a;

    /* renamed from: b  reason: collision with root package name */
    public final ky f146b;

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f147c;

    public k(boolean z10, IBinder iBinder, IBinder iBinder2) {
        ky kyVar;
        this.f145a = z10;
        if (iBinder != null) {
            int i10 = qi0.f16176b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            kyVar = queryLocalInterface instanceof ky ? (ky) queryLocalInterface : new my(iBinder);
        } else {
            kyVar = null;
        }
        this.f146b = kyVar;
        this.f147c = iBinder2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        boolean z10 = this.f145a;
        parcel.writeInt(262145);
        parcel.writeInt(z10 ? 1 : 0);
        ky kyVar = this.f146b;
        j.e(parcel, 2, kyVar == null ? null : kyVar.asBinder(), false);
        j.e(parcel, 3, this.f147c, false);
        j.m(parcel, l10);
    }
}
