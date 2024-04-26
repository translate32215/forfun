package f1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import com.startapp.startappsdk.R;

/* compiled from: ColorOverlayDimmer */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f18074a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18075b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f18076c;

    public a(int i10, float f10, float f11) {
        f10 = f10 > 1.0f ? 1.0f : f10;
        float f12 = 0.0f;
        f10 = f10 < 0.0f ? 0.0f : f10;
        f11 = f11 > 1.0f ? 1.0f : f11;
        f12 = f11 >= 0.0f ? f11 : f12;
        Paint paint = new Paint();
        this.f18076c = paint;
        paint.setColor(Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10)));
        this.f18074a = f10;
        this.f18075b = f12;
        b(1.0f);
    }

    public static a a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e1.a.f13528b);
        int color = obtainStyledAttributes.getColor(35, context.getResources().getColor(R.color.lb_view_dim_mask_color));
        float fraction = obtainStyledAttributes.getFraction(33, 1, 1, context.getResources().getFraction(R.fraction.lb_view_active_level, 1, 0));
        float fraction2 = obtainStyledAttributes.getFraction(34, 1, 1, context.getResources().getFraction(R.fraction.lb_view_dimmed_level, 1, 1));
        obtainStyledAttributes.recycle();
        return new a(color, fraction, fraction2);
    }

    public void b(float f10) {
        float f11 = this.f18075b;
        this.f18076c.setAlpha((int) ((((this.f18074a - f11) * f10) + f11) * 255.0f));
    }
}
