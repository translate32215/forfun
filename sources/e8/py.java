package e8;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.yh;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class py implements dy<ny> {

    /* renamed from: a  reason: collision with root package name */
    public final r8 f16035a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f16036b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16037c;

    /* renamed from: d  reason: collision with root package name */
    public final PackageInfo f16038d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16039e;

    public py(r8 r8Var, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.f16035a = r8Var;
        this.f16036b = executor;
        this.f16037c = str;
        this.f16038d = packageInfo;
        this.f16039e = i10;
    }

    public final p50<ny> b() {
        return yh.k(yh.i(this.f16035a.a(this.f16037c, this.f16038d, this.f16039e), oy.f15856a, this.f16036b), Throwable.class, new w3(this), this.f16036b);
    }
}
