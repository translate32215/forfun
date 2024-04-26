package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.startapp.startappsdk.R;

public class PlaybackTransportRowView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public a f2185a;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public PlaybackTransportRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        a aVar = this.f2185a;
        if (aVar == null || !aVar.a(keyEvent)) {
            return false;
        }
        return true;
    }

    public View focusSearch(View view, int i10) {
        View childAt;
        if (view != null) {
            if (i10 == 33) {
                for (int indexOfChild = indexOfChild(getFocusedChild()) - 1; indexOfChild >= 0; indexOfChild--) {
                    View childAt2 = getChildAt(indexOfChild);
                    if (childAt2.hasFocusable()) {
                        return childAt2;
                    }
                }
            } else if (i10 == 130) {
                int indexOfChild2 = indexOfChild(getFocusedChild());
                do {
                    indexOfChild2++;
                    if (indexOfChild2 < getChildCount()) {
                        childAt = getChildAt(indexOfChild2);
                    }
                } while (!childAt.hasFocusable());
                return childAt;
            } else if ((i10 == 17 || i10 == 66) && (getFocusedChild() instanceof ViewGroup)) {
                return FocusFinder.getInstance().findNextFocus((ViewGroup) getFocusedChild(), view, i10);
            }
        }
        return super.focusSearch(view, i10);
    }

    public a getOnUnhandledKeyListener() {
        return this.f2185a;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findFocus = findFocus();
        if (findFocus != null && findFocus.requestFocus(i10, rect)) {
            return true;
        }
        View findViewById = findViewById(R.id.playback_progress);
        if (findViewById == null || !findViewById.isFocusable() || !findViewById.requestFocus(i10, rect)) {
            return super.onRequestFocusInDescendants(i10, rect);
        }
        return true;
    }

    public void setOnUnhandledKeyListener(a aVar) {
        this.f2185a = aVar;
    }
}
