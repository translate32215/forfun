package u2;

import g3.c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: LottieTask */
public class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f26013a;

    public l(m mVar) {
        this.f26013a = mVar;
    }

    public void run() {
        if (this.f26013a.f26018d != null) {
            k<T> kVar = this.f26013a.f26018d;
            V v10 = kVar.f26011a;
            if (v10 != null) {
                m mVar = this.f26013a;
                synchronized (mVar) {
                    Iterator it = new ArrayList(mVar.f26015a).iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).a(v10);
                    }
                }
                return;
            }
            m mVar2 = this.f26013a;
            Throwable th = kVar.f26012b;
            synchronized (mVar2) {
                ArrayList arrayList = new ArrayList(mVar2.f26016b);
                if (arrayList.isEmpty()) {
                    c.b("Lottie encountered an error but no failure listener was added:", th);
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).a(th);
                }
            }
        }
    }
}
