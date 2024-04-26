package k8;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class r implements Iterable<o>, o {

    /* renamed from: a  reason: collision with root package name */
    public final String f20445a;

    public r(String str) {
        if (str != null) {
            this.f20445a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final Double a() {
        if (this.f20445a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f20445a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final Iterator<o> c() {
        return new q(this, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f20445a.equals(((r) obj).f20445a);
    }

    public final o f() {
        return new r(this.f20445a);
    }

    public final int hashCode() {
        return this.f20445a.hashCode();
    }

    public final Iterator<o> iterator() {
        return new q(this, 1);
    }

    public final Boolean j() {
        return Boolean.valueOf(!this.f20445a.isEmpty());
    }

    public final String q() {
        return this.f20445a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x019e, code lost:
        x.f.n("toLowerCase", 0, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b5, code lost:
        x.f.n("toLocaleLowerCase", 0, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ca, code lost:
        x.f.n("toLocaleUpperCase", 0, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01df, code lost:
        r1 = r21;
        x.f.p("substring", 2, r1);
        r0 = r18.f20445a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ee, code lost:
        if (r21.size() <= 0) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f0, code lost:
        r4 = r20;
        r2 = (int) x.f.e(r4.y(r1.get(0)).a().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020a, code lost:
        r4 = r20;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0212, code lost:
        if (r21.size() <= 1) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0214, code lost:
        r1 = (int) x.f.e(r4.y(r1.get(1)).a().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x022c, code lost:
        r1 = r0.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0230, code lost:
        r2 = java.lang.Math.min(java.lang.Math.max(r2, 0), r0.length());
        r1 = java.lang.Math.min(java.lang.Math.max(r1, 0), r0.length());
        r4 = new k8.r(r0.substring(java.lang.Math.min(r2, r1), java.lang.Math.max(r2, r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x025c, code lost:
        r3 = r18;
        r4 = r20;
        r1 = r21;
        x.f.p("split", 2, r1);
        r2 = r3.f20445a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026c, code lost:
        if (r2.length() != 0) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x027f, code lost:
        r6 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0289, code lost:
        if (r21.size() != 0) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028b, code lost:
        r6.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0290, code lost:
        r5 = r4.y(r1.get(0)).q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02a3, code lost:
        if (r21.size() <= 1) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a5, code lost:
        r7 = x.f.j(r4.y(r1.get(1)).a().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02bc, code lost:
        r7 = 2147483647L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c3, code lost:
        if (r7 != 0) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02cc, code lost:
        r1 = r2.split(java.util.regex.Pattern.quote(r5), ((int) r7) + 1);
        r2 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02dc, code lost:
        if (r5.equals(r0) == false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02de, code lost:
        if (r2 <= 0) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e0, code lost:
        r4 = r1[0].equals(r0);
        r5 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ef, code lost:
        if (r1[r5].equals(r0) != false) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f2, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f3, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f7, code lost:
        if (((long) r2) <= r7) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02f9, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02fb, code lost:
        if (r4 >= r5) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02fd, code lost:
        r6.add(new k8.r(r1[r4]));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0311, code lost:
        r4 = r20;
        r1 = r21;
        x.f.p("slice", 2, r1);
        r0 = r18.f20445a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0321, code lost:
        if (r21.size() <= 0) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0323, code lost:
        r5 = r4.y(r1.get(0)).a().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0337, code lost:
        r5 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0339, code lost:
        r5 = x.f.e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0341, code lost:
        if (r5 >= 0.0d) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0343, code lost:
        r9 = (double) r0.length();
        java.lang.Double.isNaN(r9);
        r5 = java.lang.Math.max(r9 + r5, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0351, code lost:
        r5 = java.lang.Math.min(r5, (double) r0.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x035a, code lost:
        r2 = (int) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0360, code lost:
        if (r21.size() <= 1) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0362, code lost:
        r4 = r4.y(r1.get(1)).a().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0375, code lost:
        r4 = (double) r0.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x037a, code lost:
        r4 = x.f.e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0382, code lost:
        if (r4 >= 0.0d) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0384, code lost:
        r8 = (double) r0.length();
        java.lang.Double.isNaN(r8);
        r4 = java.lang.Math.max(r8 + r4, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0392, code lost:
        r4 = java.lang.Math.min(r4, (double) r0.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x039b, code lost:
        r4 = new k8.r(r0.substring(r2, java.lang.Math.max(0, ((int) r4) - r2) + r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03ae, code lost:
        r3 = r18;
        r4 = r20;
        r1 = r21;
        x.f.p("search", 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03bd, code lost:
        if (r21.size() <= 0) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03bf, code lost:
        r17 = r4.y(r1.get(0)).q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03cd, code lost:
        r0 = java.util.regex.Pattern.compile(r17).matcher(r3.f20445a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03db, code lost:
        if (r0.find() == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03fa, code lost:
        r3 = r18;
        r4 = r20;
        r1 = r21;
        x.f.p("replace", 2, r1);
        r0 = k8.o.f20381n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x040a, code lost:
        if (r21.size() <= 0) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x040c, code lost:
        r17 = r4.y(r1.get(0)).q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0420, code lost:
        if (r21.size() <= 1) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0422, code lost:
        r0 = r4.y(r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x042c, code lost:
        r1 = r17;
        r2 = r3.f20445a;
        r5 = r2.indexOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0434, code lost:
        if (r5 < 0) goto L_0x061d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0438, code lost:
        if ((r0 instanceof k8.i) == false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x043a, code lost:
        r0 = ((k8.i) r0).b(r4, java.util.Arrays.asList(new k8.o[]{new k8.r(r1), new k8.h(java.lang.Double.valueOf((double) r5)), r3}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x045f, code lost:
        r6 = r2.substring(0, r5);
        r0 = r0.q();
        r1 = r2.substring(r1.length() + r5);
        r4 = new k8.r(androidx.fragment.app.a.a(new java.lang.StringBuilder((java.lang.String.valueOf(r6).length() + java.lang.String.valueOf(r0).length()) + java.lang.String.valueOf(r1).length()), r6, r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x049b, code lost:
        r4 = r20;
        r1 = r21;
        x.f.p("match", 1, r1);
        r2 = r18.f20445a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04ab, code lost:
        if (r21.size() > 0) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04ae, code lost:
        r0 = r4.y(r1.get(0)).q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04bd, code lost:
        r0 = java.util.regex.Pattern.compile(r0).matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04c9, code lost:
        if (r0.find() == false) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04e9, code lost:
        r4 = r20;
        r1 = r21;
        x.f.p("lastIndexOf", 2, r1);
        r5 = r18.f20445a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04fa, code lost:
        if (r21.size() > 0) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04fd, code lost:
        r17 = r4.y(r1.get(0)).q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x050b, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0511, code lost:
        if (r21.size() >= 2) goto L_0x0516;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0513, code lost:
        r1 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0516, code lost:
        r1 = r4.y(r1.get(1)).a().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x052d, code lost:
        if (java.lang.Double.isNaN(r1) == false) goto L_0x0532;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x052f, code lost:
        r1 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0532, code lost:
        r1 = x.f.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0536, code lost:
        r4 = new k8.h(java.lang.Double.valueOf((double) r5.lastIndexOf(r0, (int) r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0548, code lost:
        r4 = r20;
        r1 = r21;
        r7 = 0.0d;
        x.f.p("indexOf", 2, r1);
        r2 = r18.f20445a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x055a, code lost:
        if (r21.size() > 0) goto L_0x055d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x055d, code lost:
        r17 = r4.y(r1.get(0)).q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x056c, code lost:
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0572, code lost:
        if (r21.size() >= 2) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0575, code lost:
        r7 = r4.y(r1.get(1)).a().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0588, code lost:
        r4 = new k8.h(java.lang.Double.valueOf((double) r2.indexOf(r5, (int) x.f.e(r7))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x059c, code lost:
        r1 = r21;
        x.f.n("hasOwnProperty", 1, r1);
        r0 = r18.f20445a;
        r1 = r20.y(r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05be, code lost:
        if ("length".equals(r1.q()) == false) goto L_0x05c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05c4, code lost:
        r1 = r1.a().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05d2, code lost:
        if (r1 != java.lang.Math.floor(r1)) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05d4, code lost:
        r1 = (int) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05d5, code lost:
        if (r1 < 0) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05db, code lost:
        if (r1 >= r0.length()) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05e5, code lost:
        r3 = r18;
        r4 = r20;
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05ef, code lost:
        if (r21.size() == 0) goto L_0x061d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05f1, code lost:
        r0 = new java.lang.StringBuilder(r3.f20445a);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05fd, code lost:
        if (r2 >= r21.size()) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05ff, code lost:
        r0.append(r4.y(r1.get(r2)).q());
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x061f, code lost:
        r3 = r18;
        r4 = r20;
        r1 = r21;
        x.f.p(r5, 1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x062d, code lost:
        if (r21.size() <= 0) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x062f, code lost:
        r0 = (int) x.f.e(r4.y(r1.get(0)).a().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0648, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0649, code lost:
        r1 = r3.f20445a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x064b, code lost:
        if (r0 < 0) goto L_0x0663;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0651, code lost:
        if (r0 < r1.length()) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        return k8.o.W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        return new k8.r(r18.f20445a.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        return new k8.r(r18.f20445a.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        return new k8.r(r18.f20445a.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return new k8.r(r18.f20445a.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return new k8.r(r18.f20445a.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return new k8.e(java.util.Arrays.asList(new k8.o[]{r3}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return new k8.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return new k8.e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return new k8.h(java.lang.Double.valueOf((double) r0.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return new k8.h(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return new k8.e(java.util.Arrays.asList(new k8.o[]{new k8.r(r0.group())}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return k8.o.f20382o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return k8.o.U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return k8.o.U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return k8.o.V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return new k8.r(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return new k8.r(java.lang.String.valueOf(r1.charAt(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0124, code lost:
        r5 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0150, code lost:
        r16 = "toString";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0153, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0155, code lost:
        r0 = "";
        r17 = "undefined";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0159, code lost:
        switch(r1) {
            case 0: goto L_0x061f;
            case 1: goto L_0x05e5;
            case 2: goto L_0x059c;
            case 3: goto L_0x0548;
            case 4: goto L_0x04e9;
            case 5: goto L_0x049b;
            case 6: goto L_0x03fa;
            case 7: goto L_0x03ae;
            case com.startapp.b4.f :int: goto L_0x0311;
            case 9: goto L_0x025c;
            case 10: goto L_0x01df;
            case 11: goto L_0x01ca;
            case 12: goto L_0x01b5;
            case 13: goto L_0x019e;
            case 14: goto L_0x0192;
            case 15: goto L_0x017b;
            case 16: goto L_0x0166;
            default: goto L_0x015c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x015c, code lost:
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0165, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0166, code lost:
        x.f.n("toUpperCase", 0, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017b, code lost:
        x.f.n("toUpperCase", 0, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0192, code lost:
        r3 = r18;
        x.f.n(r16, 0, r21);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k8.o s(java.lang.String r19, n2.g r20, java.util.List<k8.o> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "indexOf"
            java.lang.String r7 = "replace"
            java.lang.String r8 = "substring"
            java.lang.String r9 = "split"
            java.lang.String r10 = "slice"
            java.lang.String r11 = "match"
            java.lang.String r12 = "lastIndexOf"
            java.lang.String r13 = "toLocaleUpperCase"
            java.lang.String r14 = "search"
            java.lang.String r15 = "toLowerCase"
            java.lang.String r2 = "toLocaleLowerCase"
            java.lang.String r0 = "toString"
            java.lang.String r3 = "hasOwnProperty"
            r16 = r4
            java.lang.String r4 = "toUpperCase"
            if (r5 != 0) goto L_0x00a5
            java.lang.String r5 = "concat"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00a5
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00a5
            java.lang.String r5 = "trim"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0093
            goto L_0x00a5
        L_0x0093:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            int r5 = r19.hashCode()
            switch(r5) {
                case -1789698943: goto L_0x0147;
                case -1776922004: goto L_0x013c;
                case -1464939364: goto L_0x0131;
                case -1361633751: goto L_0x0127;
                case -1354795244: goto L_0x011b;
                case -1137582698: goto L_0x0112;
                case -906336856: goto L_0x010a;
                case -726908483: goto L_0x0101;
                case -467511597: goto L_0x00f9;
                case -399551817: goto L_0x00f0;
                case 3568674: goto L_0x00e5;
                case 103668165: goto L_0x00dd;
                case 109526418: goto L_0x00d4;
                case 109648666: goto L_0x00cb;
                case 530542161: goto L_0x00c2;
                case 1094496948: goto L_0x00b9;
                case 1943291465: goto L_0x00b0;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r5 = r16
            goto L_0x0153
        L_0x00b0:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00ac
            r1 = 3
            goto L_0x0124
        L_0x00b9:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00ac
            r1 = 6
            goto L_0x0124
        L_0x00c2:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00ac
            r1 = 10
            goto L_0x0124
        L_0x00cb:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00ac
            r1 = 9
            goto L_0x0124
        L_0x00d4:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00ac
            r1 = 8
            goto L_0x0124
        L_0x00dd:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00ac
            r1 = 5
            goto L_0x0124
        L_0x00e5:
            java.lang.String r5 = "trim"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00ac
            r1 = 16
            goto L_0x0124
        L_0x00f0:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00ac
            r1 = 15
            goto L_0x0124
        L_0x00f9:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00ac
            r1 = 4
            goto L_0x0124
        L_0x0101:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00ac
            r1 = 11
            goto L_0x0124
        L_0x010a:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00ac
            r1 = 7
            goto L_0x0124
        L_0x0112:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00ac
            r1 = 13
            goto L_0x0124
        L_0x011b:
            java.lang.String r5 = "concat"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00ac
            r1 = 1
        L_0x0124:
            r5 = r16
            goto L_0x0150
        L_0x0127:
            r5 = r16
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0153
            r1 = 0
            goto L_0x0150
        L_0x0131:
            r5 = r16
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0153
            r1 = 12
            goto L_0x0150
        L_0x013c:
            r5 = r16
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0153
            r1 = 14
            goto L_0x0150
        L_0x0147:
            r5 = r16
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0153
            r1 = 2
        L_0x0150:
            r16 = r0
            goto L_0x0155
        L_0x0153:
            r1 = -1
            goto L_0x0150
        L_0x0155:
            java.lang.String r0 = ""
            java.lang.String r17 = "undefined"
            switch(r1) {
                case 0: goto L_0x061f;
                case 1: goto L_0x05e5;
                case 2: goto L_0x059c;
                case 3: goto L_0x0548;
                case 4: goto L_0x04e9;
                case 5: goto L_0x049b;
                case 6: goto L_0x03fa;
                case 7: goto L_0x03ae;
                case 8: goto L_0x0311;
                case 9: goto L_0x025c;
                case 10: goto L_0x01df;
                case 11: goto L_0x01ca;
                case 12: goto L_0x01b5;
                case 13: goto L_0x019e;
                case 14: goto L_0x0192;
                case 15: goto L_0x017b;
                case 16: goto L_0x0166;
                default: goto L_0x015c;
            }
        L_0x015c:
            r3 = r18
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0166:
            r0 = 0
            r1 = r21
            x.f.n(r4, r0, r1)
            r3 = r18
            java.lang.String r0 = r3.f20445a
            k8.r r1 = new k8.r
            java.lang.String r0 = r0.trim()
            r1.<init>(r0)
            goto L_0x0665
        L_0x017b:
            r3 = r18
            r1 = r21
            r0 = 0
            x.f.n(r4, r0, r1)
            java.lang.String r0 = r3.f20445a
            k8.r r1 = new k8.r
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r2)
            r1.<init>(r0)
            goto L_0x0665
        L_0x0192:
            r3 = r18
            r1 = r21
            r0 = r16
            r2 = 0
            x.f.n(r0, r2, r1)
            goto L_0x061d
        L_0x019e:
            r3 = r18
            r1 = r21
            r0 = 0
            x.f.n(r15, r0, r1)
            java.lang.String r0 = r3.f20445a
            k8.r r1 = new k8.r
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r2)
            r1.<init>(r0)
            goto L_0x0665
        L_0x01b5:
            r3 = r18
            r1 = r21
            r0 = 0
            x.f.n(r2, r0, r1)
            java.lang.String r0 = r3.f20445a
            k8.r r1 = new k8.r
            java.lang.String r0 = r0.toLowerCase()
            r1.<init>(r0)
            goto L_0x0665
        L_0x01ca:
            r3 = r18
            r1 = r21
            r0 = 0
            x.f.n(r13, r0, r1)
            java.lang.String r0 = r3.f20445a
            k8.r r1 = new k8.r
            java.lang.String r0 = r0.toUpperCase()
            r1.<init>(r0)
            goto L_0x0665
        L_0x01df:
            r3 = r18
            r1 = r21
            r0 = 2
            r2 = 0
            x.f.p(r8, r0, r1)
            java.lang.String r0 = r3.f20445a
            int r4 = r21.size()
            if (r4 <= 0) goto L_0x020a
            java.lang.Object r2 = r1.get(r2)
            k8.o r2 = (k8.o) r2
            r4 = r20
            k8.o r2 = r4.y(r2)
            java.lang.Double r2 = r2.a()
            double r5 = r2.doubleValue()
            double r5 = x.f.e(r5)
            int r2 = (int) r5
            goto L_0x020d
        L_0x020a:
            r4 = r20
            r2 = 0
        L_0x020d:
            int r5 = r21.size()
            r6 = 1
            if (r5 <= r6) goto L_0x022c
            java.lang.Object r1 = r1.get(r6)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r4.y(r1)
            java.lang.Double r1 = r1.a()
            double r4 = r1.doubleValue()
            double r4 = x.f.e(r4)
            int r1 = (int) r4
            goto L_0x0230
        L_0x022c:
            int r1 = r0.length()
        L_0x0230:
            r4 = 0
            int r2 = java.lang.Math.max(r2, r4)
            int r5 = r0.length()
            int r2 = java.lang.Math.min(r2, r5)
            int r1 = java.lang.Math.max(r1, r4)
            int r4 = r0.length()
            int r1 = java.lang.Math.min(r1, r4)
            k8.r r4 = new k8.r
            int r5 = java.lang.Math.min(r2, r1)
            int r1 = java.lang.Math.max(r2, r1)
            java.lang.String r0 = r0.substring(r5, r1)
            r4.<init>(r0)
            goto L_0x0545
        L_0x025c:
            r3 = r18
            r4 = r20
            r1 = r21
            r2 = 2
            x.f.p(r9, r2, r1)
            java.lang.String r2 = r3.f20445a
            int r5 = r2.length()
            if (r5 != 0) goto L_0x027f
            k8.e r1 = new k8.e
            r0 = 1
            k8.o[] r0 = new k8.o[r0]
            r2 = 0
            r0[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r0)
            goto L_0x0665
        L_0x027f:
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r21.size()
            if (r7 != 0) goto L_0x0290
            r6.add(r3)
            goto L_0x030a
        L_0x0290:
            java.lang.Object r5 = r1.get(r5)
            k8.o r5 = (k8.o) r5
            k8.o r5 = r4.y(r5)
            java.lang.String r5 = r5.q()
            int r7 = r21.size()
            r8 = 1
            if (r7 <= r8) goto L_0x02bc
            java.lang.Object r1 = r1.get(r8)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r4.y(r1)
            java.lang.Double r1 = r1.a()
            double r7 = r1.doubleValue()
            long r7 = x.f.j(r7)
            goto L_0x02bf
        L_0x02bc:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x02bf:
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x02cc
            k8.e r1 = new k8.e
            r1.<init>()
            goto L_0x0665
        L_0x02cc:
            java.lang.String r1 = java.util.regex.Pattern.quote(r5)
            int r4 = (int) r7
            int r4 = r4 + 1
            java.lang.String[] r1 = r2.split(r1, r4)
            int r2 = r1.length
            boolean r4 = r5.equals(r0)
            if (r4 == 0) goto L_0x02f2
            if (r2 <= 0) goto L_0x02f2
            r4 = 0
            r4 = r1[r4]
            boolean r4 = r4.equals(r0)
            int r5 = r2 + -1
            r9 = r1[r5]
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x02f4
            goto L_0x02f3
        L_0x02f2:
            r4 = 0
        L_0x02f3:
            r5 = r2
        L_0x02f4:
            long r9 = (long) r2
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x02fb
            int r5 = r5 + -1
        L_0x02fb:
            if (r4 >= r5) goto L_0x030a
            k8.r r0 = new k8.r
            r2 = r1[r4]
            r0.<init>(r2)
            r6.add(r0)
            int r4 = r4 + 1
            goto L_0x02fb
        L_0x030a:
            k8.e r1 = new k8.e
            r1.<init>(r6)
            goto L_0x0665
        L_0x0311:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 2
            x.f.p(r10, r0, r1)
            java.lang.String r0 = r3.f20445a
            int r2 = r21.size()
            if (r2 <= 0) goto L_0x0337
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            k8.o r2 = (k8.o) r2
            k8.o r2 = r4.y(r2)
            java.lang.Double r2 = r2.a()
            double r5 = r2.doubleValue()
            goto L_0x0339
        L_0x0337:
            r5 = 0
        L_0x0339:
            double r5 = x.f.e(r5)
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0351
            int r2 = r0.length()
            double r9 = (double) r2
            java.lang.Double.isNaN(r9)
            double r9 = r9 + r5
            double r5 = java.lang.Math.max(r9, r7)
            goto L_0x035a
        L_0x0351:
            int r2 = r0.length()
            double r7 = (double) r2
            double r5 = java.lang.Math.min(r5, r7)
        L_0x035a:
            int r2 = (int) r5
            int r5 = r21.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0375
            java.lang.Object r1 = r1.get(r6)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r4.y(r1)
            java.lang.Double r1 = r1.a()
            double r4 = r1.doubleValue()
            goto L_0x037a
        L_0x0375:
            int r1 = r0.length()
            double r4 = (double) r1
        L_0x037a:
            double r4 = x.f.e(r4)
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0392
            int r1 = r0.length()
            double r8 = (double) r1
            java.lang.Double.isNaN(r8)
            double r8 = r8 + r4
            double r4 = java.lang.Math.max(r8, r6)
            goto L_0x039b
        L_0x0392:
            int r1 = r0.length()
            double r6 = (double) r1
            double r4 = java.lang.Math.min(r4, r6)
        L_0x039b:
            int r1 = (int) r4
            int r1 = r1 - r2
            r4 = 0
            int r1 = java.lang.Math.max(r4, r1)
            k8.r r4 = new k8.r
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r2, r1)
            r4.<init>(r0)
            goto L_0x0545
        L_0x03ae:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 1
            r2 = 0
            x.f.p(r14, r0, r1)
            int r0 = r21.size()
            if (r0 <= 0) goto L_0x03cd
            java.lang.Object r0 = r1.get(r2)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r4.y(r0)
            java.lang.String r17 = r0.q()
        L_0x03cd:
            java.lang.String r0 = r3.f20445a
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r17)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x03ed
            k8.h r1 = new k8.h
            int r0 = r0.start()
            double r4 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r1.<init>(r0)
            goto L_0x0665
        L_0x03ed:
            k8.h r1 = new k8.h
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r1.<init>(r0)
            goto L_0x0665
        L_0x03fa:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 2
            x.f.p(r7, r0, r1)
            k8.o r0 = k8.o.f20381n
            int r2 = r21.size()
            if (r2 <= 0) goto L_0x042c
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            k8.o r2 = (k8.o) r2
            k8.o r2 = r4.y(r2)
            java.lang.String r17 = r2.q()
            int r2 = r21.size()
            r5 = 1
            if (r2 <= r5) goto L_0x042c
            java.lang.Object r0 = r1.get(r5)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r4.y(r0)
        L_0x042c:
            r1 = r17
            java.lang.String r2 = r3.f20445a
            int r5 = r2.indexOf(r1)
            if (r5 < 0) goto L_0x061d
            boolean r6 = r0 instanceof k8.i
            if (r6 == 0) goto L_0x045f
            k8.i r0 = (k8.i) r0
            r6 = 3
            k8.o[] r6 = new k8.o[r6]
            k8.r r7 = new k8.r
            r7.<init>(r1)
            r8 = 0
            r6[r8] = r7
            k8.h r7 = new k8.h
            double r8 = (double) r5
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.<init>(r8)
            r8 = 1
            r6[r8] = r7
            r7 = 2
            r6[r7] = r3
            java.util.List r6 = java.util.Arrays.asList(r6)
            k8.o r0 = r0.b(r4, r6)
        L_0x045f:
            k8.r r4 = new k8.r
            r6 = 0
            java.lang.String r6 = r2.substring(r6, r5)
            java.lang.String r0 = r0.q()
            int r1 = r1.length()
            int r1 = r1 + r5
            java.lang.String r1 = r2.substring(r1)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r2 = r2.length()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.String r7 = java.lang.String.valueOf(r1)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r2 = r2 + r5
            int r2 = r2 + r7
            r8.<init>(r2)
            java.lang.String r0 = androidx.fragment.app.a.a(r8, r6, r0, r1)
            r4.<init>(r0)
            goto L_0x0545
        L_0x049b:
            r3 = r18
            r4 = r20
            r1 = r21
            r2 = 1
            x.f.p(r11, r2, r1)
            java.lang.String r2 = r3.f20445a
            int r5 = r21.size()
            if (r5 > 0) goto L_0x04ae
            goto L_0x04bd
        L_0x04ae:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r4.y(r0)
            java.lang.String r0 = r0.q()
        L_0x04bd:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x04e5
            k8.e r1 = new k8.e
            r2 = 1
            k8.o[] r2 = new k8.o[r2]
            k8.r r4 = new k8.r
            java.lang.String r0 = r0.group()
            r4.<init>(r0)
            r0 = 0
            r2[r0] = r4
            java.util.List r0 = java.util.Arrays.asList(r2)
            r1.<init>(r0)
            goto L_0x0665
        L_0x04e5:
            k8.o r1 = k8.o.f20382o
            goto L_0x0665
        L_0x04e9:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 0
            r2 = 2
            x.f.p(r12, r2, r1)
            java.lang.String r5 = r3.f20445a
            int r6 = r21.size()
            if (r6 > 0) goto L_0x04fd
            goto L_0x050b
        L_0x04fd:
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r4.y(r0)
            java.lang.String r17 = r0.q()
        L_0x050b:
            r0 = r17
            int r6 = r21.size()
            if (r6 >= r2) goto L_0x0516
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0529
        L_0x0516:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r4.y(r1)
            java.lang.Double r1 = r1.a()
            double r1 = r1.doubleValue()
        L_0x0529:
            boolean r4 = java.lang.Double.isNaN(r1)
            if (r4 == 0) goto L_0x0532
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x0536
        L_0x0532:
            double r1 = x.f.e(r1)
        L_0x0536:
            k8.h r4 = new k8.h
            int r1 = (int) r1
            int r0 = r5.lastIndexOf(r0, r1)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.<init>(r0)
        L_0x0545:
            r1 = r4
            goto L_0x0665
        L_0x0548:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 2
            r7 = 0
            x.f.p(r6, r0, r1)
            java.lang.String r2 = r3.f20445a
            int r5 = r21.size()
            if (r5 > 0) goto L_0x055d
            goto L_0x056c
        L_0x055d:
            r5 = 0
            java.lang.Object r5 = r1.get(r5)
            k8.o r5 = (k8.o) r5
            k8.o r5 = r4.y(r5)
            java.lang.String r17 = r5.q()
        L_0x056c:
            r5 = r17
            int r6 = r21.size()
            if (r6 >= r0) goto L_0x0575
            goto L_0x0588
        L_0x0575:
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r4.y(r0)
            java.lang.Double r0 = r0.a()
            double r7 = r0.doubleValue()
        L_0x0588:
            double r0 = x.f.e(r7)
            k8.h r4 = new k8.h
            int r0 = (int) r0
            int r0 = r2.indexOf(r5, r0)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.<init>(r0)
            goto L_0x0545
        L_0x059c:
            r4 = r20
            r1 = r21
            r0 = r3
            r3 = r18
            r2 = 1
            x.f.n(r0, r2, r1)
            java.lang.String r0 = r3.f20445a
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            k8.o r1 = (k8.o) r1
            k8.o r1 = r4.y(r1)
            java.lang.String r2 = r1.q()
            java.lang.String r4 = "length"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x05c4
            k8.o r1 = k8.o.U
            goto L_0x0665
        L_0x05c4:
            java.lang.Double r1 = r1.a()
            double r1 = r1.doubleValue()
            double r4 = java.lang.Math.floor(r1)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x05e1
            int r1 = (int) r1
            if (r1 < 0) goto L_0x05e1
            int r0 = r0.length()
            if (r1 >= r0) goto L_0x05e1
            k8.o r1 = k8.o.U
            goto L_0x0665
        L_0x05e1:
            k8.o r1 = k8.o.V
            goto L_0x0665
        L_0x05e5:
            r3 = r18
            r4 = r20
            r1 = r21
            int r0 = r21.size()
            if (r0 == 0) goto L_0x061d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r3.f20445a
            r0.<init>(r2)
            r2 = 0
        L_0x05f9:
            int r5 = r21.size()
            if (r2 >= r5) goto L_0x0613
            java.lang.Object r5 = r1.get(r2)
            k8.o r5 = (k8.o) r5
            k8.o r5 = r4.y(r5)
            java.lang.String r5 = r5.q()
            r0.append(r5)
            int r2 = r2 + 1
            goto L_0x05f9
        L_0x0613:
            k8.r r1 = new k8.r
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            goto L_0x0665
        L_0x061d:
            r1 = r3
            goto L_0x0665
        L_0x061f:
            r3 = r18
            r4 = r20
            r1 = r21
            r0 = 1
            x.f.p(r5, r0, r1)
            int r0 = r21.size()
            if (r0 <= 0) goto L_0x0648
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k8.o r0 = (k8.o) r0
            k8.o r0 = r4.y(r0)
            java.lang.Double r0 = r0.a()
            double r0 = r0.doubleValue()
            double r0 = x.f.e(r0)
            int r0 = (int) r0
            goto L_0x0649
        L_0x0648:
            r0 = 0
        L_0x0649:
            java.lang.String r1 = r3.f20445a
            if (r0 < 0) goto L_0x0663
            int r2 = r1.length()
            if (r0 < r2) goto L_0x0654
            goto L_0x0663
        L_0x0654:
            k8.r r2 = new k8.r
            char r0 = r1.charAt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r0)
            r1 = r2
            goto L_0x0665
        L_0x0663:
            k8.o r1 = k8.o.W
        L_0x0665:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.r.s(java.lang.String, n2.g, java.util.List):k8.o");
    }

    public final String toString() {
        String str = this.f20445a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return sb2.toString();
    }
}
