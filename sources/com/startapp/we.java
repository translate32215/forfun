package com.startapp;

import android.text.TextUtils;
import com.startapp.ee;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: Sta */
public class we extends wd {
    public we(ee.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    public void a(String str) {
        pd pdVar;
        if (!TextUtils.isEmpty(str) && (pdVar = pd.f11607c) != null) {
            for (T t10 : Collections.unmodifiableCollection(pdVar.f11608a)) {
                if (this.f12770c.contains(t10.f11681h)) {
                    t10.f11678e.b(str, this.f12772e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public Object doInBackground(Object[] objArr) {
        if (de.c(this.f12771d, ((vd) this.f10338b).f12711a)) {
            return null;
        }
        ee.b bVar = this.f10338b;
        JSONObject jSONObject = this.f12771d;
        ((vd) bVar).f12711a = jSONObject;
        return jSONObject.toString();
    }
}
