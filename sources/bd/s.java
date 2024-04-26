package bd;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import com.startapp.startappsdk.R;
import gf.j0;
import gf.l;
import gf.o;
import gf.x;
import gf.z;
import jf.m;
import jf.n;
import jf.w;
import p000if.g;
import pc.l;
import ud.k;

/* compiled from: PkApp.kt */
public abstract class s extends l implements o {

    /* renamed from: h  reason: collision with root package name */
    public final z f3890h;

    /* compiled from: PkApp.kt */
    public static final class a extends ud.l implements td.l<l.f, kd.o> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s f3891b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(s sVar) {
            super(1);
            this.f3891b = sVar;
        }

        public Object c(Object obj) {
            l.f fVar = (l.f) obj;
            k.f(fVar, "$this$lazy");
            l.b.a.c(fVar, g.a(this.f3891b), false, 2, (Object) null);
            l.b.a.c(fVar, this.f3891b.f23982e, false, 2, (Object) null);
            fVar.e((Object) null, (Boolean) null).a(new w(fVar.b(), fVar.a(), j0.a(new r()), (n) null, true, b.f3884b));
            fVar.e((Object) null, (Boolean) null).a(new m(fVar.a(), j0.a(new m()), d.f3885b));
            fVar.e((Object) null, (Boolean) null).a(new m(fVar.a(), j0.a(new n()), f.f3886b));
            fVar.e((Object) null, (Boolean) null).a(new m(fVar.a(), j0.a(new o()), h.f3887b));
            fVar.e((Object) null, (Boolean) null).a(new m(fVar.a(), j0.a(new p()), j.f3888b));
            fVar.e((Object) null, (Boolean) null).a(new m(fVar.a(), j0.a(new q()), l.f3889b));
            return kd.o.f20627a;
        }
    }

    public s() {
        int i10 = gf.l.f18672m;
        a aVar = new a(this);
        k.g(aVar, "init");
        this.f3890h = new z(new gf.m(false, aVar));
    }

    public gf.l j() {
        return this.f3890h;
    }

    public void onCreate() {
        super.onCreate();
        k.f(this, "<set-?>");
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = getSystemService("notification");
            if (systemService != null) {
                NotificationChannel notificationChannel = new NotificationChannel(getString(R.string.notification_channel_id), getString(R.string.notification_channel_id), 4);
                notificationChannel.enableVibration(true);
                notificationChannel.setVibrationPattern(new long[]{1000, 1000});
                notificationChannel.enableLights(true);
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    public x w() {
        return null;
    }

    public gf.s<?> z() {
        return o.a.a();
    }
}
