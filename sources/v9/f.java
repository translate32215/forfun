package v9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import s9.i;

/* compiled from: CutoutDrawable */
public class f extends s9.f {
    public final Paint H;
    public final RectF I;

    public f() {
        this((i) null);
    }

    public void A(float f10, float f11, float f12, float f13) {
        RectF rectF = this.I;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    public void h(Canvas canvas) {
        if (this.I.isEmpty()) {
            super.h(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.I);
        } else {
            canvas.clipRect(this.I, Region.Op.DIFFERENCE);
        }
        super.h(canvas);
        canvas.restore();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(i iVar) {
        super(iVar == null ? new i() : iVar);
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.I = new RectF();
    }
}
