package n3;

import android.util.Log;
import e.e;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool */
public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final h<a, Object> f21867a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f21868b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f21869c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, a<?>> f21870d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f21871e;

    /* renamed from: f  reason: collision with root package name */
    public int f21872f;

    /* compiled from: LruArrayPool */
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final b f21873a;

        /* renamed from: b  reason: collision with root package name */
        public int f21874b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f21875c;

        public a(b bVar) {
            this.f21873a = bVar;
        }

        public void a() {
            this.f21873a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f21874b == aVar.f21874b && this.f21875c == aVar.f21875c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f21874b * 31;
            Class<?> cls = this.f21875c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("Key{size=");
            a10.append(this.f21874b);
            a10.append("array=");
            a10.append(this.f21875c);
            a10.append('}');
            return a10.toString();
        }
    }

    /* compiled from: LruArrayPool */
    public static final class b extends d<a> {
        public m a() {
            return new a(this);
        }

        public a t(int i10, Class<?> cls) {
            a aVar = (a) b();
            aVar.f21874b = i10;
            aVar.f21875c = cls;
            return aVar;
        }
    }

    public j(int i10) {
        this.f21871e = i10;
    }

    public final void a(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = (Integer) i11.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        } else if (num.intValue() == 1) {
            i11.remove(Integer.valueOf(i10));
        } else {
            i11.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void b(int i10) {
        while (this.f21872f > i10) {
            Object c10 = this.f21867a.c();
            e.b(c10);
            a<?> g10 = g(c10.getClass());
            this.f21872f -= g10.c() * g10.b(c10);
            a(g10.b(c10), c10.getClass());
            if (Log.isLoggable(g10.a(), 2)) {
                String a10 = g10.a();
                StringBuilder a11 = android.support.v4.media.a.a("evicted: ");
                a11.append(g10.b(c10));
                Log.v(a10, a11.toString());
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void c(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto L_0x000f
            monitor-enter(r1)     // Catch:{ all -> 0x0020 }
            r2 = 0
            r1.b(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x001e
        L_0x000c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x000f:
            r0 = 20
            if (r2 >= r0) goto L_0x0017
            r0 = 15
            if (r2 != r0) goto L_0x001e
        L_0x0017:
            int r2 = r1.f21871e     // Catch:{ all -> 0x0020 }
            int r2 = r2 / 2
            r1.b(r2)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.j.c(int):void");
    }

    public synchronized void d() {
        b(0);
    }

    public synchronized <T> T e(int i10, Class<T> cls) {
        a aVar;
        aVar = (a) this.f21868b.b();
        aVar.f21874b = i10;
        aVar.f21875c = cls;
        return h(aVar, cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T f(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.i(r7)     // Catch:{ all -> 0x004d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x004d }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x004d }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f21872f     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.f21871e     // Catch:{ all -> 0x004d }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = 0
            goto L_0x0021
        L_0x0020:
            r3 = 1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x004d }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x003a
            n3.j$b r6 = r5.f21868b     // Catch:{ all -> 0x004d }
            int r0 = r0.intValue()     // Catch:{ all -> 0x004d }
            n3.j$a r6 = r6.t(r0, r7)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x003a:
            n3.j$b r0 = r5.f21868b     // Catch:{ all -> 0x004d }
            n3.m r0 = r0.b()     // Catch:{ all -> 0x004d }
            n3.j$a r0 = (n3.j.a) r0     // Catch:{ all -> 0x004d }
            r0.f21874b = r6     // Catch:{ all -> 0x004d }
            r0.f21875c = r7     // Catch:{ all -> 0x004d }
            r6 = r0
        L_0x0047:
            java.lang.Object r6 = r5.h(r6, r7)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r6
        L_0x004d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.j.f(int, java.lang.Class):java.lang.Object");
    }

    public final <T> a<T> g(Class<T> cls) {
        a<T> aVar = this.f21870d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new i();
            } else if (cls.equals(byte[].class)) {
                aVar = new g();
            } else {
                StringBuilder a10 = android.support.v4.media.a.a("No array pool found for: ");
                a10.append(cls.getSimpleName());
                throw new IllegalArgumentException(a10.toString());
            }
            this.f21870d.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        a<T> g10 = g(cls);
        T a10 = this.f21867a.a(aVar);
        if (a10 != null) {
            this.f21872f -= g10.c() * g10.b(a10);
            a(g10.b(a10), cls);
        }
        if (a10 != null) {
            return a10;
        }
        if (Log.isLoggable(g10.a(), 2)) {
            String a11 = g10.a();
            StringBuilder a12 = android.support.v4.media.a.a("Allocated ");
            a12.append(aVar.f21874b);
            a12.append(" bytes");
            Log.v(a11, a12.toString());
        }
        return g10.newArray(aVar.f21874b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f21869c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f21869c.put(cls, treeMap);
        return treeMap;
    }

    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        a<?> g10 = g(cls);
        int b10 = g10.b(t10);
        int c10 = g10.c() * b10;
        int i10 = 1;
        if (c10 <= this.f21871e / 2) {
            a t11 = this.f21868b.t(b10, cls);
            this.f21867a.b(t11, t10);
            NavigableMap<Integer, Integer> i11 = i(cls);
            Integer num = (Integer) i11.get(Integer.valueOf(t11.f21874b));
            Integer valueOf = Integer.valueOf(t11.f21874b);
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            i11.put(valueOf, Integer.valueOf(i10));
            this.f21872f += c10;
            b(this.f21871e);
        }
    }
}
