package h2;

import g2.e;
import g2.g;
import g2.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.c;

/* compiled from: WorkContinuationImpl */
public class f extends c {

    /* renamed from: j  reason: collision with root package name */
    public static final String f18815j = e.e("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    public final h f18816a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18817b = null;

    /* renamed from: c  reason: collision with root package name */
    public final int f18818c = 2;

    /* renamed from: d  reason: collision with root package name */
    public final List<? extends i> f18819d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f18820e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f18821f;

    /* renamed from: g  reason: collision with root package name */
    public final List<f> f18822g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18823h;

    /* renamed from: i  reason: collision with root package name */
    public g f18824i;

    public f(h hVar, List<? extends i> list) {
        super(1);
        this.f18816a = hVar;
        this.f18819d = list;
        this.f18822g = null;
        this.f18820e = new ArrayList(list.size());
        this.f18821f = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String a10 = ((i) list.get(i10)).a();
            this.f18820e.add(a10);
            this.f18821f.add(a10);
        }
    }

    public static boolean f(f fVar, Set<String> set) {
        set.addAll(fVar.f18820e);
        Set<String> g10 = g(fVar);
        for (String contains : set) {
            if (((HashSet) g10).contains(contains)) {
                return true;
            }
        }
        List<f> list = fVar.f18822g;
        if (list != null && !list.isEmpty()) {
            for (f f10 : list) {
                if (f(f10, set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.f18820e);
        return false;
    }

    public static Set<String> g(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> list = fVar.f18822g;
        if (list != null && !list.isEmpty()) {
            for (f fVar2 : list) {
                hashSet.addAll(fVar2.f18820e);
            }
        }
        return hashSet;
    }
}
