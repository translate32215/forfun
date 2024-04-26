package a7;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.b;
import cb.d;
import e8.d2;
import e8.t;
import e8.ti0;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class m extends FrameLayout {
    public final void a(String str, View view) {
        try {
            new b(view);
            throw null;
        } catch (RemoteException e10) {
            e.C("Unable to call setAssetView on delegate", e10);
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront((View) null);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (view != null) {
            super.bringChildToFront((View) null);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean booleanValue = ((Boolean) ti0.f16763j.f16769f.a(t.A1)).booleanValue();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final a getAdChoicesView() {
        throw null;
    }

    public final View getAdvertiserView() {
        throw null;
    }

    public final View getBodyView() {
        throw null;
    }

    public final View getCallToActionView() {
        throw null;
    }

    public final View getHeadlineView() {
        throw null;
    }

    public final View getIconView() {
        throw null;
    }

    public final View getImageView() {
        throw null;
    }

    public final c getMediaView() {
        throw null;
    }

    public final View getPriceView() {
        throw null;
    }

    public final View getStarRatingView() {
        throw null;
    }

    public final View getStoreView() {
        throw null;
    }

    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
    }

    public final void removeAllViews() {
        super.removeAllViews();
        addView((View) null);
    }

    public final void removeView(View view) {
        if (view != null) {
            super.removeView(view);
        }
    }

    public final void setAdChoicesView(a aVar) {
        a("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        a("3005", view);
    }

    public final void setBodyView(View view) {
        a("3004", view);
    }

    public final void setCallToActionView(View view) {
        a("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            new b(view);
            throw null;
        } catch (RemoteException e10) {
            e.C("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public final void setHeadlineView(View view) {
        a("3001", view);
    }

    public final void setIconView(View view) {
        a("3003", view);
    }

    public final void setImageView(View view) {
        a("3008", view);
    }

    public final void setMediaView(c cVar) {
        a("3010", cVar);
        if (cVar != null) {
            d dVar = new d(this);
            synchronized (cVar) {
                cVar.f130c = dVar;
                if (cVar.f129b) {
                    dVar.h(cVar.f128a);
                }
            }
            b2.t tVar = new b2.t(this);
            synchronized (cVar) {
                cVar.f133f = tVar;
                if (cVar.f132e) {
                    tVar.V(cVar.f131d);
                }
            }
        }
    }

    public final void setNativeAd(l lVar) {
        try {
            d2 d2Var = (d2) lVar;
            d2Var.getClass();
            try {
                d2Var.f14203a.y();
            } catch (RemoteException e10) {
                e.C("", e10);
            }
            throw null;
        } catch (RemoteException e11) {
            e.C("Unable to call setNativeAd on delegate", e11);
        }
    }

    public final void setPriceView(View view) {
        a("3007", view);
    }

    public final void setStarRatingView(View view) {
        a("3009", view);
    }

    public final void setStoreView(View view) {
        a("3006", view);
    }
}
