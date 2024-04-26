package m4;

import e.j;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import l4.b;
import o4.d;

/* compiled from: CCTDestination */
public final class a implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final String f21696c = j.c("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d  reason: collision with root package name */
    public static final Set<b> f21697d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{new b("proto"), new b("json")})));

    /* renamed from: e  reason: collision with root package name */
    public static final a f21698e;

    /* renamed from: a  reason: collision with root package name */
    public final String f21699a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21700b;

    static {
        String c10 = j.c("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String c11 = j.c("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f21698e = new a(c10, c11);
    }

    public a(String str, String str2) {
        this.f21699a = str;
        this.f21700b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public byte[] b() {
        String str = this.f21700b;
        if (str == null && this.f21699a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f21699a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public Set<b> c() {
        return f21697d;
    }
}
