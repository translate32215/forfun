package l;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor */
public class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f20958b;

    /* renamed from: c  reason: collision with root package name */
    public static final Executor f20959c = new C0179a();

    /* renamed from: a  reason: collision with root package name */
    public c f20960a = new b();

    /* renamed from: l.a$a  reason: collision with other inner class name */
    /* compiled from: ArchTaskExecutor */
    public static class C0179a implements Executor {
        public void execute(Runnable runnable) {
            a.f().f20960a.a(runnable);
        }
    }

    public a() {
        super(0);
    }

    public static a f() {
        if (f20958b != null) {
            return f20958b;
        }
        synchronized (a.class) {
            if (f20958b == null) {
                f20958b = new a();
            }
        }
        return f20958b;
    }

    public void a(Runnable runnable) {
        this.f20960a.a(runnable);
    }

    public boolean b() {
        return this.f20960a.b();
    }

    public void e(Runnable runnable) {
        this.f20960a.e(runnable);
    }
}
