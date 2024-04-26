package ub;

import java.util.HashSet;
import org.json.JSONObject;
import ub.b;

public abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<String> f26168c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f26169d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26170e;

    public a(b.C0259b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar);
        this.f26168c = new HashSet<>(hashSet);
        this.f26169d = jSONObject;
        this.f26170e = j10;
    }
}
