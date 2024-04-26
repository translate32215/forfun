package kotlinx.coroutines.android;

import android.os.Looper;
import de.e1;
import ee.a;
import ee.c;
import ie.l;
import java.util.List;

/* compiled from: HandlerDispatcher.kt */
public final class AndroidDispatcherFactory implements l {
    public e1 createDispatcher(List<? extends l> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new a(c.a(mainLooper, true), (String) null, false);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
