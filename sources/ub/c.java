package ub;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ub.b;

public class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f26173a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f26174b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public b f26175c = null;

    public final void a() {
        b poll = this.f26174b.poll();
        this.f26175c = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f26173a, new Object[0]);
        }
    }

    public void b(b bVar) {
        bVar.f26171a = this;
        this.f26174b.add(bVar);
        if (this.f26175c == null) {
            a();
        }
    }
}
