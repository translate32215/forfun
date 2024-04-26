package androidx.leanback.app;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.startapp.startappsdk.R;

/* compiled from: ErrorSupportFragment */
public class k extends g {
    public String A0;
    public View.OnClickListener B0;
    public boolean C0 = true;

    /* renamed from: u0  reason: collision with root package name */
    public ViewGroup f2017u0;

    /* renamed from: v0  reason: collision with root package name */
    public ImageView f2018v0;

    /* renamed from: w0  reason: collision with root package name */
    public TextView f2019w0;

    /* renamed from: x0  reason: collision with root package name */
    public Button f2020x0;

    /* renamed from: y0  reason: collision with root package name */
    public Drawable f2021y0;

    /* renamed from: z0  reason: collision with root package name */
    public CharSequence f2022z0;

    public View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lb_error_fragment, viewGroup, false);
        this.f2017u0 = (ViewGroup) inflate.findViewById(R.id.error_frame);
        w0();
        r0(layoutInflater, this.f2017u0, bundle);
        this.f2018v0 = (ImageView) inflate.findViewById(R.id.image);
        y0();
        this.f2019w0 = (TextView) inflate.findViewById(R.id.message);
        z0();
        this.f2020x0 = (Button) inflate.findViewById(R.id.button);
        x0();
        TextView textView = this.f2019w0;
        Paint paint = new Paint(1);
        paint.setTextSize(textView.getTextSize());
        paint.setTypeface(textView.getTypeface());
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.lb_error_under_image_baseline_margin);
        TextView textView2 = this.f2019w0;
        int i10 = dimensionPixelSize + fontMetricsInt.ascent;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
        marginLayoutParams.topMargin = i10;
        textView2.setLayoutParams(marginLayoutParams);
        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(R.dimen.lb_error_under_message_baseline_margin);
        Button button = this.f2020x0;
        int i11 = dimensionPixelSize2 - fontMetricsInt.descent;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) button.getLayoutParams();
        marginLayoutParams2.topMargin = i11;
        button.setLayoutParams(marginLayoutParams2);
        return inflate;
    }

    public void b0() {
        super.b0();
        this.f2017u0.requestFocus();
    }

    public final void w0() {
        ViewGroup viewGroup = this.f2017u0;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(viewGroup.getResources().getColor(this.C0 ? R.color.lb_error_background_color_translucent : R.color.lb_error_background_color_opaque));
        }
    }

    public final void x0() {
        Button button = this.f2020x0;
        if (button != null) {
            button.setText(this.A0);
            this.f2020x0.setOnClickListener(this.B0);
            this.f2020x0.setVisibility(TextUtils.isEmpty(this.A0) ? 8 : 0);
            this.f2020x0.requestFocus();
        }
    }

    public final void y0() {
        ImageView imageView = this.f2018v0;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2021y0);
            this.f2018v0.setVisibility(this.f2021y0 == null ? 8 : 0);
        }
    }

    public final void z0() {
        TextView textView = this.f2019w0;
        if (textView != null) {
            textView.setText(this.f2022z0);
            this.f2019w0.setVisibility(TextUtils.isEmpty(this.f2022z0) ? 8 : 0);
        }
    }
}
