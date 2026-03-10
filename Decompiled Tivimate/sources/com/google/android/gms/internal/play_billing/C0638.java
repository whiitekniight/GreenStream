package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ﹳـ */
/* JADX INFO: loaded from: classes.dex */
public final class C0638 implements InterfaceFutureC0614 {

    /* JADX INFO: renamed from: ᴵˊ */
    public static final C0559 f2489 = null;

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f2490;

    static {
        f2489 = new C0559(C0638.class);
    }

    public C0638(Object r1) {
        this.f2490 = r1;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r1) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f2490;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r1, TimeUnit r3) {
        r3.getClass();
        return this.f2490;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f2490.toString() + "]]";
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0614
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo2168(Runnable r7, Executor r8) {
        if (r8 == null) goto L9;
        r8.execute(r7);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        f2489.m2192().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + r7.toString() + " with executor " + String.valueOf(r8), e);
        return;
    L9:
        throw new NullPointerException("Executor was null.");
    }
}
