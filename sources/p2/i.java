package p2;

import androidx.work.WorkerParameters;
import h2.h;

/* compiled from: StartWorkRunnable */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public h f23797a;

    /* renamed from: b  reason: collision with root package name */
    public String f23798b;

    /* renamed from: c  reason: collision with root package name */
    public WorkerParameters.a f23799c;

    public i(h hVar, String str, WorkerParameters.a aVar) {
        this.f23797a = hVar;
        this.f23798b = str;
        this.f23799c = aVar;
    }

    public void run() {
        this.f23797a.f18833f.c(this.f23798b, this.f23799c);
    }
}
