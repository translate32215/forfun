package e8;

import android.os.Bundle;
import android.os.RemoteException;
import c8.b;
import com.google.android.gms.internal.ads.a4;
import com.google.android.gms.internal.ads.ad;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.zc;
import java.util.List;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ux implements ph {

    /* renamed from: a  reason: collision with root package name */
    public final tx f17001a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17002b;

    /* renamed from: c  reason: collision with root package name */
    public final List f17003c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f17004d;

    public ux(tx txVar, String str, List list, Bundle bundle) {
        this.f17001a = txVar;
        this.f17002b = str;
        this.f17003c = list;
        this.f17004d = bundle;
    }

    public final p50 a() {
        tx txVar = this.f17001a;
        String str = this.f17002b;
        List list = this.f17003c;
        Bundle bundle = this.f17004d;
        txVar.getClass();
        d7 d7Var = new d7();
        zc zcVar = txVar.f16822f;
        zcVar.getClass();
        try {
            zcVar.f8694a.put(str, zcVar.f8695b.c(str));
        } catch (RemoteException e10) {
            e.C("Couldn't create RTB adapter : ", e10);
        }
        a4 a10 = txVar.f16822f.a(str);
        a10.getClass();
        a10.i2(new b(txVar.f16820d), txVar.f16823g, bundle, (Bundle) list.get(0), txVar.f16821e.f17191e, new ad(str, a10, d7Var));
        return d7Var;
    }
}
