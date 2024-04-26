package ff;

import java.io.PrintStream;

/* compiled from: Debug */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f18351b = new a();

    /* renamed from: a  reason: collision with root package name */
    public PrintStream f18352a = System.out;

    public static final void b(Exception exc) {
        c(exc.getMessage());
        exc.printStackTrace(f18351b.a());
    }

    public static final void c(String str) {
        PrintStream a10 = f18351b.a();
        a10.println("CyberGarage warning : " + str);
    }

    public static final void d(String str, Exception exc) {
        if (exc.getMessage() == null) {
            PrintStream a10 = f18351b.a();
            a10.println("CyberGarage warning : " + str + " START");
            exc.printStackTrace(f18351b.a());
            PrintStream a11 = f18351b.a();
            a11.println("CyberGarage warning : " + str + " END");
            return;
        }
        PrintStream a12 = f18351b.a();
        a12.println("CyberGarage warning : " + str + " (" + exc.getMessage() + ")");
        exc.printStackTrace(f18351b.a());
    }

    public synchronized PrintStream a() {
        return this.f18352a;
    }
}
