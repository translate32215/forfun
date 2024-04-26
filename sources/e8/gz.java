package e8;

import androidx.activity.k;
import c7.a;
import com.google.android.gms.internal.ads.hq;
import com.google.android.gms.internal.ads.le;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.me;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.ne;
import com.google.android.gms.internal.ads.oz;
import com.google.android.gms.internal.ads.ri;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.u8;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.yu;
import com.google.android.gms.internal.ads.za;
import e.f;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s8.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class gz implements a00, aw, e, a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14834a;

    /* renamed from: b  reason: collision with root package name */
    public Object f14835b;

    public gz(vd vdVar) {
        this.f14834a = 0;
        this.f14835b = vdVar;
    }

    public ei C(b00 b00) {
        switch (this.f14834a) {
            case 0:
                return ((vd) this.f14835b).b(b00);
            default:
                return ((le) this.f14835b).a(b00);
        }
    }

    public void a(Object obj) {
        switch (this.f14834a) {
            case 1:
                u8 u8Var = (u8) obj;
                synchronized (((wd) this.f14835b)) {
                    Object obj2 = this.f14835b;
                    if (((wd) obj2).f8452i != null) {
                        ((wd) obj2).f8452i.a();
                    }
                    Object obj3 = this.f14835b;
                    ((wd) obj3).f8452i = u8Var;
                    wd wdVar = (wd) obj3;
                    wdVar.getClass();
                    t7 t7Var = u8Var.f8221h;
                    if (t7Var != null) {
                        t7Var.x(wdVar);
                    }
                    hz hzVar = ((wd) this.f14835b).f8449f;
                    Object obj4 = this.f14835b;
                    yf yfVar = new yf(u8Var, (wd) obj4, ((wd) obj4).f8449f);
                    hzVar.getClass();
                    while (true) {
                        hz hzVar2 = hzVar.f14963g;
                        if (hzVar2 != null) {
                            hzVar = hzVar2;
                        } else {
                            k.d(hzVar.f14958b, new ri((yu) yfVar));
                            u8Var.b();
                        }
                    }
                }
                return;
            case 4:
                za zaVar = (za) obj;
                synchronized (((me) this.f14835b)) {
                    Object obj5 = this.f14835b;
                    ((me) obj5).f7484f = zaVar;
                    ((me) obj5).f7484f.b();
                }
                return;
            default:
                za zaVar2 = (za) obj;
                synchronized (((ne) this.f14835b)) {
                    Object obj6 = this.f14835b;
                    ((ne) obj6).f7576e = zaVar2;
                    ((ne) obj6).f7576e.b();
                }
                return;
        }
    }

    public void b(mp mpVar) {
        while (!mpVar.B()) {
            if (mpVar instanceof hq) {
                hq hqVar = (hq) mpVar;
                b(hqVar.f6889e);
                mpVar = hqVar.f6890f;
            } else {
                String valueOf = String.valueOf(mpVar.getClass());
                throw new IllegalArgumentException(f.a(valueOf.length() + 49, "Has a new type of ByteString been created? Found ", valueOf));
            }
        }
        int binarySearch = Arrays.binarySearch(hq.f6887i, mpVar.size());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int N = hq.N(binarySearch + 1);
        if (((ArrayDeque) this.f14835b).isEmpty() || ((mp) ((ArrayDeque) this.f14835b).peek()).size() >= N) {
            ((ArrayDeque) this.f14835b).push(mpVar);
            return;
        }
        int N2 = hq.N(binarySearch);
        mp mpVar2 = (mp) ((ArrayDeque) this.f14835b).pop();
        while (!((ArrayDeque) this.f14835b).isEmpty() && ((mp) ((ArrayDeque) this.f14835b).peek()).size() < N2) {
            mpVar2 = new hq((mp) ((ArrayDeque) this.f14835b).pop(), mpVar2);
        }
        hq hqVar2 = new hq(mpVar2, mpVar);
        while (!((ArrayDeque) this.f14835b).isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(hq.f6887i, hqVar2.f6888d);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((mp) ((ArrayDeque) this.f14835b).peek()).size() >= hq.N(binarySearch2 + 1)) {
                break;
            }
            hqVar2 = new hq((mp) ((ArrayDeque) this.f14835b).pop(), hqVar2);
        }
        ((ArrayDeque) this.f14835b).push(hqVar2);
    }

    public AtomicReference<T> c(String str) {
        synchronized (this) {
            if (!((Map) this.f14835b).containsKey(str)) {
                ((Map) this.f14835b).put(str, new AtomicReference());
            }
        }
        return (AtomicReference) ((Map) this.f14835b).get(str);
    }

    public void d(Exception exc) {
        m30 m30 = (m30) this.f14835b;
        m30.getClass();
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((mf) m30.f15453c).a(2025, -1, exc);
    }

    public mp e(mp mpVar, mp mpVar2) {
        b(mpVar);
        b(mpVar2);
        mp mpVar3 = (mp) ((ArrayDeque) this.f14835b).pop();
        while (!((ArrayDeque) this.f14835b).isEmpty()) {
            mpVar3 = new hq((mp) ((ArrayDeque) this.f14835b).pop(), mpVar3);
        }
        return mpVar3;
    }

    public void w() {
        switch (this.f14834a) {
            case 1:
                synchronized (((wd) this.f14835b)) {
                    ((wd) this.f14835b).f8452i = null;
                }
                return;
            case 4:
                synchronized (((me) this.f14835b)) {
                    ((me) this.f14835b).f7484f = null;
                }
                return;
            default:
                synchronized (((ne) this.f14835b)) {
                    ((ne) this.f14835b).f7576e = null;
                }
                return;
        }
    }

    public gz(le leVar) {
        this.f14834a = 3;
        this.f14835b = leVar;
    }

    public gz(oz ozVar) {
        this.f14834a = 11;
        this.f14835b = ozVar;
    }

    public gz(m30 m30) {
        this.f14834a = 6;
        this.f14835b = m30;
    }

    public gz(int i10) {
        this.f14834a = i10;
        if (i10 == 9) {
            this.f14835b = new HashMap();
        } else if (i10 != 10) {
            this.f14835b = new ArrayDeque();
        }
    }

    public gz(wd wdVar) {
        this.f14834a = 1;
        this.f14835b = wdVar;
    }

    public gz(me meVar) {
        this.f14834a = 4;
        this.f14835b = meVar;
    }

    public gz(ne neVar) {
        this.f14834a = 5;
        this.f14835b = neVar;
    }

    public gz(lg lgVar) {
        this.f14834a = 7;
        this.f14835b = lgVar;
    }

    public gz(yz yzVar) {
        this.f14834a = 2;
        this.f14835b = yzVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz(l90 l90) {
        this(8);
        this.f14834a = 8;
    }
}
