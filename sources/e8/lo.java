package e8;

import android.view.View;
import com.google.android.gms.internal.ads.pz;
import com.google.android.gms.internal.ads.t;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.ads.u;
import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.w7;
import com.google.android.gms.internal.ads.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class lo implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final p50 f15411a;

    /* renamed from: b  reason: collision with root package name */
    public final p50 f15412b;

    /* renamed from: c  reason: collision with root package name */
    public final p50 f15413c;

    /* renamed from: d  reason: collision with root package name */
    public final p50 f15414d;

    /* renamed from: e  reason: collision with root package name */
    public final p50 f15415e;

    /* renamed from: f  reason: collision with root package name */
    public final JSONObject f15416f;

    /* renamed from: g  reason: collision with root package name */
    public final p50 f15417g;

    /* renamed from: h  reason: collision with root package name */
    public final p50 f15418h;

    /* renamed from: i  reason: collision with root package name */
    public final p50 f15419i;

    public lo(ko koVar, p50 p50, p50 p502, p50 p503, p50 p504, p50 p505, JSONObject jSONObject, p50 p506, p50 p507, p50 p508) {
        this.f15411a = p50;
        this.f15412b = p502;
        this.f15413c = p503;
        this.f15414d = p504;
        this.f15415e = p505;
        this.f15416f = jSONObject;
        this.f15417g = p506;
        this.f15418h = p507;
        this.f15419i = p508;
    }

    public final Object call() {
        ug<Object> ugVar;
        JSONObject optJSONObject;
        p50 p50 = this.f15411a;
        p50 p502 = this.f15412b;
        p50 p503 = this.f15413c;
        p50 p504 = this.f15414d;
        p50 p505 = this.f15415e;
        JSONObject jSONObject = this.f15416f;
        p50 p506 = this.f15417g;
        p50 p507 = this.f15418h;
        p50 p508 = this.f15419i;
        jn jnVar = (jn) p50.get();
        List<?> list = (List) p502.get();
        synchronized (jnVar) {
            jnVar.f15160e = list;
        }
        z zVar = (z) p503.get();
        synchronized (jnVar) {
            jnVar.f15170o = zVar;
        }
        z zVar2 = (z) p504.get();
        synchronized (jnVar) {
            jnVar.f15171p = zVar2;
        }
        u uVar = (u) p505.get();
        synchronized (jnVar) {
            jnVar.f15158c = uVar;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null) {
            g50<Object> g50 = ug.f8246b;
            ugVar = x40.f17440e;
        } else {
            JSONArray optJSONArray = optJSONObject2.optJSONArray("reasons");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                g50<Object> g502 = ug.f8246b;
                ugVar = x40.f17440e;
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    pz e10 = no.e(optJSONArray.optJSONObject(i10));
                    if (e10 != null) {
                        arrayList.add(e10);
                    }
                }
                ugVar = ug.x(arrayList);
            }
        }
        synchronized (jnVar) {
            jnVar.f15161f = ugVar;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("mute");
        pz pzVar = null;
        if (!(optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("default_reason")) == null)) {
            pzVar = no.e(optJSONObject);
        }
        synchronized (jnVar) {
            jnVar.f15162g = pzVar;
        }
        t7 t7Var = (t7) p506.get();
        if (t7Var != null) {
            synchronized (jnVar) {
                jnVar.f15164i = t7Var;
            }
            View view = t7Var.getView();
            synchronized (jnVar) {
                jnVar.f15167l = view;
            }
            w7 o10 = t7Var.o();
            synchronized (jnVar) {
                jnVar.f15157b = o10;
            }
        }
        t7 t7Var2 = (t7) p507.get();
        if (t7Var2 != null) {
            synchronized (jnVar) {
                jnVar.f15165j = t7Var2;
            }
        }
        for (to toVar : (List) p508.get()) {
            int i11 = toVar.f16785a;
            if (i11 == 1) {
                jnVar.u(toVar.f16786b, toVar.f16787c);
            } else if (i11 != 2) {
                continue;
            } else {
                String str = toVar.f16786b;
                t tVar = toVar.f16788d;
                synchronized (jnVar) {
                    if (tVar == null) {
                        jnVar.f15173r.remove(str);
                    } else {
                        jnVar.f15173r.put(str, tVar);
                    }
                }
            }
        }
        return jnVar;
    }
}
