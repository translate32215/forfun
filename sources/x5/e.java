package x5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: SpliceNullCommand */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* compiled from: SpliceNullCommand */
    public class a implements Parcelable.Creator<e> {
        public Object createFromParcel(Parcel parcel) {
            return new e();
        }

        public Object[] newArray(int i10) {
            return new e[i10];
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
    }
}
