package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

class PlaybackControlsRowView extends LinearLayout {
    public PlaybackControlsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findFocus = findFocus();
        if (findFocus == null || !findFocus.requestFocus(i10, rect)) {
            return super.onRequestFocusInDescendants(i10, rect);
        }
        return true;
    }
}
