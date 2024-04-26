package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.j;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class v extends w7.a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    public Bundle f245a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f246b;

    /* renamed from: c  reason: collision with root package name */
    public b f247c;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f248a;

        /* renamed from: b  reason: collision with root package name */
        public final String f249b;

        public b(u uVar, a aVar) {
            this.f248a = uVar.j("gcm.n.title");
            uVar.g("gcm.n.title");
            a(uVar, "gcm.n.title");
            this.f249b = uVar.j("gcm.n.body");
            uVar.g("gcm.n.body");
            a(uVar, "gcm.n.body");
            uVar.j("gcm.n.icon");
            if (TextUtils.isEmpty(uVar.j("gcm.n.sound2"))) {
                uVar.j("gcm.n.sound");
            }
            uVar.j("gcm.n.tag");
            uVar.j("gcm.n.color");
            uVar.j("gcm.n.click_action");
            uVar.j("gcm.n.android_channel_id");
            uVar.e();
            uVar.j("gcm.n.image");
            uVar.j("gcm.n.ticker");
            uVar.b("gcm.n.notification_priority");
            uVar.b("gcm.n.visibility");
            uVar.b("gcm.n.notification_count");
            uVar.a("gcm.n.sticky");
            uVar.a("gcm.n.local_only");
            uVar.a("gcm.n.default_sound");
            uVar.a("gcm.n.default_vibrate_timings");
            uVar.a("gcm.n.default_light_settings");
            uVar.h("gcm.n.event_time");
            uVar.d();
            uVar.k();
        }

        public static String[] a(u uVar, String str) {
            Object[] f10 = uVar.f(str);
            if (f10 == null) {
                return null;
            }
            String[] strArr = new String[f10.length];
            for (int i10 = 0; i10 < f10.length; i10++) {
                strArr[i10] = String.valueOf(f10[i10]);
            }
            return strArr;
        }
    }

    public v(Bundle bundle) {
        this.f245a = bundle;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.c(parcel, 2, this.f245a, false);
        j.m(parcel, l10);
    }
}
