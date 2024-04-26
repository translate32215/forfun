package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.activity.result.e;
import c0.a;

/* compiled from: ActivityResultLauncher */
public abstract class c<I> {
    public void a(@SuppressLint({"UnknownNullness"}) I i10) {
        e.a aVar = (e.a) this;
        Integer num = e.this.f377c.get(aVar.f383a);
        if (num != null) {
            e.this.f379e.add(aVar.f383a);
            try {
                e.this.b(num.intValue(), aVar.f384b, i10, (a) null);
            } catch (Exception e10) {
                e.this.f379e.remove(aVar.f383a);
                throw e10;
            }
        } else {
            StringBuilder a10 = android.support.v4.media.a.a("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            a10.append(aVar.f384b);
            a10.append(" and input ");
            a10.append(i10);
            a10.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(a10.toString());
        }
    }

    public abstract void b();
}
