package e8;

import com.google.android.gms.internal.ads.q7;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class db implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14232a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14233b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14234c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14235d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f14236e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f14237f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f14238g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f14239h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f14240i;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ q7 f14241r;

    public db(q7 q7Var, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.f14241r = q7Var;
        this.f14232a = str;
        this.f14233b = str2;
        this.f14234c = i10;
        this.f14235d = i11;
        this.f14236e = j10;
        this.f14237f = j11;
        this.f14238g = z10;
        this.f14239h = i12;
        this.f14240i = i13;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f14232a);
        hashMap.put("cachedSrc", this.f14233b);
        hashMap.put("bytesLoaded", Integer.toString(this.f14234c));
        hashMap.put("totalBytes", Integer.toString(this.f14235d));
        hashMap.put("bufferedDuration", Long.toString(this.f14236e));
        hashMap.put("totalDuration", Long.toString(this.f14237f));
        hashMap.put("cacheReady", this.f14238g ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f14239h));
        hashMap.put("playerPreparedCount", Integer.toString(this.f14240i));
        q7.j(this.f14241r, "onPrecacheEvent", hashMap);
    }
}
