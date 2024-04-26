package e8;

import android.os.Parcel;
import com.google.android.gms.internal.ads.gz;
import com.google.android.gms.internal.ads.os;
import com.google.android.gms.internal.ads.qe;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ii extends os implements gz {

    /* renamed from: a  reason: collision with root package name */
    public final String f15049a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15050b;

    /* renamed from: c  reason: collision with root package name */
    public final List<oi0> f15051c;

    public ii(qe qeVar, String str, qt qtVar) {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        String str2;
        String str3 = null;
        if (qeVar == null) {
            str2 = null;
        } else {
            str2 = qeVar.V;
        }
        this.f15050b = str2;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str3 = qeVar.f7968u.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f15049a = str3 != null ? str3 : str;
        this.f15051c = qtVar.f16201a;
    }

    public final String S2() {
        return this.f15050b;
    }

    public final List<oi0> d1() {
        if (!((Boolean) ti0.f16763j.f16769f.a(t.B4)).booleanValue()) {
            return null;
        }
        return this.f15051c;
    }

    public final boolean r6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String str = this.f15049a;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        } else if (i10 == 2) {
            String str2 = this.f15050b;
            parcel2.writeNoException();
            parcel2.writeString(str2);
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            List<oi0> d12 = d1();
            parcel2.writeNoException();
            parcel2.writeTypedList(d12);
            return true;
        }
    }

    public final String s() {
        return this.f15049a;
    }
}
