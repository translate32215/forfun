package f0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f18046a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<e, SparseArray<d>> f18047b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f18048c = new Object();

    /* compiled from: ResourcesCompat */
    public static class a {
        public static Drawable a(Resources resources, int i10, int i11) {
            return resources.getDrawableForDensity(i10, i11);
        }
    }

    /* compiled from: ResourcesCompat */
    public static class b {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    public static class c {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f18049a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f18050b;

        /* renamed from: c  reason: collision with root package name */
        public final int f18051c;

        public d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i10;
            this.f18049a = colorStateList;
            this.f18050b = configuration;
            if (theme == null) {
                i10 = 0;
            } else {
                i10 = theme.hashCode();
            }
            this.f18051c = i10;
        }
    }

    /* compiled from: ResourcesCompat */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f18052a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f18053b;

        public e(Resources resources, Resources.Theme theme) {
            this.f18052a = resources;
            this.f18053b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (!this.f18052a.equals(eVar.f18052a) || !n0.b.a(this.f18053b, eVar.f18053b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return n0.b.b(this.f18052a, this.f18053b);
        }
    }

    /* compiled from: ResourcesCompat */
    public static abstract class f {
        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i10, Handler handler) {
            c(handler).post(new h(this, i10));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new i(this, typeface));
        }

        public abstract void d(int i10);

        public abstract void e(Typeface typeface);
    }

    public static Drawable a(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.a(resources, i10, theme);
        }
        return resources.getDrawable(i10);
    }

    public static Typeface b(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i10, new TypedValue(), 0, (f) null, (Handler) null, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface c(android.content.Context r18, int r19, android.util.TypedValue r20, int r21, f0.g.f r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r11 = r19
            r0 = r20
            r12 = r22
            r13 = r23
            android.content.res.Resources r3 = r18.getResources()
            r1 = 1
            r3.getValue(r11, r0, r1)
            java.lang.String r14 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x0101
            java.lang.String r15 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r15.startsWith(r1)
            r2 = -3
            r16 = 0
            if (r1 != 0) goto L_0x002c
            if (r12 == 0) goto L_0x00dd
            r12.a(r2, r13)
            goto L_0x00dd
        L_0x002c:
            int r1 = r0.assetCookie
            s.g<java.lang.String, android.graphics.Typeface> r4 = g0.e.f18363b
            r7 = r21
            java.lang.String r1 = g0.e.c(r3, r11, r15, r1, r7)
            java.lang.Object r1 = r4.b(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0047
            if (r12 == 0) goto L_0x0043
            r12.b(r1, r13)
        L_0x0043:
            r16 = r1
            goto L_0x00dd
        L_0x0047:
            if (r25 == 0) goto L_0x004b
            goto L_0x00dd
        L_0x004b:
            java.lang.String r1 = r15.toLowerCase()     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            java.lang.String r4 = ".xml"
            boolean r1 = r1.endsWith(r4)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            if (r1 == 0) goto L_0x0088
            android.content.res.XmlResourceParser r1 = r3.getXml(r11)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            f0.e$b r4 = f0.e.a(r1, r3)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            if (r4 != 0) goto L_0x006d
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r14, r0)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            if (r12 == 0) goto L_0x00dd
            r12.a(r2, r13)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            goto L_0x00dd
        L_0x006d:
            int r6 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            r17 = -3
            r1 = r18
            r2 = r4
            r4 = r19
            r5 = r15
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r16 = g0.e.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x0086, IOException -> 0x0084 }
            goto L_0x00dd
        L_0x0084:
            r0 = move-exception
            goto L_0x00ab
        L_0x0086:
            r0 = move-exception
            goto L_0x00c2
        L_0x0088:
            r8 = -3
            int r5 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            r1 = r18
            r2 = r3
            r3 = r19
            r4 = r15
            r6 = r21
            android.graphics.Typeface r0 = g0.e.b(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            if (r12 == 0) goto L_0x00a2
            if (r0 == 0) goto L_0x009f
            r12.b(r0, r13)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
            goto L_0x00a2
        L_0x009f:
            r12.a(r8, r13)     // Catch:{ XmlPullParserException -> 0x00a7, IOException -> 0x00a5 }
        L_0x00a2:
            r16 = r0
            goto L_0x00dd
        L_0x00a5:
            r0 = move-exception
            goto L_0x00a9
        L_0x00a7:
            r0 = move-exception
            goto L_0x00c0
        L_0x00a9:
            r17 = -3
        L_0x00ab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1, r0)
            goto L_0x00d6
        L_0x00c0:
            r17 = -3
        L_0x00c2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r14, r1, r0)
        L_0x00d6:
            r0 = r17
            if (r12 == 0) goto L_0x00dd
            r12.a(r0, r13)
        L_0x00dd:
            if (r16 != 0) goto L_0x0100
            if (r12 != 0) goto L_0x0100
            if (r25 == 0) goto L_0x00e4
            goto L_0x0100
        L_0x00e4:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = android.support.v4.media.a.a(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r19)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0100:
            return r16
        L_0x0101:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r2 = "Resource \""
            java.lang.StringBuilder r2 = android.support.v4.media.a.a(r2)
            java.lang.String r3 = r3.getResourceName(r11)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r19)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.g.c(android.content.Context, int, android.util.TypedValue, int, f0.g$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
