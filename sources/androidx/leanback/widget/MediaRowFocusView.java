package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.startapp.startappsdk.R;

class MediaRowFocusView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f2151a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f2152b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public int f2153c;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color.lb_playback_media_row_highlight_color));
        this.f2151a = paint;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f2153c = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        this.f2152b.set(0.0f, (float) (-height2), (float) getWidth(), (float) (getHeight() + height2));
        RectF rectF = this.f2152b;
        int i10 = this.f2153c;
        canvas.drawRoundRect(rectF, (float) i10, (float) i10, this.f2151a);
    }
}
