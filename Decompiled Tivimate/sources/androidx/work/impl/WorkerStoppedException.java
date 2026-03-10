package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerStoppedException extends CancellationException {

    /* JADX INFO: renamed from: ʾˋ */
    public final int f1580;

    public WorkerStoppedException(int r1) {
        this.f1580 = r1;
    }
}
