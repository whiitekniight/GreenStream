package p357;

/* JADX INFO: renamed from: ᵎـ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4754 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final Integer f16787 = null;

    static {
        Integer r0 = null;
        Object r1 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);     // Catch: Throwable -> L14
        if ((r1 instanceof Integer) == false) goto L7;
        Integer r12 = (Integer) r1;     // Catch: Throwable -> L14
    L8:
        if (r12 != null) goto L10;
    L12:
        f16787 = r0;
        return;
    L10:
        if (r12.intValue() <= 0) goto L12;
        r0 = r12;
    L7:
        r12 = null;
        goto L8
    }
}
