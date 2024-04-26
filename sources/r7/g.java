package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class g implements Parcelable.Creator<e> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new e(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
