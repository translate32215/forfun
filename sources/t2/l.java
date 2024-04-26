package t2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.adcolony.sdk.AdColonyAdViewActivity;
import com.adcolony.sdk.AdColonyInterstitialActivity;
import com.adcolony.sdk.d;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import com.adcolony.sdk.j0;
import com.adcolony.sdk.k0;
import com.adcolony.sdk.o;
import com.adcolony.sdk.r;
import com.adcolony.sdk.r0;
import com.adcolony.sdk.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class l extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public h f25501a;

    /* renamed from: b  reason: collision with root package name */
    public int f25502b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f25503c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f25504d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25505e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25506f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25507g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25508h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f25509i;

    public class a implements f0 {
        public a() {
        }

        public void a(g gVar) {
            l.this.c(gVar);
        }
    }

    public void a() {
        int i10;
        o d10 = f.d();
        if (this.f25501a == null) {
            this.f25501a = d10.f4668l;
        }
        h hVar = this.f25501a;
        if (hVar != null) {
            hVar.E = false;
            if (j0.w()) {
                this.f25501a.E = true;
            }
            int h10 = d10.i().h();
            if (this.f25507g) {
                i10 = d10.i().g() - j0.s(f.f4478a);
            } else {
                i10 = d10.i().g();
            }
            if (h10 > 0 && i10 > 0) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                float f10 = d10.i().f();
                r0.j(jSONObject2, "width", (int) (((float) h10) / f10));
                r0.j(jSONObject2, "height", (int) (((float) i10) / f10));
                r0.j(jSONObject2, "app_orientation", j0.q(j0.t()));
                r0.j(jSONObject2, "x", 0);
                r0.j(jSONObject2, "y", 0);
                r0.e(jSONObject2, "ad_session_id", this.f25501a.f4514t);
                r0.j(jSONObject, "screen_width", h10);
                r0.j(jSONObject, "screen_height", i10);
                r0.e(jSONObject, "ad_session_id", this.f25501a.f4514t);
                r0.j(jSONObject, "id", this.f25501a.f4512r);
                this.f25501a.setLayoutParams(new FrameLayout.LayoutParams(h10, i10));
                h hVar2 = this.f25501a;
                hVar2.f4510h = h10;
                hVar2.f4511i = i10;
                new g("MRAID.on_size_change", hVar2.f4513s, jSONObject2).b();
                new g("AdContainer.on_orientation_change", this.f25501a.f4513s, jSONObject).b();
            }
        }
    }

    public void b(int i10) {
        if (i10 == 0) {
            setRequestedOrientation(7);
        } else if (i10 != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f25502b = i10;
    }

    public void c(g gVar) {
        int optInt = gVar.f4485b.optInt("status");
        if ((optInt == 5 || optInt == 0 || optInt == 6 || optInt == 1) && !this.f25504d) {
            o d10 = f.d();
            z j10 = d10.j();
            d10.f4673q = gVar;
            AlertDialog alertDialog = j10.f4828b;
            if (alertDialog != null) {
                alertDialog.dismiss();
                j10.f4828b = null;
            }
            if (!this.f25506f) {
                finish();
            }
            this.f25504d = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            d10.f4682z = false;
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "id", this.f25501a.f4514t);
            new g("AdSession.on_close", this.f25501a.f4513s, jSONObject).b();
            d10.f4668l = null;
            d10.f4670n = null;
            d10.f4669m = null;
            f.d().g().f4526b.remove(this.f25501a.f4514t);
        }
    }

    public void d(boolean z10) {
        Iterator<Map.Entry<Integer, k0>> it = this.f25501a.f4503a.entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            k0 k0Var = (k0) it.next().getValue();
            if (!k0Var.A && k0Var.S.isPlaying()) {
                k0Var.c();
            }
        }
        d dVar = f.d().f4670n;
        if (dVar != null && dVar.a()) {
            r rVar = dVar.f4464c;
            if (rVar.f4751a != null && z10 && this.f25508h) {
                rVar.c("pause", 0.0f);
            }
        }
    }

    public void e(boolean z10) {
        for (Map.Entry<Integer, k0> value : this.f25501a.f4503a.entrySet()) {
            k0 k0Var = (k0) value.getValue();
            if (!k0Var.A && !k0Var.S.isPlaying() && !f.d().j().f4829c) {
                k0Var.d();
            }
        }
        d dVar = f.d().f4670n;
        if (dVar != null && dVar.a()) {
            r rVar = dVar.f4464c;
            if (rVar.f4751a == null) {
                return;
            }
            if ((!z10 || !this.f25508h) && this.f25509i) {
                rVar.c("resume", 0.0f);
            }
        }
    }

    public void onBackPressed() {
        JSONObject jSONObject = new JSONObject();
        r0.e(jSONObject, "id", this.f25501a.f4514t);
        new g("AdSession.on_back_button", this.f25501a.f4513s, jSONObject).b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            a();
        } else {
            ((AdColonyAdViewActivity) this).f4408r.a();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!f.f() || f.d().f4668l == null) {
            finish();
            return;
        }
        o d10 = f.d();
        this.f25506f = false;
        h hVar = d10.f4668l;
        this.f25501a = hVar;
        hVar.E = false;
        if (j0.w()) {
            this.f25501a.E = true;
        }
        this.f25501a.getClass();
        this.f25503c = this.f25501a.f4513s;
        boolean optBoolean = ((JSONObject) d10.o().f23743d).optBoolean("multi_window_enabled");
        this.f25507g = optBoolean;
        if (optBoolean) {
            getWindow().addFlags(2048);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(-16777216);
        if (((JSONObject) d10.o().f23743d).optBoolean("keep_screen_on")) {
            getWindow().addFlags(128);
        }
        ViewParent parent = this.f25501a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f25501a);
        }
        setContentView(this.f25501a);
        ArrayList<f0> arrayList = this.f25501a.A;
        a aVar = new a();
        f.a("AdSession.finish_fullscreen_ad", aVar);
        arrayList.add(aVar);
        this.f25501a.B.add("AdSession.finish_fullscreen_ad");
        b(this.f25502b);
        if (!this.f25501a.D) {
            JSONObject jSONObject = new JSONObject();
            r0.e(jSONObject, "id", this.f25501a.f4514t);
            r0.j(jSONObject, "screen_width", this.f25501a.f4510h);
            r0.j(jSONObject, "screen_height", this.f25501a.f4511i);
            new g("AdSession.on_fullscreen_ad_started", this.f25501a.f4513s, jSONObject).b();
            this.f25501a.D = true;
            return;
        }
        a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (f.f() && this.f25501a != null && !this.f25504d) {
            if ((Build.VERSION.SDK_INT < 24 || !j0.w()) && !this.f25501a.E) {
                JSONObject jSONObject = new JSONObject();
                r0.e(jSONObject, "id", this.f25501a.f4514t);
                new g("AdSession.on_error", this.f25501a.f4513s, jSONObject).b();
                this.f25506f = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        d(this.f25505e);
        this.f25505e = false;
    }

    public void onResume() {
        super.onResume();
        a();
        e(this.f25505e);
        this.f25505e = true;
        this.f25509i = true;
    }

    public void onWindowFocusChanged(boolean z10) {
        if (z10 && this.f25505e) {
            f.d().p().b(true);
            e(this.f25505e);
            this.f25508h = true;
        } else if (!z10 && this.f25505e) {
            f.d().p().a(true);
            d(this.f25505e);
            this.f25508h = false;
        }
    }
}
