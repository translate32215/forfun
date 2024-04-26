package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import h6.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s6.e;

/* compiled from: CanvasSubtitleOutput */
public final class a extends View implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f5393a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<b> f5394b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public int f5395c = 0;

    /* renamed from: d  reason: collision with root package name */
    public float f5396d = 0.0533f;

    /* renamed from: e  reason: collision with root package name */
    public h6.a f5397e = h6.a.f18914g;

    /* renamed from: f  reason: collision with root package name */
    public float f5398f = 0.08f;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(List<b> list, h6.a aVar, float f10, int i10, float f11) {
        this.f5394b = list;
        this.f5397e = aVar;
        this.f5396d = f10;
        this.f5395c = i10;
        this.f5398f = f11;
        while (this.f5393a.size() < list.size()) {
            this.f5393a.add(new e(getContext()));
        }
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03e8, code lost:
        if (r3 < r6) goto L_0x03f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r40) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            java.util.List<h6.b> r2 = r0.f5394b
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = r39.getHeight()
            int r4 = r39.getPaddingLeft()
            int r5 = r39.getPaddingTop()
            int r6 = r39.getWidth()
            int r7 = r39.getPaddingRight()
            int r6 = r6 - r7
            int r7 = r39.getPaddingBottom()
            int r7 = r3 - r7
            if (r7 <= r5) goto L_0x04de
            if (r6 > r4) goto L_0x002e
            goto L_0x04de
        L_0x002e:
            int r8 = r7 - r5
            int r9 = r0.f5395c
            float r10 = r0.f5396d
            float r9 = e.d.m(r9, r10, r3, r8)
            r10 = 0
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 > 0) goto L_0x003e
            return
        L_0x003e:
            int r11 = r2.size()
            r13 = 0
        L_0x0043:
            if (r13 >= r11) goto L_0x04de
            java.lang.Object r14 = r2.get(r13)
            h6.b r14 = (h6.b) r14
            int r15 = r14.f18936o
            r16 = 1065353216(0x3f800000, float:1.0)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r10) goto L_0x008c
            h6.b$b r15 = r14.a()
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r15.f18944g = r12
            r15.f18945h = r10
            r10 = 0
            r15.f18940c = r10
            int r10 = r14.f18926e
            if (r10 != 0) goto L_0x006f
            float r10 = r14.f18925d
            float r10 = r16 - r10
            r15.f18941d = r10
            r10 = 0
            r15.f18942e = r10
            goto L_0x0079
        L_0x006f:
            float r10 = r14.f18925d
            float r10 = -r10
            float r10 = r10 - r16
            r15.f18941d = r10
            r10 = 1
            r15.f18942e = r10
        L_0x0079:
            int r10 = r14.f18927f
            if (r10 == 0) goto L_0x0085
            r12 = 2
            if (r10 == r12) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            r10 = 0
            r15.f18943f = r10
            goto L_0x0088
        L_0x0085:
            r12 = 2
            r15.f18943f = r12
        L_0x0088:
            h6.b r14 = r15.a()
        L_0x008c:
            int r10 = r14.f18934m
            float r12 = r14.f18935n
            float r10 = e.d.m(r10, r12, r3, r8)
            java.util.List<s6.e> r12 = r0.f5393a
            java.lang.Object r12 = r12.get(r13)
            s6.e r12 = (s6.e) r12
            h6.a r15 = r0.f5397e
            r19 = r2
            float r2 = r0.f5398f
            r12.getClass()
            android.graphics.Bitmap r0 = r14.f18924c
            if (r0 != 0) goto L_0x00ab
            r0 = 1
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            r20 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r21 = r3
            if (r0 == 0) goto L_0x00db
            java.lang.CharSequence r3 = r14.f18922a
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x00cf
            r0 = r1
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r20 = r8
            r35 = r9
            r22 = r11
        L_0x00c9:
            r36 = r13
            r7 = 0
            r9 = 0
            goto L_0x04c4
        L_0x00cf:
            boolean r3 = r14.f18932k
            if (r3 == 0) goto L_0x00d6
            int r3 = r14.f18933l
            goto L_0x00d8
        L_0x00d6:
            int r3 = r15.f18917c
        L_0x00d8:
            r20 = r8
            goto L_0x00df
        L_0x00db:
            r20 = r8
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x00df:
            java.lang.CharSequence r8 = r12.f24980i
            r22 = r11
            java.lang.CharSequence r11 = r14.f18922a
            if (r8 == r11) goto L_0x00f2
            if (r8 == 0) goto L_0x00f0
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r8 = 0
            goto L_0x00f3
        L_0x00f2:
            r8 = 1
        L_0x00f3:
            if (r8 == 0) goto L_0x01ab
            android.text.Layout$Alignment r8 = r12.f24981j
            android.text.Layout$Alignment r11 = r14.f18923b
            boolean r8 = v6.e0.a(r8, r11)
            if (r8 == 0) goto L_0x01ab
            android.graphics.Bitmap r8 = r12.f24982k
            android.graphics.Bitmap r11 = r14.f18924c
            if (r8 != r11) goto L_0x01ab
            float r8 = r12.f24983l
            float r11 = r14.f18925d
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x01ab
            int r8 = r12.f24984m
            int r11 = r14.f18926e
            if (r8 != r11) goto L_0x01ab
            int r8 = r12.f24985n
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r11 = r14.f18927f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r8 = v6.e0.a(r8, r11)
            if (r8 == 0) goto L_0x01ab
            float r8 = r12.f24986o
            float r11 = r14.f18928g
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x01ab
            int r8 = r12.f24987p
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r11 = r14.f18929h
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r8 = v6.e0.a(r8, r11)
            if (r8 == 0) goto L_0x01ab
            float r8 = r12.f24988q
            float r11 = r14.f18930i
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x01ab
            float r8 = r12.f24989r
            float r11 = r14.f18931j
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x01ab
            int r8 = r12.f24990s
            int r11 = r15.f18915a
            if (r8 != r11) goto L_0x01ab
            int r8 = r12.f24991t
            int r11 = r15.f18916b
            if (r8 != r11) goto L_0x01ab
            int r8 = r12.f24992u
            if (r8 != r3) goto L_0x01ab
            int r8 = r12.f24994w
            int r11 = r15.f18918d
            if (r8 != r11) goto L_0x01ab
            int r8 = r12.f24993v
            int r11 = r15.f18919e
            if (r8 != r11) goto L_0x01ab
            android.text.TextPaint r8 = r12.f24977f
            android.graphics.Typeface r8 = r8.getTypeface()
            android.graphics.Typeface r11 = r15.f18920f
            boolean r8 = v6.e0.a(r8, r11)
            if (r8 == 0) goto L_0x01ab
            float r8 = r12.f24995x
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x01ab
            float r8 = r12.f24996y
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x01ab
            float r8 = r12.f24997z
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x01ab
            int r8 = r12.A
            if (r8 != r4) goto L_0x01ab
            int r8 = r12.B
            if (r8 != r5) goto L_0x01ab
            int r8 = r12.C
            if (r8 != r6) goto L_0x01ab
            int r8 = r12.D
            if (r8 != r7) goto L_0x01ab
            r12.a(r1, r0)
            r0 = r1
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r9
            goto L_0x00c9
        L_0x01ab:
            java.lang.CharSequence r8 = r14.f18922a
            r12.f24980i = r8
            android.text.Layout$Alignment r8 = r14.f18923b
            r12.f24981j = r8
            android.graphics.Bitmap r8 = r14.f18924c
            r12.f24982k = r8
            float r8 = r14.f18925d
            r12.f24983l = r8
            int r8 = r14.f18926e
            r12.f24984m = r8
            int r8 = r14.f18927f
            r12.f24985n = r8
            float r8 = r14.f18928g
            r12.f24986o = r8
            int r8 = r14.f18929h
            r12.f24987p = r8
            float r8 = r14.f18930i
            r12.f24988q = r8
            float r8 = r14.f18931j
            r12.f24989r = r8
            int r8 = r15.f18915a
            r12.f24990s = r8
            int r8 = r15.f18916b
            r12.f24991t = r8
            r12.f24992u = r3
            int r3 = r15.f18918d
            r12.f24994w = r3
            int r3 = r15.f18919e
            r12.f24993v = r3
            android.text.TextPaint r3 = r12.f24977f
            android.graphics.Typeface r8 = r15.f18920f
            r3.setTypeface(r8)
            r12.f24995x = r9
            r12.f24996y = r10
            r12.f24997z = r2
            r12.A = r4
            r12.B = r5
            r12.C = r6
            r12.D = r7
            if (r0 == 0) goto L_0x0437
            java.lang.CharSequence r2 = r12.f24980i
            r2.getClass()
            java.lang.CharSequence r2 = r12.f24980i
            boolean r3 = r2 instanceof android.text.SpannableStringBuilder
            if (r3 == 0) goto L_0x020a
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            goto L_0x0211
        L_0x020a:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r3 = r12.f24980i
            r2.<init>(r3)
        L_0x0211:
            int r3 = r12.C
            int r8 = r12.A
            int r3 = r3 - r8
            int r8 = r12.D
            int r10 = r12.B
            int r8 = r8 - r10
            android.text.TextPaint r10 = r12.f24977f
            float r11 = r12.f24995x
            r10.setTextSize(r11)
            float r10 = r12.f24995x
            r11 = 1040187392(0x3e000000, float:0.125)
            float r10 = r10 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r11
            int r10 = (int) r10
            int r11 = r10 * 2
            int r14 = r3 - r11
            float r15 = r12.f24988q
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r23 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r23 == 0) goto L_0x023d
            float r14 = (float) r14
            float r14 = r14 * r15
            int r14 = (int) r14
        L_0x023d:
            java.lang.String r15 = "SubtitlePainter"
            if (r14 > 0) goto L_0x025b
            java.lang.String r2 = "Skipped drawing subtitle cue (insufficient space)"
            android.util.Log.w(r15, r2)
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r9
            r36 = r13
            r7 = 0
            r9 = 0
            r38 = r1
            r1 = r0
            r0 = r38
            goto L_0x04c1
        L_0x025b:
            r31 = r4
            float r4 = r12.f24996y
            r32 = r5
            r17 = 0
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x027e
            android.text.style.AbsoluteSizeSpan r4 = new android.text.style.AbsoluteSizeSpan
            float r5 = r12.f24996y
            int r5 = (int) r5
            r4.<init>(r5)
            int r5 = r2.length()
            r33 = r6
            r34 = r7
            r6 = 16711680(0xff0000, float:2.3418052E-38)
            r7 = 0
            r2.setSpan(r4, r7, r5, r6)
            goto L_0x0283
        L_0x027e:
            r33 = r6
            r34 = r7
            r7 = 0
        L_0x0283:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r2)
            int r5 = r12.f24994w
            r6 = 1
            if (r5 != r6) goto L_0x02a9
            int r5 = r4.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r6 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r5 = r4.getSpans(r7, r5, r6)
            android.text.style.ForegroundColorSpan[] r5 = (android.text.style.ForegroundColorSpan[]) r5
            int r6 = r5.length
            r7 = 0
        L_0x029b:
            if (r7 >= r6) goto L_0x02a9
            r24 = r6
            r6 = r5[r7]
            r4.removeSpan(r6)
            int r7 = r7 + 1
            r6 = r24
            goto L_0x029b
        L_0x02a9:
            int r5 = r12.f24991t
            int r5 = android.graphics.Color.alpha(r5)
            if (r5 <= 0) goto L_0x02e1
            int r5 = r12.f24994w
            if (r5 == 0) goto L_0x02cd
            r6 = 2
            if (r5 != r6) goto L_0x02b9
            goto L_0x02cd
        L_0x02b9:
            android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
            int r6 = r12.f24991t
            r5.<init>(r6)
            int r6 = r4.length()
            r35 = r9
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            r4.setSpan(r5, r9, r6, r7)
            goto L_0x02e3
        L_0x02cd:
            r35 = r9
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            android.text.style.BackgroundColorSpan r5 = new android.text.style.BackgroundColorSpan
            int r6 = r12.f24991t
            r5.<init>(r6)
            int r6 = r2.length()
            r2.setSpan(r5, r9, r6, r7)
            goto L_0x02e3
        L_0x02e1:
            r35 = r9
        L_0x02e3:
            android.text.Layout$Alignment r5 = r12.f24981j
            if (r5 != 0) goto L_0x02e9
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x02e9:
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r7 = r12.f24977f
            float r9 = r12.f24975d
            r36 = r13
            float r13 = r12.f24976e
            r30 = 1
            r23 = r6
            r24 = r2
            r25 = r7
            r26 = r14
            r27 = r5
            r28 = r9
            r29 = r13
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.E = r6
            int r6 = r6.getHeight()
            android.text.StaticLayout r7 = r12.E
            int r7 = r7.getLineCount()
            r9 = 0
            r13 = 0
        L_0x0314:
            if (r9 >= r7) goto L_0x0333
            r23 = r7
            android.text.StaticLayout r7 = r12.E
            float r7 = r7.getLineWidth(r9)
            r37 = r0
            double r0 = (double) r7
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            int r13 = java.lang.Math.max(r0, r13)
            int r9 = r9 + 1
            r1 = r40
            r7 = r23
            r0 = r37
            goto L_0x0314
        L_0x0333:
            r37 = r0
            float r0 = r12.f24988q
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0341
            if (r13 >= r14) goto L_0x0341
            goto L_0x0342
        L_0x0341:
            r14 = r13
        L_0x0342:
            int r14 = r14 + r11
            float r0 = r12.f24986o
            int r7 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x036f
            float r1 = (float) r3
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            int r1 = r12.A
            int r0 = r0 + r1
            int r3 = r12.f24987p
            r7 = 1
            if (r3 == r7) goto L_0x035e
            r7 = 2
            if (r3 == r7) goto L_0x035c
            goto L_0x0363
        L_0x035c:
            int r0 = r0 - r14
            goto L_0x0363
        L_0x035e:
            r7 = 2
            int r0 = r0 * 2
            int r0 = r0 - r14
            int r0 = r0 / r7
        L_0x0363:
            int r0 = java.lang.Math.max(r0, r1)
            int r14 = r14 + r0
            int r1 = r12.C
            int r1 = java.lang.Math.min(r14, r1)
            goto L_0x0377
        L_0x036f:
            r7 = 2
            int r3 = r3 - r14
            int r3 = r3 / r7
            int r0 = r12.A
            int r0 = r0 + r3
            int r1 = r0 + r14
        L_0x0377:
            int r1 = r1 - r0
            if (r1 > 0) goto L_0x0387
            java.lang.String r0 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            android.util.Log.w(r15, r0)
            r0 = r40
            r1 = r37
            r7 = 0
            r9 = 0
            goto L_0x04c1
        L_0x0387:
            float r3 = r12.f24983l
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x03eb
            int r7 = r12.f24984m
            if (r7 != 0) goto L_0x03b0
            float r7 = (float) r8
            float r7 = r7 * r3
            int r3 = java.lang.Math.round(r7)
            int r7 = r12.B
            int r3 = r3 + r7
            int r7 = r12.f24985n
            r8 = 2
            if (r7 != r8) goto L_0x03a6
            r7 = 0
            r9 = 0
            goto L_0x03dc
        L_0x03a6:
            r9 = 1
            if (r7 != r9) goto L_0x03ad
            int r3 = r3 * 2
            int r3 = r3 - r6
            int r3 = r3 / r8
        L_0x03ad:
            r7 = 0
            r9 = 0
            goto L_0x03dd
        L_0x03b0:
            android.text.StaticLayout r3 = r12.E
            r7 = 0
            int r3 = r3.getLineBottom(r7)
            android.text.StaticLayout r8 = r12.E
            int r8 = r8.getLineTop(r7)
            int r3 = r3 - r8
            float r8 = r12.f24983l
            r9 = 0
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x03d0
            float r3 = (float) r3
            float r8 = r8 * r3
            int r3 = java.lang.Math.round(r8)
            int r8 = r12.B
            int r3 = r3 + r8
            goto L_0x03dd
        L_0x03d0:
            float r8 = r8 + r16
            float r3 = (float) r3
            float r8 = r8 * r3
            int r3 = java.lang.Math.round(r8)
            int r8 = r12.D
            int r3 = r3 + r8
        L_0x03dc:
            int r3 = r3 - r6
        L_0x03dd:
            int r8 = r3 + r6
            int r11 = r12.D
            if (r8 <= r11) goto L_0x03e6
            int r3 = r11 - r6
            goto L_0x03f7
        L_0x03e6:
            int r6 = r12.B
            if (r3 >= r6) goto L_0x03f7
            goto L_0x03f8
        L_0x03eb:
            r7 = 0
            r9 = 0
            int r3 = r12.D
            int r3 = r3 - r6
            float r6 = (float) r8
            float r8 = r12.f24997z
            float r6 = r6 * r8
            int r6 = (int) r6
            int r3 = r3 - r6
        L_0x03f7:
            r6 = r3
        L_0x03f8:
            android.text.StaticLayout r3 = new android.text.StaticLayout
            android.text.TextPaint r8 = r12.f24977f
            float r11 = r12.f24975d
            float r13 = r12.f24976e
            r14 = 1
            r30 = 1
            r23 = r3
            r24 = r2
            r25 = r8
            r26 = r1
            r27 = r5
            r28 = r11
            r29 = r13
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.E = r3
            android.text.StaticLayout r2 = new android.text.StaticLayout
            android.text.TextPaint r3 = r12.f24977f
            float r8 = r12.f24975d
            float r11 = r12.f24976e
            r23 = r2
            r24 = r4
            r25 = r3
            r28 = r8
            r29 = r11
            r30 = r14
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.F = r2
            r12.G = r0
            r12.H = r6
            r12.I = r10
            goto L_0x04bd
        L_0x0437:
            r37 = r0
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r9
            r36 = r13
            r7 = 0
            r9 = 0
            android.graphics.Bitmap r0 = r12.f24982k
            r0.getClass()
            android.graphics.Bitmap r0 = r12.f24982k
            int r1 = r12.C
            int r2 = r12.A
            int r1 = r1 - r2
            int r3 = r12.D
            int r4 = r12.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r12.f24986o
            float r5 = r5 * r1
            float r5 = r5 + r2
            float r2 = (float) r4
            float r3 = (float) r3
            float r4 = r12.f24983l
            float r4 = r4 * r3
            float r4 = r4 + r2
            float r2 = r12.f24988q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r12.f24989r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x047e
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
            goto L_0x0490
        L_0x047e:
            float r2 = (float) r1
            int r3 = r0.getHeight()
            float r3 = (float) r3
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
        L_0x0490:
            int r2 = r12.f24987p
            r3 = 2
            if (r2 != r3) goto L_0x0497
            float r2 = (float) r1
            goto L_0x049d
        L_0x0497:
            r3 = 1
            if (r2 != r3) goto L_0x049e
            int r2 = r1 / 2
            float r2 = (float) r2
        L_0x049d:
            float r5 = r5 - r2
        L_0x049e:
            int r2 = java.lang.Math.round(r5)
            int r3 = r12.f24985n
            r5 = 2
            if (r3 != r5) goto L_0x04a9
            float r3 = (float) r0
            goto L_0x04af
        L_0x04a9:
            r5 = 1
            if (r3 != r5) goto L_0x04b0
            int r3 = r0 / 2
            float r3 = (float) r3
        L_0x04af:
            float r4 = r4 - r3
        L_0x04b0:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r12.J = r4
        L_0x04bd:
            r0 = r40
            r1 = r37
        L_0x04c1:
            r12.a(r0, r1)
        L_0x04c4:
            int r13 = r36 + 1
            r1 = r0
            r2 = r19
            r8 = r20
            r3 = r21
            r11 = r22
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r9 = r35
            r10 = 0
            r0 = r39
            goto L_0x0043
        L_0x04de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.a.dispatchDraw(android.graphics.Canvas):void");
    }
}
