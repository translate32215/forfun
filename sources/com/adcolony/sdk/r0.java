package com.adcolony.sdk;

import android.support.v4.media.a;
import com.adcolony.sdk.t0;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.f;

public class r0 {
    public static JSONObject a(String str, String str2) {
        String str3;
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            if (str2 == null) {
                str3 = "";
            } else {
                StringBuilder a10 = f.a(str2, ": ");
                a10.append(e10.toString());
                str3 = a10.toString();
            }
            t0.a aVar = new t0.a();
            aVar.f4784a.append(str3);
            aVar.a(t0.f4781f);
            return new JSONObject();
        }
    }

    public static JSONObject b(JSONObject... jSONObjectArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return jSONObjectArr.length > 0 ? jSONObjectArr[0] : new JSONObject();
        }
    }

    public static boolean c(JSONObject jSONObject, String str) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            if (str.equals(keys.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(JSONObject jSONObject, String str, double d10) {
        try {
            jSONObject.put(str, d10);
            return true;
        } catch (JSONException unused) {
            StringBuilder a10 = a.a("JSON error in ADCJSON putDouble(): ");
            a10.append(" with key: " + str);
            a10.append(" and value: " + d10);
            p.f.a(0, 0, a10.toString(), true);
            return false;
        }
    }

    public static boolean e(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
            return true;
        } catch (JSONException e10) {
            StringBuilder a10 = a.a("JSON error in ADCJSON putString(): ");
            a10.append(e10.toString());
            a10.append(" with key: " + str);
            a10.append(" and value: " + str2);
            p.f.a(0, 0, a10.toString(), true);
            return false;
        }
    }

    public static boolean f(JSONObject jSONObject, String str, JSONArray jSONArray) {
        try {
            jSONObject.put(str, jSONArray);
            return true;
        } catch (JSONException e10) {
            StringBuilder a10 = a.a("JSON error in ADCJSON putArray(): ");
            a10.append(e10.toString());
            a10.append(" with key: " + str);
            a10.append(" and value: " + jSONArray);
            p.f.a(0, 0, a10.toString(), true);
            return false;
        }
    }

    public static boolean g(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
            return true;
        } catch (JSONException e10) {
            StringBuilder a10 = a.a("JSON error in ADCJSON putObject(): ");
            a10.append(e10.toString());
            a10.append(" with key: " + str);
            a10.append(" and value: " + jSONObject2);
            p.f.a(0, 0, a10.toString(), true);
            return false;
        }
    }

    public static String[] h(JSONArray jSONArray) {
        String[] strArr = new String[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            strArr[i10] = jSONArray.optString(i10);
        }
        return strArr;
    }

    public static JSONArray i(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        return optJSONArray == null ? new JSONArray() : optJSONArray;
    }

    public static boolean j(JSONObject jSONObject, String str, int i10) {
        try {
            jSONObject.put(str, i10);
            return true;
        } catch (JSONException e10) {
            StringBuilder a10 = a.a("JSON error in ADCJSON putInteger(): ");
            a10.append(e10.toString());
            a10.append(" with key: " + str);
            a10.append(" and value: " + i10);
            p.f.a(0, 0, a10.toString(), true);
            return false;
        }
    }

    public static boolean k(JSONObject jSONObject, String str, boolean z10) {
        try {
            jSONObject.put(str, z10);
            return true;
        } catch (JSONException e10) {
            StringBuilder a10 = a.a("JSON error in ADCJSON putBoolean(): ");
            a10.append(e10.toString());
            a10.append(" with key: " + str);
            a10.append(" and value: " + z10);
            p.f.a(0, 0, a10.toString(), true);
            return false;
        }
    }

    public static JSONObject[] l(JSONArray jSONArray) {
        JSONObject[] jSONObjectArr = new JSONObject[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            jSONObjectArr[i10] = optJSONObject;
        }
        return jSONObjectArr;
    }

    public static JSONObject m(String str) {
        try {
            String sb2 = f.d().k().a(str, false).toString();
            return a(sb2, "loadObject from filepath " + str);
        } catch (IOException e10) {
            t0.a aVar = new t0.a();
            aVar.f4784a.append("IOException in ADCJSON's loadObject: ");
            aVar.f4784a.append(e10.toString());
            aVar.a(t0.f4781f);
            return new JSONObject();
        }
    }

    public static JSONObject n(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    public static boolean o(JSONObject jSONObject, String str) {
        try {
            f.d().k().d(str, jSONObject.toString(), false);
            return true;
        } catch (IOException e10) {
            f.d().l().e(0, 0, "IOException in ADCJSON's saveObject: " + e10.toString(), true);
            return false;
        }
    }
}
