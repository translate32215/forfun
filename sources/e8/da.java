package e8;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class da {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14228a;

    /* renamed from: b  reason: collision with root package name */
    public final ia f14229b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f14230c;

    /* renamed from: d  reason: collision with root package name */
    public i7 f14231d;

    public da(Context context, ViewGroup viewGroup, t7 t7Var) {
        this.f14228a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f14230c = viewGroup;
        this.f14229b = t7Var;
        this.f14231d = null;
    }

    public final i7 a() {
        i.d("getAdVideoUnderlay must be called from the UI thread.");
        return this.f14231d;
    }
}
