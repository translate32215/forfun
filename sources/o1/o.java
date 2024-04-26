package o1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.d;
import c0.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ld.c;
import ld.l;
import o1.t;
import ud.k;

/* compiled from: NavDeepLinkBuilder.kt */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22788a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f22789b;

    /* renamed from: c  reason: collision with root package name */
    public t f22790c;

    /* renamed from: d  reason: collision with root package name */
    public final List<a> f22791d;

    /* compiled from: NavDeepLinkBuilder.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f22792a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f22793b;

        public a(int i10, Bundle bundle) {
            this.f22792a = i10;
            this.f22793b = bundle;
        }
    }

    public o(k kVar) {
        Intent intent;
        Context context = kVar.f22717a;
        k.f(context, "context");
        this.f22788a = context;
        if (context instanceof Activity) {
            intent = new Intent(context, context.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f22789b = intent;
        this.f22791d = new ArrayList();
        this.f22790c = kVar.i();
    }

    public final t a() {
        if (this.f22790c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        } else if (!this.f22791d.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<a> it = this.f22791d.iterator();
            r rVar = null;
            while (true) {
                int i10 = 0;
                if (it.hasNext()) {
                    a next = it.next();
                    int i11 = next.f22792a;
                    Bundle bundle = next.f22793b;
                    r b10 = b(i11);
                    if (b10 != null) {
                        int[] h10 = b10.h(rVar);
                        int length = h10.length;
                        while (i10 < length) {
                            arrayList.add(Integer.valueOf(h10[i10]));
                            arrayList2.add(bundle);
                            i10++;
                        }
                        rVar = b10;
                    } else {
                        r rVar2 = r.f22798r;
                        StringBuilder a10 = d.a("Navigation destination ", r.q(this.f22788a, i11), " cannot be found in the navigation graph ");
                        a10.append(this.f22790c);
                        throw new IllegalArgumentException(a10.toString());
                    }
                } else {
                    this.f22789b.putExtra("android-support-nav:controller:deepLinkIds", l.v(arrayList));
                    this.f22789b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
                    t tVar = new t(this.f22788a);
                    tVar.c(new Intent(this.f22789b));
                    int size = tVar.f4012a.size();
                    while (i10 < size) {
                        Intent intent = tVar.f4012a.get(i10);
                        if (intent != null) {
                            intent.putExtra("android-support-nav:controller:deepLinkIntent", this.f22789b);
                        }
                        i10++;
                    }
                    return tVar;
                }
            }
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
    }

    public final r b(int i10) {
        c cVar = new c();
        t tVar = this.f22790c;
        k.c(tVar);
        cVar.f(tVar);
        while (!cVar.isEmpty()) {
            r rVar = (r) cVar.z();
            if (rVar.f22806h == i10) {
                return rVar;
            }
            if (rVar instanceof t) {
                t.b bVar = new t.b((t) rVar);
                while (bVar.hasNext()) {
                    cVar.f((r) bVar.next());
                }
            }
        }
        return null;
    }

    public final void c() {
        for (a aVar : this.f22791d) {
            int i10 = aVar.f22792a;
            if (b(i10) == null) {
                r rVar = r.f22798r;
                StringBuilder a10 = d.a("Navigation destination ", r.q(this.f22788a, i10), " cannot be found in the navigation graph ");
                a10.append(this.f22790c);
                throw new IllegalArgumentException(a10.toString());
            }
        }
    }
}
