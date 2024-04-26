package e8;

import androidx.appcompat.widget.o;
import com.google.android.gms.internal.ads.n7;
import com.google.android.gms.internal.ads.q7;
import d7.l;
import java.util.Map;
import l0.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hb implements f3<ia> {
    public static Integer a(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb2 = new StringBuilder(o.a(str2, str.length() + 39));
            sb2.append("Precache invalid numeric parameter '");
            sb2.append(str);
            sb2.append("': ");
            sb2.append(str2);
            e.K(sb2.toString());
            return null;
        }
    }

    public final void f(Object obj, Map map) {
        q7 q7Var;
        ia iaVar = (ia) obj;
        if (e.h(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 15);
            sb2.append("Precache GMSG: ");
            sb2.append(valueOf);
            e.E(sb2.toString());
        }
        bb bbVar = l.B.f13209z;
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            Integer a10 = a(map, "periodicReportIntervalMs");
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            strArr2[i10] = jSONArray.getString(i10);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        e.K(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (bb.f(iaVar) != null) {
                    e.K("Precache task is already running.");
                    return;
                } else if (iaVar.q() == null) {
                    e.K("Precache requires a dependency provider.");
                    return;
                } else {
                    ja jaVar = new ja((String) map.get("flags"));
                    Integer a11 = a(map, "player");
                    if (a11 == null) {
                        a11 = 0;
                    }
                    if (a10 != null) {
                        iaVar.d0(a10.intValue());
                    }
                    int intValue = a11.intValue();
                    ((wa) iaVar.q().f13160a).getClass();
                    if (intValue > 0) {
                        int i11 = n7.C;
                        if (i11 < jaVar.f15114g) {
                            q7Var = new nb(iaVar, jaVar);
                        } else if (i11 < jaVar.f15109b) {
                            q7Var = new ob(iaVar, jaVar);
                        } else {
                            q7Var = new mb(iaVar);
                        }
                    } else {
                        q7Var = new jb(iaVar);
                    }
                    new za(iaVar, q7Var, str, strArr).b();
                }
            } else {
                za f10 = bb.f(iaVar);
                if (f10 != null) {
                    q7Var = f10.f17701c;
                } else {
                    e.K("Precache must specify a source.");
                    return;
                }
            }
            Integer a12 = a(map, "minBufferMs");
            if (a12 != null) {
                q7Var.m(a12.intValue());
            }
            Integer a13 = a(map, "maxBufferMs");
            if (a13 != null) {
                q7Var.n(a13.intValue());
            }
            Integer a14 = a(map, "bufferForPlaybackMs");
            if (a14 != null) {
                q7Var.o(a14.intValue());
            }
            Integer a15 = a(map, "bufferForPlaybackAfterRebufferMs");
            if (a15 != null) {
                q7Var.p(a15.intValue());
            }
        } else if (!bb.c(iaVar)) {
            e.K("Precache abort but no precache task running.");
        }
    }
}
