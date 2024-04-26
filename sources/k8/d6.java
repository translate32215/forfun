package k8;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public enum d6 {
    DOUBLE_LIST_PACKED(35, 3, r7),
    SINT64_LIST_PACKED(48, 3, r9);
    

    /* renamed from: d  reason: collision with root package name */
    public static final d6[] f20124d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f20126a;

    /* access modifiers changed from: public */
    static {
        int i10;
        f20124d = new d6[r1];
        for (d6 d6Var : values()) {
            f20124d[d6Var.f20126a] = d6Var;
        }
    }

    /* access modifiers changed from: public */
    d6(int i10, int i11, u6 u6Var) {
        this.f20126a = i10;
        u6 u6Var2 = u6.VOID;
        int i12 = i11 - 1;
        if (i12 == 1) {
            u6Var.getClass();
        } else if (i12 == 3) {
            u6Var.getClass();
        }
        if (i11 == 1) {
            u6Var.ordinal();
        }
    }
}
