package p133;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ˈˊ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2500 extends Enum implements Executor {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC2500 f8847 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC2500[] f8848 = null;

    static {
        EnumC2500 r0 = new EnumC2500("INSTANCE", 0);
        f8847 = r0;
        f8848 = new EnumC2500[]{r0};
    }

    public static EnumC2500 valueOf(String r1) {
        return (EnumC2500) Enum.valueOf(EnumC2500.class, r1);
    }

    public static EnumC2500[] values() {
        return (EnumC2500[]) f8848.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r1) {
        r1.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
