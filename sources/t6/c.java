package t6;

import android.graphics.SurfaceTexture;

public final /* synthetic */ class c implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f25776a;

    public /* synthetic */ c(d dVar) {
        this.f25776a = dVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f25776a.f25777a.set(true);
    }
}
