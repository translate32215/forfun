package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class na0 {
    public static na0 b(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new ka0(cls.getSimpleName());
        }
        return new ma0(cls.getSimpleName());
    }

    public abstract void a(String str);
}
