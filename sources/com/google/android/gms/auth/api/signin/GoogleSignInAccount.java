package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o1.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new p7.a();

    /* renamed from: a  reason: collision with root package name */
    public final int f5721a;

    /* renamed from: b  reason: collision with root package name */
    public String f5722b;

    /* renamed from: c  reason: collision with root package name */
    public String f5723c;

    /* renamed from: d  reason: collision with root package name */
    public String f5724d;

    /* renamed from: e  reason: collision with root package name */
    public String f5725e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f5726f;

    /* renamed from: g  reason: collision with root package name */
    public String f5727g;

    /* renamed from: h  reason: collision with root package name */
    public long f5728h;

    /* renamed from: i  reason: collision with root package name */
    public String f5729i;

    /* renamed from: r  reason: collision with root package name */
    public List<Scope> f5730r;

    /* renamed from: s  reason: collision with root package name */
    public String f5731s;

    /* renamed from: t  reason: collision with root package name */
    public String f5732t;

    /* renamed from: u  reason: collision with root package name */
    public Set<Scope> f5733u = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List<Scope> list, String str7, String str8) {
        this.f5721a = i10;
        this.f5722b = str;
        this.f5723c = str2;
        this.f5724d = str3;
        this.f5725e = str4;
        this.f5726f = uri;
        this.f5727g = str5;
        this.f5728h = j10;
        this.f5729i = str6;
        this.f5730r = list;
        this.f5731s = str7;
        this.f5732t = str8;
    }

    public static GoogleSignInAccount j(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        i.e(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f5727g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f5729i.equals(this.f5729i) && googleSignInAccount.i().equals(i());
    }

    public int hashCode() {
        return i().hashCode() + q.a(this.f5729i, 527, 31);
    }

    public Set<Scope> i() {
        HashSet hashSet = new HashSet(this.f5730r);
        hashSet.addAll(this.f5733u);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f5721a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.g(parcel, 2, this.f5722b, false);
        j.g(parcel, 3, this.f5723c, false);
        j.g(parcel, 4, this.f5724d, false);
        j.g(parcel, 5, this.f5725e, false);
        j.f(parcel, 6, this.f5726f, i10, false);
        j.g(parcel, 7, this.f5727g, false);
        long j10 = this.f5728h;
        parcel.writeInt(524296);
        parcel.writeLong(j10);
        j.g(parcel, 9, this.f5729i, false);
        j.k(parcel, 10, this.f5730r, false);
        j.g(parcel, 11, this.f5731s, false);
        j.g(parcel, 12, this.f5732t, false);
        j.m(parcel, l10);
    }
}
