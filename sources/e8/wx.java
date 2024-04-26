package e8;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wx implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f17411a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17412b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17413c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17414d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f17415e;

    public wx(String str, String str2, String str3, String str4, Long l10) {
        this.f17411a = str;
        this.f17412b = str2;
        this.f17413c = str3;
        this.f17414d = str4;
        this.f17415e = l10;
    }

    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f17411a;
        if (str != null) {
            bundle.putString("gmp_app_id", str);
        }
        String str2 = this.f17412b;
        if (str2 != null) {
            bundle.putString("fbs_aiid", str2);
        }
        String str3 = this.f17413c;
        if (str3 != null) {
            bundle.putString("fbs_aeid", str3);
        }
        String str4 = this.f17414d;
        if (str4 != null) {
            bundle.putString("apm_id_origin", str4);
        }
        Long l10 = this.f17415e;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
