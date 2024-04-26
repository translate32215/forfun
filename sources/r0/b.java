package r0;

import a5.h;
import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.leanback.widget.i0;
import androidx.leanback.widget.n0;
import androidx.leanback.widget.t;
import androidx.lifecycle.c0;
import bc.c;
import com.google.firebase.remoteconfig.a;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.app.MainApp;
import dev.pankaj.yacinetv.tvui.main.MainFragment;
import dev.pankaj.yacinetv.ui.livetv.ChannelFragment;
import dev.pankaj.yacinetv.ui.splash.SplashActivity;
import dev.pankaj.ytvclib.data.model.Channel;
import dev.pankaj.ytvlib.app.FCM;
import dev.pankaj.ytvlib.data.model.Category;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.reflect.KProperty;
import o0.c;
import o4.i;
import p5.k;
import p5.p;
import qc.m;
import s4.j;
import s8.d;
import s8.l;
import t4.s;
import u4.b;
import x4.b0;
import x4.w;
import x4.y;

public final /* synthetic */ class b implements e, b.a, s.d, s.b, y.e, p.g, h.a, s8.h, i0, c0, d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24478a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f24479b;

    public /* synthetic */ b(View view) {
        this.f24479b = view;
    }

    public /* synthetic */ b(c cVar) {
        this.f24479b = cVar;
    }

    public /* synthetic */ b(cc.b bVar) {
        this.f24479b = bVar;
    }

    public /* synthetic */ b(a aVar) {
        this.f24479b = aVar;
    }

    public /* synthetic */ b(dc.d dVar) {
        this.f24479b = dVar;
    }

    public /* synthetic */ b(MainFragment mainFragment) {
        this.f24479b = mainFragment;
    }

    public /* synthetic */ b(ChannelFragment channelFragment) {
        this.f24479b = channelFragment;
    }

    public /* synthetic */ b(SplashActivity splashActivity) {
        this.f24479b = splashActivity;
    }

    public /* synthetic */ b(FCM fcm) {
        this.f24479b = fcm;
    }

    public /* synthetic */ b(h6.c cVar) {
        this.f24479b = cVar;
    }

    public /* synthetic */ b(Map map) {
        this.f24479b = map;
    }

    public /* synthetic */ b(j jVar) {
        this.f24479b = jVar;
    }

    public /* synthetic */ b(t4.c cVar) {
        this.f24479b = cVar;
    }

    public /* synthetic */ b(b0 b0Var) {
        this.f24479b = b0Var;
    }

    public /* synthetic */ b(w wVar) {
        this.f24479b = wVar;
    }

    public Object a() {
        switch (this.f24478a) {
            case 1:
                return Integer.valueOf(((t4.c) this.f24479b).h());
            default:
                j jVar = (j) this.f24479b;
                for (i a10 : jVar.f24952b.E()) {
                    jVar.f24953c.a(a10, 1);
                }
                return null;
        }
    }

    public Object apply(Object obj) {
        Map map = (Map) this.f24479b;
        Cursor cursor = (Cursor) obj;
        l4.b bVar = s.f25725e;
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new s.c(cursor.getString(1), cursor.getString(2), (s.a) null));
        }
        return null;
    }

    public boolean b(f fVar, int i10, Bundle bundle) {
        c.b bVar;
        View view = (View) this.f24479b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                fVar.f24482a.c();
                InputContentInfo inputContentInfo = (InputContentInfo) fVar.f24482a.a();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipData clipData = new ClipData(fVar.f24482a.getDescription(), new ClipData.Item(fVar.f24482a.b()));
        if (i11 >= 31) {
            bVar = new c.a(clipData, 2);
        } else {
            bVar = new c.C0199c(clipData, 2);
        }
        bVar.c(fVar.f24482a.d());
        bVar.b(bundle);
        if (o0.c0.w(view, bVar.a()) == null) {
            return true;
        }
        return false;
    }

    public int c(Object obj) {
        b0 b0Var = (b0) this.f24479b;
        k kVar = (k) obj;
        Pattern pattern = p.f23924a;
        try {
            return kVar.e(b0Var) ? 1 : 0;
        } catch (p.c unused) {
            return -1;
        }
    }

    public Object d() {
        l4.b bVar = s.f25725e;
        ((SQLiteDatabase) this.f24479b).beginTransaction();
        return null;
    }

    public s8.i f(Object obj) {
        a aVar = (a) this.f24479b;
        Void voidR = (Void) obj;
        s8.i<com.google.firebase.remoteconfig.internal.b> b10 = aVar.f9755d.b();
        s8.i<com.google.firebase.remoteconfig.internal.b> b11 = aVar.f9756e.b();
        return l.f(b10, b11).f(aVar.f9754c, new r4.a(aVar, (s8.i) b10, (s8.i) b11));
    }

    public void g(Object obj) {
        switch (this.f24478a) {
            case 10:
                cc.b bVar = (cc.b) this.f24479b;
                m mVar = (m) obj;
                KProperty<Object>[] kPropertyArr = cc.b.C0;
                ud.k.f(bVar, "this$0");
                if (mVar instanceof m.b) {
                    bVar.s0(true);
                    return;
                } else if (mVar instanceof m.c) {
                    bVar.s0(false);
                    dd.d dVar = (dd.d) mVar.f24279a;
                    if (dVar != null) {
                        bVar.B0.g(0, dVar.a());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 11:
                dc.d dVar2 = (dc.d) this.f24479b;
                m mVar2 = (m) obj;
                KProperty<Object>[] kPropertyArr2 = dc.d.F0;
                ud.k.f(dVar2, "this$0");
                if (mVar2 instanceof m.b) {
                    dVar2.s0(true);
                    return;
                } else if (mVar2 instanceof m.c) {
                    dVar2.s0(false);
                    dd.b bVar2 = (dd.b) mVar2.f24279a;
                    if (bVar2 != null) {
                        androidx.leanback.widget.a aVar = new androidx.leanback.widget.a(new dc.a());
                        dVar2.E0 = aVar;
                        aVar.h();
                        androidx.leanback.widget.a aVar2 = dVar2.E0;
                        if (aVar2 != null) {
                            aVar2.g(0, bVar2.a());
                            androidx.leanback.widget.a aVar3 = dVar2.E0;
                            if (aVar3 != null) {
                                dVar2.f3880v0 = aVar3;
                                dVar2.u0();
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
                MainFragment mainFragment = (MainFragment) this.f24479b;
                m mVar3 = (m) obj;
                KProperty<Object>[] kPropertyArr3 = MainFragment.F1;
                ud.k.f(mainFragment, "this$0");
                if (mVar3 instanceof m.a) {
                    bc.b bVar3 = new bc.b();
                    androidx.fragment.app.b bVar4 = new androidx.fragment.app.b(mainFragment.y());
                    bVar4.h(R.id.container, bVar3);
                    bVar4.d((String) null);
                    bVar4.e();
                    return;
                } else if (mVar3 instanceof m.c) {
                    dd.a aVar4 = (dd.a) mVar3.f24279a;
                    if (aVar4 != null) {
                        mainFragment.E1.f(new n0(new t(-1, mainFragment.D(R.string.live_event))));
                        for (Category category : aVar4.a()) {
                            t tVar = new t(category.getId(), category.getName());
                            tVar.f2527d = String.valueOf(category.getHasChild());
                            mainFragment.E1.f(new n0(tVar));
                        }
                    }
                    mainFragment.H0.c(mainFragment.E0);
                    return;
                } else {
                    return;
                }
            default:
                ChannelFragment channelFragment = (ChannelFragment) this.f24479b;
                m mVar4 = (m) obj;
                KProperty<Object>[] kPropertyArr4 = ChannelFragment.f13378y0;
                ud.k.f(channelFragment, "this$0");
                if (mVar4 instanceof m.b) {
                    channelFragment.t0(true);
                    return;
                } else if (mVar4 instanceof m.a) {
                    channelFragment.u0(true, new jc.a(channelFragment));
                    return;
                } else if (mVar4 instanceof m.c) {
                    channelFragment.t0(false);
                    dd.b bVar5 = (dd.b) mVar4.f24279a;
                    if (bVar5 != null) {
                        kc.d dVar3 = channelFragment.f13382x0;
                        List<Channel> a10 = bVar5.a();
                        dVar3.getClass();
                        ud.k.f(a10, "items");
                        dVar3.f20601e.clear();
                        dVar3.f20601e.addAll(a10);
                        dVar3.f2863a.b();
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public void h(h hVar) {
        h6.c cVar = (h6.c) this.f24479b;
        O o10 = (h6.j) hVar;
        synchronized (cVar.f99b) {
            o10.u();
            O[] oArr = cVar.f103f;
            int i10 = cVar.f105h;
            cVar.f105h = i10 + 1;
            oArr[i10] = o10;
            cVar.h();
        }
    }

    public void s(s8.i iVar) {
        switch (this.f24478a) {
            case 14:
                SplashActivity splashActivity = (SplashActivity) this.f24479b;
                KProperty<Object>[] kPropertyArr = SplashActivity.M;
                ud.k.f(splashActivity, "this$0");
                ud.k.f(iVar, "it");
                splashActivity.N().g(MainApp.l().d());
                return;
            default:
                FCM fcm = (FCM) this.f24479b;
                int i10 = FCM.f13481g;
                ud.k.f(fcm, "this$0");
                ud.k.f(iVar, "task");
                ud.k.e(fcm.getString(R.string.msg_subscribed), "getString(R.string.msg_subscribed)");
                if (!iVar.l()) {
                    ud.k.e(fcm.getString(R.string.msg_subscribe_failed), "getString(R.string.msg_subscribe_failed)");
                    return;
                }
                return;
        }
    }
}
