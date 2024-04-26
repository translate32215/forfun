package e8;

import android.content.Context;
import android.os.Bundle;
import q.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zw implements dy<gw> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17799a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17800b;

    /* renamed from: c  reason: collision with root package name */
    public final o50 f17801c;

    public zw(Context context, o50 o50) {
        this.f17800b = context;
        this.f17801c = o50;
    }

    public final p50 b() {
        switch (this.f17799a) {
            case 0:
                return this.f17801c.i(new wy(this));
            default:
                return this.f17801c.i(new wy(this, (e) null));
        }
    }

    public zw(o50 o50, Bundle bundle) {
        this.f17801c = o50;
        this.f17800b = bundle;
    }
}
