package e8;

import com.google.android.gms.internal.ads.q7;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14550a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14551b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f14552c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q7 f14553d;

    public fb(q7 q7Var, String str, String str2, long j10) {
        this.f14553d = q7Var;
        this.f14550a = str;
        this.f14551b = str2;
        this.f14552c = j10;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f14550a);
        hashMap.put("cachedSrc", this.f14551b);
        hashMap.put("totalDuration", Long.toString(this.f14552c));
        q7.j(this.f14553d, "onPrecacheEvent", hashMap);
    }
}
