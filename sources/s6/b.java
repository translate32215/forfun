package s6;

import android.content.res.Resources;
import android.text.TextUtils;
import com.startapp.startappsdk.R;
import java.util.Locale;
import v6.e0;
import v6.s;
import x4.b0;

/* compiled from: DefaultTrackNameProvider */
public class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f24966a;

    public b(Resources resources) {
        resources.getClass();
        this.f24966a = resources;
    }

    public String a(b0 b0Var) {
        String str;
        int i10 = s.i(b0Var.f27408t);
        if (i10 == -1) {
            if (s.j(b0Var.f27405i) == null) {
                if (s.b(b0Var.f27405i) == null) {
                    if (b0Var.f27413y == -1 && b0Var.f27414z == -1) {
                        if (b0Var.G == -1 && b0Var.H == -1) {
                            i10 = -1;
                        }
                    }
                }
                i10 = 1;
            }
            i10 = 2;
        }
        String str2 = "";
        if (i10 == 2) {
            String[] strArr = new String[3];
            strArr[0] = d(b0Var);
            int i11 = b0Var.f27413y;
            int i12 = b0Var.f27414z;
            if (!(i11 == -1 || i12 == -1)) {
                str2 = this.f24966a.getString(R.string.exo_track_resolution, new Object[]{Integer.valueOf(i11), Integer.valueOf(i12)});
            }
            strArr[1] = str2;
            strArr[2] = b(b0Var);
            str = e(strArr);
        } else if (i10 == 1) {
            String[] strArr2 = new String[3];
            strArr2[0] = c(b0Var);
            int i13 = b0Var.G;
            if (i13 != -1 && i13 >= 1) {
                str2 = i13 != 1 ? i13 != 2 ? (i13 == 6 || i13 == 7) ? this.f24966a.getString(R.string.exo_track_surround_5_point_1) : i13 != 8 ? this.f24966a.getString(R.string.exo_track_surround) : this.f24966a.getString(R.string.exo_track_surround_7_point_1) : this.f24966a.getString(R.string.exo_track_stereo) : this.f24966a.getString(R.string.exo_track_mono);
            }
            strArr2[1] = str2;
            strArr2[2] = b(b0Var);
            str = e(strArr2);
        } else {
            str = c(b0Var);
        }
        return str.length() == 0 ? this.f24966a.getString(R.string.exo_track_unknown) : str;
    }

    public final String b(b0 b0Var) {
        int i10 = b0Var.f27404h;
        if (i10 == -1) {
            return "";
        }
        return this.f24966a.getString(R.string.exo_track_bitrate, new Object[]{Float.valueOf(((float) i10) / 1000000.0f)});
    }

    public final String c(b0 b0Var) {
        String str;
        String[] strArr = new String[2];
        String str2 = b0Var.f27399c;
        String str3 = "";
        if (TextUtils.isEmpty(str2) || "und".equals(str2)) {
            str = str3;
        } else {
            str = (e0.f26436a >= 21 ? Locale.forLanguageTag(str2) : new Locale(str2)).getDisplayName();
        }
        strArr[0] = str;
        strArr[1] = d(b0Var);
        String e10 = e(strArr);
        if (!TextUtils.isEmpty(e10)) {
            return e10;
        }
        if (!TextUtils.isEmpty(b0Var.f27398b)) {
            str3 = b0Var.f27398b;
        }
        return str3;
    }

    public final String d(b0 b0Var) {
        String string = (b0Var.f27401e & 2) != 0 ? this.f24966a.getString(R.string.exo_track_role_alternate) : "";
        if ((b0Var.f27401e & 4) != 0) {
            string = e(string, this.f24966a.getString(R.string.exo_track_role_supplementary));
        }
        if ((b0Var.f27401e & 8) != 0) {
            string = e(string, this.f24966a.getString(R.string.exo_track_role_commentary));
        }
        if ((b0Var.f27401e & 1088) == 0) {
            return string;
        }
        return e(string, this.f24966a.getString(R.string.exo_track_role_closed_captions));
    }

    public final String e(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f24966a.getString(R.string.exo_item_list, new Object[]{str, str2});
                }
            }
        }
        return str;
    }
}
