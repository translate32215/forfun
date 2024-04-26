package d;

import android.content.Context;
import android.content.Intent;
import d.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.g;
import ld.e;
import ld.i;
import ld.o;
import ld.s;
import ld.t;
import ud.k;

/* compiled from: ActivityResultContracts.kt */
public final class b extends a<String[], Map<String, Boolean>> {
    public Intent a(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        k.f(context, "context");
        k.f(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        k.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    public a.C0125a b(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        k.f(context, "context");
        k.f(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new a.C0125a(o.f21257a);
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(d0.a.a(context, strArr[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        int a10 = s.a(strArr.length);
        if (a10 < 16) {
            a10 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a10);
        for (String put : strArr) {
            linkedHashMap.put(put, Boolean.TRUE);
        }
        return new a.C0125a(linkedHashMap);
    }

    public Object c(int i10, Intent intent) {
        if (i10 != -1) {
            return o.f21257a;
        }
        if (intent == null) {
            return o.f21257a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return o.f21257a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        int length = intArrayExtra.length;
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i11] == 0));
        }
        List f10 = e.f(stringArrayExtra);
        k.f(f10, "<this>");
        k.f(arrayList, "other");
        Iterator it = ((ArrayList) f10).iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(i.f(f10, 10), i.f(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new g(it.next(), it2.next()));
        }
        return t.c(arrayList2);
    }
}
