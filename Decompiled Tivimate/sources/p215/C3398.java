package p215;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p317.C4215;
import ʽⁱ.ᵎﹶ;

/* JADX INFO: renamed from: ˎـ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C3398 extends ᵎﹶ {

    /* JADX INFO: renamed from: ʽʽ */
    public long[] f11952;

    /* JADX INFO: renamed from: ˈٴ */
    public long[] f11953;

    /* JADX INFO: renamed from: ᴵˊ */
    public long f11954;

    /* JADX INFO: renamed from: ʽˑ */
    public static HashMap m7153(C4215 r5) {
        int r0 = r5.m8589();
        HashMap r1 = new HashMap(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        String r3 = m7154(r5);
        Serializable r4 = m7155(r5.m8585(), r5);
        if (r4 == null) goto L7;
        r1.put(r3, r4);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r1;
    }

    /* JADX INFO: renamed from: ˋˊ */
    public static String m7154(C4215 r3) {
        int r0 = r3.m8606();
        int r1 = r3.f15475;
        r3.m8611(r0);
        return new String(r3.f15476, r1, r0);
    }

    /* JADX INFO: renamed from: ﹶˎ */
    public static Serializable m7155(int r4, C4215 r5) {
        if (r4 == 0) goto L43;
        boolean r0 = false;
        int r02 = 0;
        if (r4 == 1) goto L38;
        if (r4 == 2) goto L36;
        if (r4 != 3) goto L10;
        HashMap r42 = new HashMap();
    L29:
        String r03 = m7154(r5);
        int r1 = r5.m8585();
        if (r1 == 9) goto L31;
        Serializable r12 = m7155(r1, r5);
        if (r12 == null) goto L29;
        r42.put(r03, r12);
        goto L29
    L31:
        return r42;
    L10:
        if (r4 == 8) goto L27;
        if (r4 != 10) goto L14;
        int r43 = r5.m8589();
        ArrayList r13 = new ArrayList(r43);
    L20:
        if (r02 >= r43) goto L25;
        Serializable r2 = m7155(r5.m8585(), r5);
        if (r2 == null) goto L24;
        r13.add(r2);
    L24:
        r02 = r02 + 1;
        goto L20
    L25:
        return r13;
    L14:
        if (r4 == 11) goto L17;
        return null;
    L17:
        Date r44 = new Date((long) Double.longBitsToDouble(r5.m8600()));
        r5.m8611(2);
        return r44;
    L27:
        return m7153(r5);
    L36:
        return m7154(r5);
    L38:
        if (r5.m8585() != 1) goto L41;
        r0 = true;
    L41:
        return Boolean.valueOf(r0);
    L43:
        return Double.valueOf(Double.longBitsToDouble(r5.m8600()));
    }
}
