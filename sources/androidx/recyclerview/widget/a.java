package androidx.recyclerview.widget;

import androidx.recyclerview.widget.n;
import java.util.ArrayList;
import java.util.List;
import n0.d;

/* compiled from: AdapterHelper */
public final class a implements n.a {

    /* renamed from: a  reason: collision with root package name */
    public d<b> f2996a = new t.d(30, 1);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2997b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2998c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final C0036a f2999d;

    /* renamed from: e  reason: collision with root package name */
    public final n f3000e;

    /* renamed from: f  reason: collision with root package name */
    public int f3001f = 0;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    public interface C0036a {
    }

    /* compiled from: AdapterHelper */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3002a;

        /* renamed from: b  reason: collision with root package name */
        public int f3003b;

        /* renamed from: c  reason: collision with root package name */
        public Object f3004c;

        /* renamed from: d  reason: collision with root package name */
        public int f3005d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f3002a = i10;
            this.f3003b = i11;
            this.f3005d = i12;
            this.f3004c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f3002a;
            if (i10 != bVar.f3002a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f3005d - this.f3003b) == 1 && this.f3005d == bVar.f3003b && this.f3003b == bVar.f3005d) {
                return true;
            }
            if (this.f3005d != bVar.f3005d || this.f3003b != bVar.f3003b) {
                return false;
            }
            Object obj2 = this.f3004c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3004c)) {
                    return false;
                }
            } else if (bVar.f3004c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3002a * 31) + this.f3003b) * 31) + this.f3005d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f3002a;
            sb2.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb2.append(",s:");
            sb2.append(this.f3003b);
            sb2.append("c:");
            sb2.append(this.f3005d);
            sb2.append(",p:");
            sb2.append(this.f3004c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(C0036a aVar) {
        this.f2999d = aVar;
        this.f3000e = new n(this);
    }

    public final boolean a(int i10) {
        int size = this.f2998c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f2998c.get(i11);
            int i12 = bVar.f3002a;
            if (i12 == 8) {
                if (f(bVar.f3005d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3003b;
                int i14 = bVar.f3005d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.f2998c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((u) this.f2999d).a(this.f2998c.get(i10));
        }
        l(this.f2998c);
        this.f3001f = 0;
    }

    public void c() {
        b();
        int size = this.f2997b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f2997b.get(i10);
            int i11 = bVar.f3002a;
            if (i11 == 1) {
                ((u) this.f2999d).a(bVar);
                ((u) this.f2999d).d(bVar.f3003b, bVar.f3005d);
            } else if (i11 == 2) {
                ((u) this.f2999d).a(bVar);
                C0036a aVar = this.f2999d;
                int i12 = bVar.f3003b;
                int i13 = bVar.f3005d;
                u uVar = (u) aVar;
                uVar.f3139a.S(i12, i13, true);
                RecyclerView recyclerView = uVar.f3139a;
                recyclerView.f2831v0 = true;
                recyclerView.f2825s0.f2933c += i13;
            } else if (i11 == 4) {
                ((u) this.f2999d).a(bVar);
                ((u) this.f2999d).c(bVar.f3003b, bVar.f3005d, bVar.f3004c);
            } else if (i11 == 8) {
                ((u) this.f2999d).a(bVar);
                ((u) this.f2999d).e(bVar.f3003b, bVar.f3005d);
            }
        }
        l(this.f2997b);
        this.f3001f = 0;
    }

    public final void d(b bVar) {
        int i10;
        int i11 = bVar.f3002a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m10 = m(bVar.f3003b, i11);
        int i12 = bVar.f3003b;
        int i13 = bVar.f3002a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f3005d; i15++) {
            int m11 = m((i10 * i15) + bVar.f3003b, bVar.f3002a);
            int i16 = bVar.f3002a;
            if (i16 == 2 ? m11 == m10 : i16 == 4 && m11 == m10 + 1) {
                i14++;
            } else {
                b h10 = h(i16, m10, i14, bVar.f3004c);
                e(h10, i12);
                k(h10);
                if (bVar.f3002a == 4) {
                    i12 += i14;
                }
                m10 = m11;
                i14 = 1;
            }
        }
        Object obj = bVar.f3004c;
        k(bVar);
        if (i14 > 0) {
            b h11 = h(bVar.f3002a, m10, i14, obj);
            e(h11, i12);
            k(h11);
        }
    }

    public void e(b bVar, int i10) {
        ((u) this.f2999d).a(bVar);
        int i11 = bVar.f3002a;
        if (i11 == 2) {
            C0036a aVar = this.f2999d;
            int i12 = bVar.f3005d;
            u uVar = (u) aVar;
            uVar.f3139a.S(i10, i12, true);
            RecyclerView recyclerView = uVar.f3139a;
            recyclerView.f2831v0 = true;
            recyclerView.f2825s0.f2933c += i12;
        } else if (i11 == 4) {
            ((u) this.f2999d).c(i10, bVar.f3005d, bVar.f3004c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int f(int i10, int i11) {
        int size = this.f2998c.size();
        while (i11 < size) {
            b bVar = this.f2998c.get(i11);
            int i12 = bVar.f3002a;
            if (i12 == 8) {
                int i13 = bVar.f3003b;
                if (i13 == i10) {
                    i10 = bVar.f3005d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3005d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3003b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3005d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3005d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean g() {
        return this.f2997b.size() > 0;
    }

    public b h(int i10, int i11, int i12, Object obj) {
        b b10 = this.f2996a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f3002a = i10;
        b10.f3003b = i11;
        b10.f3005d = i12;
        b10.f3004c = obj;
        return b10;
    }

    public final void i(b bVar) {
        this.f2998c.add(bVar);
        int i10 = bVar.f3002a;
        if (i10 == 1) {
            ((u) this.f2999d).d(bVar.f3003b, bVar.f3005d);
        } else if (i10 == 2) {
            C0036a aVar = this.f2999d;
            u uVar = (u) aVar;
            uVar.f3139a.S(bVar.f3003b, bVar.f3005d, false);
            uVar.f3139a.f2831v0 = true;
        } else if (i10 == 4) {
            ((u) this.f2999d).c(bVar.f3003b, bVar.f3005d, bVar.f3004c);
        } else if (i10 == 8) {
            ((u) this.f2999d).e(bVar.f3003b, bVar.f3005d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.n r1 = r0.f3000e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f2997b
            r1.getClass()
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.a.b) r9
            int r9 = r9.f3002a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = 1
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = -1
        L_0x0027:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r8) goto L_0x01c7
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.a.b) r12
            int r13 = r12.f3002a
            if (r13 == r4) goto L_0x019d
            if (r13 == r10) goto L_0x00a8
            if (r13 == r9) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f3005d
            int r8 = r12.f3003b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f3003b = r8
            goto L_0x0064
        L_0x004e:
            int r10 = r12.f3005d
            int r8 = r8 + r10
            if (r5 >= r8) goto L_0x0064
            int r10 = r10 + -1
            r12.f3005d = r10
            androidx.recyclerview.widget.n$a r5 = r1.f3131a
            int r8 = r11.f3003b
            java.lang.Object r10 = r12.f3004c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.a) r5
            androidx.recyclerview.widget.a$b r4 = r5.h(r9, r8, r4, r10)
            goto L_0x0065
        L_0x0064:
            r4 = r6
        L_0x0065:
            int r5 = r11.f3003b
            int r8 = r12.f3003b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f3003b = r8
            goto L_0x0087
        L_0x0070:
            int r10 = r12.f3005d
            int r8 = r8 + r10
            if (r5 >= r8) goto L_0x0087
            int r8 = r8 - r5
            androidx.recyclerview.widget.n$a r6 = r1.f3131a
            int r5 = r5 + 1
            java.lang.Object r10 = r12.f3004c
            androidx.recyclerview.widget.a r6 = (androidx.recyclerview.widget.a) r6
            androidx.recyclerview.widget.a$b r6 = r6.h(r9, r5, r8, r10)
            int r5 = r12.f3005d
            int r5 = r5 - r8
            r12.f3005d = r5
        L_0x0087:
            r2.set(r7, r11)
            int r5 = r12.f3005d
            if (r5 <= 0) goto L_0x0092
            r2.set(r3, r12)
            goto L_0x009c
        L_0x0092:
            r2.remove(r3)
            androidx.recyclerview.widget.n$a r5 = r1.f3131a
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.a) r5
            r5.k(r12)
        L_0x009c:
            if (r4 == 0) goto L_0x00a1
            r2.add(r3, r4)
        L_0x00a1:
            if (r6 == 0) goto L_0x0009
            r2.add(r3, r6)
            goto L_0x0009
        L_0x00a8:
            int r8 = r11.f3003b
            int r9 = r11.f3005d
            if (r8 >= r9) goto L_0x00bd
            int r13 = r12.f3003b
            if (r13 != r8) goto L_0x00ba
            int r13 = r12.f3005d
            int r8 = r9 - r8
            if (r13 != r8) goto L_0x00ba
            r5 = 0
            goto L_0x00c9
        L_0x00ba:
            r5 = 0
            r8 = 0
            goto L_0x00ce
        L_0x00bd:
            int r13 = r12.f3003b
            int r14 = r9 + 1
            if (r13 != r14) goto L_0x00cc
            int r13 = r12.f3005d
            int r8 = r8 - r9
            if (r13 != r8) goto L_0x00cc
            r5 = 1
        L_0x00c9:
            r8 = r5
            r5 = 1
            goto L_0x00ce
        L_0x00cc:
            r5 = 0
            r8 = 1
        L_0x00ce:
            int r13 = r12.f3003b
            if (r9 >= r13) goto L_0x00d7
            int r13 = r13 + -1
            r12.f3003b = r13
            goto L_0x00f4
        L_0x00d7:
            int r14 = r12.f3005d
            int r13 = r13 + r14
            if (r9 >= r13) goto L_0x00f4
            int r14 = r14 + -1
            r12.f3005d = r14
            r11.f3002a = r10
            r11.f3005d = r4
            int r3 = r12.f3005d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            androidx.recyclerview.widget.n$a r3 = r1.f3131a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            r3.k(r12)
            goto L_0x0009
        L_0x00f4:
            int r4 = r11.f3003b
            int r9 = r12.f3003b
            if (r4 > r9) goto L_0x00ff
            int r9 = r9 + 1
            r12.f3003b = r9
            goto L_0x0116
        L_0x00ff:
            int r13 = r12.f3005d
            int r9 = r9 + r13
            if (r4 >= r9) goto L_0x0116
            int r9 = r9 - r4
            androidx.recyclerview.widget.n$a r13 = r1.f3131a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.a$b r6 = r13.h(r10, r4, r9, r6)
            int r4 = r11.f3003b
            int r9 = r12.f3003b
            int r4 = r4 - r9
            r12.f3005d = r4
        L_0x0116:
            if (r5 == 0) goto L_0x0127
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.n$a r3 = r1.f3131a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            r3.k(r11)
            goto L_0x0009
        L_0x0127:
            if (r8 == 0) goto L_0x0158
            if (r6 == 0) goto L_0x0141
            int r4 = r11.f3003b
            int r5 = r6.f3003b
            if (r4 <= r5) goto L_0x0136
            int r5 = r6.f3005d
            int r4 = r4 - r5
            r11.f3003b = r4
        L_0x0136:
            int r4 = r11.f3005d
            int r5 = r6.f3003b
            if (r4 <= r5) goto L_0x0141
            int r5 = r6.f3005d
            int r4 = r4 - r5
            r11.f3005d = r4
        L_0x0141:
            int r4 = r11.f3003b
            int r5 = r12.f3003b
            if (r4 <= r5) goto L_0x014c
            int r5 = r12.f3005d
            int r4 = r4 - r5
            r11.f3003b = r4
        L_0x014c:
            int r4 = r11.f3005d
            int r5 = r12.f3003b
            if (r4 <= r5) goto L_0x0186
            int r5 = r12.f3005d
            int r4 = r4 - r5
            r11.f3005d = r4
            goto L_0x0186
        L_0x0158:
            if (r6 == 0) goto L_0x0170
            int r4 = r11.f3003b
            int r5 = r6.f3003b
            if (r4 < r5) goto L_0x0165
            int r5 = r6.f3005d
            int r4 = r4 - r5
            r11.f3003b = r4
        L_0x0165:
            int r4 = r11.f3005d
            int r5 = r6.f3003b
            if (r4 < r5) goto L_0x0170
            int r5 = r6.f3005d
            int r4 = r4 - r5
            r11.f3005d = r4
        L_0x0170:
            int r4 = r11.f3003b
            int r5 = r12.f3003b
            if (r4 < r5) goto L_0x017b
            int r5 = r12.f3005d
            int r4 = r4 - r5
            r11.f3003b = r4
        L_0x017b:
            int r4 = r11.f3005d
            int r5 = r12.f3003b
            if (r4 < r5) goto L_0x0186
            int r5 = r12.f3005d
            int r4 = r4 - r5
            r11.f3005d = r4
        L_0x0186:
            r2.set(r3, r12)
            int r4 = r11.f3003b
            int r5 = r11.f3005d
            if (r4 == r5) goto L_0x0193
            r2.set(r7, r11)
            goto L_0x0196
        L_0x0193:
            r2.remove(r7)
        L_0x0196:
            if (r6 == 0) goto L_0x0009
            r2.add(r3, r6)
            goto L_0x0009
        L_0x019d:
            int r4 = r11.f3005d
            int r6 = r12.f3003b
            if (r4 >= r6) goto L_0x01a5
            r5 = -1
            goto L_0x01a6
        L_0x01a5:
            r5 = 0
        L_0x01a6:
            int r8 = r11.f3003b
            if (r8 >= r6) goto L_0x01ac
            int r5 = r5 + 1
        L_0x01ac:
            if (r6 > r8) goto L_0x01b3
            int r6 = r12.f3005d
            int r8 = r8 + r6
            r11.f3003b = r8
        L_0x01b3:
            int r6 = r12.f3003b
            if (r6 > r4) goto L_0x01bc
            int r8 = r12.f3005d
            int r4 = r4 + r8
            r11.f3005d = r4
        L_0x01bc:
            int r6 = r6 + r5
            r12.f3003b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01c7:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2997b
            int r1 = r1.size()
            r2 = 0
        L_0x01ce:
            if (r2 >= r1) goto L_0x0299
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f2997b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r11 = r3.f3002a
            if (r11 == r4) goto L_0x0292
            if (r11 == r10) goto L_0x023c
            if (r11 == r9) goto L_0x01e9
            if (r11 == r7) goto L_0x01e4
            goto L_0x0295
        L_0x01e4:
            r0.i(r3)
            goto L_0x0295
        L_0x01e9:
            int r11 = r3.f3003b
            int r12 = r3.f3005d
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L_0x01f1:
            if (r11 >= r12) goto L_0x0225
            androidx.recyclerview.widget.a$a r5 = r0.f2999d
            androidx.recyclerview.widget.u r5 = (androidx.recyclerview.widget.u) r5
            androidx.recyclerview.widget.RecyclerView$a0 r5 = r5.b(r11)
            if (r5 != 0) goto L_0x0213
            boolean r5 = r0.a(r11)
            if (r5 == 0) goto L_0x0204
            goto L_0x0213
        L_0x0204:
            if (r15 != r4) goto L_0x0211
            java.lang.Object r5 = r3.f3004c
            androidx.recyclerview.widget.a$b r5 = r0.h(r9, r13, r14, r5)
            r0.i(r5)
            r13 = r11
            r14 = 0
        L_0x0211:
            r15 = 0
            goto L_0x0221
        L_0x0213:
            if (r15 != 0) goto L_0x0220
            java.lang.Object r5 = r3.f3004c
            androidx.recyclerview.widget.a$b r5 = r0.h(r9, r13, r14, r5)
            r0.d(r5)
            r13 = r11
            r14 = 0
        L_0x0220:
            r15 = 1
        L_0x0221:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L_0x01f1
        L_0x0225:
            int r5 = r3.f3005d
            if (r14 == r5) goto L_0x0232
            java.lang.Object r5 = r3.f3004c
            r0.k(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r9, r13, r14, r5)
        L_0x0232:
            if (r15 != 0) goto L_0x0238
            r0.d(r3)
            goto L_0x0295
        L_0x0238:
            r0.i(r3)
            goto L_0x0295
        L_0x023c:
            int r5 = r3.f3003b
            int r11 = r3.f3005d
            int r11 = r11 + r5
            r12 = r5
            r13 = 0
            r14 = -1
        L_0x0244:
            if (r12 >= r11) goto L_0x027d
            androidx.recyclerview.widget.a$a r15 = r0.f2999d
            androidx.recyclerview.widget.u r15 = (androidx.recyclerview.widget.u) r15
            androidx.recyclerview.widget.RecyclerView$a0 r15 = r15.b(r12)
            if (r15 != 0) goto L_0x0265
            boolean r15 = r0.a(r12)
            if (r15 == 0) goto L_0x0257
            goto L_0x0265
        L_0x0257:
            if (r14 != r4) goto L_0x0262
            androidx.recyclerview.widget.a$b r14 = r0.h(r10, r5, r13, r6)
            r0.i(r14)
            r14 = 1
            goto L_0x0263
        L_0x0262:
            r14 = 0
        L_0x0263:
            r15 = 0
            goto L_0x0272
        L_0x0265:
            if (r14 != 0) goto L_0x0270
            androidx.recyclerview.widget.a$b r14 = r0.h(r10, r5, r13, r6)
            r0.d(r14)
            r14 = 1
            goto L_0x0271
        L_0x0270:
            r14 = 0
        L_0x0271:
            r15 = 1
        L_0x0272:
            if (r14 == 0) goto L_0x0278
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x027a
        L_0x0278:
            int r13 = r13 + 1
        L_0x027a:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0244
        L_0x027d:
            int r11 = r3.f3005d
            if (r13 == r11) goto L_0x0288
            r0.k(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r10, r5, r13, r6)
        L_0x0288:
            if (r14 != 0) goto L_0x028e
            r0.d(r3)
            goto L_0x0295
        L_0x028e:
            r0.i(r3)
            goto L_0x0295
        L_0x0292:
            r0.i(r3)
        L_0x0295:
            int r2 = r2 + 1
            goto L_0x01ce
        L_0x0299:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f2997b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public void k(b bVar) {
        bVar.f3004c = null;
        this.f2996a.a(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            k(list.get(i10));
        }
        list.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f2998c.size() - 1; size >= 0; size--) {
            b bVar = this.f2998c.get(size);
            int i14 = bVar.f3002a;
            if (i14 == 8) {
                int i15 = bVar.f3003b;
                int i16 = bVar.f3005d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f3003b = i15 + 1;
                            bVar.f3005d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f3003b = i15 - 1;
                            bVar.f3005d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f3005d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f3005d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f3003b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f3003b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f3003b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f3005d;
                    } else if (i14 == 2) {
                        i10 += bVar.f3005d;
                    }
                } else if (i11 == 1) {
                    bVar.f3003b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f3003b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f2998c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2998c.get(size2);
            if (bVar2.f3002a == 8) {
                int i18 = bVar2.f3005d;
                if (i18 == bVar2.f3003b || i18 < 0) {
                    this.f2998c.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f3005d <= 0) {
                this.f2998c.remove(size2);
                k(bVar2);
            }
        }
        return i10;
    }
}
