package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.d;
import eb.e;
import ga.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseRemoteConfig */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9752a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9753b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f9754c;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f9755d;

    /* renamed from: e  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f9756e;

    /* renamed from: f  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f9757f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f9758g;

    /* renamed from: h  reason: collision with root package name */
    public final e f9759h;

    /* renamed from: i  reason: collision with root package name */
    public final d f9760i;

    /* renamed from: j  reason: collision with root package name */
    public final va.c f9761j;

    public a(Context context, com.google.firebase.a aVar, va.c cVar, c cVar2, Executor executor, com.google.firebase.remoteconfig.internal.a aVar2, com.google.firebase.remoteconfig.internal.a aVar3, com.google.firebase.remoteconfig.internal.a aVar4, com.google.firebase.remoteconfig.internal.c cVar3, e eVar, d dVar) {
        this.f9752a = context;
        this.f9761j = cVar;
        this.f9753b = cVar2;
        this.f9754c = executor;
        this.f9755d = aVar2;
        this.f9756e = aVar3;
        this.f9757f = aVar4;
        this.f9758g = cVar3;
        this.f9759h = eVar;
        this.f9760i = dVar;
    }

    public static List<Map<String, String>> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }
}
