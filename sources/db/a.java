package db;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.internal.d;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.remoteconfig.a f13222a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f13223b;

    public /* synthetic */ a(com.google.firebase.remoteconfig.a aVar, f fVar) {
        this.f13222a = aVar;
        this.f13223b = fVar;
    }

    public final Object call() {
        com.google.firebase.remoteconfig.a aVar = this.f13222a;
        f fVar = this.f13223b;
        d dVar = aVar.f9760i;
        synchronized (dVar.f9798b) {
            SharedPreferences.Editor edit = dVar.f9797a.edit();
            fVar.getClass();
            edit.putLong("fetch_timeout_in_seconds", 60).putLong("minimum_fetch_interval_in_seconds", fVar.f13225a).commit();
        }
        return null;
    }
}
