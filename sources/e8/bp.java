package e8;

import android.content.ContentResolver;
import android.provider.Settings;
import android.view.View;
import b7.a;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.pe;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.t7;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class bp implements mg {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14047a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14048b;

    public bp(jf jfVar) {
        this.f14048b = jfVar;
    }

    public final Object apply(Object obj) {
        String str;
        switch (this.f14047a) {
            case 0:
                cp cpVar = (cp) this.f14048b;
                t7 t7Var = (t7) obj;
                t7Var.r("/result", cpVar.f14175i);
                uc H = t7Var.H();
                ep epVar = cpVar.f14167a;
                ((s7) H).v((wh0) null, epVar, epVar, epVar, epVar, false, (h3) null, new a(cpVar.f14169c, (h8) null), (g2) null, (h8) null, cpVar.f14176j, cpVar.f14177k, cpVar.f14170d, cpVar.f14171e);
                return t7Var;
            case 1:
                vd vdVar = (vd) ((jf) this.f14048b);
                zg zgVar = new zg(kh.c(vdVar.f17063a), jh.b(vdVar.f17063a), vdVar.f17089n.get(), vdVar.f17068c0.get(), vdVar.D0.f17276e.f7039m, new ii(jh.b(vdVar.f17063a), jh.d(vdVar.f17063a), vdVar.D0.R0.get()), vdVar.f17091o.get());
                View view = vdVar.f17065b.f15032a;
                jc0.b(view, "Cannot return null from a non-@Nullable @Provides method");
                Cif ifVar = vdVar.f17065b;
                t7 t7Var2 = ifVar.f15033b;
                pe peVar = ifVar.f15034c;
                jc0.b(peVar, "Cannot return null from a non-@Nullable @Provides method");
                Cif ifVar2 = vdVar.f17065b;
                return new qf(zgVar, view, t7Var2, peVar, ifVar2.f15035d, ifVar2.f15036e, ifVar2.f15037f, new j8(vdVar.D0.Y1.M.get(), kh.c(vdVar.f17063a), vdVar.D0.Y1.f15634n.get()));
            case 2:
                return ((cg) this.f14048b).h();
            case 3:
                Throwable th = (Throwable) obj;
                String valueOf = String.valueOf((String) this.f14048b);
                e.I(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                return null;
            case 4:
                my myVar = (my) this.f14048b;
                Throwable th2 = (Throwable) obj;
                myVar.getClass();
                y8 y8Var = ti0.f16763j.f16764a;
                ContentResolver contentResolver = myVar.f15562b.getContentResolver();
                if (contentResolver == null) {
                    str = null;
                } else {
                    str = Settings.Secure.getString(contentResolver, "android_id");
                }
                return new ky((a.C0050a) null, str);
            default:
                s10 s10 = (s10) this.f14048b;
                s10.f16366c = (ah) obj;
                return s10;
        }
    }

    public bp(cg cgVar) {
        this.f14048b = cgVar;
    }

    public bp(cp cpVar) {
        this.f14048b = cpVar;
    }

    public bp(my myVar) {
        this.f14048b = myVar;
    }

    public bp(s10 s10) {
        this.f14048b = s10;
    }

    public bp(String str) {
        this.f14048b = str;
    }
}
