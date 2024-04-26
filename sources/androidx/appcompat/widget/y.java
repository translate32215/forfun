package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.startapp.startappsdk.R;

/* compiled from: AppCompatSeekBar */
public class y extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    public final z f1126a;

    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        b1.a(this, getContext());
        z zVar = new z(this);
        this.f1126a = zVar;
        zVar.a(attributeSet, R.attr.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        z zVar = this.f1126a;
        Drawable drawable = zVar.f1128e;
        if (drawable != null && drawable.isStateful() && drawable.setState(zVar.f1127d.getDrawableState())) {
            zVar.f1127d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1126a.f1128e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1126a.d(canvas);
    }
}
