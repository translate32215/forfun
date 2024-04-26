package e8;

import android.location.Location;
import android.os.Bundle;
import androidx.appcompat.widget.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class u10 implements r10 {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f16840a;

    public u10(fi0 fi0, String str, int i10, String str2, pi0 pi0) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(fi0.f14632b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(fi0.f14633c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(fi0.f14633c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(fi0.f14634d));
        }
        if (hashSet.contains("keywords")) {
            List<String> list = fi0.f14635e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(fi0.f14636f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(fi0.f14637g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(fi0.f14638h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(fi0.f14639i);
        }
        if (hashSet.contains("location")) {
            Location location = fi0.f14641s;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(fi0.f14642t);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(fi0.f14643u));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(fi0.f14644v));
        }
        if (hashSet.contains("categoryExclusions")) {
            List<String> list2 = fi0.f14645w;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(fi0.f14646x);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(fi0.f14647y);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(fi0.f14648z));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(fi0.B));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(fi0.C);
        }
        if (hashSet.contains("orientation")) {
            if (pi0 != null) {
                arrayList.add(Integer.valueOf(pi0.f16007a));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.f16840a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = a((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u10)) {
            return false;
        }
        return Arrays.equals(this.f16840a, ((u10) obj).f16840a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16840a);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.f16840a);
        StringBuilder sb2 = new StringBuilder(o.a(arrays, 22));
        sb2.append("[PoolKey#");
        sb2.append(hashCode);
        sb2.append(" ");
        sb2.append(arrays);
        sb2.append("]");
        return sb2.toString();
    }
}
