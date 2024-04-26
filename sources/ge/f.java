package ge;

import he.a;
import he.c;

/* compiled from: StateFlow.kt */
public final class f<T> extends a<Object> implements b<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: a  reason: collision with root package name */
    public int f18642a;

    public f(Object obj) {
        this._state = obj;
    }

    public boolean a(T t10) {
        setValue(t10);
        return true;
    }

    public T getValue() {
        T t10 = c.f18981a;
        T t11 = this._state;
        if (t11 == t10) {
            return null;
        }
        return t11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r1.f18642a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        if (r0 != r2) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        r1.f18642a = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setValue(T r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0004
            b2.t r2 = he.c.f18981a
        L_0x0004:
            monitor-enter(r1)
            java.lang.Object r0 = r1._state     // Catch:{ all -> 0x0033 }
            boolean r0 = ud.k.a(r0, r2)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r1)
            goto L_0x0032
        L_0x000f:
            r1._state = r2     // Catch:{ all -> 0x0033 }
            int r2 = r1.f18642a     // Catch:{ all -> 0x0033 }
            r0 = r2 & 1
            if (r0 != 0) goto L_0x002d
            int r2 = r2 + 1
            r1.f18642a = r2     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)
        L_0x001c:
            monitor-enter(r1)
            int r0 = r1.f18642a     // Catch:{ all -> 0x002a }
            if (r0 != r2) goto L_0x0027
            int r2 = r2 + 1
            r1.f18642a = r2     // Catch:{ all -> 0x002a }
            monitor-exit(r1)
            goto L_0x0032
        L_0x0027:
            monitor-exit(r1)
            r2 = r0
            goto L_0x001c
        L_0x002a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x002d:
            int r2 = r2 + 2
            r1.f18642a = r2     // Catch:{ all -> 0x0033 }
            monitor-exit(r1)
        L_0x0032:
            return
        L_0x0033:
            r2 = move-exception
            monitor-exit(r1)
            goto L_0x0037
        L_0x0036:
            throw r2
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.f.setValue(java.lang.Object):void");
    }
}
