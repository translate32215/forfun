package ie;

import de.e1;
import java.util.List;

/* compiled from: MainDispatcherFactory.kt */
public interface l {
    e1 createDispatcher(List<? extends l> list);

    int getLoadPriority();

    String hintOnError();
}
