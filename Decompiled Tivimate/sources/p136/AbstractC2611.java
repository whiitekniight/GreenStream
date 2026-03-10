package p136;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import p198.AbstractC3306;
import p198.C3316;
import p198.C3318;
import p403.C5124;
import ٴﾞ.ˆʾ;

/* JADX INFO: renamed from: ˈˏ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2611 {

    /* JADX INFO: renamed from: ʽʽ */
    public int f9254;

    /* JADX INFO: renamed from: ʾˋ */
    public int f9255;

    /* JADX INFO: renamed from: ˈٴ */
    public Object f9256;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f9257;

    public AbstractC2611() {
        if (ˆʾ.ʽʽ != null) goto L6;
        ˆʾ.ʽʽ = new ˆʾ(13);
        return;
    }

    public boolean hasNext() {
        if (this.f9255 >= ((C5124) this.f9256).f18278) goto L6;
        return true;
    L6:
        return false;
    }

    public void remove() {
        C5124 r0 = (C5124) this.f9256;
        m5802();
        if (this.f9257 == (-1)) goto L7;
        r0.m9922();
        r0.m9921(this.f9257);
        this.f9257 = -1;
        this.f9254 = r0.f18277;
        return;
    L7:
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }

    /* JADX INFO: renamed from: ʽ */
    public abstract Object mo5798(View r1);

    /* JADX INFO: renamed from: ˈ */
    public abstract void mo5799(View r1, Object r2);

    /* JADX INFO: renamed from: ˑﹳ */
    public void m5800() {
    L2:
        int r0 = this.f9255;
        C5124 r1 = (C5124) this.f9256;
        if (r0 >= r1.f18278) goto L7;
        if (r1.f18273[r0] >= 0) goto L10;
        this.f9255 = r0 + 1;
        goto L2
    L10:
        return;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public abstract boolean mo5801(Object r1, Object r2);

    /* JADX INFO: renamed from: ⁱˊ */
    public void m5802() {
        if (((C5124) this.f9256).f18277 != this.f9254) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public int m5803(int r3) {
        if (r3 < this.f9254) goto L5;
        return 0;
    L5:
        return ((ByteBuffer) this.f9256).getShort(this.f9257 + r3);
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public void m5804(View r3, Object r4) {
        if (Build.VERSION.SDK_INT < this.f9257) goto L7;
        mo5799(r3, r4);
        return;
    L7:
        if (Build.VERSION.SDK_INT < this.f9257) goto L9;
        Object r0 = mo5798(r3);
    L14:
        if (mo5801(r0, r4) == false) goto L26;
        View.AccessibilityDelegate r02 = AbstractC3306.m6983(r3);
        if (r02 != null) goto L19;
        C3316 r03 = null;
    L22:
        if (r03 != null) goto L24;
        r03 = new C3316();
    L24:
        AbstractC3306.m6984(r3, r03);
        r3.setTag(this.f9255, r4);
        AbstractC3306.m6990(r3, this.f9254);
        return;
    L19:
        if ((r02 instanceof C3318) == false) goto L21;
        r03 = ((C3318) r02).f11578;
        goto L22
    L21:
        r03 = new C3316(r02);
        goto L22
    L26:
        return;
    L9:
        r0 = r3.getTag(this.f9255);
        if (((Class) this.f9256).isInstance(r0) == true) goto L14;
        r0 = null;
        goto L14
    }
}
