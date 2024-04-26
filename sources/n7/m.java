package n7;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.2 */
public final class m implements Comparator {
    public m(int i10) {
    }

    public final int compare(Object obj, Object obj2) {
        return ((q) obj).getClass().getCanonicalName().compareTo(((q) obj2).getClass().getCanonicalName());
    }
}
