package androidx.appcompat.widget;

import ab.q;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.ads.internal.util.p;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b;
import com.startapp.b4;
import d7.l;
import e8.a9;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k3.e;
import k3.f;
import k8.o;
import k8.z;
import m3.w;
import n2.g;
import s8.a;
import s8.i;
import s8.j;
import u7.h;
import x1.c;
import x1.d;

/* compiled from: AppCompatEmojiEditTextHelper */
public class m implements d, f, a9, s8.d, z, a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1020a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1021b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1022c;

    public m(ab.f fVar, Intent intent) {
        this.f1020a = 10;
        this.f1021b = fVar;
        this.f1022c = intent;
    }

    public String a() {
        return (String) this.f1021b;
    }

    public g b(o oVar) {
        g w10 = ((g) this.f1021b).w();
        String str = (String) this.f1022c;
        w10.B(str, oVar);
        ((Map) w10.f21853d).put(str, Boolean.TRUE);
        return w10;
    }

    public void c(String str) {
        p pVar = l.B.f13186c;
        p.r((Context) this.f1021b, (String) this.f1022c, str);
    }

    public void d(c cVar) {
        Object[] objArr = (Object[]) this.f1022c;
        if (objArr != null) {
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                if (obj == null) {
                    ((y1.d) cVar).f27989a.bindNull(i10);
                } else if (obj instanceof byte[]) {
                    ((y1.d) cVar).f27989a.bindBlob(i10, (byte[]) obj);
                } else if (obj instanceof Float) {
                    ((y1.d) cVar).f27989a.bindDouble(i10, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    ((y1.d) cVar).f27989a.bindDouble(i10, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    ((y1.d) cVar).f27989a.bindLong(i10, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    ((y1.d) cVar).f27989a.bindLong(i10, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    ((y1.d) cVar).f27989a.bindLong(i10, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    ((y1.d) cVar).f27989a.bindLong(i10, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    ((y1.d) cVar).f27989a.bindString(i10, (String) obj);
                } else if (obj instanceof Boolean) {
                    ((y1.d) cVar).f27989a.bindLong(i10, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte," + " string");
                }
            }
        }
    }

    public Object e(i iVar) {
        i<TContinuationResult> iVar2;
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1021b;
        String str2 = (String) this.f1022c;
        com.google.firebase.messaging.c cVar = firebaseMessaging.f9700f;
        synchronized (cVar) {
            iVar2 = cVar.f9722b.get(str2);
            if (iVar2 == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String valueOf = String.valueOf(str2);
                    if (valueOf.length() != 0) {
                        str = "Making new request for: ".concat(valueOf);
                    } else {
                        str = new String("Making new request for: ");
                    }
                    Log.d("FirebaseMessaging", str);
                }
                q qVar = firebaseMessaging.f9699e;
                iVar2 = qVar.a(qVar.b((String) iVar.h(), b.b(qVar.f234a), "*", new Bundle())).f(cVar.f9721a, new t1.c(cVar, str2));
                cVar.f9722b.put(str2, iVar2);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(str2);
                Log.d("FirebaseMessaging", valueOf2.length() != 0 ? "Joining ongoing request for: ".concat(valueOf2) : new String("Joining ongoing request for: "));
            }
        }
        return iVar2;
    }

    public boolean equals(Object obj) {
        switch (this.f1020a) {
            case 2:
                if (obj instanceof n0.c) {
                    n0.c cVar = (n0.c) obj;
                    F f10 = cVar.f21812a;
                    F f11 = this.f1021b;
                    if (f10 == f11 || (f10 != null && f10.equals(f11))) {
                        S s10 = cVar.f21813b;
                        S s11 = this.f1022c;
                        if (s10 == s11 || (s10 != null && s10.equals(s11))) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    public KeyListener f(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? ((z0.a) this.f1022c).f28182a.a(keyListener) : keyListener;
    }

    /* JADX INFO: finally extract failed */
    public void g(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = ((EditText) this.f1021b).getContext().obtainStyledAttributes(attributeSet, e.l.f13509i, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            i(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection h(InputConnection inputConnection, EditorInfo editorInfo) {
        z0.a aVar = (z0.a) this.f1022c;
        aVar.getClass();
        if (inputConnection == null) {
            return null;
        }
        return aVar.f28182a.b(inputConnection, editorInfo);
    }

    public int hashCode() {
        switch (this.f1020a) {
            case 2:
                Object obj = this.f1021b;
                int i10 = 0;
                int hashCode = obj == null ? 0 : obj.hashCode();
                Object obj2 = this.f1022c;
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                return hashCode ^ i10;
            default:
                return super.hashCode();
        }
    }

    public void i(boolean z10) {
        ((z0.a) this.f1022c).f28182a.c(z10);
    }

    public boolean k(Object obj, File file, e eVar) {
        return ((f) this.f1022c).k(new t3.d(((BitmapDrawable) ((w) obj).get()).getBitmap(), (n3.e) this.f1021b), file, eVar);
    }

    public com.bumptech.glide.load.c q(e eVar) {
        return ((f) this.f1022c).q(eVar);
    }

    public void s(i iVar) {
        switch (this.f1020a) {
            case b4.f10106f /*8*/:
                ((h) this.f1022c).f26105b.remove((j) this.f1021b);
                return;
            default:
                ((ab.f) this.f1021b).a((Intent) this.f1022c);
                return;
        }
    }

    public String toString() {
        switch (this.f1020a) {
            case 2:
                StringBuilder a10 = android.support.v4.media.a.a("Pair{");
                a10.append(String.valueOf(this.f1021b));
                a10.append(" ");
                a10.append(String.valueOf(this.f1022c));
                a10.append("}");
                return a10.toString();
            default:
                return super.toString();
        }
    }

    public m(FirebaseMessaging firebaseMessaging, String str) {
        this.f1020a = 11;
        this.f1021b = firebaseMessaging;
        this.f1022c = str;
    }

    public m(g gVar, String str) {
        this.f1020a = 9;
        this.f1021b = gVar;
        this.f1022c = str;
    }

    public m(h hVar, j jVar) {
        this.f1020a = 8;
        this.f1022c = hVar;
        this.f1021b = jVar;
    }

    public m(Context context, String str) {
        this.f1020a = 6;
        this.f1021b = context;
        this.f1022c = str;
    }

    public m(com.google.android.gms.ads.b bVar, Bundle bundle) {
        this.f1020a = 7;
        this.f1021b = bVar;
        this.f1022c = bundle;
    }

    public m(int i10) {
        this.f1020a = i10;
        if (i10 == 5) {
            this.f1021b = new ConcurrentHashMap();
            this.f1022c = new AtomicInteger(0);
        }
    }

    public m(n3.e eVar, f fVar) {
        this.f1020a = 3;
        this.f1021b = eVar;
        this.f1022c = fVar;
    }

    public m(String str, Object[] objArr) {
        this.f1020a = 1;
        this.f1021b = str;
        this.f1022c = null;
    }

    public m(f6.d dVar, f6.e eVar) {
        this.f1020a = 4;
        this.f1021b = dVar;
        this.f1022c = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m(String str) {
        this(str, (Object[]) null);
        this.f1020a = 1;
    }

    public m(EditText editText) {
        this.f1020a = 0;
        this.f1021b = editText;
        this.f1022c = new z0.a(editText, false);
    }
}
