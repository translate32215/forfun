package c1;

import android.app.job.JobParameters;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import f0.i;
import la.j;
import la.s;
import p5.f;
import u6.g;
import ua.a;
import v6.e0;
import v6.p;
import w6.s;
import x4.m;
import x4.s0;
import x4.y;
import z4.k;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4018a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4019b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4020c;

    public /* synthetic */ c(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f4019b = jobInfoSchedulerService;
        this.f4020c = jobParameters;
    }

    public /* synthetic */ c(String str, h hVar) {
        this.f4019b = str;
        this.f4020c = hVar;
    }

    public /* synthetic */ c(String str, ControlActivity controlActivity) {
        this.f4019b = str;
        this.f4020c = controlActivity;
    }

    public /* synthetic */ c(s sVar, a aVar) {
        this.f4019b = sVar;
        this.f4020c = aVar;
    }

    public /* synthetic */ c(f fVar, Runnable runnable) {
        this.f4019b = fVar;
        this.f4020c = runnable;
    }

    public /* synthetic */ c(g.a aVar, g gVar) {
        this.f4019b = aVar;
        this.f4020c = gVar;
    }

    public /* synthetic */ c(s.a aVar, String str) {
        this.f4020c = aVar;
        this.f4019b = str;
    }

    public /* synthetic */ c(y yVar, s0 s0Var) {
        this.f4019b = yVar;
        this.f4020c = s0Var;
    }

    public /* synthetic */ c(k.a aVar, Exception exc) {
        this.f4019b = aVar;
        this.f4020c = exc;
    }

    public final void run() {
        boolean z10 = false;
        switch (this.f4018a) {
            case 0:
                h hVar = (h) this.f4020c;
                ud.k.f(hVar, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String) this.f4019b), hVar);
                throw hVar;
            case 1:
                int i10 = JobInfoSchedulerService.f5013a;
                ((JobInfoSchedulerService) this.f4019b).jobFinished((JobParameters) this.f4020c, false);
                return;
            case 2:
                y yVar = (y) this.f4019b;
                s0 s0Var = (s0) this.f4020c;
                yVar.getClass();
                try {
                    yVar.c(s0Var);
                    return;
                } catch (m e10) {
                    p.b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 3:
                k kVar = ((k.a) this.f4019b).f28366b;
                int i11 = e0.f26436a;
                kVar.v((Exception) this.f4020c);
                return;
            case 4:
                f fVar = (f) this.f4019b;
                Runnable runnable = (Runnable) this.f4020c;
                synchronized (fVar.f23857a) {
                    if (!fVar.f23868l) {
                        long j10 = fVar.f23867k - 1;
                        fVar.f23867k = j10;
                        if (j10 <= 0) {
                            if (j10 < 0) {
                                fVar.c(new IllegalStateException());
                            } else {
                                fVar.a();
                                try {
                                    runnable.run();
                                } catch (IllegalStateException e11) {
                                    fVar.c(e11);
                                } catch (Exception e12) {
                                    fVar.c(new IllegalStateException(e12));
                                }
                            }
                        }
                    }
                }
                return;
            case 5:
                g.a aVar = g.a.f26087c;
                ((g.a) this.f4019b).b((g) this.f4020c);
                return;
            case 6:
                w6.s sVar = ((s.a) this.f4020c).f27133b;
                int i12 = e0.f26436a;
                sVar.h((String) this.f4019b);
                return;
            case 7:
                la.s sVar2 = (la.s) this.f4019b;
                a aVar2 = (a) this.f4020c;
                int i13 = j.f21203g;
                synchronized (sVar2) {
                    if (sVar2.f21228b == null) {
                        sVar2.f21227a.add(aVar2);
                    } else {
                        sVar2.f21228b.add(aVar2.get());
                    }
                }
                return;
            default:
                String str = (String) this.f4019b;
                ControlActivity controlActivity = (ControlActivity) this.f4020c;
                int i14 = wc.a.f27182b;
                ud.k.f(controlActivity, "this$0");
                if (str == null || str.length() == 0) {
                    z10 = true;
                }
                if (z10 || ud.k.a(controlActivity.O, str) || controlActivity.K <= 0) {
                    controlActivity.Q.postDelayed(new i(str, controlActivity), 1000);
                    return;
                }
                ((tc.a) controlActivity.L()).f25889w.setText(str);
                ((tc.a) controlActivity.L()).B.setMax(controlActivity.K);
                return;
        }
    }
}
