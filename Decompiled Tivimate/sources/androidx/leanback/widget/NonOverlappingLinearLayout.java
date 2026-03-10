package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NonOverlappingLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: ʽʽ */
    public final ArrayList f674;

    /* JADX INFO: renamed from: ʾˋ */
    public boolean f675;

    /* JADX INFO: renamed from: ᴵˊ */
    public boolean f676;

    public NonOverlappingLinearLayout(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        this.f675 = false;
        this.f674 = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View r4) {
        if (this.f676 == false) goto L16;
        View r0 = r4;
    L6:
        if (r0 == this) goto L12;
        if (r0 == null) goto L12;
        if (r0.getParent() == this) goto L10;
        r0 = (View) r0.getParent();
        goto L6
    L10:
        int r02 = indexOfChild(r0);
    L13:
        if (r02 == (-1)) goto L21;
        ((ArrayList) this.f674.get(r02)).add(r4);
        return;
    L21:
        return;
    L12:
        r02 = -1;
        goto L13
    L16:
        super.focusableViewAvailable(r4);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        ArrayList r1 = this.f674;
        int r2 = 0;
    L44:
        th = th;
        NonOverlappingLinearLayout r3 = this;
    L35:
        Throwable r102 = th;
    L47:
        if (r3.f676 == false) goto L52;
        r3.f676 = false;
    L50:
        if (r2 >= r1.size()) goto L66;
        ((ArrayList) r1.get(r2)).clear();
        r2 = r2 + 1;
        goto L50
    L66:
        throw r102;
    L52:
        throw r102;
    L5:
        if (this.f675 == true) goto L53;
    L13:
        boolean r0 = false;
    L14:
        this.f676 = r0;     // Catch: Throwable -> L44
        if (r0 == true) goto L17;
    L23:
        r3 = this;
        super.onLayout(r10, r11, r12, r13, r14);     // Catch: Throwable -> L34
        if (r3.f676 == false) goto L38;
        int r103 = 0;
    L27:
        if (r103 >= r1.size()) goto L38;
        int r112 = 0;
    L31:
        if (r112 >= ((ArrayList) r1.get(r103)).size()) goto L36;
        super.focusableViewAvailable((View) ((ArrayList) r1.get(r103)).get(r112));     // Catch: Throwable -> L34
        r112 = r112 + 1;
        goto L31
    L36:
        r103 = r103 + 1;
    L38:
        if (r3.f676 == false) goto L43;
        r3.f676 = false;
    L41:
        if (r2 >= r1.size()) goto L65;
        ((ArrayList) r1.get(r2)).clear();
        r2 = r2 + 1;
        goto L41
    L65:
        return;
    L43:
        return;
    L34:
        th = th;
    L17:
        if (r1.size() <= getChildCount()) goto L19;
        r1.remove(r1.size() - 1);     // Catch: Throwable -> L11
    L19:
        if (r1.size() >= getChildCount()) goto L23;
        r1.add(new ArrayList());     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        r102 = th;
        r3 = this;
        goto L47
    L53:
        if (getOrientation() != 0) goto L13;
        if (getLayoutDirection() != 1) goto L13;
        r0 = true;
        goto L14
    }

    public void setFocusableViewAvailableFixEnabled(boolean r1) {
        this.f675 = r1;
    }
}
