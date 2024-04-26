package v7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.i;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Uri f26552e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f26553a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26554b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26555c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f26556d;

    public c0(String str, String str2, int i10, boolean z10) {
        i.e(str);
        this.f26553a = str;
        i.e(str2);
        this.f26554b = str2;
        this.f26555c = i10;
        this.f26556d = z10;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        if (this.f26553a == null) {
            return new Intent().setComponent((ComponentName) null);
        }
        if (this.f26556d) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f26553a);
            try {
                bundle = context.getContentResolver().call(f26552e, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f26553a)));
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f26553a).setPackage(this.f26554b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return h.a(this.f26553a, c0Var.f26553a) && h.a(this.f26554b, c0Var.f26554b) && h.a((Object) null, (Object) null) && this.f26555c == c0Var.f26555c && this.f26556d == c0Var.f26556d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26553a, this.f26554b, null, Integer.valueOf(this.f26555c), Boolean.valueOf(this.f26556d)});
    }

    public final String toString() {
        String str = this.f26553a;
        if (str != null) {
            return str;
        }
        i.h(null);
        throw null;
    }
}
