package e8;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class kw implements by {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15340a;

    /* renamed from: b  reason: collision with root package name */
    public String f15341b;

    public kw(String str, int i10) {
        this.f15340a = i10;
        if (i10 == 1) {
            this.f15341b = str;
        } else if (i10 == 2) {
            this.f15341b = str;
        } else if (i10 != 3) {
            this.f15341b = str;
        } else {
            this.f15341b = str;
        }
    }

    public final void a(Object obj) {
        switch (this.f15340a) {
            case 0:
                ((Bundle) obj).putString("ms", this.f15341b);
                return;
            case 1:
                Bundle bundle = (Bundle) obj;
                String str = this.f15341b;
                if (str != null) {
                    bundle.putString("omid_v", str);
                    return;
                }
                return;
            case 2:
                ((Bundle) obj).putString("request_id", this.f15341b);
                return;
            default:
                ((Bundle) obj).putString("rtb", this.f15341b);
                return;
        }
    }
}
