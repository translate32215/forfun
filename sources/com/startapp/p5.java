package com.startapp;

import android.text.TextUtils;
import com.startapp.sdk.common.SDKException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class p5 extends m8 {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f11572a = new JSONObject();

    public void a(String str, Object obj, boolean z10, boolean z11) throws SDKException {
        if (z10 && obj == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
            try {
                this.f11572a.put(str, obj);
            } catch (JSONException e10) {
                if (z10) {
                    throw new SDKException(str, e10);
                }
            }
        }
    }

    public String toString() {
        return this.f11572a.toString();
    }

    public void a(String str, Set<String> set, boolean z10, boolean z11) throws SDKException {
        if (z10 && (set == null || set.size() == 0)) {
            throw new SDKException(str, (Throwable) null);
        } else if (set != null && set.size() > 0) {
            try {
                this.f11572a.put(str, new JSONArray(set));
            } catch (JSONException e10) {
                if (z10) {
                    throw new SDKException(str, e10);
                }
            }
        }
    }
}
