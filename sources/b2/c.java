package b2;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import o0.c0;

/* compiled from: ChangeBounds */
public class c extends j {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<i, PointF> G = new b(PointF.class, "topLeft");
    public static final Property<i, PointF> H = new C0046c(PointF.class, "bottomRight");
    public static final Property<View, PointF> I = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> J = new e(PointF.class, "topLeft");
    public static final Property<View, PointF> K = new f(PointF.class, "position");

    /* compiled from: ChangeBounds */
    public class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3349a = new Rect();

        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f3349a);
            Rect rect = this.f3349a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f3349a);
            this.f3349a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f3349a);
        }
    }

    /* compiled from: ChangeBounds */
    public class b extends Property<i, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f3352a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f3353b = round;
            int i10 = iVar.f3357f + 1;
            iVar.f3357f = i10;
            if (i10 == iVar.f3358g) {
                z.c(iVar.f3356e, iVar.f3352a, round, iVar.f3354c, iVar.f3355d);
                iVar.f3357f = 0;
                iVar.f3358g = 0;
            }
        }
    }

    /* renamed from: b2.c$c  reason: collision with other inner class name */
    /* compiled from: ChangeBounds */
    public class C0046c extends Property<i, PointF> {
        public C0046c(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f3354c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f3355d = round;
            int i10 = iVar.f3358g + 1;
            iVar.f3358g = i10;
            if (iVar.f3357f == i10) {
                z.c(iVar.f3356e, iVar.f3352a, iVar.f3353b, iVar.f3354c, round);
                iVar.f3357f = 0;
                iVar.f3358g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds */
    public class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            z.c(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds */
    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            z.c(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds */
    public class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            z.c(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(c cVar, i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds */
    public class h extends m {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3350a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3351b;

        public h(c cVar, ViewGroup viewGroup) {
            this.f3351b = viewGroup;
        }

        public void b(j jVar) {
            v.b(this.f3351b, false);
            this.f3350a = true;
        }

        public void c(j jVar) {
            v.b(this.f3351b, false);
        }

        public void d(j jVar) {
            v.b(this.f3351b, true);
        }

        public void e(j jVar) {
            if (!this.f3350a) {
                v.b(this.f3351b, false);
            }
            jVar.x(this);
        }
    }

    /* compiled from: ChangeBounds */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f3352a;

        /* renamed from: b  reason: collision with root package name */
        public int f3353b;

        /* renamed from: c  reason: collision with root package name */
        public int f3354c;

        /* renamed from: d  reason: collision with root package name */
        public int f3355d;

        /* renamed from: e  reason: collision with root package name */
        public View f3356e;

        /* renamed from: f  reason: collision with root package name */
        public int f3357f;

        /* renamed from: g  reason: collision with root package name */
        public int f3358g;

        public i(View view) {
            this.f3356e = view;
        }
    }

    static {
        new a(PointF.class, "boundsOrigin");
    }

    public final void K(r rVar) {
        View view = rVar.f3442b;
        if (c0.r(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            rVar.f3441a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            rVar.f3441a.put("android:changeBounds:parent", rVar.f3442b.getParent());
        }
    }

    public void d(r rVar) {
        K(rVar);
    }

    public void g(r rVar) {
        K(rVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator l(android.view.ViewGroup r19, b2.r r20, b2.r r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x0135
            if (r2 != 0) goto L_0x000c
            goto L_0x0135
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f3441a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f3441a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x0133
            if (r5 != 0) goto L_0x0024
            goto L_0x0133
        L_0x0024:
            android.view.View r4 = r2.f3442b
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f3441a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f3441a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r3 = r6 - r10
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f3441a
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f3441a
            java.lang.Object r0 = r2.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r2 = 1
            if (r13 == 0) goto L_0x0067
            if (r14 != 0) goto L_0x006b
        L_0x0067:
            if (r15 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
        L_0x006b:
            if (r7 != r8) goto L_0x0073
            if (r9 == r10) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r16 = 0
            goto L_0x0075
        L_0x0073:
            r16 = 1
        L_0x0075:
            if (r11 != r12) goto L_0x0079
            if (r5 == r6) goto L_0x007e
        L_0x0079:
            int r16 = r16 + 1
            goto L_0x007e
        L_0x007c:
            r16 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x0086
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x008a
        L_0x0086:
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            int r16 = r16 + 1
        L_0x008c:
            r0 = r16
            if (r0 <= 0) goto L_0x012f
            b2.z.c(r4, r7, r9, r11, r5)
            r1 = 2
            if (r0 != r1) goto L_0x00ed
            if (r13 != r15) goto L_0x00ad
            if (r14 != r3) goto L_0x00ad
            r0 = r18
            b2.g r1 = r0.B
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.a(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = K
            android.animation.ObjectAnimator r1 = b2.f.a(r4, r3, r1)
            goto L_0x0115
        L_0x00ad:
            r0 = r18
            b2.c$i r3 = new b2.c$i
            r3.<init>(r4)
            b2.g r13 = r0.B
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.a(r7, r9, r8, r10)
            android.util.Property<b2.c$i, android.graphics.PointF> r8 = G
            android.animation.ObjectAnimator r7 = b2.f.a(r3, r8, r7)
            b2.g r8 = r0.B
            float r9 = (float) r11
            float r5 = (float) r5
            float r10 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r8.a(r9, r5, r10, r6)
            android.util.Property<b2.c$i, android.graphics.PointF> r6 = H
            android.animation.ObjectAnimator r5 = b2.f.a(r3, r6, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r8 = 0
            r1[r8] = r7
            r1[r2] = r5
            r6.playTogether(r1)
            b2.c$g r1 = new b2.c$g
            r1.<init>(r0, r3)
            r6.addListener(r1)
            r1 = r6
            goto L_0x0115
        L_0x00ed:
            r0 = r18
            if (r7 != r8) goto L_0x0105
            if (r9 == r10) goto L_0x00f4
            goto L_0x0105
        L_0x00f4:
            b2.g r1 = r0.B
            float r3 = (float) r11
            float r5 = (float) r5
            float r7 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.a(r3, r5, r7, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = I
            android.animation.ObjectAnimator r1 = b2.f.a(r4, r3, r1)
            goto L_0x0115
        L_0x0105:
            b2.g r1 = r0.B
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.a(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = J
            android.animation.ObjectAnimator r1 = b2.f.a(r4, r3, r1)
        L_0x0115:
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x012e
            android.view.ViewParent r3 = r4.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            b2.v.b(r3, r2)
            b2.c$h r2 = new b2.c$h
            r2.<init>(r0, r3)
            r0.a(r2)
        L_0x012e:
            return r1
        L_0x012f:
            r0 = r18
            r1 = 0
            return r1
        L_0x0133:
            r1 = 0
            return r1
        L_0x0135:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.c.l(android.view.ViewGroup, b2.r, b2.r):android.animation.Animator");
    }

    public String[] q() {
        return F;
    }
}
