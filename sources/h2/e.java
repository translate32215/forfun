package h2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import g2.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o2.j;
import o2.k;
import o2.l;

/* compiled from: Schedulers */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18814a = g2.e.e("Schedulers");

    /* JADX INFO: finally extract failed */
    public static void a(a aVar, WorkDatabase workDatabase, List<d> list) {
        int i10;
        if (list != null && list.size() != 0) {
            k n10 = workDatabase.n();
            workDatabase.c();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i10 = aVar.f18392f / 2;
                } else {
                    i10 = aVar.f18392f;
                }
                l lVar = (l) n10;
                List<j> b10 = lVar.b(i10);
                if (((ArrayList) b10).size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = ((ArrayList) b10).iterator();
                    while (it.hasNext()) {
                        lVar.j(((j) it.next()).f22864a, currentTimeMillis);
                    }
                }
                workDatabase.j();
                workDatabase.g();
                ArrayList arrayList = (ArrayList) b10;
                if (arrayList.size() > 0) {
                    j[] jVarArr = (j[]) arrayList.toArray(new j[0]);
                    for (d d10 : list) {
                        d10.d(jVarArr);
                    }
                }
            } catch (Throwable th) {
                workDatabase.g();
                throw th;
            }
        }
    }
}
