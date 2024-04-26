package w1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import m.b;
import o1.j;
import ud.k;

@SuppressLint({"RestrictedApi"})
/* compiled from: SavedStateRegistry.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final m.b<String, b> f26860a = new m.b<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f26861b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f26862c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26863d;

    /* renamed from: e  reason: collision with root package name */
    public Recreator.a f26864e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f26865f = true;

    /* renamed from: w1.a$a  reason: collision with other inner class name */
    /* compiled from: SavedStateRegistry.kt */
    public interface C0269a {
        void a(c cVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        k.f(str, "key");
        if (this.f26863d) {
            Bundle bundle = this.f26862c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f26862c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f26862c;
            boolean z10 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                this.f26862c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final b b(String str) {
        Map.Entry entry;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f26860a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            entry = (Map.Entry) eVar.next();
            k.e(entry, "components");
            bVar = (b) entry.getValue();
        } while (!k.a((String) entry.getKey(), str));
        return bVar;
    }

    public final void c(o oVar) {
        if (!this.f26861b) {
            oVar.a(new j(this));
            this.f26861b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void d(String str, b bVar) {
        k.f(str, "key");
        k.f(bVar, "provider");
        if (!(this.f26860a.i(str, bVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void e(Class<? extends C0269a> cls) {
        if (this.f26865f) {
            Recreator.a aVar = this.f26864e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.f26864e = aVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.f26864e;
                if (aVar2 != null) {
                    aVar2.f3164a.add(cls.getName());
                }
            } catch (NoSuchMethodException e10) {
                StringBuilder a10 = android.support.v4.media.a.a("Class ");
                a10.append(cls.getSimpleName());
                a10.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(a10.toString(), e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
