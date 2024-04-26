package o3;

import e.e;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f22895a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final b f22896b = new b();

    /* compiled from: DiskCacheWriteLocker */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Lock f22897a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f22898b;
    }

    /* compiled from: DiskCacheWriteLocker */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<a> f22899a = new ArrayDeque();
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.f22895a.get(str);
            e.b(aVar2);
            aVar = aVar2;
            int i10 = aVar.f22898b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f22898b = i11;
                if (i11 == 0) {
                    a remove = this.f22895a.remove(str);
                    if (remove.equals(aVar)) {
                        b bVar = this.f22896b;
                        synchronized (bVar.f22899a) {
                            if (bVar.f22899a.size() < 10) {
                                bVar.f22899a.offer(remove);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f22898b);
            }
        }
        aVar.f22897a.unlock();
    }
}
