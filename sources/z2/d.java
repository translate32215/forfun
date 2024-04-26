package z2;

import b3.l;
import java.util.List;
import o1.q;

/* compiled from: FontCharacter */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<l> f28229a;

    /* renamed from: b  reason: collision with root package name */
    public final char f28230b;

    /* renamed from: c  reason: collision with root package name */
    public final double f28231c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28232d;

    /* renamed from: e  reason: collision with root package name */
    public final String f28233e;

    public d(List<l> list, char c10, double d10, double d11, String str, String str2) {
        this.f28229a = list;
        this.f28230b = c10;
        this.f28231c = d11;
        this.f28232d = str;
        this.f28233e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + q.a(str, (c10 + 0) * 31, 31);
    }

    public int hashCode() {
        return a(this.f28230b, this.f28233e, this.f28232d);
    }
}
