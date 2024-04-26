package m0;

/* compiled from: TextDirectionHeuristicsCompat */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f21481a = new C0190d((b) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final c f21482b = new C0190d((b) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final c f21483c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f21484d;

    /* compiled from: TextDirectionHeuristicsCompat */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21485a = new a();

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                c cVar = d.f21481a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i13 = 2;
                                break;
                        }
                    }
                    i13 = 0;
                    i10++;
                }
                i13 = 1;
                i10++;
            }
            return i13;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public interface b {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public static abstract class c implements c {

        /* renamed from: a  reason: collision with root package name */
        public final b f21486a;

        public c(b bVar) {
            this.f21486a = bVar;
        }

        public abstract boolean a();

        public boolean b(CharSequence charSequence, int i10, int i11) {
            if (i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f21486a;
            if (bVar == null) {
                return a();
            }
            int a10 = bVar.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }
    }

    /* renamed from: m0.d$d  reason: collision with other inner class name */
    /* compiled from: TextDirectionHeuristicsCompat */
    public static class C0190d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21487b;

        public C0190d(b bVar, boolean z10) {
            super(bVar);
            this.f21487b = z10;
        }

        public boolean a() {
            return this.f21487b;
        }
    }

    static {
        a aVar = a.f21485a;
        f21483c = new C0190d(aVar, false);
        f21484d = new C0190d(aVar, true);
    }
}
