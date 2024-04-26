package l0;

import l0.m;
import n0.a;

/* compiled from: FontRequestWorker */
public class l implements a<m.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20987a;

    public l(String str) {
        this.f20987a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 >= r2.size()) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        ((n0.a) r2.get(r0)).a(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r5) {
        /*
            r4 = this;
            l0.m$a r5 = (l0.m.a) r5
            java.lang.Object r0 = l0.m.f20990c
            monitor-enter(r0)
            s.i<java.lang.String, java.util.ArrayList<n0.a<l0.m$a>>> r1 = l0.m.f20991d     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r4.f20987a     // Catch:{ all -> 0x002d }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002d }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            goto L_0x002c
        L_0x0013:
            java.lang.String r3 = r4.f20987a     // Catch:{ all -> 0x002d }
            r1.remove(r3)     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            r0 = 0
        L_0x001a:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002c
            java.lang.Object r1 = r2.get(r0)
            n0.a r1 = (n0.a) r1
            r1.a(r5)
            int r0 = r0 + 1
            goto L_0x001a
        L_0x002c:
            return
        L_0x002d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x0030:
            throw r5
        L_0x0031:
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.l.a(java.lang.Object):void");
    }
}
