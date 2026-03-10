package p334;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ᴵˋ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4454 extends Enum implements Executor {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC4454 f16249 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC4454[] f16250 = null;

    static {
        EnumC4454 r0 = new EnumC4454("INSTANCE", 0);
        f16249 = r0;
        f16250 = new EnumC4454[]{r0};
    }

    public static EnumC4454 valueOf(String r1) {
        return (EnumC4454) Enum.valueOf(EnumC4454.class, r1);
    }

    public static EnumC4454[] values() {
        return (EnumC4454[]) f16250.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r1) {
        r1.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
