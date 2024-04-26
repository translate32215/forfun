package h1;

import java.util.ArrayList;
import java.util.Iterator;
import v.e;

/* compiled from: StateMachine */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<c> f18782a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<c> f18783b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<c> f18784c = new ArrayList<>();

    /* renamed from: h1.a$a  reason: collision with other inner class name */
    /* compiled from: StateMachine */
    public static class C0154a {

        /* renamed from: a  reason: collision with root package name */
        public final String f18785a;

        public C0154a(String str) {
            this.f18785a = str;
        }
    }

    /* compiled from: StateMachine */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f18786a;

        public b(String str) {
            this.f18786a = str;
        }
    }

    /* compiled from: StateMachine */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f18787a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18788b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f18789c;

        /* renamed from: d  reason: collision with root package name */
        public int f18790d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f18791e = 0;

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<d> f18792f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<d> f18793g;

        public c(String str, boolean z10, boolean z11) {
            this.f18787a = str;
            this.f18788b = z10;
            this.f18789c = z11;
        }

        public void a(d dVar) {
            if (this.f18792f == null) {
                this.f18792f = new ArrayList<>();
            }
            this.f18792f.add(dVar);
        }

        public void b(d dVar) {
            if (this.f18793g == null) {
                this.f18793g = new ArrayList<>();
            }
            this.f18793g.add(dVar);
        }

        public void c() {
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("[");
            a10.append(this.f18787a);
            a10.append(" ");
            return e.a(a10, this.f18790d, "]");
        }
    }

    public void a(c cVar) {
        if (!this.f18782a.contains(cVar)) {
            this.f18782a.add(cVar);
        }
    }

    public void b(c cVar, c cVar2, b bVar) {
        d dVar = new d(cVar, cVar2, bVar);
        cVar2.a(dVar);
        cVar.b(dVar);
    }

    public void c(b bVar) {
        for (int i10 = 0; i10 < this.f18783b.size(); i10++) {
            c cVar = this.f18783b.get(i10);
            ArrayList<d> arrayList = cVar.f18793g;
            if (arrayList != null && (cVar.f18788b || cVar.f18791e <= 0)) {
                Iterator<d> it = arrayList.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    if (next.f18798e != 1 && next.f18796c == bVar) {
                        next.f18798e = 1;
                        cVar.f18791e++;
                        if (!cVar.f18788b) {
                            break;
                        }
                    }
                }
            }
        }
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r9 = this;
        L_0x0000:
            java.util.ArrayList<h1.a$c> r0 = r9.f18784c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        L_0x000a:
            if (r0 < 0) goto L_0x009d
            java.util.ArrayList<h1.a$c> r4 = r9.f18784c
            java.lang.Object r4 = r4.get(r0)
            h1.a$c r4 = (h1.a.c) r4
            int r5 = r4.f18790d
            if (r5 == r1) goto L_0x008b
            java.util.ArrayList<h1.a$d> r5 = r4.f18792f
            if (r5 != 0) goto L_0x001d
            goto L_0x004a
        L_0x001d:
            boolean r6 = r4.f18789c
            if (r6 == 0) goto L_0x0036
            java.util.Iterator r5 = r5.iterator()
        L_0x0025:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004a
            java.lang.Object r6 = r5.next()
            h1.a$d r6 = (h1.a.d) r6
            int r6 = r6.f18798e
            if (r6 == r1) goto L_0x0025
            goto L_0x004c
        L_0x0036:
            java.util.Iterator r5 = r5.iterator()
        L_0x003a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004c
            java.lang.Object r6 = r5.next()
            h1.a$d r6 = (h1.a.d) r6
            int r6 = r6.f18798e
            if (r6 != r1) goto L_0x003a
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            if (r5 == 0) goto L_0x008b
            r4.f18790d = r1
            r4.c()
            java.util.ArrayList<h1.a$d> r5 = r4.f18793g
            if (r5 == 0) goto L_0x0089
            java.util.Iterator r5 = r5.iterator()
        L_0x005c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0089
            java.lang.Object r6 = r5.next()
            h1.a$d r6 = (h1.a.d) r6
            h1.a$b r7 = r6.f18796c
            if (r7 != 0) goto L_0x005c
            h1.a$a r7 = r6.f18797d
            if (r7 == 0) goto L_0x007e
            androidx.leanback.app.d$e r7 = (androidx.leanback.app.d.e) r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 < r8) goto L_0x007a
            r7 = 1
            goto L_0x007b
        L_0x007a:
            r7 = 0
        L_0x007b:
            r7 = r7 ^ r1
            if (r7 == 0) goto L_0x005c
        L_0x007e:
            int r7 = r4.f18791e
            int r7 = r7 + r1
            r4.f18791e = r7
            r6.f18798e = r1
            boolean r6 = r4.f18788b
            if (r6 != 0) goto L_0x005c
        L_0x0089:
            r5 = 1
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            if (r5 == 0) goto L_0x0099
            java.util.ArrayList<h1.a$c> r3 = r9.f18784c
            r3.remove(r0)
            java.util.ArrayList<h1.a$c> r3 = r9.f18783b
            r3.add(r4)
            r3 = 1
        L_0x0099:
            int r0 = r0 + -1
            goto L_0x000a
        L_0x009d:
            if (r3 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a.d():void");
    }

    /* compiled from: StateMachine */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final c f18794a;

        /* renamed from: b  reason: collision with root package name */
        public final c f18795b;

        /* renamed from: c  reason: collision with root package name */
        public final b f18796c;

        /* renamed from: d  reason: collision with root package name */
        public final C0154a f18797d;

        /* renamed from: e  reason: collision with root package name */
        public int f18798e = 0;

        public d(c cVar, c cVar2, b bVar) {
            if (bVar != null) {
                this.f18794a = cVar;
                this.f18795b = cVar2;
                this.f18796c = bVar;
                this.f18797d = null;
                return;
            }
            throw new IllegalArgumentException();
        }

        public String toString() {
            String str;
            b bVar = this.f18796c;
            if (bVar != null) {
                str = bVar.f18786a;
            } else {
                C0154a aVar = this.f18797d;
                str = aVar != null ? aVar.f18785a : "auto";
            }
            StringBuilder a10 = android.support.v4.media.a.a("[");
            a10.append(this.f18794a.f18787a);
            a10.append(" -> ");
            return androidx.fragment.app.c.a(a10, this.f18795b.f18787a, " <", str, ">]");
        }

        public d(c cVar, c cVar2) {
            this.f18794a = cVar;
            this.f18795b = cVar2;
            this.f18796c = null;
            this.f18797d = null;
        }

        public d(c cVar, c cVar2, C0154a aVar) {
            if (aVar != null) {
                this.f18794a = cVar;
                this.f18795b = cVar2;
                this.f18796c = null;
                this.f18797d = aVar;
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
