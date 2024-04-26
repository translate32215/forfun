package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f371a;

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList<a> f372b = new CopyOnWriteArrayList<>();

    public h(boolean z10) {
        this.f371a = z10;
    }

    public abstract void a();

    public final void b() {
        Iterator<a> it = this.f372b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
