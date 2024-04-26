package je;

import de.p0;

/* compiled from: Dispatcher.kt */
public class f extends p0 {

    /* renamed from: b  reason: collision with root package name */
    public final int f19769b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19770c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19771d;

    /* renamed from: e  reason: collision with root package name */
    public final String f19772e;

    /* renamed from: f  reason: collision with root package name */
    public a f19773f;

    public f(int i10, int i11, long j10, String str) {
        this.f19769b = i10;
        this.f19770c = i11;
        this.f19771d = j10;
        this.f19772e = str;
        this.f19773f = new a(i10, i11, j10, str);
    }

    public void f0(md.f fVar, Runnable runnable) {
        a.s(this.f19773f, runnable, (i) null, false, 6);
    }

    public void g0(md.f fVar, Runnable runnable) {
        a.s(this.f19773f, runnable, (i) null, true, 2);
    }
}
