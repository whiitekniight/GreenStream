package p150;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import p092.InterfaceC2193;
import p099.AbstractC2229;

/* JADX INFO: renamed from: ˉˈ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C2837 implements InterfaceC2193 {

    /* JADX INFO: renamed from: ʾˋ */
    public final AnimatedImageDrawable f10049;

    public C2837(AnimatedImageDrawable r1) {
        this.f10049 = r1;
    }

    @Override // p092.InterfaceC2193
    public final Object get() {
        return this.f10049;
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ʽ */
    public final Class mo5114() {
        return Drawable.class;
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ˈ */
    public final void mo5115() {
        this.f10049.stop();
        this.f10049.clearAnimationCallbacks();
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ⁱˊ */
    public final int mo5116() {
        int r0 = this.f10049.getIntrinsicWidth();
        int r1 = this.f10049.getIntrinsicHeight() * r0;
        return (AbstractC2229.m5410(Bitmap.Config.ARGB_8888) * r1) * 2;
    }
}
