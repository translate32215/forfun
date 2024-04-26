package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import g2.k;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {

    /* renamed from: a  reason: collision with root package name */
    public Context f3216a;

    /* renamed from: b  reason: collision with root package name */
    public WorkerParameters f3217b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f3218c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3219d;

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f3216a = context;
            this.f3217b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.f3216a;
    }

    public Executor getBackgroundExecutor() {
        return this.f3217b.f3229f;
    }

    public final UUID getId() {
        return this.f3217b.f3224a;
    }

    public final b getInputData() {
        return this.f3217b.f3225b;
    }

    public final Network getNetwork() {
        return this.f3217b.f3227d.f3234c;
    }

    public final int getRunAttemptCount() {
        return this.f3217b.f3228e;
    }

    public final Set<String> getTags() {
        return this.f3217b.f3226c;
    }

    public r2.a getTaskExecutor() {
        return this.f3217b.f3230g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f3217b.f3227d.f3232a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f3217b.f3227d.f3233b;
    }

    public k getWorkerFactory() {
        return this.f3217b.f3231h;
    }

    public final boolean isStopped() {
        return this.f3218c;
    }

    public final boolean isUsed() {
        return this.f3219d;
    }

    public void onStopped() {
    }

    public final void setUsed() {
        this.f3219d = true;
    }

    public abstract ea.a<a> startWork();

    public final void stop() {
        this.f3218c = true;
        onStopped();
    }

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0040a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final b f3220a = b.f3239c;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0040a.class != obj.getClass()) {
                    return false;
                }
                return this.f3220a.equals(((C0040a) obj).f3220a);
            }

            public int hashCode() {
                return this.f3220a.hashCode() + (C0040a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Failure {mOutputData=");
                a10.append(this.f3220a);
                a10.append('}');
                return a10.toString();
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final b f3221a;

            public c() {
                this.f3221a = b.f3239c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f3221a.equals(((c) obj).f3221a);
            }

            public int hashCode() {
                return this.f3221a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder a10 = android.support.v4.media.a.a("Success {mOutputData=");
                a10.append(this.f3221a);
                a10.append('}');
                return a10.toString();
            }

            public c(b bVar) {
                this.f3221a = bVar;
            }
        }
    }
}
