package a7;

import android.view.View;
import c8.a;
import java.util.WeakHashMap;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, g> f144a = new WeakHashMap<>();

    public final void a(d dVar) {
        a aVar = (a) dVar.a();
        e.K("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
    }

    public final void b(a aVar) {
        e.K("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
    }
}
