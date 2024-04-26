package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.startapp.startappsdk.R;

/* compiled from: RowContainerView */
public final class w0 extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f2550a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable f2551b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2552c = true;

    public w0(Context context) {
        super(context, (AttributeSet) null, 0);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.lb_row_container, this);
        this.f2550a = (ViewGroup) findViewById(R.id.lb_row_container_header_dock);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2551b;
        if (drawable != null) {
            if (this.f2552c) {
                this.f2552c = false;
                drawable.setBounds(0, 0, getWidth(), getHeight());
            }
            this.f2551b.draw(canvas);
        }
    }

    public Drawable getForeground() {
        return this.f2551b;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f2552c = true;
    }

    public void setForeground(Drawable drawable) {
        this.f2551b = drawable;
        setWillNotDraw(drawable == null);
        invalidate();
    }
}
