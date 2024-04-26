package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends b {

    /* renamed from: a  reason: collision with root package name */
    public Set<Class<? extends b>> f1443a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public List<b> f1444b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<String> f1445c = new CopyOnWriteArrayList();

    public ViewDataBinding b(c cVar, View view, int i10) {
        for (b b10 : this.f1444b) {
            ViewDataBinding b11 = b10.b(cVar, view, i10);
            if (b11 != null) {
                return b11;
            }
        }
        if (e()) {
            return b(cVar, view, i10);
        }
        return null;
    }

    public ViewDataBinding c(c cVar, View[] viewArr, int i10) {
        for (b c10 : this.f1444b) {
            ViewDataBinding c11 = c10.c(cVar, viewArr, i10);
            if (c11 != null) {
                return c11;
            }
        }
        if (e()) {
            return c(cVar, viewArr, i10);
        }
        return null;
    }

    public void d(b bVar) {
        if (this.f1443a.add(bVar.getClass())) {
            this.f1444b.add(bVar);
            for (b d10 : bVar.a()) {
                d(d10);
            }
        }
    }

    public final boolean e() {
        boolean z10 = false;
        for (String next : this.f1445c) {
            try {
                Class<?> cls = Class.forName(next);
                if (b.class.isAssignableFrom(cls)) {
                    d((b) cls.newInstance());
                    this.f1445c.remove(next);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + next, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + next, e11);
            }
        }
        return z10;
    }
}
