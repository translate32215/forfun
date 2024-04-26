package e8;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ng0 {

    /* renamed from: a  reason: collision with root package name */
    public final mg0 f15678a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15679b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15680c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15681d;

    /* renamed from: e  reason: collision with root package name */
    public long f15682e;

    /* renamed from: f  reason: collision with root package name */
    public long f15683f;

    /* renamed from: g  reason: collision with root package name */
    public long f15684g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15685h;

    /* renamed from: i  reason: collision with root package name */
    public long f15686i;

    /* renamed from: j  reason: collision with root package name */
    public long f15687j;

    /* renamed from: k  reason: collision with root package name */
    public long f15688k;

    public ng0(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        double refreshRate = windowManager.getDefaultDisplay() != null ? (double) windowManager.getDefaultDisplay().getRefreshRate() : -1.0d;
        boolean z10 = refreshRate != -1.0d;
        this.f15679b = z10;
        if (z10) {
            this.f15678a = mg0.f15507e;
            long j10 = (long) (1.0E9d / refreshRate);
            this.f15680c = j10;
            this.f15681d = (j10 * 80) / 100;
            return;
        }
        this.f15678a = null;
        this.f15680c = -1;
        this.f15681d = -1;
    }

    public final boolean a(long j10, long j11) {
        return Math.abs((j11 - this.f15686i) - (j10 - this.f15687j)) > 20000000;
    }
}
