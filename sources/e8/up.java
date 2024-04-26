package e8;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.t7;
import f7.g;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class up extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final g f16980a;

    public up(Context context, View view, g gVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f16980a = gVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f16980a.c(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && (childAt instanceof t7)) {
                arrayList.add((t7) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t7) obj).destroy();
        }
    }
}
