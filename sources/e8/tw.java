package e8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.sd;
import f7.h0;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class tw implements dy<sw> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16814a;

    /* renamed from: b  reason: collision with root package name */
    public final o50 f16815b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f16816c;

    public tw(o50 o50, Context context, int i10) {
        this.f16814a = i10;
        if (i10 != 1) {
            this.f16815b = o50;
            this.f16816c = context;
            return;
        }
        this.f16815b = o50;
        this.f16816c = context;
    }

    public static Bundle a(Context context, JSONArray jSONArray) {
        Object obj;
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i11 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i11 != 0) {
                String[] split = optString2.split("/");
                if (split.length > 2 || split.length == 0) {
                    obj = null;
                } else {
                    if (split.length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i12 = sd.f8120a[i11 - 1];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3 && (obj instanceof Boolean)) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public final p50 b() {
        switch (this.f16814a) {
            case 0:
                return this.f16815b.i(new wy(this));
            default:
                return this.f16815b.i(new h0(this));
        }
    }
}
