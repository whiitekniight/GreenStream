package p329;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import p296.EnumC4054;

/* JADX INFO: renamed from: ᴵʿ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4397 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final char[] f16118 = null;

    static {
        f16118 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    /* JADX INFO: renamed from: ʽ */
    public static String m8801(byte[] r6) {
        int r0 = r6.length;
        StringBuilder r1 = new StringBuilder();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        byte r3 = r6[r2];
        if (r1.length() <= 0) goto L7;
        r1.append(' ');
    L7:
        char[] r5 = f16118;
        r1.append(r5[(r3 >> 4) & 15]);
        r1.append(r5[r3 & 15]);
        r2 = r2 + 1;
        goto L3
    L9:
        return r1.toString();
    }

    /* JADX INFO: renamed from: ˈ */
    public static EnumSet m8802(long r5, Class r7) {
        if (InterfaceC4393.class.isAssignableFrom(r7) == false) goto L12;
        EnumSet r0 = EnumSet.noneOf(r7);
        Object[] r72 = (Enum[]) r7.getEnumConstants();
        int r1 = r72.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L10;
        Object r3 = r72[r2];
        if (m8804(r5, (InterfaceC4393) r3) == false) goto L9;
        r0.add(r3);
    L9:
        r2 = r2 + 1;
        goto L5
    L10:
        return r0;
    L12:
        throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static long m8803(Collection r4) {
        Iterator r42 = r4.iterator();
        long r0 = 0;
    L4:
        if (r42.hasNext() == false) goto L10;
        Object r2 = (Enum) r42.next();
        if ((r2 instanceof InterfaceC4393) == false) goto L9;
        r0 = r0 | ((InterfaceC4393) r2).getValue();
        goto L4
    L9:
        throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
    L10:
        return r0;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static boolean m8804(long r2, InterfaceC4393 r4) {
        if ((r2 & r4.getValue()) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m8805(Object r0, Object r1) {
        if (r0 == r1) goto L9;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public static InterfaceC4393 m8806(long r5, Class r7, EnumC4054 r8) {
        InterfaceC4393[] r72 = (InterfaceC4393[]) r7.getEnumConstants();
        int r0 = r72.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        InterfaceC4393 r2 = r72[r1];
        if (r2.getValue() == r5) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L8:
        return r8;
    }
}
