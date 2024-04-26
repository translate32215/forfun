package ee;

import android.os.Handler;
import android.os.Looper;
import de.e1;
import de.f;
import de.g0;
import de.w0;
import java.util.concurrent.CancellationException;
import kd.o;
import ud.k;
import ud.l;

/* compiled from: HandlerDispatcher.kt */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f17840b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17841c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f17842d;

    /* renamed from: e  reason: collision with root package name */
    public final a f17843e;

    /* renamed from: ee.a$a  reason: collision with other inner class name */
    /* compiled from: Runnable.kt */
    public static final class C0134a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f17844a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f17845b;

        public C0134a(f fVar, a aVar) {
            this.f17844a = fVar;
            this.f17845b = aVar;
        }

        public final void run() {
            this.f17844a.k(this.f17845b, o.f20627a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    public static final class b extends l implements td.l<Throwable, o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f17846b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Runnable f17847c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, Runnable runnable) {
            super(1);
            this.f17846b = aVar;
            this.f17847c = runnable;
        }

        public Object c(Object obj) {
            Throwable th = (Throwable) obj;
            this.f17846b.f17840b.removeCallbacks(this.f17847c);
            return o.f20627a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Handler handler, String str, boolean z10) {
        super((ud.f) null);
        a aVar = null;
        this.f17840b = handler;
        this.f17841c = str;
        this.f17842d = z10;
        this._immediate = z10 ? this : aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f17843e = aVar2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f17840b == this.f17840b;
    }

    public void f0(md.f fVar, Runnable runnable) {
        if (!this.f17840b.post(runnable)) {
            k0(fVar, runnable);
        }
    }

    public boolean h0(md.f fVar) {
        return !this.f17842d || !k.a(Looper.myLooper(), this.f17840b.getLooper());
    }

    public int hashCode() {
        return System.identityHashCode(this.f17840b);
    }

    public e1 i0() {
        return this.f17843e;
    }

    public final void k0(md.f fVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        int i10 = w0.f13338l;
        w0 w0Var = (w0) fVar.get(w0.b.f13339a);
        if (w0Var != null) {
            w0Var.V(cancellationException);
        }
        ((je.b) g0.f13287b).getClass();
        je.b.f19766c.f0(fVar, runnable);
    }

    public void o(long j10, f<? super o> fVar) {
        C0134a aVar = new C0134a(fVar, this);
        Handler handler = this.f17840b;
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (handler.postDelayed(aVar, j10)) {
            fVar.j(new b(this, aVar));
        } else {
            k0(fVar.getContext(), aVar);
        }
    }

    public String toString() {
        String j02 = j0();
        if (j02 != null) {
            return j02;
        }
        String str = this.f17841c;
        if (str == null) {
            str = this.f17840b.toString();
        }
        return this.f17842d ? k.j(str, ".immediate") : str;
    }
}
