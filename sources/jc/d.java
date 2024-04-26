package jc;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.a;
import dev.pankaj.ytvlib.data.model.Category;
import java.io.Serializable;
import ud.k;

/* compiled from: LiveTvFragmentArgs.kt */
public final class d implements o1.d {

    /* renamed from: a  reason: collision with root package name */
    public final Category f19741a;

    public d() {
        this.f19741a = null;
    }

    public static final d fromBundle(Bundle bundle) {
        Category category;
        k.f(bundle, "bundle");
        bundle.setClassLoader(d.class.getClassLoader());
        if (!bundle.containsKey("category")) {
            category = null;
        } else if (Parcelable.class.isAssignableFrom(Category.class) || Serializable.class.isAssignableFrom(Category.class)) {
            category = (Category) bundle.get("category");
        } else {
            throw new UnsupportedOperationException(Category.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return new d(category);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k.a(this.f19741a, ((d) obj).f19741a);
    }

    public int hashCode() {
        Category category = this.f19741a;
        if (category == null) {
            return 0;
        }
        return category.hashCode();
    }

    public String toString() {
        StringBuilder a10 = a.a("LiveTvFragmentArgs(category=");
        a10.append(this.f19741a);
        a10.append(')');
        return a10.toString();
    }

    public d(Category category) {
        this.f19741a = category;
    }
}
