package e8;

import com.google.android.gms.internal.ads.pg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class i40 extends f40 {

    /* renamed from: b  reason: collision with root package name */
    public static final i40 f14984b = new i40();

    public i40() {
        super("CharMatcher.none()");
    }

    public final int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= 0 && i10 <= length) {
            return -1;
        }
        throw new IndexOutOfBoundsException(pg.d(i10, length, "index"));
    }

    public final boolean d(char c10) {
        return false;
    }
}
