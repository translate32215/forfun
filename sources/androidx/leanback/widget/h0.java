package androidx.leanback.widget;

import android.database.Observable;

/* compiled from: ObjectAdapter */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f2400a = new a();

    /* renamed from: b  reason: collision with root package name */
    public s0 f2401b;

    /* compiled from: ObjectAdapter */
    public static final class a extends Observable<b> {
        public void a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((b) this.mObservers.get(size)).a();
            }
        }

        public void b(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((b) this.mObservers.get(size)).b(i10, i11);
            }
        }

        public void c(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((b) this.mObservers.get(size)).c(i10, i11);
            }
        }

        public void d(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((b) this.mObservers.get(size)).d(i10, i11);
            }
        }
    }

    /* compiled from: ObjectAdapter */
    public static abstract class b {
        public void a() {
        }

        public void b(int i10, int i11) {
            a();
        }

        public void c(int i10, int i11) {
            a();
        }

        public void d(int i10, int i11) {
            a();
        }
    }

    public h0(s0 s0Var) {
        d(s0Var);
    }

    public abstract Object a(int i10);

    public final void b() {
        this.f2400a.a();
    }

    public final void c(int i10, int i11) {
        this.f2400a.c(i10, i11);
    }

    public final void d(s0 s0Var) {
        if (s0Var != null) {
            boolean z10 = this.f2401b != null;
            this.f2401b = s0Var;
            if (z10) {
                this.f2400a.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Presenter selector must not be null");
    }

    public abstract int e();

    public h0(r0 r0Var) {
        d(new f1(r0Var));
    }

    public h0() {
    }
}
