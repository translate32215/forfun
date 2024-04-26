package com.google.android.gms.internal.ads;

import e8.ja0;
import e8.la0;
import e8.lj;
import e8.na0;
import e8.oh;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class dr implements lj, Closeable, Iterator<a9> {

    /* renamed from: g  reason: collision with root package name */
    public static final a9 f6232g = new ja0("eof ");

    /* renamed from: a  reason: collision with root package name */
    public oh f6233a;

    /* renamed from: b  reason: collision with root package name */
    public o7 f6234b;

    /* renamed from: c  reason: collision with root package name */
    public a9 f6235c = null;

    /* renamed from: d  reason: collision with root package name */
    public long f6236d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f6237e = 0;

    /* renamed from: f  reason: collision with root package name */
    public List<a9> f6238f = new ArrayList();

    static {
        na0.b(dr.class);
    }

    public void close() throws IOException {
        this.f6234b.getClass();
    }

    public boolean hasNext() {
        a9 a9Var = this.f6235c;
        if (a9Var == f6232g) {
            return false;
        }
        if (a9Var != null) {
            return true;
        }
        try {
            this.f6235c = (a9) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f6235c = f6232g;
            return false;
        }
    }

    public Object next() {
        a9 a10;
        a9 a9Var = this.f6235c;
        if (a9Var == null || a9Var == f6232g) {
            o7 o7Var = this.f6234b;
            if (o7Var == null || this.f6236d >= this.f6237e) {
                this.f6235c = f6232g;
                throw new NoSuchElementException();
            }
            try {
                synchronized (o7Var) {
                    this.f6234b.d(this.f6236d);
                    a10 = ((v8) this.f6233a).a(this.f6234b, this);
                    this.f6236d = this.f6234b.a();
                }
                return a10;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.f6235c = null;
            return a9Var;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void s(o7 o7Var, long j10, oh ohVar) throws IOException {
        this.f6234b = o7Var;
        this.f6236d = o7Var.a();
        o7Var.d(o7Var.a() + j10);
        this.f6237e = o7Var.a();
        this.f6233a = ohVar;
    }

    public final List<a9> t() {
        if (this.f6234b == null || this.f6235c == f6232g) {
            return this.f6238f;
        }
        return new la0(this.f6238f, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.f6238f.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(this.f6238f.get(i10).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}
