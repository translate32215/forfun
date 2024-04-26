package r7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import e.i;
import h8.a;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
import x4.a0;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class j implements ServiceConnection {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public int f24710a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f24711b = new Messenger(new a(Looper.getMainLooper(), new l(this)));

    /* renamed from: c  reason: collision with root package name */
    public o f24712c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public final Queue<p<?>> f24713d = new ArrayDeque();
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<p<?>> f24714e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f24715f;

    public j(i iVar, i iVar2) {
        this.f24715f = iVar;
    }

    public final synchronized void a(int i10, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f24710a;
        if (i11 == 0) {
            throw new IllegalStateException();
        } else if (i11 == 1 || i11 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f24710a = 4;
            y7.a.b().c(this.f24715f.f24706a, this);
            a0 a0Var = new a0(i10, str);
            for (p c10 : this.f24713d) {
                c10.c(a0Var);
            }
            this.f24713d.clear();
            for (int i12 = 0; i12 < this.f24714e.size(); i12++) {
                this.f24714e.valueAt(i12).c(a0Var);
            }
            this.f24714e.clear();
        } else if (i11 == 3) {
            this.f24710a = 4;
        } else if (i11 != 4) {
            int i13 = this.f24710a;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unknown state: ");
            sb2.append(i13);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(r7.p<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f24710a     // Catch:{ all -> 0x009c }
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x004a
            if (r0 == r2) goto L_0x0043
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x009c }
            int r0 = r5.f24710a     // Catch:{ all -> 0x009c }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r2.<init>(r1)     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x009c }
            r2.append(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x009c }
            r6.<init>(r0)     // Catch:{ all -> 0x009c }
            throw r6     // Catch:{ all -> 0x009c }
        L_0x002e:
            monitor-exit(r5)
            return r3
        L_0x0030:
            java.util.Queue<r7.p<?>> r0 = r5.f24713d     // Catch:{ all -> 0x009c }
            r0.add(r6)     // Catch:{ all -> 0x009c }
            r7.i r6 = r5.f24715f     // Catch:{ all -> 0x009c }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f24707b     // Catch:{ all -> 0x009c }
            r7.k r0 = new r7.k     // Catch:{ all -> 0x009c }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x009c }
            r6.execute(r0)     // Catch:{ all -> 0x009c }
            monitor-exit(r5)
            return r2
        L_0x0043:
            java.util.Queue<r7.p<?>> r0 = r5.f24713d     // Catch:{ all -> 0x009c }
            r0.add(r6)     // Catch:{ all -> 0x009c }
            monitor-exit(r5)
            return r2
        L_0x004a:
            java.util.Queue<r7.p<?>> r0 = r5.f24713d     // Catch:{ all -> 0x009c }
            r0.add(r6)     // Catch:{ all -> 0x009c }
            int r6 = r5.f24710a     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x0055
            r6 = 1
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            com.google.android.gms.common.internal.i.j(r6)     // Catch:{ all -> 0x009c }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x009c }
        L_0x0068:
            r5.f24710a = r2     // Catch:{ all -> 0x009c }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x009c }
            y7.a r0 = y7.a.b()     // Catch:{ all -> 0x009c }
            r7.i r1 = r5.f24715f     // Catch:{ all -> 0x009c }
            android.content.Context r1 = r1.f24706a     // Catch:{ all -> 0x009c }
            boolean r6 = r0.a(r1, r6, r5, r2)     // Catch:{ all -> 0x009c }
            if (r6 != 0) goto L_0x008a
            java.lang.String r6 = "Unable to bind to service"
            r5.a(r3, r6)     // Catch:{ all -> 0x009c }
            goto L_0x009a
        L_0x008a:
            r7.i r6 = r5.f24715f     // Catch:{ all -> 0x009c }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f24707b     // Catch:{ all -> 0x009c }
            r7.k r0 = new r7.k     // Catch:{ all -> 0x009c }
            r0.<init>(r5, r3)     // Catch:{ all -> 0x009c }
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x009c }
            r6.schedule(r0, r3, r1)     // Catch:{ all -> 0x009c }
        L_0x009a:
            monitor-exit(r5)
            return r2
        L_0x009c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.j.b(r7.p):boolean");
    }

    public final synchronized void c() {
        if (this.f24710a == 2 && this.f24713d.isEmpty() && this.f24714e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f24710a = 3;
            y7.a.b().c(this.f24715f.f24706a, this);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f24715f.f24707b.execute(new e7.i(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f24715f.f24707b.execute(new f7.j(this));
    }
}
