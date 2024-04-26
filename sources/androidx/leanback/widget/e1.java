package androidx.leanback.widget;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.leanback.widget.c1;
import com.startapp.startappsdk.R;

/* compiled from: ShadowOverlayHelper */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public int f2377a = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2378b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2379c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2380d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2381e;

    /* renamed from: f  reason: collision with root package name */
    public int f2382f;

    /* renamed from: g  reason: collision with root package name */
    public float f2383g;

    /* renamed from: h  reason: collision with root package name */
    public float f2384h;

    /* compiled from: ShadowOverlayHelper */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2385a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2386b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2387c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2388d = true;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2389e;

        /* renamed from: f  reason: collision with root package name */
        public b f2390f = b.f2391a;

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.leanback.widget.e1 a(android.content.Context r7) {
            /*
                r6 = this;
                androidx.leanback.widget.e1 r0 = new androidx.leanback.widget.e1
                r0.<init>()
                boolean r1 = r6.f2385a
                r0.f2378b = r1
                boolean r1 = r6.f2386b
                r2 = 0
                r3 = 1
                r4 = 21
                if (r1 == 0) goto L_0x001c
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r4) goto L_0x0017
                r1 = 1
                goto L_0x0018
            L_0x0017:
                r1 = 0
            L_0x0018:
                if (r1 == 0) goto L_0x001c
                r1 = 1
                goto L_0x001d
            L_0x001c:
                r1 = 0
            L_0x001d:
                r0.f2379c = r1
                boolean r1 = r6.f2387c
                if (r1 == 0) goto L_0x002b
                boolean r1 = androidx.leanback.widget.e1.d()
                if (r1 == 0) goto L_0x002b
                r1 = 1
                goto L_0x002c
            L_0x002b:
                r1 = 0
            L_0x002c:
                r0.f2380d = r1
                boolean r1 = r0.f2379c
                if (r1 == 0) goto L_0x0044
                androidx.leanback.widget.e1$b r1 = r6.f2390f
                r1.getClass()
                android.content.res.Resources r1 = r7.getResources()
                r5 = 2131165591(0x7f070197, float:1.7945403E38)
                int r1 = r1.getDimensionPixelSize(r5)
                r0.f2382f = r1
            L_0x0044:
                boolean r1 = r0.f2380d
                r5 = 23
                if (r1 == 0) goto L_0x008f
                boolean r1 = r6.f2388d
                if (r1 == 0) goto L_0x0089
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r4) goto L_0x0054
                r4 = 1
                goto L_0x0055
            L_0x0054:
                r4 = 0
            L_0x0055:
                if (r4 != 0) goto L_0x0058
                goto L_0x0089
            L_0x0058:
                r4 = 3
                r0.f2377a = r4
                androidx.leanback.widget.e1$b r4 = r6.f2390f
                r4.getClass()
                android.content.res.Resources r7 = r7.getResources()
                r4 = 2131165524(0x7f070154, float:1.7945268E38)
                float r4 = r7.getDimension(r4)
                r0.f2384h = r4
                r4 = 2131165525(0x7f070155, float:1.794527E38)
                float r7 = r7.getDimension(r4)
                r0.f2383g = r7
                if (r1 < r5) goto L_0x007a
                r7 = 1
                goto L_0x007b
            L_0x007a:
                r7 = 0
            L_0x007b:
                if (r7 == 0) goto L_0x0081
                boolean r7 = r6.f2389e
                if (r7 == 0) goto L_0x0086
            L_0x0081:
                boolean r7 = r0.f2378b
                if (r7 == 0) goto L_0x0086
                r2 = 1
            L_0x0086:
                r0.f2381e = r2
                goto L_0x00a5
            L_0x0089:
                r7 = 2
                r0.f2377a = r7
                r0.f2381e = r3
                goto L_0x00a5
            L_0x008f:
                r0.f2377a = r3
                int r7 = android.os.Build.VERSION.SDK_INT
                if (r7 < r5) goto L_0x0097
                r7 = 1
                goto L_0x0098
            L_0x0097:
                r7 = 0
            L_0x0098:
                if (r7 == 0) goto L_0x009e
                boolean r7 = r6.f2389e
                if (r7 == 0) goto L_0x00a3
            L_0x009e:
                boolean r7 = r0.f2378b
                if (r7 == 0) goto L_0x00a3
                r2 = 1
            L_0x00a3:
                r0.f2381e = r2
            L_0x00a5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.e1.a.a(android.content.Context):androidx.leanback.widget.e1");
        }
    }

    /* compiled from: ShadowOverlayHelper */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2391a = new b();
    }

    public static void b(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        Drawable foreground = i11 >= 23 ? view.getForeground() : null;
        if (foreground instanceof ColorDrawable) {
            ((ColorDrawable) foreground).setColor(i10);
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        if (i11 >= 23) {
            view.setForeground(colorDrawable);
        }
    }

    public static void c(Object obj, int i10, float f10) {
        if (obj != null) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (i10 != 2) {
                if (i10 == 3 && Build.VERSION.SDK_INT >= 21) {
                    ViewOutlineProvider viewOutlineProvider = c1.f2332a;
                    c1.b bVar = (c1.b) obj;
                    View view = bVar.f2333a;
                    float f11 = bVar.f2334b;
                    view.setZ(((bVar.f2335c - f11) * f10) + f11);
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                k1 k1Var = (k1) obj;
                k1Var.f2408a.setAlpha(1.0f - f10);
                k1Var.f2409b.setAlpha(f10);
            }
        }
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void a(View view) {
        if (this.f2381e) {
            return;
        }
        if (!this.f2380d) {
            if (this.f2379c) {
                int i10 = this.f2382f;
                if (Build.VERSION.SDK_INT >= 21) {
                    u0.a(view, true, i10);
                }
            }
        } else if (this.f2377a == 3) {
            view.setTag(R.id.lb_shadow_impl, b1.a(view, this.f2383g, this.f2384h, this.f2382f));
        } else if (this.f2379c) {
            int i11 = this.f2382f;
            if (Build.VERSION.SDK_INT >= 21) {
                u0.a(view, true, i11);
            }
        }
    }
}
