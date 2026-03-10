package p096;

import java.util.regex.Pattern;
import p317.C4215;

/* JADX INFO: renamed from: ʿˎ.ⁱˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C2211 {

    /* JADX INFO: renamed from: ʽ */
    public static final Pattern f8018 = null;

    /* JADX INFO: renamed from: ˈ */
    public static final Pattern f8019 = null;

    /* JADX INFO: renamed from: ⁱˊ */
    public final StringBuilder f8020;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C4215 f8021;

    static {
        f8018 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
        f8019 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    }

    public C2211() {
        this.f8021 = new C4215();
        this.f8020 = new StringBuilder();
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m5384(C4215 r8) {
    L3:
        boolean r1 = true;
    L5:
        if (r8.m8615() <= 0) goto L34;
        if (r1 == false) goto L56;
        int r12 = r8.f15475;
        byte[] r2 = r8.f15476;
        byte r3 = r2[r12];
        char r4 = (char) r3;
        if (r4 == '\t') goto L33;
        if (r4 == '\n') goto L33;
        if (r4 == '\f') goto L33;
        if (r4 == '\r') goto L33;
        if (r4 == ' ') goto L33;
        int r42 = r8.f15474;
        int r5 = r12 + 2;
        if (r5 > r42) goto L32;
        int r13 = r12 + 1;
        if (r3 != 47) goto L32;
        if (r2[r13] != 42) goto L32;
    L23:
        int r14 = r5 + 1;
        if (r14 >= r42) goto L31;
        if (((char) r2[r5]) != '*') goto L30;
        if (((char) r2[r14]) != '/') goto L30;
        r5 = r5 + 2;
        r42 = r5;
    L30:
        r5 = r14;
        goto L23
    L31:
        r8.m8611(r42 - r8.f15475);
    L32:
        r1 = false;
    L33:
        r8.m8611(1);
        goto L3
    L56:
        return;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static String m5385(C4215 r1, StringBuilder r2) {
        m5384(r1);
        if (r1.m8615() != 0) goto L6;
        return null;
    L6:
        String r22 = m5386(r1, r2);
        if (r22.isEmpty() == true) goto L10;
        return r22;
    L10:
        return "" + ((char) r1.m8585());
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static String m5386(C4215 r5, StringBuilder r6) {
        boolean r0 = false;
        r6.setLength(0);
        int r1 = r5.f15475;
        int r2 = r5.f15474;
    L3:
        if (r1 >= r2) goto L28;
        if (r0 == true) goto L28;
        char r3 = (char) r5.f15476[r1];
        if (r3 < 'A') goto L10;
        if (r3 > 'Z') goto L10;
    L27:
        r1 = r1 + 1;
        r6.append(r3);
    L10:
        if (r3 < 'a') goto L14;
        if (r3 <= 'z') goto L27;
    L14:
        if (r3 < '0') goto L18;
        if (r3 <= '9') goto L27;
    L18:
        if (r3 == '#') goto L27;
        if (r3 == '-') goto L27;
        if (r3 == '.') goto L27;
        if (r3 == '_') goto L27;
        r0 = true;
    L28:
        r5.m8611(r1 - r5.f15475);
        return r6.toString();
    }
}
