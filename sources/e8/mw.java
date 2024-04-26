package e8;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class mw implements by {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15557a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15558b;

    public mw(ArrayList arrayList, int i10) {
        this.f15557a = i10;
        if (i10 != 1) {
            this.f15558b = arrayList;
        } else {
            this.f15558b = arrayList;
        }
    }

    public final void a(Object obj) {
        switch (this.f15557a) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", this.f15558b);
                return;
            default:
                ((Bundle) obj).putStringArrayList("android_permissions", this.f15558b);
                return;
        }
    }
}
