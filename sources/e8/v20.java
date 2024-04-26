package e8;

import e7.e;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class v20 implements t20 {

    /* renamed from: a  reason: collision with root package name */
    public final t20 f17016a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<u20> f17017b = new LinkedBlockingQueue();

    /* renamed from: c  reason: collision with root package name */
    public final int f17018c = ((Integer) ti0.f16763j.f16769f.a(t.K4)).intValue();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f17019d = new AtomicBoolean(false);

    public v20(t20 t20, ScheduledExecutorService scheduledExecutorService) {
        this.f17016a = t20;
        long intValue = (long) ((Integer) ti0.f16763j.f16769f.a(t.J4)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new e(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public final void a(u20 u20) {
        if (this.f17017b.size() < this.f17018c) {
            this.f17017b.offer(u20);
        } else if (!this.f17019d.getAndSet(true)) {
            Queue<u20> queue = this.f17017b;
            u20 c10 = u20.c("dropped_event");
            HashMap hashMap = (HashMap) u20.e();
            if (hashMap.containsKey("action")) {
                c10.f16842a.put("dropped_action", (String) hashMap.get("action"));
            }
            queue.offer(c10);
        }
    }

    public final String b(u20 u20) {
        return this.f17016a.b(u20);
    }
}
