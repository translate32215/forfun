package ja;

import android.os.Bundle;
import b2.t;
import com.google.android.gms.common.internal.i;
import ja.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k8.d1;
import k8.s1;

/* compiled from: com.google.android.gms:play-services-measurement-api@@19.0.2 */
public class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f19696b;

    /* renamed from: a  reason: collision with root package name */
    public final t f19697a;

    public b(t tVar) {
        if (tVar != null) {
            this.f19697a = tVar;
            new ConcurrentHashMap();
            return;
        }
        throw new NullPointerException("null reference");
    }

    public Map<String, Object> a(boolean z10) {
        return ((s1) this.f19697a.f3445b).k((String) null, (String) null, z10);
    }

    public List<a.C0168a> b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle next : ((s1) this.f19697a.f3445b).j(str, str2)) {
            List<String> list = ka.b.f20574a;
            Class cls = Long.class;
            Class cls2 = String.class;
            if (next != null) {
                a.C0168a aVar = new a.C0168a();
                String str3 = (String) u.b.g(next, "origin", cls2, null);
                i.h(str3);
                aVar.f19681a = str3;
                String str4 = (String) u.b.g(next, "name", cls2, null);
                i.h(str4);
                aVar.f19682b = str4;
                aVar.f19683c = u.b.g(next, "value", Object.class, null);
                aVar.f19684d = (String) u.b.g(next, "trigger_event_name", cls2, null);
                aVar.f19685e = ((Long) u.b.g(next, "trigger_timeout", cls, 0L)).longValue();
                aVar.f19686f = (String) u.b.g(next, "timed_out_event_name", cls2, null);
                aVar.f19687g = (Bundle) u.b.g(next, "timed_out_event_params", Bundle.class, null);
                aVar.f19688h = (String) u.b.g(next, "triggered_event_name", cls2, null);
                aVar.f19689i = (Bundle) u.b.g(next, "triggered_event_params", Bundle.class, null);
                aVar.f19690j = ((Long) u.b.g(next, "time_to_live", cls, 0L)).longValue();
                aVar.f19691k = (String) u.b.g(next, "expired_event_name", cls2, null);
                aVar.f19692l = (Bundle) u.b.g(next, "expired_event_params", Bundle.class, null);
                aVar.f19694n = ((Boolean) u.b.g(next, "active", Boolean.class, Boolean.FALSE)).booleanValue();
                aVar.f19693m = ((Long) u.b.g(next, "creation_timestamp", cls, 0L)).longValue();
                aVar.f19695o = ((Long) u.b.g(next, "triggered_timestamp", cls, 0L)).longValue();
                arrayList.add(aVar);
            } else {
                throw new NullPointerException("null reference");
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        if (r2 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ IOException | ClassNotFoundException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055 A[Catch:{ IOException | ClassNotFoundException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(ja.a.C0168a r7) {
        /*
            r6 = this;
            java.util.List<java.lang.String> r0 = ka.b.f20574a
            if (r7 != 0) goto L_0x0006
            goto L_0x00b3
        L_0x0006:
            java.lang.String r0 = r7.f19681a
            if (r0 == 0) goto L_0x00b3
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0012
            goto L_0x00b3
        L_0x0012:
            java.lang.Object r1 = r7.f19683c
            if (r1 == 0) goto L_0x005b
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0047 }
            r3.<init>()     // Catch:{ all -> 0x0047 }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0047 }
            r4.<init>(r3)     // Catch:{ all -> 0x0047 }
            r4.writeObject(r1)     // Catch:{ all -> 0x0043 }
            r4.flush()     // Catch:{ all -> 0x0043 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0043 }
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0043 }
            byte[] r3 = r3.toByteArray()     // Catch:{ all -> 0x0043 }
            r5.<init>(r3)     // Catch:{ all -> 0x0043 }
            r1.<init>(r5)     // Catch:{ all -> 0x0043 }
            java.lang.Object r3 = r1.readObject()     // Catch:{ all -> 0x0041 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0051 }
            r1.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0051 }
            r2 = r3
            goto L_0x0059
        L_0x0041:
            r3 = move-exception
            goto L_0x004b
        L_0x0043:
            r1 = move-exception
            r3 = r1
            r1 = r2
            goto L_0x004b
        L_0x0047:
            r1 = move-exception
            r3 = r1
            r1 = r2
            r4 = r1
        L_0x004b:
            if (r4 == 0) goto L_0x0053
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0051 }
            goto L_0x0053
        L_0x0051:
            goto L_0x0059
        L_0x0053:
            if (r1 == 0) goto L_0x0058
            r1.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0051 }
        L_0x0058:
            throw r3     // Catch:{ IOException | ClassNotFoundException -> 0x0051 }
        L_0x0059:
            if (r2 == 0) goto L_0x00b3
        L_0x005b:
            boolean r1 = ka.b.c(r0)
            if (r1 != 0) goto L_0x0062
            goto L_0x00b3
        L_0x0062:
            java.lang.String r1 = r7.f19682b
            boolean r1 = ka.b.d(r0, r1)
            if (r1 != 0) goto L_0x006b
            goto L_0x00b3
        L_0x006b:
            java.lang.String r1 = r7.f19691k
            if (r1 == 0) goto L_0x0082
            android.os.Bundle r2 = r7.f19692l
            boolean r1 = ka.b.b(r1, r2)
            if (r1 != 0) goto L_0x0078
            goto L_0x00b3
        L_0x0078:
            java.lang.String r1 = r7.f19691k
            android.os.Bundle r2 = r7.f19692l
            boolean r1 = ka.b.a(r0, r1, r2)
            if (r1 == 0) goto L_0x00b3
        L_0x0082:
            java.lang.String r1 = r7.f19688h
            if (r1 == 0) goto L_0x0099
            android.os.Bundle r2 = r7.f19689i
            boolean r1 = ka.b.b(r1, r2)
            if (r1 != 0) goto L_0x008f
            goto L_0x00b3
        L_0x008f:
            java.lang.String r1 = r7.f19688h
            android.os.Bundle r2 = r7.f19689i
            boolean r1 = ka.b.a(r0, r1, r2)
            if (r1 == 0) goto L_0x00b3
        L_0x0099:
            java.lang.String r1 = r7.f19686f
            if (r1 == 0) goto L_0x00b1
            android.os.Bundle r2 = r7.f19687g
            boolean r1 = ka.b.b(r1, r2)
            if (r1 != 0) goto L_0x00a6
            goto L_0x00b3
        L_0x00a6:
            java.lang.String r1 = r7.f19686f
            android.os.Bundle r2 = r7.f19687g
            boolean r0 = ka.b.a(r0, r1, r2)
            if (r0 != 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r0 = 1
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            if (r0 != 0) goto L_0x00b7
            return
        L_0x00b7:
            b2.t r0 = r6.f19697a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r7.f19681a
            if (r2 == 0) goto L_0x00c7
            java.lang.String r3 = "origin"
            r1.putString(r3, r2)
        L_0x00c7:
            java.lang.String r2 = r7.f19682b
            if (r2 == 0) goto L_0x00d0
            java.lang.String r3 = "name"
            r1.putString(r3, r2)
        L_0x00d0:
            java.lang.Object r2 = r7.f19683c
            if (r2 == 0) goto L_0x00d7
            u.b.h(r1, r2)
        L_0x00d7:
            java.lang.String r2 = r7.f19684d
            if (r2 == 0) goto L_0x00e0
            java.lang.String r3 = "trigger_event_name"
            r1.putString(r3, r2)
        L_0x00e0:
            long r2 = r7.f19685e
            java.lang.String r4 = "trigger_timeout"
            r1.putLong(r4, r2)
            java.lang.String r2 = r7.f19686f
            if (r2 == 0) goto L_0x00f0
            java.lang.String r3 = "timed_out_event_name"
            r1.putString(r3, r2)
        L_0x00f0:
            android.os.Bundle r2 = r7.f19687g
            if (r2 == 0) goto L_0x00f9
            java.lang.String r3 = "timed_out_event_params"
            r1.putBundle(r3, r2)
        L_0x00f9:
            java.lang.String r2 = r7.f19688h
            if (r2 == 0) goto L_0x0102
            java.lang.String r3 = "triggered_event_name"
            r1.putString(r3, r2)
        L_0x0102:
            android.os.Bundle r2 = r7.f19689i
            if (r2 == 0) goto L_0x010b
            java.lang.String r3 = "triggered_event_params"
            r1.putBundle(r3, r2)
        L_0x010b:
            long r2 = r7.f19690j
            java.lang.String r4 = "time_to_live"
            r1.putLong(r4, r2)
            java.lang.String r2 = r7.f19691k
            if (r2 == 0) goto L_0x011b
            java.lang.String r3 = "expired_event_name"
            r1.putString(r3, r2)
        L_0x011b:
            android.os.Bundle r2 = r7.f19692l
            if (r2 == 0) goto L_0x0124
            java.lang.String r3 = "expired_event_params"
            r1.putBundle(r3, r2)
        L_0x0124:
            long r2 = r7.f19693m
            java.lang.String r4 = "creation_timestamp"
            r1.putLong(r4, r2)
            boolean r2 = r7.f19694n
            java.lang.String r3 = "active"
            r1.putBoolean(r3, r2)
            long r2 = r7.f19695o
            java.lang.String r7 = "triggered_timestamp"
            r1.putLong(r7, r2)
            java.lang.Object r7 = r0.f3445b
            k8.s1 r7 = (k8.s1) r7
            r7.getClass()
            k8.c1 r0 = new k8.c1
            r0.<init>((k8.s1) r7, (android.os.Bundle) r1)
            java.util.concurrent.ExecutorService r7 = r7.f20455a
            r7.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.b.c(ja.a$a):void");
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        s1 s1Var = (s1) this.f19697a.f3445b;
        s1Var.getClass();
        s1Var.f20455a.execute(new d1(s1Var, str, (String) null, (Bundle) null));
    }

    public void d(String str, String str2, Object obj) {
        if (ka.b.c(str) && ka.b.d(str, str2)) {
            this.f19697a.W(str, str2, obj);
        }
    }

    public int e(String str) {
        return ((s1) this.f19697a.f3445b).b(str);
    }

    public void w0(String str, String str2, Bundle bundle) {
        if (ka.b.c(str) && ka.b.b(str2, bundle) && ka.b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            ((s1) this.f19697a.f3445b).l(str, str2, bundle);
        }
    }
}
