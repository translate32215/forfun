package e8;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.j8;
import com.google.android.gms.internal.ads.xs;
import com.google.android.gms.internal.ads.yt;
import com.google.android.gms.internal.ads.zt;
import e7.i;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import o.a;

@SuppressLint({"HandlerLeak"})
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class uf0<T extends zt> extends Handler implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final T f16947a;

    /* renamed from: b  reason: collision with root package name */
    public final yt f16948b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16949c;

    /* renamed from: d  reason: collision with root package name */
    public IOException f16950d;

    /* renamed from: e  reason: collision with root package name */
    public int f16951e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Thread f16952f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f16953g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ j8 f16954h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uf0(j8 j8Var, Looper looper, T t10, yt ytVar, int i10, long j10) {
        super(looper);
        this.f16954h = j8Var;
        this.f16947a = t10;
        this.f16948b = ytVar;
        this.f16949c = i10;
    }

    public final void a(long j10) {
        a.c(((uf0) this.f16954h.f7135c) == null);
        j8 j8Var = this.f16954h;
        j8Var.f7135c = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
            return;
        }
        this.f16950d = null;
        ((ExecutorService) j8Var.f7134b).execute(this);
    }

    public final void b(boolean z10) {
        this.f16953g = z10;
        this.f16950d = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            this.f16947a.f8764f = true;
            if (this.f16952f != null) {
                this.f16952f.interrupt();
            }
        }
        if (z10) {
            this.f16954h.f7135c = null;
            SystemClock.elapsedRealtime();
            this.f16948b.m(this.f16947a, true);
        }
    }

    public final void handleMessage(Message message) {
        int i10;
        jd0 jd0;
        Message message2 = message;
        if (!this.f16953g) {
            int i11 = message2.what;
            if (i11 == 0) {
                this.f16950d = null;
                j8 j8Var = this.f16954h;
                ((ExecutorService) j8Var.f7134b).execute((uf0) j8Var.f7135c);
            } else if (i11 != 4) {
                this.f16954h.f7135c = null;
                SystemClock.elapsedRealtime();
                char c10 = 0;
                if (this.f16947a.f8764f) {
                    this.f16948b.m(this.f16947a, false);
                    return;
                }
                int i12 = message2.what;
                if (i12 != 1) {
                    long j10 = 0;
                    if (i12 == 2) {
                        yt ytVar = this.f16948b;
                        ytVar.h(this.f16947a);
                        ytVar.N = true;
                        if (ytVar.F == -9223372036854775807L) {
                            long r10 = ytVar.r();
                            if (r10 != Long.MIN_VALUE) {
                                j10 = 10000 + r10;
                            }
                            ytVar.F = j10;
                            ytVar.f8647f.d(new ze0(ytVar.F, ytVar.f8658y.b()), (Object) null);
                        }
                        ytVar.f8657x.h(ytVar);
                    } else if (i12 == 3) {
                        IOException iOException = (IOException) message2.obj;
                        this.f16950d = iOException;
                        yt ytVar2 = this.f16948b;
                        T t10 = this.f16947a;
                        ytVar2.h(t10);
                        Handler handler = ytVar2.f8645d;
                        if (!(handler == null || ytVar2.f8646e == null)) {
                            handler.post(new i(ytVar2, iOException));
                        }
                        if (iOException instanceof af0) {
                            c10 = 3;
                        } else {
                            boolean z10 = ytVar2.q() > ytVar2.M;
                            if (ytVar2.J == -1 && ((jd0 = ytVar2.f8658y) == null || jd0.c() == -9223372036854775807L)) {
                                ytVar2.K = 0;
                                ytVar2.C = ytVar2.A;
                                int size = ytVar2.f8656w.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    ytVar2.f8656w.valueAt(i13).o(!ytVar2.A || ytVar2.G[i13]);
                                }
                                t10.f8763e.f13063a = 0;
                                t10.f8766h = 0;
                                t10.f8765g = true;
                            }
                            ytVar2.M = ytVar2.q();
                            if (z10) {
                                c10 = 1;
                            }
                        }
                        if (c10 == 3) {
                            this.f16954h.f7136d = this.f16950d;
                        } else if (c10 != 2) {
                            if (c10 == 1) {
                                i10 = 1;
                            } else {
                                i10 = this.f16951e + 1;
                            }
                            this.f16951e = i10;
                            a((long) Math.min((i10 - 1) * 1000, 5000));
                        }
                    }
                } else {
                    this.f16948b.m(this.f16947a, false);
                }
            } else {
                throw ((Error) message2.obj);
            }
        }
    }

    public final void run() {
        try {
            this.f16952f = Thread.currentThread();
            if (!this.f16947a.f8764f) {
                String simpleName = this.f16947a.getClass().getSimpleName();
                xs.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                this.f16947a.a();
                xs.b();
            }
            if (!this.f16953g) {
                sendEmptyMessage(2);
            }
        } catch (IOException e10) {
            if (!this.f16953g) {
                obtainMessage(3, e10).sendToTarget();
            }
        } catch (InterruptedException unused) {
            a.c(this.f16947a.f8764f);
            if (!this.f16953g) {
                sendEmptyMessage(2);
            }
        } catch (Exception e11) {
            Log.e("LoadTask", "Unexpected exception loading stream", e11);
            if (!this.f16953g) {
                obtainMessage(3, new wf0(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e12);
            if (!this.f16953g) {
                obtainMessage(3, new wf0(e12)).sendToTarget();
            }
        } catch (Error e13) {
            Log.e("LoadTask", "Unexpected error loading stream", e13);
            if (!this.f16953g) {
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        } catch (Throwable th) {
            xs.b();
            throw th;
        }
    }
}
