package com.google.android.gms.internal.ads;

import android.content.Context;
import e8.y;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public BlockingQueue<k> f6337a = new ArrayBlockingQueue(100);

    /* renamed from: b  reason: collision with root package name */
    public LinkedHashMap<String, String> f6338b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, y> f6339c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public String f6340d;

    /* renamed from: e  reason: collision with root package name */
    public Context f6341e;

    /* renamed from: f  reason: collision with root package name */
    public String f6342f;

    /* renamed from: g  reason: collision with root package name */
    public final HashSet<String> f6343g = new HashSet<>(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));

    /* renamed from: h  reason: collision with root package name */
    public AtomicBoolean f6344h;

    /* renamed from: i  reason: collision with root package name */
    public File f6345i;

    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            String str3 = (String) linkedHashMap.get(str);
            y yVar = this.f6339c.get(str);
            if (yVar == null) {
                yVar = y.f17540a;
            }
            linkedHashMap.put(str, yVar.a(str3, str2));
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009f A[SYNTHETIC, Splitter:B:37:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ab A[SYNTHETIC, Splitter:B:43:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.Map<java.lang.String, java.lang.String> r5, e8.b0 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.f6340d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            android.net.Uri r5 = r1.build()
            java.lang.String r5 = r5.toString()
            if (r6 != 0) goto L_0x003b
            goto L_0x0068
        L_0x003b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r5 = r6.f13860a
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0052
            java.lang.String r5 = "&it="
            r1.append(r5)
            java.lang.String r5 = r6.f13860a
            r1.append(r5)
        L_0x0052:
            java.lang.String r5 = r6.f13861b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0064
            java.lang.String r5 = "&blat="
            r1.append(r5)
            java.lang.String r5 = r6.f13861b
            r1.append(r5)
        L_0x0064:
            java.lang.String r5 = r1.toString()
        L_0x0068:
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.f6344h
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00ba
            java.io.File r6 = r4.f6345i
            if (r6 == 0) goto L_0x00b4
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0097 }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x0097 }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x0092, all -> 0x0090 }
            r2.write(r5)     // Catch:{ IOException -> 0x0092, all -> 0x0090 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x0092, all -> 0x0090 }
            r2.close()     // Catch:{ IOException -> 0x008b }
            return
        L_0x008b:
            r5 = move-exception
            l0.e.D(r0, r5)
            return
        L_0x0090:
            r5 = move-exception
            goto L_0x00a9
        L_0x0092:
            r5 = move-exception
            r1 = r2
            goto L_0x0098
        L_0x0095:
            r5 = move-exception
            goto L_0x00a8
        L_0x0097:
            r5 = move-exception
        L_0x0098:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            l0.e.D(r6, r5)     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x00a7
            r1.close()     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00a7
        L_0x00a3:
            r5 = move-exception
            l0.e.D(r0, r5)
        L_0x00a7:
            return
        L_0x00a8:
            r2 = r1
        L_0x00a9:
            if (r2 == 0) goto L_0x00b3
            r2.close()     // Catch:{ IOException -> 0x00af }
            goto L_0x00b3
        L_0x00af:
            r6 = move-exception
            l0.e.D(r0, r6)
        L_0x00b3:
            throw r5
        L_0x00b4:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            l0.e.K(r5)
            return
        L_0x00ba:
            d7.l r6 = d7.l.B
            com.google.android.gms.ads.internal.util.p r6 = r6.f13186c
            android.content.Context r6 = r4.f6341e
            java.lang.String r0 = r4.f6342f
            com.google.android.gms.ads.internal.util.p.r(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f.b(java.util.Map, e8.b0):void");
    }
}
