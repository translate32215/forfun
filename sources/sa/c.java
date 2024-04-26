package sa;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import la.k;
import la.r;
import ua.a;

/* compiled from: DefaultHeartBeatInfo */
public class c implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f25185b = 0;

    /* renamed from: a  reason: collision with root package name */
    public a<f> f25186a;

    public c(Context context, Set<d> set) {
        r rVar = new r(new k(context));
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), a.f25183a);
        this.f25186a = rVar;
    }

    public int a(String str) {
        boolean a10;
        long currentTimeMillis = System.currentTimeMillis();
        boolean a11 = this.f25186a.get().a(str, currentTimeMillis);
        f fVar = this.f25186a.get();
        synchronized (fVar) {
            a10 = fVar.a("fire-global", currentTimeMillis);
        }
        if (a11 && a10) {
            return 4;
        }
        if (a10) {
            return 3;
        }
        return a11 ? 2 : 1;
    }
}
