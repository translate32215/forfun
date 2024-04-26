package pb;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import pb.a;
import qb.a;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f23972a = new int[2];

    public JSONObject a(View view) {
        if (view == null) {
            return a.b(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f23972a);
        int[] iArr = this.f23972a;
        return a.b(iArr[0], iArr[1], width, height);
    }

    public void a(View view, JSONObject jSONObject, a.C0214a aVar, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i10 = 0;
            if (!z10 || Build.VERSION.SDK_INT < 21) {
                while (i10 < viewGroup.getChildCount()) {
                    ((tb.a) aVar).a(viewGroup.getChildAt(i10), this, jSONObject);
                    i10++;
                }
                return;
            }
            HashMap hashMap = new HashMap();
            while (i10 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i10);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i10++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((tb.a) aVar).a((View) it2.next(), this, jSONObject);
                }
            }
        }
    }
}
