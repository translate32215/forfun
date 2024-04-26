package androidx.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.e;
import androidx.fragment.app.p;
import androidx.fragment.app.q;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.Random;

public final /* synthetic */ class b implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f361a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f362b;

    public /* synthetic */ b(ComponentActivity componentActivity) {
        this.f362b = componentActivity;
    }

    public /* synthetic */ b(q qVar) {
        this.f362b = qVar;
    }

    public final void a(Context context) {
        switch (this.f361a) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) this.f362b;
                Bundle a10 = componentActivity.f327e.f26867b.a("android:support:activity-result");
                if (a10 != null) {
                    e eVar = componentActivity.f330h;
                    eVar.getClass();
                    ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        eVar.f379e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        eVar.f375a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        eVar.f382h.putAll(a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                            String str = stringArrayList.get(i10);
                            if (eVar.f377c.containsKey(str)) {
                                Integer remove = eVar.f377c.remove(str);
                                if (!eVar.f382h.containsKey(str)) {
                                    eVar.f376b.remove(remove);
                                }
                            }
                            int intValue = integerArrayList.get(i10).intValue();
                            String str2 = stringArrayList.get(i10);
                            eVar.f376b.put(Integer.valueOf(intValue), str2);
                            eVar.f377c.put(str2, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                v<?> vVar = ((q) this.f362b).f1831v.f1871a;
                vVar.f1876d.b(vVar, vVar, (p) null);
                return;
        }
    }
}
