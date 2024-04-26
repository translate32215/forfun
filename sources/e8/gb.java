package e8;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.measurement.internal.h;
import java.util.HashMap;
import o8.i5;
import o8.j5;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14757a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14758b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14759c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14760d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f14761e;

    public /* synthetic */ gb(j5 j5Var, int i10, h hVar, Intent intent) {
        this.f14758b = j5Var;
        this.f14760d = i10;
        this.f14759c = hVar;
        this.f14761e = intent;
    }

    public final void run() {
        switch (this.f14757a) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f14758b);
                hashMap.put("cachedSrc", (String) this.f14759c);
                hashMap.put("totalBytes", Integer.toString(this.f14760d));
                q7.j((q7) this.f14761e, "onPrecacheEvent", hashMap);
                return;
            case 1:
                int i10 = s7.H;
                ((s7) this.f14761e).l((View) this.f14758b, (h8) this.f14759c, this.f14760d - 1);
                return;
            default:
                j5 j5Var = (j5) this.f14758b;
                int i11 = this.f14760d;
                h hVar = (h) this.f14759c;
                Intent intent = (Intent) this.f14761e;
                if (((i5) j5Var.f23297a).b(i11)) {
                    hVar.f8805n.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i11));
                    j5Var.c().f8805n.a("Completed wakeful intent.");
                    ((i5) j5Var.f23297a).a(intent);
                    return;
                }
                return;
        }
    }

    public gb(q7 q7Var, String str, String str2, int i10) {
        this.f14761e = q7Var;
        this.f14758b = str;
        this.f14759c = str2;
        this.f14760d = i10;
    }

    public gb(s7 s7Var, View view, h8 h8Var, int i10) {
        this.f14761e = s7Var;
        this.f14758b = view;
        this.f14759c = h8Var;
        this.f14760d = i10;
    }
}
