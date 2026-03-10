package p164;

/* JADX INFO: renamed from: ˊʼ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2926 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2922 f10342 = null;

    static {
        C2922 r0 = null;
        r0 = (C2922) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();     // Catch: Throwable -> L10
    L5:
        if (r0 != null) goto L8;
        r0 = new C2922();
    L8:
        f10342 = r0;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m6271(C2943 r0) {
        f10342.getClass();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static C2944 m6272(Class r1) {
        f10342.getClass();
        return new C2944(r1);
    }
}
