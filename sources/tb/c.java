package tb;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ob.b;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<View, String> f25873a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<View, a> f25874b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, View> f25875c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<View> f25876d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet<String> f25877e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f25878f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<String, String> f25879g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f25880h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f25881a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<String> f25882b;

        public a(b bVar, String str) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f25882b = arrayList;
            this.f25881a = bVar;
            arrayList.add(str);
        }
    }
}
