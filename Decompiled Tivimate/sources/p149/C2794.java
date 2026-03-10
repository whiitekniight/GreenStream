package p149;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ˉˆ.ᐧﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2794 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: ʾˋ */
    public Drawable f9969;

    /* JADX INFO: renamed from: ᴵˊ */
    public boolean f9970;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r2) {
        if (this.f9970 == false) goto L6;
        m6109(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f9969.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f9969.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f9969.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f9969.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f9969.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f9969.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f9969.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r2) {
        return this.f9969.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f9969.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f9969.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f9969.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f9969.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f9969.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        this.f9969.setBounds(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r2) {
        return this.f9969.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        this.f9969.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        this.f9969.setAutoMirrored(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r2) {
        this.f9969.setChangingConfigurations(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.f9969.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean r2) {
        this.f9969.setDither(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean r2) {
        this.f9969.setFilterBitmap(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float r2, float r3) {
        if (this.f9970 == false) goto L6;
        m6108(r2, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
        if (this.f9970 == false) goto L6;
        m6106(r2, r3, r4, r5);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
        if (this.f9970 == true) goto L5;
        return false;
    L5:
        return this.f9969.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        this.f9969.setTint(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        this.f9969.setTintList(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r2) {
        this.f9969.setTintMode(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        if (this.f9970 == true) goto L5;
        return false;
    L5:
        return m6107(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        unscheduleSelf(r2);
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m6106(int r2, int r3, int r4, int r5) {
        this.f9969.setHotspotBounds(r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: ˈ */
    public final boolean m6107(boolean r2, boolean r3) {
        if (super.setVisible(r2, r3) == false) goto L5;
        return true;
    L5:
        if (this.f9969.setVisible(r2, r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final void m6108(float r2, float r3) {
        this.f9969.setHotspot(r2, r3);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m6109(Canvas r2) {
        this.f9969.draw(r2);
    }
}
