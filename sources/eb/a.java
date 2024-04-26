package eb;

import com.google.firebase.remoteconfig.internal.b;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.a f17813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f17814b;

    public /* synthetic */ a(com.google.firebase.remoteconfig.internal.a aVar, b bVar) {
        this.f17813a = aVar;
        this.f17814b = bVar;
    }

    public final Object call() {
        com.google.firebase.remoteconfig.internal.a aVar = this.f17813a;
        b bVar = this.f17814b;
        f fVar = aVar.f9773b;
        synchronized (fVar) {
            FileOutputStream openFileOutput = fVar.f17829a.openFileOutput(fVar.f17830b, 0);
            try {
                openFileOutput.write(bVar.toString().getBytes("UTF-8"));
            } finally {
                openFileOutput.close();
            }
        }
        return null;
    }
}
