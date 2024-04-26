package t2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adcolony.sdk.f;
import com.adcolony.sdk.i0;
import com.adcolony.sdk.n;
import com.adcolony.sdk.o;
import com.adcolony.sdk.q;
import org.json.JSONException;
import org.json.JSONObject;

public class f1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JSONObject f25474a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f25475b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f25476c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i0 f25477d;

    public f1(i0 i0Var, JSONObject jSONObject, a aVar, Context context) {
        this.f25477d = i0Var;
        this.f25474a = jSONObject;
        this.f25475b = aVar;
        this.f25476c = context;
    }

    public void run() {
        n nVar;
        try {
            nVar = new n(this.f25474a);
        } catch (JSONException unused) {
            nVar = null;
        }
        if (nVar != null) {
            i0 i0Var = this.f25477d;
            a aVar = this.f25475b;
            Context context = this.f25476c;
            synchronized (i0Var) {
                try {
                    SQLiteDatabase sQLiteDatabase = i0Var.f4555b;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        i0Var.f4555b = context.openOrCreateDatabase("adc_events_db", 0, (SQLiteDatabase.CursorFactory) null);
                    }
                    if (i0Var.f4555b.needUpgrade(nVar.f4610a)) {
                        boolean c10 = i0Var.c(nVar);
                        i0Var.f4556c = c10;
                        if (c10) {
                            ((o.i) i0Var.f4557d).getClass();
                            q.c().f4710d = false;
                        }
                    } else {
                        i0Var.f4556c = true;
                    }
                    if (i0Var.f4556c) {
                        aVar.a(nVar);
                    }
                } catch (SQLiteException e10) {
                    f.d().l().e(0, 1, "Database cannot be opened" + e10.toString(), true);
                }
            }
            return;
        }
        return;
    }
}
