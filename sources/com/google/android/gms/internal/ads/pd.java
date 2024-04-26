package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pd {

    /* renamed from: a  reason: collision with root package name */
    public final String f7851a;

    /* renamed from: b  reason: collision with root package name */
    public String f7852b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f7853c = new Bundle();

    public pd(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        Map<String, String> hashMap = new HashMap<>();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            if (nextName.equals("params")) {
                str = jsonReader.nextString();
            } else if (!nextName.equals("signal_dictionary")) {
                jsonReader.skipValue();
            } else {
                hashMap = i.i(jsonReader);
            }
        }
        this.f7851a = str;
        jsonReader.endObject();
        for (Map.Entry next : hashMap.entrySet()) {
            if (!(next.getKey() == null || next.getValue() == null)) {
                this.f7853c.putString((String) next.getKey(), (String) next.getValue());
            }
        }
    }
}
