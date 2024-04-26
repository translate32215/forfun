package e8;

import ab.q;
import ab.x;
import ab.z;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.qe;
import com.google.android.gms.internal.ads.re;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.zh;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b;
import com.google.firebase.messaging.g;
import f7.j0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import va.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ku implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15331a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15332b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15333c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15334d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f15335e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f15336f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f15337g;

    public ku(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, c cVar, b bVar, q qVar) {
        this.f15332b = context;
        this.f15333c = scheduledExecutorService;
        this.f15334d = firebaseMessaging;
        this.f15335e = cVar;
        this.f15336f = bVar;
        this.f15337g = qVar;
    }

    public Object call() {
        z zVar;
        z zVar2 = null;
        switch (this.f15331a) {
            case 0:
                hu huVar = (hu) this.f15332b;
                huVar.getClass();
                jn jnVar = (jn) ((p50) this.f15333c).get();
                cp cpVar = (cp) ((p50) this.f15334d).get();
                kn a10 = huVar.f14943a.a(new j8((t00) this.f15335e, (qe) this.f15336f, (String) null), new g2(jnVar), new p9((JSONObject) this.f15337g, cpVar));
                pd pdVar = (pd) a10;
                qn a11 = se.a(pdVar.X0.f6359d);
                jn jnVar2 = (jn) pdVar.f15893a.f6511b;
                jc0.b(jnVar2, "Cannot return null from a non-@Nullable @Provides method");
                cp cpVar2 = (cp) pdVar.f15895b.f15881c;
                jc0.b(cpVar2, "Cannot return null from a non-@Nullable @Provides method");
                n4 n4Var = new n4(a11, jnVar2, cpVar2, ua0.a(pdVar.S0));
                if (((t0) n4Var.f15585b) != null) {
                    ((cp) n4Var.f15586c).a("/nativeAdCustomClick", n4Var);
                }
                dp dpVar = pdVar.U0.get();
                dpVar.getClass();
                ep epVar = cpVar.f14167a;
                ki kiVar = dpVar.f14316a;
                oj ojVar = dpVar.f14318c;
                uj ujVar = dpVar.f14319d;
                vk vkVar = dpVar.f14320e;
                dj djVar = dpVar.f14317b;
                djVar.getClass();
                fp fpVar = new fp(djVar);
                synchronized (epVar) {
                    epVar.f14495a = kiVar;
                    epVar.f14496b = ojVar;
                    epVar.f14497c = ujVar;
                    epVar.f14498d = vkVar;
                    epVar.f14499e = fpVar;
                }
                qe qeVar = dpVar.f14321f;
                re reVar = dpVar.f14322g;
                synchronized (cpVar) {
                    p50<t7> p50 = cpVar.f14178l;
                    if (p50 != null) {
                        gf0 gf0 = new gf0(qeVar, reVar);
                        p50.a(new j0((Future) p50, (zh) gf0), cpVar.f14172f);
                    }
                }
                xo xoVar = pdVar.W0.get();
                t7 o10 = jnVar.o();
                xoVar.getClass();
                if (o10 != null) {
                    xoVar.f17505c.K0(o10.getView());
                    xoVar.f17505c.J0(new zo(o10, 0), xoVar.f17503a);
                    xoVar.f17505c.J0(new yo(o10), xoVar.f17503a);
                    xoVar.f17505c.J0(xoVar.f17504b, xoVar.f17503a);
                    xoVar.f17504b.f14898a = o10;
                    o10.r("/trackActiveViewUnit", new l2(xoVar));
                    o10.r("/untrackActiveViewUnit", new n2(xoVar));
                }
                return a10.h();
            default:
                Context context = (Context) this.f15332b;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15333c;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f15334d;
                c cVar = (c) this.f15335e;
                b bVar = (b) this.f15336f;
                q qVar = (q) this.f15337g;
                int i10 = g.f9739k;
                synchronized (z.class) {
                    WeakReference<z> weakReference = z.f259d;
                    if (weakReference != null) {
                        zVar2 = (z) weakReference.get();
                    }
                    if (zVar2 == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                        zVar2 = new z(sharedPreferences, scheduledExecutorService);
                        synchronized (zVar2) {
                            zVar2.f261b = x.b(sharedPreferences, "topic_operation_queue", scheduledExecutorService);
                        }
                        z.f259d = new WeakReference<>(zVar2);
                    }
                    zVar = zVar2;
                }
                return new g(firebaseMessaging, cVar, bVar, zVar, qVar, context, scheduledExecutorService);
        }
    }

    public ku(hu huVar, p50 p50, p50 p502, t00 t00, qe qeVar, JSONObject jSONObject) {
        this.f15332b = huVar;
        this.f15333c = p50;
        this.f15334d = p502;
        this.f15335e = t00;
        this.f15336f = qeVar;
        this.f15337g = jSONObject;
    }
}
