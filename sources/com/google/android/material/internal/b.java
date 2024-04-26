package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* compiled from: StaticLayoutBuilderCompat */
public final class b {

    /* renamed from: m  reason: collision with root package name */
    public static final int f9350m = (Build.VERSION.SDK_INT >= 23 ? 1 : 0);

    /* renamed from: n  reason: collision with root package name */
    public static boolean f9351n;

    /* renamed from: o  reason: collision with root package name */
    public static Constructor<StaticLayout> f9352o;

    /* renamed from: p  reason: collision with root package name */
    public static Object f9353p;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f9354a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f9355b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9356c;

    /* renamed from: d  reason: collision with root package name */
    public int f9357d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f9358e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f9359f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f9360g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f9361h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f9362i = f9350m;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9363j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9364k;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f9365l = null;

    /* compiled from: StaticLayoutBuilderCompat */
    public static class a extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.b.a.<init>(java.lang.Throwable):void");
        }
    }

    public b(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f9354a = charSequence;
        this.f9355b = textPaint;
        this.f9356c = i10;
        this.f9357d = charSequence.length();
    }

    public StaticLayout a() throws a {
        Class cls;
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f9354a == null) {
            this.f9354a = "";
        }
        int max = Math.max(0, this.f9356c);
        CharSequence charSequence = this.f9354a;
        if (this.f9359f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f9355b, (float) max, this.f9365l);
        }
        int min = Math.min(charSequence.length(), this.f9357d);
        this.f9357d = min;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (this.f9364k && this.f9359f == 1) {
                this.f9358e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f9355b, max);
            obtain.setAlignment(this.f9358e);
            obtain.setIncludePad(this.f9363j);
            if (this.f9364k) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.f9365l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f9359f);
            float f10 = this.f9360g;
            if (!(f10 == 0.0f && this.f9361h == 1.0f)) {
                obtain.setLineSpacing(f10, this.f9361h);
            }
            if (this.f9359f > 1) {
                obtain.setHyphenationFrequency(this.f9362i);
            }
            return obtain.build();
        }
        if (!f9351n) {
            try {
                boolean z10 = this.f9364k && i10 >= 23;
                if (i10 >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f9353p = z10 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                } else {
                    ClassLoader classLoader = b.class.getClassLoader();
                    String str = this.f9364k ? "RTL" : "LTR";
                    Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                    Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                    f9353p = loadClass2.getField(str).get(loadClass2);
                    cls = loadClass;
                }
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f9352o = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f9351n = true;
            } catch (Exception e10) {
                throw new a(e10);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f9352o;
            constructor.getClass();
            Object obj = f9353p;
            obj.getClass();
            return constructor.newInstance(new Object[]{charSequence, 0, Integer.valueOf(this.f9357d), this.f9355b, Integer.valueOf(max), this.f9358e, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f9363j), null, Integer.valueOf(max), Integer.valueOf(this.f9359f)});
        } catch (Exception e11) {
            throw new a(e11);
        }
    }
}
