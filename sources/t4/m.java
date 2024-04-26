package t4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import o4.i;
import s4.g;
import s8.a;
import s8.l;
import t4.s;

public final /* synthetic */ class m implements s.b, a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f25711a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25712b;

    public /* synthetic */ m(long j10, i iVar) {
        this.f25711a = j10;
        this.f25712b = iVar;
    }

    public /* synthetic */ m(c cVar, long j10) {
        this.f25712b = cVar;
        this.f25711a = j10;
    }

    public Object apply(Object obj) {
        long j10 = this.f25711a;
        i iVar = (i) this.f25712b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{iVar.b(), String.valueOf(w4.a.a(iVar.d()))}) < 1) {
            contentValues.put("backend_name", iVar.b());
            contentValues.put("priority", Integer.valueOf(w4.a.a(iVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    public Object e(s8.i iVar) {
        s8.i<TContinuationResult> iVar2;
        boolean z10;
        c cVar = (c) this.f25712b;
        long j10 = this.f25711a;
        int[] iArr = c.f9783j;
        cVar.getClass();
        Date date = new Date(System.currentTimeMillis());
        Date date2 = null;
        if (iVar.l()) {
            d dVar = cVar.f9790g;
            dVar.getClass();
            Date date3 = new Date(dVar.f9797a.getLong("last_fetch_time_in_millis", -1));
            if (date3.equals(d.f9795d)) {
                z10 = false;
            } else {
                z10 = date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date3.getTime()));
            }
            if (z10) {
                return l.e(new c.a(date, 2, (b) null, (String) null));
            }
        }
        Date date4 = cVar.f9790g.a().f9801b;
        if (date.before(date4)) {
            date2 = date4;
        }
        if (date2 != null) {
            iVar2 = l.d(new db.d(String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()))}), date2.getTime()));
        } else {
            s8.i<String> id2 = cVar.f9784a.getId();
            s8.i<com.google.firebase.installations.b> a10 = cVar.f9784a.a(false);
            iVar2 = l.f(id2, a10).f(cVar.f9786c, new eb.d(cVar, id2, a10, date));
        }
        return iVar2.f(cVar.f9786c, new g(cVar, date));
    }
}
