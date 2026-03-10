package p176;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p319.AbstractC4223;

/* JADX INFO: renamed from: ˊᐧ.ˈٴ */
/* JADX INFO: loaded from: classes.dex */
public class C3063 {

    /* JADX INFO: renamed from: ˈ */
    public static final C3057 f10739 = null;

    /* JADX INFO: renamed from: ʽ */
    public long f10740;

    /* JADX INFO: renamed from: ⁱˊ */
    public long f10741;

    /* JADX INFO: renamed from: ﹳٴ */
    public boolean f10742;

    static {
        f10739 = new C3057();
    }

    /* JADX INFO: renamed from: ʽ */
    public long mo6491() {
        if (this.f10742 == false) goto L7;
        return this.f10741;
    L7:
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: ˈ */
    public C3063 mo6475(long r2) {
        this.f10742 = true;
        this.f10741 = r2;
        return this;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public boolean mo6492() {
        return this.f10742;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public C3063 mo6476(long r4) {
        TimeUnit r0 = TimeUnit.MILLISECONDS;
        if (r4 < 0) goto L7;
        this.f10740 = r0.toNanos(r4);
        return this;
    L7:
        throw new IllegalArgumentException(AbstractC4223.m8637("timeout < 0: ", r4).toString());
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public C3063 mo6493() {
        this.f10740 = 0;
        return this;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public C3063 mo6494() {
        this.f10742 = false;
        return this;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public void mo6477() {
        if (Thread.currentThread().isInterrupted() == true) goto L13;
        if (this.f10742 == true) goto L7;
        return;
    L7:
        if ((this.f10741 - System.nanoTime()) <= 0) goto L10;
        return;
    L10:
        throw new InterruptedIOException("deadline reached");
    L13:
        throw new InterruptedIOException("interrupted");
    }
}
