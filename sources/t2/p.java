package t2;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.media.a;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.adcolony.sdk.f;
import com.adcolony.sdk.g;
import com.adcolony.sdk.h;
import com.adcolony.sdk.k0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import mb.d;
import org.json.JSONObject;

public class p implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f25546a;

    public p(h hVar) {
        this.f25546a = hVar;
    }

    public void a(g gVar) {
        Context context;
        if (this.f25546a.b(gVar)) {
            h hVar = this.f25546a;
            hVar.getClass();
            int optInt = gVar.f4485b.optInt("id");
            k0 k0Var = new k0(hVar.G, gVar, optInt, hVar);
            JSONObject jSONObject = k0Var.M.f4485b;
            k0Var.L = jSONObject.optString("ad_session_id");
            k0Var.f4587i = jSONObject.optInt("x");
            k0Var.f4588r = jSONObject.optInt("y");
            k0Var.f4589s = jSONObject.optInt("width");
            k0Var.f4590t = jSONObject.optInt("height");
            k0Var.H = jSONObject.optBoolean("enable_timer");
            k0Var.J = jSONObject.optBoolean("enable_progress");
            k0Var.K = jSONObject.optString("filepath");
            k0Var.f4592v = jSONObject.optInt("video_width");
            k0Var.f4593w = jSONObject.optInt("video_height");
            k0Var.f4582d = f.d().i().f();
            StringBuilder a10 = a.a("Original video dimensions = ");
            a10.append(k0Var.f4592v);
            a10.append("x");
            a10.append(k0Var.f4593w);
            p.f.a(0, 3, a10.toString(), true);
            k0Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(k0Var.f4589s, k0Var.f4590t);
            layoutParams.setMargins(k0Var.f4587i, k0Var.f4588r, 0, 0);
            layoutParams.gravity = 0;
            k0Var.N.addView(k0Var, layoutParams);
            if (k0Var.J && (context = f.f4478a) != null) {
                ProgressBar progressBar = new ProgressBar(context);
                k0Var.R = progressBar;
                h hVar2 = k0Var.N;
                int i10 = (int) (k0Var.f4582d * 100.0f);
                hVar2.addView(progressBar, new FrameLayout.LayoutParams(i10, i10, 17));
            }
            k0Var.S = new MediaPlayer();
            k0Var.E = false;
            try {
                if (!k0Var.K.startsWith("http")) {
                    k0Var.S.setDataSource(new FileInputStream(k0Var.K).getFD());
                } else {
                    k0Var.G = true;
                    k0Var.S.setDataSource(k0Var.K);
                }
                k0Var.S.setOnErrorListener(k0Var);
                k0Var.S.setOnPreparedListener(k0Var);
                k0Var.S.setOnCompletionListener(k0Var);
                k0Var.S.prepareAsync();
            } catch (IOException e10) {
                StringBuilder a11 = a.a("Failed to create/prepare MediaPlayer: ");
                a11.append(e10.toString());
                f.d().l().e(0, 0, a11.toString(), false);
                k0Var.b();
            }
            ArrayList<f0> arrayList = k0Var.N.A;
            g1 g1Var = new g1(k0Var);
            f.a("VideoView.play", g1Var);
            arrayList.add(g1Var);
            ArrayList<f0> arrayList2 = k0Var.N.A;
            h1 h1Var = new h1(k0Var);
            f.a("VideoView.set_bounds", h1Var);
            arrayList2.add(h1Var);
            ArrayList<f0> arrayList3 = k0Var.N.A;
            i1 i1Var = new i1(k0Var);
            f.a("VideoView.set_visible", i1Var);
            arrayList3.add(i1Var);
            ArrayList<f0> arrayList4 = k0Var.N.A;
            j1 j1Var = new j1(k0Var);
            f.a("VideoView.pause", j1Var);
            arrayList4.add(j1Var);
            ArrayList<f0> arrayList5 = k0Var.N.A;
            k1 k1Var = new k1(k0Var);
            f.a("VideoView.seek_to_time", k1Var);
            arrayList5.add(k1Var);
            ArrayList<f0> arrayList6 = k0Var.N.A;
            l1 l1Var = new l1(k0Var);
            f.a("VideoView.set_volume", l1Var);
            arrayList6.add(l1Var);
            k0Var.N.B.add("VideoView.play");
            k0Var.N.B.add("VideoView.set_bounds");
            k0Var.N.B.add("VideoView.set_visible");
            k0Var.N.B.add("VideoView.pause");
            k0Var.N.B.add("VideoView.seek_to_time");
            k0Var.N.B.add("VideoView.set_volume");
            hVar.f4503a.put(Integer.valueOf(optInt), k0Var);
            hVar.f4509g.put(Integer.valueOf(optInt), k0Var);
            d dVar = d.OTHER;
            mb.a aVar = hVar.F;
            if (aVar != null) {
                try {
                    aVar.a(k0Var, dVar, (String) null);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
