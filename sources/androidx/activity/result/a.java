package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ActivityResult */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0009a();

    /* renamed from: a  reason: collision with root package name */
    public final int f373a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f374b;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityResult */
    public class C0009a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, Intent intent) {
        this.f373a = i10;
        this.f374b = intent;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("ActivityResult{resultCode=");
        int i10 = this.f373a;
        a10.append(i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK");
        a10.append(", data=");
        a10.append(this.f374b);
        a10.append('}');
        return a10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f373a);
        parcel.writeInt(this.f374b == null ? 0 : 1);
        Intent intent = this.f374b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    public a(Parcel parcel) {
        this.f373a = parcel.readInt();
        this.f374b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
