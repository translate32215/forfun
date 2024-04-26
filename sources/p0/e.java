package p0;

import android.view.accessibility.AccessibilityRecord;

/* compiled from: AccessibilityRecordCompat */
public class e {
    public static int a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    public static void c(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    public static void d(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }
}
