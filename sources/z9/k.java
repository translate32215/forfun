package z9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import z9.d;
import z9.f;
import z9.g;
import z9.l;

public abstract class k<T extends IInterface> implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f28752a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f28753b;

    /* renamed from: c  reason: collision with root package name */
    public T f28754c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<l.a> f28755d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<l.a> f28756e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f28757f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<l.b> f28758g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<c<?>> f28759h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ServiceConnection f28760i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f28761j = false;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28762a;

        static {
            int[] iArr = new int[com.google.android.youtube.player.b.values().length];
            f28762a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final class b extends Handler {
        public b() {
        }

        public final void handleMessage(Message message) {
            TListener tlistener;
            int i10 = message.what;
            if (i10 == 3) {
                k.this.d((com.google.android.youtube.player.b) message.obj);
            } else if (i10 == 4) {
                synchronized (k.this.f28755d) {
                    k kVar = k.this;
                    if (kVar.f28761j && kVar.e() && k.this.f28755d.contains(message.obj)) {
                        ((l.a) message.obj).a();
                    }
                }
            } else if (i10 != 2 || k.this.e()) {
                int i11 = message.what;
                if (i11 == 2 || i11 == 1) {
                    c cVar = (c) message.obj;
                    synchronized (cVar) {
                        tlistener = cVar.f28764a;
                    }
                    cVar.a(tlistener);
                }
            }
        }
    }

    public abstract class c<TListener> {

        /* renamed from: a  reason: collision with root package name */
        public TListener f28764a;

        public c(k kVar, TListener tlistener) {
            this.f28764a = tlistener;
            synchronized (kVar.f28759h) {
                kVar.f28759h.add(this);
            }
        }

        public abstract void a(TListener tlistener);
    }

    public final class d extends c<Boolean> {

        /* renamed from: b  reason: collision with root package name */
        public final com.google.android.youtube.player.b f28765b;

        /* renamed from: c  reason: collision with root package name */
        public final IBinder f28766c;

        public d(String str, IBinder iBinder) {
            super(k.this, Boolean.TRUE);
            com.google.android.youtube.player.b bVar = com.google.android.youtube.player.b.UNKNOWN_ERROR;
            try {
                bVar = com.google.android.youtube.player.b.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
            this.f28765b = bVar;
            this.f28766c = iBinder;
        }

        public final void a(Object obj) {
            T t10;
            if (((Boolean) obj) == null) {
                return;
            }
            if (a.f28762a[this.f28765b.ordinal()] != 1) {
                k.this.d(this.f28765b);
                return;
            }
            try {
                String interfaceDescriptor = this.f28766c.getInterfaceDescriptor();
                k.this.getClass();
                if ("com.google.android.youtube.player.internal.IYouTubeService".equals(interfaceDescriptor)) {
                    k kVar = k.this;
                    IBinder iBinder = this.f28766c;
                    ((i) kVar).getClass();
                    int i10 = g.a.f28744a;
                    if (iBinder == null) {
                        t10 = null;
                    } else {
                        T queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
                        t10 = (queryLocalInterface == null || !(queryLocalInterface instanceof g)) ? new g.a.C0292a(iBinder) : (g) queryLocalInterface;
                    }
                    kVar.f28754c = t10;
                    k kVar2 = k.this;
                    if (kVar2.f28754c != null) {
                        kVar2.f();
                        return;
                    }
                }
            } catch (RemoteException unused) {
            }
            k.this.c();
            k.this.d(com.google.android.youtube.player.b.INTERNAL_ERROR);
        }
    }

    public final class e extends d.a {
        public e() {
        }
    }

    public final class f implements ServiceConnection {
        public f() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.a.C0291a aVar;
            f fVar;
            k kVar = k.this;
            kVar.getClass();
            try {
                int i10 = f.a.f28742a;
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof f)) {
                        aVar = new f.a.C0291a(iBinder);
                        e eVar = new e();
                        i iVar = (i) kVar;
                        aVar.A1(eVar, 1202, iVar.f28749l, iVar.f28750m, iVar.f28748k, (Bundle) null);
                    }
                    fVar = (f) queryLocalInterface;
                }
                aVar = fVar;
                e eVar2 = new e();
                i iVar2 = (i) kVar;
                aVar.A1(eVar2, 1202, iVar2.f28749l, iVar2.f28750m, iVar2.f28748k, (Bundle) null);
            } catch (RemoteException unused) {
                Log.w("YouTubeClient", "service died");
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            k kVar = k.this;
            kVar.f28754c = null;
            kVar.g();
        }
    }

    public k(Context context, l.a aVar, l.b bVar) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Clients must be created on the UI thread.");
        } else if (context != null) {
            this.f28752a = context;
            ArrayList<l.a> arrayList = new ArrayList<>();
            this.f28755d = arrayList;
            if (aVar != null) {
                arrayList.add(aVar);
                ArrayList<l.b> arrayList2 = new ArrayList<>();
                this.f28758g = arrayList2;
                if (bVar != null) {
                    arrayList2.add(bVar);
                    this.f28753b = new b();
                    return;
                }
                throw new NullPointerException("null reference");
            }
            throw new NullPointerException("null reference");
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final void b() {
        com.google.android.youtube.player.b bVar;
        com.google.android.youtube.player.b bVar2 = com.google.android.youtube.player.b.SUCCESS;
        boolean z10 = true;
        this.f28761j = true;
        Context context = this.f28752a;
        byte[][] bArr = y9.a.f28137a;
        try {
            PackageManager packageManager = context.getPackageManager();
            String a10 = p.a(context);
            if (!y9.a.a(packageManager.getPackageInfo(a10, 64))) {
                bVar = com.google.android.youtube.player.b.SERVICE_INVALID;
            } else {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(a10);
                    int identifier = resourcesForApplication.getIdentifier("youtube_api_version_code", "integer", a10.equals("com.google.android.youtube.googletvdev") ? "com.google.android.youtube.googletv" : a10);
                    if (identifier != 0) {
                        if (12 <= resourcesForApplication.getInteger(identifier) / 100) {
                            z10 = false;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                bVar = z10 ? com.google.android.youtube.player.b.SERVICE_VERSION_UPDATE_REQUIRED : !packageManager.getApplicationInfo(a10, 0).enabled ? com.google.android.youtube.player.b.SERVICE_DISABLED : bVar2;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            bVar = com.google.android.youtube.player.b.SERVICE_MISSING;
        }
        if (bVar != bVar2) {
            Handler handler = this.f28753b;
            handler.sendMessage(handler.obtainMessage(3, bVar));
            return;
        }
        Intent intent = new Intent("com.google.android.youtube.api.service.START").setPackage(p.a(this.f28752a));
        if (this.f28760i != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            c();
        }
        f fVar = new f();
        this.f28760i = fVar;
        if (!this.f28752a.bindService(intent, fVar, 129)) {
            Handler handler2 = this.f28753b;
            handler2.sendMessage(handler2.obtainMessage(3, com.google.android.youtube.player.b.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    public final void c() {
        ServiceConnection serviceConnection = this.f28760i;
        if (serviceConnection != null) {
            try {
                this.f28752a.unbindService(serviceConnection);
            } catch (IllegalArgumentException e10) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e10);
            }
        }
        this.f28754c = null;
        this.f28760i = null;
    }

    public final void d(com.google.android.youtube.player.b bVar) {
        this.f28753b.removeMessages(4);
        synchronized (this.f28758g) {
            ArrayList<l.b> arrayList = this.f28758g;
            int i10 = 0;
            int size = arrayList.size();
            while (i10 < size) {
                if (this.f28761j) {
                    if (this.f28758g.contains(arrayList.get(i10))) {
                        arrayList.get(i10).a(bVar);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean e() {
        return this.f28754c != null;
    }

    public final void f() {
        synchronized (this.f28755d) {
            boolean z10 = true;
            if (!this.f28757f) {
                this.f28753b.removeMessages(4);
                this.f28757f = true;
                if (this.f28756e.size() != 0) {
                    z10 = false;
                }
                if (z10) {
                    ArrayList<l.a> arrayList = this.f28755d;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size && this.f28761j && e(); i10++) {
                        if (!this.f28756e.contains(arrayList.get(i10))) {
                            arrayList.get(i10).a();
                        }
                    }
                    this.f28756e.clear();
                    this.f28757f = false;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void g() {
        this.f28753b.removeMessages(4);
        synchronized (this.f28755d) {
            this.f28757f = true;
            ArrayList<l.a> arrayList = this.f28755d;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size && this.f28761j; i10++) {
                if (this.f28755d.contains(arrayList.get(i10))) {
                    arrayList.get(i10).b();
                }
            }
            this.f28757f = false;
        }
    }
}
