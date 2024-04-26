package com.startapp;

import com.startapp.sdk.jobs.JobRequest;

/* compiled from: Sta */
public class m5 {

    /* renamed from: a  reason: collision with root package name */
    public final k9 f10876a;

    /* renamed from: b  reason: collision with root package name */
    public final k9 f10877b;

    public m5(k9 k9Var, k9 k9Var2) {
        this.f10876a = k9Var;
        this.f10877b = k9Var2;
    }

    public boolean a(JobRequest... jobRequestArr) {
        boolean z10 = true;
        for (JobRequest jobRequest : jobRequestArr) {
            if (jobRequest.f12552d) {
                if (jobRequest.a(this.f10877b)) {
                }
            } else if (jobRequest.a(this.f10876a)) {
            }
            z10 = false;
        }
        return z10;
    }

    public boolean a(int i10) {
        if (!this.f10877b.a(i10)) {
            return this.f10876a.a(i10);
        }
        return true;
    }
}
