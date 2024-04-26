package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import e.d;
import h6.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s6.g;
import v6.e0;

/* compiled from: WebViewSubtitleOutput */
public final class e extends FrameLayout implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f5445a;

    /* renamed from: b  reason: collision with root package name */
    public final WebView f5446b;

    /* renamed from: c  reason: collision with root package name */
    public List<b> f5447c = Collections.emptyList();

    /* renamed from: d  reason: collision with root package name */
    public h6.a f5448d = h6.a.f18914g;

    /* renamed from: e  reason: collision with root package name */
    public float f5449e = 0.0533f;

    /* renamed from: f  reason: collision with root package name */
    public int f5450f = 0;

    /* renamed from: g  reason: collision with root package name */
    public float f5451g = 0.08f;

    /* compiled from: WebViewSubtitleOutput */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5452a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5452a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5452a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5452a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.e.a.<clinit>():void");
        }
    }

    public e(Context context) {
        super(context, (AttributeSet) null);
        a aVar = new a(context, (AttributeSet) null);
        this.f5445a = aVar;
        g gVar = new g(this, context, (AttributeSet) null);
        this.f5446b = gVar;
        gVar.setBackgroundColor(0);
        addView(aVar);
        addView(gVar);
    }

    public static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    public void a(List<b> list, h6.a aVar, float f10, int i10, float f11) {
        this.f5448d = aVar;
        this.f5449e = f10;
        this.f5450f = i10;
        this.f5451g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = list.get(i11);
            if (bVar.f18924c != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f5447c.isEmpty() || !arrayList2.isEmpty()) {
            this.f5447c = arrayList2;
            d();
        }
        this.f5445a.a(arrayList, aVar, f10, i10, f11);
        invalidate();
    }

    public final String c(int i10, float f10) {
        float m10 = d.m(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (m10 == -3.4028235E38f) {
            return "unset";
        }
        return e0.n("%.2fpx", Float.valueOf(m10 / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0472, code lost:
        if (((android.text.style.TypefaceSpan) r9).getFamily() != null) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c6, code lost:
        if (r5 != 0) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c9, code lost:
        if (r5 != 0) goto L_0x01cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x05b1  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0639  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0504 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r44 = this;
            r0 = r44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            h6.a r4 = r0.f5448d
            int r4 = r4.f18915a
            java.lang.String r4 = l0.e.m(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f5450f
            float r6 = r0.f5449e
            java.lang.String r4 = r0.c(r4, r6)
            r6 = 1
            r3[r6] = r4
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r7 = java.lang.Float.valueOf(r4)
            r8 = 2
            r3[r8] = r7
            h6.a r7 = r0.f5448d
            int r9 = r7.f18918d
            java.lang.String r10 = "unset"
            r11 = 3
            if (r9 == r6) goto L_0x006e
            if (r9 == r8) goto L_0x005d
            if (r9 == r11) goto L_0x004c
            if (r9 == r2) goto L_0x003b
            r2 = r10
            goto L_0x007e
        L_0x003b:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r7 = r7.f18919e
            java.lang.String r7 = l0.e.m(r7)
            r2[r5] = r7
            java.lang.String r7 = "-0.05em -0.05em 0.15em %s"
            java.lang.String r2 = v6.e0.n(r7, r2)
            goto L_0x007e
        L_0x004c:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r7 = r7.f18919e
            java.lang.String r7 = l0.e.m(r7)
            r2[r5] = r7
            java.lang.String r7 = "0.06em 0.08em 0.15em %s"
            java.lang.String r2 = v6.e0.n(r7, r2)
            goto L_0x007e
        L_0x005d:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r7 = r7.f18919e
            java.lang.String r7 = l0.e.m(r7)
            r2[r5] = r7
            java.lang.String r7 = "0.1em 0.12em 0.15em %s"
            java.lang.String r2 = v6.e0.n(r7, r2)
            goto L_0x007e
        L_0x006e:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            int r7 = r7.f18919e
            java.lang.String r7 = l0.e.m(r7)
            r2[r5] = r7
            java.lang.String r7 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            java.lang.String r2 = v6.e0.n(r7, r2)
        L_0x007e:
            r3[r11] = r2
            java.lang.String r2 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2fem;text-shadow:%s;'>"
            java.lang.String r2 = v6.e0.n(r2, r3)
            r1.append(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "default_bg"
            java.lang.String r7 = l0.e.b(r3)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            h6.a r9 = r0.f5448d
            int r9 = r9.f18916b
            java.lang.String r9 = l0.e.m(r9)
            r8[r5] = r9
            java.lang.String r9 = "background-color:%s;"
            java.lang.String r8 = v6.e0.n(r9, r8)
            r2.put(r7, r8)
            r7 = 0
        L_0x00aa:
            java.util.List<h6.b> r8 = r0.f5447c
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0675
            java.util.List<h6.b> r8 = r0.f5447c
            java.lang.Object r8 = r8.get(r7)
            h6.b r8 = (h6.b) r8
            float r11 = r8.f18928g
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r13 = 1120403456(0x42c80000, float:100.0)
            int r14 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00c8
            float r11 = r11 * r13
            goto L_0x00ca
        L_0x00c8:
            r11 = 1112014848(0x42480000, float:50.0)
        L_0x00ca:
            int r14 = r8.f18929h
            int r14 = b(r14)
            float r15 = r8.f18925d
            r16 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r13 = "%.2f%%"
            int r12 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0134
            int r12 = r8.f18926e
            if (r12 == r6) goto L_0x0106
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r12 = 1120403456(0x42c80000, float:100.0)
            float r15 = r15 * r12
            java.lang.Float r12 = java.lang.Float.valueOf(r15)
            r4[r5] = r12
            java.lang.String r4 = v6.e0.n(r13, r4)
            int r12 = r8.f18936o
            if (r12 != r6) goto L_0x00fc
            int r12 = r8.f18927f
            int r12 = b(r12)
            int r12 = -r12
            goto L_0x0102
        L_0x00fc:
            int r12 = r8.f18927f
            int r12 = b(r12)
        L_0x0102:
            r15 = 0
            r17 = r12
            goto L_0x014e
        L_0x0106:
            java.lang.String r5 = "%.2fem"
            int r12 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r12 < 0) goto L_0x011d
            java.lang.Object[] r12 = new java.lang.Object[r6]
            float r15 = r15 * r4
            java.lang.Float r4 = java.lang.Float.valueOf(r15)
            r15 = 0
            r12[r15] = r4
            java.lang.String r4 = v6.e0.n(r5, r12)
            r5 = 0
            goto L_0x0130
        L_0x011d:
            java.lang.Object[] r12 = new java.lang.Object[r6]
            float r15 = -r15
            float r15 = r15 - r17
            float r15 = r15 * r4
            java.lang.Float r4 = java.lang.Float.valueOf(r15)
            r15 = 0
            r12[r15] = r4
            java.lang.String r4 = v6.e0.n(r5, r12)
            r5 = 1
        L_0x0130:
            r12 = 0
            r17 = 0
            goto L_0x014e
        L_0x0134:
            r15 = 0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            float r5 = r0.f5451g
            float r17 = r17 - r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r17 = r17 * r5
            java.lang.Float r5 = java.lang.Float.valueOf(r17)
            r4[r15] = r5
            java.lang.String r4 = v6.e0.n(r13, r4)
            r12 = -100
            r5 = 0
            r17 = -100
        L_0x014e:
            float r12 = r8.f18930i
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r19 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r19 == 0) goto L_0x016a
            r19 = r14
            java.lang.Object[] r14 = new java.lang.Object[r6]
            r18 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 * r18
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r14[r15] = r12
            java.lang.String r12 = v6.e0.n(r13, r14)
            goto L_0x016e
        L_0x016a:
            r19 = r14
            java.lang.String r12 = "fit-content"
        L_0x016e:
            android.text.Layout$Alignment r13 = r8.f18923b
            java.lang.String r14 = "center"
            if (r13 != 0) goto L_0x0176
            r6 = 2
            goto L_0x018a
        L_0x0176:
            int[] r15 = com.google.android.exoplayer2.ui.e.a.f5452a
            int r13 = r13.ordinal()
            r13 = r15[r13]
            if (r13 == r6) goto L_0x0187
            r6 = 2
            if (r13 == r6) goto L_0x0184
            goto L_0x018a
        L_0x0184:
            java.lang.String r14 = "end"
            goto L_0x018a
        L_0x0187:
            r6 = 2
            java.lang.String r14 = "start"
        L_0x018a:
            int r13 = r8.f18936o
            r15 = 1
            if (r13 == r15) goto L_0x0197
            if (r13 == r6) goto L_0x0194
            java.lang.String r6 = "horizontal-tb"
            goto L_0x0199
        L_0x0194:
            java.lang.String r6 = "vertical-lr"
            goto L_0x0199
        L_0x0197:
            java.lang.String r6 = "vertical-rl"
        L_0x0199:
            int r13 = r8.f18934m
            float r15 = r8.f18935n
            java.lang.String r13 = r0.c(r13, r15)
            boolean r15 = r8.f18932k
            if (r15 == 0) goto L_0x01a8
            int r15 = r8.f18933l
            goto L_0x01ac
        L_0x01a8:
            h6.a r15 = r0.f5448d
            int r15 = r15.f18917c
        L_0x01ac:
            java.lang.String r15 = l0.e.m(r15)
            int r0 = r8.f18936o
            java.lang.String r20 = "right"
            java.lang.String r21 = "left"
            java.lang.String r22 = "top"
            r23 = r7
            r7 = 1
            if (r0 == r7) goto L_0x01c9
            r7 = 2
            if (r0 == r7) goto L_0x01c6
            if (r5 == 0) goto L_0x01c4
            java.lang.String r22 = "bottom"
        L_0x01c4:
            r5 = 2
            goto L_0x01d2
        L_0x01c6:
            if (r5 == 0) goto L_0x01cb
            goto L_0x01cd
        L_0x01c9:
            if (r5 == 0) goto L_0x01cd
        L_0x01cb:
            r20 = r21
        L_0x01cd:
            r5 = 2
            r21 = r22
            r22 = r20
        L_0x01d2:
            if (r0 == r5) goto L_0x01e1
            r5 = 1
            if (r0 != r5) goto L_0x01d8
            goto L_0x01e1
        L_0x01d8:
            java.lang.String r0 = "width"
            r43 = r19
            r19 = r17
            r17 = r43
            goto L_0x01e3
        L_0x01e1:
            java.lang.String r0 = "height"
        L_0x01e3:
            java.lang.CharSequence r5 = r8.f18922a
            android.content.Context r7 = r44.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            java.util.regex.Pattern r20 = com.google.android.exoplayer2.ui.c.f5436a
            r20 = r3
            java.lang.String r3 = "</span>"
            r24 = r3
            java.lang.String r3 = ""
            r25 = r1
            r1 = 0
            if (r5 != 0) goto L_0x020c
            com.google.android.exoplayer2.ui.c$b r5 = new com.google.android.exoplayer2.ui.c$b
            ba.u<java.lang.Object, java.lang.Object> r7 = ba.p0.f3768g
            r5.<init>(r3, r7, r1)
            r26 = r3
            goto L_0x021f
        L_0x020c:
            boolean r1 = r5 instanceof android.text.Spanned
            if (r1 != 0) goto L_0x022f
            com.google.android.exoplayer2.ui.c$b r1 = new com.google.android.exoplayer2.ui.c$b
            java.lang.String r5 = com.google.android.exoplayer2.ui.c.a(r5)
            ba.u<java.lang.Object, java.lang.Object> r7 = ba.p0.f3768g
            r26 = r3
            r3 = 0
            r1.<init>(r5, r7, r3)
            r5 = r1
        L_0x021f:
            r33 = r6
            r27 = r8
            r29 = r9
            r36 = r12
            r32 = r13
            r35 = r14
            r28 = r15
            goto L_0x05a3
        L_0x022f:
            r26 = r3
            android.text.Spanned r5 = (android.text.Spanned) r5
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r3 = r5.length()
            r27 = r8
            java.lang.Class<android.text.style.BackgroundColorSpan> r8 = android.text.style.BackgroundColorSpan.class
            r28 = r15
            r15 = 0
            java.lang.Object[] r3 = r5.getSpans(r15, r3, r8)
            android.text.style.BackgroundColorSpan[] r3 = (android.text.style.BackgroundColorSpan[]) r3
            int r8 = r3.length
        L_0x024a:
            if (r15 >= r8) goto L_0x0260
            r29 = r3[r15]
            int r29 = r29.getBackgroundColor()
            r30 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r29)
            r1.add(r3)
            int r15 = r15 + 1
            r3 = r30
            goto L_0x024a
        L_0x0260:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0269:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x02a5
            java.lang.Object r8 = r1.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r29 = r1
            java.lang.String r1 = "bg_"
            r15.append(r1)
            r15.append(r8)
            java.lang.String r1 = r15.toString()
            java.lang.String r1 = l0.e.b(r1)
            r15 = 1
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r8 = l0.e.m(r8)
            r30 = 0
            r15[r30] = r8
            java.lang.String r8 = v6.e0.n(r9, r15)
            r3.put(r1, r8)
            r1 = r29
            goto L_0x0269
        L_0x02a5:
            r1 = 0
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            int r15 = r5.length()
            r29 = r9
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.Object[] r1 = r5.getSpans(r1, r15, r9)
            int r9 = r1.length
            r15 = 0
        L_0x02b9:
            if (r15 >= r9) goto L_0x0516
            r30 = r9
            r9 = r1[r15]
            r31 = r1
            boolean r1 = r9 instanceof android.text.style.StrikethroughSpan
            if (r1 == 0) goto L_0x02d7
            java.lang.String r32 = "<span style='text-decoration:line-through;'>"
            r33 = r6
            r34 = r7
            r36 = r12
            r35 = r14
            r6 = r32
            r18 = 1120403456(0x42c80000, float:100.0)
            r32 = r13
            goto L_0x0441
        L_0x02d7:
            r32 = r13
            boolean r13 = r9 instanceof android.text.style.ForegroundColorSpan
            if (r13 == 0) goto L_0x02fb
            r13 = r9
            android.text.style.ForegroundColorSpan r13 = (android.text.style.ForegroundColorSpan) r13
            r33 = r6
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r13 = r13.getForegroundColor()
            java.lang.String r13 = l0.e.m(r13)
            r34 = 0
            r6[r34] = r13
            java.lang.String r13 = "<span style='color:%s;'>"
            java.lang.String r6 = v6.e0.n(r13, r6)
        L_0x02f7:
            r18 = 1120403456(0x42c80000, float:100.0)
            goto L_0x03cf
        L_0x02fb:
            r33 = r6
            r6 = 1
            boolean r13 = r9 instanceof android.text.style.BackgroundColorSpan
            if (r13 == 0) goto L_0x031a
            r13 = r9
            android.text.style.BackgroundColorSpan r13 = (android.text.style.BackgroundColorSpan) r13
            java.lang.Object[] r6 = new java.lang.Object[r6]
            int r13 = r13.getBackgroundColor()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r34 = 0
            r6[r34] = r13
            java.lang.String r13 = "<span class='bg_%s'>"
            java.lang.String r6 = v6.e0.n(r13, r6)
            goto L_0x02f7
        L_0x031a:
            boolean r6 = r9 instanceof l6.a
            if (r6 == 0) goto L_0x0321
            java.lang.String r6 = "<span style='text-combine-upright:all;'>"
            goto L_0x02f7
        L_0x0321:
            boolean r6 = r9 instanceof android.text.style.AbsoluteSizeSpan
            if (r6 == 0) goto L_0x034c
            r6 = r9
            android.text.style.AbsoluteSizeSpan r6 = (android.text.style.AbsoluteSizeSpan) r6
            boolean r13 = r6.getDip()
            if (r13 == 0) goto L_0x0334
            int r6 = r6.getSize()
            float r6 = (float) r6
            goto L_0x033a
        L_0x0334:
            int r6 = r6.getSize()
            float r6 = (float) r6
            float r6 = r6 / r7
        L_0x033a:
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r34 = 0
            r13[r34] = r6
            java.lang.String r6 = "<span style='font-size:%.2fpx;'>"
            java.lang.String r6 = v6.e0.n(r6, r13)
            goto L_0x02f7
        L_0x034c:
            r6 = 1
            boolean r13 = r9 instanceof android.text.style.RelativeSizeSpan
            if (r13 == 0) goto L_0x036e
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r13 = r9
            android.text.style.RelativeSizeSpan r13 = (android.text.style.RelativeSizeSpan) r13
            float r13 = r13.getSizeChange()
            r18 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r18
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r34 = 0
            r6[r34] = r13
            java.lang.String r13 = "<span style='font-size:%.2f%%;'>"
            java.lang.String r6 = v6.e0.n(r13, r6)
            goto L_0x03cf
        L_0x036e:
            r18 = 1120403456(0x42c80000, float:100.0)
            r34 = 0
            boolean r6 = r9 instanceof android.text.style.TypefaceSpan
            if (r6 == 0) goto L_0x038d
            r6 = r9
            android.text.style.TypefaceSpan r6 = (android.text.style.TypefaceSpan) r6
            java.lang.String r6 = r6.getFamily()
            if (r6 == 0) goto L_0x038b
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r34] = r6
            java.lang.String r6 = "<span style='font-family:\"%s\";'>"
            java.lang.String r6 = v6.e0.n(r6, r13)
            goto L_0x03cf
        L_0x038b:
            r6 = 0
            goto L_0x03cf
        L_0x038d:
            r6 = 1
            boolean r13 = r9 instanceof android.text.style.StyleSpan
            if (r13 == 0) goto L_0x03ac
            r13 = r9
            android.text.style.StyleSpan r13 = (android.text.style.StyleSpan) r13
            int r13 = r13.getStyle()
            if (r13 == r6) goto L_0x03a9
            r6 = 2
            if (r13 == r6) goto L_0x03a6
            r6 = 3
            if (r13 == r6) goto L_0x03a3
            goto L_0x0444
        L_0x03a3:
            java.lang.String r6 = "<b><i>"
            goto L_0x03cf
        L_0x03a6:
            java.lang.String r6 = "<i>"
            goto L_0x03cf
        L_0x03a9:
            java.lang.String r6 = "<b>"
            goto L_0x03cf
        L_0x03ac:
            boolean r6 = r9 instanceof l6.b
            if (r6 == 0) goto L_0x03c9
            r6 = r9
            l6.b r6 = (l6.b) r6
            int r6 = r6.f21101b
            r13 = -1
            if (r6 == r13) goto L_0x03c6
            r13 = 1
            if (r6 == r13) goto L_0x03c3
            r13 = 2
            if (r6 == r13) goto L_0x03c0
            goto L_0x0444
        L_0x03c0:
            java.lang.String r6 = "<ruby style='ruby-position:under;'>"
            goto L_0x03cf
        L_0x03c3:
            java.lang.String r6 = "<ruby style='ruby-position:over;'>"
            goto L_0x03cf
        L_0x03c6:
            java.lang.String r6 = "<ruby style='ruby-position:unset;'>"
            goto L_0x03cf
        L_0x03c9:
            boolean r6 = r9 instanceof android.text.style.UnderlineSpan
            if (r6 == 0) goto L_0x03d7
            java.lang.String r6 = "<u>"
        L_0x03cf:
            r34 = r7
            r36 = r12
            r35 = r14
            goto L_0x0441
        L_0x03d7:
            boolean r6 = r9 instanceof l6.c
            if (r6 == 0) goto L_0x0444
            r6 = r9
            l6.c r6 = (l6.c) r6
            int r13 = r6.f21102a
            r34 = r7
            int r7 = r6.f21103b
            r35 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r36 = r12
            r12 = 1
            if (r7 == r12) goto L_0x03fa
            r12 = 2
            if (r7 == r12) goto L_0x03f4
            goto L_0x0400
        L_0x03f4:
            java.lang.String r7 = "open "
            r14.append(r7)
            goto L_0x0400
        L_0x03fa:
            r12 = 2
            java.lang.String r7 = "filled "
            r14.append(r7)
        L_0x0400:
            if (r13 == 0) goto L_0x0420
            r7 = 1
            if (r13 == r7) goto L_0x041a
            if (r13 == r12) goto L_0x0414
            r7 = 3
            if (r13 == r7) goto L_0x040e
            r14.append(r10)
            goto L_0x0425
        L_0x040e:
            java.lang.String r7 = "sesame"
            r14.append(r7)
            goto L_0x0425
        L_0x0414:
            java.lang.String r7 = "dot"
            r14.append(r7)
            goto L_0x0425
        L_0x041a:
            java.lang.String r7 = "circle"
            r14.append(r7)
            goto L_0x0425
        L_0x0420:
            java.lang.String r7 = "none"
            r14.append(r7)
        L_0x0425:
            java.lang.String r7 = r14.toString()
            int r6 = r6.f21104c
            r12 = 2
            if (r6 == r12) goto L_0x0431
            java.lang.String r6 = "over right"
            goto L_0x0433
        L_0x0431:
            java.lang.String r6 = "under left"
        L_0x0433:
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r13 = 0
            r12[r13] = r7
            r7 = 1
            r12[r7] = r6
            java.lang.String r6 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r6 = v6.e0.n(r6, r12)
        L_0x0441:
            r40 = r6
            goto L_0x044c
        L_0x0444:
            r34 = r7
            r36 = r12
            r35 = r14
            r6 = 0
            goto L_0x0441
        L_0x044c:
            if (r1 != 0) goto L_0x04be
            boolean r1 = r9 instanceof android.text.style.ForegroundColorSpan
            if (r1 != 0) goto L_0x04be
            boolean r1 = r9 instanceof android.text.style.BackgroundColorSpan
            if (r1 != 0) goto L_0x04be
            boolean r1 = r9 instanceof l6.a
            if (r1 != 0) goto L_0x04be
            boolean r1 = r9 instanceof android.text.style.AbsoluteSizeSpan
            if (r1 != 0) goto L_0x04be
            boolean r1 = r9 instanceof android.text.style.RelativeSizeSpan
            if (r1 != 0) goto L_0x04be
            boolean r1 = r9 instanceof l6.c
            if (r1 == 0) goto L_0x0467
            goto L_0x04be
        L_0x0467:
            boolean r1 = r9 instanceof android.text.style.TypefaceSpan
            if (r1 == 0) goto L_0x0475
            r1 = r9
            android.text.style.TypefaceSpan r1 = (android.text.style.TypefaceSpan) r1
            java.lang.String r1 = r1.getFamily()
            if (r1 == 0) goto L_0x04ba
            goto L_0x04be
        L_0x0475:
            boolean r1 = r9 instanceof android.text.style.StyleSpan
            if (r1 == 0) goto L_0x0493
            r1 = r9
            android.text.style.StyleSpan r1 = (android.text.style.StyleSpan) r1
            int r1 = r1.getStyle()
            r6 = 1
            if (r1 == r6) goto L_0x0490
            r6 = 2
            if (r1 == r6) goto L_0x048d
            r6 = 3
            if (r1 == r6) goto L_0x048a
            goto L_0x04ba
        L_0x048a:
            java.lang.String r1 = "</i></b>"
            goto L_0x04bb
        L_0x048d:
            java.lang.String r1 = "</i>"
            goto L_0x04bb
        L_0x0490:
            java.lang.String r1 = "</b>"
            goto L_0x04bb
        L_0x0493:
            boolean r1 = r9 instanceof l6.b
            if (r1 == 0) goto L_0x04b3
            r1 = r9
            l6.b r1 = (l6.b) r1
            java.lang.String r6 = "<rt>"
            java.lang.StringBuilder r6 = android.support.v4.media.a.a(r6)
            java.lang.String r1 = r1.f21100a
            java.lang.String r1 = com.google.android.exoplayer2.ui.c.a(r1)
            r6.append(r1)
            java.lang.String r1 = "</rt></ruby>"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            goto L_0x04bb
        L_0x04b3:
            boolean r1 = r9 instanceof android.text.style.UnderlineSpan
            if (r1 == 0) goto L_0x04ba
            java.lang.String r1 = "</u>"
            goto L_0x04bb
        L_0x04ba:
            r1 = 0
        L_0x04bb:
            r41 = r1
            goto L_0x04c0
        L_0x04be:
            r41 = r24
        L_0x04c0:
            int r1 = r5.getSpanStart(r9)
            int r6 = r5.getSpanEnd(r9)
            if (r40 == 0) goto L_0x0504
            r41.getClass()
            com.google.android.exoplayer2.ui.c$c r7 = new com.google.android.exoplayer2.ui.c$c
            r42 = 0
            r37 = r7
            r38 = r1
            r39 = r6
            r37.<init>(r38, r39, r40, r41, r42)
            java.lang.Object r9 = r8.get(r1)
            com.google.android.exoplayer2.ui.c$d r9 = (com.google.android.exoplayer2.ui.c.d) r9
            if (r9 != 0) goto L_0x04ea
            com.google.android.exoplayer2.ui.c$d r9 = new com.google.android.exoplayer2.ui.c$d
            r9.<init>()
            r8.put(r1, r9)
        L_0x04ea:
            java.util.List<com.google.android.exoplayer2.ui.c$c> r1 = r9.f5443a
            r1.add(r7)
            java.lang.Object r1 = r8.get(r6)
            com.google.android.exoplayer2.ui.c$d r1 = (com.google.android.exoplayer2.ui.c.d) r1
            if (r1 != 0) goto L_0x04ff
            com.google.android.exoplayer2.ui.c$d r1 = new com.google.android.exoplayer2.ui.c$d
            r1.<init>()
            r8.put(r6, r1)
        L_0x04ff:
            java.util.List<com.google.android.exoplayer2.ui.c$c> r1 = r1.f5444b
            r1.add(r7)
        L_0x0504:
            int r15 = r15 + 1
            r9 = r30
            r1 = r31
            r13 = r32
            r6 = r33
            r7 = r34
            r14 = r35
            r12 = r36
            goto L_0x02b9
        L_0x0516:
            r33 = r6
            r36 = r12
            r32 = r13
            r35 = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r6 = r5.length()
            r1.<init>(r6)
            r6 = 0
            r7 = 0
        L_0x0529:
            int r9 = r8.size()
            if (r6 >= r9) goto L_0x058a
            int r9 = r8.keyAt(r6)
            java.lang.CharSequence r7 = r5.subSequence(r7, r9)
            java.lang.String r7 = com.google.android.exoplayer2.ui.c.a(r7)
            r1.append(r7)
            java.lang.Object r7 = r8.get(r9)
            com.google.android.exoplayer2.ui.c$d r7 = (com.google.android.exoplayer2.ui.c.d) r7
            java.util.List<com.google.android.exoplayer2.ui.c$c> r12 = r7.f5444b
            java.util.Comparator<com.google.android.exoplayer2.ui.c$c> r13 = com.google.android.exoplayer2.ui.c.C0080c.f5438e
            s6.d r13 = s6.d.f24971a
            java.util.Collections.sort(r12, r13)
            java.util.List<com.google.android.exoplayer2.ui.c$c> r12 = r7.f5444b
            java.util.Iterator r12 = r12.iterator()
        L_0x0553:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0565
            java.lang.Object r13 = r12.next()
            com.google.android.exoplayer2.ui.c$c r13 = (com.google.android.exoplayer2.ui.c.C0080c) r13
            java.lang.String r13 = r13.f5442d
            r1.append(r13)
            goto L_0x0553
        L_0x0565:
            java.util.List<com.google.android.exoplayer2.ui.c$c> r12 = r7.f5443a
            java.util.Comparator<com.google.android.exoplayer2.ui.c$c> r13 = com.google.android.exoplayer2.ui.c.C0080c.f5438e
            java.util.Comparator<com.google.android.exoplayer2.ui.c$c> r13 = com.google.android.exoplayer2.ui.c.C0080c.f5438e
            java.util.Collections.sort(r12, r13)
            java.util.List<com.google.android.exoplayer2.ui.c$c> r7 = r7.f5443a
            java.util.Iterator r7 = r7.iterator()
        L_0x0574:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x0586
            java.lang.Object r12 = r7.next()
            com.google.android.exoplayer2.ui.c$c r12 = (com.google.android.exoplayer2.ui.c.C0080c) r12
            java.lang.String r12 = r12.f5441c
            r1.append(r12)
            goto L_0x0574
        L_0x0586:
            int r6 = r6 + 1
            r7 = r9
            goto L_0x0529
        L_0x058a:
            int r6 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r7, r6)
            java.lang.String r5 = com.google.android.exoplayer2.ui.c.a(r5)
            r1.append(r5)
            com.google.android.exoplayer2.ui.c$b r5 = new com.google.android.exoplayer2.ui.c$b
            java.lang.String r1 = r1.toString()
            r6 = 0
            r5.<init>(r1, r3, r6)
        L_0x05a3:
            java.util.Set r1 = r2.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x05ab:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x05d7
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r6 = r2.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r2.put(r3, r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x05d2
            java.lang.Object r3 = r2.get(r3)
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x05d0
            goto L_0x05d2
        L_0x05d0:
            r3 = 0
            goto L_0x05d3
        L_0x05d2:
            r3 = 1
        L_0x05d3:
            v6.a.d(r3)
            goto L_0x05ab
        L_0x05d7:
            r1 = 13
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r21
            java.lang.Float r3 = java.lang.Float.valueOf(r11)
            r6 = 1
            r1[r6] = r3
            r3 = 2
            r1[r3] = r22
            r3 = 3
            r1[r3] = r4
            r3 = 4
            r1[r3] = r0
            r0 = 5
            r1[r0] = r36
            r0 = 6
            r1[r0] = r35
            r0 = 7
            r1[r0] = r33
            r0 = 8
            r1[r0] = r32
            r0 = 9
            r1[r0] = r28
            r0 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r1[r0] = r3
            r0 = 11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r1[r0] = r3
            r0 = 12
            r8 = r27
            float r3 = r8.f18937p
            int r4 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x0639
            int r4 = r8.f18936o
            r6 = 2
            r7 = 1
            if (r4 == r6) goto L_0x0625
            if (r4 != r7) goto L_0x0622
            goto L_0x0625
        L_0x0622:
            java.lang.String r4 = "skewX"
            goto L_0x0627
        L_0x0625:
            java.lang.String r4 = "skewY"
        L_0x0627:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r8 = 0
            r6[r8] = r4
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r6[r7] = r3
            java.lang.String r3 = "%s(%.2fdeg)"
            java.lang.String r3 = v6.e0.n(r3, r6)
            goto L_0x063c
        L_0x0639:
            r7 = 1
            r3 = r26
        L_0x063c:
            r1[r0] = r3
            java.lang.String r0 = "<div style='position:absolute;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r0 = v6.e0.n(r0, r1)
            r1 = r25
            r1.append(r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r3 = 0
            r0[r3] = r20
            java.lang.String r3 = "<span class='%s'>"
            java.lang.String r0 = v6.e0.n(r3, r0)
            r1.append(r0)
            java.lang.String r0 = r5.f5437a
            r1.append(r0)
            r0 = r24
            r1.append(r0)
            java.lang.String r0 = "</div>"
            r1.append(r0)
            int r7 = r23 + 1
            r4 = 1067030938(0x3f99999a, float:1.2)
            r5 = 0
            r6 = 1
            r0 = r44
            r3 = r20
            r9 = r29
            goto L_0x00aa
        L_0x0675:
            java.lang.String r0 = "</div></body></html>"
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "<html><head><style>"
            r0.append(r3)
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x068c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x06af
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L_0x068c
        L_0x06af:
            java.lang.String r2 = "</style></head>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.insert(r2, r0)
            r0 = r44
            android.webkit.WebView r2 = r0.f5446b
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = aa.c.f178c
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.e.d():void");
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.f5447c.isEmpty()) {
            d();
        }
    }
}
