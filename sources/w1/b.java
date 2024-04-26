package w1;

import android.os.Bundle;
import android.support.v4.media.a;
import androidx.lifecycle.o;
import androidx.savedstate.Recreator;
import java.util.Map;
import ud.f;
import ud.k;
import w1.a;

/* compiled from: SavedStateRegistryController.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f26866a;

    /* renamed from: b  reason: collision with root package name */
    public final a f26867b = new a();

    /* renamed from: c  reason: collision with root package name */
    public boolean f26868c;

    public b(c cVar, f fVar) {
        this.f26866a = cVar;
    }

    public static final b a(c cVar) {
        return new b(cVar, (f) null);
    }

    public final void b() {
        o c10 = this.f26866a.c();
        k.e(c10, "owner.lifecycle");
        if (c10.b() == o.c.INITIALIZED) {
            c10.a(new Recreator(this.f26866a));
            this.f26867b.c(c10);
            this.f26868c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void c(Bundle bundle) {
        if (!this.f26868c) {
            b();
        }
        o c10 = this.f26866a.c();
        k.e(c10, "owner.lifecycle");
        if (!(c10.b().compareTo(o.c.STARTED) >= 0)) {
            a aVar = this.f26867b;
            if (!aVar.f26861b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!aVar.f26863d) {
                aVar.f26862c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                aVar.f26863d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            StringBuilder a10 = a.a("performRestore cannot be called when owner is ");
            a10.append(c10.b());
            throw new IllegalStateException(a10.toString().toString());
        }
    }

    public final void d(Bundle bundle) {
        k.f(bundle, "outBundle");
        a aVar = this.f26867b;
        aVar.getClass();
        k.f(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f26862c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.b<K, V>.d f10 = aVar.f26860a.f();
        while (f10.hasNext()) {
            Map.Entry entry = (Map.Entry) f10.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
