package t1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import x1.c;
import x1.d;

/* compiled from: RoomSQLiteQuery */
public class g implements d, c {

    /* renamed from: i  reason: collision with root package name */
    public static final TreeMap<Integer, g> f25398i = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    public volatile String f25399a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f25400b;

    /* renamed from: c  reason: collision with root package name */
    public final double[] f25401c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f25402d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[][] f25403e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f25404f;

    /* renamed from: g  reason: collision with root package name */
    public final int f25405g;

    /* renamed from: h  reason: collision with root package name */
    public int f25406h;

    public g(int i10) {
        this.f25405g = i10;
        int i11 = i10 + 1;
        this.f25404f = new int[i11];
        this.f25400b = new long[i11];
        this.f25401c = new double[i11];
        this.f25402d = new String[i11];
        this.f25403e = new byte[i11][];
    }

    public static g i(String str, int i10) {
        TreeMap<Integer, g> treeMap = f25398i;
        synchronized (treeMap) {
            Map.Entry<Integer, g> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                g value = ceilingEntry.getValue();
                value.f25399a = str;
                value.f25406h = i10;
                return value;
            }
            g gVar = new g(i10);
            gVar.f25399a = str;
            gVar.f25406h = i10;
            return gVar;
        }
    }

    public String a() {
        return this.f25399a;
    }

    public void close() {
    }

    public void d(c cVar) {
        for (int i10 = 1; i10 <= this.f25406h; i10++) {
            int i11 = this.f25404f[i10];
            if (i11 == 1) {
                ((y1.d) cVar).f27989a.bindNull(i10);
            } else if (i11 == 2) {
                ((y1.d) cVar).f27989a.bindLong(i10, this.f25400b[i10]);
            } else if (i11 == 3) {
                ((y1.d) cVar).f27989a.bindDouble(i10, this.f25401c[i10]);
            } else if (i11 == 4) {
                ((y1.d) cVar).f27989a.bindString(i10, this.f25402d[i10]);
            } else if (i11 == 5) {
                ((y1.d) cVar).f27989a.bindBlob(i10, this.f25403e[i10]);
            }
        }
    }

    public void o(int i10, long j10) {
        this.f25404f[i10] = 2;
        this.f25400b[i10] = j10;
    }

    public void s(int i10) {
        this.f25404f[i10] = 1;
    }

    public void t(int i10, String str) {
        this.f25404f[i10] = 4;
        this.f25402d[i10] = str;
    }

    public void u() {
        TreeMap<Integer, g> treeMap = f25398i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f25405g), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }
}
