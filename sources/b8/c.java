package b8;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static c f3658b = new c();

    /* renamed from: a  reason: collision with root package name */
    public b f3659a = null;

    public static b a(Context context) {
        b bVar;
        c cVar = f3658b;
        synchronized (cVar) {
            if (cVar.f3659a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                cVar.f3659a = new b(context);
            }
            bVar = cVar.f3659a;
        }
        return bVar;
    }
}
