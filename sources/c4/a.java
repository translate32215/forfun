package c4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import c4.a;
import com.bumptech.glide.f;
import g4.b;
import g4.j;
import java.util.Map;
import k3.c;
import k3.e;
import k3.g;
import m3.k;

/* compiled from: BaseRequestOptions */
public abstract class a<T extends a<T>> implements Cloneable {
    public Class<?> A = Object.class;
    public boolean B;
    public Resources.Theme C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G = true;
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    public int f4197a;

    /* renamed from: b  reason: collision with root package name */
    public float f4198b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public k f4199c = k.f21590c;

    /* renamed from: d  reason: collision with root package name */
    public f f4200d = f.NORMAL;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f4201e;

    /* renamed from: f  reason: collision with root package name */
    public int f4202f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f4203g;

    /* renamed from: h  reason: collision with root package name */
    public int f4204h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4205i = true;

    /* renamed from: r  reason: collision with root package name */
    public int f4206r = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f4207s = -1;

    /* renamed from: t  reason: collision with root package name */
    public c f4208t = f4.a.f18109b;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4209u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4210v = true;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f4211w;

    /* renamed from: x  reason: collision with root package name */
    public int f4212x;

    /* renamed from: y  reason: collision with root package name */
    public e f4213y = new e();

    /* renamed from: z  reason: collision with root package name */
    public Map<Class<?>, g<?>> f4214z = new b();

    public static boolean f(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public T a(a<?> aVar) {
        if (this.D) {
            return clone().a(aVar);
        }
        if (f(aVar.f4197a, 2)) {
            this.f4198b = aVar.f4198b;
        }
        if (f(aVar.f4197a, 262144)) {
            this.E = aVar.E;
        }
        if (f(aVar.f4197a, 1048576)) {
            this.H = aVar.H;
        }
        if (f(aVar.f4197a, 4)) {
            this.f4199c = aVar.f4199c;
        }
        if (f(aVar.f4197a, 8)) {
            this.f4200d = aVar.f4200d;
        }
        if (f(aVar.f4197a, 16)) {
            this.f4201e = aVar.f4201e;
            this.f4202f = 0;
            this.f4197a &= -33;
        }
        if (f(aVar.f4197a, 32)) {
            this.f4202f = aVar.f4202f;
            this.f4201e = null;
            this.f4197a &= -17;
        }
        if (f(aVar.f4197a, 64)) {
            this.f4203g = aVar.f4203g;
            this.f4204h = 0;
            this.f4197a &= -129;
        }
        if (f(aVar.f4197a, 128)) {
            this.f4204h = aVar.f4204h;
            this.f4203g = null;
            this.f4197a &= -65;
        }
        if (f(aVar.f4197a, 256)) {
            this.f4205i = aVar.f4205i;
        }
        if (f(aVar.f4197a, 512)) {
            this.f4207s = aVar.f4207s;
            this.f4206r = aVar.f4206r;
        }
        if (f(aVar.f4197a, 1024)) {
            this.f4208t = aVar.f4208t;
        }
        if (f(aVar.f4197a, 4096)) {
            this.A = aVar.A;
        }
        if (f(aVar.f4197a, 8192)) {
            this.f4211w = aVar.f4211w;
            this.f4212x = 0;
            this.f4197a &= -16385;
        }
        if (f(aVar.f4197a, 16384)) {
            this.f4212x = aVar.f4212x;
            this.f4211w = null;
            this.f4197a &= -8193;
        }
        if (f(aVar.f4197a, 32768)) {
            this.C = aVar.C;
        }
        if (f(aVar.f4197a, 65536)) {
            this.f4210v = aVar.f4210v;
        }
        if (f(aVar.f4197a, 131072)) {
            this.f4209u = aVar.f4209u;
        }
        if (f(aVar.f4197a, 2048)) {
            this.f4214z.putAll(aVar.f4214z);
            this.G = aVar.G;
        }
        if (f(aVar.f4197a, 524288)) {
            this.F = aVar.F;
        }
        if (!this.f4210v) {
            this.f4214z.clear();
            int i10 = this.f4197a & -2049;
            this.f4197a = i10;
            this.f4209u = false;
            this.f4197a = i10 & -131073;
            this.G = true;
        }
        this.f4197a |= aVar.f4197a;
        this.f4213y.d(aVar.f4213y);
        l();
        return this;
    }

    /* renamed from: b */
    public T clone() {
        try {
            T t10 = (a) super.clone();
            e eVar = new e();
            t10.f4213y = eVar;
            eVar.d(this.f4213y);
            b bVar = new b();
            t10.f4214z = bVar;
            bVar.putAll(this.f4214z);
            t10.B = false;
            t10.D = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public T c(Class<?> cls) {
        if (this.D) {
            return clone().c(cls);
        }
        if (cls != null) {
            this.A = cls;
            this.f4197a |= 4096;
            l();
            return this;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public T d(k kVar) {
        if (this.D) {
            return clone().d(kVar);
        }
        if (kVar != null) {
            this.f4199c = kVar;
            this.f4197a |= 4;
            l();
            return this;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public T e(int i10) {
        if (this.D) {
            return clone().e(i10);
        }
        this.f4202f = i10;
        int i11 = this.f4197a | 32;
        this.f4197a = i11;
        this.f4201e = null;
        this.f4197a = i11 & -17;
        l();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.compare(aVar.f4198b, this.f4198b) == 0 && this.f4202f == aVar.f4202f && j.b(this.f4201e, aVar.f4201e) && this.f4204h == aVar.f4204h && j.b(this.f4203g, aVar.f4203g) && this.f4212x == aVar.f4212x && j.b(this.f4211w, aVar.f4211w) && this.f4205i == aVar.f4205i && this.f4206r == aVar.f4206r && this.f4207s == aVar.f4207s && this.f4209u == aVar.f4209u && this.f4210v == aVar.f4210v && this.E == aVar.E && this.F == aVar.F && this.f4199c.equals(aVar.f4199c) && this.f4200d == aVar.f4200d && this.f4213y.equals(aVar.f4213y) && this.f4214z.equals(aVar.f4214z) && this.A.equals(aVar.A) && j.b(this.f4208t, aVar.f4208t) && j.b(this.C, aVar.C)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [k3.g, k3.g<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T g(t3.k r2, k3.g<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.D
            if (r0 == 0) goto L_0x000d
            c4.a r0 = r1.clone()
            c4.a r2 = r0.g(r2, r3)
            return r2
        L_0x000d:
            k3.d<t3.k> r0 = t3.k.f25634f
            if (r2 == 0) goto L_0x001a
            r1.m(r0, r2)
            r2 = 0
            c4.a r2 = r1.q(r3, r2)
            return r2
        L_0x001a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Argument must not be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.g(t3.k, k3.g):c4.a");
    }

    public T h(int i10, int i11) {
        if (this.D) {
            return clone().h(i10, i11);
        }
        this.f4207s = i10;
        this.f4206r = i11;
        this.f4197a |= 512;
        l();
        return this;
    }

    public int hashCode() {
        float f10 = this.f4198b;
        char[] cArr = j.f18467a;
        return j.g(this.C, j.g(this.f4208t, j.g(this.A, j.g(this.f4214z, j.g(this.f4213y, j.g(this.f4200d, j.g(this.f4199c, (((((((((((((j.g(this.f4211w, (j.g(this.f4203g, (j.g(this.f4201e, ((Float.floatToIntBits(f10) + 527) * 31) + this.f4202f) * 31) + this.f4204h) * 31) + this.f4212x) * 31) + (this.f4205i ? 1 : 0)) * 31) + this.f4206r) * 31) + this.f4207s) * 31) + (this.f4209u ? 1 : 0)) * 31) + (this.f4210v ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0))))))));
    }

    public T j(int i10) {
        if (this.D) {
            return clone().j(i10);
        }
        this.f4204h = i10;
        int i11 = this.f4197a | 128;
        this.f4197a = i11;
        this.f4203g = null;
        this.f4197a = i11 & -65;
        l();
        return this;
    }

    public T k(f fVar) {
        if (this.D) {
            return clone().k(fVar);
        }
        if (fVar != null) {
            this.f4200d = fVar;
            this.f4197a |= 8;
            l();
            return this;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final T l() {
        if (!this.B) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [k3.d<Y>, java.lang.Object, k3.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T m(k3.d<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.D
            if (r0 == 0) goto L_0x000d
            c4.a r0 = r1.clone()
            c4.a r2 = r0.m(r2, r3)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            if (r2 == 0) goto L_0x0024
            if (r3 == 0) goto L_0x001e
            k3.e r0 = r1.f4213y
            s.a<k3.d<?>, java.lang.Object> r0 = r0.f19893b
            r0.put(r2, r3)
            r1.l()
            return r1
        L_0x001e:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        L_0x0024:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.m(k3.d, java.lang.Object):c4.a");
    }

    public T n(c cVar) {
        if (this.D) {
            return clone().n(cVar);
        }
        if (cVar != null) {
            this.f4208t = cVar;
            this.f4197a |= 1024;
            l();
            return this;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public T o(boolean z10) {
        if (this.D) {
            return clone().o(true);
        }
        this.f4205i = !z10;
        this.f4197a |= 256;
        l();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [k3.g, k3.g<Y>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T p(java.lang.Class<Y> r2, k3.g<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.D
            if (r0 == 0) goto L_0x000d
            c4.a r0 = r1.clone()
            c4.a r2 = r0.p(r2, r3, r4)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            if (r2 == 0) goto L_0x003c
            if (r3 == 0) goto L_0x0036
            java.util.Map<java.lang.Class<?>, k3.g<?>> r0 = r1.f4214z
            r0.put(r2, r3)
            int r2 = r1.f4197a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f4197a = r2
            r3 = 1
            r1.f4210v = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f4197a = r2
            r0 = 0
            r1.G = r0
            if (r4 == 0) goto L_0x0032
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f4197a = r2
            r1.f4209u = r3
        L_0x0032:
            r1.l()
            return r1
        L_0x0036:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        L_0x003c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.p(java.lang.Class, k3.g, boolean):c4.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [k3.g, k3.g<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T q(k3.g<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.D
            if (r0 == 0) goto L_0x000d
            c4.a r0 = r2.clone()
            c4.a r3 = r0.q(r3, r4)
            return r3
        L_0x000d:
            t3.n r0 = new t3.n
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.p(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.p(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.p(r1, r0, r4)
            java.lang.Class<x3.c> r0 = x3.c.class
            x3.f r1 = new x3.f
            r1.<init>(r3)
            r2.p(r0, r1, r4)
            r2.l()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.q(k3.g, boolean):c4.a");
    }

    public T r(boolean z10) {
        if (this.D) {
            return clone().r(z10);
        }
        this.H = z10;
        this.f4197a |= 1048576;
        l();
        return this;
    }
}
