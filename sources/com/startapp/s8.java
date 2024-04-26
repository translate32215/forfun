package com.startapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Pair;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class s8 extends v8 {

    /* renamed from: c  reason: collision with root package name */
    public BroadcastReceiver f11701c;

    /* compiled from: Sta */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x8 f11702a;

        public a(x8 x8Var) {
            this.f11702a = x8Var;
        }

        public void onReceive(Context context, Intent intent) {
            this.f11702a.a((Object) new Pair(s8.this, intent));
        }
    }

    public s8(String str, Map<String, String> map) {
        super(str, map);
    }

    public void a(Context context, x8 x8Var) throws Exception {
        if (this.f11701c == null) {
            a aVar = new a(x8Var);
            this.f11701c = aVar;
            context.registerReceiver(aVar, new IntentFilter(this.f12698a));
            return;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s8.class != obj.getClass()) {
            return false;
        }
        return wb.a(this.f11701c, ((s8) obj).f11701c);
    }

    public int hashCode() {
        Object[] objArr = {this.f11701c};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }

    public void a(Context context) throws Exception {
        BroadcastReceiver broadcastReceiver = this.f11701c;
        if (broadcastReceiver != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f11701c = null;
            return;
        }
        throw new IllegalStateException();
    }
}
