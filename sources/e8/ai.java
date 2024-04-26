package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.qe;
import f7.g;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ai implements mg {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13731a;

    /* renamed from: b  reason: collision with root package name */
    public final f9 f13732b;

    /* renamed from: c  reason: collision with root package name */
    public final w00 f13733c;

    public ai(Context context, f9 f9Var, w00 w00) {
        this.f13731a = context;
        this.f13732b = f9Var;
        this.f13733c = w00;
    }

    public final Object apply(Object obj) {
        Context context = this.f13731a;
        f9 f9Var = this.f13732b;
        w00 w00 = this.f13733c;
        qe qeVar = (qe) obj;
        g gVar = new g(context);
        gVar.f18270b = qeVar.A;
        gVar.f18273e = qeVar.B.toString();
        gVar.f18272d = f9Var.f14544a;
        gVar.f18271c = w00.f17192f;
        return gVar;
    }
}
