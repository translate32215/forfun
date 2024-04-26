package fa;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.util.e;
import java.util.Arrays;
import t1.c;

/* compiled from: FirebaseOptions */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f18332a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18333b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18334c;

    /* renamed from: d  reason: collision with root package name */
    public final String f18335d;

    /* renamed from: e  reason: collision with root package name */
    public final String f18336e;

    /* renamed from: f  reason: collision with root package name */
    public final String f18337f;

    /* renamed from: g  reason: collision with root package name */
    public final String f18338g;

    public d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        i.k(!e.a(str), "ApplicationId must be set.");
        this.f18333b = str;
        this.f18332a = str2;
        this.f18334c = str3;
        this.f18335d = str4;
        this.f18336e = str5;
        this.f18337f = str6;
        this.f18338g = str7;
    }

    public static d a(Context context) {
        c cVar = new c(context);
        String f10 = cVar.f("google_app_id");
        if (TextUtils.isEmpty(f10)) {
            return null;
        }
        return new d(f10, cVar.f("google_api_key"), cVar.f("firebase_database_url"), cVar.f("ga_trackingId"), cVar.f("gcm_defaultSenderId"), cVar.f("google_storage_bucket"), cVar.f("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!h.a(this.f18333b, dVar.f18333b) || !h.a(this.f18332a, dVar.f18332a) || !h.a(this.f18334c, dVar.f18334c) || !h.a(this.f18335d, dVar.f18335d) || !h.a(this.f18336e, dVar.f18336e) || !h.a(this.f18337f, dVar.f18337f) || !h.a(this.f18338g, dVar.f18338g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18333b, this.f18332a, this.f18334c, this.f18335d, this.f18336e, this.f18337f, this.f18338g});
    }

    public String toString() {
        h.a aVar = new h.a(this);
        aVar.a("applicationId", this.f18333b);
        aVar.a("apiKey", this.f18332a);
        aVar.a("databaseUrl", this.f18334c);
        aVar.a("gcmSenderId", this.f18336e);
        aVar.a("storageBucket", this.f18337f);
        aVar.a("projectId", this.f18338g);
        return aVar.toString();
    }
}
