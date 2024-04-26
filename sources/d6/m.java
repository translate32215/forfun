package d6;

import com.google.android.gms.internal.ads.ee;
import com.google.android.gms.internal.ads.ky;

/* compiled from: UtcTimingElement */
public final class m implements ee {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13157a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13158b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13159c;

    public m(String str, String str2, int i10) {
        this.f13157a = i10;
        if (i10 != 1) {
            this.f13158b = str;
            this.f13159c = str2;
            return;
        }
        this.f13158b = str;
        this.f13159c = str2;
    }

    public void g(Object obj) {
        ((ky) obj).a(this.f13158b, this.f13159c);
    }

    public String toString() {
        switch (this.f13157a) {
            case 0:
                return this.f13158b + ", " + this.f13159c;
            default:
                return super.toString();
        }
    }
}
