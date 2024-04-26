package oe;

import android.support.v4.media.a;
import java.io.IOException;
import java.util.List;
import ke.d;
import ke.d0;
import ke.n;
import ke.t;
import ke.z;
import ne.c;

/* compiled from: RealInterceptorChain */
public final class f implements t.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<t> f23699a;

    /* renamed from: b  reason: collision with root package name */
    public final ne.f f23700b;

    /* renamed from: c  reason: collision with root package name */
    public final c f23701c;

    /* renamed from: d  reason: collision with root package name */
    public final c f23702d;

    /* renamed from: e  reason: collision with root package name */
    public final int f23703e;

    /* renamed from: f  reason: collision with root package name */
    public final z f23704f;

    /* renamed from: g  reason: collision with root package name */
    public final d f23705g;

    /* renamed from: h  reason: collision with root package name */
    public final n f23706h;

    /* renamed from: i  reason: collision with root package name */
    public final int f23707i;

    /* renamed from: j  reason: collision with root package name */
    public final int f23708j;

    /* renamed from: k  reason: collision with root package name */
    public final int f23709k;

    /* renamed from: l  reason: collision with root package name */
    public int f23710l;

    public f(List<t> list, ne.f fVar, c cVar, c cVar2, int i10, z zVar, d dVar, n nVar, int i11, int i12, int i13) {
        this.f23699a = list;
        this.f23702d = cVar2;
        this.f23700b = fVar;
        this.f23701c = cVar;
        this.f23703e = i10;
        this.f23704f = zVar;
        this.f23705g = dVar;
        this.f23706h = nVar;
        this.f23707i = i11;
        this.f23708j = i12;
        this.f23709k = i13;
    }

    public d0 a(z zVar) throws IOException {
        return b(zVar, this.f23700b, this.f23701c, this.f23702d);
    }

    public d0 b(z zVar, ne.f fVar, c cVar, c cVar2) throws IOException {
        if (this.f23703e < this.f23699a.size()) {
            this.f23710l++;
            if (this.f23701c == null) {
                z zVar2 = zVar;
            } else if (!this.f23702d.k(zVar.f20880a)) {
                StringBuilder a10 = a.a("network interceptor ");
                a10.append(this.f23699a.get(this.f23703e - 1));
                a10.append(" must retain the same host and port");
                throw new IllegalStateException(a10.toString());
            }
            if (this.f23701c == null || this.f23710l <= 1) {
                List<t> list = this.f23699a;
                int i10 = this.f23703e;
                d dVar = this.f23705g;
                n nVar = this.f23706h;
                int i11 = this.f23707i;
                int i12 = this.f23708j;
                String str = "network interceptor ";
                String str2 = " must call proceed() exactly once";
                f fVar2 = new f(list, fVar, cVar, cVar2, i10 + 1, zVar, dVar, nVar, i11, i12, this.f23709k);
                t tVar = list.get(i10);
                d0 a11 = tVar.a(fVar2);
                if (cVar != null && this.f23703e + 1 < this.f23699a.size() && fVar2.f23710l != 1) {
                    throw new IllegalStateException(str + tVar + str2);
                } else if (a11 == null) {
                    throw new NullPointerException("interceptor " + tVar + " returned null");
                } else if (a11.f20670g != null) {
                    return a11;
                } else {
                    throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
                }
            } else {
                StringBuilder a12 = a.a("network interceptor ");
                a12.append(this.f23699a.get(this.f23703e - 1));
                a12.append(" must call proceed() exactly once");
                throw new IllegalStateException(a12.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
