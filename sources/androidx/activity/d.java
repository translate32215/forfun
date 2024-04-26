package androidx.activity;

import android.os.Bundle;
import androidx.activity.result.e;
import androidx.fragment.app.a0;
import androidx.fragment.app.q;
import androidx.lifecycle.i0;
import androidx.lifecycle.o;
import java.util.ArrayList;
import w1.a;

public final /* synthetic */ class d implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f365a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f366b;

    public /* synthetic */ d(ComponentActivity componentActivity) {
        this.f366b = componentActivity;
    }

    public /* synthetic */ d(a0 a0Var) {
        this.f366b = a0Var;
    }

    public /* synthetic */ d(q qVar) {
        this.f366b = qVar;
    }

    public /* synthetic */ d(i0 i0Var) {
        this.f366b = i0Var;
    }

    public final Bundle a() {
        switch (this.f365a) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) this.f366b;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                e eVar = componentActivity.f330h;
                eVar.getClass();
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(eVar.f377c.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(eVar.f377c.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(eVar.f379e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) eVar.f382h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", eVar.f375a);
                return bundle;
            case 1:
                q qVar = (q) this.f366b;
                int i10 = q.A;
                do {
                } while (q.G(qVar.F(), o.c.CREATED));
                qVar.f1832w.f(o.b.ON_STOP);
                return new Bundle();
            case 2:
                return ((a0) this.f366b).d0();
            default:
                return i0.a((i0) this.f366b);
        }
    }
}
