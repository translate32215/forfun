package com.startapp;

import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;

/* compiled from: Sta */
public class lb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TriggeredLinksMetadata f10815a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10816b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10817c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f10818d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ jb f10819e;

    public lb(jb jbVar, TriggeredLinksMetadata triggeredLinksMetadata, String str, String str2, int i10) {
        this.f10819e = jbVar;
        this.f10815a = triggeredLinksMetadata;
        this.f10816b = str;
        this.f10817c = str2;
        this.f10818d = i10;
    }

    public void run() {
        try {
            this.f10819e.a(this.f10815a, "Periodic", this.f10816b, this.f10817c);
        } catch (Throwable th) {
            if (this.f10819e.a(1)) {
                i4.a(th);
            }
        } finally {
            this.f10819e.a(this.f10816b, this.f10818d);
            this.f10819e.a(0);
        }
    }
}
