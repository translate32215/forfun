package r1;

import a5.h;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.leanback.widget.d0;
import androidx.leanback.widget.m0;
import androidx.leanback.widget.r0;
import androidx.leanback.widget.r1;
import androidx.leanback.widget.v0;
import androidx.leanback.widget.y0;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c5.j;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.remoteconfig.internal.c;
import com.startapp.startappsdk.R;
import d5.a;
import dc.d;
import dev.pankaj.yacinetv.tvui.search.SearchFragment;
import dev.pankaj.yacinetv.ui.event.EventFragment;
import dev.pankaj.yacinetv.ui.livetv.LiveTvFragment;
import dev.pankaj.yacinetv.ui.main.MainActivity;
import dev.pankaj.ytvclib.data.model.Channel;
import dev.pankaj.ytvclib.data.model.Event;
import dev.pankaj.ytvlib.data.model.Category;
import dev.pankaj.ytvlib.ui.base.FragmentViewBindingDelegate;
import dev.pankaj.ytvlib.ui.base.FragmentViewBindingDelegate$1$onCreate$1$1;
import dev.pankaj.ytvlib.utils.AutoFitGridLayoutManager;
import i6.d;
import java.util.List;
import kotlin.reflect.KProperty;
import m4.b;
import n9.f;
import o1.k;
import org.json.JSONArray;
import org.json.JSONException;
import qc.m;
import s8.i;
import s8.l;
import t4.s;
import t4.x;
import v6.g;
import v6.o;
import v6.t;
import x4.r0;

public final /* synthetic */ class c implements f.c, s.d, s.b, o.b, g, a.d, h.a, s8.a, s8.h, m0, c0, NavigationView.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24496a = 10;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24497b;

    public /* synthetic */ c(bc.c cVar) {
        this.f24497b = cVar;
    }

    public /* synthetic */ c(com.google.firebase.remoteconfig.a aVar) {
        this.f24497b = aVar;
    }

    public /* synthetic */ c(c.a aVar) {
        this.f24497b = aVar;
    }

    public /* synthetic */ c(d5.s sVar) {
        this.f24497b = sVar;
    }

    public /* synthetic */ c(d dVar) {
        this.f24497b = dVar;
    }

    public /* synthetic */ c(SearchFragment searchFragment) {
        this.f24497b = searchFragment;
    }

    public /* synthetic */ c(EventFragment eventFragment) {
        this.f24497b = eventFragment;
    }

    public /* synthetic */ c(LiveTvFragment liveTvFragment) {
        this.f24497b = liveTvFragment;
    }

    public /* synthetic */ c(MainActivity mainActivity) {
        this.f24497b = mainActivity;
    }

    public /* synthetic */ c(dev.pankaj.yacinetv.ui.search.SearchFragment searchFragment) {
        this.f24497b = searchFragment;
    }

    public /* synthetic */ c(FragmentViewBindingDelegate fragmentViewBindingDelegate) {
        this.f24497b = fragmentViewBindingDelegate;
    }

    public /* synthetic */ c(i6.d dVar) {
        this.f24497b = dVar;
    }

    public /* synthetic */ c(Exception exc) {
        this.f24497b = exc;
    }

    public /* synthetic */ c(String str) {
        this.f24497b = str;
    }

    public /* synthetic */ c(b bVar) {
        this.f24497b = bVar;
    }

    public /* synthetic */ c(k kVar) {
        this.f24497b = kVar;
    }

    public /* synthetic */ c(x xVar) {
        this.f24497b = xVar;
    }

    public /* synthetic */ c(r0 r0Var) {
        this.f24497b = r0Var;
    }

    public void a(r0.a aVar, Object obj, y0.b bVar, Object obj2) {
        bc.c cVar = (bc.c) this.f24497b;
        v0 v0Var = (v0) obj2;
        KProperty<Object>[] kPropertyArr = bc.c.f3871y0;
        ud.k.f(cVar, "this$0");
        r1.b bVar2 = cVar.f3874p0;
        ud.k.c(bVar2);
        int selectedPosition = bVar2.f2519c.getSelectedPosition();
        if (selectedPosition != cVar.f3875q0) {
            cVar.f3875q0 = selectedPosition;
            cVar.t0();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0154 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0174 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x017b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.f24496a
            switch(r0) {
                case 1: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x01a2
        L_0x0009:
            java.lang.Object r0 = r1.f24497b
            m4.b r0 = (m4.b) r0
            r3 = r21
            m4.b$a r3 = (m4.b.a) r3
            r0.getClass()
            java.net.URL r4 = r3.f21708a
            java.lang.String r5 = "CctTransportBackend"
            java.lang.String r6 = "Making request to: %s"
            l0.e.c(r5, r6, r4)
            java.net.URL r4 = r3.f21708a
            java.net.URLConnection r4 = r4.openConnection()
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4
            r6 = 30000(0x7530, float:4.2039E-41)
            r4.setConnectTimeout(r6)
            int r6 = r0.f21707g
            r4.setReadTimeout(r6)
            r6 = 1
            r4.setDoOutput(r6)
            r7 = 0
            r4.setInstanceFollowRedirects(r7)
            java.lang.String r8 = "POST"
            r4.setRequestMethod(r8)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r8 = "3.0.0"
            r6[r7] = r8
            java.lang.String r8 = "datatransport/%s android/"
            java.lang.String r6 = java.lang.String.format(r8, r6)
            java.lang.String r8 = "User-Agent"
            r4.setRequestProperty(r8, r6)
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            r4.setRequestProperty(r6, r8)
            java.lang.String r9 = "Content-Type"
            java.lang.String r10 = "application/json"
            r4.setRequestProperty(r9, r10)
            java.lang.String r10 = "Accept-Encoding"
            r4.setRequestProperty(r10, r8)
            java.lang.String r10 = r3.f21710c
            if (r10 == 0) goto L_0x0069
            java.lang.String r11 = "X-Goog-Api-Key"
            r4.setRequestProperty(r11, r10)
        L_0x0069:
            java.io.OutputStream r12 = r4.getOutputStream()     // Catch:{ ConnectException -> 0x0191, UnknownHostException -> 0x018f, c -> 0x017e, IOException -> 0x017c }
            java.util.zip.GZIPOutputStream r13 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0175 }
            r13.<init>(r12)     // Catch:{ all -> 0x0175 }
            oa.a r0 = r0.f21701a     // Catch:{ all -> 0x0170 }
            n4.o r3 = r3.f21709b     // Catch:{ all -> 0x0170 }
            java.io.BufferedWriter r15 = new java.io.BufferedWriter     // Catch:{ all -> 0x0170 }
            java.io.OutputStreamWriter r14 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0170 }
            r14.<init>(r13)     // Catch:{ all -> 0x0170 }
            r15.<init>(r14)     // Catch:{ all -> 0x0170 }
            qa.d r0 = (qa.d) r0     // Catch:{ all -> 0x0170 }
            qa.f r14 = new qa.f     // Catch:{ all -> 0x0170 }
            qa.e r0 = r0.f24247a     // Catch:{ all -> 0x0170 }
            java.util.Map<java.lang.Class<?>, oa.e<?>> r2 = r0.f24249a     // Catch:{ all -> 0x0170 }
            java.util.Map<java.lang.Class<?>, oa.g<?>> r10 = r0.f24250b     // Catch:{ all -> 0x0170 }
            oa.e<java.lang.Object> r11 = r0.f24251c     // Catch:{ all -> 0x0170 }
            boolean r0 = r0.f24252d     // Catch:{ all -> 0x0170 }
            r21 = r14
            r14 = r21
            r16 = r2
            r17 = r10
            r18 = r11
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0170 }
            r0 = r21
            r0.f(r3, r7)     // Catch:{ all -> 0x0170 }
            r0.h()     // Catch:{ all -> 0x0170 }
            android.util.JsonWriter r0 = r0.f24255b     // Catch:{ all -> 0x0170 }
            r0.flush()     // Catch:{ all -> 0x0170 }
            r13.close()     // Catch:{ all -> 0x0175 }
            if (r12 == 0) goto L_0x00b2
            r12.close()     // Catch:{ ConnectException -> 0x0191, UnknownHostException -> 0x018f, c -> 0x017e, IOException -> 0x017c }
        L_0x00b2:
            int r0 = r4.getResponseCode()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Status Code: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            l0.e.g(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Type: "
            r2.append(r3)
            java.lang.String r3 = r4.getHeaderField(r9)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            l0.e.g(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content-Encoding: "
            r2.append(r3)
            java.lang.String r3 = r4.getHeaderField(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            l0.e.g(r5, r2)
            r2 = 302(0x12e, float:4.23E-43)
            if (r0 == r2) goto L_0x015c
            r2 = 301(0x12d, float:4.22E-43)
            if (r0 == r2) goto L_0x015c
            r2 = 307(0x133, float:4.3E-43)
            if (r0 != r2) goto L_0x0107
            goto L_0x015c
        L_0x0107:
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == r2) goto L_0x0115
            m4.b$b r2 = new m4.b$b
            r3 = 0
            r5 = 0
            r2.<init>(r0, r5, r3)
            goto L_0x01a1
        L_0x0115:
            java.io.InputStream r2 = r4.getInputStream()
            java.lang.String r3 = r4.getHeaderField(r6)     // Catch:{ all -> 0x0155 }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0155 }
            if (r3 == 0) goto L_0x0129
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0155 }
            r3.<init>(r2)     // Catch:{ all -> 0x0155 }
            goto L_0x012a
        L_0x0129:
            r3 = r2
        L_0x012a:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x014e }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x014e }
            r5.<init>(r3)     // Catch:{ all -> 0x014e }
            r4.<init>(r5)     // Catch:{ all -> 0x014e }
            n4.s r4 = n4.s.a(r4)     // Catch:{ all -> 0x014e }
            n4.m r4 = (n4.m) r4     // Catch:{ all -> 0x014e }
            long r4 = r4.f21971a     // Catch:{ all -> 0x014e }
            m4.b$b r6 = new m4.b$b     // Catch:{ all -> 0x014e }
            r7 = 0
            r6.<init>(r0, r7, r4)     // Catch:{ all -> 0x014e }
            if (r3 == 0) goto L_0x0147
            r3.close()     // Catch:{ all -> 0x0155 }
        L_0x0147:
            if (r2 == 0) goto L_0x014c
            r2.close()
        L_0x014c:
            r2 = r6
            goto L_0x01a1
        L_0x014e:
            r0 = move-exception
            if (r3 == 0) goto L_0x0154
            r3.close()     // Catch:{ all -> 0x0154 }
        L_0x0154:
            throw r0     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            if (r2 == 0) goto L_0x015b
            r2.close()     // Catch:{ all -> 0x015b }
        L_0x015b:
            throw r0
        L_0x015c:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r4.getHeaderField(r2)
            m4.b$b r3 = new m4.b$b
            java.net.URL r4 = new java.net.URL
            r4.<init>(r2)
            r5 = 0
            r3.<init>(r0, r4, r5)
            r2 = r3
            goto L_0x01a1
        L_0x0170:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0174 }
        L_0x0174:
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            if (r12 == 0) goto L_0x017b
            r12.close()     // Catch:{ all -> 0x017b }
        L_0x017b:
            throw r0     // Catch:{ ConnectException -> 0x0191, UnknownHostException -> 0x018f, c -> 0x017e, IOException -> 0x017c }
        L_0x017c:
            r0 = move-exception
            goto L_0x017f
        L_0x017e:
            r0 = move-exception
        L_0x017f:
            java.lang.String r2 = "Couldn't encode request, returning with 400"
            l0.e.e(r5, r2, r0)
            m4.b$b r2 = new m4.b$b
            r0 = 400(0x190, float:5.6E-43)
            r3 = 0
            r5 = 0
            r2.<init>(r0, r5, r3)
            goto L_0x01a1
        L_0x018f:
            r0 = move-exception
            goto L_0x0192
        L_0x0191:
            r0 = move-exception
        L_0x0192:
            java.lang.String r2 = "Couldn't open connection, returning with 500"
            l0.e.e(r5, r2, r0)
            m4.b$b r2 = new m4.b$b
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 0
            r5 = 0
            r2.<init>(r0, r5, r3)
        L_0x01a1:
            return r2
        L_0x01a2:
            java.lang.Object r0 = r1.f24497b
            java.lang.String r0 = (java.lang.String) r0
            r2 = r21
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2
            l4.b r3 = t4.s.f25725e
            android.database.sqlite.SQLiteStatement r0 = r2.compileStatement(r0)
            r0.execute()
            java.lang.String r0 = "DELETE FROM events WHERE num_attempts >= 16"
            android.database.sqlite.SQLiteStatement r0 = r2.compileStatement(r0)
            r0.execute()
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c.apply(java.lang.Object):java.lang.Object");
    }

    public long b(long j10) {
        return ((d5.s) this.f24497b).g(j10);
    }

    public void c(Object obj, t tVar) {
        ((r0.a) obj).k((x4.r0) this.f24497b, (r0.b) tVar);
    }

    public Object d() {
        return ((x) this.f24497b).getWritableDatabase();
    }

    public Object e(i iVar) {
        boolean z10;
        com.google.firebase.remoteconfig.a aVar = (com.google.firebase.remoteconfig.a) this.f24497b;
        aVar.getClass();
        if (iVar.l()) {
            com.google.firebase.remoteconfig.internal.a aVar2 = aVar.f9755d;
            synchronized (aVar2) {
                aVar2.f9774c = l.e(null);
            }
            eb.f fVar = aVar2.f9773b;
            synchronized (fVar) {
                fVar.f17829a.deleteFile(fVar.f17830b);
            }
            if (iVar.h() != null) {
                JSONArray jSONArray = ((com.google.firebase.remoteconfig.internal.b) iVar.h()).f9780d;
                if (aVar.f9753b != null) {
                    try {
                        aVar.f9753b.c(com.google.firebase.remoteconfig.a.a(jSONArray));
                    } catch (JSONException e10) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
                    } catch (ga.a e11) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e11);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public i f(Object obj) {
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) obj;
        int[] iArr = com.google.firebase.remoteconfig.internal.c.f9783j;
        return l.e((c.a) this.f24497b);
    }

    public void g(Object obj) {
        LinearLayoutManager linearLayoutManager;
        dd.b bVar;
        int i10 = 0;
        switch (this.f24496a) {
            case 11:
                d dVar = (d) this.f24497b;
                m mVar = (m) obj;
                KProperty<Object>[] kPropertyArr = d.F0;
                ud.k.f(dVar, "this$0");
                if (mVar instanceof m.b) {
                    dVar.s0(true);
                    return;
                } else if (mVar instanceof m.c) {
                    dVar.s0(false);
                    dd.a aVar = (dd.a) mVar.f24279a;
                    if (aVar != null) {
                        androidx.leanback.widget.a aVar2 = new androidx.leanback.widget.a(aVar.b() == 1 ? new dc.c() : new dc.b());
                        dVar.E0 = aVar2;
                        aVar2.h();
                        androidx.leanback.widget.a aVar3 = dVar.E0;
                        if (aVar3 != null) {
                            aVar3.g(0, aVar.a());
                            androidx.leanback.widget.a aVar4 = dVar.E0;
                            if (aVar4 != null) {
                                dVar.f3880v0 = aVar4;
                                dVar.u0();
                                return;
                            }
                            ud.k.l("mAdapter");
                            throw null;
                        }
                        ud.k.l("mAdapter");
                        throw null;
                    }
                    return;
                } else {
                    return;
                }
            case 12:
                SearchFragment searchFragment = (SearchFragment) this.f24497b;
                m mVar2 = (m) obj;
                KProperty<Object>[] kPropertyArr2 = SearchFragment.P0;
                ud.k.f(searchFragment, "this$0");
                if (mVar2 instanceof m.b) {
                    searchFragment.v0(true);
                    return;
                } else if (mVar2 instanceof m.c) {
                    searchFragment.v0(false);
                    dd.b bVar2 = (dd.b) mVar2.f24279a;
                    if (bVar2 != null) {
                        int i11 = bVar2.a().isEmpty() ? R.string.no_search_results : R.string.search_results;
                        searchFragment.N0.h();
                        searchFragment.O0.h();
                        searchFragment.O0.g(0, bVar2.a());
                        searchFragment.N0.f(new d0(new androidx.leanback.widget.t(searchFragment.E(i11, searchFragment.M0)), searchFragment.O0));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 13:
                EventFragment eventFragment = (EventFragment) this.f24497b;
                m mVar3 = (m) obj;
                KProperty<Object>[] kPropertyArr3 = EventFragment.f13367x0;
                ud.k.f(eventFragment, "this$0");
                if (mVar3 instanceof m.b) {
                    eventFragment.t0(true);
                    return;
                } else if (mVar3 instanceof m.a) {
                    eventFragment.u0(true, new hc.a(eventFragment));
                    return;
                } else if (mVar3 instanceof m.c) {
                    eventFragment.t0(false);
                    dd.d dVar2 = (dd.d) mVar3.f24279a;
                    if (dVar2 != null) {
                        ic.a aVar5 = eventFragment.f13370w0;
                        List<Event> a10 = dVar2.a();
                        aVar5.getClass();
                        ud.k.f(a10, "items");
                        aVar5.f19352e.clear();
                        aVar5.f19352e.addAll(a10);
                        aVar5.f2863a.b();
                        TextView textView = ((zb.f) eventFragment.r0()).f28800d;
                        ud.k.e(textView, "binding.noItem");
                        if (!dVar2.a().isEmpty()) {
                            i10 = 8;
                        }
                        textView.setVisibility(i10);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 14:
                LiveTvFragment liveTvFragment = (LiveTvFragment) this.f24497b;
                m mVar4 = (m) obj;
                KProperty<Object>[] kPropertyArr4 = LiveTvFragment.f13391z0;
                ud.k.f(liveTvFragment, "this$0");
                if (mVar4 instanceof m.b) {
                    liveTvFragment.t0(true);
                    return;
                } else if (mVar4 instanceof m.a) {
                    liveTvFragment.u0(true, new jc.c(liveTvFragment));
                    return;
                } else if (mVar4 instanceof m.c) {
                    liveTvFragment.t0(false);
                    dd.a aVar6 = (dd.a) mVar4.f24279a;
                    if (aVar6 != null) {
                        RecyclerView recyclerView = ((zb.g) liveTvFragment.r0()).f28802b;
                        if (aVar6.b() == 1) {
                            linearLayoutManager = new AutoFitGridLayoutManager(liveTvFragment.h0(), e.k.b(120));
                        } else {
                            liveTvFragment.h0();
                            linearLayoutManager = new LinearLayoutManager(1, false);
                        }
                        recyclerView.setLayoutManager(linearLayoutManager);
                        liveTvFragment.f13396y0.f20593f = aVar6.b();
                        kc.b bVar3 = liveTvFragment.f13396y0;
                        List<Category> a11 = aVar6.a();
                        bVar3.getClass();
                        ud.k.f(a11, "items");
                        bVar3.f20592e.clear();
                        bVar3.f20592e.addAll(a11);
                        bVar3.f2863a.b();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 16:
                dev.pankaj.yacinetv.ui.search.SearchFragment searchFragment2 = (dev.pankaj.yacinetv.ui.search.SearchFragment) this.f24497b;
                m mVar5 = (m) obj;
                KProperty<Object>[] kPropertyArr5 = dev.pankaj.yacinetv.ui.search.SearchFragment.f13409y0;
                ud.k.f(searchFragment2, "this$0");
                if (mVar5 instanceof m.b) {
                    return;
                }
                if (mVar5 instanceof m.a) {
                    searchFragment2.u0(true, new mc.a(searchFragment2));
                    return;
                } else if ((mVar5 instanceof m.c) && (bVar = (dd.b) mVar5.f24279a) != null) {
                    kc.d dVar3 = searchFragment2.f13413x0;
                    List<Channel> a12 = bVar.a();
                    dVar3.getClass();
                    ud.k.f(a12, "items");
                    dVar3.f20601e.clear();
                    dVar3.f20601e.addAll(a12);
                    dVar3.f2863a.b();
                    return;
                } else {
                    return;
                }
            default:
                FragmentViewBindingDelegate fragmentViewBindingDelegate = (FragmentViewBindingDelegate) this.f24497b;
                ud.k.f(fragmentViewBindingDelegate, "this$0");
                ((androidx.lifecycle.t) obj).c().a(new FragmentViewBindingDelegate$1$onCreate$1$1(fragmentViewBindingDelegate));
                return;
        }
    }

    public void h(h hVar) {
        i6.d dVar = (i6.d) this.f24497b;
        d.c cVar = (d.c) hVar;
        dVar.getClass();
        cVar.f61a = 0;
        cVar.f18957c = null;
        dVar.f19315b.add(cVar);
    }

    public void i(Object obj) {
        ((j.a) obj).e((Exception) this.f24497b);
    }

    public boolean j(MenuItem menuItem) {
        switch (this.f24496a) {
            case 0:
                k kVar = (k) this.f24497b;
                ud.k.f(kVar, "$navController");
                ud.k.f(menuItem, "item");
                return e.c(menuItem, kVar);
            default:
                MainActivity mainActivity = (MainActivity) this.f24497b;
                int i10 = MainActivity.O;
                ud.k.f(mainActivity, "this$0");
                ud.k.f(menuItem, "menu");
                sc.f fVar = mainActivity.E;
                if (fVar == null) {
                    return true;
                }
                switch (menuItem.getItemId()) {
                    case R.id.nav_contact:
                        String a10 = fVar.c().a();
                        ud.k.f(a10, "mail");
                        try {
                            mainActivity.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", a10, (String) null)), (CharSequence) null));
                            return true;
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            return true;
                        }
                    case R.id.nav_facebook:
                        String b10 = fVar.c().b();
                        ud.k.f(b10, "pageID");
                        try {
                            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ud.k.j("fb://page/", b10))));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                            String j10 = ud.k.j("https://www.facebook.com/", b10);
                            ud.k.f(j10, "url");
                            try {
                                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(j10)));
                                return true;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return true;
                            }
                        }
                    case R.id.nav_instagram:
                        String c10 = fVar.c().c();
                        ud.k.f(c10, "user");
                        try {
                            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ud.k.j("android-app://com.instagram.android/https/instagram.com/_u/", c10))));
                            return true;
                        } catch (ActivityNotFoundException unused2) {
                            String j11 = ud.k.j("https://www.instagram.com/", c10);
                            ud.k.f(j11, "url");
                            try {
                                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(j11)));
                                return true;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return true;
                            }
                        }
                    case R.id.nav_messenger:
                        String b11 = fVar.c().b();
                        ud.k.f(b11, "pageID");
                        try {
                            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ud.k.j("fb-messenger://user/", b11))));
                            return true;
                        } catch (ActivityNotFoundException unused3) {
                            String j12 = ud.k.j("https://m.me/", b11);
                            ud.k.f(j12, "url");
                            try {
                                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(j12)));
                                return true;
                            } catch (Exception e13) {
                                e13.printStackTrace();
                                return true;
                            }
                        }
                    case R.id.nav_policy:
                        String d10 = fVar.c().d();
                        ud.k.f(d10, "url");
                        try {
                            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(d10)));
                            return true;
                        } catch (Exception e14) {
                            e14.printStackTrace();
                            return true;
                        }
                    case R.id.nav_premium:
                        mainActivity.N().l(R.id.couponFragment, (Bundle) null, (o1.x) null);
                        return true;
                    case R.id.nav_share:
                        String e15 = fVar.c().e();
                        ud.k.f(e15, "msg");
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", e15);
                        mainActivity.startActivity(Intent.createChooser(intent, (CharSequence) null));
                        return true;
                    case R.id.nav_telegram:
                        String f10 = fVar.c().f();
                        ud.k.f(f10, "user");
                        try {
                            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tg://resolve?domain=" + f10)));
                            return true;
                        } catch (ActivityNotFoundException unused4) {
                            String str = "http://www.telegram.me/" + f10;
                            ud.k.f(str, "url");
                            try {
                                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                return true;
                            } catch (Exception e16) {
                                e16.printStackTrace();
                                return true;
                            }
                        }
                    case R.id.nav_twitter:
                        String g10 = fVar.c().g();
                        ud.k.f(g10, "user");
                        try {
                            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ud.k.j("twitter://user?screen_name=", g10))));
                            return true;
                        } catch (ActivityNotFoundException unused5) {
                            String j13 = ud.k.j("https://twitter.com/#!/", g10);
                            ud.k.f(j13, "url");
                            try {
                                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(j13)));
                                return true;
                            } catch (Exception e17) {
                                e17.printStackTrace();
                                return true;
                            }
                        }
                    case R.id.nav_youtube:
                        String h10 = fVar.c().h();
                        ud.k.f(h10, "url");
                        try {
                            mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(h10)));
                            return true;
                        } catch (Exception e18) {
                            e18.printStackTrace();
                            return true;
                        }
                    default:
                        return true;
                }
        }
    }
}
