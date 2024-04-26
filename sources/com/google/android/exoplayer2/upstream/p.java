package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.n;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import u6.e;
import v6.e0;
import z5.k;

/* compiled from: ParsingLoadable */
public final class p<T> implements n.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f5547a = k.a();

    /* renamed from: b  reason: collision with root package name */
    public final e f5548b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5549c;

    /* renamed from: d  reason: collision with root package name */
    public final r f5550d;

    /* renamed from: e  reason: collision with root package name */
    public final a<? extends T> f5551e;

    /* renamed from: f  reason: collision with root package name */
    public volatile T f5552f;

    /* compiled from: ParsingLoadable */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream) throws IOException;
    }

    public p(e eVar, Uri uri, int i10, a<? extends T> aVar) {
        Map emptyMap = Collections.emptyMap();
        Uri uri2 = uri;
        v6.a.g(uri2, "The uri must be set.");
        e eVar2 = new e(uri2, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
        this.f5550d = new r(eVar);
        this.f5548b = eVar2;
        this.f5549c = i10;
        this.f5551e = aVar;
    }

    public final void a() throws IOException {
        this.f5550d.f5558b = 0;
        f fVar = new f(this.f5550d, this.f5548b);
        try {
            if (!fVar.f5478d) {
                fVar.f5475a.O(fVar.f5476b);
                fVar.f5478d = true;
            }
            Uri M = this.f5550d.M();
            M.getClass();
            this.f5552f = this.f5551e.a(M, fVar);
        } finally {
            int i10 = e0.f26436a;
            try {
                fVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void b() {
    }
}
