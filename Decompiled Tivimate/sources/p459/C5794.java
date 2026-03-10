package p459;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: renamed from: ﹶﾞ.ᐧˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C5794 {

    /* JADX INFO: renamed from: ʽ */
    public static final C5794 f20959 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f20960;

    /* JADX INFO: renamed from: ﹳٴ */
    public final EnumMap f20961;

    static {
        f20959 = new C5794(100);
    }

    public C5794(int r4) {
        EnumMap r0 = new EnumMap(EnumC5824.class);
        this.f20961 = r0;
        EnumC5824 r1 = EnumC5824.f21266;
        EnumC5715 r2 = EnumC5715.f20615;
        r0.put(r1, r2);
        r0.put(EnumC5824.f21263, r2);
        this.f20960 = r4;
    }

    public C5794(EnumMap r3, int r4) {
        EnumMap r0 = new EnumMap(EnumC5824.class);
        this.f20961 = r0;
        r0.putAll(r3);
        this.f20960 = r4;
    }

    /* JADX INFO: renamed from: ʽ */
    public static C5794 m11245(int r7, String r8) {
        EnumMap r0 = new EnumMap(EnumC5824.class);
        EnumC5824[] r1 = EnumC5721.f20631.f20632;
        int r2 = 0;
    L4:
        if (r2 >= r1.length) goto L14;
        if (r8 != null) goto L7;
        String r3 = "";
    L8:
        EnumC5824 r4 = r1[r2];
        int r5 = r2 + 2;
        if (r5 >= r3.length()) goto L11;
        r0.put(r4, m11247(r3.charAt(r5)));
    L12:
        r2 = r2 + 1;
        goto L4
    L11:
        r0.put(r4, EnumC5715.f20615);
        goto L12
    L7:
        r3 = r8;
        goto L8
    L14:
        return new C5794(r0, r7);
    }

    /* JADX INFO: renamed from: ˈ */
    public static EnumC5715 m11246(String r2) {
        EnumC5715 r0 = EnumC5715.f20615;
        if (r2 != null) goto L6;
        return r0;
    L6:
        if (r2.equals("granted") == false) goto L10;
        return EnumC5715.f20616;
    L10:
        if (r2.equals("denied") == true) goto L12;
        return r0;
    L12:
        return EnumC5715.f20613;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static EnumC5715 m11247(char r1) {
        if (r1 == '+') goto L15;
        if (r1 == '0') goto L13;
        if (r1 == '1') goto L11;
        return EnumC5715.f20615;
    L11:
        return EnumC5715.f20616;
    L13:
        return EnumC5715.f20613;
    L15:
        return EnumC5715.f20612;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static char m11248(EnumC5715 r1) {
        if (r1 == null) goto L16;
        int r12 = r1.ordinal();
        if (r12 != 1) goto L6;
        return '+';
    L6:
        if (r12 != 2) goto L8;
        return '0';
    L8:
        if (r12 != 3) goto L18;
        return '1';
    L18:
        return '-';
    L16:
        return '-';
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static C5794 m11249(int r6, Bundle r7) {
        if (r7 == null) goto L4;
        EnumMap r0 = new EnumMap(EnumC5824.class);
        EnumC5824[] r1 = EnumC5721.f20631.f20632;
        int r2 = r1.length;
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L9;
        EnumC5824 r4 = r1[r3];
        r0.put(r4, m11246(r7.getString(r4.f21268)));
        r3 = r3 + 1;
        goto L6
    L9:
        return new C5794(r0, r6);
    L4:
        return new C5794(r6);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m11250(int r1) {
        if (r1 != (-30)) goto L5;
        return "TCF";
    L5:
        if (r1 != (-20)) goto L7;
        return "API";
    L7:
        if (r1 == (-10)) goto L25;
        if (r1 != 0) goto L10;
        return "1P_API";
    L10:
        if (r1 != 30) goto L12;
        return "1P_INIT";
    L12:
        if (r1 != 90) goto L14;
        return "REMOTE_CONFIG";
    L14:
        if (r1 == 100) goto L17;
        return "OTHER";
    L17:
        return "UNKNOWN";
    L25:
        return "MANIFEST";
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public static boolean m11251(int r2, int r3) {
        int r0 = -30;
        if (r2 != (-20)) goto L6;
        if (r3 == (-30)) goto L15;
        r2 = -20;
        goto L6
    L15:
        return true;
    L6:
        if (r2 != (-30)) goto L9;
        if (r3 == (-20)) goto L17;
    L10:
        if (r0 == r3) goto L19;
        if (r2 < r3) goto L18;
        return false;
    L18:
        return true;
    L19:
        return true;
    L17:
        return true;
    L9:
        r0 = r2;
        goto L10
    }

    public final boolean equals(Object r8) {
        if ((r8 instanceof C5794) == true) goto L5;
        return false;
    L5:
        C5794 r82 = (C5794) r8;
        EnumC5824[] r0 = EnumC5721.f20631.f20632;
        int r2 = r0.length;
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L12;
        EnumC5824 r4 = r0[r3];
        if (this.f20961.get(r4) != r82.f20961.get(r4)) goto L9;
        r3 = r3 + 1;
        goto L6
    L9:
        return false;
    L12:
        if (this.f20960 != r82.f20960) goto L15;
        return true;
    L15:
        return false;
    }

    public final int hashCode() {
        Iterator r0 = this.f20961.values().iterator();
        int r1 = this.f20960 * 17;
    L4:
        if (r0.hasNext() == false) goto L6;
        r1 = (r1 * 31) + ((EnumC5715) r0.next()).hashCode();
        goto L4
    L6:
        return r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("source=");
        r0.append(m11250(this.f20960));
        EnumC5824[] r1 = EnumC5721.f20631.f20632;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L9;
        EnumC5824 r4 = r1[r3];
        r0.append(",");
        r0.append(r4.f21268);
        r0.append("=");
        EnumC5715 r42 = (EnumC5715) this.f20961.get(r4);
        if (r42 != null) goto L7;
        r42 = EnumC5715.f20615;
    L7:
        r0.append(r42);
        r3 = r3 + 1;
        goto L3
    L9:
        return r0.toString();
    }

    /* JADX INFO: renamed from: ʼˎ */
    public final boolean m11252(EnumC5824 r2) {
        if (((EnumC5715) this.f20961.get(r2)) != EnumC5715.f20613) goto L6;
        return false;
    L6:
        return true;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public final C5794 m11253(C5794 r9) {
        EnumMap r0 = new EnumMap(EnumC5824.class);
        EnumC5824[] r1 = EnumC5721.f20631.f20632;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L26;
        EnumC5824 r4 = r1[r3];
        EnumC5715 r5 = (EnumC5715) this.f20961.get(r4);
        EnumC5715 r6 = (EnumC5715) r9.f20961.get(r4);
        if (r5 == null) goto L14;
        if (r6 == null) goto L22;
        EnumC5715 r7 = EnumC5715.f20615;
        if (r5 == r7) goto L14;
        if (r6 == r7) goto L22;
        EnumC5715 r72 = EnumC5715.f20612;
        if (r5 == r72) goto L14;
        if (r6 == r72) goto L22;
        EnumC5715 r73 = EnumC5715.f20613;
        if (r5 == r73) goto L21;
        if (r6 == r73) goto L21;
        r5 = EnumC5715.f20616;
    L21:
        r5 = r73;
    L22:
        if (r5 == null) goto L24;
        r0.put(r4, r5);
    L24:
        r3 = r3 + 1;
    L14:
        r5 = r6;
        goto L22
    L26:
        return new C5794(r0, 100);
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public final C5794 m11254(C5794 r8) {
        EnumMap r0 = new EnumMap(EnumC5824.class);
        EnumC5824[] r1 = EnumC5721.f20631.f20632;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        EnumC5824 r4 = r1[r3];
        EnumC5715 r5 = (EnumC5715) this.f20961.get(r4);
        if (r5 != EnumC5715.f20615) goto L7;
        r5 = (EnumC5715) r8.f20961.get(r4);
    L7:
        if (r5 == null) goto L9;
        r0.put(r4, r5);
    L9:
        r3 = r3 + 1;
        goto L3
    L11:
        return new C5794(r0, this.f20960);
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public final String m11255() {
        StringBuilder r0 = new StringBuilder("G1");
        EnumC5824[] r1 = EnumC5721.f20631.f20632;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L6;
        EnumC5824 r4 = r1[r3];
        r0.append(m11248((EnumC5715) this.f20961.get(r4)));
        r3 = r3 + 1;
        goto L3
    L6:
        return r0.toString();
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final String m11256() {
        StringBuilder r0 = new StringBuilder("G1");
        EnumC5824[] r1 = EnumC5721.f20631.f20632;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L19;
        EnumC5824 r4 = r1[r3];
        EnumC5715 r42 = (EnumC5715) this.f20961.get(r4);
        char r5 = '-';
        if (r42 == null) goto L17;
        int r43 = r42.ordinal();
        if (r43 == 0) goto L17;
        if (r43 != 1) goto L11;
    L16:
        r5 = '1';
        goto L17
    L11:
        if (r43 != 2) goto L13;
        r5 = '0';
        goto L17
    L13:
        if (r43 == 3) goto L16;
    L17:
        r0.append(r5);
        r3 = r3 + 1;
        goto L3
    L19:
        return r0.toString();
    }
}
