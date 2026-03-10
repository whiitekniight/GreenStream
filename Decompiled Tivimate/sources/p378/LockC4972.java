package p378;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: ᵔﹶ.ᵢˏ */
/* JADX INFO: loaded from: classes.dex */
public final class LockC4972 implements Lock {
    @Override // java.util.concurrent.locks.Lock
    public final void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lockInterruptibly() {
    }

    @Override // java.util.concurrent.locks.Lock
    public final Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        return true;
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock(long r1, TimeUnit r3) {
        return true;
    }

    @Override // java.util.concurrent.locks.Lock
    public final void unlock() {
    }
}
