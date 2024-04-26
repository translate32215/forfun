package q6;

import java.util.Collections;
import java.util.Set;

/* compiled from: WebvttCssStyle */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f24164a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f24165b = "";

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f24166c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    public String f24167d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f24168e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f24169f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24170g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f24171h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f24172i = false;

    /* renamed from: j  reason: collision with root package name */
    public int f24173j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f24174k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f24175l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f24176m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f24177n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f24178o = -1;

    /* renamed from: p  reason: collision with root package name */
    public boolean f24179p = false;

    public static int b(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public int a() {
        int i10 = this.f24175l;
        if (i10 == -1 && this.f24176m == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f24176m == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }
}
