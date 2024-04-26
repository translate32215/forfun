package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Placeholder */
public class d extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f1330a;

    /* renamed from: b  reason: collision with root package name */
    public View f1331b;

    /* renamed from: c  reason: collision with root package name */
    public int f1332c;

    public View getContent() {
        return this.f1331b;
    }

    public int getEmptyVisibility() {
        return this.f1332c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) rect.height()) / 2.0f) + (((float) height) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f1330a != i10) {
            View view = this.f1331b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f1331b.getLayoutParams()).f1167f0 = false;
                this.f1331b = null;
            }
            this.f1330a = i10;
            if (i10 != -1 && (findViewById = ((View) getParent()).findViewById(i10)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i10) {
        this.f1332c = i10;
    }
}
