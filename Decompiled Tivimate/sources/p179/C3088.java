package p179;

import android.view.View;
import com.google.android.gms.internal.play_billing.י;
import p200.InterfaceC3326;

/* JADX INFO: renamed from: ˊᵔ.ˈ */
/* JADX INFO: loaded from: classes.dex */
public final class C3088 extends י {

    /* JADX INFO: renamed from: ᵔٴ */
    public final /* synthetic */ int f10807;

    public /* synthetic */ C3088(int r1) {
        this.f10807 = r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ʽʽ */
    public final void m6565(InterfaceC3326 r2, float r3) {
        switch(this.f10807) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        ((View) r2).setRotationY(r3);
        return;
    L6:
        ((View) r2).setRotationX(r3);
        return;
    L8:
        ((View) r2).setRotation(r3);
        return;
    L10:
        ((View) r2).setScaleY(r3);
        return;
    L12:
        ((View) r2).setScaleX(r3);
        return;
    L14:
        ((View) r2).setAlpha(r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ʽﹳ */
    public final float m6566(InterfaceC3326 r2) {
        switch(this.f10807) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            default: goto L5;
        };
    L5:
        return ((View) r2).getRotationY();
    L7:
        return ((View) r2).getRotationX();
    L9:
        return ((View) r2).getRotation();
    L11:
        return ((View) r2).getScaleY();
    L13:
        return ((View) r2).getScaleX();
    L15:
        return ((View) r2).getAlpha();
    }
}
