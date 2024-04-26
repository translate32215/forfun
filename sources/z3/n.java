package z3;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.i;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* compiled from: RequestManagerFragment */
public class n extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final a f28250a;

    /* renamed from: b  reason: collision with root package name */
    public final p f28251b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final Set<n> f28252c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public i f28253d;

    /* renamed from: e  reason: collision with root package name */
    public n f28254e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f28255f;

    /* compiled from: RequestManagerFragment */
    public class a implements p {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + n.this + "}";
        }
    }

    public n() {
        a aVar = new a();
        this.f28250a = aVar;
    }

    public final void a(Activity activity) {
        b();
        o oVar = b.b(activity).f4888f;
        oVar.getClass();
        n h10 = oVar.h(activity.getFragmentManager(), (Fragment) null);
        this.f28254e = h10;
        if (!equals(h10)) {
            this.f28254e.f28252c.add(this);
        }
    }

    public final void b() {
        n nVar = this.f28254e;
        if (nVar != null) {
            nVar.f28252c.remove(this);
            this.f28254e = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f28250a.c();
        b();
    }

    public void onDetach() {
        super.onDetach();
        b();
    }

    public void onStart() {
        super.onStart();
        this.f28250a.d();
    }

    public void onStop() {
        super.onStop();
        this.f28250a.e();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f28255f;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
