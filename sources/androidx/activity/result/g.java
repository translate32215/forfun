package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: IntentSenderRequest */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final IntentSender f388a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f389b;

    /* renamed from: c  reason: collision with root package name */
    public final int f390c;

    /* renamed from: d  reason: collision with root package name */
    public final int f391d;

    /* compiled from: IntentSenderRequest */
    public class a implements Parcelable.Creator<g> {
        public Object createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        public Object[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f388a = intentSender;
        this.f389b = intent;
        this.f390c = i10;
        this.f391d = i11;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f388a, i10);
        parcel.writeParcelable(this.f389b, i10);
        parcel.writeInt(this.f390c);
        parcel.writeInt(this.f391d);
    }

    public g(Parcel parcel) {
        this.f388a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f389b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f390c = parcel.readInt();
        this.f391d = parcel.readInt();
    }
}
