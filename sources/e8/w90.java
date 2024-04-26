package e8;

import com.google.android.gms.internal.ads.mp;
import com.startapp.b4;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class w90 {
    public static String a(mp mpVar) {
        y10 y10 = new y10(mpVar);
        StringBuilder sb2 = new StringBuilder(mpVar.size());
        for (int i10 = 0; i10 < ((mp) y10.f17566a).size(); i10++) {
            byte D = ((mp) y10.f17566a).D(i10);
            if (D == 34) {
                sb2.append("\\\"");
            } else if (D == 39) {
                sb2.append("\\'");
            } else if (D != 92) {
                switch (D) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case b4.f10106f:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (D >= 32 && D <= 126) {
                            sb2.append((char) D);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((D >>> 6) & 3) + 48));
                            sb2.append((char) (((D >>> 3) & 7) + 48));
                            sb2.append((char) ((D & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
