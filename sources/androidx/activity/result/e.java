package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: ActivityResultRegistry */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public Random f375a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f376b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f377c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, c> f378d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f379e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, b<?>> f380f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f381g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f382h = new Bundle();

    /* compiled from: ActivityResultRegistry */
    public class a extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f383a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d.a f384b;

        public a(String str, d.a aVar) {
            this.f383a = str;
            this.f384b = aVar;
        }

        public void b() {
            e.this.d(this.f383a);
        }
    }

    /* compiled from: ActivityResultRegistry */
    public static class b<O> {

        /* renamed from: a  reason: collision with root package name */
        public final b<O> f386a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a<?, O> f387b;

        public b(b<O> bVar, d.a<?, O> aVar) {
            this.f386a = bVar;
            this.f387b = aVar;
        }
    }

    /* compiled from: ActivityResultRegistry */
    public static class c {
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = this.f376b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        b bVar = this.f380f.get(str);
        if (bVar == null || bVar.f386a == null || !this.f379e.contains(str)) {
            this.f381g.remove(str);
            this.f382h.putParcelable(str, new a(i11, intent));
            return true;
        }
        bVar.f386a.a(bVar.f387b.c(i11, intent));
        this.f379e.remove(str);
        return true;
    }

    public abstract <I, O> void b(int i10, d.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i11, c0.a aVar2);

    public final <I, O> c<I> c(String str, d.a<I, O> aVar, b<O> bVar) {
        int i10;
        if (this.f377c.get(str) == null) {
            int nextInt = this.f375a.nextInt(2147418112);
            while (true) {
                i10 = nextInt + 65536;
                if (!this.f376b.containsKey(Integer.valueOf(i10))) {
                    break;
                }
                nextInt = this.f375a.nextInt(2147418112);
            }
            this.f376b.put(Integer.valueOf(i10), str);
            this.f377c.put(str, Integer.valueOf(i10));
        }
        this.f380f.put(str, new b(bVar, aVar));
        if (this.f381g.containsKey(str)) {
            Object obj = this.f381g.get(str);
            this.f381g.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f382h.getParcelable(str);
        if (aVar2 != null) {
            this.f382h.remove(str);
            bVar.a(aVar.c(aVar2.f373a, aVar2.f374b));
        }
        return new a(str, aVar);
    }

    public final void d(String str) {
        Integer remove;
        if (!this.f379e.contains(str) && (remove = this.f377c.remove(str)) != null) {
            this.f376b.remove(remove);
        }
        this.f380f.remove(str);
        if (this.f381g.containsKey(str)) {
            StringBuilder a10 = d.a("Dropping pending result for request ", str, ": ");
            a10.append(this.f381g.get(str));
            Log.w("ActivityResultRegistry", a10.toString());
            this.f381g.remove(str);
        }
        if (this.f382h.containsKey(str)) {
            StringBuilder a11 = d.a("Dropping pending result for request ", str, ": ");
            a11.append(this.f382h.getParcelable(str));
            Log.w("ActivityResultRegistry", a11.toString());
            this.f382h.remove(str);
        }
        if (this.f378d.get(str) != null) {
            throw null;
        }
    }
}
