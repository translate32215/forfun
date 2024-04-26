package r7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.o;
import e.g;
import e7.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import o1.p;
import s.i;
import s8.j;
import s8.t;
import s8.z;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public class d {

    /* renamed from: h  reason: collision with root package name */
    public static int f24687h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f24688i;

    /* renamed from: j  reason: collision with root package name */
    public static final Executor f24689j = v.f24734a;
    @GuardedBy("responseCallbacks")

    /* renamed from: a  reason: collision with root package name */
    public final i<String, j<Bundle>> f24690a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f24691b;

    /* renamed from: c  reason: collision with root package name */
    public final q f24692c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f24693d;

    /* renamed from: e  reason: collision with root package name */
    public Messenger f24694e;

    /* renamed from: f  reason: collision with root package name */
    public Messenger f24695f;

    /* renamed from: g  reason: collision with root package name */
    public e f24696g;

    public d(Context context) {
        this.f24691b = context;
        this.f24692c = new q(context);
        this.f24694e = new Messenger(new u(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f24693d = scheduledThreadPoolExecutor;
    }

    public final void a(String str, Bundle bundle) {
        synchronized (this.f24690a) {
            j remove = this.f24690a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.f25035a.p(bundle);
        }
    }

    public final s8.i<Bundle> b(Bundle bundle) {
        String num;
        Class<d> cls = d.class;
        synchronized (cls) {
            int i10 = f24687h;
            f24687h = i10 + 1;
            num = Integer.toString(i10);
        }
        j jVar = new j();
        synchronized (this.f24690a) {
            this.f24690a.put(num, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f24692c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f24691b;
        synchronized (cls) {
            if (f24688i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f24688i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f24688i);
        }
        intent.putExtra("kid", g.a(o.a(num, 5), "|ID|", num, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f24694e);
        if (!(this.f24695f == null && this.f24696g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f24695f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f24696g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            ScheduledFuture<?> schedule = this.f24693d.schedule(new e(jVar), 30, TimeUnit.SECONDS);
            z<TResult> zVar = jVar.f25035a;
            zVar.f25071b.a(new t(v.f24734a, new p(this, num, (ScheduledFuture) schedule)));
            zVar.s();
            return jVar.f25035a;
        }
        if (this.f24692c.a() == 2) {
            this.f24691b.sendBroadcast(intent);
        } else {
            this.f24691b.startService(intent);
        }
        ScheduledFuture<?> schedule2 = this.f24693d.schedule(new e(jVar), 30, TimeUnit.SECONDS);
        z<TResult> zVar2 = jVar.f25035a;
        zVar2.f25071b.a(new t(v.f24734a, new p(this, num, (ScheduledFuture) schedule2)));
        zVar2.s();
        return jVar.f25035a;
    }
}
