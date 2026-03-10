package p340;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᴵᵔ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4567 implements Cloneable {

    /* JADX INFO: renamed from: ʽʽ */
    public ArrayList f16498;

    /* JADX INFO: renamed from: ʾˋ */
    public ArrayList f16499;

    /* JADX INFO: renamed from: ᴵˊ */
    public ArrayList f16500;

    public AbstractC4567() {
        this.f16499 = null;
        this.f16500 = null;
        this.f16498 = null;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static void m9057(InterfaceC4564 r3) {
        C4548 r0 = C4548.m8986();
        ChoreographerFrameCallbackC4563 r1 = r0.f16411;
        ArrayList r02 = r0.f16410;
        if (r02.size() != 0) goto L6;
        r1.getClass();
        Choreographer.getInstance().postFrameCallback(r1);
    L6:
        if (r02.contains(r3) == true) goto L8;
        r02.add(r3);
    L8:
        r1.getClass();
    }

    public abstract void cancel();

    /* JADX INFO: renamed from: ʼˎ */
    public abstract long mo9002();

    /* JADX INFO: renamed from: ʼᐧ */
    public abstract void mo9003(InterfaceC4547 r1);

    /* JADX INFO: renamed from: ˆʾ */
    public abstract boolean mo9008();

    /* JADX INFO: renamed from: ˈ */
    public final void m9058(InterfaceC4551 r2) {
        if (this.f16499 != null) goto L5;
        this.f16499 = new ArrayList();
    L5:
        this.f16499.add(r2);
    }

    /* JADX INFO: renamed from: ˉʿ */
    public abstract void mo9010();

    /* JADX INFO: renamed from: ˏי */
    public abstract void mo9013(boolean r1);

    /* JADX INFO: renamed from: ˑﹳ */
    public final void m9059(InterfaceC4555 r2) {
        if (this.f16498 != null) goto L5;
        this.f16498 = new ArrayList();
    L5:
        this.f16498.add(r2);
    }

    /* JADX INFO: renamed from: יـ */
    public abstract void mo9014();

    /* JADX INFO: renamed from: ٴﹶ */
    public abstract boolean mo9017();

    /* JADX INFO: renamed from: ᵔʾ */
    public abstract AbstractC4567 mo9020(long r1);

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract void mo9021();

    /* JADX INFO: renamed from: ᵔﹳ */
    public abstract void mo9022(boolean r1);

    /* JADX INFO: renamed from: ﾞʻ */
    public abstract boolean mo9025(long r1);

    /* JADX INFO: renamed from: ﾞᴵ */
    public AbstractC4567 mo9026() {
        AbstractC4567 r0 = (AbstractC4567) super.clone();     // Catch: CloneNotSupportedException -> L9
        if (this.f16499 == null) goto L6;
        r0.f16499 = new ArrayList(this.f16499);     // Catch: CloneNotSupportedException -> L9
    L6:
        if (this.f16500 == null) goto L8;
        r0.f16500 = new ArrayList(this.f16500);     // Catch: CloneNotSupportedException -> L9
    L8:
        return r0;
    L10:
        throw new AssertionError();
    }
}
