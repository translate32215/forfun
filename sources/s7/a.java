package s7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.internal.h;
import com.startapp.b4;
import com.startapp.nd;
import java.util.Arrays;
import k0.g;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class a extends w7.a {
    public static final Parcelable.Creator<a> CREATOR = new l();

    /* renamed from: e  reason: collision with root package name */
    public static final a f24998e = new a(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f24999a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25000b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f25001c;

    /* renamed from: d  reason: collision with root package name */
    public final String f25002d;

    public a(int i10) {
        this.f24999a = 1;
        this.f25000b = i10;
        this.f25001c = null;
        this.f25002d = null;
    }

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f24999a = i10;
        this.f25000b = i11;
        this.f25001c = pendingIntent;
        this.f25002d = str;
    }

    public static String q(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case nd.f10913j:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case b4.f10106f:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return g.a("UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25000b == aVar.f25000b && h.a(this.f25001c, aVar.f25001c) && h.a(this.f25002d, aVar.f25002d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25000b), this.f25001c, this.f25002d});
    }

    public boolean i() {
        return (this.f25000b == 0 || this.f25001c == null) ? false : true;
    }

    public boolean j() {
        return this.f25000b == 0;
    }

    public String toString() {
        h.a aVar = new h.a(this);
        aVar.a("statusCode", q(this.f25000b));
        aVar.a("resolution", this.f25001c);
        aVar.a("message", this.f25002d);
        return aVar.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f24999a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f25000b;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        j.f(parcel, 3, this.f25001c, i10, false);
        j.g(parcel, 4, this.f25002d, false);
        j.m(parcel, l10);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this.f24999a = 1;
        this.f25000b = i10;
        this.f25001c = pendingIntent;
        this.f25002d = null;
    }
}
