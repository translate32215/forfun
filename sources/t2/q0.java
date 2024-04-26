package t2;

import android.os.Bundle;
import java.util.HashMap;

public class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static int f25554a;

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, Integer> f25555b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static HashMap<String, Integer> f25556c = new HashMap<>();

    public static boolean a(int i10, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i10 != 0) {
            if (i10 != 1 || bundle == null) {
                return false;
            }
            String string = bundle.getString("zone_id");
            if (f25555b.get(string) == null) {
                f25555b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (f25556c.get(string) == null) {
                f25556c.put(string, 0);
            }
            if (currentTimeMillis - f25555b.get(string).intValue() > 1) {
                f25556c.put(string, 1);
                f25555b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = f25556c.get(string).intValue() + 1;
            f25556c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else if (currentTimeMillis - f25554a < 5) {
            return true;
        } else {
            f25554a = currentTimeMillis;
            return false;
        }
    }
}
