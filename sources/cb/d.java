package cb;

import a7.m;
import ab.q;
import ab.y;
import ab.z;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.activity.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.c;
import com.google.android.gms.internal.ads.t7;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.g;
import e8.hj0;
import e8.tc;
import j7.b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jd.a;
import k8.b5;
import k8.j4;
import o8.a3;
import o8.q3;
import o8.z5;
import org.json.JSONObject;
import s8.h;
import s8.i;
import s8.j;

/* compiled from: GlobalLibraryVersionRegistrar */
public class d implements a, tc, j4, b5, z5, h, s8.a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile d f4372c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4373a;

    /* renamed from: b  reason: collision with root package name */
    public Set<e> f4374b;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, a7.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(a7.m r2) {
        /*
            r1 = this;
            r0 = 5
            r1.f4373a = r0
            r1.<init>()
            r1.f4374b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(a7.m):void");
    }

    public j7.a a() {
        int optInt = ((JSONObject) this.f4374b).optInt("media_type", -1);
        if (optInt == 0) {
            return j7.a.DISPLAY;
        }
        if (optInt != 1) {
            return j7.a.UNKNOWN;
        }
        return j7.a.VIDEO;
    }

    public Set<e> b() {
        Set<e> unmodifiableSet;
        synchronized (this.f4374b) {
            unmodifiableSet = Collections.unmodifiableSet(this.f4374b);
        }
        return unmodifiableSet;
    }

    public String c() {
        if (b.f19625a[a().ordinal()] != 1) {
            return "javascript";
        }
        return null;
    }

    public void d(boolean z10) {
        t7 t7Var = ((com.google.android.gms.ads.internal.overlay.a) this.f4374b).f5627d;
        if (t7Var != null) {
            t7Var.h0();
        }
    }

    public Object e(i iVar) {
        ((q) this.f4374b).getClass();
        Bundle bundle = (Bundle) iVar.i(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String valueOf = String.valueOf(bundle);
                Log.w("FirebaseMessaging", e.a(new StringBuilder(valueOf.length() + 21), "Unexpected response: ", valueOf), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public i f(Object obj) {
        ArrayDeque arrayDeque;
        g gVar = (g) obj;
        com.google.firebase.messaging.e eVar = FirebaseMessaging.f9692m;
        gVar.getClass();
        y yVar = new y("S", (String) this.f4374b);
        z zVar = gVar.f9748i;
        synchronized (zVar) {
            zVar.f261b.a(yVar.f258c);
        }
        j jVar = new j();
        synchronized (gVar.f9745f) {
            String str = yVar.f258c;
            if (gVar.f9745f.containsKey(str)) {
                arrayDeque = gVar.f9745f.get(str);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                gVar.f9745f.put(str, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(jVar);
        }
        s8.z<TResult> zVar2 = jVar.f25035a;
        gVar.f();
        return zVar2;
    }

    public void g() {
        e.d.c((mb.h) this.f4374b);
        e.d.e((mb.h) this.f4374b);
        if (!((mb.h) this.f4374b).g()) {
            try {
                ((mb.h) this.f4374b).d();
            } catch (Exception unused) {
            }
        }
        if (((mb.h) this.f4374b).g()) {
            mb.h hVar = (mb.h) this.f4374b;
            if (!hVar.f21787i) {
                ob.e.f23667a.b(hVar.f21783e.f(), "publishImpressionEvent", new Object[0]);
                hVar.f21787i = true;
                return;
            }
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    public Object get() {
        switch (this.f4373a) {
            case 4:
                v4.a aVar = (v4.a) ((a) this.f4374b).get();
                HashMap hashMap = new HashMap();
                l4.d dVar = l4.d.DEFAULT;
                c.a.C0074a a10 = c.a.a();
                a10.b(30000);
                a10.c(86400000);
                hashMap.put(dVar, a10.a());
                l4.d dVar2 = l4.d.HIGHEST;
                c.a.C0074a a11 = c.a.a();
                a11.b(1000);
                a11.c(86400000);
                hashMap.put(dVar2, a11.a());
                l4.d dVar3 = l4.d.VERY_LOW;
                c.a.C0074a a12 = c.a.a();
                a12.b(86400000);
                a12.c(86400000);
                Set<c.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c.b[]{c.b.NETWORK_UNMETERED, c.b.DEVICE_IDLE})));
                b.C0073b bVar = (b.C0073b) a12;
                if (unmodifiableSet != null) {
                    bVar.f5021c = unmodifiableSet;
                    hashMap.put(dVar3, bVar.a());
                    if (aVar == null) {
                        throw new NullPointerException("missing required property: clock");
                    } else if (hashMap.keySet().size() >= l4.d.values().length) {
                        new HashMap();
                        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(aVar, hashMap);
                    } else {
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            default:
                return this.f4374b;
        }
    }

    public void h(y6.j jVar) {
        ((m) this.f4374b).getClass();
        try {
            if (!(jVar instanceof hj0)) {
                jVar.getClass();
                l0.e.E("Use MediaContent provided by UnifiedNativeAd.getMediaContent");
                return;
            }
            ((hj0) jVar).getClass();
            throw null;
        } catch (RemoteException e10) {
            l0.e.C("Unable to call setMediaContent on delegate", e10);
        }
    }

    public void i(int i10, String str, List<String> list, boolean z10, boolean z11) {
        a3 a3Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            a3Var = ((q3) this.f4374b).f8864a.d().f8804m;
        } else if (i11 != 1) {
            if (i11 == 3) {
                a3Var = ((q3) this.f4374b).f8864a.d().f8805n;
            } else if (i11 != 4) {
                a3Var = ((q3) this.f4374b).f8864a.d().f8803l;
            } else if (z10) {
                a3Var = ((q3) this.f4374b).f8864a.d().f8801j;
            } else if (!z11) {
                a3Var = ((q3) this.f4374b).f8864a.d().f8802k;
            } else {
                a3Var = ((q3) this.f4374b).f8864a.d().f8800i;
            }
        } else if (z10) {
            a3Var = ((q3) this.f4374b).f8864a.d().f8798g;
        } else if (!z11) {
            a3Var = ((q3) this.f4374b).f8864a.d().f8799h;
        } else {
            a3Var = ((q3) this.f4374b).f8864a.d().f8797f;
        }
        int size = list.size();
        if (size == 1) {
            a3Var.b(str, list.get(0));
        } else if (size == 2) {
            a3Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            a3Var.a(str);
        } else {
            a3Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0192 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object zza() {
        /*
            r14 = this;
            int r0 = r14.f4373a
            r1 = 1
            r2 = 0
            switch(r0) {
                case 10: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x005c
        L_0x0008:
            java.util.Set<cb.e> r0 = r14.f4374b
            k8.h4 r0 = (k8.h4) r0
            android.content.ContentResolver r3 = r0.f20234a
            android.net.Uri r4 = r0.f20235b
            java.lang.String[] r5 = k8.h4.f20233h
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8)
            if (r0 != 0) goto L_0x0020
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L_0x0056
        L_0x0020:
            int r3 = r0.getCount()     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x002f
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0057 }
            r0.close()
            r0 = r1
            goto L_0x0056
        L_0x002f:
            r4 = 256(0x100, float:3.59E-43)
            if (r3 > r4) goto L_0x0039
            s.a r4 = new s.a     // Catch:{ all -> 0x0057 }
            r4.<init>((int) r3)     // Catch:{ all -> 0x0057 }
            goto L_0x0040
        L_0x0039:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0057 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0057 }
        L_0x0040:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = r0.getString(r2)     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = r0.getString(r1)     // Catch:{ all -> 0x0057 }
            r4.put(r3, r5)     // Catch:{ all -> 0x0057 }
            goto L_0x0040
        L_0x0052:
            r0.close()
            r0 = r4
        L_0x0056:
            return r0
        L_0x0057:
            r1 = move-exception
            r0.close()
            throw r1
        L_0x005c:
            java.lang.String r0 = "HermeticFileOverrides"
            java.util.Set<cb.e> r3 = r14.f4374b
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = k8.w4.f20514f
            java.lang.String r4 = android.os.Build.TYPE
            java.lang.String r5 = android.os.Build.TAGS
            java.lang.String r6 = "eng"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L_0x0079
            java.lang.String r6 = "userdebug"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0079
            goto L_0x008a
        L_0x0079:
            java.lang.String r4 = "dev-keys"
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L_0x008e
            java.lang.String r4 = "test-keys"
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            k8.y4<java.lang.Object> r0 = k8.y4.f20558a
            goto L_0x019f
        L_0x008e:
            boolean r4 = k8.e4.a()
            if (r4 == 0) goto L_0x009e
            boolean r4 = r3.isDeviceProtectedStorage()
            if (r4 != 0) goto L_0x009e
            android.content.Context r3 = r3.createDeviceProtectedStorageContext()
        L_0x009e:
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x01a0 }
            java.io.File r5 = new java.io.File     // Catch:{ RuntimeException -> 0x00c1 }
            java.lang.String r6 = "phenotype_hermetic"
            java.io.File r3 = r3.getDir(r6, r2)     // Catch:{ RuntimeException -> 0x00c1 }
            java.lang.String r6 = "overrides.txt"
            r5.<init>(r3, r6)     // Catch:{ RuntimeException -> 0x00c1 }
            boolean r3 = r5.exists()     // Catch:{ all -> 0x01a0 }
            if (r3 == 0) goto L_0x00be
            k8.a5 r3 = new k8.a5     // Catch:{ all -> 0x01a0 }
            r3.<init>(r5)     // Catch:{ all -> 0x01a0 }
            goto L_0x00c9
        L_0x00be:
            k8.y4<java.lang.Object> r3 = k8.y4.f20558a     // Catch:{ all -> 0x01a0 }
            goto L_0x00c9
        L_0x00c1:
            r3 = move-exception
            java.lang.String r5 = "no data dir"
            android.util.Log.e(r0, r5, r3)     // Catch:{ all -> 0x01a0 }
            k8.y4<java.lang.Object> r3 = k8.y4.f20558a     // Catch:{ all -> 0x01a0 }
        L_0x00c9:
            boolean r5 = r3.b()     // Catch:{ all -> 0x01a0 }
            if (r5 == 0) goto L_0x019a
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x01a0 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x01a0 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0193 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0193 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0193 }
            r7.<init>(r3)     // Catch:{ IOException -> 0x0193 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0193 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0193 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x018e }
            r6.<init>()     // Catch:{ all -> 0x018e }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x018e }
            r7.<init>()     // Catch:{ all -> 0x018e }
        L_0x00ee:
            java.lang.String r8 = r5.readLine()     // Catch:{ all -> 0x018e }
            if (r8 == 0) goto L_0x0161
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch:{ all -> 0x018e }
            int r11 = r9.length     // Catch:{ all -> 0x018e }
            if (r11 == r10) goto L_0x0114
            java.lang.String r9 = "Invalid: "
            int r10 = r8.length()     // Catch:{ all -> 0x018e }
            if (r10 == 0) goto L_0x010b
            java.lang.String r8 = r9.concat(r8)     // Catch:{ all -> 0x018e }
            goto L_0x0110
        L_0x010b:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x018e }
            r8.<init>(r9)     // Catch:{ all -> 0x018e }
        L_0x0110:
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x018e }
            goto L_0x00ee
        L_0x0114:
            r8 = r9[r2]     // Catch:{ all -> 0x018e }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x018e }
            r10.<init>(r8)     // Catch:{ all -> 0x018e }
            r8 = r9[r1]     // Catch:{ all -> 0x018e }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x018e }
            r11.<init>(r8)     // Catch:{ all -> 0x018e }
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x018e }
            r11 = 2
            r12 = r9[r11]     // Catch:{ all -> 0x018e }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x018e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x018e }
            if (r12 != 0) goto L_0x0149
            r9 = r9[r11]     // Catch:{ all -> 0x018e }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x018e }
            r11.<init>(r9)     // Catch:{ all -> 0x018e }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x018e }
            int r9 = r12.length()     // Catch:{ all -> 0x018e }
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto L_0x0146
            if (r12 != r11) goto L_0x0149
        L_0x0146:
            r7.put(r11, r12)     // Catch:{ all -> 0x018e }
        L_0x0149:
            boolean r9 = r6.containsKey(r10)     // Catch:{ all -> 0x018e }
            if (r9 != 0) goto L_0x0157
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x018e }
            r9.<init>()     // Catch:{ all -> 0x018e }
            r6.put(r10, r9)     // Catch:{ all -> 0x018e }
        L_0x0157:
            java.lang.Object r9 = r6.get(r10)     // Catch:{ all -> 0x018e }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x018e }
            r9.put(r8, r12)     // Catch:{ all -> 0x018e }
            goto L_0x00ee
        L_0x0161:
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x018e }
            int r2 = r1.length()     // Catch:{ all -> 0x018e }
            int r2 = r2 + 7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x018e }
            r3.<init>(r2)     // Catch:{ all -> 0x018e }
            java.lang.String r2 = "Parsed "
            r3.append(r2)     // Catch:{ all -> 0x018e }
            r3.append(r1)     // Catch:{ all -> 0x018e }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x018e }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x018e }
            k8.n4 r0 = new k8.n4     // Catch:{ all -> 0x018e }
            r0.<init>(r6)     // Catch:{ all -> 0x018e }
            r5.close()     // Catch:{ IOException -> 0x0193 }
            k8.a5 r1 = new k8.a5     // Catch:{ all -> 0x01a0 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a0 }
            r0 = r1
            goto L_0x019c
        L_0x018e:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0192 }
        L_0x0192:
            throw r0     // Catch:{ IOException -> 0x0193 }
        L_0x0193:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x01a0 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a0 }
            throw r1     // Catch:{ all -> 0x01a0 }
        L_0x019a:
            k8.y4<java.lang.Object> r0 = k8.y4.f20558a     // Catch:{ all -> 0x01a0 }
        L_0x019c:
            android.os.StrictMode.setThreadPolicy(r4)
        L_0x019f:
            return r0
        L_0x01a0:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)
            goto L_0x01a6
        L_0x01a5:
            throw r0
        L_0x01a6:
            goto L_0x01a5
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.zza():java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, ab.q] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(ab.q r2) {
        /*
            r1 = this;
            r0 = 16
            r1.f4373a = r0
            r1.<init>()
            r1.f4374b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(ab.q):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, java.util.Set<cb.e>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 11
            r1.f4373a = r0
            r1.<init>()
            r1.f4374b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(android.content.Context):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, com.google.android.gms.ads.internal.overlay.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(com.google.android.gms.ads.internal.overlay.a r2) {
        /*
            r1 = this;
            r0 = 6
            r1.f4373a = r0
            r1.<init>()
            r1.f4374b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(com.google.android.gms.ads.internal.overlay.a):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, i8.j] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(i8.j r2) {
        /*
            r1 = this;
            r0 = 9
            r1.f4373a = r0
            r1.f4374b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(i8.j):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(java.lang.String r2) {
        /*
            r1 = this;
            r0 = 15
            r1.f4373a = r0
            r1.<init>()
            r1.f4374b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, k8.h4] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d(k8.h4 r2) {
        /*
            r1 = this;
            r0 = 10
            r1.f4373a = r0
            r1.<init>()
            r1.f4374b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(k8.h4):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, mb.h] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(mb.h r2) {
        /*
            r1 = this;
            r0 = 17
            r1.f4373a = r0
            r1.<init>()
            r1.f4374b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(mb.h):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [o8.q3, java.util.Set<cb.e>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(o8.q3 r2) {
        /*
            r1 = this;
            r0 = 12
            r1.f4373a = r0
            r1.f4374b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(o8.q3):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [o8.s4, java.util.Set<cb.e>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(o8.s4 r2) {
        /*
            r1 = this;
            r0 = 13
            r1.f4373a = r0
            r1.f4374b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(o8.s4):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, o8.u5] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(o8.u5 r2) {
        /*
            r1 = this;
            r0 = 14
            r1.f4373a = r0
            r1.f4374b = r2
            r1.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(o8.u5):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, org.json.JSONObject] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(org.json.JSONObject r2) {
        /*
            r1 = this;
            r0 = 8
            r1.f4373a = r0
            r1.<init>()
            r1.f4374b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(org.json.JSONObject):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Set<cb.e>, jd.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(jd.a r2) {
        /*
            r1 = this;
            r0 = 4
            r1.f4373a = r0
            r1.<init>()
            r1.f4374b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.d.<init>(jd.a):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Set<cb.e>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Set<cb.e>, java.util.HashMap] */
    public d(int i10) {
        this.f4373a = i10;
        if (i10 == 1) {
            this.f4374b = new ArrayDeque();
        } else if (i10 == 2) {
            this.f4374b = new HashMap();
        } else if (i10 == 7) {
        } else {
            if (i10 != 18) {
                this.f4374b = new HashSet();
            } else {
                this.f4374b = null;
            }
        }
    }
}
