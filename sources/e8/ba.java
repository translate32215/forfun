package e8;

import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.i7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class ba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13906a;

    /* renamed from: b  reason: collision with root package name */
    public i7 f13907b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13908c;

    public ba(i7 i7Var, boolean z10, int i10) {
        this.f13906a = i10;
        if (i10 != 1) {
            this.f13907b = i7Var;
            this.f13908c = z10;
            return;
        }
        this.f13907b = i7Var;
        this.f13908c = z10;
    }

    public void a() {
        this.f13908c = true;
        this.f13907b.e();
    }

    public void b() {
        this.f13908c = false;
        c();
    }

    public void c() {
        d40 d40 = p.f5702i;
        d40.removeCallbacks(this);
        d40.postDelayed(this, 250);
    }

    public final void run() {
        switch (this.f13906a) {
            case 0:
                i7 i7Var = this.f13907b;
                boolean z10 = this.f13908c;
                i7Var.getClass();
                i7Var.h("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
                return;
            case 1:
                this.f13907b.h("windowVisibilityChanged", "isVisible", String.valueOf(this.f13908c));
                return;
            default:
                if (!this.f13908c) {
                    this.f13907b.e();
                    c();
                    return;
                }
                return;
        }
    }

    public ba(i7 i7Var) {
        this.f13906a = 2;
        this.f13908c = false;
        this.f13907b = i7Var;
    }
}
