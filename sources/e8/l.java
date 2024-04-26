package e8;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class l<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f15345a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15346b;

    /* renamed from: c  reason: collision with root package name */
    public final T f15347c;

    public l(int i10, String str, Object obj, k kVar) {
        this.f15345a = i10;
        this.f15346b = str;
        this.f15347c = obj;
        ti0.f16763j.f16767d.f16217a.add(this);
    }

    public static l<Boolean> a(int i10, String str, Boolean bool) {
        return new k(i10, str, bool);
    }

    public static l b(String str, int i10) {
        return new n(str, Integer.valueOf(i10));
    }

    public static l c(String str, String str2) {
        return new o(str, str2);
    }

    public static l g(String str) {
        o oVar = new o(str, (String) null);
        ti0.f16763j.f16767d.f16219c.add(oVar);
        return oVar;
    }

    public static l h(String str, long j10) {
        return new m(str, Long.valueOf(j10));
    }

    public abstract T d(SharedPreferences sharedPreferences);

    public abstract T e(Bundle bundle);

    public abstract void f(SharedPreferences.Editor editor, T t10);

    public abstract T i(JSONObject jSONObject);
}
