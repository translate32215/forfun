package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.c;
import c8.a;
import c8.b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import g2.a;
import g2.b;
import g2.f;
import h2.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l0.e;
import o2.j;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class WorkManagerUtil extends h {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzap(c8.a r5) {
        /*
            r4 = this;
            java.lang.Object r5 = c8.b.z0(r5)
            android.content.Context r5 = (android.content.Context) r5
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ IllegalStateException -> 0x0017 }
            g2.a$a r1 = new g2.a$a     // Catch:{ IllegalStateException -> 0x0017 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0017 }
            g2.a r2 = new g2.a     // Catch:{ IllegalStateException -> 0x0017 }
            r2.<init>(r1)     // Catch:{ IllegalStateException -> 0x0017 }
            h2.h.d(r0, r2)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0017:
            h2.h r5 = h2.h.c(r5)     // Catch:{ IllegalStateException -> 0x005a }
            r5.getClass()
            p2.a r0 = new p2.a
            java.lang.String r1 = "offline_ping_sender_work"
            r0.<init>(r5, r1)
            r2.a r2 = r5.f18831d
            r2.b r2 = (r2.b) r2
            java.util.concurrent.Executor r2 = r2.f24500a
            r2.execute(r0)
            g2.b$a r0 = new g2.b$a
            r0.<init>()
            androidx.work.c r2 = androidx.work.c.CONNECTED
            r0.f18402a = r2
            g2.b r2 = new g2.b
            r2.<init>((g2.b.a) r0)
            g2.f$a r0 = new g2.f$a
            java.lang.Class<com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender> r3 = com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender.class
            r0.<init>(r3)
            o2.j r3 = r0.f18417b
            r3.f22873j = r2
            java.util.Set<java.lang.String> r2 = r0.f18418c
            r2.add(r1)
            g2.i r0 = r0.a()
            g2.f r0 = (g2.f) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r5.b(r0)
            return
        L_0x005a:
            r5 = move-exception
            java.lang.String r0 = "Failed to instantiate WorkManager."
            l0.e.D(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.WorkManagerUtil.zzap(c8.a):void");
    }

    public final boolean zzd(a aVar, String str, String str2) {
        Context context = (Context) b.z0(aVar);
        try {
            h.d(context.getApplicationContext(), new g2.a(new a.C0142a()));
        } catch (IllegalStateException unused) {
        }
        b.a aVar2 = new b.a();
        aVar2.f18402a = c.CONNECTED;
        g2.b bVar = new g2.b(aVar2);
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", str2);
        androidx.work.b bVar2 = new androidx.work.b((Map<String, ?>) hashMap);
        androidx.work.b.c(bVar2);
        f.a aVar3 = new f.a(OfflineNotificationPoster.class);
        j jVar = aVar3.f18417b;
        jVar.f22873j = bVar;
        jVar.f22868e = bVar2;
        aVar3.f18418c.add("offline_notification_work");
        f fVar = (f) aVar3.a();
        try {
            h c10 = h.c(context);
            c10.getClass();
            c10.b(Collections.singletonList(fVar));
            return true;
        } catch (IllegalStateException e10) {
            e.D("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
