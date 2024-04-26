package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import e8.by;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rd implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f8028a;

    public rd(@Nullable String str) {
        this.f8028a = str;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f8028a)) {
            bundle.putString("fwd_cld", this.f8028a);
        }
    }
}
