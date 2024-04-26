package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.j;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.t;
import java.io.IOException;
import jb.c;

public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final q<T> f9883a;

    /* renamed from: b  reason: collision with root package name */
    public final i<T> f9884b;

    /* renamed from: c  reason: collision with root package name */
    public final Gson f9885c;

    /* renamed from: d  reason: collision with root package name */
    public final ib.a<T> f9886d;

    /* renamed from: e  reason: collision with root package name */
    public final t f9887e;

    /* renamed from: f  reason: collision with root package name */
    public final TreeTypeAdapter<T>.b f9888f = new b(this, (a) null);

    /* renamed from: g  reason: collision with root package name */
    public TypeAdapter<T> f9889g;

    public static final class SingleTypeFactory implements t {
        public <T> TypeAdapter<T> a(Gson gson, ib.a<T> aVar) {
            Class<? super T> cls = aVar.f19348a;
            throw null;
        }
    }

    public final class b implements p, h {
        public b(TreeTypeAdapter treeTypeAdapter, a aVar) {
        }
    }

    public TreeTypeAdapter(q<T> qVar, i<T> iVar, Gson gson, ib.a<T> aVar, t tVar) {
        this.f9883a = qVar;
        this.f9884b = iVar;
        this.f9885c = gson;
        this.f9886d = aVar;
        this.f9887e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new com.google.gson.r((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw new com.google.gson.k((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw new com.google.gson.r((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r4 = com.google.gson.l.f9992a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        throw new com.google.gson.r((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ExcHandler: NumberFormatException (r4v9 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[ExcHandler: IOException (r4v8 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[ExcHandler: d (r4v7 'e' jb.d A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T b(jb.a r4) throws java.io.IOException {
        /*
            r3 = this;
            com.google.gson.i<T> r0 = r3.f9884b
            if (r0 != 0) goto L_0x001a
            com.google.gson.TypeAdapter<T> r0 = r3.f9889g
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            com.google.gson.Gson r0 = r3.f9885c
            com.google.gson.t r1 = r3.f9887e
            ib.a<T> r2 = r3.f9886d
            com.google.gson.TypeAdapter r0 = r0.d(r1, r2)
            r3.f9889g = r0
        L_0x0015:
            java.lang.Object r4 = r0.b(r4)
            return r4
        L_0x001a:
            r4.m0()     // Catch:{ EOFException -> 0x003e, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            r0 = 0
            com.google.gson.TypeAdapter<com.google.gson.j> r1 = com.google.gson.internal.bind.TypeAdapters.C     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            com.google.gson.internal.bind.TypeAdapters$29 r1 = (com.google.gson.internal.bind.TypeAdapters.AnonymousClass29) r1     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            com.google.gson.j r4 = r1.b(r4)     // Catch:{ EOFException -> 0x0027, d -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            goto L_0x0044
        L_0x0027:
            r4 = move-exception
            goto L_0x0040
        L_0x0029:
            r4 = move-exception
            com.google.gson.r r0 = new com.google.gson.r
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0030:
            r4 = move-exception
            com.google.gson.k r0 = new com.google.gson.k
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0037:
            r4 = move-exception
            com.google.gson.r r0 = new com.google.gson.r
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x003e:
            r4 = move-exception
            r0 = 1
        L_0x0040:
            if (r0 == 0) goto L_0x0057
            com.google.gson.l r4 = com.google.gson.l.f9992a
        L_0x0044:
            boolean r0 = r4 instanceof com.google.gson.l
            if (r0 == 0) goto L_0x004a
            r4 = 0
            return r4
        L_0x004a:
            com.google.gson.i<T> r0 = r3.f9884b
            ib.a<T> r1 = r3.f9886d
            java.lang.reflect.Type r1 = r1.f19349b
            com.google.gson.internal.bind.TreeTypeAdapter<T>$b r2 = r3.f9888f
            java.lang.Object r4 = r0.a(r4, r1, r2)
            return r4
        L_0x0057:
            com.google.gson.r r0 = new com.google.gson.r
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.b(jb.a):java.lang.Object");
    }

    public void c(c cVar, T t10) throws IOException {
        q<T> qVar = this.f9883a;
        if (qVar == null) {
            TypeAdapter<T> typeAdapter = this.f9889g;
            if (typeAdapter == null) {
                typeAdapter = this.f9885c.d(this.f9887e, this.f9886d);
                this.f9889g = typeAdapter;
            }
            typeAdapter.c(cVar, t10);
        } else if (t10 == null) {
            cVar.M();
        } else {
            j a10 = qVar.a(t10, this.f9886d.f19349b, this.f9888f);
            TypeAdapters.AnonymousClass29 r02 = (TypeAdapters.AnonymousClass29) TypeAdapters.C;
            r02.getClass();
            r02.c(cVar, a10);
        }
    }
}
