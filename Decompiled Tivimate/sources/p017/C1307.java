package p017;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import com.google.android.gms.internal.play_billing.ʽﹳ;

/* JADX INFO: renamed from: ʻˈ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C1307 extends AbstractC1309 {

    /* JADX INFO: renamed from: ʼˎ */
    public float f4459;

    /* JADX INFO: renamed from: ˆʾ */
    public float f4460;

    /* JADX INFO: renamed from: ˈ */
    public ʽﹳ f4461;

    /* JADX INFO: renamed from: ˉʿ */
    public Paint.Join f4462;

    /* JADX INFO: renamed from: ˑﹳ */
    public float f4463;

    /* JADX INFO: renamed from: ٴﹶ */
    public float f4464;

    /* JADX INFO: renamed from: ᵎﹶ */
    public float f4465;

    /* JADX INFO: renamed from: ᵔʾ */
    public float f4466;

    /* JADX INFO: renamed from: ᵔᵢ */
    public float f4467;

    /* JADX INFO: renamed from: ﾞʻ */
    public Paint.Cap f4468;

    /* JADX INFO: renamed from: ﾞᴵ */
    public ʽﹳ f4469;

    public float getFillAlpha() {
        return this.f4467;
    }

    public int getFillColor() {
        return this.f4469.ᴵˊ;
    }

    public float getStrokeAlpha() {
        return this.f4465;
    }

    public int getStrokeColor() {
        return this.f4461.ᴵˊ;
    }

    public float getStrokeWidth() {
        return this.f4463;
    }

    public float getTrimPathEnd() {
        return this.f4460;
    }

    public float getTrimPathOffset() {
        return this.f4464;
    }

    public float getTrimPathStart() {
        return this.f4459;
    }

    public void setFillAlpha(float r1) {
        this.f4467 = r1;
    }

    public void setFillColor(int r2) {
        this.f4469.ᴵˊ = r2;
    }

    public void setStrokeAlpha(float r1) {
        this.f4465 = r1;
    }

    public void setStrokeColor(int r2) {
        this.f4461.ᴵˊ = r2;
    }

    public void setStrokeWidth(float r1) {
        this.f4463 = r1;
    }

    public void setTrimPathEnd(float r1) {
        this.f4460 = r1;
    }

    public void setTrimPathOffset(float r1) {
        this.f4464 = r1;
    }

    public void setTrimPathStart(float r1) {
        this.f4459 = r1;
    }

    @Override // p017.AbstractC1304
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo3680(int[] r7) {
        ʽﹳ r0 = this.f4469;
        boolean r2 = true;
        if (r0.ᵔﹳ() == false) goto L7;
        ColorStateList r1 = (ColorStateList) r0.ˈٴ;
        int r12 = r1.getColorForState(r7, r1.getDefaultColor());
        if (r12 == r0.ᴵˊ) goto L7;
        r0.ᴵˊ = r12;
        boolean r02 = true;
    L8:
        ʽﹳ r13 = this.f4461;
        if (r13.ᵔﹳ() == false) goto L13;
        ColorStateList r4 = (ColorStateList) r13.ˈٴ;
        int r72 = r4.getColorForState(r7, r4.getDefaultColor());
        if (r72 == r13.ᴵˊ) goto L13;
        r13.ᴵˊ = r72;
    L15:
        return r02 | r2;
    L13:
        r2 = false;
    L7:
        r02 = false;
        goto L8
    }

    @Override // p017.AbstractC1304
    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean mo3681() {
        if (this.f4469.ᵔﹳ() == false) goto L5;
        return true;
    L5:
        if (this.f4461.ᵔﹳ() == true) goto L11;
        return false;
    L11:
        return true;
    }
}
