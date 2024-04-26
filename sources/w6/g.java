package w6;

import android.view.Surface;
import p5.j;
import p5.k;

/* compiled from: MediaCodecVideoDecoderException */
public class g extends j {
    public g(Throwable th, k kVar, Surface surface) {
        super(th, kVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
