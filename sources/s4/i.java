package s4;

import android.content.Context;
import java.util.concurrent.Executor;
import jd.a;
import p4.d;
import t4.c;
import u4.b;

/* compiled from: Uploader_Factory */
public final class i implements a {

    /* renamed from: a  reason: collision with root package name */
    public a<Context> f24944a;

    /* renamed from: b  reason: collision with root package name */
    public a<d> f24945b;

    /* renamed from: c  reason: collision with root package name */
    public a<c> f24946c;

    /* renamed from: d  reason: collision with root package name */
    public a<k> f24947d;

    /* renamed from: e  reason: collision with root package name */
    public a<Executor> f24948e;

    /* renamed from: f  reason: collision with root package name */
    public final a<b> f24949f;

    /* renamed from: g  reason: collision with root package name */
    public final a<v4.a> f24950g;

    /* JADX WARNING: type inference failed for: r0v0, types: [jd.a<u4.b>, s.i] */
    /* JADX WARNING: type inference failed for: r0v1, types: [jd.a<v4.a>, s.i] */
    public i() {
        this.f24949f = new s.i();
        this.f24950g = new s.i();
    }

    public Object get() {
        return new h((Context) this.f24944a.get(), (d) this.f24945b.get(), (c) this.f24946c.get(), (k) this.f24947d.get(), (Executor) this.f24948e.get(), (b) this.f24949f.get(), (v4.a) this.f24950g.get());
    }

    public i(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7) {
        this.f24944a = aVar;
        this.f24945b = aVar2;
        this.f24946c = aVar3;
        this.f24947d = aVar4;
        this.f24948e = aVar5;
        this.f24949f = aVar6;
        this.f24950g = aVar7;
    }
}
