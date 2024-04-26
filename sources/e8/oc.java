package e8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;
import t.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class oc {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f15779a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f15780b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a() {
        String str = (String) ti0.f16763j.f16769f.a(t.G);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            StringBuilder a10 = f.a("<script>", "Object.defineProperty(window,'MRAID_ENV',{get:function(){return ");
            a10.append(jSONObject.toString());
            a10.append("}});");
            a10.append("</script>");
            return a10.toString();
        } catch (JSONException e10) {
            e.D("Unable to build MRAID_ENV", e10);
            return null;
        }
    }

    public static String b(String str, String... strArr) {
        if (strArr.length == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = f15779a.matcher(str);
        int i10 = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb2.append(str.substring(0, end));
            int length = strArr.length;
            while (i10 < length) {
                String str2 = strArr[i10];
                if (str2 != null) {
                    sb2.append(str2);
                }
                i10++;
            }
            sb2.append(str.substring(end));
        } else {
            if (!f15780b.matcher(str).find()) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    String str3 = strArr[i10];
                    if (str3 != null) {
                        sb2.append(str3);
                    }
                    i10++;
                }
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
