package r;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import r.h;

/* compiled from: CardViewApi17Impl */
public class b extends d {

    /* compiled from: CardViewApi17Impl */
    public class a implements h.a {
        public a(b bVar) {
        }

        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public void i() {
        h.f24460r = new a(this);
    }
}
