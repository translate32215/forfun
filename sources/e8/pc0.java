package e8;

import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zs;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pc0 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AudioTrack f15891a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zs f15892b;

    public pc0(zs zsVar, AudioTrack audioTrack) {
        this.f15892b = zsVar;
        this.f15891a = audioTrack;
    }

    public final void run() {
        try {
            this.f15891a.flush();
            this.f15891a.release();
        } finally {
            this.f15892b.f8737e.open();
        }
    }
}
