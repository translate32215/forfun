package e8;

import android.content.Context;
import b7.a;
import com.google.android.gms.internal.ads.d7;
import java.io.IOException;
import l0.e;
import s7.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class s8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d7 f16380b;

    public s8(Context context, d7 d7Var) {
        this.f16379a = context;
        this.f16380b = d7Var;
    }

    public final void run() {
        try {
            this.f16380b.b(a.a(this.f16379a));
        } catch (IOException | IllegalStateException | f e10) {
            this.f16380b.c(e10);
            e.C("Exception while getting advertising Id info", e10);
        }
    }
}
