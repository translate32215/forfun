package ke;

import j.f;
import java.io.Closeable;
import javax.annotation.Nullable;
import ke.r;

/* compiled from: Response */
public final class d0 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final z f20664a;

    /* renamed from: b  reason: collision with root package name */
    public final x f20665b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20666c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20667d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final q f20668e;

    /* renamed from: f  reason: collision with root package name */
    public final r f20669f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final e0 f20670g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final d0 f20671h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final d0 f20672i;
    @Nullable

    /* renamed from: r  reason: collision with root package name */
    public final d0 f20673r;

    /* renamed from: s  reason: collision with root package name */
    public final long f20674s;

    /* renamed from: t  reason: collision with root package name */
    public final long f20675t;
    @Nullable

    /* renamed from: u  reason: collision with root package name */
    public volatile c f20676u;

    public d0(a aVar) {
        this.f20664a = aVar.f20677a;
        this.f20665b = aVar.f20678b;
        this.f20666c = aVar.f20679c;
        this.f20667d = aVar.f20680d;
        this.f20668e = aVar.f20681e;
        this.f20669f = new r(aVar.f20682f);
        this.f20670g = aVar.f20683g;
        this.f20671h = aVar.f20684h;
        this.f20672i = aVar.f20685i;
        this.f20673r = aVar.f20686j;
        this.f20674s = aVar.f20687k;
        this.f20675t = aVar.f20688l;
    }

    public c a() {
        c cVar = this.f20676u;
        if (cVar != null) {
            return cVar;
        }
        c a10 = c.a(this.f20669f);
        this.f20676u = a10;
        return a10;
    }

    public void close() {
        e0 e0Var = this.f20670g;
        if (e0Var != null) {
            e0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public boolean d() {
        int i10 = this.f20666c;
        return i10 >= 200 && i10 < 300;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("Response{protocol=");
        a10.append(this.f20665b);
        a10.append(", code=");
        a10.append(this.f20666c);
        a10.append(", message=");
        a10.append(this.f20667d);
        a10.append(", url=");
        a10.append(this.f20664a.f20880a);
        a10.append('}');
        return a10.toString();
    }

    /* compiled from: Response */
    public static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public z f20677a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public x f20678b;

        /* renamed from: c  reason: collision with root package name */
        public int f20679c;

        /* renamed from: d  reason: collision with root package name */
        public String f20680d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public q f20681e;

        /* renamed from: f  reason: collision with root package name */
        public r.a f20682f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public e0 f20683g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public d0 f20684h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        public d0 f20685i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public d0 f20686j;

        /* renamed from: k  reason: collision with root package name */
        public long f20687k;

        /* renamed from: l  reason: collision with root package name */
        public long f20688l;

        public a() {
            this.f20679c = -1;
            this.f20682f = new r.a();
        }

        public d0 a() {
            if (this.f20677a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f20678b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f20679c < 0) {
                StringBuilder a10 = android.support.v4.media.a.a("code < 0: ");
                a10.append(this.f20679c);
                throw new IllegalStateException(a10.toString());
            } else if (this.f20680d != null) {
                return new d0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public a b(@Nullable d0 d0Var) {
            if (d0Var != null) {
                c("cacheResponse", d0Var);
            }
            this.f20685i = d0Var;
            return this;
        }

        public final void c(String str, d0 d0Var) {
            if (d0Var.f20670g != null) {
                throw new IllegalArgumentException(f.a(str, ".body != null"));
            } else if (d0Var.f20671h != null) {
                throw new IllegalArgumentException(f.a(str, ".networkResponse != null"));
            } else if (d0Var.f20672i != null) {
                throw new IllegalArgumentException(f.a(str, ".cacheResponse != null"));
            } else if (d0Var.f20673r != null) {
                throw new IllegalArgumentException(f.a(str, ".priorResponse != null"));
            }
        }

        public a d(r rVar) {
            this.f20682f = rVar.e();
            return this;
        }

        public a(d0 d0Var) {
            this.f20679c = -1;
            this.f20677a = d0Var.f20664a;
            this.f20678b = d0Var.f20665b;
            this.f20679c = d0Var.f20666c;
            this.f20680d = d0Var.f20667d;
            this.f20681e = d0Var.f20668e;
            this.f20682f = d0Var.f20669f.e();
            this.f20683g = d0Var.f20670g;
            this.f20684h = d0Var.f20671h;
            this.f20685i = d0Var.f20672i;
            this.f20686j = d0Var.f20673r;
            this.f20687k = d0Var.f20674s;
            this.f20688l = d0Var.f20675t;
        }
    }
}
