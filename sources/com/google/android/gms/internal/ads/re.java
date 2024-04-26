package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.util.i;
import e8.t;
import e8.ti0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class re {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f8029a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8030b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8031c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8032d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8033e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8034f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8035g;

    /* renamed from: h  reason: collision with root package name */
    public final se f8036h;

    public re(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        int i10 = 0;
        long j10 = 0;
        se seVar = null;
        boolean z10 = false;
        String str = "";
        String str2 = str;
        int i11 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = i.b(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j10 = jsonReader.nextLong();
            } else {
                if (!((Boolean) ti0.f16763j.f16769f.a(t.f16697z4)).booleanValue() || !"public_error".equals(nextName) || jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                    jsonReader.skipValue();
                } else {
                    seVar = new se(jsonReader);
                }
            }
        }
        jsonReader.endObject();
        this.f8029a = emptyList;
        this.f8031c = i10;
        this.f8030b = str;
        this.f8032d = str2;
        this.f8033e = i11;
        this.f8034f = j10;
        this.f8036h = seVar;
        this.f8035g = z10;
    }
}
