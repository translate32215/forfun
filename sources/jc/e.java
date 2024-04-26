package jc;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.startapp.startappsdk.R;
import dev.pankaj.ytvlib.data.model.Category;
import java.io.Serializable;
import o1.s;
import ud.k;

/* compiled from: LiveTvFragmentDirections.kt */
public final class e implements s {

    /* renamed from: a  reason: collision with root package name */
    public final Category f19742a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19743b;

    public e() {
        this.f19742a = null;
        this.f19743b = R.id.action_liveTvFragment_self;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(Category.class)) {
            bundle.putParcelable("category", this.f19742a);
        } else if (Serializable.class.isAssignableFrom(Category.class)) {
            bundle.putSerializable("category", (Serializable) this.f19742a);
        }
        return bundle;
    }

    public int b() {
        return this.f19743b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && k.a(this.f19742a, ((e) obj).f19742a);
    }

    public int hashCode() {
        Category category = this.f19742a;
        if (category == null) {
            return 0;
        }
        return category.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("ActionLiveTvFragmentSelf(category=");
        a10.append(this.f19742a);
        a10.append(')');
        return a10.toString();
    }

    public e(Category category) {
        this.f19742a = category;
        this.f19743b = R.id.action_liveTvFragment_self;
    }
}
