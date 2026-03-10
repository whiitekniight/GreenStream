package p164;

/* JADX INFO: renamed from: ˊʼ.ʻٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2922 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static String m6266(InterfaceC2938 r1) {
        String r12 = r1.getClass().getGenericInterfaces()[0].toString();
        if (r12.startsWith("kotlin.jvm.functions.") == true) goto L5;
        return r12;
    L5:
        return r12.substring(21);
    }
}
