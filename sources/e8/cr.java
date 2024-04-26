package e8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.l5;
import com.google.firebase.messaging.a;
import com.google.firebase.messaging.d;
import com.google.firebase.messaging.h;
import f7.j;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import k8.f8;
import o8.q3;
import o8.t5;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class cr implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14180a = 3;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14181b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14182c;

    public cr(Context context, Intent intent) {
        this.f14181b = context;
        this.f14182c = intent;
    }

    public Object call() {
        String str;
        int i10;
        ComponentName componentName;
        String str2;
        d7<InputStream> d7Var;
        switch (this.f14180a) {
            case 0:
                l5 l5Var = (l5) this.f14182c;
                nr nrVar = ((dr) this.f14181b).f14326c;
                synchronized (nrVar.f15834b) {
                    if (nrVar.f15835c) {
                        d7Var = nrVar.f15833a;
                    } else {
                        nrVar.f15835c = true;
                        nrVar.f15837e = l5Var;
                        nrVar.f15838f.n();
                        nrVar.f15833a.f6188a.a(new j(nrVar), h9.f14886f);
                        d7Var = nrVar.f15833a;
                    }
                }
                return d7Var.get((long) ((Integer) ti0.f16763j.f16769f.a(t.T2)).intValue(), TimeUnit.SECONDS);
            case 1:
                p50 p50 = (p50) this.f14182c;
                return new js((ns) ((p50) this.f14181b).get(), ((ks) p50.get()).f15327b, ((ks) p50.get()).f15326a);
            case 2:
                return new f8((Callable) new t5((q3) this.f14181b, (String) this.f14182c));
            default:
                Context context = (Context) this.f14181b;
                Intent intent = (Intent) this.f14182c;
                Object obj = a.f9712c;
                d a10 = d.a();
                a10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                a10.f9727d.offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (a10) {
                    str = a10.f9724a;
                    if (str == null) {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                        if (resolveService != null) {
                            ServiceInfo serviceInfo = resolveService.serviceInfo;
                            if (serviceInfo != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName)) {
                                    String str3 = serviceInfo.name;
                                    if (str3 != null) {
                                        if (str3.startsWith(".")) {
                                            String valueOf = String.valueOf(context.getPackageName());
                                            String valueOf2 = String.valueOf(serviceInfo.name);
                                            a10.f9724a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                                        } else {
                                            a10.f9724a = serviceInfo.name;
                                        }
                                        str = a10.f9724a;
                                    }
                                }
                                String str4 = serviceInfo.packageName;
                                String str5 = serviceInfo.name;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 94 + String.valueOf(str5).length());
                                sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                                sb2.append(str4);
                                sb2.append("/");
                                sb2.append(str5);
                                Log.e("FirebaseMessaging", sb2.toString());
                                str = null;
                            }
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        str = null;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        if (str.length() != 0) {
                            str2 = "Restricting intent to a specific service: ".concat(str);
                        } else {
                            str2 = new String("Restricting intent to a specific service: ");
                        }
                        Log.d("FirebaseMessaging", str2);
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (a10.c(context)) {
                        componentName = h.a(context, intent2);
                    } else {
                        componentName = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentName == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (SecurityException e10) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
                    i10 = 401;
                } catch (IllegalStateException e11) {
                    String valueOf3 = String.valueOf(e11);
                    StringBuilder sb3 = new StringBuilder(valueOf3.length() + 45);
                    sb3.append("Failed to start service while in background: ");
                    sb3.append(valueOf3);
                    Log.e("FirebaseMessaging", sb3.toString());
                    i10 = 402;
                }
                return Integer.valueOf(i10);
        }
    }

    public cr(dr drVar, l5 l5Var) {
        this.f14181b = drVar;
        this.f14182c = l5Var;
    }

    public cr(p50 p50, p50 p502) {
        this.f14181b = p50;
        this.f14182c = p502;
    }

    public /* synthetic */ cr(q3 q3Var, String str) {
        this.f14181b = q3Var;
        this.f14182c = str;
    }
}
