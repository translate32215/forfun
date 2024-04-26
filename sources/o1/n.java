package o1;

import android.net.Uri;
import android.os.Bundle;
import ce.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.g;
import kd.d;
import kd.e;
import ld.h;
import ud.k;
import ud.l;

/* compiled from: NavDeepLink.kt */
public final class n {
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f22771m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a  reason: collision with root package name */
    public final String f22772a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22773b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22774c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f22775d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, a> f22776e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public String f22777f;

    /* renamed from: g  reason: collision with root package name */
    public final d f22778g = e.b(new c(this));

    /* renamed from: h  reason: collision with root package name */
    public boolean f22779h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22780i;

    /* renamed from: j  reason: collision with root package name */
    public String f22781j;

    /* renamed from: k  reason: collision with root package name */
    public final d f22782k = e.b(new b(this));

    /* renamed from: l  reason: collision with root package name */
    public boolean f22783l;

    /* compiled from: NavDeepLink.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f22784a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f22785b = new ArrayList();
    }

    /* compiled from: NavDeepLink.kt */
    public static final class b extends l implements td.a<Pattern> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ n f22786b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n nVar) {
            super(0);
            this.f22786b = nVar;
        }

        public Object d() {
            String str = this.f22786b.f22781j;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    public static final class c extends l implements td.a<Pattern> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ n f22787b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(n nVar) {
            super(0);
            this.f22787b = nVar;
        }

        public Object d() {
            String str = this.f22787b.f22777f;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    public n(String str, String str2, String str3) {
        List<Object> list;
        List list2;
        boolean z10;
        this.f22772a = str;
        this.f22773b = str2;
        this.f22774c = str3;
        boolean z11 = true;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f22779h = parse.getQuery() != null;
            StringBuilder sb2 = new StringBuilder("^");
            if (!f22771m.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f22779h) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    k.e(compile, "fillInPattern");
                    this.f22783l = a(substring, sb2, compile);
                }
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    if (queryParameter == null) {
                        this.f22780i = z11;
                        queryParameter = next;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    a aVar = new a();
                    int i10 = 0;
                    while (matcher2.find()) {
                        String group = matcher2.group(z11 ? 1 : 0);
                        if (group != null) {
                            k.f(group, "name");
                            aVar.f22785b.add(group);
                            k.e(queryParameter, "queryParam");
                            String substring2 = queryParameter.substring(i10, matcher2.start());
                            k.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb3.append(Pattern.quote(substring2));
                            sb3.append("(.+?)?");
                            i10 = matcher2.end();
                            z11 = true;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i10 < queryParameter.length()) {
                        String substring3 = queryParameter.substring(i10);
                        k.e(substring3, "this as java.lang.String).substring(startIndex)");
                        sb3.append(Pattern.quote(substring3));
                    }
                    String sb4 = sb3.toString();
                    k.e(sb4, "argRegex.toString()");
                    aVar.f22784a = i.g(sb4, ".*", "\\E.*\\Q", false, 4);
                    Map<String, a> map = this.f22776e;
                    k.e(next, "paramName");
                    map.put(next, aVar);
                    z11 = true;
                }
            } else {
                k.e(compile, "fillInPattern");
                this.f22783l = a(str, sb2, compile);
            }
            String sb5 = sb2.toString();
            k.e(sb5, "uriRegex.toString()");
            this.f22777f = i.g(sb5, ".*", "\\E.*\\Q", false, 4);
        }
        if (this.f22774c == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f22774c).matches()) {
            String str4 = this.f22774c;
            k.f(str4, "mimeType");
            k.f("/", "pattern");
            Pattern compile2 = Pattern.compile("/");
            k.e(compile2, "compile(pattern)");
            k.f(compile2, "nativePattern");
            k.f(str4, "input");
            ce.k.r(0);
            Matcher matcher3 = compile2.matcher(str4);
            if (!matcher3.find()) {
                list = h.c(str4.toString());
            } else {
                ArrayList arrayList = new ArrayList(10);
                int i11 = 0 - 1;
                int i12 = 0;
                do {
                    arrayList.add(str4.subSequence(i12, matcher3.start()).toString());
                    i12 = matcher3.end();
                    if ((i11 >= 0 && arrayList.size() == i11) || !matcher3.find()) {
                        arrayList.add(str4.subSequence(i12, str4.length()).toString());
                        list = arrayList;
                    }
                    arrayList.add(str4.subSequence(i12, matcher3.start()).toString());
                    i12 = matcher3.end();
                    break;
                } while (!matcher3.find());
                arrayList.add(str4.subSequence(i12, str4.length()).toString());
                list = arrayList;
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (((String) listIterator.previous()).length() == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        int nextIndex = listIterator.nextIndex() + 1;
                        k.f(list, "<this>");
                        if (!(nextIndex >= 0)) {
                            throw new IllegalArgumentException(g.a("Requested element count ", nextIndex, " is less than zero.").toString());
                        } else if (nextIndex == 0) {
                            list2 = ld.n.f21256a;
                        } else if (nextIndex >= list.size()) {
                            list2 = ld.l.w(list);
                        } else if (nextIndex == 1) {
                            k.f(list, "<this>");
                            list2 = h.c(ld.l.k(list));
                        } else {
                            ArrayList arrayList2 = new ArrayList(nextIndex);
                            int i13 = 0;
                            for (Object add : list) {
                                arrayList2.add(add);
                                i13++;
                                if (i13 == nextIndex) {
                                    break;
                                }
                            }
                            list2 = h.d(arrayList2);
                        }
                    }
                }
                this.f22781j = i.g("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4);
                return;
            }
            list2 = ld.n.f21256a;
            this.f22781j = i.g("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4);
            return;
        }
        throw new IllegalArgumentException(androidx.activity.e.a(android.support.v4.media.a.a("The given mimeType "), this.f22774c, " does not match to required \"type/subtype\" format").toString());
    }

    public final boolean a(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z10 = !ce.k.i(str, ".*", false);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f22775d.add(group);
                String substring = str.substring(i10, matcher.start());
                k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(substring));
                sb2.append("([^/]+?)");
                i10 = matcher.end();
                z10 = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i10 < str.length()) {
            String substring2 = str.substring(i10);
            k.e(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(substring2));
        }
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        return z10;
    }

    public final boolean b(Bundle bundle, String str, String str2, g gVar) {
        if (gVar != null) {
            a0<Object> a0Var = gVar.f22687a;
            a0Var.getClass();
            k.f(str, "key");
            a0Var.d(bundle, str, a0Var.c(str2));
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!k.a(this.f22772a, nVar.f22772a) || !k.a(this.f22773b, nVar.f22773b) || !k.a(this.f22774c, nVar.f22774c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f22772a;
        int i10 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f22773b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22774c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }
}
