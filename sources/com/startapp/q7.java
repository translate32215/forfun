package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import com.startapp.sdk.omsdk.AdVerification;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import vb.c;

/* compiled from: Sta */
public class q7 {

    /* renamed from: a  reason: collision with root package name */
    public final n f11619a;

    /* renamed from: b  reason: collision with root package name */
    public final k f11620b;

    /* renamed from: c  reason: collision with root package name */
    public final g6 f11621c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f11622d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f11623e = new AtomicBoolean();

    public q7(WebView webView) {
        n b10 = q.b(webView);
        this.f11619a = b10;
        webView.getContext();
        this.f11620b = q.a(b10);
        this.f11621c = null;
    }

    public void a() {
        n nVar = this.f11619a;
        if (nVar != null) {
            rd rdVar = (rd) nVar;
            if (!rdVar.f11680g) {
                rdVar.f11677d.clear();
                if (!rdVar.f11680g) {
                    rdVar.f11676c.clear();
                }
                rdVar.f11680g = true;
                re.f11684a.a(rdVar.f11678e.c(), "finishSession", new Object[0]);
                pd pdVar = pd.f11607c;
                boolean b10 = pdVar.b();
                pdVar.f11608a.remove(rdVar);
                pdVar.f11609b.remove(rdVar);
                if (b10 && !pdVar.b()) {
                    xe a10 = xe.a();
                    a10.getClass();
                    gb gbVar = gb.f10469h;
                    gbVar.getClass();
                    Handler handler = gb.f10471j;
                    if (handler != null) {
                        handler.removeCallbacks(gb.f10473l);
                        gb.f10471j = null;
                    }
                    gbVar.f10474a.clear();
                    gb.f10470i.post(new hb(gbVar));
                    ae aeVar = ae.f10095d;
                    aeVar.f10096a = false;
                    aeVar.f10097b = false;
                    aeVar.f10098c = null;
                    pe peVar = a10.f12810d;
                    peVar.f11610a.getContentResolver().unregisterContentObserver(peVar);
                }
                rdVar.f11678e.b();
                rdVar.f11678e = null;
            }
        }
    }

    public void b() {
        if (this.f11620b != null && this.f11622d.compareAndSet(false, true)) {
            k kVar = this.f11620b;
            se.b(kVar.f10739a);
            se.c(kVar.f10739a);
            if (!kVar.f10739a.c()) {
                try {
                    kVar.f10739a.a();
                } catch (Exception unused) {
                }
            }
            if (kVar.f10739a.c()) {
                rd rdVar = kVar.f10739a;
                if (!rdVar.f11682i) {
                    re.f11684a.a(rdVar.f11678e.c(), "publishImpressionEvent", new Object[0]);
                    rdVar.f11682i = true;
                    return;
                }
                throw new IllegalStateException("Impression event can only be sent once");
            }
        }
    }

    public boolean c() {
        return this.f11619a != null;
    }

    public void d() {
        if (this.f11620b != null && this.f11623e.compareAndSet(false, true)) {
            k kVar = this.f11620b;
            se.a(kVar.f10739a);
            se.c(kVar.f10739a);
            rd rdVar = kVar.f10739a;
            if (!rdVar.f11683j) {
                re.f11684a.a(rdVar.f11678e.c(), "publishLoadedEvent", new Object[0]);
                rdVar.f11683j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public void e() {
        n nVar = this.f11619a;
        if (nVar != null) {
            nVar.a();
        }
    }

    public q7(Context context, AdVerification adVerification, boolean z10) {
        n b10 = q.b(context, adVerification, z10);
        this.f11619a = b10;
        this.f11620b = q.a(b10);
        this.f11621c = z10 ? q.b(b10) : null;
    }

    public void a(View view) {
        n nVar = this.f11619a;
        if (nVar != null) {
            rd rdVar = (rd) nVar;
            if (!rdVar.f11680g) {
                se.a((Object) view, "AdView is null");
                if (rdVar.b() != view) {
                    rdVar.f11677d = new xd(view);
                    rdVar.f11678e.a();
                    Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(pd.f11607c.f11608a);
                    if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                        for (T t10 : unmodifiableCollection) {
                            if (t10 != rdVar && t10.b() == view) {
                                t10.f11677d.clear();
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(View view, c cVar, String str) {
        he heVar;
        n nVar = this.f11619a;
        if (nVar != null) {
            rd rdVar = (rd) nVar;
            if (!rdVar.f11680g) {
                if (view != null) {
                    Iterator<he> it = rdVar.f11676c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            heVar = null;
                            break;
                        }
                        heVar = it.next();
                        if (heVar.f10518a.get() == view) {
                            break;
                        }
                    }
                    if (heVar == null) {
                        rdVar.f11676c.add(new he(view, cVar, (String) null));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("FriendlyObstruction is null");
            }
        }
    }
}
