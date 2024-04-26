package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import c4.b;
import c4.c;
import c4.d;
import c4.e;
import c4.f;
import c4.i;
import g4.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import m3.k;
import m3.l;
import t3.p;
import z3.q;

/* compiled from: RequestBuilder */
public class h<TranscodeType> extends c4.a<h<TranscodeType>> {
    public final Context I;
    public final i J;
    public final Class<TranscodeType> K;
    public final d L;
    public j<?, ? super TranscodeType> M;
    public Object N;
    public List<e<TranscodeType>> O;
    public h<TranscodeType> P;
    public h<TranscodeType> Q;
    public boolean R = true;
    public boolean S;
    public boolean Z;

    /* compiled from: RequestBuilder */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4935a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f4936b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0037 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0041 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0061 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                com.bumptech.glide.f[] r0 = com.bumptech.glide.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4936b = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r3 = f4936b     // Catch:{ NoSuchFieldError -> 0x0012 }
                r3[r0] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r3 = f4936b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r3 = 4
                int[] r4 = f4936b     // Catch:{ NoSuchFieldError -> 0x001c }
                r5 = 0
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f4935a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x002d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r1 = f4935a     // Catch:{ NoSuchFieldError -> 0x0037 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0037 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0037 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                int[] r0 = f4935a     // Catch:{ NoSuchFieldError -> 0x0041 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                int[] r0 = f4935a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f4935a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f4935a     // Catch:{ NoSuchFieldError -> 0x0061 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0061 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0061 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0061 }
            L_0x0061:
                int[] r0 = f4935a     // Catch:{ NoSuchFieldError -> 0x006c }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f4935a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.h.a.<clinit>():void");
        }
    }

    static {
        f fVar = (f) ((f) ((f) new f().d(k.f21589b)).k(f.LOW)).o(true);
    }

    @SuppressLint({"CheckResult"})
    public h(b bVar, i iVar, Class<TranscodeType> cls, Context context) {
        f fVar;
        this.J = iVar;
        this.K = cls;
        this.I = context;
        d dVar = iVar.f4938a.f4885c;
        j<?, ?> jVar = dVar.f4913f.get(cls);
        if (jVar == null) {
            for (Map.Entry next : dVar.f4913f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    jVar = (j) next.getValue();
                }
            }
        }
        this.M = jVar == null ? d.f4907k : jVar;
        this.L = bVar.f4885c;
        for (e<Object> t10 : iVar.f4946i) {
            t(t10);
        }
        synchronized (iVar) {
            fVar = iVar.f4947r;
        }
        a(fVar);
    }

    public final h<TranscodeType> A(Object obj) {
        if (this.D) {
            return clone().A(obj);
        }
        this.N = obj;
        this.S = true;
        l();
        return this;
    }

    public final c B(Object obj, d4.h<TranscodeType> hVar, e<TranscodeType> eVar, c4.a<?> aVar, d dVar, j<?, ? super TranscodeType> jVar, f fVar, int i10, int i11, Executor executor) {
        Context context = this.I;
        d dVar2 = this.L;
        Object obj2 = this.N;
        Class<TranscodeType> cls = this.K;
        List<e<TranscodeType>> list = this.O;
        l lVar = dVar2.f4914g;
        jVar.getClass();
        return new c4.h(context, dVar2, obj, obj2, cls, aVar, i10, i11, fVar, hVar, eVar, list, dVar, lVar, e4.a.f13589b, executor);
    }

    public h<TranscodeType> t(e<TranscodeType> eVar) {
        if (this.D) {
            return clone().t(eVar);
        }
        if (eVar != null) {
            if (this.O == null) {
                this.O = new ArrayList();
            }
            this.O.add(eVar);
        }
        l();
        return this;
    }

    /* renamed from: u */
    public h<TranscodeType> a(c4.a<?> aVar) {
        if (aVar != null) {
            return (h) super.a(aVar);
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final c v(Object obj, d4.h<TranscodeType> hVar, e<TranscodeType> eVar, d dVar, j<?, ? super TranscodeType> jVar, f fVar, int i10, int i11, c4.a<?> aVar, Executor executor) {
        b bVar;
        b bVar2;
        i iVar;
        int i12;
        int i13;
        f fVar2;
        int i14;
        int i15;
        Object obj2 = obj;
        c4.a<?> aVar2 = aVar;
        if (this.Q != null) {
            bVar2 = new b(obj2, dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        h<TranscodeType> hVar2 = this.P;
        if (hVar2 == null) {
            iVar = B(obj, hVar, eVar, aVar, bVar2, jVar, fVar, i10, i11, executor);
        } else if (!this.Z) {
            j<?, ? super TranscodeType> jVar2 = hVar2.R ? jVar : hVar2.M;
            if (c4.a.f(hVar2.f4197a, 8)) {
                fVar2 = this.P.f4200d;
                f fVar3 = fVar;
            } else {
                fVar2 = x(fVar);
            }
            f fVar4 = fVar2;
            h<TranscodeType> hVar3 = this.P;
            int i16 = hVar3.f4207s;
            int i17 = hVar3.f4206r;
            if (j.j(i10, i11)) {
                h<TranscodeType> hVar4 = this.P;
                if (!j.j(hVar4.f4207s, hVar4.f4206r)) {
                    i15 = aVar2.f4207s;
                    i14 = aVar2.f4206r;
                    i iVar2 = new i(obj2, bVar2);
                    Object obj3 = obj;
                    d4.h<TranscodeType> hVar5 = hVar;
                    e<TranscodeType> eVar2 = eVar;
                    i iVar3 = iVar2;
                    c B = B(obj3, hVar5, eVar2, aVar, iVar2, jVar, fVar, i10, i11, executor);
                    this.Z = true;
                    h<TranscodeType> hVar6 = this.P;
                    c v10 = hVar6.v(obj3, hVar5, eVar2, iVar3, jVar2, fVar4, i15, i14, hVar6, executor);
                    this.Z = false;
                    i iVar4 = iVar3;
                    iVar4.f4249c = B;
                    iVar4.f4250d = v10;
                    iVar = iVar4;
                }
            }
            i14 = i17;
            i15 = i16;
            i iVar22 = new i(obj2, bVar2);
            Object obj32 = obj;
            d4.h<TranscodeType> hVar52 = hVar;
            e<TranscodeType> eVar22 = eVar;
            i iVar32 = iVar22;
            c B2 = B(obj32, hVar52, eVar22, aVar, iVar22, jVar, fVar, i10, i11, executor);
            this.Z = true;
            h<TranscodeType> hVar62 = this.P;
            c v102 = hVar62.v(obj32, hVar52, eVar22, iVar32, jVar2, fVar4, i15, i14, hVar62, executor);
            this.Z = false;
            i iVar42 = iVar32;
            iVar42.f4249c = B2;
            iVar42.f4250d = v102;
            iVar = iVar42;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return iVar;
        }
        h<TranscodeType> hVar7 = this.Q;
        int i18 = hVar7.f4207s;
        int i19 = hVar7.f4206r;
        if (j.j(i10, i11)) {
            h<TranscodeType> hVar8 = this.Q;
            if (!j.j(hVar8.f4207s, hVar8.f4206r)) {
                i13 = aVar2.f4207s;
                i12 = aVar2.f4206r;
                h<TranscodeType> hVar9 = this.Q;
                c v11 = hVar9.v(obj, hVar, eVar, bVar, hVar9.M, hVar9.f4200d, i13, i12, hVar9, executor);
                bVar.f4217c = iVar;
                bVar.f4218d = v11;
                return bVar;
            }
        }
        i12 = i19;
        i13 = i18;
        h<TranscodeType> hVar92 = this.Q;
        c v112 = hVar92.v(obj, hVar, eVar, bVar, hVar92.M, hVar92.f4200d, i13, i12, hVar92, executor);
        bVar.f4217c = iVar;
        bVar.f4218d = v112;
        return bVar;
    }

    /* renamed from: w */
    public h<TranscodeType> clone() {
        h<TranscodeType> hVar = (h) super.clone();
        hVar.M = hVar.M.a();
        if (hVar.O != null) {
            hVar.O = new ArrayList(hVar.O);
        }
        h<TranscodeType> hVar2 = hVar.P;
        if (hVar2 != null) {
            hVar.P = hVar2.clone();
        }
        h<TranscodeType> hVar3 = hVar.Q;
        if (hVar3 != null) {
            hVar.Q = hVar3.clone();
        }
        return hVar;
    }

    public final f x(f fVar) {
        int ordinal = fVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return f.IMMEDIATE;
        }
        if (ordinal == 2) {
            return f.HIGH;
        }
        if (ordinal == 3) {
            return f.NORMAL;
        }
        StringBuilder a10 = android.support.v4.media.a.a("unknown priority: ");
        a10.append(this.f4200d);
        throw new IllegalArgumentException(a10.toString());
    }

    public final <Y extends d4.h<TranscodeType>> Y y(Y y10, e<TranscodeType> eVar, c4.a<?> aVar, Executor executor) {
        Y y11 = y10;
        c4.a<?> aVar2 = aVar;
        if (y11 == null) {
            throw new NullPointerException("Argument must not be null");
        } else if (this.S) {
            c v10 = v(new Object(), y10, eVar, (d) null, this.M, aVar2.f4200d, aVar2.f4207s, aVar2.f4206r, aVar, executor);
            c g10 = y10.g();
            if (v10.i(g10)) {
                if (!(!aVar2.f4205i && g10.l())) {
                    e.e.b(g10);
                    if (!g10.isRunning()) {
                        g10.k();
                    }
                    return y11;
                }
            }
            this.J.i(y10);
            y10.f(v10);
            i iVar = this.J;
            synchronized (iVar) {
                iVar.f4943f.f28277a.add(y10);
                q qVar = iVar.f4941d;
                qVar.f28267a.add(v10);
                if (!qVar.f28269c) {
                    v10.k();
                } else {
                    v10.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    qVar.f28268b.add(v10);
                }
            }
            return y11;
        } else {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
    }

    public d4.i<ImageView, TranscodeType> z(ImageView imageView) {
        c4.a aVar;
        d4.i<ImageView, TranscodeType> iVar;
        j.a();
        if (imageView != null) {
            if (!c4.a.f(this.f4197a, 2048) && this.f4210v && imageView.getScaleType() != null) {
                switch (a.f4935a[imageView.getScaleType().ordinal()]) {
                    case 1:
                        aVar = clone().g(t3.k.f25631c, new t3.h());
                        break;
                    case 2:
                        aVar = clone().g(t3.k.f25630b, new t3.i());
                        aVar.G = true;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        aVar = clone().g(t3.k.f25629a, new p());
                        aVar.G = true;
                        break;
                    case 6:
                        aVar = clone().g(t3.k.f25630b, new t3.i());
                        aVar.G = true;
                        break;
                }
            }
            aVar = this;
            d dVar = this.L;
            Class<TranscodeType> cls = this.K;
            dVar.f4910c.getClass();
            if (Bitmap.class.equals(cls)) {
                iVar = new d4.b(imageView);
            } else if (Drawable.class.isAssignableFrom(cls)) {
                iVar = new d4.d(imageView);
            } else {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            y(iVar, (e) null, aVar, g4.e.f18454a);
            return iVar;
        }
        throw new NullPointerException("Argument must not be null");
    }
}
