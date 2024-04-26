package g2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: Configuration */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f18387a = a();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f18388b = a();

    /* renamed from: c  reason: collision with root package name */
    public final k f18389c;

    /* renamed from: d  reason: collision with root package name */
    public final int f18390d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18391e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18392f;

    /* renamed from: g2.a$a  reason: collision with other inner class name */
    /* compiled from: Configuration */
    public static final class C0142a {
    }

    /* compiled from: Configuration */
    public interface b {
        a a();
    }

    public a(C0142a aVar) {
        String str = k.f18419a;
        this.f18389c = new j();
        this.f18390d = 4;
        this.f18391e = Integer.MAX_VALUE;
        this.f18392f = 20;
    }

    public final Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
}
