package a7;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.a;
import c8.b;
import e8.t;
import e8.ti0;
import l0.e;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class f extends FrameLayout {
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront((View) null);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (view != null) {
            super.bringChildToFront((View) null);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean booleanValue = ((Boolean) ti0.f16763j.f16769f.a(t.A1)).booleanValue();
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        throw null;
    }

    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
    }

    public void removeAllViews() {
        super.removeAllViews();
        addView((View) null);
    }

    public void removeView(View view) {
        if (view != null) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(a aVar) {
        try {
            new b(aVar);
            throw null;
        } catch (RemoteException e10) {
            e.C("Unable to call setAssetView on delegate", e10);
        }
    }

    public void setNativeAd(d dVar) {
        try {
            a aVar = (a) dVar.a();
            throw null;
        } catch (RemoteException e10) {
            e.C("Unable to call setNativeAd on delegate", e10);
        }
    }
}
