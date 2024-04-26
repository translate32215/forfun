package cd;

import androidx.lifecycle.LiveData;
import dd.b;
import dd.c;
import dd.d;
import nf.f;
import nf.s;
import nf.t;
import qc.e;

/* compiled from: ApiService.kt */
public interface a {
    @f("config")
    LiveData<e<rc.a>> a(@t("code") String str);

    @f("events")
    LiveData<e<d>> b();

    @f("categories/{id}/channels")
    LiveData<e<b>> c(@s("id") long j10);

    @f("categories")
    LiveData<e<dd.a>> d();

    @f("search")
    LiveData<e<b>> e(@t("query") String str);

    @f("coupon")
    LiveData<e<c>> f(@t("code") String str);

    @f("categories/{id}")
    LiveData<e<dd.a>> g(@s("id") long j10);
}
