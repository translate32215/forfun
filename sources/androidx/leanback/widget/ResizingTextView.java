package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import e1.a;
import s0.i;

class ResizingTextView extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public int f2186a;

    /* renamed from: b  reason: collision with root package name */
    public int f2187b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2188c;

    /* renamed from: d  reason: collision with root package name */
    public int f2189d;

    /* renamed from: e  reason: collision with root package name */
    public int f2190e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2191f = false;

    /* renamed from: g  reason: collision with root package name */
    public int f2192g;

    /* renamed from: h  reason: collision with root package name */
    public float f2193h;

    /* renamed from: i  reason: collision with root package name */
    public int f2194i;

    /* renamed from: r  reason: collision with root package name */
    public int f2195r;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842884);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f13536j, 16842884, 0);
        try {
            this.f2186a = obtainStyledAttributes.getInt(1, 1);
            this.f2187b = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.f2188c = obtainStyledAttributes.getBoolean(0, false);
            this.f2189d = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f2190e = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(int i10, int i11) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i10, getPaddingEnd(), i11);
        } else {
            setPadding(getPaddingLeft(), i10, getPaddingRight(), i11);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2191f
            r1 = 1
            if (r0 != 0) goto L_0x0020
            float r0 = r5.getTextSize()
            int r0 = (int) r0
            r5.f2192g = r0
            float r0 = r5.getLineSpacingExtra()
            r5.f2193h = r0
            int r0 = r5.getPaddingTop()
            r5.f2194i = r0
            int r0 = r5.getPaddingBottom()
            r5.f2195r = r0
            r5.f2191f = r1
        L_0x0020:
            int r0 = r5.f2192g
            float r0 = (float) r0
            r2 = 0
            r5.setTextSize(r2, r0)
            float r0 = r5.f2193h
            float r3 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r0, r3)
            int r0 = r5.f2194i
            int r3 = r5.f2195r
            r5.a(r0, r3)
            super.onMeasure(r6, r7)
            android.text.Layout r0 = r5.getLayout()
            if (r0 == 0) goto L_0x0053
            int r3 = r5.f2186a
            r3 = r3 & r1
            if (r3 <= 0) goto L_0x0053
            int r0 = r0.getLineCount()
            int r3 = r5.getMaxLines()
            if (r3 <= r1) goto L_0x0053
            if (r0 != r3) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            float r3 = r5.getTextSize()
            int r3 = (int) r3
            r4 = -1
            if (r0 == 0) goto L_0x009f
            int r0 = r5.f2187b
            if (r0 == r4) goto L_0x0067
            if (r3 == r0) goto L_0x0067
            float r0 = (float) r0
            r5.setTextSize(r2, r0)
            r2 = 1
        L_0x0067:
            float r0 = r5.f2193h
            int r3 = r5.f2192g
            float r3 = (float) r3
            float r0 = r0 + r3
            int r3 = r5.f2187b
            float r3 = (float) r3
            float r0 = r0 - r3
            boolean r3 = r5.f2188c
            if (r3 == 0) goto L_0x0085
            float r3 = r5.getLineSpacingExtra()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0085
            float r2 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r0, r2)
            r2 = 1
        L_0x0085:
            int r0 = r5.f2194i
            int r3 = r5.f2189d
            int r0 = r0 + r3
            int r3 = r5.f2195r
            int r4 = r5.f2190e
            int r3 = r3 + r4
            int r4 = r5.getPaddingTop()
            if (r4 != r0) goto L_0x009b
            int r4 = r5.getPaddingBottom()
            if (r4 == r3) goto L_0x00d3
        L_0x009b:
            r5.a(r0, r3)
            goto L_0x00dc
        L_0x009f:
            int r0 = r5.f2187b
            if (r0 == r4) goto L_0x00ac
            int r0 = r5.f2192g
            if (r3 == r0) goto L_0x00ac
            float r0 = (float) r0
            r5.setTextSize(r2, r0)
            r2 = 1
        L_0x00ac:
            boolean r0 = r5.f2188c
            if (r0 == 0) goto L_0x00c2
            float r0 = r5.getLineSpacingExtra()
            float r3 = r5.f2193h
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            float r0 = r5.getLineSpacingMultiplier()
            r5.setLineSpacing(r3, r0)
            r2 = 1
        L_0x00c2:
            int r0 = r5.getPaddingTop()
            int r3 = r5.f2194i
            if (r0 != r3) goto L_0x00d5
            int r0 = r5.getPaddingBottom()
            int r3 = r5.f2195r
            if (r0 == r3) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r1 = r2
            goto L_0x00dc
        L_0x00d5:
            int r0 = r5.f2194i
            int r2 = r5.f2195r
            r5.a(r0, r2)
        L_0x00dc:
            if (r1 == 0) goto L_0x00e1
            super.onMeasure(r6, r7)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.j(this, callback));
    }
}
