package com.startapp;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public abstract class sb<T> implements pb<List<T>> {
    private static final String LOG_TAG = "sb";
    private final Class<T> itemClass;

    /* compiled from: Sta */
    public class a implements b3<Integer, JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f11723a;

        public a(sb sbVar, Object obj) {
            this.f11723a = obj;
        }

        public Object a(Object obj) {
            try {
                return ((JSONArray) this.f11723a).getJSONObject(((Integer) obj).intValue());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements b3<Integer, JSONObject> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f11724a;

        public b(sb sbVar, Object obj) {
            this.f11724a = obj;
        }

        public Object a(Object obj) {
            try {
                return ((JSONObject) this.f11724a).getJSONObject(((Integer) obj).toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public sb(Class<T> cls) {
        this.itemClass = cls;
    }

    public List<T> parse(Class<List<T>> cls, Object obj) {
        int i10;
        b3 b3Var;
        if (obj instanceof JSONArray) {
            i10 = ((JSONArray) obj).length();
            b3Var = new a(this, obj);
        } else if (!(obj instanceof JSONObject)) {
            return null;
        } else {
            i10 = ((JSONObject) obj).length();
            b3Var = new b(this, obj);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                arrayList.add(i5.a(this.itemClass, (JSONObject) b3Var.a(Integer.valueOf(i11))));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
