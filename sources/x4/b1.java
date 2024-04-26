package x4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.activity.f;
import java.util.Iterator;
import v6.e0;
import v6.p;
import x4.a1;

/* compiled from: StreamVolumeManager */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27441a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f27442b;

    /* renamed from: c  reason: collision with root package name */
    public final b f27443c;

    /* renamed from: d  reason: collision with root package name */
    public final AudioManager f27444d;

    /* renamed from: e  reason: collision with root package name */
    public c f27445e;

    /* renamed from: f  reason: collision with root package name */
    public int f27446f = 3;

    /* renamed from: g  reason: collision with root package name */
    public int f27447g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f27448h;

    /* compiled from: StreamVolumeManager */
    public interface b {
    }

    /* compiled from: StreamVolumeManager */
    public final class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f27449b = 0;

        public c(a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            b1 b1Var = b1.this;
            b1Var.f27442b.post(new f(b1Var));
        }
    }

    public b1(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f27441a = applicationContext;
        this.f27442b = handler;
        this.f27443c = bVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        v6.a.f(audioManager);
        this.f27444d = audioManager;
        this.f27447g = b(audioManager, 3);
        this.f27448h = a(audioManager, this.f27446f);
        c cVar = new c((a) null);
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f27445e = cVar;
        } catch (RuntimeException e10) {
            p.d("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static boolean a(AudioManager audioManager, int i10) {
        if (e0.f26436a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return b(audioManager, i10) == 0;
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            p.d("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public void c(int i10) {
        if (this.f27446f != i10) {
            this.f27446f = i10;
            d();
            a1.c cVar = (a1.c) this.f27443c;
            b5.a L = a1.L(a1.this.f27359m);
            if (!L.equals(a1.this.J)) {
                a1 a1Var = a1.this;
                a1Var.J = L;
                Iterator<b5.b> it = a1Var.f27355i.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        }
    }

    public final void d() {
        int b10 = b(this.f27444d, this.f27446f);
        boolean a10 = a(this.f27444d, this.f27446f);
        if (this.f27447g != b10 || this.f27448h != a10) {
            this.f27447g = b10;
            this.f27448h = a10;
            Iterator<b5.b> it = a1.this.f27355i.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }
}
