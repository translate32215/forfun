package tb;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import eb.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mb.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pb.a;
import tb.c;
import ub.e;
import ub.f;

public class a implements a.C0214a {

    /* renamed from: g  reason: collision with root package name */
    public static a f25861g = new a();

    /* renamed from: h  reason: collision with root package name */
    public static Handler f25862h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    public static Handler f25863i = null;

    /* renamed from: j  reason: collision with root package name */
    public static final Runnable f25864j = new c();

    /* renamed from: k  reason: collision with root package name */
    public static final Runnable f25865k = new d();

    /* renamed from: a  reason: collision with root package name */
    public List<b> f25866a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f25867b;

    /* renamed from: c  reason: collision with root package name */
    public g f25868c = new g();

    /* renamed from: d  reason: collision with root package name */
    public c f25869d = new c();

    /* renamed from: e  reason: collision with root package name */
    public d f25870e = new d(new ub.c());

    /* renamed from: f  reason: collision with root package name */
    public long f25871f;

    /* renamed from: tb.a$a  reason: collision with other inner class name */
    public interface C0253a extends b {
        void b(int i10, long j10);
    }

    public interface b {
        void a(int i10, long j10);
    }

    public static class c implements Runnable {
        public void run() {
            String str;
            a aVar = a.f25861g;
            aVar.f25867b = 0;
            aVar.f25871f = System.nanoTime();
            c cVar = aVar.f25869d;
            cVar.getClass();
            ob.a aVar2 = ob.a.f23656c;
            if (aVar2 != null) {
                for (h next : aVar2.b()) {
                    View f10 = next.f();
                    if (next.g()) {
                        String str2 = next.f21786h;
                        if (f10 != null) {
                            if (!f10.hasWindowFocus()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = f10;
                                while (true) {
                                    if (view == null) {
                                        cVar.f25876d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String a10 = qb.b.a(view);
                                    if (a10 != null) {
                                        str = a10;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            }
                            if (str == null) {
                                cVar.f25877e.add(str2);
                                cVar.f25873a.put(f10, str2);
                                for (ob.b next2 : next.f21781c) {
                                    View view2 = (View) next2.f23659a.get();
                                    if (view2 != null) {
                                        c.a aVar3 = cVar.f25874b.get(view2);
                                        if (aVar3 != null) {
                                            aVar3.f25882b.add(next.f21786h);
                                        } else {
                                            cVar.f25874b.put(view2, new c.a(next2, next.f21786h));
                                        }
                                    }
                                }
                            } else {
                                cVar.f25878f.add(str2);
                                cVar.f25875c.put(str2, f10);
                                cVar.f25879g.put(str2, str);
                            }
                        } else {
                            cVar.f25878f.add(str2);
                            cVar.f25879g.put(str2, "noAdView");
                        }
                    }
                }
            }
            long nanoTime = System.nanoTime();
            pb.b bVar = (pb.b) aVar.f25868c.f17832b;
            if (aVar.f25869d.f25878f.size() > 0) {
                Iterator<String> it = aVar.f25869d.f25878f.iterator();
                while (it.hasNext()) {
                    String next3 = it.next();
                    JSONObject a11 = bVar.a((View) null);
                    View view3 = aVar.f25869d.f25875c.get(next3);
                    pb.c cVar2 = (pb.c) aVar.f25868c.f17831a;
                    String str3 = aVar.f25869d.f25879g.get(next3);
                    if (str3 != null) {
                        JSONObject a12 = cVar2.a(view3);
                        WindowManager windowManager = qb.a.f24260a;
                        try {
                            a12.put("adSessionId", next3);
                        } catch (JSONException e10) {
                            e.a.a("Error with setting ad session id", e10);
                        }
                        try {
                            a12.put("notVisibleReason", str3);
                        } catch (JSONException e11) {
                            e.a.a("Error with setting not visible reason", e11);
                        }
                        qb.a.e(a11, a12);
                    }
                    qb.a.c(a11);
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(next3);
                    d dVar = aVar.f25870e;
                    dVar.f25884b.b(new e(dVar, hashSet2, a11, nanoTime));
                }
            }
            if (aVar.f25869d.f25877e.size() > 0) {
                JSONObject a13 = bVar.a((View) null);
                bVar.a((View) null, a13, aVar, true);
                qb.a.c(a13);
                d dVar2 = aVar.f25870e;
                dVar2.f25884b.b(new f(dVar2, aVar.f25869d.f25877e, a13, nanoTime));
            } else {
                d dVar3 = aVar.f25870e;
                dVar3.f25884b.b(new ub.d(dVar3));
            }
            c cVar3 = aVar.f25869d;
            cVar3.f25873a.clear();
            cVar3.f25874b.clear();
            cVar3.f25875c.clear();
            cVar3.f25876d.clear();
            cVar3.f25877e.clear();
            cVar3.f25878f.clear();
            cVar3.f25879g.clear();
            cVar3.f25880h = false;
            long nanoTime2 = System.nanoTime() - aVar.f25871f;
            if (aVar.f25866a.size() > 0) {
                for (b next4 : aVar.f25866a) {
                    next4.a(aVar.f25867b, TimeUnit.NANOSECONDS.toMillis(nanoTime2));
                    if (next4 instanceof C0253a) {
                        ((C0253a) next4).b(aVar.f25867b, nanoTime2);
                    }
                }
            }
        }
    }

    public static class d implements Runnable {
        public void run() {
            Handler handler = a.f25863i;
            if (handler != null) {
                handler.post(a.f25864j);
                a.f25863i.postDelayed(a.f25865k, 200);
            }
        }
    }

    public void a(View view, pb.a aVar, JSONObject jSONObject) {
        String str;
        boolean z10;
        e eVar = e.UNDERLYING_VIEW;
        e eVar2 = e.PARENT_VIEW;
        boolean z11 = false;
        if (qb.b.a(view) == null) {
            c cVar = this.f25869d;
            e eVar3 = cVar.f25876d.contains(view) ? eVar2 : cVar.f25880h ? e.OBSTRUCTION_VIEW : eVar;
            if (eVar3 != eVar) {
                JSONObject a10 = aVar.a(view);
                qb.a.e(jSONObject, a10);
                c cVar2 = this.f25869d;
                if (cVar2.f25873a.size() == 0) {
                    str = null;
                } else {
                    String str2 = cVar2.f25873a.get(view);
                    if (str2 != null) {
                        cVar2.f25873a.remove(view);
                    }
                    str = str2;
                }
                if (str != null) {
                    WindowManager windowManager = qb.a.f24260a;
                    try {
                        a10.put("adSessionId", str);
                    } catch (JSONException e10) {
                        e.a.a("Error with setting ad session id", e10);
                    }
                    this.f25869d.f25880h = true;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    c cVar3 = this.f25869d;
                    c.a aVar2 = cVar3.f25874b.get(view);
                    if (aVar2 != null) {
                        cVar3.f25874b.remove(view);
                    }
                    if (aVar2 != null) {
                        WindowManager windowManager2 = qb.a.f24260a;
                        ob.b bVar = aVar2.f25881a;
                        JSONArray jSONArray = new JSONArray();
                        for (String put : aVar2.f25882b) {
                            jSONArray.put(put);
                        }
                        try {
                            a10.put("isFriendlyObstructionFor", jSONArray);
                            a10.put("friendlyObstructionClass", bVar.f23660b);
                            a10.put("friendlyObstructionPurpose", bVar.f23661c);
                            a10.put("friendlyObstructionReason", bVar.f23662d);
                        } catch (JSONException e11) {
                            e.a.a("Error with setting friendly obstruction", e11);
                        }
                    }
                    if (eVar3 == eVar2) {
                        z11 = true;
                    }
                    aVar.a(view, a10, this, z11);
                }
                this.f25867b++;
            }
        }
    }
}
