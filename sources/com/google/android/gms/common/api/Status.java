package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import androidx.appcompat.widget.d0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.h;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.startapp.b4;
import com.startapp.nd;
import java.util.Arrays;
import t7.h;
import t7.l;
import w7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Status extends a implements h, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new l();

    /* renamed from: f  reason: collision with root package name */
    public static final Status f5740f = new Status(0, (String) null);

    /* renamed from: g  reason: collision with root package name */
    public static final Status f5741g = new Status(15, (String) null);

    /* renamed from: h  reason: collision with root package name */
    public static final Status f5742h = new Status(16, (String) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f5743a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5744b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5745c;

    /* renamed from: d  reason: collision with root package name */
    public final PendingIntent f5746d;

    /* renamed from: e  reason: collision with root package name */
    public final s7.a f5747e;

    static {
        new Status(-1, (String) null);
        new Status(14, (String) null);
        new Status(8, (String) null);
        new Status(17, (String) null);
        new Status(18, (String) null);
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, s7.a aVar) {
        this.f5743a = i10;
        this.f5744b = i11;
        this.f5745c = str;
        this.f5746d = pendingIntent;
        this.f5747e = aVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, (PendingIntent) null, (s7.a) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f5743a != status.f5743a || this.f5744b != status.f5744b || !com.google.android.gms.common.internal.h.a(this.f5745c, status.f5745c) || !com.google.android.gms.common.internal.h.a(this.f5746d, status.f5746d) || !com.google.android.gms.common.internal.h.a(this.f5747e, status.f5747e)) {
            return false;
        }
        return true;
    }

    @CanIgnoreReturnValue
    public Status h() {
        return this;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5743a), Integer.valueOf(this.f5744b), this.f5745c, this.f5746d, this.f5747e});
    }

    public String toString() {
        h.a aVar = new h.a(this);
        String str = this.f5745c;
        if (str == null) {
            int i10 = this.f5744b;
            switch (i10) {
                case nd.f10913j /*-1*/:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case b4.f10106f /*8*/:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                default:
                    str = d0.a("unknown status code: ", i10);
                    break;
            }
        }
        aVar.a("statusCode", str);
        aVar.a("resolution", this.f5746d);
        return aVar.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f5744b;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.g(parcel, 2, this.f5745c, false);
        j.f(parcel, 3, this.f5746d, i10, false);
        j.f(parcel, 4, this.f5747e, i10, false);
        int i12 = this.f5743a;
        parcel.writeInt(263144);
        parcel.writeInt(i12);
        j.m(parcel, l10);
    }
}
