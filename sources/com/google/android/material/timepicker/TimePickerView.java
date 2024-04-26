package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.startapp.b4;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import o0.c0;

class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int E = 0;
    public final Chip A;
    public final Chip B;
    public final MaterialButtonToggleGroup C;
    public final View.OnClickListener D;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i10 = TimePickerView.E;
            timePickerView.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.D = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.C = materialButtonToggleGroup;
        materialButtonToggleGroup.f9047c.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.A = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.B = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(this, new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            s();
        }
    }

    public final void s() {
        b.a aVar;
        if (this.C.getVisibility() == 0) {
            b bVar = new b();
            bVar.c(this);
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            char c10 = c0.e.d(this) == 0 ? (char) 2 : 1;
            if (bVar.f1222c.containsKey(Integer.valueOf(R.id.material_clock_display)) && (aVar = bVar.f1222c.get(Integer.valueOf(R.id.material_clock_display))) != null) {
                switch (c10) {
                    case 1:
                        b.C0015b bVar2 = aVar.f1226d;
                        bVar2.f1261j = -1;
                        bVar2.f1259i = -1;
                        bVar2.G = -1;
                        bVar2.N = Integer.MIN_VALUE;
                        break;
                    case 2:
                        b.C0015b bVar3 = aVar.f1226d;
                        bVar3.f1265l = -1;
                        bVar3.f1263k = -1;
                        bVar3.H = -1;
                        bVar3.P = Integer.MIN_VALUE;
                        break;
                    case 3:
                        b.C0015b bVar4 = aVar.f1226d;
                        bVar4.f1269n = -1;
                        bVar4.f1267m = -1;
                        bVar4.I = 0;
                        bVar4.O = Integer.MIN_VALUE;
                        break;
                    case 4:
                        b.C0015b bVar5 = aVar.f1226d;
                        bVar5.f1271o = -1;
                        bVar5.f1273p = -1;
                        bVar5.J = 0;
                        bVar5.Q = Integer.MIN_VALUE;
                        break;
                    case 5:
                        b.C0015b bVar6 = aVar.f1226d;
                        bVar6.f1275q = -1;
                        bVar6.f1276r = -1;
                        bVar6.f1277s = -1;
                        bVar6.M = 0;
                        bVar6.T = Integer.MIN_VALUE;
                        break;
                    case 6:
                        b.C0015b bVar7 = aVar.f1226d;
                        bVar7.f1278t = -1;
                        bVar7.f1279u = -1;
                        bVar7.L = 0;
                        bVar7.S = Integer.MIN_VALUE;
                        break;
                    case 7:
                        b.C0015b bVar8 = aVar.f1226d;
                        bVar8.f1280v = -1;
                        bVar8.f1281w = -1;
                        bVar8.K = 0;
                        bVar8.R = Integer.MIN_VALUE;
                        break;
                    case b4.f10106f /*8*/:
                        b.C0015b bVar9 = aVar.f1226d;
                        bVar9.C = -1.0f;
                        bVar9.B = -1;
                        bVar9.A = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            bVar.b(this, true);
            setConstraintSet((b) null);
            requestLayout();
        }
    }
}
