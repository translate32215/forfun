package v7;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.x;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import y7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class d0 implements ServiceConnection, f0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f26557a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f26558b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26559c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f26560d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f26561e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f26562f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ x f26563g;

    public d0(x xVar, c0 c0Var) {
        this.f26563g = xVar;
        this.f26561e = c0Var;
    }

    public final void a(String str, Executor executor) {
        this.f26558b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            x xVar = this.f26563g;
            a aVar = xVar.f5895g;
            Context context = xVar.f5893e;
            boolean d10 = aVar.d(context, str, this.f26561e.a(context), this, this.f26561e.f26555c, true, executor);
            this.f26559c = d10;
            if (d10) {
                this.f26563g.f5894f.sendMessageDelayed(this.f26563g.f5894f.obtainMessage(1, this.f26561e), this.f26563g.f5897i);
            } else {
                this.f26558b = 2;
                try {
                    x xVar2 = this.f26563g;
                    xVar2.f5895g.c(xVar2.f5893e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f26563g.f5892d) {
            this.f26563g.f5894f.removeMessages(1, this.f26561e);
            this.f26560d = iBinder;
            this.f26562f = componentName;
            for (ServiceConnection onServiceConnected : this.f26557a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f26558b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f26563g.f5892d) {
            this.f26563g.f5894f.removeMessages(1, this.f26561e);
            this.f26560d = null;
            this.f26562f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f26557a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f26558b = 2;
        }
    }
}
