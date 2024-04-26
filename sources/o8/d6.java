package o8;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.l;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class d6 {

    /* renamed from: a  reason: collision with root package name */
    public final l f23169a;

    public d6(l lVar) {
        this.f23169a = lVar;
    }

    public final void a(String str, Bundle bundle) {
        String str2;
        this.f23169a.b().h();
        if (!this.f23169a.g()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f23169a.t().f8825t.b(str2);
                this.f23169a.t().f8826u.b(this.f23169a.f8850n.b());
            }
        }
    }

    public final boolean b() {
        return this.f23169a.t().f8826u.a() > 0;
    }

    public final boolean c() {
        if (b() && this.f23169a.f8850n.b() - this.f23169a.t().f8826u.a() > this.f23169a.f8843g.r((String) null, v2.R)) {
            return true;
        }
        return false;
    }
}
