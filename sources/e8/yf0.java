package e8;

import com.google.android.gms.internal.ads.j9;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yf0 implements j9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17626a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17627b;

    public yf0(boolean z10, int i10) {
        this.f17626a = i10;
        if (i10 != 2) {
            this.f17627b = z10;
        } else {
            this.f17627b = z10;
        }
    }

    public void F(Object obj) {
        switch (this.f17626a) {
            case 1:
                ((al) obj).v0(this.f17627b);
                return;
            default:
                ((al) obj).m(this.f17627b);
                return;
        }
    }

    public synchronized boolean a() {
        if (this.f17627b) {
            return false;
        }
        this.f17627b = true;
        notifyAll();
        return true;
    }

    public yf0() {
        this.f17626a = 0;
    }
}
