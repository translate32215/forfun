package s;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: LruCache */
public class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f24822a;

    /* renamed from: b  reason: collision with root package name */
    public int f24823b;

    /* renamed from: c  reason: collision with root package name */
    public int f24824c;

    /* renamed from: d  reason: collision with root package name */
    public int f24825d;

    /* renamed from: e  reason: collision with root package name */
    public int f24826e;

    /* renamed from: f  reason: collision with root package name */
    public int f24827f;

    /* renamed from: g  reason: collision with root package name */
    public int f24828g;

    /* renamed from: h  reason: collision with root package name */
    public int f24829h;

    public g(int i10) {
        if (i10 > 0) {
            this.f24824c = i10;
            this.f24822a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V a(K k10) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f24826e++;
        r1 = r3.f24822a.put(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r3.f24822a.put(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r3.f24823b++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        e(r3.f24824c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V b(K r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x004d
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r0 = r3.f24822a     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0013
            int r4 = r3.f24828g     // Catch:{ all -> 0x004a }
            int r4 = r4 + 1
            r3.f24828g = r4     // Catch:{ all -> 0x004a }
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            return r0
        L_0x0013:
            int r0 = r3.f24829h     // Catch:{ all -> 0x004a }
            int r0 = r0 + 1
            r3.f24829h = r0     // Catch:{ all -> 0x004a }
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r3.a(r4)
            if (r0 != 0) goto L_0x0022
            r4 = 0
            return r4
        L_0x0022:
            monitor-enter(r3)
            int r1 = r3.f24826e     // Catch:{ all -> 0x0047 }
            int r1 = r1 + 1
            r3.f24826e = r1     // Catch:{ all -> 0x0047 }
            java.util.LinkedHashMap<K, V> r1 = r3.f24822a     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r1.put(r4, r0)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0037
            java.util.LinkedHashMap<K, V> r2 = r3.f24822a     // Catch:{ all -> 0x0047 }
            r2.put(r4, r1)     // Catch:{ all -> 0x0047 }
            goto L_0x003d
        L_0x0037:
            int r4 = r3.f24823b     // Catch:{ all -> 0x0047 }
            int r4 = r4 + 1
            r3.f24823b = r4     // Catch:{ all -> 0x0047 }
        L_0x003d:
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0041
            return r1
        L_0x0041:
            int r4 = r3.f24824c
            r3.e(r4)
            return r0
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            throw r4
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        L_0x004d:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s.g.b(java.lang.Object):java.lang.Object");
    }

    public final V c(K k10, V v10) {
        V put;
        if (k10 == null || v10 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f24825d++;
            this.f24823b++;
            put = this.f24822a.put(k10, v10);
            if (put != null) {
                this.f24823b--;
            }
        }
        e(this.f24824c);
        return put;
    }

    public final V d(K k10) {
        V remove;
        if (k10 != null) {
            synchronized (this) {
                remove = this.f24822a.remove(k10);
                if (remove != null) {
                    this.f24823b--;
                }
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f24823b     // Catch:{ all -> 0x0069 }
            if (r0 < 0) goto L_0x004a
            java.util.LinkedHashMap<K, V> r0 = r2.f24822a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0011
            int r0 = r2.f24823b     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x004a
        L_0x0011:
            int r0 = r2.f24823b     // Catch:{ all -> 0x0069 }
            if (r0 <= r3) goto L_0x0048
            java.util.LinkedHashMap<K, V> r0 = r2.f24822a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0048
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r2.f24822a     // Catch:{ all -> 0x0069 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0069 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0069 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0069 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0069 }
            r0.getValue()     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashMap<K, V> r0 = r2.f24822a     // Catch:{ all -> 0x0069 }
            r0.remove(r1)     // Catch:{ all -> 0x0069 }
            int r0 = r2.f24823b     // Catch:{ all -> 0x0069 }
            int r0 = r0 + -1
            r2.f24823b = r0     // Catch:{ all -> 0x0069 }
            int r0 = r2.f24827f     // Catch:{ all -> 0x0069 }
            int r0 = r0 + 1
            r2.f24827f = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x0000
        L_0x0048:
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            return
        L_0x004a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r0.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0069 }
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0069 }
            r3.<init>(r0)     // Catch:{ all -> 0x0069 }
            throw r3     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x006d
        L_0x006c:
            throw r3
        L_0x006d:
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: s.g.e(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f24828g;
        i11 = this.f24829h + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f24824c), Integer.valueOf(this.f24828g), Integer.valueOf(this.f24829h), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0)});
    }
}
