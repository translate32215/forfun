package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.j9;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final /* synthetic */ class v implements n40, j9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17009a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f17010b;

    public v(Context context, int i10) {
        this.f17009a = i10;
        if (i10 == 1) {
            this.f17010b = context;
        } else if (i10 != 2) {
            this.f17010b = context;
        } else {
            this.f17010b = context;
        }
    }

    public void F(Object obj) {
        switch (this.f17009a) {
            case 1:
                ((bj) obj).w(this.f17010b);
                return;
            default:
                ((bj) obj).m(this.f17010b);
                return;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get() {
        /*
            r7 = this;
            android.content.Context r0 = r7.f17010b
            e8.ti0 r1 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r1 = r1.f16769f
            boolean r2 = r1.f6255c
            if (r2 == 0) goto L_0x000b
            goto L_0x0075
        L_0x000b:
            java.lang.Object r2 = r1.f6253a
            monitor-enter(r2)
            boolean r3 = r1.f6255c     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
            goto L_0x0075
        L_0x0014:
            boolean r3 = r1.f6256d     // Catch:{ all -> 0x0080 }
            r4 = 1
            if (r3 != 0) goto L_0x001b
            r1.f6256d = r4     // Catch:{ all -> 0x0080 }
        L_0x001b:
            android.content.Context r3 = r0.getApplicationContext()     // Catch:{ all -> 0x0080 }
            if (r3 != 0) goto L_0x0023
            r3 = r0
            goto L_0x0027
        L_0x0023:
            android.content.Context r3 = r0.getApplicationContext()     // Catch:{ all -> 0x0080 }
        L_0x0027:
            r1.f6259g = r3     // Catch:{ all -> 0x0080 }
            b8.b r3 = b8.c.a(r3)     // Catch:{ NameNotFoundException | NullPointerException -> 0x003d }
            android.content.Context r5 = r1.f6259g     // Catch:{ NameNotFoundException | NullPointerException -> 0x003d }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException | NullPointerException -> 0x003d }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r3.a(r5, r6)     // Catch:{ NameNotFoundException | NullPointerException -> 0x003d }
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException | NullPointerException -> 0x003d }
            r1.f6258f = r3     // Catch:{ NameNotFoundException | NullPointerException -> 0x003d }
        L_0x003d:
            r3 = 0
            android.content.Context r5 = s7.i.a(r0)     // Catch:{ all -> 0x0077 }
            if (r5 != 0) goto L_0x004d
            android.content.Context r5 = r0.getApplicationContext()     // Catch:{ all -> 0x0077 }
            if (r5 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r5
        L_0x004c:
            r5 = r0
        L_0x004d:
            e8.ti0 r0 = e8.ti0.f16763j     // Catch:{ all -> 0x0077 }
            e8.s r0 = r0.f16768e     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "google_ads_flags"
            android.content.SharedPreferences r0 = r5.getSharedPreferences(r0, r3)     // Catch:{ all -> 0x0077 }
            r1.f6257e = r0     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x005e
            r0.registerOnSharedPreferenceChangeListener(r1)     // Catch:{ all -> 0x0077 }
        L_0x005e:
            e8.u r0 = new e8.u     // Catch:{ all -> 0x0077 }
            r0.<init>(r1)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReference<e8.h1> r5 = e8.j1.f15083a     // Catch:{ all -> 0x0077 }
            r5.set(r0)     // Catch:{ all -> 0x0077 }
            r1.b()     // Catch:{ all -> 0x0077 }
            r1.f6255c = r4     // Catch:{ all -> 0x0077 }
            r1.f6256d = r3     // Catch:{ all -> 0x0080 }
            android.os.ConditionVariable r0 = r1.f6254b     // Catch:{ all -> 0x0080 }
            r0.open()     // Catch:{ all -> 0x0080 }
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
        L_0x0075:
            r0 = 0
            return r0
        L_0x0077:
            r0 = move-exception
            r1.f6256d = r3     // Catch:{ all -> 0x0080 }
            android.os.ConditionVariable r1 = r1.f6254b     // Catch:{ all -> 0x0080 }
            r1.open()     // Catch:{ all -> 0x0080 }
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0080 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.v.get():java.lang.Object");
    }
}
