package com.google.android.gms.internal.ads;

import e8.ul;
import e8.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q2 {
    public q2(int i10) {
    }

    public static List<String> a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            arrayList.add(optJSONArray.getString(i10));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static <T> Set<ul<T>> b(T t10, Executor executor) {
        if (((Boolean) v0.f17011a.b()).booleanValue()) {
            return Collections.singleton(new ul(t10, executor));
        }
        return Collections.emptySet();
    }
}
