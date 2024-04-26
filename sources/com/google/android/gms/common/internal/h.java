package com.google.android.gms.common.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class h {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List f5869a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f5870b;

        public a(Object obj) {
            if (obj != null) {
                this.f5870b = obj;
                this.f5869a = new ArrayList();
                return;
            }
            throw new NullPointerException("null reference");
        }

        @CanIgnoreReturnValue
        public a a(String str, Object obj) {
            List list = this.f5869a;
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f5870b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f5869a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f5869a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
