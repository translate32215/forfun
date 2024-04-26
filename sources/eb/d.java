package eb;

import com.google.firebase.remoteconfig.internal.c;
import db.b;
import java.util.Date;
import s8.a;
import s8.i;
import s8.l;

public final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f17819a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f17820b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f17821c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Date f17822d;

    public /* synthetic */ d(c cVar, i iVar, i iVar2, Date date) {
        this.f17819a = cVar;
        this.f17820b = iVar;
        this.f17821c = iVar2;
        this.f17822d = date;
    }

    public final Object e(i iVar) {
        c cVar = this.f17819a;
        i iVar2 = this.f17820b;
        i iVar3 = this.f17821c;
        Date date = this.f17822d;
        cVar.getClass();
        if (!iVar2.l()) {
            return l.d(new b("Firebase Installations failed to get installation ID for fetch.", iVar2.g()));
        }
        if (!iVar3.l()) {
            return l.d(new b("Firebase Installations failed to get installation auth token for fetch.", iVar3.g()));
        }
        try {
            c.a a10 = cVar.a((String) iVar2.h(), ((com.google.firebase.installations.b) iVar3.h()).a(), date);
            if (a10.f9792a != 0) {
                return l.e(a10);
            }
            return cVar.f9788e.c(a10.f9793b).m(cVar.f9786c, new r1.c(a10));
        } catch (db.c e10) {
            return l.d(e10);
        }
    }
}
