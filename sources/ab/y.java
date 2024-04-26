package ab;

import android.util.Log;
import androidx.fragment.app.a;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class y {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f255d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f256a;

    /* renamed from: b  reason: collision with root package name */
    public final String f257b;

    /* renamed from: c  reason: collision with root package name */
    public final String f258c;

    public y(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str}));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f255d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f256a = str3;
        this.f257b = str;
        this.f258c = a.a(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()), str, "!", str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!this.f256a.equals(yVar.f256a) || !this.f257b.equals(yVar.f257b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f257b, this.f256a});
    }
}
