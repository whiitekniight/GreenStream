package p068;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ʽﹳ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1994 extends Enum implements Executor {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC1994 f6917 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC1994[] f6918 = null;

    static {
        EnumC1994 r0 = new EnumC1994("INSTANCE", 0);
        f6917 = r0;
        f6918 = new EnumC1994[]{r0};
    }

    public static EnumC1994 valueOf(String r1) {
        return (EnumC1994) Enum.valueOf(EnumC1994.class, r1);
    }

    public static EnumC1994[] values() {
        return (EnumC1994[]) f6918.clone();
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
