package com.adcolony.sdk;

import android.support.v4.media.a;
import com.adcolony.sdk.b0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p.f;

public class h0 implements b0.a {

    /* renamed from: a  reason: collision with root package name */
    public BlockingQueue<Runnable> f4521a = new LinkedBlockingQueue();

    /* renamed from: b  reason: collision with root package name */
    public ThreadPoolExecutor f4522b = new ThreadPoolExecutor(4, 16, 60, TimeUnit.SECONDS, this.f4521a);

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentLinkedQueue<b0> f4523c = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    public String f4524d;

    public void a(b0 b0Var, g gVar, Map<String, List<String>> map) {
        JSONObject jSONObject = new JSONObject();
        r0.e(jSONObject, "url", b0Var.f4454s);
        r0.k(jSONObject, "success", b0Var.f4456u);
        r0.j(jSONObject, "status", b0Var.f4458w);
        r0.e(jSONObject, "body", b0Var.f4455t);
        r0.j(jSONObject, "size", b0Var.f4457v);
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                String obj = ((List) next.getValue()).toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (next.getKey() != null) {
                    r0.e(jSONObject2, (String) next.getKey(), substring);
                }
            }
            r0.g(jSONObject, "headers", jSONObject2);
        }
        gVar.a(jSONObject).b();
    }

    public void b(b0 b0Var) {
        String str = this.f4524d;
        if (str == null || str.equals("")) {
            this.f4523c.add(b0Var);
            return;
        }
        try {
            this.f4522b.execute(b0Var);
        } catch (RejectedExecutionException unused) {
            StringBuilder a10 = a.a("RejectedExecutionException: ThreadPoolExecutor unable to ");
            StringBuilder a11 = a.a("execute download for url ");
            a11.append(b0Var.f4454s);
            a10.append(a11.toString());
            f.a(0, 0, a10.toString(), true);
            a(b0Var, b0Var.f4446c, (Map<String, List<String>>) null);
        }
    }
}
