package d7;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.internal.ads.tm;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f13181a;

    public i(c cVar) {
        this.f13181a = cVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        tm tmVar = this.f13181a.f5602h;
        if (tmVar == null) {
            return false;
        }
        tmVar.f8207b.f(motionEvent);
        return false;
    }
}
