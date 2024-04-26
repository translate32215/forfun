package e8;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class lw implements by<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final li0 f15431a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15432b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15433c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15434d;

    /* renamed from: e  reason: collision with root package name */
    public final float f15435e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15436f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15437g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15438h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f15439i;

    public lw(li0 li0, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        this.f15431a = li0;
        this.f15432b = str;
        this.f15433c = z10;
        this.f15434d = str2;
        this.f15435e = f10;
        this.f15436f = i10;
        this.f15437g = i11;
        this.f15438h = str3;
        this.f15439i = z11;
    }

    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f15431a.f15398e == -1) {
            bundle.putString("smart_w", "full");
        }
        if (this.f15431a.f15395b == -2) {
            bundle.putString("smart_h", "auto");
        }
        Boolean bool = Boolean.TRUE;
        jc0.c(bundle, "ene", bool, this.f15431a.f15403r);
        if (this.f15431a.f15406u) {
            bundle.putString("rafmt", "102");
        }
        if (this.f15431a.f15407v) {
            bundle.putString("rafmt", "103");
        }
        jc0.c(bundle, "inline_adaptive_slot", bool, this.f15439i);
        String str = this.f15432b;
        if (str != null) {
            bundle.putString("format", str);
        }
        if (this.f15433c) {
            bundle.putString("fluid", "height");
        }
        String str2 = this.f15434d;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("sz", str2);
        }
        bundle.putFloat("u_sd", this.f15435e);
        bundle.putInt("sw", this.f15436f);
        bundle.putInt("sh", this.f15437g);
        String str3 = this.f15438h;
        if (true ^ TextUtils.isEmpty(str3)) {
            bundle.putString("sc", str3);
        }
        ArrayList arrayList = new ArrayList();
        li0[] li0Arr = this.f15431a.f15400g;
        if (li0Arr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f15431a.f15395b);
            bundle2.putInt("width", this.f15431a.f15398e);
            bundle2.putBoolean("is_fluid_height", this.f15431a.f15402i);
            arrayList.add(bundle2);
        } else {
            for (li0 li0 : li0Arr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", li0.f15402i);
                bundle3.putInt("height", li0.f15395b);
                bundle3.putInt("width", li0.f15398e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
