package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final c f5312a;

    /* renamed from: b  reason: collision with root package name */
    public b f5313b;

    /* renamed from: c  reason: collision with root package name */
    public float f5314c;

    /* renamed from: d  reason: collision with root package name */
    public int f5315d = 0;

    public interface b {
        void a(float f10, float f11, boolean z10);
    }

    public final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public float f5316a;

        /* renamed from: b  reason: collision with root package name */
        public float f5317b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5318c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5319d;

        public c(a aVar) {
        }

        public void run() {
            this.f5319d = false;
            b bVar = AspectRatioFrameLayout.this.f5313b;
            if (bVar != null) {
                bVar.a(this.f5316a, this.f5317b, this.f5318c);
            }
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, s6.c.f24967a, 0, 0);
            try {
                this.f5315d = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f5312a = new c((a) null);
    }

    public int getResizeMode() {
        return this.f5315d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f5314c
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x000b
            return
        L_0x000b:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f5314c
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            r7 = 1
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0040
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.f5312a
            float r10 = r8.f5314c
            r0 = 0
            r9.f5316a = r10
            r9.f5317b = r3
            r9.f5318c = r0
            boolean r10 = r9.f5319d
            if (r10 != 0) goto L_0x003f
            r9.f5319d = r7
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r10 = com.google.android.exoplayer2.ui.AspectRatioFrameLayout.this
            r10.post(r9)
        L_0x003f:
            return
        L_0x0040:
            int r5 = r8.f5315d
            if (r5 == 0) goto L_0x005d
            if (r5 == r7) goto L_0x005a
            r6 = 2
            if (r5 == r6) goto L_0x0057
            r6 = 4
            if (r5 == r6) goto L_0x004d
            goto L_0x006b
        L_0x004d:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0054
            float r9 = r8.f5314c
            goto L_0x0068
        L_0x0054:
            float r10 = r8.f5314c
            goto L_0x0063
        L_0x0057:
            float r9 = r8.f5314c
            goto L_0x0068
        L_0x005a:
            float r10 = r8.f5314c
            goto L_0x0063
        L_0x005d:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0066
            float r10 = r8.f5314c
        L_0x0063:
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L_0x006b
        L_0x0066:
            float r9 = r8.f5314c
        L_0x0068:
            float r2 = r2 * r9
            int r9 = (int) r2
        L_0x006b:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.f5312a
            float r1 = r8.f5314c
            r10.f5316a = r1
            r10.f5317b = r3
            r10.f5318c = r7
            boolean r1 = r10.f5319d
            if (r1 != 0) goto L_0x0080
            r10.f5319d = r7
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1 = com.google.android.exoplayer2.ui.AspectRatioFrameLayout.this
            r1.post(r10)
        L_0x0080:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f10) {
        if (this.f5314c != f10) {
            this.f5314c = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.f5313b = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.f5315d != i10) {
            this.f5315d = i10;
            requestLayout();
        }
    }
}
