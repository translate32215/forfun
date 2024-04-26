package qc;

import com.google.firebase.remoteconfig.a;
import ke.t;
import ud.k;

/* compiled from: HostInterceptor.kt */
public final class i implements t {

    /* renamed from: a  reason: collision with root package name */
    public final a f24274a;

    public i(a aVar) {
        k.f(aVar, "remoteConfig");
        this.f24274a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ke.d0 a(ke.t.a r13) {
        /*
            r12 = this;
            oe.f r13 = (oe.f) r13
            ke.z r0 = r13.f23704f
            com.google.firebase.remoteconfig.a r1 = r12.f24274a
            java.lang.String r2 = "defaults"
            eb.e r1 = r1.f9759h
            com.google.firebase.remoteconfig.internal.a r3 = r1.f17826c
            com.google.firebase.remoteconfig.internal.b r3 = eb.e.a(r3)
            r4 = 0
            if (r3 != 0) goto L_0x0014
            goto L_0x001b
        L_0x0014:
            org.json.JSONObject r3 = r3.f9778b     // Catch:{ JSONException -> 0x001b }
            java.lang.String r3 = r3.getString(r2)     // Catch:{ JSONException -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r3 = r4
        L_0x001c:
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x004e
            com.google.firebase.remoteconfig.internal.a r4 = r1.f17826c
            com.google.firebase.remoteconfig.internal.b r4 = eb.e.a(r4)
            if (r4 != 0) goto L_0x0029
            goto L_0x0079
        L_0x0029:
            java.util.Set<z7.a<java.lang.String, com.google.firebase.remoteconfig.internal.b>> r7 = r1.f17824a
            monitor-enter(r7)
            java.util.Set<z7.a<java.lang.String, com.google.firebase.remoteconfig.internal.b>> r8 = r1.f17824a     // Catch:{ all -> 0x004b }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x004b }
        L_0x0032:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x004b }
            if (r9 == 0) goto L_0x0049
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x004b }
            z7.a r9 = (z7.a) r9     // Catch:{ all -> 0x004b }
            java.util.concurrent.Executor r10 = r1.f17825b     // Catch:{ all -> 0x004b }
            androidx.emoji2.text.f r11 = new androidx.emoji2.text.f     // Catch:{ all -> 0x004b }
            r11.<init>((z7.a) r9, (java.lang.String) r2, (com.google.firebase.remoteconfig.internal.b) r4)     // Catch:{ all -> 0x004b }
            r10.execute(r11)     // Catch:{ all -> 0x004b }
            goto L_0x0032
        L_0x0049:
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            goto L_0x0079
        L_0x004b:
            r13 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004b }
            throw r13
        L_0x004e:
            com.google.firebase.remoteconfig.internal.a r1 = r1.f17827d
            com.google.firebase.remoteconfig.internal.b r1 = eb.e.a(r1)
            if (r1 != 0) goto L_0x0057
            goto L_0x005f
        L_0x0057:
            org.json.JSONObject r1 = r1.f9778b     // Catch:{ JSONException -> 0x005e }
            java.lang.String r4 = r1.getString(r2)     // Catch:{ JSONException -> 0x005e }
            goto L_0x005f
        L_0x005e:
        L_0x005f:
            if (r4 == 0) goto L_0x0063
            r3 = r4
            goto L_0x0079
        L_0x0063:
            java.lang.String r1 = "String"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r1
            r3[r5] = r2
            java.lang.String r1 = "No value of type '%s' exists for parameter key '%s'."
            java.lang.String r1 = java.lang.String.format(r1, r3)
            java.lang.String r2 = "FirebaseRemoteConfig"
            android.util.Log.w(r2, r1)
            java.lang.String r3 = ""
        L_0x0079:
            int r1 = r3.length()
            if (r1 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r5 = 0
        L_0x0081:
            if (r5 == 0) goto L_0x008d
            ke.d0 r13 = r13.a(r0)
            java.lang.String r0 = "chain.proceed(request)"
            ud.k.e(r13, r0)
            return r13
        L_0x008d:
            ke.s r1 = r0.f20880a
            ke.s$a r1 = r1.k()
            r1.c(r3)
            ke.s r1 = r1.a()
            ke.z$a r2 = new ke.z$a
            r2.<init>(r0)
            r2.f20886a = r1
            ke.z r0 = r2.a()
            ne.f r1 = r13.f23700b
            oe.c r2 = r13.f23701c
            ne.c r3 = r13.f23702d
            ke.d0 r13 = r13.b(r0, r1, r2, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.i.a(ke.t$a):ke.d0");
    }
}
