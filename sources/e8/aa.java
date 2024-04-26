package e8;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;
import com.google.android.gms.internal.ads.f7;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class aa extends TextureView implements la {

    /* renamed from: a  reason: collision with root package name */
    public final ea f13668a = new ea();

    /* renamed from: b  reason: collision with root package name */
    public final ma f13669b;

    public aa(Context context) {
        super(context);
        this.f13669b = new ma(context, this);
    }

    public abstract void a();

    public abstract void e();

    public abstract void g();

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract long getTotalBytes();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void h(int i10);

    public abstract void i();

    public abstract void j(float f10, float f11);

    public abstract void k(f7 f7Var);

    public abstract String l();

    public abstract long m();

    public abstract int n();

    public void o(String str, String[] strArr) {
        setVideoPath(str);
    }

    public void p(int i10) {
    }

    public void q(int i10) {
    }

    public void r(int i10) {
    }

    public void s(int i10) {
    }

    public abstract void setVideoPath(String str);

    public void t(int i10) {
    }

    public abstract long u();
}
