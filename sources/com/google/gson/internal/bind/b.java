package com.google.gson.internal.bind;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import jb.c;

/* compiled from: JsonTreeWriter */
public final class b extends c {

    /* renamed from: w  reason: collision with root package name */
    public static final Writer f9936w = new a();

    /* renamed from: x  reason: collision with root package name */
    public static final o f9937x = new o("closed");

    /* renamed from: t  reason: collision with root package name */
    public final List<j> f9938t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public String f9939u;

    /* renamed from: v  reason: collision with root package name */
    public j f9940v = l.f9992a;

    /* compiled from: JsonTreeWriter */
    public static class a extends Writer {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f9936w);
    }

    public c H(String str) throws IOException {
        if (this.f9938t.isEmpty() || this.f9939u != null) {
            throw new IllegalStateException();
        } else if (r0() instanceof m) {
            this.f9939u = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c M() throws IOException {
        s0(l.f9992a);
        return this;
    }

    public void close() throws IOException {
        if (this.f9938t.isEmpty()) {
            this.f9938t.add(f9937x);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d() throws IOException {
        g gVar = new g();
        s0(gVar);
        this.f9938t.add(gVar);
        return this;
    }

    public void flush() throws IOException {
    }

    public c i() throws IOException {
        m mVar = new m();
        s0(mVar);
        this.f9938t.add(mVar);
        return this;
    }

    public c k0(long j10) throws IOException {
        s0(new o((Number) Long.valueOf(j10)));
        return this;
    }

    public c l0(Boolean bool) throws IOException {
        if (bool == null) {
            s0(l.f9992a);
            return this;
        }
        s0(new o(bool));
        return this;
    }

    public c m0(Number number) throws IOException {
        if (number == null) {
            s0(l.f9992a);
            return this;
        }
        if (!this.f19734f) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        s0(new o(number));
        return this;
    }

    public c n0(String str) throws IOException {
        if (str == null) {
            s0(l.f9992a);
            return this;
        }
        s0(new o(str));
        return this;
    }

    public c o0(boolean z10) throws IOException {
        s0(new o(Boolean.valueOf(z10)));
        return this;
    }

    public j q0() {
        if (this.f9938t.isEmpty()) {
            return this.f9940v;
        }
        StringBuilder a10 = android.support.v4.media.a.a("Expected one JSON element but was ");
        a10.append(this.f9938t);
        throw new IllegalStateException(a10.toString());
    }

    public final j r0() {
        List<j> list = this.f9938t;
        return list.get(list.size() - 1);
    }

    public c s() throws IOException {
        if (this.f9938t.isEmpty() || this.f9939u != null) {
            throw new IllegalStateException();
        } else if (r0() instanceof g) {
            List<j> list = this.f9938t;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void s0(j jVar) {
        if (this.f9939u != null) {
            if (!(jVar instanceof l) || this.f19737i) {
                ((m) r0()).s(this.f9939u, jVar);
            }
            this.f9939u = null;
        } else if (this.f9938t.isEmpty()) {
            this.f9940v = jVar;
        } else {
            j r02 = r0();
            if (r02 instanceof g) {
                ((g) r02).f9832a.add(jVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public c t() throws IOException {
        if (this.f9938t.isEmpty() || this.f9939u != null) {
            throw new IllegalStateException();
        } else if (r0() instanceof m) {
            List<j> list = this.f9938t;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
