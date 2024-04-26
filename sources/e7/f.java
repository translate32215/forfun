package e7;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import f7.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class f extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public g f13638a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13639b;

    public f(Context context, String str, String str2) {
        super(context);
        g gVar = new g(context);
        gVar.f18270b = str;
        this.f13638a = gVar;
        gVar.f18272d = str2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f13639b) {
            return false;
        }
        this.f13638a.c(motionEvent);
        return false;
    }
}
