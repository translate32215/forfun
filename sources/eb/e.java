package eb;

import com.google.firebase.remoteconfig.internal.b;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import z7.a;

/* compiled from: ConfigGetParameterHandler */
public class e {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f17823e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Set<a<String, b>> f17824a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f17825b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f17826c;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f17827d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public e(Executor executor, com.google.firebase.remoteconfig.internal.a aVar, com.google.firebase.remoteconfig.internal.a aVar2) {
        this.f17825b = executor;
        this.f17826c = aVar;
        this.f17827d = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return (com.google.firebase.remoteconfig.internal.b) com.google.firebase.remoteconfig.internal.a.a(r3.b(), 5, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.remoteconfig.internal.b a(com.google.firebase.remoteconfig.internal.a r3) {
        /*
            monitor-enter(r3)
            s8.i<com.google.firebase.remoteconfig.internal.b> r0 = r3.f9774c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.l()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0015
            s8.i<com.google.firebase.remoteconfig.internal.b> r0 = r3.f9774c     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = r0.h()     // Catch:{ all -> 0x0034 }
            com.google.firebase.remoteconfig.internal.b r0 = (com.google.firebase.remoteconfig.internal.b) r0     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            goto L_0x0033
        L_0x0015:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            s8.i r3 = r3.b()     // Catch:{ InterruptedException -> 0x002a, ExecutionException -> 0x0028, TimeoutException -> 0x0026 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x002a, ExecutionException -> 0x0028, TimeoutException -> 0x0026 }
            r1 = 5
            java.lang.Object r3 = com.google.firebase.remoteconfig.internal.a.a(r3, r1, r0)     // Catch:{ InterruptedException -> 0x002a, ExecutionException -> 0x0028, TimeoutException -> 0x0026 }
            r0 = r3
            com.google.firebase.remoteconfig.internal.b r0 = (com.google.firebase.remoteconfig.internal.b) r0     // Catch:{ InterruptedException -> 0x002a, ExecutionException -> 0x0028, TimeoutException -> 0x0026 }
            goto L_0x0033
        L_0x0026:
            r3 = move-exception
            goto L_0x002b
        L_0x0028:
            r3 = move-exception
            goto L_0x002b
        L_0x002a:
            r3 = move-exception
        L_0x002b:
            java.lang.String r0 = "FirebaseRemoteConfig"
            java.lang.String r1 = "Reading from storage file failed."
            android.util.Log.d(r0, r1, r3)
            r0 = 0
        L_0x0033:
            return r0
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.e.a(com.google.firebase.remoteconfig.internal.a):com.google.firebase.remoteconfig.internal.b");
    }
}
