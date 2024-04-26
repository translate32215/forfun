package x4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: AudioBecomingNoisyManager */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f27391a;

    /* renamed from: b  reason: collision with root package name */
    public final a f27392b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27393c;

    /* compiled from: AudioBecomingNoisyManager */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final C0277b f27394a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f27395b;

        public a(Handler handler, C0277b bVar) {
            this.f27395b = handler;
            this.f27394a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f27395b.post(this);
            }
        }

        public void run() {
            if (b.this.f27393c) {
                a1.this.X(false, -1, 3);
            }
        }
    }

    /* renamed from: x4.b$b  reason: collision with other inner class name */
    /* compiled from: AudioBecomingNoisyManager */
    public interface C0277b {
    }

    public b(Context context, Handler handler, C0277b bVar) {
        this.f27391a = context.getApplicationContext();
        this.f27392b = new a(handler, bVar);
    }

    public void a(boolean z10) {
        if (z10 && !this.f27393c) {
            this.f27391a.registerReceiver(this.f27392b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f27393c = true;
        } else if (!z10 && this.f27393c) {
            this.f27391a.unregisterReceiver(this.f27392b);
            this.f27393c = false;
        }
    }
}
