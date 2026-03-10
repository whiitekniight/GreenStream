package p191;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: ˋˋ.ᴵˑ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3210 {

    /* JADX INFO: renamed from: ʽ */
    public int f11359;

    /* JADX INFO: renamed from: ⁱˊ */
    public boolean f11360;

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3179 f11361;

    public AbstractC3210() {
        this.f11361 = new C3179();
        this.f11360 = false;
        this.f11359 = 1;
    }

    /* JADX INFO: renamed from: ʼˎ */
    public void mo6827(AbstractC3156 r1) {
    }

    /* JADX INFO: renamed from: ʽ */
    public int mo607(int r1) {
        return 0;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public void m6828(AbstractC3156 r1) {
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m6829() {
        this.f11361.m6771();
    }

    /* JADX INFO: renamed from: ˉʿ */
    public final void m6830() {
        this.f11359 = 3;
        this.f11361.m6770();
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m6831(int r2, int r3, Object r4) {
        this.f11361.m6768(r2, r3, r4);
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public void m6832(AbstractC3156 r1) {
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public void m6833(AbstractC3156 r1, int r2, List r3) {
        mo612(r1, r2);
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract AbstractC3156 mo610(ViewGroup r1, int r2);

    /* JADX INFO: renamed from: ⁱˊ */
    public long mo2450(int r3) {
        return -1;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract int mo611();

    /* JADX INFO: renamed from: ﾞʻ */
    public final void m6834(boolean r2) {
        if (this.f11361.m6772() == true) goto L7;
        this.f11360 = r2;
        return;
    L7:
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public abstract void mo612(AbstractC3156 r1, int r2);
}
