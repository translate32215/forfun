package e8;

import com.google.android.gms.internal.ads.j9;
import z6.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class uk implements j9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16962a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16963b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16964c;

    public uk(String str, String str2, int i10) {
        this.f16962a = i10;
        if (i10 != 1) {
            this.f16963b = str;
            this.f16964c = str2;
            return;
        }
        this.f16963b = str;
        this.f16964c = str2;
    }

    public final void F(Object obj) {
        switch (this.f16962a) {
            case 0:
                ((a) obj).a(this.f16963b, this.f16964c);
                return;
            default:
                ((il) obj).g(this.f16963b, this.f16964c);
                return;
        }
    }
}
