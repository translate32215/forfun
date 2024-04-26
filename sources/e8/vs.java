package e8;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.zh;
import f7.j0;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vs {

    /* renamed from: a  reason: collision with root package name */
    public final us f17159a;

    /* renamed from: b  reason: collision with root package name */
    public final o50 f17160b;

    public vs(us usVar, o50 o50) {
        this.f17159a = usVar;
        this.f17160b = o50;
    }

    public final void a(gf<SQLiteDatabase, Void> gfVar) {
        o50 o50 = this.f17160b;
        us usVar = this.f17159a;
        usVar.getClass();
        p50 i10 = o50.i(new wy(usVar));
        g2 g2Var = new g2((gf) gfVar);
        i10.a(new j0((Future) i10, (zh) g2Var), this.f17160b);
    }
}
