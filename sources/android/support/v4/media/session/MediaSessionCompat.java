package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;

public class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final MediaDescriptionCompat f298a;

        /* renamed from: b  reason: collision with root package name */
        public final long f299b;

        public class a implements Parcelable.Creator<QueueItem> {
            public Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public Object[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f298a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f299b = parcel.readLong();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("MediaSession.QueueItem {Description=");
            a10.append(this.f298a);
            a10.append(", Id=");
            a10.append(this.f299b);
            a10.append(" }");
            return a10.toString();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f298a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f299b);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public ResultReceiver f300a;

        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public Object[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f300a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f300a.writeToParcel(parcel, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Object f301a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public final Object f302b;

        /* renamed from: c  reason: collision with root package name */
        public a f303c;

        public class a implements Parcelable.Creator<Token> {
            public Object createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            public Object[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Object obj) {
            this.f302b = obj;
            this.f303c = null;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f302b;
            if (obj2 != null) {
                Object obj3 = token.f302b;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f302b == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            Object obj = this.f302b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f302b, i10);
            } else {
                parcel.writeStrongBinder((IBinder) this.f302b);
            }
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static Bundle b(Bundle bundle) {
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
}
