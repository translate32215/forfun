package androidx.leanback.transition;

import android.content.Context;
import android.transition.Slide;
import android.transition.TransitionPropagation;
import android.util.AttributeSet;

public class SlideNoPropagation extends Slide {
    public SlideNoPropagation() {
    }

    public void setSlideEdge(int i10) {
        super.setSlideEdge(i10);
        setPropagation((TransitionPropagation) null);
    }

    public SlideNoPropagation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
