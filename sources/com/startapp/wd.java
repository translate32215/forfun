package com.startapp;

import com.startapp.ee;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: Sta */
public abstract class wd extends ee {

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<String> f12770c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f12771d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12772e;

    public wd(ee.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar);
        this.f12770c = new HashSet<>(hashSet);
        this.f12771d = jSONObject;
        this.f12772e = j10;
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
