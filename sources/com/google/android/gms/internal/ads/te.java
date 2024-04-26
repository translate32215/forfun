package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.i;
import com.google.android.gms.ads.internal.util.j;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class te implements j {

    /* renamed from: a  reason: collision with root package name */
    public final String f8193a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8194b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f8195c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f8196d;

    public te(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject l10 = i.l(jsonReader);
        this.f8196d = l10;
        this.f8193a = l10.optString("ad_html", (String) null);
        this.f8194b = l10.optString("ad_base_url", (String) null);
        this.f8195c = l10.optJSONObject("ad_json");
    }

    public final void a(JsonWriter jsonWriter) throws IOException {
        i.g(jsonWriter, this.f8196d);
    }
}
