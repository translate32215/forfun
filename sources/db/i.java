package db;

import android.content.Context;
import com.google.firebase.remoteconfig.a;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.d;
import eb.e;
import eb.f;
import eb.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s8.l;
import va.c;

/* compiled from: RemoteConfigComponent */
public class i {

    /* renamed from: j  reason: collision with root package name */
    public static final Random f13230j = new Random();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f13231a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f13232b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f13233c;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.firebase.a f13234d;

    /* renamed from: e  reason: collision with root package name */
    public final c f13235e;

    /* renamed from: f  reason: collision with root package name */
    public final ga.c f13236f;

    /* renamed from: g  reason: collision with root package name */
    public final ua.a<ja.a> f13237g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13238h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, String> f13239i = new HashMap();

    public i(Context context, com.google.firebase.a aVar, c cVar, ga.c cVar2, ua.a<ja.a> aVar2) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f13232b = context;
        this.f13233c = newCachedThreadPool;
        this.f13234d = aVar;
        this.f13235e = cVar;
        this.f13236f = cVar2;
        this.f13237g = aVar2;
        aVar.a();
        this.f13238h = aVar.f9664c.f18333b;
        l.c(newCachedThreadPool, new g(this));
    }

    public static boolean e(com.google.firebase.a aVar) {
        aVar.a();
        return aVar.f9663b.equals("[DEFAULT]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.a a(com.google.firebase.a r16, java.lang.String r17, va.c r18, ga.c r19, java.util.concurrent.Executor r20, com.google.firebase.remoteconfig.internal.a r21, com.google.firebase.remoteconfig.internal.a r22, com.google.firebase.remoteconfig.internal.a r23, com.google.firebase.remoteconfig.internal.c r24, eb.e r25, com.google.firebase.remoteconfig.internal.d r26) {
        /*
            r15 = this;
            r1 = r15
            r0 = r17
            monitor-enter(r15)
            java.util.Map<java.lang.String, com.google.firebase.remoteconfig.a> r2 = r1.f13231a     // Catch:{ all -> 0x0061 }
            boolean r2 = r2.containsKey(r0)     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x0057
            com.google.firebase.remoteconfig.a r2 = new com.google.firebase.remoteconfig.a     // Catch:{ all -> 0x0061 }
            android.content.Context r4 = r1.f13232b     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = "firebase"
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x0029
            r16.a()     // Catch:{ all -> 0x0061 }
            r5 = r16
            java.lang.String r3 = r5.f9663b     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = "[DEFAULT]"
            boolean r3 = r3.equals(r6)     // Catch:{ all -> 0x0061 }
            if (r3 == 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x0029:
            r5 = r16
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0031
            r7 = r19
            goto L_0x0033
        L_0x0031:
            r3 = 0
            r7 = r3
        L_0x0033:
            r3 = r2
            r5 = r16
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0061 }
            r22.b()     // Catch:{ all -> 0x0061 }
            r23.b()     // Catch:{ all -> 0x0061 }
            r21.b()     // Catch:{ all -> 0x0061 }
            java.util.Map<java.lang.String, com.google.firebase.remoteconfig.a> r3 = r1.f13231a     // Catch:{ all -> 0x0061 }
            r3.put(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0057:
            java.util.Map<java.lang.String, com.google.firebase.remoteconfig.a> r2 = r1.f13231a     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x0061 }
            com.google.firebase.remoteconfig.a r0 = (com.google.firebase.remoteconfig.a) r0     // Catch:{ all -> 0x0061 }
            monitor-exit(r15)
            return r0
        L_0x0061:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: db.i.a(com.google.firebase.a, java.lang.String, va.c, ga.c, java.util.concurrent.Executor, com.google.firebase.remoteconfig.internal.a, com.google.firebase.remoteconfig.internal.a, com.google.firebase.remoteconfig.internal.a, com.google.firebase.remoteconfig.internal.c, eb.e, com.google.firebase.remoteconfig.internal.d):com.google.firebase.remoteconfig.a");
    }

    public final com.google.firebase.remoteconfig.internal.a b(String str, String str2) {
        f fVar;
        com.google.firebase.remoteconfig.internal.a aVar;
        String format = String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f13238h, str, str2});
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Context context = this.f13232b;
        Map<String, f> map = f.f17828c;
        synchronized (f.class) {
            Map<String, f> map2 = f.f17828c;
            if (!((HashMap) map2).containsKey(format)) {
                ((HashMap) map2).put(format, new f(context, format));
            }
            fVar = (f) ((HashMap) map2).get(format);
        }
        Map<String, com.google.firebase.remoteconfig.internal.a> map3 = com.google.firebase.remoteconfig.internal.a.f9770d;
        synchronized (com.google.firebase.remoteconfig.internal.a.class) {
            String str3 = fVar.f17830b;
            Map<String, com.google.firebase.remoteconfig.internal.a> map4 = com.google.firebase.remoteconfig.internal.a.f9770d;
            if (!((HashMap) map4).containsKey(str3)) {
                ((HashMap) map4).put(str3, new com.google.firebase.remoteconfig.internal.a(newCachedThreadPool, fVar));
            }
            aVar = (com.google.firebase.remoteconfig.internal.a) ((HashMap) map4).get(str3);
        }
        return aVar;
    }

    public a c() {
        a a10;
        synchronized (this) {
            com.google.firebase.remoteconfig.internal.a b10 = b("firebase", "fetch");
            com.google.firebase.remoteconfig.internal.a b11 = b("firebase", "activate");
            com.google.firebase.remoteconfig.internal.a b12 = b("firebase", "defaults");
            d dVar = new d(this.f13232b.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.f13238h, "firebase", "settings"}), 0));
            e eVar = new e(this.f13233c, b11, b12);
            com.google.firebase.a aVar = this.f13234d;
            ua.a<ja.a> aVar2 = this.f13237g;
            aVar.a();
            g gVar = aVar.f9663b.equals("[DEFAULT]") ? new g(aVar2) : null;
            if (gVar != null) {
                h hVar = new h(gVar);
                synchronized (eVar.f17824a) {
                    eVar.f17824a.add(hVar);
                }
            }
            a10 = a(this.f13234d, "firebase", this.f13235e, this.f13236f, this.f13233c, b10, b11, b12, d("firebase", b10, dVar), eVar, dVar);
        }
        return a10;
    }

    public synchronized com.google.firebase.remoteconfig.internal.c d(String str, com.google.firebase.remoteconfig.internal.a aVar, d dVar) {
        com.google.firebase.remoteconfig.internal.c cVar;
        d dVar2 = dVar;
        synchronized (this) {
            c cVar2 = this.f13235e;
            ua.a aVar2 = e(this.f13234d) ? this.f13237g : la.i.f21201c;
            ExecutorService executorService = this.f13233c;
            z7.e eVar = z7.e.f28726a;
            Random random = f13230j;
            com.google.firebase.a aVar3 = this.f13234d;
            aVar3.a();
            String str2 = aVar3.f9664c.f18332a;
            com.google.firebase.a aVar4 = this.f13234d;
            aVar4.a();
            cVar = new com.google.firebase.remoteconfig.internal.c(cVar2, aVar2, executorService, eVar, random, aVar, new ConfigFetchHttpClient(this.f13232b, aVar4.f9664c.f18333b, str2, str, dVar2.f9797a.getLong("fetch_timeout_in_seconds", 60), dVar2.f9797a.getLong("fetch_timeout_in_seconds", 60)), dVar, this.f13239i);
        }
        return cVar;
    }
}
