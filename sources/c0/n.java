package c0;

import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: NotificationCompatJellybean */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3996a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static Field f3997b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f3998c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle[] b(s[] sVarArr) {
        if (sVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[sVarArr.length];
        if (sVarArr.length <= 0) {
            return bundleArr;
        }
        s sVar = sVarArr[0];
        new Bundle();
        throw null;
    }
}
