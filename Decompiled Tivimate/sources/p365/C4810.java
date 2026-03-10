package p365;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p354.InterfaceMenuItemC4749;

/* JADX INFO: renamed from: ᵔʾ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C4810 implements InterfaceMenuItemC4749 {

    /* JADX INFO: renamed from: ʼˎ */
    public Context f16992;

    /* JADX INFO: renamed from: ʼᐧ */
    public int f16993;

    /* JADX INFO: renamed from: ʽ */
    public Intent f16994;

    /* JADX INFO: renamed from: ˆʾ */
    public CharSequence f16995;

    /* JADX INFO: renamed from: ˈ */
    public char f16996;

    /* JADX INFO: renamed from: ˉʿ */
    public PorterDuff.Mode f16997;

    /* JADX INFO: renamed from: ˉˆ */
    public boolean f16998;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f16999;

    /* JADX INFO: renamed from: ٴﹶ */
    public CharSequence f17000;

    /* JADX INFO: renamed from: ᵎﹶ */
    public int f17001;

    /* JADX INFO: renamed from: ᵔʾ */
    public boolean f17002;

    /* JADX INFO: renamed from: ᵔᵢ */
    public Drawable f17003;

    /* JADX INFO: renamed from: ⁱˊ */
    public CharSequence f17004;

    /* JADX INFO: renamed from: ﹳٴ */
    public CharSequence f17005;

    /* JADX INFO: renamed from: ﾞʻ */
    public ColorStateList f17006;

    /* JADX INFO: renamed from: ﾞᴵ */
    public char f17007;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f17001;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f17007;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f16995;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f17003;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f17006;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f16997;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f16994;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f16999;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f16996;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f17005;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence r0 = this.f17004;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return this.f17005;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f17000;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f16993 & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f16993 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f16993 & 16) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f16993 & 8) != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r1) {
        this.f17007 = Character.toLowerCase(r1);
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r1, int r2) {
        this.f17007 = Character.toLowerCase(r1);
        this.f17001 = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r2) {
        int r0 = this.f16993 & (-2);
        this.f16993 = (r2 ? 1 : 0) | r0;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r2) {
        int r0 = this.f16993 & (-3);
        if (r2 == false) goto L5;
        int r22 = 2;
    L6:
        this.f16993 = r22 | r0;
        return this;
    L5:
        r22 = 0;
        goto L6
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence r1) {
        this.f16995 = r1;
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final InterfaceMenuItemC4749 setContentDescription(CharSequence r1) {
        this.f16995 = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        int r0 = this.f16993 & (-17);
        if (r2 == false) goto L5;
        int r22 = 16;
    L6:
        this.f16993 = r22 | r0;
        return this;
    L5:
        r22 = 0;
        goto L6
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.f17003 = this.f16992.getDrawable(r2);
        m9468();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r1) {
        this.f17003 = r1;
        m9468();
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r1) {
        this.f17006 = r1;
        this.f17002 = true;
        m9468();
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r1) {
        this.f16997 = r1;
        this.f16998 = true;
        m9468();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r1) {
        this.f16994 = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r1) {
        this.f16996 = r1;
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setNumericShortcut(char r1, int r2) {
        this.f16996 = r1;
        this.f16999 = KeyEvent.normalizeMetaState(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r1) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r1) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2) {
        this.f16996 = r1;
        this.f17007 = Character.toLowerCase(r2);
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2, int r3, int r4) {
        this.f16996 = r1;
        this.f16999 = KeyEvent.normalizeMetaState(r3);
        this.f17007 = Character.toLowerCase(r2);
        this.f17001 = KeyEvent.normalizeMetaState(r4);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r1) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r1) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        this.f17005 = this.f16992.getResources().getString(r2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r1) {
        this.f17005 = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r1) {
        this.f17004 = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence r1) {
        this.f17000 = r1;
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final InterfaceMenuItemC4749 setTooltipText(CharSequence r1) {
        this.f17000 = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r3) {
        int r1 = 8;
        int r0 = this.f16993 & 8;
        if (r3 == false) goto L5;
        r1 = 0;
    L5:
        this.f16993 = r0 | r1;
        return this;
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m9468() {
        Drawable r0 = this.f17003;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f17002 == false) goto L7;
    L8:
        this.f17003 = r0;
        Drawable r02 = r0.mutate();
        this.f17003 = r02;
        if (this.f17002 == false) goto L12;
        r02.setTintList(this.f17006);
    L12:
        if (this.f16998 == false) goto L17;
        this.f17003.setTintMode(this.f16997);
        return;
    L17:
        return;
    L7:
        if (this.f16998 == true) goto L8;
    }

    @Override // p354.InterfaceMenuItemC4749
    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceMenuItemC4749 mo9363(ActionProviderVisibilityListenerC4797 r1) {
        throw new UnsupportedOperationException();
    }

    @Override // p354.InterfaceMenuItemC4749
    /* JADX INFO: renamed from: ﹳٴ */
    public final ActionProviderVisibilityListenerC4797 mo9364() {
        return null;
    }
}
