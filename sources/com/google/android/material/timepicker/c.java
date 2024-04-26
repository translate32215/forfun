package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import o0.c0;
import s9.f;
import s9.g;
import s9.i;

/* compiled from: RadialViewGroup */
public class c extends ConstraintLayout {
    public final Runnable A;
    public int B;
    public f C;

    /* compiled from: RadialViewGroup */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c.this.s();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            view.setId(c0.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.A);
            handler.post(this.A);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        s();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.A);
            handler.post(this.A);
        }
    }

    public void s() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if ("skip".equals(getChildAt(i11).getTag())) {
                i10++;
            }
        }
        b bVar = new b();
        bVar.c(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id2 = childAt.getId();
                int i13 = this.B;
                if (!bVar.f1222c.containsKey(Integer.valueOf(id2))) {
                    bVar.f1222c.put(Integer.valueOf(id2), new b.a());
                }
                b.C0015b bVar2 = bVar.f1222c.get(Integer.valueOf(id2)).f1226d;
                bVar2.A = R.id.circle_center;
                bVar2.B = i13;
                bVar2.C = f10;
                f10 = (360.0f / ((float) (childCount - i10))) + f10;
            }
        }
        bVar.b(this, true);
        setConstraintSet((b) null);
        requestLayout();
    }

    public void setBackgroundColor(int i10) {
        this.C.r(ColorStateList.valueOf(i10));
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        f fVar = new f();
        this.C = fVar;
        g gVar = new g(0.5f);
        i iVar = fVar.f25079a.f25098a;
        iVar.getClass();
        i.b bVar = new i.b(iVar);
        bVar.f25137e = gVar;
        bVar.f25138f = gVar;
        bVar.f25139g = gVar;
        bVar.f25140h = gVar;
        fVar.f25079a.f25098a = bVar.a();
        fVar.invalidateSelf();
        this.C.r(ColorStateList.valueOf(-1));
        f fVar2 = this.C;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.q(this, fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t8.a.D, i10, 0);
        this.B = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A = new a();
        obtainStyledAttributes.recycle();
    }
}
