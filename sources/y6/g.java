package y6;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import c8.b;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.jx;
import e8.a;
import e8.bi0;
import e8.bj0;
import e8.e0;
import e8.h;
import e8.ji0;
import e8.li0;
import e8.qi0;
import e8.si0;
import e8.ti0;
import e8.wh0;
import e8.yh0;
import e8.zi0;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public class g extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final bj0 f28125a;

    public g(Context context, int i10) {
        super(context);
        this.f28125a = new bj0(this, i10);
    }

    public void a(c cVar) {
        dy dyVar;
        bj0 bj0 = this.f28125a;
        zi0 zi0 = cVar.f28108a;
        bj0.getClass();
        try {
            dy dyVar2 = bj0.f14028h;
            if (dyVar2 == null) {
                if ((bj0.f14026f == null || bj0.f14031k == null) && dyVar2 == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = bj0.f14032l.getContext();
                li0 f10 = bj0.f(context, bj0.f14026f, bj0.f14033m);
                if ("search_v2".equals(f10.f15394a)) {
                    dyVar = (dy) new jx(ti0.f16763j.f16765b, context, f10, bj0.f14031k).b(context, false);
                } else {
                    dyVar = (dy) new si0(ti0.f16763j.f16765b, context, f10, bj0.f14031k, bj0.f14021a, 0).b(context, false);
                }
                bj0.f14028h = dyVar;
                dyVar.p6(new bi0(bj0.f14023c));
                if (bj0.f14024d != null) {
                    bj0.f14028h.q1(new yh0(bj0.f14024d));
                }
                if (bj0.f14027g != null) {
                    bj0.f14028h.k1(new qi0(bj0.f14027g));
                }
                if (bj0.f14029i != null) {
                    bj0.f14028h.Z5(new e0(bj0.f14029i));
                }
                m mVar = bj0.f14030j;
                if (mVar != null) {
                    bj0.f14028h.p2(new h(mVar));
                }
                bj0.f14028h.y5(new a(bj0.f14035o));
                bj0.f14028h.X1(bj0.f14034n);
                try {
                    c8.a O1 = bj0.f14028h.O1();
                    if (O1 != null) {
                        bj0.f14032l.addView((View) b.z0(O1));
                    }
                } catch (RemoteException e10) {
                    e.F("#007 Could not call remote method.", e10);
                }
            }
            if (bj0.f14028h.e1(ji0.a(bj0.f14032l.getContext(), zi0))) {
                bj0.f14021a.f8175a = zi0.f17764g;
            }
        } catch (RemoteException e11) {
            e.F("#007 Could not call remote method.", e11);
        }
    }

    public a getAdListener() {
        return this.f28125a.f14025e;
    }

    public d getAdSize() {
        return this.f28125a.a();
    }

    public String getAdUnitId() {
        return this.f28125a.b();
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        bj0 bj0 = this.f28125a;
        bj0.getClass();
        try {
            dy dyVar = bj0.f14028h;
            if (dyVar != null) {
                return dyVar.A0();
            }
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
        return null;
    }

    public com.google.android.gms.ads.e getResponseInfo() {
        return this.f28125a.c();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = ((i12 - i10) - measuredWidth) / 2;
            int i15 = ((i13 - i11) - measuredHeight) / 2;
            childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            d dVar = null;
            try {
                dVar = getAdSize();
            } catch (NullPointerException e10) {
                e.C("Unable to retrieve ad size.", e10);
            }
            if (dVar != null) {
                Context context = getContext();
                int b10 = dVar.b(context);
                i12 = dVar.a(context);
                i13 = b10;
            } else {
                i12 = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            i13 = childAt.getMeasuredWidth();
            i12 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }

    public void setAdListener(a aVar) {
        this.f28125a.d(aVar);
        if (aVar == null) {
            this.f28125a.g((wh0) null);
            this.f28125a.h((z6.a) null);
            return;
        }
        if (aVar instanceof wh0) {
            this.f28125a.g((wh0) aVar);
        }
        if (aVar instanceof z6.a) {
            this.f28125a.h((z6.a) aVar);
        }
    }

    public void setAdSize(d dVar) {
        bj0 bj0 = this.f28125a;
        d[] dVarArr = {dVar};
        if (bj0.f14026f == null) {
            bj0.i(dVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public void setAdUnitId(String str) {
        this.f28125a.e(str);
    }

    public void setOnPaidEventListener(k kVar) {
        bj0 bj0 = this.f28125a;
        bj0.getClass();
        try {
            bj0.f14035o = kVar;
            dy dyVar = bj0.f14028h;
            if (dyVar != null) {
                dyVar.y5(new a(kVar));
            }
        } catch (RemoteException e10) {
            e.F("#008 Must be called on the main UI thread.", e10);
        }
    }
}
