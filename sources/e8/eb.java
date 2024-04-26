package e8;

import com.google.android.gms.internal.ads.q7;
import d7.l;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class eb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14386b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f14387c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f14388d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f14389e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f14390f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f14391g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f14392h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f14393i;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f14394r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ q7 f14395s;

    public eb(q7 q7Var, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.f14395s = q7Var;
        this.f14385a = str;
        this.f14386b = str2;
        this.f14387c = j10;
        this.f14388d = j11;
        this.f14389e = j12;
        this.f14390f = j13;
        this.f14391g = j14;
        this.f14392h = z10;
        this.f14393i = i10;
        this.f14394r = i11;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f14385a);
        hashMap.put("cachedSrc", this.f14386b);
        hashMap.put("bufferedDuration", Long.toString(this.f14387c));
        hashMap.put("totalDuration", Long.toString(this.f14388d));
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16562d1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f14389e));
            hashMap.put("qoeCachedBytes", Long.toString(this.f14390f));
            hashMap.put("totalBytes", Long.toString(this.f14391g));
            hashMap.put("reportTime", Long.toString(l.B.f13193j.b()));
        }
        hashMap.put("cacheReady", this.f14392h ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f14393i));
        hashMap.put("playerPreparedCount", Integer.toString(this.f14394r));
        q7.j(this.f14395s, "onPrecacheEvent", hashMap);
    }
}
