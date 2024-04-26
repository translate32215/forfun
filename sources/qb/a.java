package qb;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static WindowManager f24260a;

    /* renamed from: b  reason: collision with root package name */
    public static String[] f24261b = {"x", "y", "width", "height"};

    /* renamed from: c  reason: collision with root package name */
    public static float f24262c = Resources.getSystem().getDisplayMetrics().density;

    public static float a(int i10) {
        return ((float) i10) / f24262c;
    }

    public static JSONObject b(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) a(i10));
            jSONObject.put("y", (double) a(i11));
            jSONObject.put("width", (double) a(i12));
            jSONObject.put("height", (double) a(i13));
        } catch (JSONException e10) {
            e.a.a("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void c(JSONObject jSONObject) {
        float f10;
        float f11 = 0.0f;
        if (f24260a != null) {
            Point point = new Point(0, 0);
            f24260a.getDefaultDisplay().getRealSize(point);
            f11 = a(point.x);
            f10 = a(point.y);
        } else {
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", (double) f11);
            jSONObject.put("height", (double) f10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void d(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            e.a.a("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void e(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean f(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean g(org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            r0 = 1
            if (r10 != 0) goto L_0x0006
            if (r11 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r10 == 0) goto L_0x00a4
            if (r11 != 0) goto L_0x000d
            goto L_0x00a4
        L_0x000d:
            java.lang.String[] r2 = f24261b
            int r3 = r2.length
            r4 = 0
        L_0x0011:
            if (r4 >= r3) goto L_0x0026
            r5 = r2[r4]
            double r6 = r10.optDouble(r5)
            double r8 = r11.optDouble(r5)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0023
            r2 = 0
            goto L_0x0027
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0026:
            r2 = 1
        L_0x0027:
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r10.optString(r2, r3)
            java.lang.String r2 = r11.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r10.optJSONArray(r2)
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r4 != 0) goto L_0x004b
            if (r2 != 0) goto L_0x004b
        L_0x0049:
            r2 = 1
            goto L_0x006c
        L_0x004b:
            boolean r5 = f(r4, r2)
            if (r5 != 0) goto L_0x0053
        L_0x0051:
            r2 = 0
            goto L_0x006c
        L_0x0053:
            r5 = 0
        L_0x0054:
            int r6 = r4.length()
            if (r5 >= r6) goto L_0x0049
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0069
            goto L_0x0051
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x0054
        L_0x006c:
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = "childViews"
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            org.json.JSONArray r11 = r11.optJSONArray(r2)
            if (r10 != 0) goto L_0x007e
            if (r11 != 0) goto L_0x007e
        L_0x007c:
            r10 = 1
            goto L_0x009f
        L_0x007e:
            boolean r2 = f(r10, r11)
            if (r2 != 0) goto L_0x0086
        L_0x0084:
            r10 = 0
            goto L_0x009f
        L_0x0086:
            r2 = 0
        L_0x0087:
            int r3 = r10.length()
            if (r2 >= r3) goto L_0x007c
            org.json.JSONObject r3 = r10.optJSONObject(r2)
            org.json.JSONObject r4 = r11.optJSONObject(r2)
            boolean r3 = g(r3, r4)
            if (r3 != 0) goto L_0x009c
            goto L_0x0084
        L_0x009c:
            int r2 = r2 + 1
            goto L_0x0087
        L_0x009f:
            if (r10 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            return r0
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.a.g(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
