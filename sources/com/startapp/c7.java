package com.startapp;

import android.text.TextUtils;
import com.startapp.sdk.common.SDKException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import q.c;

/* compiled from: Sta */
public class c7 extends m8 {

    /* renamed from: a  reason: collision with root package name */
    public final Set<d7> f10249a = new HashSet();

    public void a(String str, Object obj, boolean z10, boolean z11) throws SDKException {
        if (z10 && obj == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
            try {
                d7 d7Var = new d7();
                d7Var.f10296a = str;
                String obj2 = obj.toString();
                if (z11) {
                    obj2 = URLEncoder.encode(obj2, "UTF-8");
                }
                d7Var.f10297b = obj2;
                if (!this.f10249a.add(d7Var)) {
                    this.f10249a.remove(d7Var);
                    this.f10249a.add(d7Var);
                }
            } catch (UnsupportedEncodingException e10) {
                if (z10) {
                    throw new SDKException(str, e10);
                }
            }
        }
    }

    public String toString() {
        StringBuilder a10 = c.a('?');
        for (d7 next : this.f10249a) {
            if (next.f10297b != null) {
                a10.append(next.f10296a);
                a10.append('=');
                a10.append(next.f10297b);
                a10.append('&');
            } else {
                Set<String> set = next.f10298c;
                if (set != null) {
                    for (String append : set) {
                        a10.append(next.f10296a);
                        a10.append('=');
                        a10.append(append);
                        a10.append('&');
                    }
                }
            }
        }
        if (a10.length() != 0) {
            a10.deleteCharAt(a10.length() - 1);
        }
        return a10.toString().replace("+", "%20");
    }

    public void a(String str, Set<String> set, boolean z10, boolean z11) throws SDKException {
        if (z10 && set == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (set != null) {
            d7 d7Var = new d7();
            d7Var.f10296a = str;
            HashSet hashSet = new HashSet();
            for (String next : set) {
                if (z11) {
                    try {
                        next = URLEncoder.encode(next, "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                hashSet.add(next);
            }
            if (!z10 || hashSet.size() != 0) {
                d7Var.f10298c = hashSet;
                if (!this.f10249a.add(d7Var)) {
                    this.f10249a.remove(d7Var);
                    this.f10249a.add(d7Var);
                    return;
                }
                return;
            }
            throw new SDKException(str, (Throwable) null);
        }
    }
}
