package ke;

import android.support.v4.media.a;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* compiled from: MediaType */
public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f20799d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f20800e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f20801a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20802b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String f20803c;

    public u(String str, String str2, String str3, @Nullable String str4) {
        this.f20801a = str;
        this.f20802b = str2;
        this.f20803c = str4;
    }

    public static u b(String str) {
        Matcher matcher = f20799d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f20800e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder a10 = a.a("Parameter is not formatted correctly: \"");
                    a10.append(str.substring(end));
                    a10.append("\" for: \"");
                    a10.append(str);
                    a10.append('\"');
                    throw new IllegalArgumentException(a10.toString());
                }
            }
            return new u(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    @Nullable
    public static u c(String str) {
        try {
            return b(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public Charset a(@Nullable Charset charset) {
        try {
            String str = this.f20803c;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof u) && ((u) obj).f20801a.equals(this.f20801a);
    }

    public int hashCode() {
        return this.f20801a.hashCode();
    }

    public String toString() {
        return this.f20801a;
    }
}
