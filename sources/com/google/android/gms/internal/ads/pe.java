package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pe {

    /* renamed from: a  reason: collision with root package name */
    public final int f7854a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7855b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7856c;

    public pe(int i10, int i11, boolean z10) {
        this.f7854a = i10;
        this.f7855b = i11;
        this.f7856c = z10;
    }

    public static List<pe> a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i10 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i11 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z10 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new pe(i10, i11, z10));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
