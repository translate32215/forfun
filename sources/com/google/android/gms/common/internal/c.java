package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import v7.k;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class c {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Account f5841a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f5842b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<Scope> f5843c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final View f5844d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5845e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5846f;

    /* renamed from: g  reason: collision with root package name */
    public final p8.a f5847g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f5848h;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public Account f5849a;

        /* renamed from: b  reason: collision with root package name */
        public s.c<Scope> f5850b;

        /* renamed from: c  reason: collision with root package name */
        public String f5851c;

        /* renamed from: d  reason: collision with root package name */
        public String f5852d;

        public c a() {
            return new c(this.f5849a, this.f5850b, (Map) null, 0, (View) null, this.f5851c, this.f5852d, p8.a.f23946a);
        }
    }

    public c(@Nullable Account account, Set set, Map map, int i10, @Nullable View view, String str, String str2, @Nullable p8.a aVar) {
        this.f5841a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f5842b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f5844d = null;
        this.f5845e = str;
        this.f5846f = str2;
        this.f5847g = aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (k kVar : emptyMap.values()) {
            kVar.getClass();
            hashSet.addAll((Collection) null);
        }
        this.f5843c = Collections.unmodifiableSet(hashSet);
    }
}
