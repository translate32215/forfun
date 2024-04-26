package e8;

import com.google.android.gms.internal.ads.q7;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class cb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14099b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14100c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14101d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q7 f14102e;

    public cb(q7 q7Var, String str, String str2, int i10, int i11) {
        this.f14102e = q7Var;
        this.f14098a = str;
        this.f14099b = str2;
        this.f14100c = i10;
        this.f14101d = i11;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f14098a);
        hashMap.put("cachedSrc", this.f14099b);
        hashMap.put("bytesLoaded", Integer.toString(this.f14100c));
        hashMap.put("totalBytes", Integer.toString(this.f14101d));
        hashMap.put("cacheReady", "0");
        q7.j(this.f14102e, "onPrecacheEvent", hashMap);
    }
}
