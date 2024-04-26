package e8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.t;
import com.google.android.gms.internal.ads.td;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import l0.e;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class m7 implements mg {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15466a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15467b;

    public m7(j7 j7Var) {
        this.f15467b = j7Var;
    }

    public final Object apply(Object obj) {
        boolean z10;
        String str;
        String str2;
        int i10;
        int i11;
        float f10;
        int i12;
        DisplayMetrics displayMetrics;
        switch (this.f15466a) {
            case 0:
                j7 j7Var = (j7) this.f15467b;
                JSONObject jSONObject = (JSONObject) obj;
                Context context = j7Var.f15095b;
                l<String> lVar = t.f16542a;
                s sVar = ti0.f16763j.f16768e;
                SharedPreferences.Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
                for (l next : ti0.f16763j.f16767d.f16217a) {
                    if (next.f15345a == 1) {
                        next.f(edit, next.i(jSONObject));
                    }
                }
                if (jSONObject != null) {
                    edit.putString("flag_configuration", jSONObject.toString());
                } else {
                    e.I("Flag Json is null.");
                }
                s sVar2 = ti0.f16763j.f16768e;
                edit.commit();
                j7Var.f15096c.edit().putLong("js_last_update", l.B.f13193j.b()).apply();
                return null;
            case 1:
                return new to((String) this.f15467b, (t) obj);
            case 2:
                fw fwVar = (fw) this.f15467b;
                td tdVar = (td) obj;
                li0 li0 = ((w00) fwVar.f14688d).f17191e;
                li0[] li0Arr = li0.f15400g;
                if (li0Arr == null) {
                    str = li0.f15394a;
                    z10 = li0.f15402i;
                } else {
                    int length = li0Arr.length;
                    String str3 = null;
                    int i13 = 0;
                    boolean z11 = false;
                    boolean z12 = false;
                    boolean z13 = false;
                    while (i13 < length) {
                        li0 li02 = li0Arr[i13];
                        boolean z14 = li02.f15402i;
                        if (!z14 && !z11) {
                            str3 = li02.f15394a;
                            z11 = true;
                        }
                        if (z14 && !z12) {
                            z12 = true;
                            z13 = true;
                        }
                        if (!z11 || !z12) {
                            i13++;
                        } else {
                            str = str3;
                            z10 = z13;
                        }
                    }
                    str = str3;
                    z10 = z13;
                }
                Resources resources = ((Context) fwVar.f14687c).getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    str2 = null;
                    f10 = 0.0f;
                    i11 = 0;
                    i10 = 0;
                } else {
                    float f11 = displayMetrics.density;
                    int i14 = displayMetrics.widthPixels;
                    i10 = displayMetrics.heightPixels;
                    i11 = i14;
                    str2 = ((o) ((y6) fwVar.f14689e).f()).A();
                    f10 = f11;
                }
                StringBuilder sb2 = new StringBuilder();
                li0[] li0Arr2 = li0.f15400g;
                if (li0Arr2 != null) {
                    boolean z15 = false;
                    for (li0 li03 : li0Arr2) {
                        if (li03.f15402i) {
                            z15 = true;
                        } else {
                            if (sb2.length() != 0) {
                                sb2.append("|");
                            }
                            int i15 = li03.f15398e;
                            if (i15 == -1 && f10 != 0.0f) {
                                i15 = (int) (((float) li03.f15399f) / f10);
                            }
                            sb2.append(i15);
                            sb2.append("x");
                            int i16 = li03.f15395b;
                            if (i16 == -2) {
                                if (f10 != 0.0f) {
                                    i16 = (int) (((float) li03.f15396c) / f10);
                                }
                            }
                            sb2.append(i16);
                        }
                    }
                    if (z15) {
                        if (sb2.length() != 0) {
                            i12 = 0;
                            sb2.insert(0, "|");
                        } else {
                            i12 = 0;
                        }
                        sb2.insert(i12, "320x50");
                    }
                }
                return new lw(li0, str, z10, sb2.toString(), f10, i11, i10, str2, ((w00) fwVar.f14688d).f17202p);
            default:
                y6 y6Var = ((sy) this.f15467b).f16538d;
                a5.d(y6Var.f8584e, y6Var.f8585f).c((Exception) obj, "AttestationTokenSignal");
                return null;
        }
    }

    public m7(fw fwVar) {
        this.f15467b = fwVar;
    }

    public m7(sy syVar) {
        this.f15467b = syVar;
    }

    public m7(String str) {
        this.f15467b = str;
    }
}
