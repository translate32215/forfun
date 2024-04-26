package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable */
public class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f815a;

    public b(ActionBarContainer actionBarContainer) {
        this.f815a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f815a;
        if (actionBarContainer.f631h) {
            Drawable drawable = actionBarContainer.f630g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f628e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f815a;
        Drawable drawable3 = actionBarContainer2.f629f;
        if (drawable3 != null && actionBarContainer2.f632i) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f815a;
        if (!actionBarContainer.f631h) {
            Drawable drawable = actionBarContainer.f628e;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.f630g != null) {
            actionBarContainer.f628e.getOutline(outline);
        }
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
