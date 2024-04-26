package s6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.android.exoplayer2.ui.e;

/* compiled from: WebViewSubtitleOutput */
public class g extends WebView {
    public g(e eVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    public boolean performClick() {
        super.performClick();
        return false;
    }
}
