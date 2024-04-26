package t4;

import android.database.sqlite.SQLiteDatabase;
import androidx.appcompat.app.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.app.MainApp;
import dev.pankaj.yacinetv.tvui.splash.SplashActivity;
import ed.b;
import fc.c;
import gd.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.KProperty;
import o4.f;
import qc.d;
import qc.e;
import qc.m;
import t4.s;
import ud.k;

public final /* synthetic */ class i implements s.b, c0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25701a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25702b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f25703c;

    public /* synthetic */ i(SplashActivity splashActivity, MainApp mainApp) {
        this.f25702b = splashActivity;
        this.f25703c = mainApp;
    }

    public /* synthetic */ i(b bVar, LiveData liveData) {
        this.f25702b = bVar;
        this.f25703c = liveData;
    }

    public /* synthetic */ i(a aVar, LiveData liveData) {
        this.f25702b = aVar;
        this.f25703c = liveData;
    }

    public /* synthetic */ i(s sVar, o4.i iVar) {
        this.f25702b = sVar;
        this.f25703c = iVar;
    }

    public Object apply(Object obj) {
        char c10;
        s sVar = (s) this.f25702b;
        o4.i iVar = (o4.i) this.f25703c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sVar.getClass();
        ArrayList arrayList = new ArrayList();
        Long i10 = sVar.i(sQLiteDatabase, iVar);
        if (i10 == null) {
            c10 = 1;
        } else {
            c10 = 1;
            s.t(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{i10.toString()}, (String) null, (String) null, (String) null, String.valueOf(sVar.f25729d.c())), new r4.a(sVar, (List) arrayList, iVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            sb2.append(((h) arrayList.get(i11)).b());
            if (i11 < arrayList.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        String[] strArr = new String[3];
        strArr[0] = "event_id";
        strArr[c10] = "name";
        strArr[2] = "value";
        s.t(sQLiteDatabase.query("event_metadata", strArr, sb2.toString(), (String[]) null, (String) null, (String) null, (String) null), new r0.b((Map) hashMap));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            h hVar = (h) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(hVar.b()))) {
                f.a i12 = hVar.a().i();
                for (s.c cVar : (Set) hashMap.get(Long.valueOf(hVar.b()))) {
                    i12.a(cVar.f25730a, cVar.f25731b);
                }
                listIterator.set(new b(hVar.b(), hVar.c(), i12.b()));
            }
        }
        return arrayList;
    }

    public void g(Object obj) {
        rc.a aVar;
        switch (this.f25701a) {
            case 1:
                SplashActivity splashActivity = (SplashActivity) this.f25702b;
                MainApp mainApp = (MainApp) this.f25703c;
                m mVar = (m) obj;
                KProperty<Object>[] kPropertyArr = SplashActivity.M;
                k.f(splashActivity, "this$0");
                k.f(mainApp, "$app");
                if (mVar instanceof m.b) {
                    splashActivity.M(false, fc.a.f18339b);
                    return;
                } else if (mVar instanceof m.a) {
                    splashActivity.M(true, new fc.b(splashActivity, mainApp));
                    return;
                } else if ((mVar instanceof m.c) && (aVar = (rc.a) mVar.f24279a) != null) {
                    mainApp.h(aVar.a());
                    sc.f a10 = aVar.a();
                    c cVar = new c(splashActivity);
                    k.f(a10, "config");
                    if (a10.b().d() != 3) {
                        b.a aVar2 = new b.a(splashActivity);
                        aVar2.f441a.f426f = a10.b().c();
                        aVar2.setPositiveButton(R.string.update, new oc.b(splashActivity, a10, cVar));
                        aVar2.setNegativeButton(R.string.exit, new oc.c(cVar));
                        androidx.appcompat.app.b create = aVar2.create();
                        create.setCancelable(false);
                        create.show();
                        return;
                    }
                    cVar.c(Boolean.TRUE);
                    return;
                } else {
                    return;
                }
            case 2:
                ed.b bVar = (ed.b) this.f25702b;
                e eVar = (e) obj;
                bVar.f17838e.n((LiveData) this.f25703c);
                if (eVar instanceof qc.f) {
                    ed.b.f(bVar, new m.c(((qc.f) eVar).f24272a));
                    return;
                } else if (eVar instanceof qc.c) {
                    ed.b.f(bVar, new m.a("", (Object) null, 2));
                    return;
                } else if (eVar instanceof d) {
                    ed.b.f(bVar, new m.a(((d) eVar).f24271a, (Object) null, 2));
                    return;
                } else {
                    return;
                }
            default:
                a aVar3 = (a) this.f25702b;
                e eVar2 = (e) obj;
                aVar3.f18628f.n((LiveData) this.f25703c);
                if (eVar2 instanceof qc.f) {
                    aVar3.h(new m.c(((qc.f) eVar2).f24272a), aVar3.f18628f);
                    return;
                } else if (eVar2 instanceof qc.c) {
                    aVar3.h(new m.a("", (Object) null, 2), aVar3.f18628f);
                    return;
                } else if (eVar2 instanceof d) {
                    aVar3.h(new m.a(((d) eVar2).f24271a, (Object) null, 2), aVar3.f18628f);
                    return;
                } else {
                    return;
                }
        }
    }
}
