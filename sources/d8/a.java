package d8;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class a extends Thread {
    public a(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r1 = this;
            r0 = 19
            android.os.Process.setThreadPriority(r0)
            monitor-enter(r1)
        L_0x0006:
            r1.wait()     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x0006
        L_0x000a:
            r0 = move-exception
            goto L_0x000e
        L_0x000c:
            monitor-exit(r1)     // Catch:{ all -> 0x000a }
            return
        L_0x000e:
            monitor-exit(r1)     // Catch:{ all -> 0x000a }
            goto L_0x0011
        L_0x0010:
            throw r0
        L_0x0011:
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a.run():void");
    }
}
