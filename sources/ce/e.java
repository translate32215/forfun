package ce;

import td.l;

/* compiled from: Indent.kt */
public class e {
    public static final <T> void a(Appendable appendable, T t10, l<? super T, ? extends CharSequence> lVar) {
        boolean z10;
        if (lVar != null) {
            appendable.append((CharSequence) lVar.c(t10));
            return;
        }
        if (t10 == null) {
            z10 = true;
        } else {
            z10 = t10 instanceof CharSequence;
        }
        if (z10) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }
}
