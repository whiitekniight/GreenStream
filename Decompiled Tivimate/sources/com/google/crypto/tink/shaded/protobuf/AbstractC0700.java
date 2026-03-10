package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0700 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final boolean f2987 = false;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Class f2988 = null;

    static {
        Class<?> r1 = null;
        Class<?> r0 = Class.forName("libcore.io.Memory");     // Catch: Throwable -> L5
    L6:
        f2988 = r0;
        r1 = Class.forName("org.robolectric.Robolectric");     // Catch: Throwable -> L13
    L8:
        if (r1 == null) goto L10;
        boolean r02 = true;
    L11:
        f2987 = r02;
        return;
    L10:
        r02 = false;
    L5:
        r0 = null;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m2536() {
        if (f2988 != null) goto L5;
        return false;
    L5:
        if (f2987 == true) goto L10;
        return true;
    L10:
        return false;
    }
}
