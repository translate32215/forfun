package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import s.j;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public int f3156a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final j<String> f3157b = new j<>();

    /* renamed from: c  reason: collision with root package name */
    public final RemoteCallbackList<a> f3158c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final b f3159d = new b();

    public class a extends RemoteCallbackList<a> {
        public a() {
        }

        public void onCallbackDied(IInterface iInterface, Object obj) {
            a aVar = (a) iInterface;
            MultiInstanceInvalidationService.this.f3157b.j(((Integer) obj).intValue());
        }
    }

    public class b extends b {
        public b() {
        }

        public int Y(a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f3158c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f3156a + 1;
                multiInstanceInvalidationService.f3156a = i10;
                if (multiInstanceInvalidationService.f3158c.register(aVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f3157b.a(i10, str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f3156a--;
                return 0;
            }
        }

        public void m(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f3158c) {
                String e10 = MultiInstanceInvalidationService.this.f3157b.e(i10, null);
                if (e10 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f3158c.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f3158c.getBroadcastCookie(i11)).intValue();
                        String d10 = MultiInstanceInvalidationService.this.f3157b.d(intValue);
                        if (i10 != intValue && e10.equals(d10)) {
                            MultiInstanceInvalidationService.this.f3158c.getBroadcastItem(i11).G2(strArr);
                        }
                    } catch (RemoteException e11) {
                        Log.w("ROOM", "Error invoking a remote callback", e11);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f3158c.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f3158c.finishBroadcast();
            }
        }

        public void z0(a aVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f3158c) {
                MultiInstanceInvalidationService.this.f3158c.unregister(aVar);
                MultiInstanceInvalidationService.this.f3157b.j(i10);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f3159d;
    }
}
