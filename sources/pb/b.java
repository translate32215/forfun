package pb;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import mb.h;
import org.json.JSONObject;
import pb.a;
import qb.a;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final a f23971a;

    public b(a aVar) {
        this.f23971a = aVar;
    }

    public JSONObject a(View view) {
        return a.b(0, 0, 0, 0);
    }

    public void a(View view, JSONObject jSONObject, a.C0214a aVar, boolean z10) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        ob.a aVar2 = ob.a.f23656c;
        if (aVar2 != null) {
            Collection<h> b10 = aVar2.b();
            IdentityHashMap identityHashMap = new IdentityHashMap((b10.size() * 2) + 3);
            for (h f10 : b10) {
                View f11 = f10.f();
                if (f11 != null) {
                    boolean z11 = false;
                    if ((Build.VERSION.SDK_INT < 19 || f11.isAttachedToWindow()) && f11.isShown()) {
                        View view2 = f11;
                        while (true) {
                            if (view2 == null) {
                                z11 = true;
                                break;
                            } else if (view2.getAlpha() == 0.0f) {
                                break;
                            } else {
                                ViewParent parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                            }
                        }
                    }
                    if (z11 && (rootView = f11.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        float z12 = Build.VERSION.SDK_INT >= 21 ? rootView.getZ() : 0.0f;
                        int size = arrayList.size();
                        while (size > 0) {
                            int i10 = size - 1;
                            if ((Build.VERSION.SDK_INT >= 21 ? ((View) arrayList.get(i10)).getZ() : 0.0f) <= z12) {
                                break;
                            }
                            size = i10;
                        }
                        arrayList.add(size, rootView);
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((tb.a) aVar).a((View) it.next(), this.f23971a, jSONObject);
        }
    }
}
