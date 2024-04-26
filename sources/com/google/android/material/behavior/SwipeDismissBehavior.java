package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.b;
import java.util.WeakHashMap;
import o0.c0;
import p0.c;
import v0.d;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public d f8937a;

    /* renamed from: b  reason: collision with root package name */
    public b f8938b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8939c;

    /* renamed from: d  reason: collision with root package name */
    public int f8940d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f8941e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f8942f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f8943g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final d.c f8944h = new a();

    public class a extends d.c {

        /* renamed from: a  reason: collision with root package name */
        public int f8945a;

        /* renamed from: b  reason: collision with root package name */
        public int f8946b = -1;

        public a() {
        }

        public int a(View view, int i10, int i11) {
            int i12;
            int i13;
            int width;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            boolean z10 = c0.e.d(view) == 1;
            int i14 = SwipeDismissBehavior.this.f8940d;
            if (i14 != 0) {
                if (i14 != 1) {
                    i12 = this.f8945a - view.getWidth();
                    i13 = view.getWidth() + this.f8945a;
                } else if (z10) {
                    i12 = this.f8945a;
                    width = view.getWidth();
                } else {
                    i12 = this.f8945a - view.getWidth();
                    i13 = this.f8945a;
                }
                return Math.min(Math.max(i12, i10), i13);
            } else if (z10) {
                i12 = this.f8945a - view.getWidth();
                i13 = this.f8945a;
                return Math.min(Math.max(i12, i10), i13);
            } else {
                i12 = this.f8945a;
                width = view.getWidth();
            }
            i13 = width + i12;
            return Math.min(Math.max(i12, i10), i13);
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int c(View view) {
            return view.getWidth();
        }

        public void g(View view, int i10) {
            this.f8946b = i10;
            this.f8945a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void h(int i10) {
            b bVar = SwipeDismissBehavior.this.f8938b;
            if (bVar != null) {
                com.google.android.material.snackbar.a aVar = (com.google.android.material.snackbar.a) bVar;
                aVar.getClass();
                if (i10 == 0) {
                    com.google.android.material.snackbar.b a10 = com.google.android.material.snackbar.b.a();
                    aVar.f9397a.getClass();
                    synchronized (a10.f9399a) {
                        a10.b((b.C0098b) null);
                    }
                } else if (i10 == 1 || i10 == 2) {
                    com.google.android.material.snackbar.b a11 = com.google.android.material.snackbar.b.a();
                    aVar.f9397a.getClass();
                    synchronized (a11.f9399a) {
                        a11.b((b.C0098b) null);
                    }
                }
            }
        }

        public void i(View view, int i10, int i11, int i12, int i13) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f8942f) + ((float) this.f8945a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f8943g) + ((float) this.f8945a);
            float f10 = (float) i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.t(0.0f, 1.0f - ((f10 - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
            if (java.lang.Math.abs(r7.getLeft() - r6.f8945a) >= java.lang.Math.round(((float) r7.getWidth()) * r6.f8947c.f8941e)) goto L_0x002e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void j(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                r9 = -1
                r6.f8946b = r9
                int r9 = r7.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0040
                java.util.WeakHashMap<android.view.View, java.lang.String> r3 = o0.c0.f22553a
                int r3 = o0.c0.e.d(r7)
                if (r3 != r2) goto L_0x0018
                r3 = 1
                goto L_0x0019
            L_0x0018:
                r3 = 0
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f8940d
                r5 = 2
                if (r4 != r5) goto L_0x0021
                goto L_0x002e
            L_0x0021:
                if (r4 != 0) goto L_0x0032
                if (r3 == 0) goto L_0x002a
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0030
                goto L_0x002e
            L_0x002a:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0030
            L_0x002e:
                r8 = 1
                goto L_0x005d
            L_0x0030:
                r8 = 0
                goto L_0x005d
            L_0x0032:
                if (r4 != r2) goto L_0x0030
                if (r3 == 0) goto L_0x003b
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x0030
                goto L_0x003f
            L_0x003b:
                int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r8 >= 0) goto L_0x0030
            L_0x003f:
                goto L_0x002e
            L_0x0040:
                int r8 = r7.getLeft()
                int r0 = r6.f8945a
                int r8 = r8 - r0
                int r0 = r7.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f8941e
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r0) goto L_0x0030
                goto L_0x002e
            L_0x005d:
                if (r8 == 0) goto L_0x006c
                int r8 = r7.getLeft()
                int r0 = r6.f8945a
                if (r8 >= r0) goto L_0x0069
                int r0 = r0 - r9
                goto L_0x006a
            L_0x0069:
                int r0 = r0 + r9
            L_0x006a:
                r1 = 1
                goto L_0x006e
            L_0x006c:
                int r0 = r6.f8945a
            L_0x006e:
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                v0.d r8 = r8.f8937a
                int r9 = r7.getTop()
                boolean r8 = r8.v(r0, r9)
                if (r8 == 0) goto L_0x0089
                com.google.android.material.behavior.SwipeDismissBehavior$c r8 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r8.<init>(r7, r1)
                java.util.WeakHashMap<android.view.View, java.lang.String> r9 = o0.c0.f22553a
                o0.c0.d.m(r7, r8)
                goto L_0x0096
            L_0x0089:
                if (r1 == 0) goto L_0x0096
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r8 = r8.f8938b
                if (r8 == 0) goto L_0x0096
                com.google.android.material.snackbar.a r8 = (com.google.android.material.snackbar.a) r8
                r8.a(r7)
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.j(android.view.View, float, float):void");
        }

        public boolean k(View view, int i10) {
            int i11 = this.f8946b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.s(view);
        }
    }

    public interface b {
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final View f8948a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8949b;

        public c(View view, boolean z10) {
            this.f8948a = view;
            this.f8949b = z10;
        }

        public void run() {
            b bVar;
            d dVar = SwipeDismissBehavior.this.f8937a;
            if (dVar != null && dVar.i(true)) {
                View view = this.f8948a;
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                c0.d.m(view, this);
            } else if (this.f8949b && (bVar = SwipeDismissBehavior.this.f8938b) != null) {
                ((com.google.android.material.snackbar.a) bVar).a(this.f8948a);
            }
        }
    }

    public static float t(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f8939c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.p(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f8939c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f8939c = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f8937a == null) {
            this.f8937a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f8944h);
        }
        return this.f8937a.w(motionEvent);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (c0.d.c(v10) != 0) {
            return false;
        }
        c0.I(v10, 1);
        c0.x(v10, 1048576);
        if (!s(v10)) {
            return false;
        }
        c0.z(v10, c.a.f23758l, (CharSequence) null, new a(this));
        return false;
    }

    public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        d dVar = this.f8937a;
        if (dVar == null) {
            return false;
        }
        dVar.p(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
