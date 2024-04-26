package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.startapp.startappsdk.R;
import e.d;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0.c0;
import o0.m0;
import o0.n0;
import o0.p0;
import s9.f;

/* compiled from: MaterialDatePicker */
public final class o<S> extends androidx.fragment.app.o {
    public static final /* synthetic */ int Z0 = 0;
    public final LinkedHashSet<r<? super S>> D0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> E0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> F0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> G0 = new LinkedHashSet<>();
    public int H0;
    public d<S> I0;
    public y<S> J0;
    public a K0;
    public g<S> L0;
    public int M0;
    public CharSequence N0;
    public boolean O0;
    public int P0;
    public int Q0;
    public CharSequence R0;
    public int S0;
    public CharSequence T0;
    public TextView U0;
    public CheckableImageButton V0;
    public f W0;
    public Button X0;
    public boolean Y0;

    /* compiled from: MaterialDatePicker */
    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            Iterator it = o.this.D0.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a(o.this.x0().H());
            }
            o.this.s0(false, false, false);
        }
    }

    /* compiled from: MaterialDatePicker */
    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            Iterator it = o.this.E0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            o.this.s0(false, false, false);
        }
    }

    /* compiled from: MaterialDatePicker */
    public class c extends x<S> {
        public c() {
        }

        public void a(S s10) {
            o oVar = o.this;
            int i10 = o.Z0;
            oVar.C0();
            o oVar2 = o.this;
            oVar2.X0.setEnabled(oVar2.x0().E());
        }
    }

    public static boolean A0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(p9.b.c(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public static int y0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d10 = b0.d();
        d10.set(5, 1);
        Calendar b10 = b0.b(d10);
        b10.get(2);
        b10.get(1);
        int maximum = b10.getMaximum(7);
        b10.getActualMaximum(5);
        b10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean z0(Context context) {
        return A0(context, 16843277);
    }

    public final void B0() {
        y<S> yVar;
        Context h02 = h0();
        int i10 = this.H0;
        if (i10 == 0) {
            i10 = x0().f(h02);
        }
        d x02 = x0();
        a aVar = this.K0;
        g<S> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", x02);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f9129d);
        gVar.l0(bundle);
        this.L0 = gVar;
        if (this.V0.isChecked()) {
            d x03 = x0();
            a aVar2 = this.K0;
            yVar = new s<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", x03);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            yVar.l0(bundle2);
        } else {
            yVar = this.L0;
        }
        this.J0 = yVar;
        C0();
        androidx.fragment.app.b bVar = new androidx.fragment.app.b(p());
        bVar.h(R.id.mtrl_calendar_frame, this.J0);
        bVar.m();
        this.J0.r0(new c());
    }

    public final void C0() {
        String c10 = x0().c(q());
        this.U0.setContentDescription(String.format(D(R.string.mtrl_picker_announce_current_selection), new Object[]{c10}));
        this.U0.setText(c10);
    }

    public final void D0(CheckableImageButton checkableImageButton) {
        String str;
        if (this.V0.isChecked()) {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.V0.setContentDescription(str);
    }

    public final void O(Bundle bundle) {
        super.O(bundle);
        if (bundle == null) {
            bundle = this.f1796g;
        }
        this.H0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.I0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.K0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.M0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.N0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.P0 = bundle.getInt("INPUT_MODE_KEY");
        this.Q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.R0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.S0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.T0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    public final View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.O0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.O0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(y0(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(y0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.U0 = textView;
        c0.D(textView, 1);
        this.V0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.N0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.M0);
        }
        this.V0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.V0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, g.a.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], g.a.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.V0.setChecked(this.P0 != 0);
        c0.C(this.V0, (o0.a) null);
        D0(this.V0);
        this.V0.setOnClickListener(new q(this));
        this.X0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (x0().E()) {
            this.X0.setEnabled(true);
        } else {
            this.X0.setEnabled(false);
        }
        this.X0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.R0;
        if (charSequence2 != null) {
            this.X0.setText(charSequence2);
        } else {
            int i10 = this.Q0;
            if (i10 != 0) {
                this.X0.setText(i10);
            }
        }
        this.X0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.T0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.S0;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void a0(Bundle bundle) {
        super.a0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.H0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.I0);
        a.b bVar = new a.b(this.K0);
        t tVar = this.L0.f9169r0;
        if (tVar != null) {
            bVar.f9136c = Long.valueOf(tVar.f9207f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f9137d);
        t i10 = t.i(bVar.f9134a);
        t i11 = t.i(bVar.f9135b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = bVar.f9136c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new a(i10, i11, cVar, l10 == null ? null : t.i(l10.longValue()), (a.C0095a) null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.M0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.N0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.Q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.R0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.S0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.T0);
    }

    public void b0() {
        super.b0();
        Window window = u0().getWindow();
        if (this.O0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.W0);
            if (!this.Y0) {
                View findViewById = i0().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 21) {
                    boolean z10 = false;
                    boolean z11 = valueOf == null || valueOf.intValue() == 0;
                    int f10 = d.f(window.getContext(), 16842801, -16777216);
                    if (z11) {
                        valueOf = Integer.valueOf(f10);
                    }
                    Integer valueOf2 = Integer.valueOf(f10);
                    if (i10 >= 30) {
                        n0.a(window, false);
                    } else {
                        m0.a(window, false);
                    }
                    int e10 = i10 < 23 ? g0.a.e(d.f(window.getContext(), 16843857, -16777216), 128) : 0;
                    int e11 = i10 < 27 ? g0.a.e(d.f(window.getContext(), 16843858, -16777216), 128) : 0;
                    window.setStatusBarColor(e10);
                    window.setNavigationBarColor(e11);
                    boolean z12 = d.h(e10) || (e10 == 0 && d.h(valueOf.intValue()));
                    boolean h10 = d.h(valueOf2.intValue());
                    if (d.h(e11) || (e11 == 0 && h10)) {
                        z10 = true;
                    }
                    p0 p0Var = new p0(window, window.getDecorView());
                    p0Var.f22627a.b(z12);
                    p0Var.f22627a.a(z10);
                }
                c0.J(findViewById, new p(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
                this.Y0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = C().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.W0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new g9.a(u0(), rect));
        }
        B0();
    }

    public void c0() {
        this.J0.f9223n0.clear();
        this.O = true;
        Dialog dialog = this.f1775y0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.F0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.G0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.Q;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final Dialog t0(Bundle bundle) {
        Context h02 = h0();
        Context h03 = h0();
        int i10 = this.H0;
        if (i10 == 0) {
            i10 = x0().f(h03);
        }
        Dialog dialog = new Dialog(h02, i10);
        Context context = dialog.getContext();
        this.O0 = z0(context);
        int c10 = p9.b.c(context, R.attr.colorSurface, o.class.getCanonicalName());
        f fVar = new f(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2132083830);
        this.W0 = fVar;
        fVar.f25079a.f25099b = new i9.a(context);
        fVar.z();
        this.W0.r(ColorStateList.valueOf(c10));
        this.W0.q(c0.l(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final d<S> x0() {
        if (this.I0 == null) {
            this.I0 = (d) this.f1796g.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.I0;
    }
}
