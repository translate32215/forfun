package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import e.l;
import f0.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import o0.c0;

/* compiled from: AppCompatTextHelper */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f877a;

    /* renamed from: b  reason: collision with root package name */
    public e1 f878b;

    /* renamed from: c  reason: collision with root package name */
    public e1 f879c;

    /* renamed from: d  reason: collision with root package name */
    public e1 f880d;

    /* renamed from: e  reason: collision with root package name */
    public e1 f881e;

    /* renamed from: f  reason: collision with root package name */
    public e1 f882f;

    /* renamed from: g  reason: collision with root package name */
    public e1 f883g;

    /* renamed from: h  reason: collision with root package name */
    public e1 f884h;

    /* renamed from: i  reason: collision with root package name */
    public final g0 f885i;

    /* renamed from: j  reason: collision with root package name */
    public int f886j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f887k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f888l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f889m;

    /* compiled from: AppCompatTextHelper */
    public class a extends g.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f890a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f891b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f892c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f890a = i10;
            this.f891b = i11;
            this.f892c = weakReference;
        }

        public void d(int i10) {
        }

        public void e(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f890a) != -1) {
                typeface = f.a(typeface, i10, (this.f891b & 2) != 0);
            }
            e0 e0Var = e0.this;
            WeakReference weakReference = this.f892c;
            if (e0Var.f889m) {
                e0Var.f888l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView == null) {
                    return;
                }
                if (c0.q(textView)) {
                    textView.post(new f0(e0Var, textView, typeface, e0Var.f886j));
                } else {
                    textView.setTypeface(typeface, e0Var.f886j);
                }
            }
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class c {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class e {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper */
    public static class f {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public e0(TextView textView) {
        this.f877a = textView;
        this.f885i = new g0(textView);
    }

    public static e1 c(Context context, k kVar, int i10) {
        ColorStateList d10 = kVar.d(context, i10);
        if (d10 == null) {
            return null;
        }
        e1 e1Var = new e1();
        e1Var.f897d = true;
        e1Var.f894a = d10;
        return e1Var;
    }

    public final void a(Drawable drawable, e1 e1Var) {
        if (drawable != null && e1Var != null) {
            k.f(drawable, e1Var, this.f877a.getDrawableState());
        }
    }

    public void b() {
        if (!(this.f878b == null && this.f879c == null && this.f880d == null && this.f881e == null)) {
            Drawable[] compoundDrawables = this.f877a.getCompoundDrawables();
            a(compoundDrawables[0], this.f878b);
            a(compoundDrawables[1], this.f879c);
            a(compoundDrawables[2], this.f880d);
            a(compoundDrawables[3], this.f881e);
        }
        if (this.f882f != null || this.f883g != null) {
            Drawable[] a10 = b.a(this.f877a);
            a(a10[0], this.f882f);
            a(a10[2], this.f883g);
        }
    }

    public ColorStateList d() {
        e1 e1Var = this.f884h;
        if (e1Var != null) {
            return e1Var.f894a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        e1 e1Var = this.f884h;
        if (e1Var != null) {
            return e1Var.f895b;
        }
        return null;
    }

    public boolean f() {
        g0 g0Var = this.f885i;
        return g0Var.i() && g0Var.f912a != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(android.util.AttributeSet r28, int r29) {
        /*
            r27 = this;
            r0 = r27
            r8 = r28
            r9 = r29
            android.widget.TextView r1 = r0.f877a
            android.content.Context r10 = r1.getContext()
            androidx.appcompat.widget.k r11 = androidx.appcompat.widget.k.a()
            int[] r3 = e.l.f13508h
            r12 = 0
            androidx.appcompat.widget.g1 r13 = androidx.appcompat.widget.g1.r(r10, r8, r3, r9, r12)
            android.widget.TextView r1 = r0.f877a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r13.f924b
            r7 = 0
            r4 = r28
            r6 = r29
            o0.c0.B(r1, r2, r3, r4, r5, r6, r7)
            r14 = -1
            int r1 = r13.m(r12, r14)
            r15 = 3
            boolean r2 = r13.p(r15)
            if (r2 == 0) goto L_0x003d
            int r2 = r13.m(r15, r12)
            androidx.appcompat.widget.e1 r2 = c(r10, r11, r2)
            r0.f878b = r2
        L_0x003d:
            r7 = 1
            boolean r2 = r13.p(r7)
            if (r2 == 0) goto L_0x004e
            int r2 = r13.m(r7, r12)
            androidx.appcompat.widget.e1 r2 = c(r10, r11, r2)
            r0.f879c = r2
        L_0x004e:
            r6 = 4
            boolean r2 = r13.p(r6)
            if (r2 == 0) goto L_0x005f
            int r2 = r13.m(r6, r12)
            androidx.appcompat.widget.e1 r2 = c(r10, r11, r2)
            r0.f880d = r2
        L_0x005f:
            r5 = 2
            boolean r2 = r13.p(r5)
            if (r2 == 0) goto L_0x0070
            int r2 = r13.m(r5, r12)
            androidx.appcompat.widget.e1 r2 = c(r10, r11, r2)
            r0.f881e = r2
        L_0x0070:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 5
            boolean r3 = r13.p(r4)
            if (r3 == 0) goto L_0x0083
            int r3 = r13.m(r4, r12)
            androidx.appcompat.widget.e1 r3 = c(r10, r11, r3)
            r0.f882f = r3
        L_0x0083:
            r3 = 6
            boolean r16 = r13.p(r3)
            if (r16 == 0) goto L_0x0094
            int r5 = r13.m(r3, r12)
            androidx.appcompat.widget.e1 r5 = c(r10, r11, r5)
            r0.f883g = r5
        L_0x0094:
            android.content.res.TypedArray r5 = r13.f924b
            r5.recycle()
            android.widget.TextView r5 = r0.f877a
            android.text.method.TransformationMethod r5 = r5.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            r13 = 23
            r3 = 14
            if (r1 == r14) goto L_0x011d
            int[] r7 = e.l.f13524x
            androidx.appcompat.widget.g1 r14 = new androidx.appcompat.widget.g1
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r7)
            r14.<init>(r10, r1)
            if (r5 != 0) goto L_0x00c1
            boolean r7 = r14.p(r3)
            if (r7 == 0) goto L_0x00c1
            boolean r7 = r14.a(r3, r12)
            r21 = 1
            goto L_0x00c4
        L_0x00c1:
            r7 = 0
            r21 = 0
        L_0x00c4:
            r0.o(r10, r14)
            if (r2 >= r13) goto L_0x00f0
            boolean r22 = r14.p(r15)
            if (r22 == 0) goto L_0x00d4
            android.content.res.ColorStateList r22 = r14.c(r15)
            goto L_0x00d6
        L_0x00d4:
            r22 = 0
        L_0x00d6:
            boolean r23 = r14.p(r6)
            if (r23 == 0) goto L_0x00e1
            android.content.res.ColorStateList r23 = r14.c(r6)
            goto L_0x00e3
        L_0x00e1:
            r23 = 0
        L_0x00e3:
            boolean r24 = r14.p(r4)
            if (r24 == 0) goto L_0x00f4
            android.content.res.ColorStateList r24 = r14.c(r4)
            r4 = 15
            goto L_0x00f8
        L_0x00f0:
            r22 = 0
            r23 = 0
        L_0x00f4:
            r4 = 15
            r24 = 0
        L_0x00f8:
            boolean r20 = r14.p(r4)
            if (r20 == 0) goto L_0x0105
            java.lang.String r25 = r14.n(r4)
            r4 = 26
            goto L_0x0109
        L_0x0105:
            r4 = 26
            r25 = 0
        L_0x0109:
            if (r2 < r4) goto L_0x0118
            r4 = 13
            boolean r19 = r14.p(r4)
            if (r19 == 0) goto L_0x0118
            java.lang.String r14 = r14.n(r4)
            goto L_0x0119
        L_0x0118:
            r14 = 0
        L_0x0119:
            r1.recycle()
            goto L_0x0129
        L_0x011d:
            r7 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x0129:
            int[] r1 = e.l.f13524x
            androidx.appcompat.widget.g1 r4 = new androidx.appcompat.widget.g1
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r8, r1, r9, r12)
            r4.<init>(r10, r1)
            if (r5 != 0) goto L_0x0142
            boolean r26 = r4.p(r3)
            if (r26 == 0) goto L_0x0142
            boolean r7 = r4.a(r3, r12)
            r21 = 1
        L_0x0142:
            if (r2 >= r13) goto L_0x0163
            boolean r3 = r4.p(r15)
            if (r3 == 0) goto L_0x014e
            android.content.res.ColorStateList r22 = r4.c(r15)
        L_0x014e:
            boolean r3 = r4.p(r6)
            if (r3 == 0) goto L_0x0158
            android.content.res.ColorStateList r23 = r4.c(r6)
        L_0x0158:
            r13 = 5
            boolean r3 = r4.p(r13)
            if (r3 == 0) goto L_0x0163
            android.content.res.ColorStateList r24 = r4.c(r13)
        L_0x0163:
            r3 = r22
            r6 = r23
            r13 = r24
            r15 = 15
            boolean r23 = r4.p(r15)
            if (r23 == 0) goto L_0x0175
            java.lang.String r25 = r4.n(r15)
        L_0x0175:
            r15 = r25
            r12 = 26
            if (r2 < r12) goto L_0x0188
            r12 = 13
            boolean r19 = r4.p(r12)
            if (r19 == 0) goto L_0x018a
            java.lang.String r14 = r4.n(r12)
            goto L_0x018a
        L_0x0188:
            r12 = 13
        L_0x018a:
            r12 = 28
            if (r2 < r12) goto L_0x01a5
            r12 = 0
            boolean r18 = r4.p(r12)
            if (r18 == 0) goto L_0x01a5
            r24 = r11
            r11 = -1
            int r18 = r4.f(r12, r11)
            if (r18 != 0) goto L_0x01a7
            android.widget.TextView r11 = r0.f877a
            r8 = 0
            r11.setTextSize(r12, r8)
            goto L_0x01a7
        L_0x01a5:
            r24 = r11
        L_0x01a7:
            r0.o(r10, r4)
            r1.recycle()
            if (r3 == 0) goto L_0x01b4
            android.widget.TextView r1 = r0.f877a
            r1.setTextColor(r3)
        L_0x01b4:
            if (r6 == 0) goto L_0x01bb
            android.widget.TextView r1 = r0.f877a
            r1.setHintTextColor(r6)
        L_0x01bb:
            if (r13 == 0) goto L_0x01c2
            android.widget.TextView r1 = r0.f877a
            r1.setLinkTextColor(r13)
        L_0x01c2:
            if (r5 != 0) goto L_0x01cb
            if (r21 == 0) goto L_0x01cb
            android.widget.TextView r1 = r0.f877a
            r1.setAllCaps(r7)
        L_0x01cb:
            android.graphics.Typeface r1 = r0.f888l
            if (r1 == 0) goto L_0x01e1
            int r3 = r0.f887k
            r4 = -1
            if (r3 != r4) goto L_0x01dc
            android.widget.TextView r3 = r0.f877a
            int r4 = r0.f886j
            r3.setTypeface(r1, r4)
            goto L_0x01e1
        L_0x01dc:
            android.widget.TextView r3 = r0.f877a
            r3.setTypeface(r1)
        L_0x01e1:
            if (r14 == 0) goto L_0x01e8
            android.widget.TextView r1 = r0.f877a
            androidx.appcompat.widget.e0.e.d(r1, r14)
        L_0x01e8:
            r8 = 24
            if (r15 == 0) goto L_0x020f
            if (r2 < r8) goto L_0x01f8
            android.widget.TextView r1 = r0.f877a
            android.os.LocaleList r2 = androidx.appcompat.widget.e0.d.a(r15)
            androidx.appcompat.widget.e0.d.b(r1, r2)
            goto L_0x020f
        L_0x01f8:
            r1 = 21
            if (r2 < r1) goto L_0x020f
            java.lang.String r1 = ","
            java.lang.String[] r1 = r15.split(r1)
            r2 = 0
            r1 = r1[r2]
            android.widget.TextView r3 = r0.f877a
            java.util.Locale r1 = androidx.appcompat.widget.e0.c.a(r1)
            androidx.appcompat.widget.e0.b.c(r3, r1)
            goto L_0x0210
        L_0x020f:
            r2 = 0
        L_0x0210:
            androidx.appcompat.widget.g0 r11 = r0.f885i
            android.content.Context r1 = r11.f921j
            int[] r3 = e.l.f13509i
            r12 = r28
            android.content.res.TypedArray r13 = r1.obtainStyledAttributes(r12, r3, r9, r2)
            android.widget.TextView r1 = r11.f920i
            android.content.Context r2 = r1.getContext()
            r7 = 0
            r14 = 6
            r15 = 5
            r4 = r28
            r6 = 2
            r5 = r13
            r8 = 2
            r14 = 4
            r6 = r29
            r9 = 1
            o0.c0.B(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r13.hasValue(r15)
            if (r1 == 0) goto L_0x023e
            r1 = 0
            int r2 = r13.getInt(r15, r1)
            r11.f912a = r2
        L_0x023e:
            boolean r1 = r13.hasValue(r14)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x024b
            float r1 = r13.getDimension(r14, r2)
            goto L_0x024d
        L_0x024b:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x024d:
            boolean r3 = r13.hasValue(r8)
            if (r3 == 0) goto L_0x0258
            float r3 = r13.getDimension(r8, r2)
            goto L_0x025a
        L_0x0258:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x025a:
            boolean r4 = r13.hasValue(r9)
            if (r4 == 0) goto L_0x0265
            float r4 = r13.getDimension(r9, r2)
            goto L_0x0267
        L_0x0265:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0267:
            r5 = 3
            boolean r6 = r13.hasValue(r5)
            if (r6 == 0) goto L_0x029e
            r6 = 0
            int r7 = r13.getResourceId(r5, r6)
            if (r7 <= 0) goto L_0x029e
            android.content.res.Resources r5 = r13.getResources()
            android.content.res.TypedArray r5 = r5.obtainTypedArray(r7)
            int r6 = r5.length()
            int[] r7 = new int[r6]
            if (r6 <= 0) goto L_0x029b
            r14 = 0
        L_0x0286:
            if (r14 >= r6) goto L_0x0292
            r15 = -1
            int r17 = r5.getDimensionPixelSize(r14, r15)
            r7[r14] = r17
            int r14 = r14 + 1
            goto L_0x0286
        L_0x0292:
            int[] r6 = r11.b(r7)
            r11.f917f = r6
            r11.h()
        L_0x029b:
            r5.recycle()
        L_0x029e:
            r13.recycle()
            boolean r5 = r11.i()
            if (r5 == 0) goto L_0x02da
            int r5 = r11.f912a
            if (r5 != r9) goto L_0x02dd
            boolean r5 = r11.f918g
            if (r5 != 0) goto L_0x02d6
            android.content.Context r5 = r11.f921j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r6 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x02c3
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = android.util.TypedValue.applyDimension(r8, r3, r5)
        L_0x02c3:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x02cd
            r4 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r8, r4, r5)
        L_0x02cd:
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x02d3
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x02d3:
            r11.j(r3, r4, r1)
        L_0x02d6:
            r11.g()
            goto L_0x02dd
        L_0x02da:
            r1 = 0
            r11.f912a = r1
        L_0x02dd:
            boolean r1 = s0.b.Y
            if (r1 == 0) goto L_0x031c
            androidx.appcompat.widget.g0 r1 = r0.f885i
            int r3 = r1.f912a
            if (r3 == 0) goto L_0x031c
            int[] r1 = r1.f917f
            int r3 = r1.length
            if (r3 <= 0) goto L_0x031c
            android.widget.TextView r3 = r0.f877a
            int r3 = androidx.appcompat.widget.e0.e.a(r3)
            float r3 = (float) r3
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0316
            android.widget.TextView r1 = r0.f877a
            androidx.appcompat.widget.g0 r2 = r0.f885i
            float r2 = r2.f915d
            int r2 = java.lang.Math.round(r2)
            androidx.appcompat.widget.g0 r3 = r0.f885i
            float r3 = r3.f916e
            int r3 = java.lang.Math.round(r3)
            androidx.appcompat.widget.g0 r4 = r0.f885i
            float r4 = r4.f914c
            int r4 = java.lang.Math.round(r4)
            r5 = 0
            androidx.appcompat.widget.e0.e.b(r1, r2, r3, r4, r5)
            goto L_0x031c
        L_0x0316:
            r5 = 0
            android.widget.TextView r2 = r0.f877a
            androidx.appcompat.widget.e0.e.c(r2, r1, r5)
        L_0x031c:
            int[] r1 = e.l.f13509i
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r12, r1)
            r2 = 8
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L_0x0334
            r4 = r24
            android.graphics.drawable.Drawable r7 = r4.b(r10, r2)
            r2 = 13
            goto L_0x0339
        L_0x0334:
            r4 = r24
            r2 = 13
            r7 = 0
        L_0x0339:
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L_0x0344
            android.graphics.drawable.Drawable r2 = r4.b(r10, r2)
            goto L_0x0345
        L_0x0344:
            r2 = 0
        L_0x0345:
            r5 = 9
            int r5 = r1.getResourceId(r5, r3)
            if (r5 == r3) goto L_0x0352
            android.graphics.drawable.Drawable r5 = r4.b(r10, r5)
            goto L_0x0353
        L_0x0352:
            r5 = 0
        L_0x0353:
            r6 = 6
            int r6 = r1.getResourceId(r6, r3)
            if (r6 == r3) goto L_0x035f
            android.graphics.drawable.Drawable r6 = r4.b(r10, r6)
            goto L_0x0360
        L_0x035f:
            r6 = 0
        L_0x0360:
            r11 = 10
            int r11 = r1.getResourceId(r11, r3)
            if (r11 == r3) goto L_0x036d
            android.graphics.drawable.Drawable r11 = r4.b(r10, r11)
            goto L_0x036e
        L_0x036d:
            r11 = 0
        L_0x036e:
            r12 = 7
            int r12 = r1.getResourceId(r12, r3)
            if (r12 == r3) goto L_0x037a
            android.graphics.drawable.Drawable r3 = r4.b(r10, r12)
            goto L_0x037b
        L_0x037a:
            r3 = 0
        L_0x037b:
            if (r11 != 0) goto L_0x03cf
            if (r3 == 0) goto L_0x0380
            goto L_0x03cf
        L_0x0380:
            if (r7 != 0) goto L_0x0388
            if (r2 != 0) goto L_0x0388
            if (r5 != 0) goto L_0x0388
            if (r6 == 0) goto L_0x03f0
        L_0x0388:
            android.widget.TextView r3 = r0.f877a
            android.graphics.drawable.Drawable[] r3 = androidx.appcompat.widget.e0.b.a(r3)
            r4 = 0
            r11 = r3[r4]
            if (r11 != 0) goto L_0x03b9
            r11 = r3[r8]
            if (r11 == 0) goto L_0x0398
            goto L_0x03b9
        L_0x0398:
            android.widget.TextView r3 = r0.f877a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
            android.widget.TextView r11 = r0.f877a
            if (r7 == 0) goto L_0x03a3
            goto L_0x03a5
        L_0x03a3:
            r7 = r3[r4]
        L_0x03a5:
            if (r2 == 0) goto L_0x03a8
            goto L_0x03aa
        L_0x03a8:
            r2 = r3[r9]
        L_0x03aa:
            if (r5 == 0) goto L_0x03ad
            goto L_0x03af
        L_0x03ad:
            r5 = r3[r8]
        L_0x03af:
            if (r6 == 0) goto L_0x03b2
            goto L_0x03b5
        L_0x03b2:
            r4 = 3
            r6 = r3[r4]
        L_0x03b5:
            r11.setCompoundDrawablesWithIntrinsicBounds(r7, r2, r5, r6)
            goto L_0x03f0
        L_0x03b9:
            android.widget.TextView r4 = r0.f877a
            r5 = 0
            r7 = r3[r5]
            if (r2 == 0) goto L_0x03c1
            goto L_0x03c3
        L_0x03c1:
            r2 = r3[r9]
        L_0x03c3:
            r5 = r3[r8]
            if (r6 == 0) goto L_0x03c8
            goto L_0x03cb
        L_0x03c8:
            r6 = 3
            r6 = r3[r6]
        L_0x03cb:
            androidx.appcompat.widget.e0.b.b(r4, r7, r2, r5, r6)
            goto L_0x03f0
        L_0x03cf:
            android.widget.TextView r4 = r0.f877a
            android.graphics.drawable.Drawable[] r4 = androidx.appcompat.widget.e0.b.a(r4)
            android.widget.TextView r5 = r0.f877a
            if (r11 == 0) goto L_0x03da
            goto L_0x03dd
        L_0x03da:
            r7 = 0
            r11 = r4[r7]
        L_0x03dd:
            if (r2 == 0) goto L_0x03e0
            goto L_0x03e2
        L_0x03e0:
            r2 = r4[r9]
        L_0x03e2:
            if (r3 == 0) goto L_0x03e5
            goto L_0x03e7
        L_0x03e5:
            r3 = r4[r8]
        L_0x03e7:
            if (r6 == 0) goto L_0x03ea
            goto L_0x03ed
        L_0x03ea:
            r6 = 3
            r6 = r4[r6]
        L_0x03ed:
            androidx.appcompat.widget.e0.b.b(r5, r11, r2, r3, r6)
        L_0x03f0:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0428
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x040c
            r3 = 0
            int r3 = r1.getResourceId(r2, r3)
            if (r3 == 0) goto L_0x040c
            android.content.res.ColorStateList r3 = g.a.a(r10, r3)
            if (r3 == 0) goto L_0x040c
            goto L_0x0410
        L_0x040c:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x0410:
            android.widget.TextView r2 = r0.f877a
            r2.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x041f
            s0.i.c.f(r2, r3)
            goto L_0x0428
        L_0x041f:
            boolean r4 = r2 instanceof s0.m
            if (r4 == 0) goto L_0x0428
            s0.m r2 = (s0.m) r2
            r2.setSupportCompoundDrawablesTintList(r3)
        L_0x0428:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0452
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.k0.c(r2, r3)
            android.widget.TextView r3 = r0.f877a
            r3.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x0449
            s0.i.c.g(r3, r2)
            goto L_0x0452
        L_0x0449:
            boolean r4 = r3 instanceof s0.m
            if (r4 == 0) goto L_0x0452
            s0.m r3 = (s0.m) r3
            r3.setSupportCompoundDrawablesTintMode(r2)
        L_0x0452:
            r2 = 15
            r3 = -1
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r4 = 18
            int r4 = r1.getDimensionPixelSize(r4, r3)
            r5 = 19
            int r5 = r1.getDimensionPixelSize(r5, r3)
            r1.recycle()
            if (r2 == r3) goto L_0x046f
            android.widget.TextView r1 = r0.f877a
            s0.i.d(r1, r2)
        L_0x046f:
            if (r4 == r3) goto L_0x0476
            android.widget.TextView r1 = r0.f877a
            s0.i.e(r1, r4)
        L_0x0476:
            if (r5 == r3) goto L_0x047d
            android.widget.TextView r1 = r0.f877a
            s0.i.f(r1, r5)
        L_0x047d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e0.g(android.util.AttributeSet, int):void");
    }

    public void h(Context context, int i10) {
        String n10;
        ColorStateList c10;
        ColorStateList c11;
        ColorStateList c12;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, l.f13524x);
        g1 g1Var = new g1(context, obtainStyledAttributes);
        if (g1Var.p(14)) {
            this.f877a.setAllCaps(g1Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23) {
            if (g1Var.p(3) && (c12 = g1Var.c(3)) != null) {
                this.f877a.setTextColor(c12);
            }
            if (g1Var.p(5) && (c11 = g1Var.c(5)) != null) {
                this.f877a.setLinkTextColor(c11);
            }
            if (g1Var.p(4) && (c10 = g1Var.c(4)) != null) {
                this.f877a.setHintTextColor(c10);
            }
        }
        if (g1Var.p(0) && g1Var.f(0, -1) == 0) {
            this.f877a.setTextSize(0, 0.0f);
        }
        o(context, g1Var);
        if (i11 >= 26 && g1Var.p(13) && (n10 = g1Var.n(13)) != null) {
            e.d(this.f877a, n10);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f888l;
        if (typeface != null) {
            this.f877a.setTypeface(typeface, this.f886j);
        }
    }

    public void i(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        CharSequence charSequence;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i10 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i10 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i11 = editorInfo.initialSelStart;
            int i12 = editorInfo.initialSelEnd;
            int i13 = i11 > i12 ? i12 + 0 : i11 + 0;
            int i14 = i11 > i12 ? i11 - 0 : i12 + 0;
            int length = text.length();
            if (i13 < 0 || i14 > length) {
                r0.a.b(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i15 = editorInfo.inputType & 4095;
            if (i15 == 129 || i15 == 225 || i15 == 18) {
                r0.a.b(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                r0.a.b(editorInfo, text, i13, i14);
            } else {
                int i16 = i14 - i13;
                int i17 = i16 > 1024 ? 0 : i16;
                int i18 = 2048 - i17;
                double d10 = (double) i18;
                Double.isNaN(d10);
                Double.isNaN(d10);
                Double.isNaN(d10);
                Double.isNaN(d10);
                Double.isNaN(d10);
                int min = Math.min(text.length() - i14, i18 - Math.min(i13, (int) (d10 * 0.8d)));
                int min2 = Math.min(i13, i18 - min);
                int i19 = i13 - min2;
                if (r0.a.a(text, i19, 0)) {
                    i19++;
                    min2--;
                }
                if (r0.a.a(text, (i14 + min) - 1, 1)) {
                    min--;
                }
                int i20 = min2 + i17 + min;
                if (i17 != i16) {
                    charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i19, i19 + min2), text.subSequence(i14, min + i14)});
                } else {
                    charSequence = text.subSequence(i19, i20 + i19);
                }
                int i21 = min2 + 0;
                r0.a.b(editorInfo, charSequence, i21, i17 + i21);
            }
        }
    }

    public void j(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        g0 g0Var = this.f885i;
        if (g0Var.i()) {
            DisplayMetrics displayMetrics = g0Var.f921j.getResources().getDisplayMetrics();
            g0Var.j(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (g0Var.g()) {
                g0Var.a();
            }
        }
    }

    public void k(int[] iArr, int i10) throws IllegalArgumentException {
        g0 g0Var = this.f885i;
        if (g0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g0Var.f921j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                g0Var.f917f = g0Var.b(iArr2);
                if (!g0Var.h()) {
                    StringBuilder a10 = android.support.v4.media.a.a("None of the preset sizes is valid: ");
                    a10.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a10.toString());
                }
            } else {
                g0Var.f918g = false;
            }
            if (g0Var.g()) {
                g0Var.a();
            }
        }
    }

    public void l(int i10) {
        g0 g0Var = this.f885i;
        if (!g0Var.i()) {
            return;
        }
        if (i10 == 0) {
            g0Var.f912a = 0;
            g0Var.f915d = -1.0f;
            g0Var.f916e = -1.0f;
            g0Var.f914c = -1.0f;
            g0Var.f917f = new int[0];
            g0Var.f913b = false;
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = g0Var.f921j.getResources().getDisplayMetrics();
            g0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (g0Var.g()) {
                g0Var.a();
            }
        } else {
            throw new IllegalArgumentException(d0.a("Unknown auto-size text type: ", i10));
        }
    }

    public void m(ColorStateList colorStateList) {
        if (this.f884h == null) {
            this.f884h = new e1();
        }
        e1 e1Var = this.f884h;
        e1Var.f894a = colorStateList;
        e1Var.f897d = colorStateList != null;
        this.f878b = e1Var;
        this.f879c = e1Var;
        this.f880d = e1Var;
        this.f881e = e1Var;
        this.f882f = e1Var;
        this.f883g = e1Var;
    }

    public void n(PorterDuff.Mode mode) {
        if (this.f884h == null) {
            this.f884h = new e1();
        }
        e1 e1Var = this.f884h;
        e1Var.f895b = mode;
        e1Var.f896c = mode != null;
        this.f878b = e1Var;
        this.f879c = e1Var;
        this.f880d = e1Var;
        this.f881e = e1Var;
        this.f882f = e1Var;
        this.f883g = e1Var;
    }

    public final void o(Context context, g1 g1Var) {
        String n10;
        this.f886j = g1Var.j(2, this.f886j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 28) {
            int j10 = g1Var.j(11, -1);
            this.f887k = j10;
            if (j10 != -1) {
                this.f886j = (this.f886j & 2) | 0;
            }
        }
        int i11 = 10;
        if (g1Var.p(10) || g1Var.p(12)) {
            this.f888l = null;
            if (g1Var.p(12)) {
                i11 = 12;
            }
            int i12 = this.f887k;
            int i13 = this.f886j;
            if (!context.isRestricted()) {
                try {
                    Typeface i14 = g1Var.i(i11, this.f886j, new a(i12, i13, new WeakReference(this.f877a)));
                    if (i14 != null) {
                        if (i10 < 28 || this.f887k == -1) {
                            this.f888l = i14;
                        } else {
                            this.f888l = f.a(Typeface.create(i14, 0), this.f887k, (this.f886j & 2) != 0);
                        }
                    }
                    this.f889m = this.f888l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f888l == null && (n10 = g1Var.n(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f887k == -1) {
                    this.f888l = Typeface.create(n10, this.f886j);
                    return;
                }
                Typeface create = Typeface.create(n10, 0);
                int i15 = this.f887k;
                if ((this.f886j & 2) != 0) {
                    z10 = true;
                }
                this.f888l = f.a(create, i15, z10);
            }
        } else if (g1Var.p(1)) {
            this.f889m = false;
            int j11 = g1Var.j(1, 1);
            if (j11 == 1) {
                this.f888l = Typeface.SANS_SERIF;
            } else if (j11 == 2) {
                this.f888l = Typeface.SERIF;
            } else if (j11 == 3) {
                this.f888l = Typeface.MONOSPACE;
            }
        }
    }
}
