package p365;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p354.InterfaceMenuItemC4749;
import ˊⁱ.ˑﹳ;
import ᴵˋ.ˊʻ;

/* JADX INFO: renamed from: ᵔʾ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C4812 implements InterfaceMenuItemC4749 {

    /* JADX INFO: renamed from: ʻٴ */
    public boolean f17009;

    /* JADX INFO: renamed from: ʼʼ */
    public int f17010;

    /* JADX INFO: renamed from: ʼˎ */
    public int f17011;

    /* JADX INFO: renamed from: ʼᐧ */
    public MenuItem.OnMenuItemClickListener f17012;

    /* JADX INFO: renamed from: ʽ */
    public final int f17013;

    /* JADX INFO: renamed from: ʽʽ */
    public boolean f17014;

    /* JADX INFO: renamed from: ʽﹳ */
    public boolean f17015;

    /* JADX INFO: renamed from: ʾˋ */
    public ActionProviderVisibilityListenerC4797 f17016;

    /* JADX INFO: renamed from: ʾᵎ */
    public int f17017;

    /* JADX INFO: renamed from: ˆʾ */
    public char f17018;

    /* JADX INFO: renamed from: ˈ */
    public final int f17019;

    /* JADX INFO: renamed from: ˉʿ */
    public int f17020;

    /* JADX INFO: renamed from: ˉˆ */
    public SubMenuC4793 f17021;

    /* JADX INFO: renamed from: ˏי */
    public PorterDuff.Mode f17022;

    /* JADX INFO: renamed from: ˑﹳ */
    public CharSequence f17023;

    /* JADX INFO: renamed from: יـ */
    public ColorStateList f17024;

    /* JADX INFO: renamed from: ـˆ */
    public boolean f17025;

    /* JADX INFO: renamed from: ٴﹶ */
    public int f17026;

    /* JADX INFO: renamed from: ᴵˊ */
    public MenuItem.OnActionExpandListener f17027;

    /* JADX INFO: renamed from: ᵎﹶ */
    public Intent f17028;

    /* JADX INFO: renamed from: ᵔʾ */
    public final MenuC4795 f17029;

    /* JADX INFO: renamed from: ᵔᵢ */
    public char f17030;

    /* JADX INFO: renamed from: ᵔﹳ */
    public CharSequence f17031;

    /* JADX INFO: renamed from: ᵢˏ */
    public View f17032;

    /* JADX INFO: renamed from: ⁱˊ */
    public final int f17033;

    /* JADX INFO: renamed from: ﹳٴ */
    public final int f17034;

    /* JADX INFO: renamed from: ﹳᐧ */
    public CharSequence f17035;

    /* JADX INFO: renamed from: ﾞʻ */
    public Drawable f17036;

    /* JADX INFO: renamed from: ﾞᴵ */
    public CharSequence f17037;

    public C4812(MenuC4795 r3, int r4, int r5, int r6, int r7, CharSequence r8, int r9) {
        this.f17011 = 4096;
        this.f17026 = 4096;
        this.f17020 = 0;
        this.f17024 = null;
        this.f17022 = null;
        this.f17015 = false;
        this.f17009 = false;
        this.f17025 = false;
        this.f17017 = 16;
        this.f17014 = false;
        this.f17029 = r3;
        this.f17034 = r5;
        this.f17033 = r4;
        this.f17013 = r6;
        this.f17019 = r7;
        this.f17023 = r8;
        this.f17010 = r9;
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m9470(int r0, int r1, String r2, StringBuilder r3) {
        if ((r0 & r1) != r1) goto L6;
        r3.append(r2);
        return;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f17010 & 8) != 0) goto L6;
        return false;
    L6:
        if (this.f17032 != null) goto L9;
        return true;
    L9:
        MenuItem.OnActionExpandListener r0 = this.f17027;
        if (r0 == null) goto L16;
        if (r0.onMenuItemActionCollapse(this) == true) goto L16;
        return false;
    L16:
        return this.f17029.mo9428(this);
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (m9472() == false) goto L14;
        MenuItem.OnActionExpandListener r0 = this.f17027;
        if (r0 == null) goto L13;
        if (r0.onMenuItemActionExpand(this) == true) goto L13;
        return false;
    L13:
        return this.f17029.mo9434(this);
    L14:
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View r0 = this.f17032;
        if (r0 == null) goto L5;
        return r0;
    L5:
        ActionProviderVisibilityListenerC4797 r02 = this.f17016;
        if (r02 == null) goto L9;
        View r03 = r02.f16942.onCreateActionView(this);
        this.f17032 = r03;
        return r03;
    L9:
        return null;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f17026;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f17018;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f17031;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f17033;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable r0 = this.f17036;
        if (r0 != null) goto L5;
        int r02 = this.f17020;
        if (r02 == 0) goto L10;
        Drawable r03 = ˊʻ.ﹳᐧ(this.f17029.f16912, r02);
        this.f17020 = 0;
        this.f17036 = r03;
        return m9471(r03);
    L10:
        return null;
    L5:
        return m9471(r0);
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f17024;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f17022;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f17028;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f17034;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f17011;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f17030;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f17013;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f17021;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f17023;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence r0 = this.f17037;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return this.f17023;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f17035;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f17021 == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f17014;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f17017 & 1) != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f17017 & 2) != 2) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f17017 & 16) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC4797 r0 = this.f17016;
        if (r0 == null) goto L13;
        if (r0.f16942.overridesItemVisibility() == false) goto L13;
        if ((this.f17017 & 8) == 0) goto L9;
    L11:
        return false;
    L9:
        if (this.f17016.f16942.isVisible() == false) goto L11;
        return true;
    L13:
        if ((this.f17017 & 8) != 0) goto L15;
        return true;
    L15:
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider r2) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r5) {
        MenuC4795 r0 = this.f17029;
        Context r1 = r0.f16912;
        View r52 = LayoutInflater.from(r1).inflate(r5, new LinearLayout(r1), false);
        this.f17032 = r52;
        this.f17016 = null;
        if (r52 != null) goto L5;
    L9:
        r0.f16906 = true;
        r0.m9437(true);
        return this;
    L5:
        if (r52.getId() != (-1)) goto L9;
        int r12 = this.f17034;
        if (r12 <= 0) goto L9;
        r52.setId(r12);
        goto L9
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View r3) {
        this.f17032 = r3;
        this.f17016 = null;
        if (r3 != null) goto L5;
    L9:
        MenuC4795 r32 = this.f17029;
        r32.f16906 = true;
        r32.m9437(true);
        return this;
    L5:
        if (r3.getId() != (-1)) goto L9;
        int r0 = this.f17034;
        if (r0 <= 0) goto L9;
        r3.setId(r0);
        goto L9
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2) {
        if (this.f17018 != r2) goto L5;
        return this;
    L5:
        this.f17018 = Character.toLowerCase(r2);
        this.f17029.m9437(false);
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char r2, int r3) {
        if (this.f17018 == r2) goto L5;
    L7:
        this.f17018 = Character.toLowerCase(r2);
        this.f17026 = KeyEvent.normalizeMetaState(r3);
        this.f17029.m9437(false);
        return this;
    L5:
        if (this.f17026 != r3) goto L7;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean r3) {
        int r0 = this.f17017;
        int r32 = r3 ? 1 : 0;
        int r33 = r32 | (r0 & (-2));
        this.f17017 = r33;
        if (r0 == r33) goto L5;
        this.f17029.m9437(false);
    L5:
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean r10) {
        int r0 = this.f17017;
        int r1 = r0 & 4;
        int r2 = 2;
        MenuC4795 r3 = this.f17029;
        if (r1 == 0) goto L26;
        ArrayList r102 = r3.f16915;
        int r02 = r102.size();
        r3.m9442();
        int r12 = 0;
    L5:
        if (r12 >= r02) goto L24;
        C4812 r5 = (C4812) r102.get(r12);
        if (r5.f17033 != this.f17033) goto L23;
        if ((r5.f17017 & 4) == 0) goto L23;
        if (r5.isCheckable() == false) goto L23;
        if (r5 != this) goto L15;
        boolean r6 = true;
    L16:
        int r7 = r5.f17017;
        int r8 = r7 & (-3);
        if (r6 == false) goto L19;
        int r62 = 2;
    L20:
        int r63 = r62 | r8;
        r5.f17017 = r63;
        if (r7 == r63) goto L23;
        r5.f17029.m9437(false);
        goto L23
    L19:
        r62 = 0;
        goto L20
    L15:
        r6 = false;
    L23:
        r12 = r12 + 1;
        goto L5
    L24:
        r3.m9435();
        return this;
    L26:
        int r13 = r0 & (-3);
        if (r10 == true) goto L30;
        r2 = 0;
    L30:
        int r103 = r13 | r2;
        this.f17017 = r103;
        if (r0 == r103) goto L33;
        r3.m9437(false);
    L33:
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence r1) {
        setContentDescription(r1);
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final InterfaceMenuItemC4749 setContentDescription(CharSequence r2) {
        this.f17031 = r2;
        this.f17029.m9437(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean r2) {
        if (r2 == false) goto L4;
        this.f17017 |= 16;
    L5:
        this.f17029.m9437(false);
        return this;
    L4:
        this.f17017 &= -17;
        goto L5
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r2) {
        this.f17036 = null;
        this.f17020 = r2;
        this.f17025 = true;
        this.f17029.m9437(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable r2) {
        this.f17020 = 0;
        this.f17036 = r2;
        this.f17025 = true;
        this.f17029.m9437(false);
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList r2) {
        this.f17024 = r2;
        this.f17015 = true;
        this.f17025 = true;
        this.f17029.m9437(false);
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode r2) {
        this.f17022 = r2;
        this.f17009 = true;
        this.f17025 = true;
        this.f17029.m9437(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent r1) {
        this.f17028 = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2) {
        if (this.f17030 != r2) goto L5;
        return this;
    L5:
        this.f17030 = r2;
        this.f17029.m9437(false);
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setNumericShortcut(char r2, int r3) {
        if (this.f17030 == r2) goto L5;
    L7:
        this.f17030 = r2;
        this.f17011 = KeyEvent.normalizeMetaState(r3);
        this.f17029.m9437(false);
        return this;
    L5:
        if (this.f17011 != r3) goto L7;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener r1) {
        this.f17027 = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener r1) {
        this.f17012 = r1;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2) {
        this.f17030 = r1;
        this.f17018 = Character.toLowerCase(r2);
        this.f17029.m9437(false);
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final MenuItem setShortcut(char r1, char r2, int r3, int r4) {
        this.f17030 = r1;
        this.f17011 = KeyEvent.normalizeMetaState(r3);
        this.f17018 = Character.toLowerCase(r2);
        this.f17026 = KeyEvent.normalizeMetaState(r4);
        this.f17029.m9437(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r4) {
        int r0 = r4 & 3;
        if (r0 == 0) goto L10;
        if (r0 == 1) goto L10;
        if (r0 == 2) goto L10;
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    L10:
        this.f17010 = r4;
        MenuC4795 r42 = this.f17029;
        r42.f16906 = true;
        r42.m9437(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r1) {
        setShowAsAction(r1);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r2) {
        setTitle(this.f17029.f16912.getString(r2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence r3) {
        this.f17023 = r3;
        this.f17029.m9437(false);
        SubMenuC4793 r0 = this.f17021;
        if (r0 == null) goto L5;
        r0.setHeaderTitle(r3);
    L5:
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence r2) {
        this.f17037 = r2;
        this.f17029.m9437(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence r1) {
        setTooltipText(r1);
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749, android.view.MenuItem
    public final InterfaceMenuItemC4749 setTooltipText(CharSequence r2) {
        this.f17035 = r2;
        this.f17029.m9437(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean r3) {
        int r0 = this.f17017;
        int r1 = r0 & (-9);
        if (r3 == false) goto L5;
        int r32 = 0;
    L6:
        int r33 = r32 | r1;
        this.f17017 = r33;
        if (r0 == r33) goto L9;
        MenuC4795 r34 = this.f17029;
        r34.f16909 = true;
        r34.m9437(true);
    L9:
        return this;
    L5:
        r32 = 8;
        goto L6
    }

    public final String toString() {
        CharSequence r0 = this.f17023;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.toString();
    }

    /* JADX INFO: renamed from: ˈ */
    public final Drawable m9471(Drawable r2) {
        if (r2 != null) goto L4;
    L16:
        return r2;
    L4:
        if (this.f17025 == false) goto L16;
        if (this.f17015 == false) goto L8;
    L9:
        r2 = r2.mutate();
        if (this.f17015 == false) goto L13;
        r2.setTintList(this.f17024);
    L13:
        if (this.f17009 == false) goto L15;
        r2.setTintMode(this.f17022);
    L15:
        this.f17025 = false;
        goto L16
    L8:
        if (this.f17009 == false) goto L16;
        goto L9
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final boolean m9472() {
        if ((this.f17010 & 8) != 0) goto L5;
    L13:
        return false;
    L5:
        if (this.f17032 != null) goto L10;
        ActionProviderVisibilityListenerC4797 r0 = this.f17016;
        if (r0 == null) goto L10;
        this.f17032 = r0.f16942.onCreateActionView(this);
    L10:
        if (this.f17032 == null) goto L13;
        return true;
    }

    @Override // p354.InterfaceMenuItemC4749
    /* JADX INFO: renamed from: ⁱˊ */
    public final InterfaceMenuItemC4749 mo9363(ActionProviderVisibilityListenerC4797 r3) {
        this.f17032 = null;
        this.f17016 = r3;
        this.f17029.m9437(true);
        ActionProviderVisibilityListenerC4797 r32 = this.f17016;
        if (r32 == null) goto L5;
        r32.f16943 = new ˑﹳ(24, this);
        r32.f16942.setVisibilityListener(r32);
    L5:
        return this;
    }

    @Override // p354.InterfaceMenuItemC4749
    /* JADX INFO: renamed from: ﹳٴ */
    public final ActionProviderVisibilityListenerC4797 mo9364() {
        return this.f17016;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public final void m9473(boolean r1) {
        if (r1 == false) goto L5;
        this.f17017 |= 32;
        return;
    L5:
        this.f17017 &= -33;
    }
}
