package m3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import k3.c;
import k8.a0;
import k8.b;
import k8.b0;
import k8.c0;
import k8.c4;
import k8.d0;
import k8.d4;
import k8.e0;
import k8.g7;
import k8.h;
import k8.j4;
import k8.m4;
import k8.n;
import k8.o;
import k8.p;
import k8.u;
import k8.v;
import k8.w;
import k8.y;
import k8.z;
import n2.g;
import s.a;
import x.f;

/* compiled from: Jobs */
public class t implements z, j4 {

    /* renamed from: a  reason: collision with root package name */
    public Map<c, m<?>> f21665a;

    /* renamed from: b  reason: collision with root package name */
    public Map<c, m<?>> f21666b;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<k3.c, m3.m<?>>, k8.m4] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<k3.c, m3.m<?>>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ t(k8.m4 r1, java.lang.String r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.f21665a = r1
            r0.f21666b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.t.<init>(k8.m4, java.lang.String):void");
    }

    public static final int g(g gVar, n nVar, o oVar) {
        o b10 = nVar.b(gVar, Collections.singletonList(oVar));
        if (b10 instanceof h) {
            return f.f(b10.a().doubleValue());
        }
        return -1;
    }

    public void a() {
        this.f21665a = null;
        this.f21666b = null;
    }

    public g b(o oVar) {
        g w10 = ((g) this.f21665a).w();
        w10.B((String) this.f21666b, oVar);
        return w10;
    }

    public Map<c, m<?>> c(boolean z10) {
        return z10 ? this.f21666b : this.f21665a;
    }

    public o d(g gVar, o oVar) {
        u uVar;
        f.h(gVar);
        if (!(oVar instanceof p)) {
            return oVar;
        }
        p pVar = (p) oVar;
        ArrayList<o> arrayList = pVar.f20398b;
        String str = pVar.f20397a;
        if (this.f21665a.containsKey(str)) {
            uVar = (u) this.f21665a.get(str);
        } else {
            uVar = (c0) this.f21666b;
        }
        return uVar.a(str, gVar, arrayList);
    }

    public void e(u uVar) {
        for (e0 e0Var : uVar.f20482a) {
            this.f21665a.put(Integer.valueOf(e0Var.f20179a).toString(), uVar);
        }
    }

    public void f(g gVar, k8.c cVar) {
        g7 g7Var = new g7(cVar);
        for (Integer num : ((TreeMap) this.f21665a).keySet()) {
            b a10 = cVar.f20086b.clone();
            int g10 = g(gVar, (n) ((TreeMap) this.f21665a).get(num), g7Var);
            if (g10 == 2 || g10 == -1) {
                cVar.f20086b = a10;
            }
        }
        for (Integer num2 : ((TreeMap) this.f21666b).keySet()) {
            g(gVar, (n) ((TreeMap) this.f21666b).get(num2), g7Var);
        }
    }

    public Object zza() {
        String str;
        String str2 = (String) this.f21666b;
        ContentResolver contentResolver = ((m4) this.f21665a).f20323a.getContentResolver();
        Uri uri = d4.f20108a;
        synchronized (d4.class) {
            if (d4.f20112e == null) {
                d4.f20111d.set(false);
                d4.f20112e = new HashMap<>();
                d4.f20117j = new Object();
                contentResolver.registerContentObserver(d4.f20108a, true, new c4());
            } else if (d4.f20111d.getAndSet(false)) {
                d4.f20112e.clear();
                d4.f20113f.clear();
                d4.f20114g.clear();
                d4.f20115h.clear();
                d4.f20116i.clear();
                d4.f20117j = new Object();
            }
            Object obj = d4.f20117j;
            str = null;
            if (d4.f20112e.containsKey(str2)) {
                String str3 = d4.f20112e.get(str2);
                if (str3 != null) {
                    str = str3;
                }
            } else {
                int length = d4.f20118k.length;
                Cursor query = contentResolver.query(d4.f20108a, (String[]) null, (String) null, new String[]{str2}, (String) null);
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            d4.a(obj, str2, (String) null);
                        } else {
                            String string = query.getString(1);
                            if (string != null && string.equals((Object) null)) {
                                string = null;
                            }
                            d4.a(obj, str2, string);
                            if (string != null) {
                                str = string;
                            }
                        }
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<k3.c, m3.m<?>>, n2.g] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<k3.c, m3.m<?>>, java.lang.String] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(n2.g r1, java.lang.String r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.f21665a = r1
            r0.f21666b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.t.<init>(n2.g, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map<k3.c, m3.m<?>>, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r2v4, types: [k8.c0, java.util.Map<k3.c, m3.m<?>>] */
    public t(int i10) {
        if (i10 == 1) {
            this.f21665a = new AtomicReference();
            this.f21666b = new a();
        } else if (i10 == 2) {
        } else {
            if (i10 == 3) {
                this.f21665a = new HashMap();
                this.f21666b = new c0();
                e(new k8.t());
                e(new v());
                e(new w());
                e(new y());
                e(new a0());
                e(new b0());
                e(new d0());
            } else if (i10 != 6) {
                this.f21665a = new HashMap();
                this.f21666b = new HashMap();
            } else {
                this.f21665a = new TreeMap();
                this.f21666b = new TreeMap();
            }
        }
    }
}
