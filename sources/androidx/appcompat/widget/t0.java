package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.k;
import c2.b;
import c2.h;
import com.startapp.startappsdk.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import s.i;
import s.j;

/* compiled from: ResourceManagerInternal */
public final class t0 {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f1095h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    public static t0 f1096i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f1097j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, j<ColorStateList>> f1098a;

    /* renamed from: b  reason: collision with root package name */
    public i<String, e> f1099b;

    /* renamed from: c  reason: collision with root package name */
    public j<String> f1100c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, s.f<WeakReference<Drawable.ConstantState>>> f1101d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1102e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1103f;

    /* renamed from: g  reason: collision with root package name */
    public f f1104g;

    /* compiled from: ResourceManagerInternal */
    public static class a implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.b.g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    public static class b implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                c2.b bVar = new c2.b(context, (b.C0057b) null, (Resources) null);
                bVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return bVar;
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    public static class c extends s.g<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }
    }

    /* compiled from: ResourceManagerInternal */
    public static class d implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (Build.VERSION.SDK_INT >= 21) {
                    i.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                } else {
                    drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                }
                return drawable;
            } catch (Exception e10) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal */
    public interface f {
    }

    /* compiled from: ResourceManagerInternal */
    public static class g implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static synchronized t0 d() {
        t0 t0Var;
        synchronized (t0.class) {
            if (f1096i == null) {
                t0 t0Var2 = new t0();
                f1096i = t0Var2;
                j(t0Var2);
            }
            t0Var = f1096i;
        }
        return t0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (t0.class) {
            c cVar = f1097j;
            cVar.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.b(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                cVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar.c(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(t0 t0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            t0Var.a("vector", new g());
            t0Var.a("animated-vector", new b());
            t0Var.a("animated-selector", new a());
            t0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f1099b == null) {
            this.f1099b = new i<>();
        }
        this.f1099b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        s.f fVar = this.f1101d.get(context);
        if (fVar == null) {
            fVar = new s.f(10);
            this.f1101d.put(context, fVar);
        }
        fVar.h(j10, new WeakReference(constantState));
        return true;
    }

    public final Drawable c(Context context, int i10) {
        if (this.f1102e == null) {
            this.f1102e = new TypedValue();
        }
        TypedValue typedValue = this.f1102e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e10 = e(context, j10);
        if (e10 != null) {
            return e10;
        }
        f fVar = this.f1104g;
        LayerDrawable layerDrawable = null;
        if (fVar != null) {
            k.a aVar = (k.a) fVar;
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f24820c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, s.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1101d     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            s.f r0 = (s.f) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.f(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f24819b     // Catch:{ all -> 0x0041 }
            int r2 = r0.f24821d     // Catch:{ all -> 0x0041 }
            int r4 = s.e.b(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f24820c     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = s.f.f24817e     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f24818a = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable g(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f1103f     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            r0 = 1
            r4.f1103f = r0     // Catch:{ all -> 0x0048 }
            r1 = 2131230805(0x7f080055, float:1.8077673E38)
            android.graphics.drawable.Drawable r1 = r4.f(r5, r1)     // Catch:{ all -> 0x0048 }
            r2 = 0
            if (r1 == 0) goto L_0x004a
            boolean r3 = r1 instanceof c2.h     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0048 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x004a
        L_0x002b:
            android.graphics.drawable.Drawable r0 = r4.k(r5, r6)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r4.c(r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x0035:
            if (r0 != 0) goto L_0x003b
            android.graphics.drawable.Drawable r0 = d0.a.c(r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x003b:
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.Drawable r0 = r4.l(r5, r6, r7, r0)     // Catch:{ all -> 0x0048 }
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            androidx.appcompat.widget.k0.a(r0)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r4)
            return r0
        L_0x0048:
            r5 = move-exception
            goto L_0x0054
        L_0x004a:
            r4.f1103f = r2     // Catch:{ all -> 0x0048 }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x0048 }
            throw r5     // Catch:{ all -> 0x0048 }
        L_0x0054:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList i(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, s.j<android.content.res.ColorStateList>> r0 = r3.f1098a     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            s.j r0 = (s.j) r0     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.e(r5, r1)     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0049 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x004b
            androidx.appcompat.widget.t0$f r0 = r3.f1104g     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.k.a) r0     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r1 = r0.d(r4, r5)     // Catch:{ all -> 0x0049 }
        L_0x0023:
            if (r1 == 0) goto L_0x0047
            java.util.WeakHashMap<android.content.Context, s.j<android.content.res.ColorStateList>> r0 = r3.f1098a     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            r3.f1098a = r0     // Catch:{ all -> 0x0049 }
        L_0x0030:
            java.util.WeakHashMap<android.content.Context, s.j<android.content.res.ColorStateList>> r0 = r3.f1098a     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            s.j r0 = (s.j) r0     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0044
            s.j r0 = new s.j     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            java.util.WeakHashMap<android.content.Context, s.j<android.content.res.ColorStateList>> r2 = r3.f1098a     // Catch:{ all -> 0x0049 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0049 }
        L_0x0044:
            r0.a(r5, r1)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            r0 = r1
            goto L_0x004b
        L_0x0049:
            r4 = move-exception
            goto L_0x004d
        L_0x004b:
            monitor-exit(r3)
            return r0
        L_0x004d:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.i(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[Catch:{ Exception -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable k(android.content.Context r11, int r12) {
        /*
            r10 = this;
            s.i<java.lang.String, androidx.appcompat.widget.t0$e> r0 = r10.f1099b
            r1 = 0
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b7
            s.j<java.lang.String> r0 = r10.f1100c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.e(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            s.i<java.lang.String, androidx.appcompat.widget.t0$e> r3 = r10.f1099b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            s.j r0 = new s.j
            r0.<init>()
            r10.f1100c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1102e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1102e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1102e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            int r4 = r0.assetCookie
            long r4 = (long) r4
            r6 = 32
            long r4 = r4 << r6
            int r6 = r0.data
            long r6 = (long) r6
            long r4 = r4 | r6
            android.graphics.drawable.Drawable r6 = r10.e(r11, r4)
            if (r6 == 0) goto L_0x0055
            return r6
        L_0x0055:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00af
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00af
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a7 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a7 }
        L_0x006d:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a7 }
            r9 = 2
            if (r8 == r9) goto L_0x0077
            if (r8 == r3) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            if (r8 != r9) goto L_0x009f
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a7 }
            s.j<java.lang.String> r8 = r10.f1100c     // Catch:{ Exception -> 0x00a7 }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x00a7 }
            s.i<java.lang.String, androidx.appcompat.widget.t0$e> r8 = r10.f1099b     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a7 }
            androidx.appcompat.widget.t0$e r3 = (androidx.appcompat.widget.t0.e) r3     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x0094
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a7 }
            android.graphics.drawable.Drawable r6 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a7 }
        L_0x0094:
            if (r6 == 0) goto L_0x00af
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a7 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a7 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00af
        L_0x009f:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a7 }
            throw r11     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00af:
            if (r6 != 0) goto L_0x00b6
            s.j<java.lang.String> r11 = r10.f1100c
            r11.a(r12, r2)
        L_0x00b6:
            return r6
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.k(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final Drawable l(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList i11 = i(context, i10);
        PorterDuff.Mode mode = null;
        if (i11 != null) {
            int[] iArr = k0.f975a;
            Drawable n10 = androidx.core.graphics.drawable.a.n(drawable.mutate());
            androidx.core.graphics.drawable.a.l(n10, i11);
            f fVar = this.f1104g;
            if (fVar != null) {
                k.a aVar = (k.a) fVar;
                if (i10 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return n10;
            }
            androidx.core.graphics.drawable.a.m(n10, mode);
            return n10;
        }
        f fVar2 = this.f1104g;
        if (fVar2 != null) {
            k.a aVar2 = (k.a) fVar2;
            boolean z11 = true;
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c10 = b1.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = k.f966b;
                aVar2.e(findDrawableByLayerId, c10, mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908303), b1.c(context, R.attr.colorControlNormal), mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908301), b1.c(context, R.attr.colorControlActivated), mode2);
            } else if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b10 = b1.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = k.f966b;
                aVar2.e(findDrawableByLayerId2, b10, mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908303), b1.c(context, R.attr.colorControlActivated), mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908301), b1.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z11 = false;
            }
            if (z11) {
                return drawable;
            }
        }
        if (m(context, i10, drawable) || !z10) {
            return drawable;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.t0$f r0 = r7.f1104g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006e
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.k.a) r0
            r0.getClass()
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.k.f966b
            int[] r4 = r0.f969a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001d
            r5 = 2130968838(0x7f040106, float:1.754634E38)
            goto L_0x0049
        L_0x001d:
            int[] r4 = r0.f971c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L_0x0029
            r5 = 2130968836(0x7f040104, float:1.7546337E38)
            goto L_0x0049
        L_0x0029:
            int[] r4 = r0.f972d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L_0x0034
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0049
        L_0x0034:
            r0 = 2131230764(0x7f08002c, float:1.807759E38)
            if (r9 != r0) goto L_0x0044
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x004b
        L_0x0044:
            r0 = 2131230746(0x7f08001a, float:1.8077553E38)
            if (r9 != r0) goto L_0x004d
        L_0x0049:
            r9 = r5
            r0 = -1
        L_0x004b:
            r4 = 1
            goto L_0x0050
        L_0x004d:
            r9 = 0
            r0 = -1
            r4 = 0
        L_0x0050:
            if (r4 == 0) goto L_0x006a
            int[] r4 = androidx.appcompat.widget.k0.f975a
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = androidx.appcompat.widget.b1.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.k.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0068
            r10.setAlpha(r0)
        L_0x0068:
            r8 = 1
            goto L_0x006b
        L_0x006a:
            r8 = 0
        L_0x006b:
            if (r8 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
