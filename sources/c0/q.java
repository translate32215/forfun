package c0;

import android.app.Person;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: Person */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f3999a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f4000b;

    /* renamed from: c  reason: collision with root package name */
    public String f4001c;

    /* renamed from: d  reason: collision with root package name */
    public String f4002d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4003e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4004f;

    /* compiled from: Person */
    public static class a {
        public static q a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.f4005a = person.getName();
            IconCompat iconCompat2 = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f1409k;
                icon.getClass();
                int c10 = IconCompat.a.c(icon);
                if (c10 != 2) {
                    if (c10 == 4) {
                        Uri d10 = IconCompat.a.d(icon);
                        d10.getClass();
                        String uri = d10.toString();
                        uri.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f1411b = uri;
                    } else if (c10 != 6) {
                        iconCompat2 = new IconCompat(-1);
                        iconCompat2.f1411b = icon;
                    } else {
                        Uri d11 = IconCompat.a.d(icon);
                        d11.getClass();
                        String uri2 = d11.toString();
                        uri2.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.f1411b = uri2;
                    }
                    iconCompat2 = iconCompat;
                } else {
                    iconCompat2 = IconCompat.b((Resources) null, IconCompat.a.b(icon), IconCompat.a.a(icon));
                }
            }
            bVar.f4006b = iconCompat2;
            bVar.f4007c = person.getUri();
            bVar.f4008d = person.getKey();
            bVar.f4009e = person.isBot();
            bVar.f4010f = person.isImportant();
            return new q(bVar);
        }

        public static Person b(q qVar) {
            Person.Builder name = new Person.Builder().setName(qVar.f3999a);
            IconCompat iconCompat = qVar.f4000b;
            return name.setIcon(iconCompat != null ? iconCompat.g() : null).setUri(qVar.f4001c).setKey(qVar.f4002d).setBot(qVar.f4003e).setImportant(qVar.f4004f).build();
        }
    }

    /* compiled from: Person */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f4005a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f4006b;

        /* renamed from: c  reason: collision with root package name */
        public String f4007c;

        /* renamed from: d  reason: collision with root package name */
        public String f4008d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4009e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4010f;
    }

    public q(b bVar) {
        this.f3999a = bVar.f4005a;
        this.f4000b = bVar.f4006b;
        this.f4001c = bVar.f4007c;
        this.f4002d = bVar.f4008d;
        this.f4003e = bVar.f4009e;
        this.f4004f = bVar.f4010f;
    }
}
