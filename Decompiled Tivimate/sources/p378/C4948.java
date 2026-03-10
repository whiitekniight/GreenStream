package p378;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p092.InterfaceC2186;
import p092.InterfaceC2193;
import p099.AbstractC2229;
import p099.AbstractC2234;
import p269.InterfaceC3879;

/* JADX INFO: renamed from: ᵔﹶ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C4948 implements InterfaceC2193, InterfaceC2186 {

    /* JADX INFO: renamed from: ʽʽ */
    public final Object f17658;

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f17659;

    /* JADX INFO: renamed from: ᴵˊ */
    public final Object f17660;

    public C4948(Resources r2, InterfaceC2193 r3) {
        this.f17659 = 1;
        AbstractC2234.m5422(r2, "Argument must not be null");
        this.f17660 = r2;
        AbstractC2234.m5422(r3, "Argument must not be null");
        this.f17658 = r3;
    }

    public C4948(Bitmap r2, InterfaceC3879 r3) {
        this.f17659 = 0;
        AbstractC2234.m5422(r2, "Bitmap must not be null");
        this.f17660 = r2;
        AbstractC2234.m5422(r3, "BitmapPool must not be null");
        this.f17658 = r3;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static C4948 m9739(Bitmap r1, InterfaceC3879 r2) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return new C4948(r1, r2);
    }

    @Override // p092.InterfaceC2193
    public final Object get() {
        switch(this.f17659) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new BitmapDrawable((Resources) this.f17660, (Bitmap) ((InterfaceC2193) this.f17658).get());
    L7:
        return (Bitmap) this.f17660;
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ʽ */
    public final Class mo5114() {
        switch(this.f17659) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return BitmapDrawable.class;
    L6:
        return Bitmap.class;
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ˈ */
    public final void mo5115() {
        switch(this.f17659) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((InterfaceC2193) this.f17658).mo5115();
        return;
    L6:
        ((InterfaceC3879) this.f17658).mo7995((Bitmap) this.f17660);
    }

    @Override // p092.InterfaceC2193
    /* JADX INFO: renamed from: ⁱˊ */
    public final int mo5116() {
        switch(this.f17659) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((InterfaceC2193) this.f17658).mo5116();
    L7:
        return AbstractC2229.m5409((Bitmap) this.f17660);
    }

    @Override // p092.InterfaceC2186
    /* JADX INFO: renamed from: ﹳٴ */
    public final void mo5352() {
        switch(this.f17659) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        InterfaceC2193 r0 = (InterfaceC2193) this.f17658;
        if ((r0 instanceof InterfaceC2186) == false) goto L10;
        ((InterfaceC2186) r0).mo5352();
        return;
    L10:
        return;
    L8:
        ((Bitmap) this.f17660).prepareToDraw();
    }
}
