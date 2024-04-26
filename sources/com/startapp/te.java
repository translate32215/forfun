package com.startapp;

import com.startapp.ee;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: Sta */
public class te extends wd {
    public te(ee.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    public void a(String str) {
        pd pdVar = pd.f11607c;
        if (pdVar != null) {
            for (T t10 : Collections.unmodifiableCollection(pdVar.f11608a)) {
                if (this.f12770c.contains(t10.f11681h)) {
                    t10.f11678e.a(str, this.f12772e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public Object doInBackground(Object[] objArr) {
        return this.f12771d.toString();
    }
}
