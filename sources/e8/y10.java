package e8;

import android.os.Handler;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.a;
import com.google.android.gms.internal.ads.bt;
import com.google.android.gms.internal.ads.df;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.j9;
import com.google.android.gms.internal.ads.lf;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.mp;
import f7.f0;
import java.util.concurrent.Executor;
import u7.l;
import x6.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class y10 implements j9, xe0 {

    /* renamed from: a  reason: collision with root package name */
    public Object f17566a;

    public y10(df dfVar) {
        this.f17566a = dfVar;
    }

    public void F(Object obj) {
        hf hfVar = (hf) this.f17566a;
        ((q20) obj).B((Cif) hfVar.f6855a, hfVar.f6856b);
    }

    public boolean a(long j10) {
        boolean z10;
        boolean z11 = false;
        do {
            long b10 = b();
            if (b10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (xe0 xe0 : (xe0[]) this.f17566a) {
                if (xe0.b() == b10) {
                    z10 |= xe0.a(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    public long b() {
        long j10 = Long.MAX_VALUE;
        for (xe0 b10 : (xe0[]) this.f17566a) {
            long b11 = b10.b();
            if (b11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, b11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public void c(a<?> aVar, r5 r5Var) {
        aVar.m("post-error");
        ((Executor) this.f17566a).execute(new f0((a) aVar, new c(r5Var), (Runnable) null));
    }

    public void h(a<?> aVar, c cVar, Runnable runnable) {
        synchronized (aVar.f5924e) {
            aVar.f5929r = true;
        }
        aVar.m("post-response");
        ((Executor) this.f17566a).execute(new f0((a) aVar, cVar, runnable));
    }

    public y10(hf hfVar) {
        this.f17566a = hfVar;
    }

    public y10(Handler handler) {
        this.f17566a = new l(handler, 1);
    }

    public y10(lf lfVar) {
        this.f17566a = lfVar;
    }

    public y10(mf mfVar) {
        this.f17566a = mfVar;
    }

    public y10(mp mpVar) {
        this.f17566a = mpVar;
    }

    public y10(bt btVar) {
        this.f17566a = btVar;
    }

    public y10(xe0[] xe0Arr) {
        this.f17566a = xe0Arr;
    }
}
