package e8;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.f7;
import e7.e;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ea {

    /* renamed from: a  reason: collision with root package name */
    public final long f14382a = TimeUnit.MILLISECONDS.toNanos(((Long) ti0.f16763j.f16769f.a(t.f16662u)).longValue());

    /* renamed from: b  reason: collision with root package name */
    public long f14383b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14384c = true;

    public final void a(SurfaceTexture surfaceTexture, f7 f7Var) {
        if (f7Var != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f14384c || Math.abs(timestamp - this.f14383b) >= this.f14382a) {
                this.f14384c = false;
                this.f14383b = timestamp;
                p.f5702i.post(new e(f7Var));
            }
        }
    }
}
