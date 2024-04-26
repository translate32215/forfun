package ub;

import android.os.AsyncTask;

public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public a f26171a;

    /* renamed from: b  reason: collision with root package name */
    public final C0259b f26172b;

    public interface a {
    }

    /* renamed from: ub.b$b  reason: collision with other inner class name */
    public interface C0259b {
    }

    public b(C0259b bVar) {
        this.f26172b = bVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f26171a;
        if (aVar != null) {
            c cVar = (c) aVar;
            cVar.f26175c = null;
            cVar.a();
        }
    }
}
