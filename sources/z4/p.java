package z4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import z4.g;

/* compiled from: BaseAudioProcessor */
public abstract class p implements g {

    /* renamed from: b  reason: collision with root package name */
    public g.a f28411b;

    /* renamed from: c  reason: collision with root package name */
    public g.a f28412c;

    /* renamed from: d  reason: collision with root package name */
    public g.a f28413d;

    /* renamed from: e  reason: collision with root package name */
    public g.a f28414e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f28415f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f28416g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f28417h;

    public p() {
        ByteBuffer byteBuffer = g.f28347a;
        this.f28415f = byteBuffer;
        this.f28416g = byteBuffer;
        g.a aVar = g.a.f28348e;
        this.f28413d = aVar;
        this.f28414e = aVar;
        this.f28411b = aVar;
        this.f28412c = aVar;
    }

    public boolean a() {
        return this.f28414e != g.a.f28348e;
    }

    public final void b() {
        flush();
        this.f28415f = g.f28347a;
        g.a aVar = g.a.f28348e;
        this.f28413d = aVar;
        this.f28414e = aVar;
        this.f28411b = aVar;
        this.f28412c = aVar;
        k();
    }

    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f28416g;
        this.f28416g = g.f28347a;
        return byteBuffer;
    }

    public boolean d() {
        return this.f28417h && this.f28416g == g.f28347a;
    }

    public final void e() {
        this.f28417h = true;
        j();
    }

    public final void flush() {
        this.f28416g = g.f28347a;
        this.f28417h = false;
        this.f28411b = this.f28413d;
        this.f28412c = this.f28414e;
        i();
    }

    public final g.a g(g.a aVar) throws g.b {
        this.f28413d = aVar;
        this.f28414e = h(aVar);
        return a() ? this.f28414e : g.a.f28348e;
    }

    public abstract g.a h(g.a aVar) throws g.b;

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public final ByteBuffer l(int i10) {
        if (this.f28415f.capacity() < i10) {
            this.f28415f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f28415f.clear();
        }
        ByteBuffer byteBuffer = this.f28415f;
        this.f28416g = byteBuffer;
        return byteBuffer;
    }
}
