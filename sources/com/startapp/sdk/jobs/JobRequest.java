package com.startapp.sdk.jobs;

import com.startapp.k9;
import java.util.ArrayList;
import java.util.UUID;

/* compiled from: Sta */
public abstract class JobRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f12549a;

    /* renamed from: b  reason: collision with root package name */
    public final UUID f12550b = UUID.randomUUID();

    /* renamed from: c  reason: collision with root package name */
    public final Network f12551c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12552d;

    /* compiled from: Sta */
    public enum Network {
        ANY,
        UNMETERED
    }

    /* compiled from: Sta */
    public static abstract class a<B extends a<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f12556a;

        /* renamed from: b  reason: collision with root package name */
        public Network f12557b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12558c;

        @SafeVarargs
        public a(Class<? extends b>... clsArr) {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends b> name : clsArr) {
                arrayList.add(name.getName());
            }
            this.f12556a = (String[]) arrayList.toArray(new String[0]);
        }
    }

    public JobRequest(a<?> aVar) {
        this.f12549a = aVar.f12556a;
        this.f12551c = aVar.f12557b;
        this.f12552d = aVar.f12558c;
    }

    @SafeVarargs
    public static int a(Class<? extends b>... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            strArr[i10] = clsArr[i10].getName();
        }
        return a(strArr);
    }

    public abstract boolean a(k9 k9Var);

    public static int a(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String append : strArr) {
            sb2.append(append);
        }
        return sb2.toString().hashCode();
    }
}
