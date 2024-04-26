package e8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d10 {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f14202a;

    public d10() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) ti0.f16763j.f16769f.a(t.f16553b4));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f14202a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.f14202a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
