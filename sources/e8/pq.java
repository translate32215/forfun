package e8;

import com.google.android.gms.internal.ads.Cif;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pq implements q20 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Cif, Long> f16013a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final mq f16014b;

    /* renamed from: c  reason: collision with root package name */
    public final b f16015c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Cif, rq> f16016d = new HashMap();

    public pq(mq mqVar, Set<rq> set, b bVar) {
        this.f16014b = mqVar;
        for (rq next : set) {
            this.f16016d.put(next.f16339c, next);
        }
        this.f16015c = bVar;
    }

    public final void B(Cif ifVar, String str) {
        this.f16013a.put(ifVar, Long.valueOf(this.f16015c.a()));
    }

    public final void P(Cif ifVar, String str) {
        if (this.f16013a.containsKey(ifVar)) {
            long a10 = this.f16015c.a() - this.f16013a.get(ifVar).longValue();
            ConcurrentHashMap<String, String> concurrentHashMap = this.f16014b.f15534a;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(a10));
            concurrentHashMap.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f16016d.containsKey(ifVar)) {
            a(ifVar, true);
        }
    }

    public final void a(Cif ifVar, boolean z10) {
        Cif ifVar2 = this.f16016d.get(ifVar).f16338b;
        String str = z10 ? "s." : "f.";
        if (this.f16013a.containsKey(ifVar2)) {
            long a10 = this.f16015c.a() - this.f16013a.get(ifVar2).longValue();
            ConcurrentHashMap<String, String> concurrentHashMap = this.f16014b.f15534a;
            String valueOf = String.valueOf(this.f16016d.get(ifVar).f16337a);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(a10));
            concurrentHashMap.put(concat, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }

    public final void g(Cif ifVar, String str, Throwable th) {
        if (this.f16013a.containsKey(ifVar)) {
            long a10 = this.f16015c.a() - this.f16013a.get(ifVar).longValue();
            ConcurrentHashMap<String, String> concurrentHashMap = this.f16014b.f15534a;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(a10));
            concurrentHashMap.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f16016d.containsKey(ifVar)) {
            a(ifVar, false);
        }
    }

    public final void y(Cif ifVar, String str) {
    }
}
