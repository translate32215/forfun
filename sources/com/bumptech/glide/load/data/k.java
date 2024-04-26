package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.io.InputStream;
import n3.b;
import t3.v;

/* compiled from: InputStreamRewinder */
public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final v f4987a;

    /* compiled from: InputStreamRewinder */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final b f4988a;

        public a(b bVar) {
            this.f4988a = bVar;
        }

        public Class<InputStream> a() {
            return InputStream.class;
        }

        public e b(Object obj) {
            return new k((InputStream) obj, this.f4988a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        v vVar = new v(inputStream, bVar);
        this.f4987a = vVar;
        vVar.mark(5242880);
    }

    public void b() {
        this.f4987a.d();
    }

    /* renamed from: c */
    public InputStream a() throws IOException {
        this.f4987a.reset();
        return this.f4987a;
    }
}
