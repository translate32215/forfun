package u6;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BandwidthMeter */
public interface b {

    /* compiled from: BandwidthMeter */
    public interface a {

        /* renamed from: u6.b$a$a  reason: collision with other inner class name */
        /* compiled from: BandwidthMeter */
        public static final class C0257a {

            /* renamed from: a  reason: collision with root package name */
            public final CopyOnWriteArrayList<C0258a> f26040a = new CopyOnWriteArrayList<>();

            /* renamed from: u6.b$a$a$a  reason: collision with other inner class name */
            /* compiled from: BandwidthMeter */
            public static final class C0258a {

                /* renamed from: a  reason: collision with root package name */
                public final Handler f26041a;

                /* renamed from: b  reason: collision with root package name */
                public final a f26042b;

                /* renamed from: c  reason: collision with root package name */
                public boolean f26043c;

                public C0258a(Handler handler, a aVar) {
                    this.f26041a = handler;
                    this.f26042b = aVar;
                }
            }

            public void a(a aVar) {
                Iterator<C0258a> it = this.f26040a.iterator();
                while (it.hasNext()) {
                    C0258a next = it.next();
                    if (next.f26042b == aVar) {
                        next.f26043c = true;
                        this.f26040a.remove(next);
                    }
                }
            }
        }
    }

    i a();

    void d(Handler handler, a aVar);

    long e();

    void g(a aVar);
}
