package e8;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.gf;
import com.google.android.gms.internal.ads.gw;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rb;
import com.google.android.gms.internal.ads.yw;
import d7.l;
import java.util.ArrayList;
import mb.c;
import mb.e;
import mb.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public /* synthetic */ class bt implements gf {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14053a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14054b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14055c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14056d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f14057e;

    public bt(qb qbVar, boolean z10, ArrayList arrayList, gw gwVar, iw.b bVar) {
        this.f14053a = qbVar;
        this.f14054b = z10;
        this.f14055c = arrayList;
        this.f14056d = gwVar;
        this.f14057e = bVar;
    }

    public static bt a(c cVar, e eVar, f fVar, f fVar2, boolean z10) {
        f fVar3 = f.NATIVE;
        if (fVar == f.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (cVar == c.DEFINED_BY_JAVASCRIPT && fVar == fVar3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (eVar != e.DEFINED_BY_JAVASCRIPT || fVar != fVar3) {
            return new bt(cVar, eVar, fVar, fVar2, z10);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public Object apply(Object obj) {
        long j10;
        long j11;
        int i10;
        boolean z10 = this.f14054b;
        ArrayList arrayList = (ArrayList) this.f14055c;
        gw gwVar = (gw) this.f14056d;
        iw.b bVar = (iw.b) this.f14057e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        rb rbVar = ((qb) this.f14053a).f7938b;
        SparseArray<iw.b> sparseArray = rb.f8020g;
        rbVar.getClass();
        iw.a.C0085a X = iw.a.X();
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.E((iw.a) X.f5970b, arrayList);
        yw a10 = rb.a(l.B.f13188e.j(rbVar.f8021a.getContentResolver()) != 0);
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.I((iw.a) X.f5970b, a10);
        yw g10 = l.B.f13188e.g(rbVar.f8021a, rbVar.f8023c);
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.J((iw.a) X.f5970b, g10);
        xs xsVar = rbVar.f8024d;
        synchronized (xsVar.f17517f) {
            j10 = xsVar.f17513b;
        }
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.F((iw.a) X.f5970b, j10);
        xs xsVar2 = rbVar.f8024d;
        synchronized (xsVar2) {
            synchronized (xsVar2.f17519h) {
                j11 = xsVar2.f17515d;
            }
        }
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.H((iw.a) X.f5970b, j11);
        xs xsVar3 = rbVar.f8024d;
        synchronized (xsVar3.f17516e) {
            i10 = xsVar3.f17512a;
        }
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.z((iw.a) X.f5970b, i10);
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.C((iw.a) X.f5970b, bVar);
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.B((iw.a) X.f5970b, gwVar);
        yw ywVar = rbVar.f8026f;
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.K((iw.a) X.f5970b, ywVar);
        yw a11 = rb.a(z10);
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.D((iw.a) X.f5970b, a11);
        long b10 = l.B.f13193j.b();
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.A((iw.a) X.f5970b, b10);
        yw a12 = rb.a(l.B.f13188e.c(rbVar.f8021a.getContentResolver()) != 0);
        if (X.f5971c) {
            X.n();
            X.f5971c = false;
        }
        iw.a.G((iw.a) X.f5970b, a12);
        byte[] f10 = ((iw.a) ((aq) X.j())).f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(l.B.f13193j.b()));
        contentValues.put("serialized_proto_data", f10);
        sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
        if (!z10) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
        }
        return null;
    }

    public bt(c cVar, e eVar, f fVar, f fVar2, boolean z10) {
        this.f14056d = cVar;
        this.f14057e = eVar;
        this.f14053a = fVar;
        if (fVar2 == null) {
            this.f14055c = f.NONE;
        } else {
            this.f14055c = fVar2;
        }
        this.f14054b = z10;
    }
}
