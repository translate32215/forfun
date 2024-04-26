package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.startapp.startappsdk.R;
import java.util.Arrays;
import o0.a;
import o0.c0;
import p0.c;
import p9.c;

class ClockFaceView extends c implements ClockHandView.c {
    public final ClockHandView D;
    public final Rect E = new Rect();
    public final RectF F = new RectF();
    public final SparseArray<TextView> G;
    public final a H;
    public final int[] I;
    public final float[] J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public String[] O;
    public float P;
    public final ColorStateList Q;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.G = sparseArray;
        this.J = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t8.a.f25842i, R.attr.materialClockStyle, 2132083888);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 1);
        this.Q = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.D = clockHandView;
        this.K = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.I = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f9580e.add(this);
        int defaultColor = g.a.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.H = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.O = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i10 = 0; i10 < Math.max(this.O.length, size); i10++) {
            TextView textView = this.G.get(i10);
            if (i10 >= this.O.length) {
                removeView(textView);
                this.G.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    this.G.put(i10, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.O[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                c0.C(textView, this.H);
                textView.setTextColor(this.Q);
            }
        }
        this.L = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.M = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.N = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public void a(float f10, boolean z10) {
        if (Math.abs(this.P - f10) > 0.001f) {
            this.P = f10;
            t();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.b a10 = c.b.a(1, this.O.length, false, 1);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a10.f23767a);
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        t();
    }

    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.N) / Math.max(Math.max(((float) this.L) / ((float) displayMetrics.heightPixels), ((float) this.M) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void t() {
        RadialGradient radialGradient;
        RectF rectF = this.D.f9584i;
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            TextView textView = this.G.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.E);
                offsetDescendantRectToMyCoords(textView, this.E);
                textView.setSelected(rectF.contains((float) this.E.centerX(), (float) this.E.centerY()));
                this.F.set(this.E);
                this.F.offset((float) textView.getPaddingLeft(), (float) textView.getPaddingTop());
                if (!RectF.intersects(rectF, this.F)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - this.F.left, rectF.centerY() - this.F.top, 0.5f * rectF.width(), this.I, this.J, Shader.TileMode.CLAMP);
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
        }
    }
}
