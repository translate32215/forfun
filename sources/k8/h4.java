package k8;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import cb.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s.a;
import s.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class h4 implements k4 {

    /* renamed from: g  reason: collision with root package name */
    public static final Map<Uri, h4> f20232g = new a();

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f20233h = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f20234a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f20235b;

    /* renamed from: c  reason: collision with root package name */
    public final ContentObserver f20236c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f20237d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile Map<String, String> f20238e;

    /* renamed from: f  reason: collision with root package name */
    public final List<i4> f20239f = new ArrayList();

    public h4(ContentResolver contentResolver, Uri uri) {
        g4 g4Var = new g4(this);
        this.f20236c = g4Var;
        contentResolver.getClass();
        uri.getClass();
        this.f20234a = contentResolver;
        this.f20235b = uri;
        contentResolver.registerContentObserver(uri, false, g4Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|10)|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k8.h4 b(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<k8.h4> r0 = k8.h4.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, k8.h4> r1 = f20232g     // Catch:{ all -> 0x001b }
            r2 = r1
            s.i r2 = (s.i) r2     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x001b }
            k8.h4 r2 = (k8.h4) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x001e
            k8.h4 r3 = new k8.h4     // Catch:{ SecurityException -> 0x001e }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x001e }
            s.i r1 = (s.i) r1     // Catch:{ SecurityException -> 0x001d }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x001d }
            goto L_0x001d
        L_0x001b:
            r4 = move-exception
            goto L_0x0020
        L_0x001d:
            r2 = r3
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return r2
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.h4.b(android.content.ContentResolver, android.net.Uri):k8.h4");
    }

    public static synchronized void d() {
        synchronized (h4.class) {
            for (h4 h4Var : ((a) f20232g).values()) {
                h4Var.f20234a.unregisterContentObserver(h4Var.f20236c);
            }
            ((i) f20232g).clear();
        }
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return c().get(str);
    }

    /* JADX INFO: finally extract failed */
    public final Map<String, String> c() {
        Map<String, String> map;
        Map<String, String> map2 = this.f20238e;
        if (map2 == null) {
            synchronized (this.f20237d) {
                map2 = this.f20238e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) e.a.g(new d(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f20238e = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }
}
