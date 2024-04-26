package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.a;
import android.util.Log;
import androidx.activity.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1382c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static String f1383d;

    /* renamed from: e  reason: collision with root package name */
    public static Set<String> f1384e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f1385f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static c f1386g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1387a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f1388b;

    /* compiled from: NotificationManagerCompat */
    public static class a implements C0017d {

        /* renamed from: a  reason: collision with root package name */
        public final String f1389a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1390b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1391c;

        /* renamed from: d  reason: collision with root package name */
        public final Notification f1392d;

        public a(String str, int i10, String str2, Notification notification) {
            this.f1389a = str;
            this.f1390b = i10;
            this.f1391c = str2;
            this.f1392d = notification;
        }

        public void a(android.support.v4.app.a aVar) throws RemoteException {
            aVar.x5(this.f1389a, this.f1390b, this.f1391c, this.f1392d);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyTask[");
            sb2.append("packageName:");
            sb2.append(this.f1389a);
            sb2.append(", id:");
            sb2.append(this.f1390b);
            sb2.append(", tag:");
            return e.a(sb2, this.f1391c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f1393a;

        /* renamed from: b  reason: collision with root package name */
        public final IBinder f1394b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.f1393a = componentName;
            this.f1394b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat */
    public static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1395a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f1396b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<ComponentName, a> f1397c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public Set<String> f1398d = new HashSet();

        /* compiled from: NotificationManagerCompat */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ComponentName f1399a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f1400b = false;

            /* renamed from: c  reason: collision with root package name */
            public android.support.v4.app.a f1401c;

            /* renamed from: d  reason: collision with root package name */
            public ArrayDeque<C0017d> f1402d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            public int f1403e = 0;

            public a(ComponentName componentName) {
                this.f1399a = componentName;
            }
        }

        public c(Context context) {
            this.f1395a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f1396b = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z10;
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder a10 = android.support.v4.media.a.a("Processing component ");
                a10.append(aVar.f1399a);
                a10.append(", ");
                a10.append(aVar.f1402d.size());
                a10.append(" queued tasks");
                Log.d("NotifManCompat", a10.toString());
            }
            if (!aVar.f1402d.isEmpty()) {
                if (aVar.f1400b) {
                    z10 = true;
                } else {
                    boolean bindService = this.f1395a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1399a), this, 33);
                    aVar.f1400b = bindService;
                    if (bindService) {
                        aVar.f1403e = 0;
                    } else {
                        StringBuilder a11 = android.support.v4.media.a.a("Unable to bind to listener ");
                        a11.append(aVar.f1399a);
                        Log.w("NotifManCompat", a11.toString());
                        this.f1395a.unbindService(this);
                    }
                    z10 = aVar.f1400b;
                }
                if (!z10 || aVar.f1401c == null) {
                    b(aVar);
                    return;
                }
                while (true) {
                    C0017d peek = aVar.f1402d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f1401c);
                        aVar.f1402d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder a12 = android.support.v4.media.a.a("Remote service has died: ");
                            a12.append(aVar.f1399a);
                            Log.d("NotifManCompat", a12.toString());
                        }
                    } catch (RemoteException e10) {
                        StringBuilder a13 = android.support.v4.media.a.a("RemoteException communicating with ");
                        a13.append(aVar.f1399a);
                        Log.w("NotifManCompat", a13.toString(), e10);
                    }
                }
                if (!aVar.f1402d.isEmpty()) {
                    b(aVar);
                }
            }
        }

        public final void b(a aVar) {
            if (!this.f1396b.hasMessages(3, aVar.f1399a)) {
                int i10 = aVar.f1403e + 1;
                aVar.f1403e = i10;
                if (i10 > 6) {
                    StringBuilder a10 = android.support.v4.media.a.a("Giving up on delivering ");
                    a10.append(aVar.f1402d.size());
                    a10.append(" tasks to ");
                    a10.append(aVar.f1399a);
                    a10.append(" after ");
                    a10.append(aVar.f1403e);
                    a10.append(" retries");
                    Log.w("NotifManCompat", a10.toString());
                    aVar.f1402d.clear();
                    return;
                }
                int i11 = (1 << (i10 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f1396b.sendMessageDelayed(this.f1396b.obtainMessage(3, aVar.f1399a), (long) i11);
            }
        }

        public boolean handleMessage(Message message) {
            Set<String> set;
            int i10 = message.what;
            android.support.v4.app.a aVar = null;
            if (i10 == 0) {
                C0017d dVar = (C0017d) message.obj;
                String string = Settings.Secure.getString(this.f1395a.getContentResolver(), "enabled_notification_listeners");
                synchronized (d.f1382c) {
                    if (string != null) {
                        if (!string.equals(d.f1383d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet = new HashSet(split.length);
                            for (String unflattenFromString : split) {
                                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                                if (unflattenFromString2 != null) {
                                    hashSet.add(unflattenFromString2.getPackageName());
                                }
                            }
                            d.f1384e = hashSet;
                            d.f1383d = string;
                        }
                    }
                    set = d.f1384e;
                }
                if (!set.equals(this.f1398d)) {
                    this.f1398d = set;
                    List<ResolveInfo> queryIntentServices = this.f1395a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet hashSet2 = new HashSet();
                    for (ResolveInfo next : queryIntentServices) {
                        if (set.contains(next.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = next.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (next.serviceInfo.permission != null) {
                                Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet2.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!this.f1397c.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                            }
                            this.f1397c.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator<Map.Entry<ComponentName, a>> it2 = this.f1397c.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry next2 = it2.next();
                        if (!hashSet2.contains(next2.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                StringBuilder a10 = android.support.v4.media.a.a("Removing listener record for ");
                                a10.append(next2.getKey());
                                Log.d("NotifManCompat", a10.toString());
                            }
                            a aVar2 = (a) next2.getValue();
                            if (aVar2.f1400b) {
                                this.f1395a.unbindService(this);
                                aVar2.f1400b = false;
                            }
                            aVar2.f1401c = null;
                            it2.remove();
                        }
                    }
                }
                for (a next3 : this.f1397c.values()) {
                    next3.f1402d.add(dVar);
                    a(next3);
                }
                return true;
            } else if (i10 == 1) {
                b bVar = (b) message.obj;
                ComponentName componentName3 = bVar.f1393a;
                IBinder iBinder = bVar.f1394b;
                a aVar3 = this.f1397c.get(componentName3);
                if (aVar3 != null) {
                    int i11 = a.C0006a.f282a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.app.a)) {
                            aVar = new a.C0006a.C0007a(iBinder);
                        } else {
                            aVar = (android.support.v4.app.a) queryLocalInterface;
                        }
                    }
                    aVar3.f1401c = aVar;
                    aVar3.f1403e = 0;
                    a(aVar3);
                }
                return true;
            } else if (i10 == 2) {
                a aVar4 = this.f1397c.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    if (aVar4.f1400b) {
                        this.f1395a.unbindService(this);
                        aVar4.f1400b = false;
                    }
                    aVar4.f1401c = null;
                }
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                a aVar5 = this.f1397c.get((ComponentName) message.obj);
                if (aVar5 != null) {
                    a(aVar5);
                }
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1396b.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1396b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    /* compiled from: NotificationManagerCompat */
    public interface C0017d {
        void a(android.support.v4.app.a aVar) throws RemoteException;
    }

    public d(Context context) {
        this.f1387a = context;
        this.f1388b = (NotificationManager) context.getSystemService("notification");
    }

    public boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return this.f1388b.areNotificationsEnabled();
        }
        if (i10 < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1387a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1387a.getApplicationInfo();
        String packageName = this.f1387a.getApplicationContext().getPackageName();
        int i11 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
