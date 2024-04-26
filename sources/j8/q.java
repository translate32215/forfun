package j8;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import t1.c;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class q extends o {

    /* renamed from: a  reason: collision with root package name */
    public final c f19674a = new c();

    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            c cVar = this.f19674a;
            Object obj = cVar.f25351c;
            while (true) {
                Reference poll = ((ReferenceQueue) obj).poll();
                if (poll == null) {
                    break;
                }
                ((ConcurrentHashMap) cVar.f25350b).remove(poll);
                obj = cVar.f25351c;
            }
            List list = (List) ((ConcurrentHashMap) cVar.f25350b).get(new p(th, (ReferenceQueue<Throwable>) null));
            if (list == null) {
                list = new Vector(2);
                List list2 = (List) ((ConcurrentHashMap) cVar.f25350b).putIfAbsent(new p(th, (ReferenceQueue) cVar.f25351c), list);
                if (list2 != null) {
                    list = list2;
                }
            }
            list.add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
