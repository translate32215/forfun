package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.StateSet;
import h.c;
import h.g;
import s.j;

/* compiled from: AnimatedStateListDrawableCompat */
public class b extends g implements h0.a {
    public int A;
    public boolean B;

    /* renamed from: x  reason: collision with root package name */
    public c f18704x;

    /* renamed from: y  reason: collision with root package name */
    public g f18705y;

    /* renamed from: z  reason: collision with root package name */
    public int f18706z;

    /* renamed from: h.b$b  reason: collision with other inner class name */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class C0152b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f18707a;

        public C0152b(Animatable animatable) {
            super((a) null);
            this.f18707a = animatable;
        }

        public void c() {
            this.f18707a.start();
        }

        public void d() {
            this.f18707a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static class c extends g.a {
        public s.f<Long> K;
        public j<Integer> L;

        public c(c cVar, b bVar, Resources resources) {
            super(cVar, bVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new s.f<>(10);
            this.L = new j<>();
        }

        public static long h(int i10, int i11) {
            return ((long) i11) | (((long) i10) << 32);
        }

        public void e() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public int i(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.e(i10, 0).intValue();
        }

        public Drawable newDrawable() {
            return new b(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new b(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final c2.b f18708a;

        public d(c2.b bVar) {
            super((a) null);
            this.f18708a = bVar;
        }

        public void c() {
            this.f18708a.start();
        }

        public void d() {
            this.f18708a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f18709a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18710b;

        public e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super((a) null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i10, i11});
            if (Build.VERSION.SDK_INT >= 18) {
                i.b.a(ofInt, true);
            }
            ofInt.setDuration((long) fVar.f18713c);
            ofInt.setInterpolator(fVar);
            this.f18710b = z11;
            this.f18709a = ofInt;
        }

        public boolean a() {
            return this.f18710b;
        }

        public void b() {
            this.f18709a.reverse();
        }

        public void c() {
            this.f18709a.start();
        }

        public void d() {
            this.f18709a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f18711a;

        /* renamed from: b  reason: collision with root package name */
        public int f18712b;

        /* renamed from: c  reason: collision with root package name */
        public int f18713c;

        public f(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f18712b = numberOfFrames;
            int[] iArr = this.f18711a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f18711a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f18711a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f18713c = i10;
        }

        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * ((float) this.f18713c)) + 0.5f);
            int i11 = this.f18712b;
            int[] iArr = this.f18711a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (((float) i12) / ((float) i11)) + (i12 < i11 ? ((float) i10) / ((float) this.f18713c) : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat */
    public static abstract class g {
        public g(a aVar) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    static {
        Class<b> cls = b.class;
    }

    public b() {
        this((c) null, (Resources) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0219, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(h.a.a(r1, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h.b g(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = r21.getName()
            java.lang.String r5 = "animated-selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0240
            h.b r4 = new h.b
            r5 = 0
            r4.<init>(r5, r5)
            int[] r5 = i.d.f19069a
            android.content.res.TypedArray r5 = f0.m.d(r0, r3, r2, r5)
            r6 = 1
            boolean r7 = r5.getBoolean(r6, r6)
            r4.setVisible(r7, r6)
            h.b$c r7 = r4.f18704x
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L_0x0039
            int r8 = r7.f18732d
            int r9 = i.c.b(r5)
            r8 = r8 | r9
            r7.f18732d = r8
        L_0x0039:
            boolean r8 = r7.f18737i
            r9 = 2
            boolean r8 = r5.getBoolean(r9, r8)
            r7.f18737i = r8
            boolean r8 = r7.f18740l
            r10 = 3
            boolean r8 = r5.getBoolean(r10, r8)
            r7.f18740l = r8
            int r8 = r7.A
            r11 = 4
            int r8 = r5.getInt(r11, r8)
            r7.A = r8
            r8 = 5
            int r11 = r7.B
            int r8 = r5.getInt(r8, r11)
            r7.B = r8
            boolean r7 = r7.f18752x
            r8 = 0
            boolean r7 = r5.getBoolean(r8, r7)
            r4.setDither(r7)
            h.c$c r7 = r4.f18715a
            r7.f(r0)
            r5.recycle()
            int r5 = r21.getDepth()
            int r5 = r5 + r6
            r11 = r19
            r7 = r0
            r12 = r4
        L_0x0078:
            int r13 = r21.next()
            if (r13 == r6) goto L_0x0238
            int r14 = r21.getDepth()
            if (r14 >= r5) goto L_0x0086
            if (r13 == r10) goto L_0x0238
        L_0x0086:
            if (r13 == r9) goto L_0x0089
            goto L_0x0078
        L_0x0089:
            if (r14 <= r5) goto L_0x008c
            goto L_0x0078
        L_0x008c:
            java.lang.String r9 = r21.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            r10 = -1
            if (r9 == 0) goto L_0x0151
            int[] r9 = i.d.f19070b
            android.content.res.TypedArray r9 = f0.m.d(r7, r3, r2, r9)
            int r13 = r9.getResourceId(r8, r8)
            int r6 = r9.getResourceId(r6, r10)
            if (r6 <= 0) goto L_0x00b2
            androidx.appcompat.widget.t0 r10 = androidx.appcompat.widget.t0.d()
            android.graphics.drawable.Drawable r6 = r10.f(r11, r6)
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            r9.recycle()
            int r9 = r22.getAttributeCount()
            int[] r10 = new int[r9]
            r14 = 0
            r15 = 0
        L_0x00be:
            if (r14 >= r9) goto L_0x00e6
            int r0 = r2.getAttributeNameResource(r14)
            r16 = r5
            if (r0 == 0) goto L_0x00df
            r5 = 16842960(0x10100d0, float:2.369414E-38)
            if (r0 == r5) goto L_0x00df
            r5 = 16843161(0x1010199, float:2.3694704E-38)
            if (r0 == r5) goto L_0x00df
            int r5 = r15 + 1
            boolean r17 = r2.getAttributeBooleanValue(r14, r8)
            if (r17 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            int r0 = -r0
        L_0x00dc:
            r10[r15] = r0
            r15 = r5
        L_0x00df:
            int r14 = r14 + 1
            r0 = r20
            r5 = r16
            goto L_0x00be
        L_0x00e6:
            r16 = r5
            int[] r0 = android.util.StateSet.trimStateSet(r10, r15)
            java.lang.String r5 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L_0x012b
        L_0x00f0:
            int r6 = r21.next()
            r8 = 4
            if (r6 != r8) goto L_0x00f8
            goto L_0x00f0
        L_0x00f8:
            r8 = 2
            if (r6 != r8) goto L_0x011c
            java.lang.String r6 = r21.getName()
            java.lang.String r8 = "vector"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x010c
            c2.h r6 = c2.h.a(r20, r21, r22, r23)
            goto L_0x012b
        L_0x010c:
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r6 < r8) goto L_0x0117
            android.graphics.drawable.Drawable r6 = i.c.a(r20, r21, r22, r23)
            goto L_0x012b
        L_0x0117:
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22)
            goto L_0x012b
        L_0x011c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = h.a.a(r1, r2, r5)
            r0.<init>(r1)
            throw r0
        L_0x012b:
            if (r6 == 0) goto L_0x0142
            h.b$c r5 = r12.f18704x
            int r6 = r5.a(r6)
            int[][] r8 = r5.J
            r8[r6] = r0
            s.j<java.lang.Integer> r0 = r5.L
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r0.h(r6, r5)
            goto L_0x022e
        L_0x0142:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = h.a.a(r1, r2, r5)
            r0.<init>(r1)
            throw r0
        L_0x0151:
            r16 = r5
            java.lang.String r0 = r21.getName()
            java.lang.String r5 = "transition"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0229
            int[] r0 = i.d.f19071c
            android.content.res.TypedArray r0 = f0.m.d(r7, r3, r2, r0)
            r5 = 2
            int r5 = r0.getResourceId(r5, r10)
            r6 = 1
            int r6 = r0.getResourceId(r6, r10)
            int r9 = r0.getResourceId(r8, r10)
            if (r9 <= 0) goto L_0x017e
            androidx.appcompat.widget.t0 r13 = androidx.appcompat.widget.t0.d()
            android.graphics.drawable.Drawable r9 = r13.f(r11, r9)
            goto L_0x017f
        L_0x017e:
            r9 = 0
        L_0x017f:
            r13 = 3
            boolean r8 = r0.getBoolean(r13, r8)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r9 != 0) goto L_0x01cc
        L_0x018b:
            int r9 = r21.next()
            r13 = 4
            if (r9 != r13) goto L_0x0193
            goto L_0x018b
        L_0x0193:
            r13 = 2
            if (r9 != r13) goto L_0x01bd
            java.lang.String r9 = r21.getName()
            java.lang.String r13 = "animated-vector"
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x01ac
            c2.b r9 = new c2.b
            r13 = 0
            r9.<init>(r11, r13, r13)
            r9.inflate(r7, r1, r2, r3)
            goto L_0x01cc
        L_0x01ac:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r7 < r9) goto L_0x01b7
            android.graphics.drawable.Drawable r7 = i.c.a(r20, r21, r22, r23)
            goto L_0x01bb
        L_0x01b7:
            android.graphics.drawable.Drawable r7 = android.graphics.drawable.Drawable.createFromXmlInner(r20, r21, r22)
        L_0x01bb:
            r9 = r7
            goto L_0x01cc
        L_0x01bd:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = h.a.a(r1, r3, r0)
            r2.<init>(r0)
            throw r2
        L_0x01cc:
            if (r9 == 0) goto L_0x021a
            if (r5 == r10) goto L_0x0209
            if (r6 == r10) goto L_0x0209
            h.b$c r0 = r12.f18704x
            int r7 = r0.a(r9)
            long r9 = h.b.c.h(r5, r6)
            if (r8 == 0) goto L_0x01e4
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x01e6
        L_0x01e4:
            r11 = 0
        L_0x01e6:
            s.f<java.lang.Long> r13 = r0.K
            long r14 = (long) r7
            long r17 = r14 | r11
            java.lang.Long r7 = java.lang.Long.valueOf(r17)
            r13.a(r9, r7)
            if (r8 == 0) goto L_0x0229
            long r5 = h.b.c.h(r6, r5)
            s.f<java.lang.Long> r0 = r0.K
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 | r14
            long r7 = r7 | r11
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.a(r5, r7)
            goto L_0x0229
        L_0x0209:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.String r1 = h.a.a(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x021a:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = h.a.a(r1, r3, r0)
            r2.<init>(r0)
            throw r2
        L_0x0229:
            r11 = r19
            r7 = r20
            r12 = r4
        L_0x022e:
            r6 = 1
            r8 = 0
            r9 = 2
            r10 = 3
            r0 = r20
            r5 = r16
            goto L_0x0078
        L_0x0238:
            int[] r0 = r4.getState()
            r4.onStateChange(r0)
            return r4
        L_0x0240:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r21.getPositionDescription()
            r2.append(r1)
            java.lang.String r1 = ": invalid animated-selector tag "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            goto L_0x025f
        L_0x025e:
            throw r0
        L_0x025f:
            goto L_0x025e
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):h.b");
    }

    public c.C0153c b() {
        return new c(this.f18704x, this, (Resources) null);
    }

    public void e(c.C0153c cVar) {
        super.e(cVar);
        if (cVar instanceof c) {
            this.f18704x = (c) cVar;
        }
    }

    public g.a f() {
        return new c(this.f18704x, this, (Resources) null);
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f18705y;
        if (gVar != null) {
            gVar.d();
            this.f18705y = null;
            d(this.f18706z);
            this.f18706z = -1;
            this.A = -1;
        }
    }

    public Drawable mutate() {
        if (!this.B) {
            super.mutate();
            this.f18704x.e();
            this.B = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z10;
        g gVar;
        int[] iArr2 = iArr;
        c cVar = this.f18704x;
        int g10 = cVar.g(iArr2);
        if (g10 < 0) {
            g10 = cVar.g(StateSet.WILD_CARD);
        }
        int i10 = this.f18721g;
        boolean z11 = false;
        if (g10 != i10) {
            g gVar2 = this.f18705y;
            if (gVar2 != null) {
                if (g10 != this.f18706z) {
                    if (g10 != this.A || !gVar2.a()) {
                        i10 = this.f18706z;
                        gVar2.d();
                    } else {
                        gVar2.b();
                        this.f18706z = this.A;
                        this.A = g10;
                    }
                }
                z10 = true;
                if (z10 || d(g10)) {
                    z11 = true;
                }
            }
            this.f18705y = null;
            this.A = -1;
            this.f18706z = -1;
            c cVar2 = this.f18704x;
            int i11 = cVar2.i(i10);
            int i12 = cVar2.i(g10);
            if (!(i12 == 0 || i11 == 0)) {
                int longValue = (int) cVar2.K.f(c.h(i11, i12), -1L).longValue();
                if (longValue >= 0) {
                    boolean z12 = (cVar2.K.f(c.h(i11, i12), -1L).longValue() & 8589934592L) != 0;
                    d(longValue);
                    Drawable drawable = this.f18717c;
                    if (drawable instanceof AnimationDrawable) {
                        gVar = new e((AnimationDrawable) drawable, (cVar2.K.f(c.h(i11, i12), -1L).longValue() & 4294967296L) != 0, z12);
                    } else if (drawable instanceof c2.b) {
                        gVar = new d((c2.b) drawable);
                    } else if (drawable instanceof Animatable) {
                        gVar = new C0152b((Animatable) drawable);
                    }
                    gVar.c();
                    this.f18705y = gVar;
                    this.A = i10;
                    this.f18706z = g10;
                    z10 = true;
                    z11 = true;
                }
            }
            z10 = false;
            z11 = true;
        }
        Drawable drawable2 = this.f18717c;
        return drawable2 != null ? z11 | drawable2.setState(iArr2) : z11;
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f18705y;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public b(c cVar, Resources resources) {
        super((g.a) null);
        this.f18706z = -1;
        this.A = -1;
        c cVar2 = new c(cVar, this, resources);
        super.e(cVar2);
        this.f18704x = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }
}
