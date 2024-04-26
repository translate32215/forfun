package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f353a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<h> f354b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements r, a {

        /* renamed from: a  reason: collision with root package name */
        public final o f355a;

        /* renamed from: b  reason: collision with root package name */
        public final h f356b;

        /* renamed from: c  reason: collision with root package name */
        public a f357c;

        public LifecycleOnBackPressedCancellable(o oVar, h hVar) {
            this.f355a = oVar;
            this.f356b = hVar;
            oVar.a(this);
        }

        public void cancel() {
            this.f355a.c(this);
            this.f356b.f372b.remove(this);
            a aVar = this.f357c;
            if (aVar != null) {
                aVar.cancel();
                this.f357c = null;
            }
        }

        public void d(t tVar, o.b bVar) {
            if (bVar == o.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                h hVar = this.f356b;
                onBackPressedDispatcher.f354b.add(hVar);
                a aVar = new a(hVar);
                hVar.f372b.add(aVar);
                this.f357c = aVar;
            } else if (bVar == o.b.ON_STOP) {
                a aVar2 = this.f357c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (bVar == o.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    public class a implements a {

        /* renamed from: a  reason: collision with root package name */
        public final h f359a;

        public a(h hVar) {
            this.f359a = hVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f354b.remove(this.f359a);
            this.f359a.f372b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f353a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(t tVar, h hVar) {
        o c10 = tVar.c();
        if (c10.b() != o.c.DESTROYED) {
            hVar.f372b.add(new LifecycleOnBackPressedCancellable(c10, hVar));
        }
    }

    public void b() {
        Iterator<h> descendingIterator = this.f354b.descendingIterator();
        while (descendingIterator.hasNext()) {
            h next = descendingIterator.next();
            if (next.f371a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f353a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
