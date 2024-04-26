package x7;

import android.content.Context;
import android.os.Handler;
import b2.t;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.j;
import f7.v;
import g8.d;
import t7.a;
import t7.c;
import u7.w;
import v7.h;
import v7.i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class c extends t7.c<i> implements h {

    /* renamed from: i  reason: collision with root package name */
    public static final a<i> f27869i = new a<>("ClientTelemetry.API", new b(), new a.g());

    public c(Context context, i iVar) {
        super(context, f27869i, iVar, c.a.f25831b);
    }

    public final s8.i<Void> b(j jVar) {
        c.a aVar = new c.a();
        s7.c[] cVarArr = {d.f18596a};
        aVar.f5777c = cVarArr;
        aVar.f5776b = false;
        aVar.f5775a = new t(jVar);
        f fVar = new f(aVar, cVarArr, false, 0);
        s8.j jVar2 = new s8.j();
        b bVar = this.f25830h;
        v vVar = this.f25829g;
        bVar.getClass();
        com.google.android.gms.common.api.internal.h hVar = new com.google.android.gms.common.api.internal.h(2, fVar, jVar2, vVar);
        Handler handler = bVar.f5770v;
        handler.sendMessage(handler.obtainMessage(4, new w(hVar, bVar.f5765i.get(), this)));
        return jVar2.f25035a;
    }
}
