package p047;

import android.graphics.Rect;
import android.view.View;
import p191.AbstractC3152;
import p191.C3184;
import p287.C3992;
import p287.InterfaceC3986;
import p429.InterfaceC5415;

/* JADX INFO: renamed from: ʼﾞ.ᵎⁱ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1720 {

    /* JADX INFO: renamed from: ʽ */
    public final Object f5754;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object f5755;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f5756;

    public AbstractC1720(int r1, String r2, String r3) {
        this.f5756 = r1;
        this.f5755 = r2;
        this.f5754 = r3;
    }

    public AbstractC1720(AbstractC3152 r2) {
        this.f5756 = Integer.MIN_VALUE;
        this.f5754 = new Rect();
        this.f5755 = r2;
    }

    public AbstractC1720(InterfaceC3986 r2) {
        this.f5756 = 0;
        this.f5754 = new C3992();
        this.f5755 = r2;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static AbstractC1720 m4528(AbstractC3152 r1, int r2) {
        if (r2 == 0) goto L10;
        if (r2 != 1) goto L8;
        return new C3184(r1, 1);
    L8:
        throw new IllegalArgumentException("invalid orientation");
    L10:
        return new C3184(r1, 0);
    }

    /* JADX INFO: renamed from: ʻٴ */
    public abstract C1701 mo4436(InterfaceC5415 r1);

    /* JADX INFO: renamed from: ʼˎ */
    public abstract int mo4529();

    /* JADX INFO: renamed from: ʼᐧ */
    public abstract int mo4530(View r1);

    /* JADX INFO: renamed from: ʽ */
    public abstract void mo4437(InterfaceC5415 r1);

    /* JADX INFO: renamed from: ʽﹳ */
    public abstract void mo4438(InterfaceC5415 r1);

    /* JADX INFO: renamed from: ˆʾ */
    public abstract int mo4531();

    /* JADX INFO: renamed from: ˈ */
    public abstract int mo4532(View r1);

    /* JADX INFO: renamed from: ˉʿ */
    public abstract int mo4533();

    /* JADX INFO: renamed from: ˉˆ */
    public abstract int mo4534(View r1);

    /* JADX INFO: renamed from: ˏי */
    public abstract void mo4439(InterfaceC5415 r1);

    /* JADX INFO: renamed from: ˑﹳ */
    public abstract int mo4535(View r1);

    /* JADX INFO: renamed from: יـ */
    public abstract void mo4440(InterfaceC5415 r1);

    /* JADX INFO: renamed from: ٴﹶ */
    public abstract int mo4536();

    /* JADX INFO: renamed from: ᵎﹶ */
    public abstract int mo4537(View r1);

    /* JADX INFO: renamed from: ᵔʾ */
    public abstract int mo4538();

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract int mo4539();

    /* JADX INFO: renamed from: ᵔﹳ */
    public abstract void mo4540(int r1);

    /* JADX INFO: renamed from: ﹳٴ */
    public abstract void mo4441(InterfaceC5415 r1);

    /* JADX INFO: renamed from: ﹳᐧ */
    public abstract void mo4442();

    /* JADX INFO: renamed from: ﾞʻ */
    public abstract int mo4541();

    /* JADX INFO: renamed from: ﾞᴵ */
    public abstract int mo4542(View r1);
}
