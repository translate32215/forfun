package e8;

import android.os.Bundle;
import com.google.android.gms.internal.ads.d7;
import d7.l;
import java.util.List;
import o8.b4;
import o8.s4;
import o8.x4;
import o8.z4;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class zq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17784a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17785b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17786c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17787d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f17788e;

    /* renamed from: f  reason: collision with root package name */
    public final long f17789f;

    public zq(yq yqVar, Object obj, d7 d7Var, String str, long j10) {
        this.f17785b = yqVar;
        this.f17786c = obj;
        this.f17787d = d7Var;
        this.f17788e = str;
        this.f17789f = j10;
    }

    public final void run() {
        switch (this.f17784a) {
            case 0:
                yq yqVar = (yq) this.f17785b;
                Object obj = this.f17786c;
                d7 d7Var = (d7) this.f17787d;
                String str = (String) this.f17788e;
                long j10 = this.f17789f;
                yqVar.getClass();
                synchronized (obj) {
                    if (!d7Var.isDone()) {
                        yqVar.f17661m.put(str, new y3(str, false, (int) (l.B.f13193j.a() - j10), "Timeout."));
                        yqVar.f17659k.e(str, "timeout");
                        yqVar.f17662n.I0(new uk(str, "timeout", 1));
                        d7Var.b(Boolean.FALSE);
                    }
                }
                return;
            case 1:
                if (((String) this.f17788e) == null) {
                    ((b4) this.f17787d).f23124a.f23481l.x().r((String) this.f17785b, (x4) null);
                    return;
                }
                String str2 = (String) this.f17786c;
                z4 x10 = ((b4) this.f17787d).f23124a.f23481l.x();
                String str3 = (String) this.f17785b;
                x10.h();
                synchronized (x10) {
                    String str4 = x10.f23650m;
                    if (str4 != null) {
                        str4.equals(str3);
                    }
                    x10.f23650m = str3;
                }
                return;
            case 2:
                ((s4) this.f17787d).B((String) this.f17788e, (String) this.f17785b, this.f17786c, this.f17789f);
                return;
            default:
                z4 z4Var = (z4) this.f17788e;
                Bundle bundle = (Bundle) this.f17785b;
                long j11 = this.f17789f;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                z4Var.m((x4) this.f17786c, (x4) this.f17787d, j11, true, z4Var.f8864a.A().r0((String) null, "screen_view", bundle, (List<String>) null, false));
                return;
        }
    }

    public zq(b4 b4Var, String str, String str2, String str3, long j10) {
        this.f17787d = b4Var;
        this.f17788e = str;
        this.f17785b = str2;
        this.f17786c = str3;
        this.f17789f = j10;
    }

    public zq(s4 s4Var, String str, String str2, Object obj, long j10) {
        this.f17787d = s4Var;
        this.f17788e = str;
        this.f17785b = str2;
        this.f17786c = obj;
        this.f17789f = j10;
    }

    public zq(z4 z4Var, Bundle bundle, x4 x4Var, x4 x4Var2, long j10) {
        this.f17788e = z4Var;
        this.f17785b = bundle;
        this.f17786c = x4Var;
        this.f17787d = x4Var2;
        this.f17789f = j10;
    }
}
