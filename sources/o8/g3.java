package o8;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.measurement.internal.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f23215a = "default_event_parameters";

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f23216b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    public Bundle f23217c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j f23218d;

    public g3(j jVar) {
        this.f23218d = jVar;
        i.e("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11.f23218d.f8864a.d().f8797f.a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a1 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099 A[Catch:{ NumberFormatException | JSONException -> 0x00a1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.f23217c
            if (r0 == 0) goto L_0x0006
            goto L_0x00ce
        L_0x0006:
            com.google.android.gms.measurement.internal.j r0 = r11.f23218d
            android.content.SharedPreferences r0 = r0.o()
            java.lang.String r1 = r11.f23215a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00c6
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b7 }
            r1.<init>()     // Catch:{ JSONException -> 0x00b7 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b7 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00b7 }
            r0 = 0
            r3 = 0
        L_0x0021:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00b7 }
            if (r3 >= r4) goto L_0x00b4
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L_0x005e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0054
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 0
            goto L_0x0069
        L_0x0054:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 2
            goto L_0x0069
        L_0x005e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = 1
            goto L_0x0069
        L_0x0068:
            r7 = -1
        L_0x0069:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x0099
            if (r7 == r10) goto L_0x008d
            if (r7 == r9) goto L_0x0081
            com.google.android.gms.measurement.internal.j r4 = r11.f23218d     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            com.google.android.gms.measurement.internal.l r4 = r4.f8864a     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            com.google.android.gms.measurement.internal.h r4 = r4.d()     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            o8.a3 r4 = r4.f8797f     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x0081:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x008d:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x0099:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x00a1:
            com.google.android.gms.measurement.internal.j r4 = r11.f23218d     // Catch:{ JSONException -> 0x00b7 }
            com.google.android.gms.measurement.internal.l r4 = r4.f8864a     // Catch:{ JSONException -> 0x00b7 }
            com.google.android.gms.measurement.internal.h r4 = r4.d()     // Catch:{ JSONException -> 0x00b7 }
            o8.a3 r4 = r4.f8797f     // Catch:{ JSONException -> 0x00b7 }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.a(r5)     // Catch:{ JSONException -> 0x00b7 }
        L_0x00b0:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x00b4:
            r11.f23217c = r1     // Catch:{ JSONException -> 0x00b7 }
            goto L_0x00c6
        L_0x00b7:
            com.google.android.gms.measurement.internal.j r0 = r11.f23218d
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            com.google.android.gms.measurement.internal.h r0 = r0.d()
            o8.a3 r0 = r0.f8797f
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.a(r1)
        L_0x00c6:
            android.os.Bundle r0 = r11.f23217c
            if (r0 != 0) goto L_0x00ce
            android.os.Bundle r0 = r11.f23216b
            r11.f23217c = r0
        L_0x00ce:
            android.os.Bundle r0 = r11.f23217c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.g3.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f23218d.o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f23215a);
        } else {
            String str = this.f23215a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.f23218d.f8864a.d().f8797f.b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        this.f23218d.f8864a.d().f8797f.b("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f23217c = bundle;
    }
}
