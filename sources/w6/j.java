package w6;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* compiled from: VideoDecoderGLSurfaceView */
public class j extends GLSurfaceView {

    /* renamed from: a  reason: collision with root package name */
    public final i f27098a;

    public j(Context context) {
        super(context, (AttributeSet) null);
        i iVar = new i(this);
        this.f27098a = iVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(iVar);
        setRenderMode(0);
    }

    public l getVideoDecoderOutputBufferRenderer() {
        return this.f27098a;
    }
}
