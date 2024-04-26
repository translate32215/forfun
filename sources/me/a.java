package me;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import le.c;
import ve.f;
import ve.g;
import ve.h;
import ve.y;
import ve.z;

/* compiled from: CacheInterceptor */
public class a implements y {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21798a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f21799b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f21800c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f21801d;

    public a(b bVar, h hVar, c cVar, g gVar) {
        this.f21799b = hVar;
        this.f21800c = cVar;
        this.f21801d = gVar;
    }

    public long a0(f fVar, long j10) throws IOException {
        try {
            long a02 = this.f21799b.a0(fVar, j10);
            if (a02 == -1) {
                if (!this.f21798a) {
                    this.f21798a = true;
                    this.f21801d.close();
                }
                return -1;
            }
            fVar.t(this.f21801d.c(), fVar.f26740b - a02, a02);
            this.f21801d.L();
            return a02;
        } catch (IOException e10) {
            if (!this.f21798a) {
                this.f21798a = true;
                this.f21800c.b();
            }
            throw e10;
        }
    }

    public void close() throws IOException {
        if (!this.f21798a && !c.k(this, 100, TimeUnit.MILLISECONDS)) {
            this.f21798a = true;
            this.f21800c.b();
        }
        this.f21799b.close();
    }

    public z e() {
        return this.f21799b.e();
    }
}
