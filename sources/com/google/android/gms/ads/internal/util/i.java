package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import e.f;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class i {
    public static String a(j jVar) {
        if (jVar != null) {
            StringWriter stringWriter = new StringWriter();
            try {
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                e(jsonWriter, jVar);
                jsonWriter.close();
                return stringWriter.toString();
            } catch (IOException e10) {
                e.C("Error when writing JSON.", e10);
            }
        }
        return null;
    }

    public static List<String> b(JsonReader jsonReader) throws IllegalStateException, IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static List<String> c(JSONArray jSONArray, List<String> list) throws JSONException {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (jSONArray == null) {
            return list;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            list.add(jSONArray.getString(i10));
        }
        return list;
    }

    public static JSONObject d(JSONObject jSONObject, String... strArr) {
        JSONObject k10 = k(jSONObject, strArr);
        if (k10 == null) {
            return null;
        }
        return k10.optJSONObject(strArr[strArr.length - 1]);
    }

    public static void e(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            jsonWriter.value((String) obj);
        } else if (obj instanceof j) {
            ((j) obj).a(jsonWriter);
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    e(jsonWriter.name((String) key), entry.getValue());
                }
            }
            jsonWriter.endObject();
        } else if (obj instanceof List) {
            jsonWriter.beginArray();
            for (Object e10 : (List) obj) {
                e(jsonWriter, e10);
            }
            jsonWriter.endArray();
        } else {
            jsonWriter.nullValue();
        }
    }

    public static void f(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object obj = jSONArray.get(i10);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    g(jsonWriter, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    f(jsonWriter, (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                    sb2.append("unable to write field: ");
                    sb2.append(valueOf);
                    throw new JSONException(sb2.toString());
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static void g(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    g(jsonWriter.name(next), (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    f(jsonWriter.name(next), (JSONArray) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                    sb2.append("unable to write field: ");
                    sb2.append(valueOf);
                    throw new JSONException(sb2.toString());
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static boolean h(JSONObject jSONObject, String... strArr) {
        JSONObject k10 = k(jSONObject, strArr);
        if (k10 == null) {
            return false;
        }
        return k10.optBoolean(strArr[strArr.length - 1], false);
    }

    public static Map<String, String> i(JsonReader jsonReader) throws IllegalStateException, IOException {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            hashMap.put(jsonReader.nextName(), jsonReader.nextString());
        }
        jsonReader.endObject();
        return hashMap;
    }

    public static JSONObject j(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject k(JSONObject jSONObject, String[] strArr) {
        for (int i10 = 0; i10 < strArr.length - 1; i10++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i10]);
        }
        return jSONObject;
    }

    public static JSONObject l(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, m(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, l(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextString());
            } else {
                String valueOf = String.valueOf(peek);
                throw new IllegalStateException(f.a(valueOf.length() + 23, "unexpected json token: ", valueOf));
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray m(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(m(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(l(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                jSONArray.put(jsonReader.nextString());
            } else {
                String valueOf = String.valueOf(peek);
                throw new IllegalStateException(f.a(valueOf.length() + 23, "unexpected json token: ", valueOf));
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static Bundle n(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i10 = 0;
                        Object obj = null;
                        int i11 = 0;
                        while (obj == null && i11 < length) {
                            obj = !jSONArray.isNull(i11) ? jSONArray.opt(i11) : null;
                            i11++;
                        }
                        if (obj == null) {
                            String valueOf = String.valueOf(next);
                            e.K(valueOf.length() != 0 ? "Expected JSONArray with at least 1 non-null element for key:".concat(valueOf) : new String("Expected JSONArray with at least 1 non-null element for key:"));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i10 < length) {
                                bundleArr[i10] = !jSONArray.isNull(i10) ? n(jSONArray.optJSONObject(i10)) : null;
                                i10++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i10 < length) {
                                dArr[i10] = jSONArray.optDouble(i10);
                                i10++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i10 < length) {
                                strArr[i10] = !jSONArray.isNull(i10) ? jSONArray.optString(i10) : null;
                                i10++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i10 < length) {
                                zArr[i10] = jSONArray.optBoolean(i10);
                                i10++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            e.K(String.format("JSONArray with unsupported type %s for key:%s", new Object[]{obj.getClass().getCanonicalName(), next}));
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, n((JSONObject) opt));
                } else {
                    String valueOf2 = String.valueOf(next);
                    e.K(valueOf2.length() != 0 ? "Unsupported type for key:".concat(valueOf2) : new String("Unsupported type for key:"));
                }
            }
        }
        return bundle;
    }
}
