package t4;

import android.database.sqlite.SQLiteDatabase;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.RecyclerView;
import dev.pankaj.ytvclib.data.model.Stream;
import dev.pankaj.ytvclib.ui.main.PlayerActivity;
import gd.a;
import java.util.List;
import kd.o;
import o4.i;
import qc.c;
import qc.e;
import qc.f;
import qc.m;
import rc.b;
import t4.s;
import ud.k;
import xc.d;

public final /* synthetic */ class j implements s.b, c0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25704a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25705b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f25706c;

    public /* synthetic */ j(PlayerActivity playerActivity, RecyclerView recyclerView) {
        this.f25705b = playerActivity;
        this.f25706c = recyclerView;
    }

    public /* synthetic */ j(a aVar, LiveData liveData) {
        this.f25705b = aVar;
        this.f25706c = liveData;
    }

    public /* synthetic */ j(id.a aVar, LiveData liveData) {
        this.f25705b = aVar;
        this.f25706c = liveData;
    }

    public Object apply(Object obj) {
        s sVar = (s) this.f25705b;
        Long i10 = sVar.i((SQLiteDatabase) obj, (i) this.f25706c);
        if (i10 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) s.t(sVar.d().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{i10.toString()}), q.f25720a);
    }

    public void g(Object obj) {
        o oVar = null;
        switch (this.f25704a) {
            case 1:
                PlayerActivity playerActivity = (PlayerActivity) this.f25705b;
                RecyclerView recyclerView = (RecyclerView) this.f25706c;
                m mVar = (m) obj;
                PlayerActivity.a aVar = PlayerActivity.f13437n0;
                k.f(playerActivity, "this$0");
                k.f(k.j("stream: ", mVar), "msg");
                boolean z10 = true;
                if (mVar instanceof m.b) {
                    playerActivity.M(true);
                    return;
                } else if (mVar instanceof m.c) {
                    k.f(k.j("stream: ", mVar.f24279a), "msg");
                    playerActivity.M(false);
                    b bVar = (b) mVar.f24279a;
                    if (bVar != null) {
                        yc.a aVar2 = playerActivity.f13451l0;
                        List<Stream> a10 = bVar.a();
                        aVar2.getClass();
                        k.f(a10, "items");
                        aVar2.f28172e.clear();
                        aVar2.f28172e.addAll(a10);
                        aVar2.f2863a.b();
                        k.e(recyclerView, "streamListView");
                        recyclerView.setVisibility(bVar.a().size() > 1 ? 0 : 8);
                        List<Stream> a11 = bVar.a();
                        k.f(a11, "<this>");
                        Stream stream = a11.isEmpty() ? null : a11.get(0);
                        if (stream != null) {
                            if (bVar.a().size() >= 2) {
                                z10 = false;
                            }
                            playerActivity.P(stream, z10);
                            oVar = o.f20627a;
                        }
                    }
                    if (oVar == null) {
                        playerActivity.finish();
                        return;
                    }
                    return;
                } else {
                    playerActivity.N(true, new d(playerActivity));
                    return;
                }
            case 2:
                a aVar3 = (a) this.f25705b;
                e eVar = (e) obj;
                aVar3.f18627e.n((LiveData) this.f25706c);
                if (eVar instanceof f) {
                    aVar3.h(new m.c(((f) eVar).f24272a), aVar3.f18627e);
                    return;
                } else if (eVar instanceof c) {
                    aVar3.h(new m.a("", (Object) null, 2), aVar3.f18627e);
                    return;
                } else if (eVar instanceof qc.d) {
                    aVar3.h(new m.a(((qc.d) eVar).f24271a, (Object) null, 2), aVar3.f18627e);
                    return;
                } else {
                    return;
                }
            default:
                id.a aVar4 = (id.a) this.f25705b;
                e eVar2 = (e) obj;
                aVar4.f19359e.n((LiveData) this.f25706c);
                if (eVar2 instanceof f) {
                    id.a.f(aVar4, new m.c(((f) eVar2).f24272a));
                    return;
                } else if (eVar2 instanceof c) {
                    id.a.f(aVar4, new m.a("", (Object) null, 2));
                    return;
                } else if (eVar2 instanceof qc.d) {
                    id.a.f(aVar4, new m.a(((qc.d) eVar2).f24271a, (Object) null, 2));
                    return;
                } else {
                    return;
                }
        }
    }
}
