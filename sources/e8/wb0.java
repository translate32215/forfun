package e8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.startapp.b4;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wb0 extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ vb0 f17236a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wb0(vb0 vb0, Looper looper) {
        super(looper);
        this.f17236a = vb0;
    }

    public final void handleMessage(Message message) {
        vb0 vb0 = this.f17236a;
        vb0.getClass();
        boolean z10 = true;
        switch (message.what) {
            case 0:
                vb0.f17053m--;
                return;
            case 1:
                vb0.f17051k = message.arg1;
                Iterator<tb0> it = vb0.f17046f.iterator();
                while (it.hasNext()) {
                    it.next().j(vb0.f17050j, vb0.f17051k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z10 = false;
                }
                vb0.f17054n = z10;
                Iterator<tb0> it2 = vb0.f17046f.iterator();
                while (it2.hasNext()) {
                    it2.next().d(vb0.f17054n);
                }
                return;
            case 3:
                if (vb0.f17053m == 0) {
                    mf0 mf0 = (mf0) message.obj;
                    vb0.f17049i = true;
                    vb0.f17057q = mf0.f15501a;
                    vb0.f17058r = mf0.f15502b;
                    vb0.f17042b.b(mf0.f15503c);
                    Iterator<tb0> it3 = vb0.f17046f.iterator();
                    while (it3.hasNext()) {
                        it3.next().f(vb0.f17057q, vb0.f17058r);
                    }
                    return;
                }
                return;
            case 4:
                int i10 = vb0.f17052l - 1;
                vb0.f17052l = i10;
                if (i10 == 0) {
                    vb0.f17060t = (xb0) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<tb0> it4 = vb0.f17046f.iterator();
                        while (it4.hasNext()) {
                            it4.next().c();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (vb0.f17052l == 0) {
                    vb0.f17060t = (xb0) message.obj;
                    Iterator<tb0> it5 = vb0.f17046f.iterator();
                    while (it5.hasNext()) {
                        it5.next().c();
                    }
                    return;
                }
                return;
            case 6:
                yb0 yb0 = (yb0) message.obj;
                vb0.f17052l -= yb0.f17596d;
                if (vb0.f17053m == 0) {
                    vb0.f17055o = yb0.f17593a;
                    vb0.f17056p = yb0.f17594b;
                    vb0.f17060t = yb0.f17595c;
                    Iterator<tb0> it6 = vb0.f17046f.iterator();
                    while (it6.hasNext()) {
                        it6.next().h(vb0.f17055o, vb0.f17056p);
                    }
                    return;
                }
                return;
            case 7:
                dc0 dc0 = (dc0) message.obj;
                if (!vb0.f17059s.equals(dc0)) {
                    vb0.f17059s = dc0;
                    Iterator<tb0> it7 = vb0.f17046f.iterator();
                    while (it7.hasNext()) {
                        it7.next().a(dc0);
                    }
                    return;
                }
                return;
            case b4.f10106f:
                rb0 rb0 = (rb0) message.obj;
                Iterator<tb0> it8 = vb0.f17046f.iterator();
                while (it8.hasNext()) {
                    it8.next().b(rb0);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
