package f6;

import android.net.Uri;
import c5.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import x4.b0;
import y5.c;

/* compiled from: HlsMasterPlaylist */
public final class d extends f {

    /* renamed from: n  reason: collision with root package name */
    public static final d f18157n = new d("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (b0) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List<Uri> f18158d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f18159e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f18160f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f18161g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f18162h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a> f18163i;

    /* renamed from: j  reason: collision with root package name */
    public final b0 f18164j;

    /* renamed from: k  reason: collision with root package name */
    public final List<b0> f18165k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f18166l;

    /* renamed from: m  reason: collision with root package name */
    public final List<f> f18167m;

    /* compiled from: HlsMasterPlaylist */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f18168a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f18169b;

        /* renamed from: c  reason: collision with root package name */
        public final String f18170c;

        public a(Uri uri, b0 b0Var, String str, String str2) {
            this.f18168a = uri;
            this.f18169b = b0Var;
            this.f18170c = str2;
        }
    }

    /* compiled from: HlsMasterPlaylist */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f18171a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f18172b;

        /* renamed from: c  reason: collision with root package name */
        public final String f18173c;

        /* renamed from: d  reason: collision with root package name */
        public final String f18174d;

        /* renamed from: e  reason: collision with root package name */
        public final String f18175e;

        /* renamed from: f  reason: collision with root package name */
        public final String f18176f;

        public b(Uri uri, b0 b0Var, String str, String str2, String str3, String str4) {
            this.f18171a = uri;
            this.f18172b = b0Var;
            this.f18173c = str;
            this.f18174d = str2;
            this.f18175e = str3;
            this.f18176f = str4;
        }
    }

    public d(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, b0 b0Var, List<b0> list7, boolean z10, Map<String, String> map, List<f> list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = list2.get(i10).f18171a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f18158d = Collections.unmodifiableList(arrayList);
        this.f18159e = Collections.unmodifiableList(list2);
        this.f18160f = Collections.unmodifiableList(list3);
        this.f18161g = Collections.unmodifiableList(list4);
        this.f18162h = Collections.unmodifiableList(list5);
        this.f18163i = Collections.unmodifiableList(list6);
        this.f18164j = b0Var;
        this.f18165k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f18166l = Collections.unmodifiableMap(map);
        this.f18167m = Collections.unmodifiableList(list8);
    }

    public static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f18168a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static <T> List<T> c(List<T> list, int i10, List<c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= list2.size()) {
                    break;
                }
                c cVar = list2.get(i12);
                if (cVar.f28104b == i10 && cVar.f28105c == i11) {
                    arrayList.add(t10);
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public Object a(List list) {
        return new d(this.f18216a, this.f18217b, c(this.f18159e, 0, list), Collections.emptyList(), c(this.f18161g, 1, list), c(this.f18162h, 2, list), Collections.emptyList(), this.f18164j, this.f18165k, this.f18218c, this.f18166l, this.f18167m);
    }
}
