package p005j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Objects {
    public static boolean equals(Object r0, Object r1) {
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

    public static int hash(Object... r0) {
        return Arrays.hashCode(r0);
    }

    public static int hashCode(Object r0) {
        if (r0 != null) goto L4;
        return 0;
    L4:
        return r0.hashCode();
    }

    public static <T> T requireNonNull(T r0) {
        r0.getClass();
        return r0;
    }

    public static <T> T requireNonNull(T r0, String r1) {
        if (r0 == null) goto L5;
        return r0;
    L5:
        throw new NullPointerException(r1);
    }

    public static String toString(Object r0) {
        return String.valueOf(r0);
    }

    public static String toString(Object r0, String r1) {
        if (r0 != null) goto L4;
        return r1;
    L4:
        return r0.toString();
    }
}
