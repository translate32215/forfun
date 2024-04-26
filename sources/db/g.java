package db;

import eb.f;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13227a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13228b;

    public /* synthetic */ g(i iVar) {
        this.f13228b = iVar;
    }

    public /* synthetic */ g(f fVar) {
        this.f13228b = fVar;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [com.google.firebase.remoteconfig.internal.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046 A[SYNTHETIC, Splitter:B:19:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[Catch:{ FileNotFoundException | JSONException -> 0x004a, all -> 0x0043 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            int r0 = r7.f13227a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x000f
        L_0x0006:
            java.lang.Object r0 = r7.f13228b
            db.i r0 = (db.i) r0
            com.google.firebase.remoteconfig.a r0 = r0.c()
            return r0
        L_0x000f:
            java.lang.Object r0 = r7.f13228b
            eb.f r0 = (eb.f) r0
            monitor-enter(r0)
            r1 = 0
            android.content.Context r2 = r0.f17829a     // Catch:{ FileNotFoundException | JSONException -> 0x004a, all -> 0x0043 }
            java.lang.String r3 = r0.f17830b     // Catch:{ FileNotFoundException | JSONException -> 0x004a, all -> 0x0043 }
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x004a, all -> 0x0043 }
            int r3 = r2.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0041, all -> 0x003c }
            byte[] r4 = new byte[r3]     // Catch:{ FileNotFoundException | JSONException -> 0x0041, all -> 0x003c }
            r5 = 0
            r2.read(r4, r5, r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0041, all -> 0x003c }
            java.lang.String r3 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0041, all -> 0x003c }
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch:{ FileNotFoundException | JSONException -> 0x0041, all -> 0x003c }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0041, all -> 0x003c }
            r4.<init>(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0041, all -> 0x003c }
            com.google.firebase.remoteconfig.internal.b r1 = com.google.firebase.remoteconfig.internal.b.a(r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0041, all -> 0x003c }
            r2.close()     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)
            goto L_0x0055
        L_0x003c:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0044
        L_0x0041:
            goto L_0x004b
        L_0x0043:
            r2 = move-exception
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ all -> 0x0051 }
        L_0x0049:
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x004a:
            r2 = r1
        L_0x004b:
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0054
        L_0x0051:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0054:
            monitor-exit(r0)
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: db.g.call():java.lang.Object");
    }
}
