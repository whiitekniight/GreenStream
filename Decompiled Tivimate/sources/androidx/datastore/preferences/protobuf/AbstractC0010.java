package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0010 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final boolean f382 = false;

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Class f383 = null;

    static {
        Class<?> r1 = null;
        Class<?> r0 = Class.forName("libcore.io.Memory");     // Catch: Throwable -> L5
    L6:
        f383 = r0;
        r1 = Class.forName("org.robolectric.Robolectric");     // Catch: Throwable -> L13
    L8:
        if (r1 == null) goto L10;
        boolean r02 = true;
    L11:
        f382 = r02;
        return;
    L10:
        r02 = false;
    L5:
        r0 = null;
        goto L6
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static boolean m215() {
        if (f383 != null) goto L5;
        return false;
    L5:
        if (f382 == true) goto L10;
        return true;
    L10:
        return false;
    }
}
