package n3;

import android.graphics.Bitmap;
import android.os.Build;
import g4.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy */
public class n implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f21886d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f21887e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f21888f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f21889g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f21890h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final c f21891a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final h<b, Bitmap> f21892b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f21893c = new HashMap();

    /* compiled from: SizeConfigStrategy */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21894a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21894a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21894a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21894a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21894a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.n.a.<clinit>():void");
        }
    }

    /* compiled from: SizeConfigStrategy */
    public static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        public final c f21895a;

        /* renamed from: b  reason: collision with root package name */
        public int f21896b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f21897c;

        public b(c cVar) {
            this.f21895a = cVar;
        }

        public void a() {
            this.f21895a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f21896b != bVar.f21896b || !j.b(this.f21897c, bVar.f21897c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10 = this.f21896b * 31;
            Bitmap.Config config = this.f21897c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.h(this.f21896b, this.f21897c);
        }
    }

    /* compiled from: SizeConfigStrategy */
    public static class c extends d<b> {
        public m a() {
            return new b(this);
        }

        public b t(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.f21896b = i10;
            bVar.f21897c = config;
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f21886d = configArr;
        f21887e = configArr;
    }

    public static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int c10 = j.c(i10, i11, config);
        b bVar = (b) this.f21891a.b();
        bVar.f21896b = c10;
        bVar.f21897c = config;
        int i12 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i13 = a.f21894a[config.ordinal()];
            if (i13 == 1) {
                configArr = f21886d;
            } else if (i13 == 2) {
                configArr = f21888f;
            } else if (i13 != 3) {
                configArr = i13 != 4 ? new Bitmap.Config[]{config} : f21890h;
            } else {
                configArr = f21889g;
            }
        } else {
            configArr = f21887e;
        }
        int length = configArr.length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i12];
            Integer ceilingKey = i(config2).ceilingKey(Integer.valueOf(c10));
            if (ceilingKey == null || ceilingKey.intValue() > c10 * 8) {
                i12++;
            } else if (ceilingKey.intValue() != c10 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f21891a.c(bVar);
                bVar = this.f21891a.t(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a10 = this.f21892b.a(bVar);
        if (a10 != null) {
            g(Integer.valueOf(bVar.f21896b), a10);
            a10.reconfigure(i10, i11, config);
        }
        return a10;
    }

    public void b(Bitmap bitmap) {
        b t10 = this.f21891a.t(j.d(bitmap), bitmap.getConfig());
        this.f21892b.b(t10, bitmap);
        NavigableMap<Integer, Integer> i10 = i(bitmap.getConfig());
        Integer num = (Integer) i10.get(Integer.valueOf(t10.f21896b));
        Integer valueOf = Integer.valueOf(t10.f21896b);
        int i11 = 1;
        if (num != null) {
            i11 = 1 + num.intValue();
        }
        i10.put(valueOf, Integer.valueOf(i11));
    }

    public String c(int i10, int i11, Bitmap.Config config) {
        return h(j.c(i10, i11, config), config);
    }

    public int d(Bitmap bitmap) {
        return j.d(bitmap);
    }

    public Bitmap e() {
        Bitmap c10 = this.f21892b.c();
        if (c10 != null) {
            g(Integer.valueOf(j.d(c10)), c10);
        }
        return c10;
    }

    public String f(Bitmap bitmap) {
        return h(j.d(bitmap), bitmap.getConfig());
    }

    public final void g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> i10 = i(bitmap.getConfig());
        Integer num2 = (Integer) i10.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + f(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            i10.remove(num);
        } else {
            i10.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final NavigableMap<Integer, Integer> i(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f21893c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f21893c.put(config, treeMap);
        return treeMap;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("SizeConfigStrategy{groupedMap=");
        a10.append(this.f21892b);
        a10.append(", sortedSizes=(");
        for (Map.Entry next : this.f21893c.entrySet()) {
            a10.append(next.getKey());
            a10.append('[');
            a10.append(next.getValue());
            a10.append("], ");
        }
        if (!this.f21893c.isEmpty()) {
            a10.replace(a10.length() - 2, a10.length(), "");
        }
        a10.append(")}");
        return a10.toString();
    }
}
