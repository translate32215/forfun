package mb;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.google.android.material.datepicker.c;
import e8.bt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import ob.b;
import ob.e;
import ob.f;
import org.json.JSONObject;
import rb.a;
import sb.a;

public class h extends a {

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f21778k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    public final c f21779a;

    /* renamed from: b  reason: collision with root package name */
    public final bt f21780b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f21781c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public a f21782d;

    /* renamed from: e  reason: collision with root package name */
    public sb.a f21783e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21784f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21785g = false;

    /* renamed from: h  reason: collision with root package name */
    public String f21786h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21787i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f21788j;

    public h(bt btVar, c cVar) {
        sb.a aVar;
        this.f21780b = btVar;
        this.f21779a = cVar;
        this.f21786h = UUID.randomUUID().toString();
        this.f21782d = new a((View) null);
        b bVar = (b) cVar.f9155h;
        if (bVar == b.HTML || bVar == b.JAVASCRIPT) {
            aVar = new sb.b((WebView) cVar.f9149b);
        } else {
            aVar = new sb.c(Collections.unmodifiableMap((Map) cVar.f9151d), (String) cVar.f9152e);
        }
        this.f21783e = aVar;
        aVar.a();
        ob.a.f23656c.f23657a.add(this);
        sb.a aVar2 = this.f21783e;
        e eVar = e.f23667a;
        WebView f10 = aVar2.f();
        JSONObject jSONObject = new JSONObject();
        qb.a.d(jSONObject, "impressionOwner", (f) btVar.f14053a);
        qb.a.d(jSONObject, "mediaEventsOwner", (f) btVar.f14055c);
        qb.a.d(jSONObject, "creativeType", (c) btVar.f14056d);
        qb.a.d(jSONObject, "impressionType", (e) btVar.f14057e);
        qb.a.d(jSONObject, "isolateVerificationScripts", Boolean.valueOf(btVar.f14054b));
        eVar.b(f10, "init", jSONObject);
    }

    public void a(View view, d dVar, String str) {
        if (!this.f21785g && e(view) == null) {
            this.f21781c.add(new b(view, dVar, (String) null));
        }
    }

    public void c(View view) {
        if (!this.f21785g && f() != view) {
            this.f21782d = new a(view);
            sb.a aVar = this.f21783e;
            aVar.getClass();
            aVar.f25194e = System.nanoTime();
            aVar.f25193d = a.C0243a.AD_STATE_IDLE;
            Collection<h> a10 = ob.a.f23656c.a();
            if (a10 != null && a10.size() > 0) {
                for (h next : a10) {
                    if (next != this && next.f() == view) {
                        next.f21782d.clear();
                    }
                }
            }
        }
    }

    public void d() {
        if (!this.f21784f) {
            this.f21784f = true;
            ob.a aVar = ob.a.f23656c;
            boolean c10 = aVar.c();
            aVar.f23658b.add(this);
            if (!c10) {
                f a10 = f.a();
                a10.getClass();
                for (h hVar : ob.a.f23656c.a()) {
                    sb.a aVar2 = hVar.f21783e;
                    if (aVar2.f25190a.get() != null) {
                        e.f23667a.b(aVar2.f(), "setState", "foregrounded");
                    }
                }
                tb.a.f25861g.getClass();
                if (tb.a.f25863i == null) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    tb.a.f25863i = handler;
                    handler.post(tb.a.f25864j);
                    tb.a.f25863i.postDelayed(tb.a.f25865k, 200);
                }
                lb.b bVar = a10.f23672d;
                bVar.f21245e = bVar.a();
                bVar.b();
                bVar.f21241a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, bVar);
            }
            this.f21783e.b(f.a().f23669a);
            this.f21783e.c(this, this.f21779a);
        }
    }

    public final b e(View view) {
        for (b next : this.f21781c) {
            if (next.f23659a.get() == view) {
                return next;
            }
        }
        return null;
    }

    public View f() {
        return (View) this.f21782d.get();
    }

    public boolean g() {
        return this.f21784f && !this.f21785g;
    }
}
