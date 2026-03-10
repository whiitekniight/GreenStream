package p437;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ﹶ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC5512 implements Executor {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ Handler f19758;

    public /* synthetic */ ExecutorC5512(Handler r1) {
        this.f19758 = r1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        this.f19758.post(r2);
    }
}
