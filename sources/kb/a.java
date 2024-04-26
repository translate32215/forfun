package kb;

import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;
import e.d;
import lb.b;
import ob.c;
import ob.f;
import z3.g;
import z3.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static c f20579a = new c();

    public static void a(Context context) {
        c cVar = f20579a;
        Context applicationContext = context.getApplicationContext();
        d.a(applicationContext, "Application Context cannot be null");
        if (!cVar.f20581a) {
            cVar.f20581a = true;
            f a10 = f.a();
            a10.f23671c.getClass();
            g gVar = new g(4);
            i iVar = a10.f23670b;
            Handler handler = new Handler();
            iVar.getClass();
            a10.f23672d = new b(handler, applicationContext, gVar, a10);
            applicationContext.getApplicationContext();
            WindowManager windowManager = qb.a.f24260a;
            qb.a.f24262c = applicationContext.getResources().getDisplayMetrics().density;
            qb.a.f24260a = (WindowManager) applicationContext.getSystemService("window");
            c.f23663b.f23664a = applicationContext.getApplicationContext();
        }
    }
}
