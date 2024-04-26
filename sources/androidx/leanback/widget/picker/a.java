package androidx.leanback.widget.picker;

import android.os.Build;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: PickerUtility */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f2503a = (Build.VERSION.SDK_INT >= 18);

    /* renamed from: androidx.leanback.widget.picker.a$a  reason: collision with other inner class name */
    /* compiled from: PickerUtility */
    public static class C0030a {

        /* renamed from: a  reason: collision with root package name */
        public final Locale f2504a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f2505b;

        public C0030a(Locale locale) {
            this.f2504a = locale;
            this.f2505b = DateFormatSymbols.getInstance(locale).getShortMonths();
            Calendar instance = Calendar.getInstance(locale);
            int minimum = instance.getMinimum(5);
            int maximum = instance.getMaximum(5);
            String[] strArr = new String[((maximum - minimum) + 1)];
            for (int i10 = minimum; i10 <= maximum; i10++) {
                strArr[i10 - minimum] = String.format("%02d", new Object[]{Integer.valueOf(i10)});
            }
        }
    }

    public static Calendar a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar instance = Calendar.getInstance(locale);
        instance.setTimeInMillis(timeInMillis);
        return instance;
    }
}
