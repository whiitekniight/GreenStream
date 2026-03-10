package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ʼˈ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0527 extends Enum implements Executor {

    /* JADX INFO: renamed from: ʾˋ */
    public static final EnumC0527 f2308 = null;

    /* JADX INFO: renamed from: ᴵˊ */
    public static final /* synthetic */ EnumC0527[] f2309 = null;

    static {
        EnumC0527 r0 = new EnumC0527("INSTANCE", 0);
        f2308 = r0;
        f2309 = new EnumC0527[]{r0};
    }

    public static EnumC0527[] values() {
        return (EnumC0527[]) f2309.clone();
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
