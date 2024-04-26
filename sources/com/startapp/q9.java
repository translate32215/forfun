package com.startapp;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: Sta */
public class q9 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Queue<Runnable> f11625a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f11626b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f11627c;

    /* compiled from: Sta */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f11628a;

        public a(Runnable runnable) {
            this.f11628a = runnable;
        }

        public void run() {
            try {
                this.f11628a.run();
            } finally {
                q9.this.a();
            }
        }
    }

    public q9(Executor executor) {
        this.f11626b = executor;
    }

    public synchronized void a() {
        Runnable poll = this.f11625a.poll();
        this.f11627c = poll;
        if (poll != null) {
            this.f11626b.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f11625a.offer(new a(runnable));
        if (this.f11627c == null) {
            a();
        }
    }
}
